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

package org.jetbrains.kotlin.idea.imports;

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
@TestMetadata("idea/testData/editor/optimizeImports")
@TestDataPath("$PROJECT_ROOT")
@InnerTestClasses({
        OptimizeImportsTestGenerated.AllUnderImports.class,
})
@RunWith(JUnit3RunnerWithInners.class)
public class OptimizeImportsTestGenerated extends AbstractOptimizeImportsTest {
    public void testAllFilesPresentInOptimizeImports() throws Exception {
        JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/editor/optimizeImports"), Pattern.compile("^([^\\.]+)\\.kt$"), true);
    }

    @TestMetadata("AlreadyOptimized.kt")
    public void testAlreadyOptimized() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/editor/optimizeImports/AlreadyOptimized.kt");
        doTest(fileName);
    }

    @TestMetadata("ArrayAccessExpression.kt")
    public void testArrayAccessExpression() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/editor/optimizeImports/ArrayAccessExpression.kt");
        doTest(fileName);
    }

    @TestMetadata("ClassMemberImported.kt")
    public void testClassMemberImported() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/editor/optimizeImports/ClassMemberImported.kt");
        doTest(fileName);
    }

    @TestMetadata("ComponentFunction.kt")
    public void testComponentFunction() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/editor/optimizeImports/ComponentFunction.kt");
        doTest(fileName);
    }

    @TestMetadata("CurrentPackage.kt")
    public void testCurrentPackage() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/editor/optimizeImports/CurrentPackage.kt");
        doTest(fileName);
    }

    @TestMetadata("DefaultJsImports.kt")
    public void testDefaultJsImports() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/editor/optimizeImports/DefaultJsImports.kt");
        doTest(fileName);
    }

    @TestMetadata("DuplicatedImports.kt")
    public void testDuplicatedImports() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/editor/optimizeImports/DuplicatedImports.kt");
        doTest(fileName);
    }

    @TestMetadata("Enums.kt")
    public void testEnums() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/editor/optimizeImports/Enums.kt");
        doTest(fileName);
    }

    @TestMetadata("InvokeFunction.kt")
    public void testInvokeFunction() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/editor/optimizeImports/InvokeFunction.kt");
        doTest(fileName);
    }

    @TestMetadata("IteratorFunction.kt")
    public void testIteratorFunction() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/editor/optimizeImports/IteratorFunction.kt");
        doTest(fileName);
    }

    @TestMetadata("JavaStaticField.kt")
    public void testJavaStaticField() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/editor/optimizeImports/JavaStaticField.kt");
        doTest(fileName);
    }

    @TestMetadata("KotlinPackage.kt")
    public void testKotlinPackage() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/editor/optimizeImports/KotlinPackage.kt");
        doTest(fileName);
    }

    @TestMetadata("Kt1850FullQualified.kt")
    public void testKt1850FullQualified() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/editor/optimizeImports/Kt1850FullQualified.kt");
        doTest(fileName);
    }

    @TestMetadata("Kt1850InnerClass.kt")
    public void testKt1850InnerClass() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/editor/optimizeImports/Kt1850InnerClass.kt");
        doTest(fileName);
    }

    @TestMetadata("Kt2488EnumEntry.kt")
    public void testKt2488EnumEntry() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/editor/optimizeImports/Kt2488EnumEntry.kt");
        doTest(fileName);
    }

    @TestMetadata("Kt2709.kt")
    public void testKt2709() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/editor/optimizeImports/Kt2709.kt");
        doTest(fileName);
    }

    @TestMetadata("MembersInScope.kt")
    public void testMembersInScope() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/editor/optimizeImports/MembersInScope.kt");
        doTest(fileName);
    }

    @TestMetadata("NestedClassInObject.kt")
    public void testNestedClassInObject() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/editor/optimizeImports/NestedClassInObject.kt");
        doTest(fileName);
    }

    @TestMetadata("NestedClassReferenceOutsideClassBody.kt")
    public void testNestedClassReferenceOutsideClassBody() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/editor/optimizeImports/NestedClassReferenceOutsideClassBody.kt");
        doTest(fileName);
    }

    @TestMetadata("PartiallyQualified.kt")
    public void testPartiallyQualified() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/editor/optimizeImports/PartiallyQualified.kt");
        doTest(fileName);
    }

    @TestMetadata("RemoveImportsIfGeneral.kt")
    public void testRemoveImportsIfGeneral() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/editor/optimizeImports/RemoveImportsIfGeneral.kt");
        doTest(fileName);
    }

    @TestMetadata("RemoveImportsIfGeneralBefore.kt")
    public void testRemoveImportsIfGeneralBefore() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/editor/optimizeImports/RemoveImportsIfGeneralBefore.kt");
        doTest(fileName);
    }

    @TestMetadata("SamConstructor.kt")
    public void testSamConstructor() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/editor/optimizeImports/SamConstructor.kt");
        doTest(fileName);
    }

    @TestMetadata("UnusedImports.kt")
    public void testUnusedImports() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/editor/optimizeImports/UnusedImports.kt");
        doTest(fileName);
    }

    @TestMetadata("WithAliases.kt")
    public void testWithAliases() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/editor/optimizeImports/WithAliases.kt");
        doTest(fileName);
    }

    @TestMetadata("idea/testData/editor/optimizeImports/allUnderImports")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class AllUnderImports extends AbstractOptimizeImportsTest {
        public void testAllFilesPresentInAllUnderImports() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/editor/optimizeImports/allUnderImports"), Pattern.compile("^([^\\.]+)\\.kt$"), true);
        }

        @TestMetadata("ClassNameConflict.kt")
        public void testClassNameConflict() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/editor/optimizeImports/allUnderImports/ClassNameConflict.kt");
            doTest(fileName);
        }

        @TestMetadata("ClassNameConflict2.kt")
        public void testClassNameConflict2() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/editor/optimizeImports/allUnderImports/ClassNameConflict2.kt");
            doTest(fileName);
        }

        @TestMetadata("ClassNameConflictWithCurrentPackage.kt")
        public void testClassNameConflictWithCurrentPackage() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/editor/optimizeImports/allUnderImports/ClassNameConflictWithCurrentPackage.kt");
            doTest(fileName);
        }

        @TestMetadata("ClassNameConflictWithCurrentPackage2.kt")
        public void testClassNameConflictWithCurrentPackage2() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/editor/optimizeImports/allUnderImports/ClassNameConflictWithCurrentPackage2.kt");
            doTest(fileName);
        }

        @TestMetadata("ClassNameConflictWithDefault.kt")
        public void testClassNameConflictWithDefault() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/editor/optimizeImports/allUnderImports/ClassNameConflictWithDefault.kt");
            doTest(fileName);
        }

        @TestMetadata("NameCountSetting.kt")
        public void testNameCountSetting() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/editor/optimizeImports/allUnderImports/NameCountSetting.kt");
            doTest(fileName);
        }

        @TestMetadata("Simple.kt")
        public void testSimple() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/editor/optimizeImports/allUnderImports/Simple.kt");
            doTest(fileName);
        }
    }
}
