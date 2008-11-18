package com.intellij.xml.util;

import com.intellij.openapi.paths.PathReference;
import com.intellij.openapi.paths.PathReferenceProvider;
import com.intellij.openapi.paths.DynamicContextProvider;
import com.intellij.openapi.util.TextRange;
import com.intellij.openapi.extensions.Extensions;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiReference;
import com.intellij.psi.ElementManipulators;
import com.intellij.psi.impl.source.resolve.reference.impl.providers.FileReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * @author Dmitry Avdeev
 */
public class AnchorPathReferenceProvider implements PathReferenceProvider {

  public boolean createReferences(@NotNull final PsiElement psiElement, final @NotNull List<PsiReference> references, final boolean soft) {

    final TextRange range = ElementManipulators.getValueTextRange(psiElement);
    final String elementText = psiElement.getText();
    final int anchorOffset = elementText.indexOf('#');
    if (anchorOffset == -1) {
      return false;
    }
    final boolean dynamic = isDynamic(psiElement, anchorOffset + 1, elementText);
    if (dynamic) {
      return false;
    }

    FileReference fileReference = null;
    if (range.getStartOffset() != anchorOffset) {
      fileReference = findFileReference(references);
      if (fileReference == null || fileReference.resolve() == null) {
        return false;
      }
    }
    final int pos = elementText.indexOf('?', anchorOffset);
    final String anchor = elementText.substring(anchorOffset + 1, pos == -1 ? range.getEndOffset() : pos);
    final AnchorReference anchorReference = new AnchorReference(anchor, fileReference, psiElement, anchorOffset + 1, soft);
    references.add(anchorReference);
    return false;
  }

  private static boolean isDynamic(final PsiElement psiElement, final int offset, final String elementText) {
    for (DynamicContextProvider provider: Extensions.getExtensions(DynamicContextProvider.EP_NAME)) {
      final int dynamicOffset = provider.getOffset(psiElement, offset, elementText);
      if (dynamicOffset != offset) {
        return true;
      }
    }
    return false;
  }

  @Nullable
  private static FileReference findFileReference(final List<PsiReference> references) {
    FileReference fileReference = null;
    for (PsiReference reference : references) {
      if (reference instanceof FileReference) {
        fileReference = ((FileReference)reference).getFileReferenceSet().getLastReference();
        break;
      }
    }
    return fileReference;
  }

  public PathReference getPathReference(@NotNull final String path, @NotNull final PsiElement element) {
    return null;
  }
}
