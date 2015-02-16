/*
 * Copyright 2010-2015 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.idea.refactoring.inline;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.InnerTestClasses;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.JetTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("idea/testData/refactoring/inline")
@TestDataPath("$PROJECT_ROOT")
@InnerTestClasses({
        InlineTestGenerated.AddParenthesis.class,
        InlineTestGenerated.ExplicateParameterTypes.class,
        InlineTestGenerated.ExplicateTypeArgument.class,
        InlineTestGenerated.Property.class,
})
@RunWith(JUnit3RunnerWithInners.class)
public class InlineTestGenerated extends AbstractInlineTest {
    public void testAllFilesPresentInInline() throws Exception {
        JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/refactoring/inline"), Pattern.compile("^(.+)\\.kt$"), true);
    }

    @TestMetadata("Basic.kt")
    public void testBasic() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/inline/Basic.kt");
        doTest(fileName);
    }

    @TestMetadata("BasicCaretOnDeclaration.kt")
    public void testBasicCaretOnDeclaration() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/inline/BasicCaretOnDeclaration.kt");
        doTest(fileName);
    }

    @TestMetadata("InFunctionLiteral.kt")
    public void testInFunctionLiteral() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/inline/InFunctionLiteral.kt");
        doTest(fileName);
    }

    @TestMetadata("MethodReference.kt")
    public void testMethodReference() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/inline/MethodReference.kt");
        doTest(fileName);
    }

    @TestMetadata("MultipleInitializers.kt")
    public void testMultipleInitializers() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/inline/MultipleInitializers.kt");
        doTest(fileName);
    }

    @TestMetadata("MultipleUsages.kt")
    public void testMultipleUsages() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/inline/MultipleUsages.kt");
        doTest(fileName);
    }

    @TestMetadata("Parameter.kt")
    public void testParameter() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/inline/Parameter.kt");
        doTest(fileName);
    }

    @TestMetadata("SeparateInitializer.kt")
    public void testSeparateInitializer() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/inline/SeparateInitializer.kt");
        doTest(fileName);
    }

    @TestMetadata("SeparateInitializerInTry.kt")
    public void testSeparateInitializerInTry() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/inline/SeparateInitializerInTry.kt");
        doTest(fileName);
    }

    @TestMetadata("UsedInAssignment.kt")
    public void testUsedInAssignment() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/inline/UsedInAssignment.kt");
        doTest(fileName);
    }

    @TestMetadata("ValWithoutInitializer.kt")
    public void testValWithoutInitializer() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/inline/ValWithoutInitializer.kt");
        doTest(fileName);
    }

    @TestMetadata("Var.kt")
    public void testVar() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/inline/Var.kt");
        doTest(fileName);
    }

    @TestMetadata("idea/testData/refactoring/inline/addParenthesis")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class AddParenthesis extends AbstractInlineTest {
        public void testAllFilesPresentInAddParenthesis() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/refactoring/inline/addParenthesis"), Pattern.compile("^(.+)\\.kt$"), true);
        }

        @TestMetadata("ArrayAccess.kt")
        public void testArrayAccess() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/inline/addParenthesis/ArrayAccess.kt");
            doTest(fileName);
        }

        @TestMetadata("ArrayAccessDontAdd.kt")
        public void testArrayAccessDontAdd() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/inline/addParenthesis/ArrayAccessDontAdd.kt");
            doTest(fileName);
        }

        @TestMetadata("Binary.kt")
        public void testBinary() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/inline/addParenthesis/Binary.kt");
            doTest(fileName);
        }

        @TestMetadata("BinaryDontAdd.kt")
        public void testBinaryDontAdd() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/inline/addParenthesis/BinaryDontAdd.kt");
            doTest(fileName);
        }

        @TestMetadata("Call.kt")
        public void testCall() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/inline/addParenthesis/Call.kt");
            doTest(fileName);
        }

        @TestMetadata("CallDontAdd.kt")
        public void testCallDontAdd() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/inline/addParenthesis/CallDontAdd.kt");
            doTest(fileName);
        }

        @TestMetadata("Colon.kt")
        public void testColon() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/inline/addParenthesis/Colon.kt");
            doTest(fileName);
        }

        @TestMetadata("ColonDontAdd.kt")
        public void testColonDontAdd() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/inline/addParenthesis/ColonDontAdd.kt");
            doTest(fileName);
        }

        @TestMetadata("If.kt")
        public void testIf() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/inline/addParenthesis/If.kt");
            doTest(fileName);
        }

        @TestMetadata("IfIntoArrayAccess.kt")
        public void testIfIntoArrayAccess() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/inline/addParenthesis/IfIntoArrayAccess.kt");
            doTest(fileName);
        }

        @TestMetadata("IfIntoArrayAccessBrackets.kt")
        public void testIfIntoArrayAccessBrackets() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/inline/addParenthesis/IfIntoArrayAccessBrackets.kt");
            doTest(fileName);
        }

        @TestMetadata("IfIntoBinaryLeft.kt")
        public void testIfIntoBinaryLeft() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/inline/addParenthesis/IfIntoBinaryLeft.kt");
            doTest(fileName);
        }

        @TestMetadata("IfIntoBinaryRight.kt")
        public void testIfIntoBinaryRight() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/inline/addParenthesis/IfIntoBinaryRight.kt");
            doTest(fileName);
        }

        @TestMetadata("IfIntoBinaryRightLeft.kt")
        public void testIfIntoBinaryRightLeft() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/inline/addParenthesis/IfIntoBinaryRightLeft.kt");
            doTest(fileName);
        }

        @TestMetadata("IfIntoBinaryRightLeftDontAdd.kt")
        public void testIfIntoBinaryRightLeftDontAdd() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/inline/addParenthesis/IfIntoBinaryRightLeftDontAdd.kt");
            doTest(fileName);
        }

        @TestMetadata("IfIntoPostfix.kt")
        public void testIfIntoPostfix() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/inline/addParenthesis/IfIntoPostfix.kt");
            doTest(fileName);
        }

        @TestMetadata("IfIntoPrefix.kt")
        public void testIfIntoPrefix() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/inline/addParenthesis/IfIntoPrefix.kt");
            doTest(fileName);
        }

        @TestMetadata("IsDontAdd.kt")
        public void testIsDontAdd() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/inline/addParenthesis/IsDontAdd.kt");
            doTest(fileName);
        }

        @TestMetadata("IsIntoCall.kt")
        public void testIsIntoCall() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/inline/addParenthesis/IsIntoCall.kt");
            doTest(fileName);
        }

        @TestMetadata("LeftAssociative.kt")
        public void testLeftAssociative() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/inline/addParenthesis/LeftAssociative.kt");
            doTest(fileName);
        }

        @TestMetadata("LeftAssociativeBoolean.kt")
        public void testLeftAssociativeBoolean() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/inline/addParenthesis/LeftAssociativeBoolean.kt");
            doTest(fileName);
        }

        @TestMetadata("LeftAssociativeDontAdd.kt")
        public void testLeftAssociativeDontAdd() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/inline/addParenthesis/LeftAssociativeDontAdd.kt");
            doTest(fileName);
        }

        @TestMetadata("PostfixIntoPrefix.kt")
        public void testPostfixIntoPrefix() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/inline/addParenthesis/PostfixIntoPrefix.kt");
            doTest(fileName);
        }

        @TestMetadata("PrefixIntoPostfix.kt")
        public void testPrefixIntoPostfix() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/inline/addParenthesis/PrefixIntoPostfix.kt");
            doTest(fileName);
        }

        @TestMetadata("Qualified.kt")
        public void testQualified() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/inline/addParenthesis/Qualified.kt");
            doTest(fileName);
        }

        @TestMetadata("QualifiedDontAdd.kt")
        public void testQualifiedDontAdd() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/inline/addParenthesis/QualifiedDontAdd.kt");
            doTest(fileName);
        }

        @TestMetadata("StringTemplate.kt")
        public void testStringTemplate() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/inline/addParenthesis/StringTemplate.kt");
            doTest(fileName);
        }

        @TestMetadata("StringTemplateAlreadyInBraces.kt")
        public void testStringTemplateAlreadyInBraces() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/inline/addParenthesis/StringTemplateAlreadyInBraces.kt");
            doTest(fileName);
        }

        @TestMetadata("StringTemplateDontAdd.kt")
        public void testStringTemplateDontAdd() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/inline/addParenthesis/StringTemplateDontAdd.kt");
            doTest(fileName);
        }

        @TestMetadata("UnaryIntoBinary.kt")
        public void testUnaryIntoBinary() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/inline/addParenthesis/UnaryIntoBinary.kt");
            doTest(fileName);
        }
    }

    @TestMetadata("idea/testData/refactoring/inline/explicateParameterTypes")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class ExplicateParameterTypes extends AbstractInlineTest {
        public void testAllFilesPresentInExplicateParameterTypes() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/refactoring/inline/explicateParameterTypes"), Pattern.compile("^(.+)\\.kt$"), true);
        }

        @TestMetadata("EnoughDontExplicate.kt")
        public void testEnoughDontExplicate() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/inline/explicateParameterTypes/EnoughDontExplicate.kt");
            doTest(fileName);
        }

        @TestMetadata("ErrorTypes.kt")
        public void testErrorTypes() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/inline/explicateParameterTypes/ErrorTypes.kt");
            doTest(fileName);
        }

        @TestMetadata("It.kt")
        public void testIt() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/inline/explicateParameterTypes/It.kt");
            doTest(fileName);
        }

        @TestMetadata("ItMultiLine.kt")
        public void testItMultiLine() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/inline/explicateParameterTypes/ItMultiLine.kt");
            doTest(fileName);
        }

        @TestMetadata("Parenthesized.kt")
        public void testParenthesized() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/inline/explicateParameterTypes/Parenthesized.kt");
            doTest(fileName);
        }

        @TestMetadata("Simplest.kt")
        public void testSimplest() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/inline/explicateParameterTypes/Simplest.kt");
            doTest(fileName);
        }

        @TestMetadata("TrivialDontExplicate.kt")
        public void testTrivialDontExplicate() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/inline/explicateParameterTypes/TrivialDontExplicate.kt");
            doTest(fileName);
        }
    }

    @TestMetadata("idea/testData/refactoring/inline/explicateTypeArgument")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class ExplicateTypeArgument extends AbstractInlineTest {
        public void testAllFilesPresentInExplicateTypeArgument() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/refactoring/inline/explicateTypeArgument"), Pattern.compile("^(.+)\\.kt$"), true);
        }

        @TestMetadata("DeeperNestedCall.kt")
        public void testDeeperNestedCall() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/inline/explicateTypeArgument/DeeperNestedCall.kt");
            doTest(fileName);
        }

        @TestMetadata("EnoughDontExplicate.kt")
        public void testEnoughDontExplicate() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/inline/explicateTypeArgument/EnoughDontExplicate.kt");
            doTest(fileName);
        }

        @TestMetadata("ExplicateForSome.kt")
        public void testExplicateForSome() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/inline/explicateTypeArgument/ExplicateForSome.kt");
            doTest(fileName);
        }

        @TestMetadata("InStringTemplate.kt")
        public void testInStringTemplate() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/inline/explicateTypeArgument/InStringTemplate.kt");
            doTest(fileName);
        }

        @TestMetadata("NestedCall.kt")
        public void testNestedCall() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/inline/explicateTypeArgument/NestedCall.kt");
            doTest(fileName);
        }

        @TestMetadata("Parenthesized.kt")
        public void testParenthesized() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/inline/explicateTypeArgument/Parenthesized.kt");
            doTest(fileName);
        }

        @TestMetadata("Qualified.kt")
        public void testQualified() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/inline/explicateTypeArgument/Qualified.kt");
            doTest(fileName);
        }

        @TestMetadata("Simplest.kt")
        public void testSimplest() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/inline/explicateTypeArgument/Simplest.kt");
            doTest(fileName);
        }

        @TestMetadata("TrivialDontExplicate.kt")
        public void testTrivialDontExplicate() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/inline/explicateTypeArgument/TrivialDontExplicate.kt");
            doTest(fileName);
        }
    }

    @TestMetadata("idea/testData/refactoring/inline/property")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Property extends AbstractInlineTest {
        public void testAllFilesPresentInProperty() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/refactoring/inline/property"), Pattern.compile("^(.+)\\.kt$"), true);
        }

        @TestMetadata("Basic.kt")
        public void testBasic() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/inline/property/Basic.kt");
            doTest(fileName);
        }

        @TestMetadata("ClassObjectProperty.kt")
        public void testClassObjectProperty() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/inline/property/ClassObjectProperty.kt");
            doTest(fileName);
        }

        @TestMetadata("ExtensionProperty.kt")
        public void testExtensionProperty() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/inline/property/ExtensionProperty.kt");
            doTest(fileName);
        }

        @TestMetadata("InstanceProperty.kt")
        public void testInstanceProperty() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/inline/property/InstanceProperty.kt");
            doTest(fileName);
        }

        @TestMetadata("ObjectProperty.kt")
        public void testObjectProperty() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/inline/property/ObjectProperty.kt");
            doTest(fileName);
        }

        @TestMetadata("QualifiedUsage.kt")
        public void testQualifiedUsage() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/inline/property/QualifiedUsage.kt");
            doTest(fileName);
        }

        @TestMetadata("WithGetter.kt")
        public void testWithGetter() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/inline/property/WithGetter.kt");
            doTest(fileName);
        }

        @TestMetadata("WithInitializerAndGetter.kt")
        public void testWithInitializerAndGetter() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/inline/property/WithInitializerAndGetter.kt");
            doTest(fileName);
        }
    }
}
