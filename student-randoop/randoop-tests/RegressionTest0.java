import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        Course course2 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student1, course2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student not found");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        java.lang.Class<?> wildcardClass3 = studentManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<Course> courseList3 = studentManager0.getCourses(student2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student not found");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        Student student7 = null;
        Course course8 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student7, course8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        java.lang.Class<?> wildcardClass5 = studentManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        Course course4 = null;
        studentManager0.registerCourse(student3, course4);
        Student student6 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        int int2 = studentManager0.getTotalStudents();
        Student student3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student not found");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        Course course4 = null;
        studentManager0.registerCourse(student3, course4);
        Student student6 = null;
        Course course7 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student6, course7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        int int5 = studentManager0.getTotalStudents();
        Student student6 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        Student student7 = null;
        java.util.List<Course> courseList8 = studentManager0.getCourses(student7);
        Student student9 = null;
        Course course10 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student9, course10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(courseList8);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        Student student7 = null;
        java.util.List<Course> courseList8 = studentManager0.getCourses(student7);
        Student student9 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(courseList8);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        Student student7 = null;
        java.util.List<Course> courseList8 = studentManager0.getCourses(student7);
        int int9 = studentManager0.getTotalStudents();
        Student student10 = null;
        Course course11 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student10, course11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(courseList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        java.lang.Class<?> wildcardClass5 = studentManager0.getClass();
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        Student student7 = null;
        Course course8 = null;
        studentManager0.registerCourse(student7, course8);
        Student student10 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(courseList6);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        Course course4 = null;
        studentManager0.registerCourse(student3, course4);
        Student student6 = null;
        java.util.List<Course> courseList7 = studentManager0.getCourses(student6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        Student student10 = null;
        Course course11 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student10, course11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseList7);
        org.junit.Assert.assertNotNull(courseList9);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        Course course4 = null;
        studentManager0.registerCourse(student3, course4);
        int int6 = studentManager0.getTotalStudents();
        Student student7 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        StudentManager studentManager0 = new StudentManager();
        java.lang.Class<?> wildcardClass1 = studentManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        Course course3 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student2, course3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student not found");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        java.lang.Class<?> wildcardClass5 = courseList4.getClass();
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        Student student7 = null;
        Course course8 = null;
        studentManager0.registerCourse(student7, course8);
        Student student10 = null;
        Course course11 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student10, course11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(courseList6);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        int int7 = studentManager0.getTotalStudents();
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        Student student10 = null;
        Course course11 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student10, course11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(courseList9);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        Student student7 = null;
        java.util.List<Course> courseList8 = studentManager0.getCourses(student7);
        int int9 = studentManager0.getTotalStudents();
        Student student10 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(courseList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        Course course4 = null;
        studentManager0.registerCourse(student3, course4);
        Student student6 = null;
        java.util.List<Course> courseList7 = studentManager0.getCourses(student6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        Student student10 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseList7);
        org.junit.Assert.assertNotNull(courseList9);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        Course course4 = null;
        studentManager0.registerCourse(student3, course4);
        Student student6 = null;
        java.util.List<Course> courseList7 = studentManager0.getCourses(student6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        Student student12 = null;
        Course course13 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student12, course13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseList7);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertNotNull(courseList11);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        Course course6 = null;
        studentManager0.registerCourse(student5, course6);
        Student student8 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        Student student7 = null;
        java.util.List<Course> courseList8 = studentManager0.getCourses(student7);
        java.lang.Class<?> wildcardClass9 = courseList8.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(courseList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        int int2 = studentManager0.getTotalStudents();
        java.lang.Class<?> wildcardClass3 = studentManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseList4);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        Course course4 = null;
        studentManager0.registerCourse(student3, course4);
        Student student6 = null;
        java.util.List<Course> courseList7 = studentManager0.getCourses(student6);
        Student student8 = null;
        Course course9 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student8, course9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseList7);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        Student student7 = null;
        java.util.List<Course> courseList8 = studentManager0.getCourses(student7);
        int int9 = studentManager0.getTotalStudents();
        int int10 = studentManager0.getTotalStudents();
        Student student11 = null;
        java.util.List<Course> courseList12 = studentManager0.getCourses(student11);
        Student student13 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(courseList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(courseList12);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        int int7 = studentManager0.getTotalStudents();
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        java.lang.Class<?> wildcardClass10 = studentManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        Course course4 = null;
        studentManager0.registerCourse(student3, course4);
        int int6 = studentManager0.getTotalStudents();
        java.lang.Class<?> wildcardClass7 = studentManager0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        Course course6 = null;
        studentManager0.registerCourse(student5, course6);
        java.lang.Class<?> wildcardClass8 = studentManager0.getClass();
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<Course> courseList2 = studentManager0.getCourses(student1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student not found");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        int int7 = studentManager0.getTotalStudents();
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        java.lang.Class<?> wildcardClass10 = courseList9.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        Student student7 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        java.util.List<Course> courseList5 = studentManager0.getCourses(student4);
        Student student6 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(courseList5);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        Course course4 = null;
        studentManager0.registerCourse(student3, course4);
        Student student6 = null;
        java.util.List<Course> courseList7 = studentManager0.getCourses(student6);
        int int8 = studentManager0.getTotalStudents();
        Student student9 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        int int2 = studentManager0.getTotalStudents();
        Student student3 = null;
        studentManager0.addStudent(student3);
        Student student5 = null;
        Course course6 = null;
        studentManager0.registerCourse(student5, course6);
        Student student8 = null;
        Course course9 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student8, course9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        int int7 = studentManager0.getTotalStudents();
        Student student8 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        Course course6 = null;
        studentManager0.registerCourse(student5, course6);
        int int8 = studentManager0.getTotalStudents();
        java.lang.Class<?> wildcardClass9 = studentManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        Course course6 = null;
        studentManager0.registerCourse(student5, course6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        int int10 = studentManager0.getTotalStudents();
        Student student11 = null;
        Course course12 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student11, course12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        Course course4 = null;
        studentManager0.registerCourse(student3, course4);
        Student student6 = null;
        java.util.List<Course> courseList7 = studentManager0.getCourses(student6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        Student student12 = null;
        java.util.List<Course> courseList13 = studentManager0.getCourses(student12);
        Student student14 = null;
        Course course15 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student14, course15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseList7);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertNotNull(courseList11);
        org.junit.Assert.assertNotNull(courseList13);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        int int2 = studentManager0.getTotalStudents();
        Student student3 = null;
        studentManager0.addStudent(student3);
        Student student5 = null;
        Course course6 = null;
        studentManager0.registerCourse(student5, course6);
        Student student8 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        int int7 = studentManager0.getTotalStudents();
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        Student student10 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(courseList9);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        int int7 = studentManager0.getTotalStudents();
        java.lang.Class<?> wildcardClass8 = studentManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        Student student7 = null;
        java.util.List<Course> courseList8 = studentManager0.getCourses(student7);
        int int9 = studentManager0.getTotalStudents();
        int int10 = studentManager0.getTotalStudents();
        Student student11 = null;
        java.util.List<Course> courseList12 = studentManager0.getCourses(student11);
        int int13 = studentManager0.getTotalStudents();
        Student student14 = null;
        java.util.List<Course> courseList15 = studentManager0.getCourses(student14);
        java.lang.Class<?> wildcardClass16 = courseList15.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(courseList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(courseList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(courseList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        Course course4 = null;
        studentManager0.registerCourse(student3, course4);
        int int6 = studentManager0.getTotalStudents();
        int int7 = studentManager0.getTotalStudents();
        java.lang.Class<?> wildcardClass8 = studentManager0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        Student student7 = null;
        java.util.List<Course> courseList8 = studentManager0.getCourses(student7);
        Student student9 = null;
        Course course10 = null;
        studentManager0.registerCourse(student9, course10);
        Student student12 = null;
        Course course13 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student12, course13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertNotNull(courseList8);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        int int2 = studentManager0.getTotalStudents();
        Student student3 = null;
        studentManager0.addStudent(student3);
        int int5 = studentManager0.getTotalStudents();
        Student student6 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        Student student7 = null;
        Course course8 = null;
        studentManager0.registerCourse(student7, course8);
        java.lang.Class<?> wildcardClass10 = studentManager0.getClass();
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        int int7 = studentManager0.getTotalStudents();
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        Student student12 = null;
        Course course13 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student12, course13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertNotNull(courseList11);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        int int7 = studentManager0.getTotalStudents();
        Student student8 = null;
        Course course9 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student8, course9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        Course course6 = null;
        studentManager0.registerCourse(student5, course6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        int int10 = studentManager0.getTotalStudents();
        Student student11 = null;
        java.util.List<Course> courseList12 = studentManager0.getCourses(student11);
        Student student13 = null;
        Course course14 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student13, course14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(courseList12);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        Student student7 = null;
        java.util.List<Course> courseList8 = studentManager0.getCourses(student7);
        java.lang.Class<?> wildcardClass9 = studentManager0.getClass();
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertNotNull(courseList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        Course course6 = null;
        studentManager0.registerCourse(student5, course6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        int int10 = studentManager0.getTotalStudents();
        Student student11 = null;
        Course course12 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student11, course12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        Student student7 = null;
        java.util.List<Course> courseList8 = studentManager0.getCourses(student7);
        Student student9 = null;
        java.util.List<Course> courseList10 = studentManager0.getCourses(student9);
        java.lang.Class<?> wildcardClass11 = courseList10.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertNotNull(courseList8);
        org.junit.Assert.assertNotNull(courseList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        int int7 = studentManager0.getTotalStudents();
        int int8 = studentManager0.getTotalStudents();
        int int9 = studentManager0.getTotalStudents();
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        int int12 = studentManager0.getTotalStudents();
        Student student13 = null;
        java.util.List<Course> courseList14 = studentManager0.getCourses(student13);
        java.lang.Class<?> wildcardClass15 = courseList14.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(courseList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(courseList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        int int7 = studentManager0.getTotalStudents();
        int int8 = studentManager0.getTotalStudents();
        int int9 = studentManager0.getTotalStudents();
        java.lang.Class<?> wildcardClass10 = studentManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        Student student7 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList6);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        int int5 = studentManager0.getTotalStudents();
        Student student6 = null;
        java.util.List<Course> courseList7 = studentManager0.getCourses(student6);
        java.lang.Class<?> wildcardClass8 = courseList7.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(courseList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        Student student7 = null;
        java.util.List<Course> courseList8 = studentManager0.getCourses(student7);
        Student student9 = null;
        Course course10 = null;
        studentManager0.registerCourse(student9, course10);
        int int12 = studentManager0.getTotalStudents();
        Student student13 = null;
        Course course14 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student13, course14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertNotNull(courseList8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        int int7 = studentManager0.getTotalStudents();
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        java.lang.Class<?> wildcardClass12 = studentManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertNotNull(courseList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        Course course4 = null;
        studentManager0.registerCourse(student3, course4);
        int int6 = studentManager0.getTotalStudents();
        Student student7 = null;
        Course course8 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student7, course8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        Course course6 = null;
        studentManager0.registerCourse(student5, course6);
        Student student8 = null;
        Course course9 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student8, course9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseList4);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        Student student7 = null;
        java.util.List<Course> courseList8 = studentManager0.getCourses(student7);
        Student student9 = null;
        java.util.List<Course> courseList10 = studentManager0.getCourses(student9);
        Student student11 = null;
        Course course12 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student11, course12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(courseList8);
        org.junit.Assert.assertNotNull(courseList10);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        Student student7 = null;
        java.util.List<Course> courseList8 = studentManager0.getCourses(student7);
        int int9 = studentManager0.getTotalStudents();
        int int10 = studentManager0.getTotalStudents();
        Student student11 = null;
        java.util.List<Course> courseList12 = studentManager0.getCourses(student11);
        int int13 = studentManager0.getTotalStudents();
        Student student14 = null;
        java.util.List<Course> courseList15 = studentManager0.getCourses(student14);
        Student student16 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(courseList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(courseList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(courseList15);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        int int7 = studentManager0.getTotalStudents();
        int int8 = studentManager0.getTotalStudents();
        Student student9 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        Student student7 = null;
        java.util.List<Course> courseList8 = studentManager0.getCourses(student7);
        int int9 = studentManager0.getTotalStudents();
        int int10 = studentManager0.getTotalStudents();
        Student student11 = null;
        java.util.List<Course> courseList12 = studentManager0.getCourses(student11);
        Student student13 = null;
        Course course14 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student13, course14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(courseList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(courseList12);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        Course course4 = null;
        studentManager0.registerCourse(student3, course4);
        int int6 = studentManager0.getTotalStudents();
        int int7 = studentManager0.getTotalStudents();
        Student student8 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        Course course4 = null;
        studentManager0.registerCourse(student3, course4);
        Student student6 = null;
        java.util.List<Course> courseList7 = studentManager0.getCourses(student6);
        java.lang.Class<?> wildcardClass8 = courseList7.getClass();
        org.junit.Assert.assertNotNull(courseList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        Course course4 = null;
        studentManager0.registerCourse(student3, course4);
        Student student6 = null;
        java.util.List<Course> courseList7 = studentManager0.getCourses(student6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        Student student12 = null;
        java.util.List<Course> courseList13 = studentManager0.getCourses(student12);
        Student student14 = null;
        java.util.List<Course> courseList15 = studentManager0.getCourses(student14);
        Student student16 = null;
        Course course17 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student16, course17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseList7);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertNotNull(courseList11);
        org.junit.Assert.assertNotNull(courseList13);
        org.junit.Assert.assertNotNull(courseList15);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        int int7 = studentManager0.getTotalStudents();
        int int8 = studentManager0.getTotalStudents();
        int int9 = studentManager0.getTotalStudents();
        Student student10 = null;
        Course course11 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student10, course11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        Course course4 = null;
        studentManager0.registerCourse(student3, course4);
        Student student6 = null;
        java.util.List<Course> courseList7 = studentManager0.getCourses(student6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        int int10 = studentManager0.getTotalStudents();
        int int11 = studentManager0.getTotalStudents();
        java.lang.Class<?> wildcardClass12 = studentManager0.getClass();
        org.junit.Assert.assertNotNull(courseList7);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        Student student7 = null;
        java.util.List<Course> courseList8 = studentManager0.getCourses(student7);
        int int9 = studentManager0.getTotalStudents();
        int int10 = studentManager0.getTotalStudents();
        Student student11 = null;
        java.util.List<Course> courseList12 = studentManager0.getCourses(student11);
        int int13 = studentManager0.getTotalStudents();
        Student student14 = null;
        java.util.List<Course> courseList15 = studentManager0.getCourses(student14);
        Student student16 = null;
        Course course17 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student16, course17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(courseList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(courseList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(courseList15);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        Student student7 = null;
        java.util.List<Course> courseList8 = studentManager0.getCourses(student7);
        int int9 = studentManager0.getTotalStudents();
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        Student student12 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(courseList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(courseList11);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        Student student7 = null;
        Course course8 = null;
        studentManager0.registerCourse(student7, course8);
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        Student student12 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertNotNull(courseList11);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        int int7 = studentManager0.getTotalStudents();
        Student student8 = null;
        Course course9 = null;
        studentManager0.registerCourse(student8, course9);
        java.lang.Class<?> wildcardClass11 = studentManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        Course course4 = null;
        studentManager0.registerCourse(student3, course4);
        Student student6 = null;
        java.util.List<Course> courseList7 = studentManager0.getCourses(student6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        Student student12 = null;
        java.util.List<Course> courseList13 = studentManager0.getCourses(student12);
        java.lang.Class<?> wildcardClass14 = studentManager0.getClass();
        org.junit.Assert.assertNotNull(courseList7);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertNotNull(courseList11);
        org.junit.Assert.assertNotNull(courseList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        Course course4 = null;
        studentManager0.registerCourse(student3, course4);
        Student student6 = null;
        java.util.List<Course> courseList7 = studentManager0.getCourses(student6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        int int10 = studentManager0.getTotalStudents();
        int int11 = studentManager0.getTotalStudents();
        Student student12 = null;
        Course course13 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student12, course13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseList7);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        Course course4 = null;
        studentManager0.registerCourse(student3, course4);
        Student student6 = null;
        java.util.List<Course> courseList7 = studentManager0.getCourses(student6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        int int10 = studentManager0.getTotalStudents();
        int int11 = studentManager0.getTotalStudents();
        Student student12 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseList7);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        int int2 = studentManager0.getTotalStudents();
        Student student3 = null;
        studentManager0.addStudent(student3);
        int int5 = studentManager0.getTotalStudents();
        Student student6 = null;
        Course course7 = null;
        studentManager0.registerCourse(student6, course7);
        int int9 = studentManager0.getTotalStudents();
        Student student10 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        int int7 = studentManager0.getTotalStudents();
        int int8 = studentManager0.getTotalStudents();
        int int9 = studentManager0.getTotalStudents();
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        int int12 = studentManager0.getTotalStudents();
        Student student13 = null;
        java.util.List<Course> courseList14 = studentManager0.getCourses(student13);
        int int15 = studentManager0.getTotalStudents();
        Student student16 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(courseList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(courseList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        Course course6 = null;
        studentManager0.registerCourse(student5, course6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        int int12 = studentManager0.getTotalStudents();
        Student student13 = null;
        java.util.List<Course> courseList14 = studentManager0.getCourses(student13);
        int int15 = studentManager0.getTotalStudents();
        Student student16 = null;
        Course course17 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student16, course17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertNotNull(courseList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(courseList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        Course course4 = null;
        studentManager0.registerCourse(student3, course4);
        Student student6 = null;
        java.util.List<Course> courseList7 = studentManager0.getCourses(student6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        Student student12 = null;
        java.util.List<Course> courseList13 = studentManager0.getCourses(student12);
        Student student14 = null;
        java.util.List<Course> courseList15 = studentManager0.getCourses(student14);
        Student student16 = null;
        java.util.List<Course> courseList17 = studentManager0.getCourses(student16);
        Student student18 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseList7);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertNotNull(courseList11);
        org.junit.Assert.assertNotNull(courseList13);
        org.junit.Assert.assertNotNull(courseList15);
        org.junit.Assert.assertNotNull(courseList17);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        int int7 = studentManager0.getTotalStudents();
        int int8 = studentManager0.getTotalStudents();
        Student student9 = null;
        java.util.List<Course> courseList10 = studentManager0.getCourses(student9);
        int int11 = studentManager0.getTotalStudents();
        int int12 = studentManager0.getTotalStudents();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(courseList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        int int7 = studentManager0.getTotalStudents();
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        Student student12 = null;
        java.util.List<Course> courseList13 = studentManager0.getCourses(student12);
        java.lang.Class<?> wildcardClass14 = courseList13.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertNotNull(courseList11);
        org.junit.Assert.assertNotNull(courseList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        Course course4 = null;
        studentManager0.registerCourse(student3, course4);
        int int6 = studentManager0.getTotalStudents();
        Student student7 = null;
        java.util.List<Course> courseList8 = studentManager0.getCourses(student7);
        java.lang.Class<?> wildcardClass9 = courseList8.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(courseList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        int int2 = studentManager0.getTotalStudents();
        Student student3 = null;
        studentManager0.addStudent(student3);
        int int5 = studentManager0.getTotalStudents();
        Student student6 = null;
        Course course7 = null;
        studentManager0.registerCourse(student6, course7);
        int int9 = studentManager0.getTotalStudents();
        java.lang.Class<?> wildcardClass10 = studentManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        Student student7 = null;
        java.util.List<Course> courseList8 = studentManager0.getCourses(student7);
        Student student9 = null;
        Course course10 = null;
        studentManager0.registerCourse(student9, course10);
        java.lang.Class<?> wildcardClass12 = studentManager0.getClass();
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertNotNull(courseList8);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        Course course6 = null;
        studentManager0.registerCourse(student5, course6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        int int12 = studentManager0.getTotalStudents();
        Student student13 = null;
        java.util.List<Course> courseList14 = studentManager0.getCourses(student13);
        java.lang.Class<?> wildcardClass15 = studentManager0.getClass();
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertNotNull(courseList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(courseList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        Student student7 = null;
        java.util.List<Course> courseList8 = studentManager0.getCourses(student7);
        java.lang.Class<?> wildcardClass9 = studentManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertNotNull(courseList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        Course course6 = null;
        studentManager0.registerCourse(student5, course6);
        java.lang.Class<?> wildcardClass8 = studentManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        Student student7 = null;
        java.util.List<Course> courseList8 = studentManager0.getCourses(student7);
        Student student9 = null;
        java.util.List<Course> courseList10 = studentManager0.getCourses(student9);
        java.lang.Class<?> wildcardClass11 = studentManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertNotNull(courseList8);
        org.junit.Assert.assertNotNull(courseList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        int int7 = studentManager0.getTotalStudents();
        int int8 = studentManager0.getTotalStudents();
        Student student9 = null;
        java.util.List<Course> courseList10 = studentManager0.getCourses(student9);
        java.lang.Class<?> wildcardClass11 = studentManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(courseList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        Course course6 = null;
        studentManager0.registerCourse(student5, course6);
        int int8 = studentManager0.getTotalStudents();
        Student student9 = null;
        Course course10 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student9, course10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        int int7 = studentManager0.getTotalStudents();
        int int8 = studentManager0.getTotalStudents();
        int int9 = studentManager0.getTotalStudents();
        int int10 = studentManager0.getTotalStudents();
        Student student11 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        int int7 = studentManager0.getTotalStudents();
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        int int12 = studentManager0.getTotalStudents();
        Student student13 = null;
        Course course14 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student13, course14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertNotNull(courseList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        Course course4 = null;
        studentManager0.registerCourse(student3, course4);
        int int6 = studentManager0.getTotalStudents();
        int int7 = studentManager0.getTotalStudents();
        Student student8 = null;
        Course course9 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student8, course9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        Student student7 = null;
        java.util.List<Course> courseList8 = studentManager0.getCourses(student7);
        Student student9 = null;
        Course course10 = null;
        studentManager0.registerCourse(student9, course10);
        Student student12 = null;
        java.util.List<Course> courseList13 = studentManager0.getCourses(student12);
        Student student14 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertNotNull(courseList8);
        org.junit.Assert.assertNotNull(courseList13);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        Course course4 = null;
        studentManager0.registerCourse(student3, course4);
        int int6 = studentManager0.getTotalStudents();
        Student student7 = null;
        java.util.List<Course> courseList8 = studentManager0.getCourses(student7);
        Student student9 = null;
        java.util.List<Course> courseList10 = studentManager0.getCourses(student9);
        java.lang.Class<?> wildcardClass11 = courseList10.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(courseList8);
        org.junit.Assert.assertNotNull(courseList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        Course course6 = null;
        studentManager0.registerCourse(student5, course6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        int int10 = studentManager0.getTotalStudents();
        Student student11 = null;
        java.util.List<Course> courseList12 = studentManager0.getCourses(student11);
        java.lang.Class<?> wildcardClass13 = studentManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(courseList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        Course course4 = null;
        studentManager0.registerCourse(student3, course4);
        Student student6 = null;
        java.util.List<Course> courseList7 = studentManager0.getCourses(student6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        Student student12 = null;
        java.util.List<Course> courseList13 = studentManager0.getCourses(student12);
        Student student14 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseList7);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertNotNull(courseList11);
        org.junit.Assert.assertNotNull(courseList13);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        Course course4 = null;
        studentManager0.registerCourse(student3, course4);
        Student student6 = null;
        java.util.List<Course> courseList7 = studentManager0.getCourses(student6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        int int10 = studentManager0.getTotalStudents();
        Student student11 = null;
        java.util.List<Course> courseList12 = studentManager0.getCourses(student11);
        Student student13 = null;
        java.util.List<Course> courseList14 = studentManager0.getCourses(student13);
        Student student15 = null;
        Course course16 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student15, course16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseList7);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(courseList12);
        org.junit.Assert.assertNotNull(courseList14);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        int int2 = studentManager0.getTotalStudents();
        Student student3 = null;
        studentManager0.addStudent(student3);
        int int5 = studentManager0.getTotalStudents();
        Student student6 = null;
        Course course7 = null;
        studentManager0.registerCourse(student6, course7);
        java.lang.Class<?> wildcardClass9 = studentManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        Course course4 = null;
        studentManager0.registerCourse(student3, course4);
        Student student6 = null;
        java.util.List<Course> courseList7 = studentManager0.getCourses(student6);
        int int8 = studentManager0.getTotalStudents();
        Student student9 = null;
        Course course10 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student9, course10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        Course course4 = null;
        studentManager0.registerCourse(student3, course4);
        Student student6 = null;
        java.util.List<Course> courseList7 = studentManager0.getCourses(student6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        int int10 = studentManager0.getTotalStudents();
        Student student11 = null;
        java.util.List<Course> courseList12 = studentManager0.getCourses(student11);
        Student student13 = null;
        java.util.List<Course> courseList14 = studentManager0.getCourses(student13);
        java.lang.Class<?> wildcardClass15 = courseList14.getClass();
        org.junit.Assert.assertNotNull(courseList7);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(courseList12);
        org.junit.Assert.assertNotNull(courseList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        int int7 = studentManager0.getTotalStudents();
        int int8 = studentManager0.getTotalStudents();
        int int9 = studentManager0.getTotalStudents();
        int int10 = studentManager0.getTotalStudents();
        Student student11 = null;
        Course course12 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student11, course12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        int int7 = studentManager0.getTotalStudents();
        int int8 = studentManager0.getTotalStudents();
        int int9 = studentManager0.getTotalStudents();
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        int int12 = studentManager0.getTotalStudents();
        Student student13 = null;
        java.util.List<Course> courseList14 = studentManager0.getCourses(student13);
        Student student15 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(courseList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(courseList14);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        java.lang.Class<?> wildcardClass7 = studentManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        Course course4 = null;
        studentManager0.registerCourse(student3, course4);
        java.lang.Class<?> wildcardClass6 = studentManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        Student student7 = null;
        java.util.List<Course> courseList8 = studentManager0.getCourses(student7);
        int int9 = studentManager0.getTotalStudents();
        int int10 = studentManager0.getTotalStudents();
        int int11 = studentManager0.getTotalStudents();
        Student student12 = null;
        java.util.List<Course> courseList13 = studentManager0.getCourses(student12);
        Student student14 = null;
        java.util.List<Course> courseList15 = studentManager0.getCourses(student14);
        Student student16 = null;
        Course course17 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student16, course17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(courseList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(courseList13);
        org.junit.Assert.assertNotNull(courseList15);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        Course course4 = null;
        studentManager0.registerCourse(student3, course4);
        Student student6 = null;
        java.util.List<Course> courseList7 = studentManager0.getCourses(student6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        java.lang.Class<?> wildcardClass12 = studentManager0.getClass();
        org.junit.Assert.assertNotNull(courseList7);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertNotNull(courseList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        Course course6 = null;
        studentManager0.registerCourse(student5, course6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        int int12 = studentManager0.getTotalStudents();
        Student student13 = null;
        java.util.List<Course> courseList14 = studentManager0.getCourses(student13);
        int int15 = studentManager0.getTotalStudents();
        Student student16 = null;
        java.util.List<Course> courseList17 = studentManager0.getCourses(student16);
        Student student18 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertNotNull(courseList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(courseList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(courseList17);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        Course course6 = null;
        studentManager0.registerCourse(student5, course6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        Student student10 = null;
        Course course11 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student10, course11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(courseList9);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        Student student7 = null;
        Course course8 = null;
        studentManager0.registerCourse(student7, course8);
        int int10 = studentManager0.getTotalStudents();
        Student student11 = null;
        Course course12 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student11, course12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        int int7 = studentManager0.getTotalStudents();
        int int8 = studentManager0.getTotalStudents();
        Student student9 = null;
        java.util.List<Course> courseList10 = studentManager0.getCourses(student9);
        Student student11 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(courseList10);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        Course course4 = null;
        studentManager0.registerCourse(student3, course4);
        int int6 = studentManager0.getTotalStudents();
        Student student7 = null;
        java.util.List<Course> courseList8 = studentManager0.getCourses(student7);
        Student student9 = null;
        java.util.List<Course> courseList10 = studentManager0.getCourses(student9);
        java.lang.Class<?> wildcardClass11 = studentManager0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(courseList8);
        org.junit.Assert.assertNotNull(courseList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        Student student7 = null;
        java.util.List<Course> courseList8 = studentManager0.getCourses(student7);
        int int9 = studentManager0.getTotalStudents();
        int int10 = studentManager0.getTotalStudents();
        Student student11 = null;
        Course course12 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student11, course12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(courseList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        Student student7 = null;
        java.util.List<Course> courseList8 = studentManager0.getCourses(student7);
        int int9 = studentManager0.getTotalStudents();
        int int10 = studentManager0.getTotalStudents();
        Student student11 = null;
        java.util.List<Course> courseList12 = studentManager0.getCourses(student11);
        int int13 = studentManager0.getTotalStudents();
        Student student14 = null;
        java.util.List<Course> courseList15 = studentManager0.getCourses(student14);
        int int16 = studentManager0.getTotalStudents();
        Student student17 = null;
        java.util.List<Course> courseList18 = studentManager0.getCourses(student17);
        Student student19 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(courseList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(courseList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(courseList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(courseList18);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        Student student7 = null;
        java.util.List<Course> courseList8 = studentManager0.getCourses(student7);
        int int9 = studentManager0.getTotalStudents();
        int int10 = studentManager0.getTotalStudents();
        int int11 = studentManager0.getTotalStudents();
        Student student12 = null;
        java.util.List<Course> courseList13 = studentManager0.getCourses(student12);
        Student student14 = null;
        Course course15 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student14, course15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(courseList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(courseList13);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        int int7 = studentManager0.getTotalStudents();
        int int8 = studentManager0.getTotalStudents();
        Student student9 = null;
        Course course10 = null;
        studentManager0.registerCourse(student9, course10);
        java.lang.Class<?> wildcardClass12 = studentManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        Student student7 = null;
        Course course8 = null;
        studentManager0.registerCourse(student7, course8);
        int int10 = studentManager0.getTotalStudents();
        int int11 = studentManager0.getTotalStudents();
        Student student12 = null;
        Course course13 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student12, course13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        int int7 = studentManager0.getTotalStudents();
        int int8 = studentManager0.getTotalStudents();
        int int9 = studentManager0.getTotalStudents();
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        int int12 = studentManager0.getTotalStudents();
        int int13 = studentManager0.getTotalStudents();
        int int14 = studentManager0.getTotalStudents();
        int int15 = studentManager0.getTotalStudents();
        Student student16 = null;
        Course course17 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student16, course17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(courseList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        int int5 = studentManager0.getTotalStudents();
        Student student6 = null;
        java.util.List<Course> courseList7 = studentManager0.getCourses(student6);
        Student student8 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(courseList7);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        int int7 = studentManager0.getTotalStudents();
        int int8 = studentManager0.getTotalStudents();
        int int9 = studentManager0.getTotalStudents();
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        int int12 = studentManager0.getTotalStudents();
        int int13 = studentManager0.getTotalStudents();
        int int14 = studentManager0.getTotalStudents();
        java.lang.Class<?> wildcardClass15 = studentManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(courseList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        Course course6 = null;
        studentManager0.registerCourse(student5, course6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        int int10 = studentManager0.getTotalStudents();
        Student student11 = null;
        java.util.List<Course> courseList12 = studentManager0.getCourses(student11);
        int int13 = studentManager0.getTotalStudents();
        Student student14 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(courseList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        int int7 = studentManager0.getTotalStudents();
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        int int12 = studentManager0.getTotalStudents();
        Student student13 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertNotNull(courseList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        Student student7 = null;
        java.util.List<Course> courseList8 = studentManager0.getCourses(student7);
        Student student9 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertNotNull(courseList8);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        Student student7 = null;
        java.util.List<Course> courseList8 = studentManager0.getCourses(student7);
        int int9 = studentManager0.getTotalStudents();
        int int10 = studentManager0.getTotalStudents();
        int int11 = studentManager0.getTotalStudents();
        Student student12 = null;
        Course course13 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student12, course13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(courseList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        Student student7 = null;
        java.util.List<Course> courseList8 = studentManager0.getCourses(student7);
        int int9 = studentManager0.getTotalStudents();
        int int10 = studentManager0.getTotalStudents();
        Student student11 = null;
        java.util.List<Course> courseList12 = studentManager0.getCourses(student11);
        int int13 = studentManager0.getTotalStudents();
        Student student14 = null;
        java.util.List<Course> courseList15 = studentManager0.getCourses(student14);
        int int16 = studentManager0.getTotalStudents();
        Student student17 = null;
        java.util.List<Course> courseList18 = studentManager0.getCourses(student17);
        Student student19 = null;
        java.util.List<Course> courseList20 = studentManager0.getCourses(student19);
        Student student21 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(courseList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(courseList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(courseList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(courseList18);
        org.junit.Assert.assertNotNull(courseList20);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        int int5 = studentManager0.getTotalStudents();
        Student student6 = null;
        Course course7 = null;
        studentManager0.registerCourse(student6, course7);
        java.lang.Class<?> wildcardClass9 = studentManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        int int7 = studentManager0.getTotalStudents();
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        Student student12 = null;
        java.util.List<Course> courseList13 = studentManager0.getCourses(student12);
        int int14 = studentManager0.getTotalStudents();
        Student student15 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertNotNull(courseList11);
        org.junit.Assert.assertNotNull(courseList13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        int int7 = studentManager0.getTotalStudents();
        int int8 = studentManager0.getTotalStudents();
        int int9 = studentManager0.getTotalStudents();
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        int int12 = studentManager0.getTotalStudents();
        Student student13 = null;
        java.util.List<Course> courseList14 = studentManager0.getCourses(student13);
        int int15 = studentManager0.getTotalStudents();
        Student student16 = null;
        java.util.List<Course> courseList17 = studentManager0.getCourses(student16);
        java.lang.Class<?> wildcardClass18 = studentManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(courseList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(courseList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(courseList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        int int7 = studentManager0.getTotalStudents();
        int int8 = studentManager0.getTotalStudents();
        int int9 = studentManager0.getTotalStudents();
        Student student10 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        int int7 = studentManager0.getTotalStudents();
        int int8 = studentManager0.getTotalStudents();
        Student student9 = null;
        java.util.List<Course> courseList10 = studentManager0.getCourses(student9);
        Student student11 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(courseList10);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        int int5 = studentManager0.getTotalStudents();
        Student student6 = null;
        java.util.List<Course> courseList7 = studentManager0.getCourses(student6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        Student student10 = null;
        Course course11 = null;
        studentManager0.registerCourse(student10, course11);
        Student student13 = null;
        Course course14 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student13, course14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(courseList7);
        org.junit.Assert.assertNotNull(courseList9);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        java.lang.Class<?> wildcardClass7 = studentManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        Course course6 = null;
        studentManager0.registerCourse(student5, course6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        int int10 = studentManager0.getTotalStudents();
        int int11 = studentManager0.getTotalStudents();
        int int12 = studentManager0.getTotalStudents();
        Student student13 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        int int7 = studentManager0.getTotalStudents();
        Student student8 = null;
        Course course9 = null;
        studentManager0.registerCourse(student8, course9);
        Student student11 = null;
        java.util.List<Course> courseList12 = studentManager0.getCourses(student11);
        Student student13 = null;
        Course course14 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student13, course14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(courseList12);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        int int5 = studentManager0.getTotalStudents();
        Student student6 = null;
        java.util.List<Course> courseList7 = studentManager0.getCourses(student6);
        java.lang.Class<?> wildcardClass8 = studentManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(courseList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        Course course4 = null;
        studentManager0.registerCourse(student3, course4);
        Student student6 = null;
        java.util.List<Course> courseList7 = studentManager0.getCourses(student6);
        int int8 = studentManager0.getTotalStudents();
        java.lang.Class<?> wildcardClass9 = studentManager0.getClass();
        org.junit.Assert.assertNotNull(courseList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        int int7 = studentManager0.getTotalStudents();
        int int8 = studentManager0.getTotalStudents();
        int int9 = studentManager0.getTotalStudents();
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        int int12 = studentManager0.getTotalStudents();
        Student student13 = null;
        java.util.List<Course> courseList14 = studentManager0.getCourses(student13);
        Student student15 = null;
        java.util.List<Course> courseList16 = studentManager0.getCourses(student15);
        Student student17 = null;
        Course course18 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student17, course18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(courseList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(courseList14);
        org.junit.Assert.assertNotNull(courseList16);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        int int2 = studentManager0.getTotalStudents();
        Student student3 = null;
        studentManager0.addStudent(student3);
        java.lang.Class<?> wildcardClass5 = studentManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        Student student7 = null;
        Course course8 = null;
        studentManager0.registerCourse(student7, course8);
        int int10 = studentManager0.getTotalStudents();
        Student student11 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        Course course4 = null;
        studentManager0.registerCourse(student3, course4);
        Student student6 = null;
        java.util.List<Course> courseList7 = studentManager0.getCourses(student6);
        java.lang.Class<?> wildcardClass8 = studentManager0.getClass();
        org.junit.Assert.assertNotNull(courseList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        Course course6 = null;
        studentManager0.registerCourse(student5, course6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        int int12 = studentManager0.getTotalStudents();
        Student student13 = null;
        Course course14 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student13, course14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertNotNull(courseList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        Student student7 = null;
        Course course8 = null;
        studentManager0.registerCourse(student7, course8);
        java.lang.Class<?> wildcardClass10 = studentManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        Course course4 = null;
        studentManager0.registerCourse(student3, course4);
        Student student6 = null;
        java.util.List<Course> courseList7 = studentManager0.getCourses(student6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        Student student12 = null;
        java.util.List<Course> courseList13 = studentManager0.getCourses(student12);
        Student student14 = null;
        java.util.List<Course> courseList15 = studentManager0.getCourses(student14);
        Student student16 = null;
        java.util.List<Course> courseList17 = studentManager0.getCourses(student16);
        Student student18 = null;
        Course course19 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student18, course19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseList7);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertNotNull(courseList11);
        org.junit.Assert.assertNotNull(courseList13);
        org.junit.Assert.assertNotNull(courseList15);
        org.junit.Assert.assertNotNull(courseList17);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        Course course4 = null;
        studentManager0.registerCourse(student3, course4);
        Student student6 = null;
        java.util.List<Course> courseList7 = studentManager0.getCourses(student6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        Student student12 = null;
        java.util.List<Course> courseList13 = studentManager0.getCourses(student12);
        int int14 = studentManager0.getTotalStudents();
        Student student15 = null;
        java.util.List<Course> courseList16 = studentManager0.getCourses(student15);
        java.lang.Class<?> wildcardClass17 = courseList16.getClass();
        org.junit.Assert.assertNotNull(courseList7);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertNotNull(courseList11);
        org.junit.Assert.assertNotNull(courseList13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(courseList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        int int7 = studentManager0.getTotalStudents();
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        Student student12 = null;
        java.util.List<Course> courseList13 = studentManager0.getCourses(student12);
        Student student14 = null;
        Course course15 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student14, course15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertNotNull(courseList11);
        org.junit.Assert.assertNotNull(courseList13);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        int int7 = studentManager0.getTotalStudents();
        Student student8 = null;
        Course course9 = null;
        studentManager0.registerCourse(student8, course9);
        Student student11 = null;
        java.util.List<Course> courseList12 = studentManager0.getCourses(student11);
        Student student13 = null;
        java.util.List<Course> courseList14 = studentManager0.getCourses(student13);
        int int15 = studentManager0.getTotalStudents();
        Student student16 = null;
        java.util.List<Course> courseList17 = studentManager0.getCourses(student16);
        Student student18 = null;
        java.util.List<Course> courseList19 = studentManager0.getCourses(student18);
        java.lang.Class<?> wildcardClass20 = courseList19.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(courseList12);
        org.junit.Assert.assertNotNull(courseList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(courseList17);
        org.junit.Assert.assertNotNull(courseList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        Course course6 = null;
        studentManager0.registerCourse(student5, course6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        int int10 = studentManager0.getTotalStudents();
        Student student11 = null;
        java.util.List<Course> courseList12 = studentManager0.getCourses(student11);
        Student student13 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(courseList12);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        Course course6 = null;
        studentManager0.registerCourse(student5, course6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        int int10 = studentManager0.getTotalStudents();
        Student student11 = null;
        java.util.List<Course> courseList12 = studentManager0.getCourses(student11);
        int int13 = studentManager0.getTotalStudents();
        Student student14 = null;
        Course course15 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student14, course15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(courseList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        Student student7 = null;
        java.util.List<Course> courseList8 = studentManager0.getCourses(student7);
        Student student9 = null;
        java.util.List<Course> courseList10 = studentManager0.getCourses(student9);
        Student student11 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertNotNull(courseList8);
        org.junit.Assert.assertNotNull(courseList10);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        Course course4 = null;
        studentManager0.registerCourse(student3, course4);
        Student student6 = null;
        java.util.List<Course> courseList7 = studentManager0.getCourses(student6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        Student student12 = null;
        java.util.List<Course> courseList13 = studentManager0.getCourses(student12);
        int int14 = studentManager0.getTotalStudents();
        Student student15 = null;
        java.util.List<Course> courseList16 = studentManager0.getCourses(student15);
        Student student17 = null;
        java.util.List<Course> courseList18 = studentManager0.getCourses(student17);
        Student student19 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseList7);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertNotNull(courseList11);
        org.junit.Assert.assertNotNull(courseList13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(courseList16);
        org.junit.Assert.assertNotNull(courseList18);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        Course course4 = null;
        studentManager0.registerCourse(student3, course4);
        Student student6 = null;
        java.util.List<Course> courseList7 = studentManager0.getCourses(student6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        Student student12 = null;
        java.util.List<Course> courseList13 = studentManager0.getCourses(student12);
        int int14 = studentManager0.getTotalStudents();
        Student student15 = null;
        java.util.List<Course> courseList16 = studentManager0.getCourses(student15);
        Student student17 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseList7);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertNotNull(courseList11);
        org.junit.Assert.assertNotNull(courseList13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(courseList16);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        Student student7 = null;
        java.util.List<Course> courseList8 = studentManager0.getCourses(student7);
        Student student9 = null;
        java.util.List<Course> courseList10 = studentManager0.getCourses(student9);
        java.lang.Class<?> wildcardClass11 = studentManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(courseList8);
        org.junit.Assert.assertNotNull(courseList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        Student student7 = null;
        Course course8 = null;
        studentManager0.registerCourse(student7, course8);
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        int int12 = studentManager0.getTotalStudents();
        Student student13 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertNotNull(courseList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        Course course4 = null;
        studentManager0.registerCourse(student3, course4);
        Student student6 = null;
        java.util.List<Course> courseList7 = studentManager0.getCourses(student6);
        Student student8 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseList7);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        Student student7 = null;
        java.util.List<Course> courseList8 = studentManager0.getCourses(student7);
        Student student9 = null;
        java.util.List<Course> courseList10 = studentManager0.getCourses(student9);
        Student student11 = null;
        java.util.List<Course> courseList12 = studentManager0.getCourses(student11);
        Student student13 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertNotNull(courseList8);
        org.junit.Assert.assertNotNull(courseList10);
        org.junit.Assert.assertNotNull(courseList12);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        Student student7 = null;
        java.util.List<Course> courseList8 = studentManager0.getCourses(student7);
        Student student9 = null;
        java.util.List<Course> courseList10 = studentManager0.getCourses(student9);
        java.lang.Class<?> wildcardClass11 = courseList10.getClass();
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertNotNull(courseList8);
        org.junit.Assert.assertNotNull(courseList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        Student student7 = null;
        java.util.List<Course> courseList8 = studentManager0.getCourses(student7);
        int int9 = studentManager0.getTotalStudents();
        int int10 = studentManager0.getTotalStudents();
        int int11 = studentManager0.getTotalStudents();
        Student student12 = null;
        java.util.List<Course> courseList13 = studentManager0.getCourses(student12);
        Student student14 = null;
        java.util.List<Course> courseList15 = studentManager0.getCourses(student14);
        Student student16 = null;
        java.util.List<Course> courseList17 = studentManager0.getCourses(student16);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(courseList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(courseList13);
        org.junit.Assert.assertNotNull(courseList15);
        org.junit.Assert.assertNotNull(courseList17);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        Course course4 = null;
        studentManager0.registerCourse(student3, course4);
        Student student6 = null;
        java.util.List<Course> courseList7 = studentManager0.getCourses(student6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        Student student12 = null;
        java.util.List<Course> courseList13 = studentManager0.getCourses(student12);
        Student student14 = null;
        java.util.List<Course> courseList15 = studentManager0.getCourses(student14);
        Student student16 = null;
        java.util.List<Course> courseList17 = studentManager0.getCourses(student16);
        int int18 = studentManager0.getTotalStudents();
        java.lang.Class<?> wildcardClass19 = studentManager0.getClass();
        org.junit.Assert.assertNotNull(courseList7);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertNotNull(courseList11);
        org.junit.Assert.assertNotNull(courseList13);
        org.junit.Assert.assertNotNull(courseList15);
        org.junit.Assert.assertNotNull(courseList17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        Course course6 = null;
        studentManager0.registerCourse(student5, course6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        int int10 = studentManager0.getTotalStudents();
        Student student11 = null;
        java.util.List<Course> courseList12 = studentManager0.getCourses(student11);
        int int13 = studentManager0.getTotalStudents();
        int int14 = studentManager0.getTotalStudents();
        Student student15 = null;
        Course course16 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student15, course16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(courseList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        Course course6 = null;
        studentManager0.registerCourse(student5, course6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        int int12 = studentManager0.getTotalStudents();
        Student student13 = null;
        java.util.List<Course> courseList14 = studentManager0.getCourses(student13);
        Student student15 = null;
        Course course16 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student15, course16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertNotNull(courseList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(courseList14);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        int int7 = studentManager0.getTotalStudents();
        int int8 = studentManager0.getTotalStudents();
        Student student9 = null;
        Course course10 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student9, course10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        int int5 = studentManager0.getTotalStudents();
        Student student6 = null;
        Course course7 = null;
        studentManager0.registerCourse(student6, course7);
        int int9 = studentManager0.getTotalStudents();
        Student student10 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        Course course6 = null;
        studentManager0.registerCourse(student5, course6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        Student student12 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertNotNull(courseList11);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        Course course4 = null;
        studentManager0.registerCourse(student3, course4);
        Student student6 = null;
        java.util.List<Course> courseList7 = studentManager0.getCourses(student6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        Student student12 = null;
        java.util.List<Course> courseList13 = studentManager0.getCourses(student12);
        int int14 = studentManager0.getTotalStudents();
        Student student15 = null;
        Course course16 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student15, course16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseList7);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertNotNull(courseList11);
        org.junit.Assert.assertNotNull(courseList13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        int int7 = studentManager0.getTotalStudents();
        int int8 = studentManager0.getTotalStudents();
        Student student9 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        Student student7 = null;
        Course course8 = null;
        studentManager0.registerCourse(student7, course8);
        int int10 = studentManager0.getTotalStudents();
        int int11 = studentManager0.getTotalStudents();
        Student student12 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        int int2 = studentManager0.getTotalStudents();
        Student student3 = null;
        studentManager0.addStudent(student3);
        int int5 = studentManager0.getTotalStudents();
        Student student6 = null;
        Course course7 = null;
        studentManager0.registerCourse(student6, course7);
        int int9 = studentManager0.getTotalStudents();
        int int10 = studentManager0.getTotalStudents();
        java.lang.Class<?> wildcardClass11 = studentManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        Student student7 = null;
        java.util.List<Course> courseList8 = studentManager0.getCourses(student7);
        Student student9 = null;
        java.util.List<Course> courseList10 = studentManager0.getCourses(student9);
        int int11 = studentManager0.getTotalStudents();
        java.lang.Class<?> wildcardClass12 = studentManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertNotNull(courseList8);
        org.junit.Assert.assertNotNull(courseList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        int int2 = studentManager0.getTotalStudents();
        Student student3 = null;
        studentManager0.addStudent(student3);
        int int5 = studentManager0.getTotalStudents();
        Student student6 = null;
        Course course7 = null;
        studentManager0.registerCourse(student6, course7);
        Student student9 = null;
        Course course10 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student9, course10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        int int7 = studentManager0.getTotalStudents();
        int int8 = studentManager0.getTotalStudents();
        int int9 = studentManager0.getTotalStudents();
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        int int12 = studentManager0.getTotalStudents();
        Student student13 = null;
        java.util.List<Course> courseList14 = studentManager0.getCourses(student13);
        Student student15 = null;
        java.util.List<Course> courseList16 = studentManager0.getCourses(student15);
        java.lang.Class<?> wildcardClass17 = courseList16.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(courseList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(courseList14);
        org.junit.Assert.assertNotNull(courseList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        Student student7 = null;
        java.util.List<Course> courseList8 = studentManager0.getCourses(student7);
        int int9 = studentManager0.getTotalStudents();
        java.lang.Class<?> wildcardClass10 = studentManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertNotNull(courseList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        int int7 = studentManager0.getTotalStudents();
        Student student8 = null;
        Course course9 = null;
        studentManager0.registerCourse(student8, course9);
        Student student11 = null;
        java.util.List<Course> courseList12 = studentManager0.getCourses(student11);
        Student student13 = null;
        java.util.List<Course> courseList14 = studentManager0.getCourses(student13);
        java.lang.Class<?> wildcardClass15 = courseList14.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(courseList12);
        org.junit.Assert.assertNotNull(courseList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        Student student7 = null;
        Course course8 = null;
        studentManager0.registerCourse(student7, course8);
        Student student10 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList6);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        Course course4 = null;
        studentManager0.registerCourse(student3, course4);
        Student student6 = null;
        java.util.List<Course> courseList7 = studentManager0.getCourses(student6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        Student student12 = null;
        java.util.List<Course> courseList13 = studentManager0.getCourses(student12);
        java.lang.Class<?> wildcardClass14 = courseList13.getClass();
        org.junit.Assert.assertNotNull(courseList7);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertNotNull(courseList11);
        org.junit.Assert.assertNotNull(courseList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        int int7 = studentManager0.getTotalStudents();
        Student student8 = null;
        Course course9 = null;
        studentManager0.registerCourse(student8, course9);
        Student student11 = null;
        java.util.List<Course> courseList12 = studentManager0.getCourses(student11);
        Student student13 = null;
        java.util.List<Course> courseList14 = studentManager0.getCourses(student13);
        int int15 = studentManager0.getTotalStudents();
        Student student16 = null;
        java.util.List<Course> courseList17 = studentManager0.getCourses(student16);
        int int18 = studentManager0.getTotalStudents();
        java.lang.Class<?> wildcardClass19 = studentManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(courseList12);
        org.junit.Assert.assertNotNull(courseList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(courseList17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        int int7 = studentManager0.getTotalStudents();
        int int8 = studentManager0.getTotalStudents();
        int int9 = studentManager0.getTotalStudents();
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        Student student12 = null;
        Course course13 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student12, course13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(courseList11);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        Student student7 = null;
        java.util.List<Course> courseList8 = studentManager0.getCourses(student7);
        int int9 = studentManager0.getTotalStudents();
        int int10 = studentManager0.getTotalStudents();
        Student student11 = null;
        java.util.List<Course> courseList12 = studentManager0.getCourses(student11);
        int int13 = studentManager0.getTotalStudents();
        Student student14 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(courseList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(courseList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        int int7 = studentManager0.getTotalStudents();
        int int8 = studentManager0.getTotalStudents();
        int int9 = studentManager0.getTotalStudents();
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        int int12 = studentManager0.getTotalStudents();
        int int13 = studentManager0.getTotalStudents();
        int int14 = studentManager0.getTotalStudents();
        int int15 = studentManager0.getTotalStudents();
        int int16 = studentManager0.getTotalStudents();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(courseList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        int int7 = studentManager0.getTotalStudents();
        Student student8 = null;
        Course course9 = null;
        studentManager0.registerCourse(student8, course9);
        Student student11 = null;
        java.util.List<Course> courseList12 = studentManager0.getCourses(student11);
        Student student13 = null;
        java.util.List<Course> courseList14 = studentManager0.getCourses(student13);
        int int15 = studentManager0.getTotalStudents();
        Student student16 = null;
        java.util.List<Course> courseList17 = studentManager0.getCourses(student16);
        int int18 = studentManager0.getTotalStudents();
        Student student19 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(courseList12);
        org.junit.Assert.assertNotNull(courseList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(courseList17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        int int7 = studentManager0.getTotalStudents();
        int int8 = studentManager0.getTotalStudents();
        Student student9 = null;
        Course course10 = null;
        studentManager0.registerCourse(student9, course10);
        Student student12 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        int int7 = studentManager0.getTotalStudents();
        int int8 = studentManager0.getTotalStudents();
        Student student9 = null;
        java.util.List<Course> courseList10 = studentManager0.getCourses(student9);
        Student student11 = null;
        java.util.List<Course> courseList12 = studentManager0.getCourses(student11);
        java.lang.Class<?> wildcardClass13 = courseList12.getClass();
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(courseList10);
        org.junit.Assert.assertNotNull(courseList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        Student student7 = null;
        java.util.List<Course> courseList8 = studentManager0.getCourses(student7);
        int int9 = studentManager0.getTotalStudents();
        int int10 = studentManager0.getTotalStudents();
        Student student11 = null;
        java.util.List<Course> courseList12 = studentManager0.getCourses(student11);
        int int13 = studentManager0.getTotalStudents();
        Student student14 = null;
        java.util.List<Course> courseList15 = studentManager0.getCourses(student14);
        int int16 = studentManager0.getTotalStudents();
        Student student17 = null;
        java.util.List<Course> courseList18 = studentManager0.getCourses(student17);
        Student student19 = null;
        java.util.List<Course> courseList20 = studentManager0.getCourses(student19);
        Student student21 = null;
        Course course22 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student21, course22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(courseList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(courseList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(courseList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(courseList18);
        org.junit.Assert.assertNotNull(courseList20);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        Student student7 = null;
        Course course8 = null;
        studentManager0.registerCourse(student7, course8);
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        int int12 = studentManager0.getTotalStudents();
        java.lang.Class<?> wildcardClass13 = studentManager0.getClass();
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertNotNull(courseList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        int int7 = studentManager0.getTotalStudents();
        int int8 = studentManager0.getTotalStudents();
        Student student9 = null;
        java.util.List<Course> courseList10 = studentManager0.getCourses(student9);
        Student student11 = null;
        java.util.List<Course> courseList12 = studentManager0.getCourses(student11);
        Student student13 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(courseList10);
        org.junit.Assert.assertNotNull(courseList12);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        Course course6 = null;
        studentManager0.registerCourse(student5, course6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        int int10 = studentManager0.getTotalStudents();
        Student student11 = null;
        java.util.List<Course> courseList12 = studentManager0.getCourses(student11);
        int int13 = studentManager0.getTotalStudents();
        Student student14 = null;
        java.util.List<Course> courseList15 = studentManager0.getCourses(student14);
        Student student16 = null;
        java.util.List<Course> courseList17 = studentManager0.getCourses(student16);
        java.lang.Class<?> wildcardClass18 = courseList17.getClass();
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(courseList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(courseList15);
        org.junit.Assert.assertNotNull(courseList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        int int7 = studentManager0.getTotalStudents();
        int int8 = studentManager0.getTotalStudents();
        Student student9 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        Course course4 = null;
        studentManager0.registerCourse(student3, course4);
        Student student6 = null;
        java.util.List<Course> courseList7 = studentManager0.getCourses(student6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        int int10 = studentManager0.getTotalStudents();
        int int11 = studentManager0.getTotalStudents();
        int int12 = studentManager0.getTotalStudents();
        Student student13 = null;
        Course course14 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student13, course14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseList7);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        int int2 = studentManager0.getTotalStudents();
        Student student3 = null;
        studentManager0.addStudent(student3);
        int int5 = studentManager0.getTotalStudents();
        Student student6 = null;
        Course course7 = null;
        studentManager0.registerCourse(student6, course7);
        int int9 = studentManager0.getTotalStudents();
        int int10 = studentManager0.getTotalStudents();
        Student student11 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        int int7 = studentManager0.getTotalStudents();
        java.lang.Class<?> wildcardClass8 = studentManager0.getClass();
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        Course course6 = null;
        studentManager0.registerCourse(student5, course6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        int int12 = studentManager0.getTotalStudents();
        Student student13 = null;
        java.util.List<Course> courseList14 = studentManager0.getCourses(student13);
        java.lang.Class<?> wildcardClass15 = courseList14.getClass();
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertNotNull(courseList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(courseList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        Course course6 = null;
        studentManager0.registerCourse(student5, course6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        int int10 = studentManager0.getTotalStudents();
        Student student11 = null;
        java.util.List<Course> courseList12 = studentManager0.getCourses(student11);
        int int13 = studentManager0.getTotalStudents();
        int int14 = studentManager0.getTotalStudents();
        Student student15 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(courseList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        Student student7 = null;
        java.util.List<Course> courseList8 = studentManager0.getCourses(student7);
        Student student9 = null;
        java.util.List<Course> courseList10 = studentManager0.getCourses(student9);
        Student student11 = null;
        java.util.List<Course> courseList12 = studentManager0.getCourses(student11);
        Student student13 = null;
        Course course14 = null;
        studentManager0.registerCourse(student13, course14);
        Student student16 = null;
        Course course17 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student16, course17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertNotNull(courseList8);
        org.junit.Assert.assertNotNull(courseList10);
        org.junit.Assert.assertNotNull(courseList12);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        Student student7 = null;
        Course course8 = null;
        studentManager0.registerCourse(student7, course8);
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        Student student12 = null;
        java.util.List<Course> courseList13 = studentManager0.getCourses(student12);
        java.lang.Class<?> wildcardClass14 = courseList13.getClass();
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertNotNull(courseList11);
        org.junit.Assert.assertNotNull(courseList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        Student student7 = null;
        Course course8 = null;
        studentManager0.registerCourse(student7, course8);
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        Student student12 = null;
        java.util.List<Course> courseList13 = studentManager0.getCourses(student12);
        java.lang.Class<?> wildcardClass14 = studentManager0.getClass();
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertNotNull(courseList11);
        org.junit.Assert.assertNotNull(courseList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        int int7 = studentManager0.getTotalStudents();
        int int8 = studentManager0.getTotalStudents();
        Student student9 = null;
        java.util.List<Course> courseList10 = studentManager0.getCourses(student9);
        Student student11 = null;
        java.util.List<Course> courseList12 = studentManager0.getCourses(student11);
        Student student13 = null;
        java.util.List<Course> courseList14 = studentManager0.getCourses(student13);
        Student student15 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(courseList10);
        org.junit.Assert.assertNotNull(courseList12);
        org.junit.Assert.assertNotNull(courseList14);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        Student student7 = null;
        Course course8 = null;
        studentManager0.registerCourse(student7, course8);
        int int10 = studentManager0.getTotalStudents();
        Student student11 = null;
        java.util.List<Course> courseList12 = studentManager0.getCourses(student11);
        Student student13 = null;
        Course course14 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student13, course14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(courseList12);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        int int5 = studentManager0.getTotalStudents();
        Student student6 = null;
        java.util.List<Course> courseList7 = studentManager0.getCourses(student6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        Student student10 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(courseList7);
        org.junit.Assert.assertNotNull(courseList9);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        Course course4 = null;
        studentManager0.registerCourse(student3, course4);
        Student student6 = null;
        java.util.List<Course> courseList7 = studentManager0.getCourses(student6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        Student student12 = null;
        java.util.List<Course> courseList13 = studentManager0.getCourses(student12);
        int int14 = studentManager0.getTotalStudents();
        Student student15 = null;
        java.util.List<Course> courseList16 = studentManager0.getCourses(student15);
        Student student17 = null;
        java.util.List<Course> courseList18 = studentManager0.getCourses(student17);
        Student student19 = null;
        Course course20 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student19, course20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseList7);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertNotNull(courseList11);
        org.junit.Assert.assertNotNull(courseList13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(courseList16);
        org.junit.Assert.assertNotNull(courseList18);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        int int7 = studentManager0.getTotalStudents();
        Student student8 = null;
        Course course9 = null;
        studentManager0.registerCourse(student8, course9);
        Student student11 = null;
        java.util.List<Course> courseList12 = studentManager0.getCourses(student11);
        java.lang.Class<?> wildcardClass13 = courseList12.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(courseList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        java.util.List<Course> courseList5 = studentManager0.getCourses(student4);
        int int6 = studentManager0.getTotalStudents();
        int int7 = studentManager0.getTotalStudents();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(courseList5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        int int7 = studentManager0.getTotalStudents();
        int int8 = studentManager0.getTotalStudents();
        Student student9 = null;
        java.util.List<Course> courseList10 = studentManager0.getCourses(student9);
        Student student11 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(courseList10);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        int int7 = studentManager0.getTotalStudents();
        int int8 = studentManager0.getTotalStudents();
        Student student9 = null;
        java.util.List<Course> courseList10 = studentManager0.getCourses(student9);
        Student student11 = null;
        java.util.List<Course> courseList12 = studentManager0.getCourses(student11);
        Student student13 = null;
        Course course14 = null;
        studentManager0.registerCourse(student13, course14);
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(courseList10);
        org.junit.Assert.assertNotNull(courseList12);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        Student student7 = null;
        java.util.List<Course> courseList8 = studentManager0.getCourses(student7);
        Student student9 = null;
        java.util.List<Course> courseList10 = studentManager0.getCourses(student9);
        int int11 = studentManager0.getTotalStudents();
        Student student12 = null;
        Course course13 = null;
        studentManager0.registerCourse(student12, course13);
        Student student15 = null;
        Course course16 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student15, course16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertNotNull(courseList8);
        org.junit.Assert.assertNotNull(courseList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        int int7 = studentManager0.getTotalStudents();
        int int8 = studentManager0.getTotalStudents();
        java.lang.Class<?> wildcardClass9 = studentManager0.getClass();
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        Course course4 = null;
        studentManager0.registerCourse(student3, course4);
        Student student6 = null;
        java.util.List<Course> courseList7 = studentManager0.getCourses(student6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        Student student12 = null;
        java.util.List<Course> courseList13 = studentManager0.getCourses(student12);
        Student student14 = null;
        java.util.List<Course> courseList15 = studentManager0.getCourses(student14);
        Student student16 = null;
        java.util.List<Course> courseList17 = studentManager0.getCourses(student16);
        java.lang.Class<?> wildcardClass18 = courseList17.getClass();
        org.junit.Assert.assertNotNull(courseList7);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertNotNull(courseList11);
        org.junit.Assert.assertNotNull(courseList13);
        org.junit.Assert.assertNotNull(courseList15);
        org.junit.Assert.assertNotNull(courseList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        int int7 = studentManager0.getTotalStudents();
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        Student student12 = null;
        java.util.List<Course> courseList13 = studentManager0.getCourses(student12);
        int int14 = studentManager0.getTotalStudents();
        Student student15 = null;
        Course course16 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student15, course16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertNotNull(courseList11);
        org.junit.Assert.assertNotNull(courseList13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        Course course6 = null;
        studentManager0.registerCourse(student5, course6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        int int10 = studentManager0.getTotalStudents();
        Student student11 = null;
        java.util.List<Course> courseList12 = studentManager0.getCourses(student11);
        Student student13 = null;
        java.util.List<Course> courseList14 = studentManager0.getCourses(student13);
        java.lang.Class<?> wildcardClass15 = studentManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(courseList12);
        org.junit.Assert.assertNotNull(courseList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        Course course6 = null;
        studentManager0.registerCourse(student5, course6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        int int10 = studentManager0.getTotalStudents();
        java.lang.Class<?> wildcardClass11 = studentManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        Student student7 = null;
        java.util.List<Course> courseList8 = studentManager0.getCourses(student7);
        int int9 = studentManager0.getTotalStudents();
        int int10 = studentManager0.getTotalStudents();
        Student student11 = null;
        java.util.List<Course> courseList12 = studentManager0.getCourses(student11);
        int int13 = studentManager0.getTotalStudents();
        Student student14 = null;
        java.util.List<Course> courseList15 = studentManager0.getCourses(student14);
        int int16 = studentManager0.getTotalStudents();
        Student student17 = null;
        java.util.List<Course> courseList18 = studentManager0.getCourses(student17);
        java.lang.Class<?> wildcardClass19 = courseList18.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(courseList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(courseList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(courseList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(courseList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        int int7 = studentManager0.getTotalStudents();
        Student student8 = null;
        Course course9 = null;
        studentManager0.registerCourse(student8, course9);
        Student student11 = null;
        Course course12 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student11, course12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        int int7 = studentManager0.getTotalStudents();
        int int8 = studentManager0.getTotalStudents();
        Student student9 = null;
        Course course10 = null;
        studentManager0.registerCourse(student9, course10);
        Student student12 = null;
        Course course13 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student12, course13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        Course course6 = null;
        studentManager0.registerCourse(student5, course6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        int int10 = studentManager0.getTotalStudents();
        Student student11 = null;
        java.util.List<Course> courseList12 = studentManager0.getCourses(student11);
        int int13 = studentManager0.getTotalStudents();
        Student student14 = null;
        java.util.List<Course> courseList15 = studentManager0.getCourses(student14);
        Student student16 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(courseList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(courseList15);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        Course course6 = null;
        studentManager0.registerCourse(student5, course6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        int int12 = studentManager0.getTotalStudents();
        int int13 = studentManager0.getTotalStudents();
        Student student14 = null;
        Course course15 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student14, course15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertNotNull(courseList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        int int5 = studentManager0.getTotalStudents();
        Student student6 = null;
        java.util.List<Course> courseList7 = studentManager0.getCourses(student6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        Student student12 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(courseList7);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertNotNull(courseList11);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        int int7 = studentManager0.getTotalStudents();
        int int8 = studentManager0.getTotalStudents();
        Student student9 = null;
        java.util.List<Course> courseList10 = studentManager0.getCourses(student9);
        Student student11 = null;
        java.util.List<Course> courseList12 = studentManager0.getCourses(student11);
        Student student13 = null;
        java.util.List<Course> courseList14 = studentManager0.getCourses(student13);
        int int15 = studentManager0.getTotalStudents();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(courseList10);
        org.junit.Assert.assertNotNull(courseList12);
        org.junit.Assert.assertNotNull(courseList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        Student student7 = null;
        Course course8 = null;
        studentManager0.registerCourse(student7, course8);
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        int int12 = studentManager0.getTotalStudents();
        int int13 = studentManager0.getTotalStudents();
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertNotNull(courseList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        Course course6 = null;
        studentManager0.registerCourse(student5, course6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        Student student12 = null;
        Course course13 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student12, course13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertNotNull(courseList11);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        Student student7 = null;
        java.util.List<Course> courseList8 = studentManager0.getCourses(student7);
        Student student9 = null;
        Course course10 = null;
        studentManager0.registerCourse(student9, course10);
        int int12 = studentManager0.getTotalStudents();
        Student student13 = null;
        Course course14 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student13, course14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertNotNull(courseList8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        Course course6 = null;
        studentManager0.registerCourse(student5, course6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        int int10 = studentManager0.getTotalStudents();
        int int11 = studentManager0.getTotalStudents();
        Student student12 = null;
        java.util.List<Course> courseList13 = studentManager0.getCourses(student12);
        Student student14 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(courseList13);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        Student student7 = null;
        java.util.List<Course> courseList8 = studentManager0.getCourses(student7);
        int int9 = studentManager0.getTotalStudents();
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        Student student12 = null;
        java.util.List<Course> courseList13 = studentManager0.getCourses(student12);
        java.lang.Class<?> wildcardClass14 = courseList13.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(courseList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(courseList11);
        org.junit.Assert.assertNotNull(courseList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        Course course4 = null;
        studentManager0.registerCourse(student3, course4);
        Student student6 = null;
        java.util.List<Course> courseList7 = studentManager0.getCourses(student6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        int int10 = studentManager0.getTotalStudents();
        int int11 = studentManager0.getTotalStudents();
        Student student12 = null;
        java.util.List<Course> courseList13 = studentManager0.getCourses(student12);
        Student student14 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseList7);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(courseList13);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        int int7 = studentManager0.getTotalStudents();
        Student student8 = null;
        Course course9 = null;
        studentManager0.registerCourse(student8, course9);
        Student student11 = null;
        java.util.List<Course> courseList12 = studentManager0.getCourses(student11);
        Student student13 = null;
        java.util.List<Course> courseList14 = studentManager0.getCourses(student13);
        int int15 = studentManager0.getTotalStudents();
        Student student16 = null;
        java.util.List<Course> courseList17 = studentManager0.getCourses(student16);
        int int18 = studentManager0.getTotalStudents();
        Student student19 = null;
        java.util.List<Course> courseList20 = studentManager0.getCourses(student19);
        java.lang.Class<?> wildcardClass21 = courseList20.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(courseList12);
        org.junit.Assert.assertNotNull(courseList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(courseList17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(courseList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        Course course4 = null;
        studentManager0.registerCourse(student3, course4);
        Student student6 = null;
        java.util.List<Course> courseList7 = studentManager0.getCourses(student6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        Student student12 = null;
        java.util.List<Course> courseList13 = studentManager0.getCourses(student12);
        int int14 = studentManager0.getTotalStudents();
        Student student15 = null;
        java.util.List<Course> courseList16 = studentManager0.getCourses(student15);
        int int17 = studentManager0.getTotalStudents();
        org.junit.Assert.assertNotNull(courseList7);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertNotNull(courseList11);
        org.junit.Assert.assertNotNull(courseList13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(courseList16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        int int7 = studentManager0.getTotalStudents();
        Student student8 = null;
        Course course9 = null;
        studentManager0.registerCourse(student8, course9);
        Student student11 = null;
        java.util.List<Course> courseList12 = studentManager0.getCourses(student11);
        Student student13 = null;
        java.util.List<Course> courseList14 = studentManager0.getCourses(student13);
        int int15 = studentManager0.getTotalStudents();
        Student student16 = null;
        java.util.List<Course> courseList17 = studentManager0.getCourses(student16);
        Student student18 = null;
        java.util.List<Course> courseList19 = studentManager0.getCourses(student18);
        Student student20 = null;
        Course course21 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student20, course21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(courseList12);
        org.junit.Assert.assertNotNull(courseList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(courseList17);
        org.junit.Assert.assertNotNull(courseList19);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        Course course4 = null;
        studentManager0.registerCourse(student3, course4);
        Student student6 = null;
        java.util.List<Course> courseList7 = studentManager0.getCourses(student6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        int int10 = studentManager0.getTotalStudents();
        int int11 = studentManager0.getTotalStudents();
        int int12 = studentManager0.getTotalStudents();
        Student student13 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseList7);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        Student student7 = null;
        java.util.List<Course> courseList8 = studentManager0.getCourses(student7);
        int int9 = studentManager0.getTotalStudents();
        int int10 = studentManager0.getTotalStudents();
        Student student11 = null;
        java.util.List<Course> courseList12 = studentManager0.getCourses(student11);
        int int13 = studentManager0.getTotalStudents();
        java.lang.Class<?> wildcardClass14 = studentManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(courseList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(courseList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        int int7 = studentManager0.getTotalStudents();
        int int8 = studentManager0.getTotalStudents();
        Student student9 = null;
        Course course10 = null;
        studentManager0.registerCourse(student9, course10);
        Student student12 = null;
        Course course13 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student12, course13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        int int2 = studentManager0.getTotalStudents();
        Student student3 = null;
        studentManager0.addStudent(student3);
        int int5 = studentManager0.getTotalStudents();
        Student student6 = null;
        Course course7 = null;
        studentManager0.registerCourse(student6, course7);
        int int9 = studentManager0.getTotalStudents();
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        Student student12 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(courseList11);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        Course course6 = null;
        studentManager0.registerCourse(student5, course6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        int int10 = studentManager0.getTotalStudents();
        Student student11 = null;
        java.util.List<Course> courseList12 = studentManager0.getCourses(student11);
        int int13 = studentManager0.getTotalStudents();
        Student student14 = null;
        java.util.List<Course> courseList15 = studentManager0.getCourses(student14);
        Student student16 = null;
        java.util.List<Course> courseList17 = studentManager0.getCourses(student16);
        Student student18 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(courseList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(courseList15);
        org.junit.Assert.assertNotNull(courseList17);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        Course course6 = null;
        studentManager0.registerCourse(student5, course6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        int int12 = studentManager0.getTotalStudents();
        Student student13 = null;
        java.util.List<Course> courseList14 = studentManager0.getCourses(student13);
        int int15 = studentManager0.getTotalStudents();
        Student student16 = null;
        java.util.List<Course> courseList17 = studentManager0.getCourses(student16);
        Student student18 = null;
        java.util.List<Course> courseList19 = studentManager0.getCourses(student18);
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertNotNull(courseList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(courseList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(courseList17);
        org.junit.Assert.assertNotNull(courseList19);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        int int2 = studentManager0.getTotalStudents();
        Student student3 = null;
        studentManager0.addStudent(student3);
        Student student5 = null;
        Course course6 = null;
        studentManager0.registerCourse(student5, course6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        Student student10 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(courseList9);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        int int7 = studentManager0.getTotalStudents();
        Student student8 = null;
        Course course9 = null;
        studentManager0.registerCourse(student8, course9);
        Student student11 = null;
        java.util.List<Course> courseList12 = studentManager0.getCourses(student11);
        Student student13 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(courseList12);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        int int7 = studentManager0.getTotalStudents();
        int int8 = studentManager0.getTotalStudents();
        Student student9 = null;
        java.util.List<Course> courseList10 = studentManager0.getCourses(student9);
        int int11 = studentManager0.getTotalStudents();
        int int12 = studentManager0.getTotalStudents();
        java.lang.Class<?> wildcardClass13 = studentManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(courseList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        Student student7 = null;
        java.util.List<Course> courseList8 = studentManager0.getCourses(student7);
        Student student9 = null;
        Course course10 = null;
        studentManager0.registerCourse(student9, course10);
        Student student12 = null;
        Course course13 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student12, course13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertNotNull(courseList8);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        Course course4 = null;
        studentManager0.registerCourse(student3, course4);
        int int6 = studentManager0.getTotalStudents();
        Student student7 = null;
        java.util.List<Course> courseList8 = studentManager0.getCourses(student7);
        java.lang.Class<?> wildcardClass9 = studentManager0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(courseList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        int int2 = studentManager0.getTotalStudents();
        Student student3 = null;
        studentManager0.addStudent(student3);
        int int5 = studentManager0.getTotalStudents();
        Student student6 = null;
        java.util.List<Course> courseList7 = studentManager0.getCourses(student6);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(courseList7);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        Course course6 = null;
        studentManager0.registerCourse(student5, course6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        int int10 = studentManager0.getTotalStudents();
        int int11 = studentManager0.getTotalStudents();
        Student student12 = null;
        java.util.List<Course> courseList13 = studentManager0.getCourses(student12);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(courseList13);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        Student student7 = null;
        java.util.List<Course> courseList8 = studentManager0.getCourses(student7);
        Student student9 = null;
        java.util.List<Course> courseList10 = studentManager0.getCourses(student9);
        Student student11 = null;
        Course course12 = null;
        studentManager0.registerCourse(student11, course12);
        Student student14 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertNotNull(courseList8);
        org.junit.Assert.assertNotNull(courseList10);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        Student student7 = null;
        java.util.List<Course> courseList8 = studentManager0.getCourses(student7);
        Student student9 = null;
        java.util.List<Course> courseList10 = studentManager0.getCourses(student9);
        Student student11 = null;
        java.util.List<Course> courseList12 = studentManager0.getCourses(student11);
        Student student13 = null;
        Course course14 = null;
        studentManager0.registerCourse(student13, course14);
        Student student16 = null;
        java.util.List<Course> courseList17 = studentManager0.getCourses(student16);
        java.lang.Class<?> wildcardClass18 = studentManager0.getClass();
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertNotNull(courseList8);
        org.junit.Assert.assertNotNull(courseList10);
        org.junit.Assert.assertNotNull(courseList12);
        org.junit.Assert.assertNotNull(courseList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        int int7 = studentManager0.getTotalStudents();
        int int8 = studentManager0.getTotalStudents();
        int int9 = studentManager0.getTotalStudents();
        java.lang.Class<?> wildcardClass10 = studentManager0.getClass();
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        Student student7 = null;
        Course course8 = null;
        studentManager0.registerCourse(student7, course8);
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        Student student12 = null;
        Course course13 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student12, course13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertNotNull(courseList11);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        Course course4 = null;
        studentManager0.registerCourse(student3, course4);
        int int6 = studentManager0.getTotalStudents();
        Student student7 = null;
        java.util.List<Course> courseList8 = studentManager0.getCourses(student7);
        int int9 = studentManager0.getTotalStudents();
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        Student student12 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(courseList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(courseList11);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        Course course4 = null;
        studentManager0.registerCourse(student3, course4);
        int int6 = studentManager0.getTotalStudents();
        Student student7 = null;
        java.util.List<Course> courseList8 = studentManager0.getCourses(student7);
        Student student9 = null;
        Course course10 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student9, course10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(courseList8);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        Course course6 = null;
        studentManager0.registerCourse(student5, course6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        int int10 = studentManager0.getTotalStudents();
        int int11 = studentManager0.getTotalStudents();
        java.lang.Class<?> wildcardClass12 = studentManager0.getClass();
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        int int7 = studentManager0.getTotalStudents();
        int int8 = studentManager0.getTotalStudents();
        int int9 = studentManager0.getTotalStudents();
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        int int12 = studentManager0.getTotalStudents();
        Student student13 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(courseList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        Student student7 = null;
        java.util.List<Course> courseList8 = studentManager0.getCourses(student7);
        int int9 = studentManager0.getTotalStudents();
        int int10 = studentManager0.getTotalStudents();
        Student student11 = null;
        java.util.List<Course> courseList12 = studentManager0.getCourses(student11);
        int int13 = studentManager0.getTotalStudents();
        Student student14 = null;
        java.util.List<Course> courseList15 = studentManager0.getCourses(student14);
        int int16 = studentManager0.getTotalStudents();
        Student student17 = null;
        java.util.List<Course> courseList18 = studentManager0.getCourses(student17);
        Student student19 = null;
        java.util.List<Course> courseList20 = studentManager0.getCourses(student19);
        java.lang.Class<?> wildcardClass21 = studentManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(courseList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(courseList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(courseList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(courseList18);
        org.junit.Assert.assertNotNull(courseList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        Course course4 = null;
        studentManager0.registerCourse(student3, course4);
        int int6 = studentManager0.getTotalStudents();
        Student student7 = null;
        java.util.List<Course> courseList8 = studentManager0.getCourses(student7);
        Student student9 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(courseList8);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        int int7 = studentManager0.getTotalStudents();
        int int8 = studentManager0.getTotalStudents();
        Student student9 = null;
        java.util.List<Course> courseList10 = studentManager0.getCourses(student9);
        java.lang.Class<?> wildcardClass11 = courseList10.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(courseList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        int int7 = studentManager0.getTotalStudents();
        int int8 = studentManager0.getTotalStudents();
        int int9 = studentManager0.getTotalStudents();
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        int int12 = studentManager0.getTotalStudents();
        int int13 = studentManager0.getTotalStudents();
        int int14 = studentManager0.getTotalStudents();
        Student student15 = null;
        Course course16 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student15, course16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(courseList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        Student student7 = null;
        java.util.List<Course> courseList8 = studentManager0.getCourses(student7);
        Student student9 = null;
        Course course10 = null;
        studentManager0.registerCourse(student9, course10);
        Student student12 = null;
        java.util.List<Course> courseList13 = studentManager0.getCourses(student12);
        Student student14 = null;
        Course course15 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student14, course15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertNotNull(courseList8);
        org.junit.Assert.assertNotNull(courseList13);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        int int7 = studentManager0.getTotalStudents();
        int int8 = studentManager0.getTotalStudents();
        Student student9 = null;
        java.util.List<Course> courseList10 = studentManager0.getCourses(student9);
        Student student11 = null;
        java.util.List<Course> courseList12 = studentManager0.getCourses(student11);
        java.lang.Class<?> wildcardClass13 = studentManager0.getClass();
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(courseList10);
        org.junit.Assert.assertNotNull(courseList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        Student student7 = null;
        Course course8 = null;
        studentManager0.registerCourse(student7, course8);
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        Student student12 = null;
        java.util.List<Course> courseList13 = studentManager0.getCourses(student12);
        Student student14 = null;
        java.util.List<Course> courseList15 = studentManager0.getCourses(student14);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertNotNull(courseList11);
        org.junit.Assert.assertNotNull(courseList13);
        org.junit.Assert.assertNotNull(courseList15);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        Course course6 = null;
        studentManager0.registerCourse(student5, course6);
        int int8 = studentManager0.getTotalStudents();
        Student student9 = null;
        java.util.List<Course> courseList10 = studentManager0.getCourses(student9);
        java.lang.Class<?> wildcardClass11 = courseList10.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(courseList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        int int2 = studentManager0.getTotalStudents();
        Student student3 = null;
        studentManager0.addStudent(student3);
        int int5 = studentManager0.getTotalStudents();
        Student student6 = null;
        Course course7 = null;
        studentManager0.registerCourse(student6, course7);
        int int9 = studentManager0.getTotalStudents();
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        java.lang.Class<?> wildcardClass12 = courseList11.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(courseList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        Course course6 = null;
        studentManager0.registerCourse(student5, course6);
        int int8 = studentManager0.getTotalStudents();
        Student student9 = null;
        java.util.List<Course> courseList10 = studentManager0.getCourses(student9);
        int int11 = studentManager0.getTotalStudents();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(courseList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        int int7 = studentManager0.getTotalStudents();
        int int8 = studentManager0.getTotalStudents();
        int int9 = studentManager0.getTotalStudents();
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        int int12 = studentManager0.getTotalStudents();
        Student student13 = null;
        java.util.List<Course> courseList14 = studentManager0.getCourses(student13);
        int int15 = studentManager0.getTotalStudents();
        Student student16 = null;
        Course course17 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student16, course17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(courseList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(courseList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        int int7 = studentManager0.getTotalStudents();
        int int8 = studentManager0.getTotalStudents();
        int int9 = studentManager0.getTotalStudents();
        int int10 = studentManager0.getTotalStudents();
        Student student11 = null;
        java.util.List<Course> courseList12 = studentManager0.getCourses(student11);
        Student student13 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(courseList12);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        Student student7 = null;
        java.util.List<Course> courseList8 = studentManager0.getCourses(student7);
        Student student9 = null;
        Course course10 = null;
        studentManager0.registerCourse(student9, course10);
        int int12 = studentManager0.getTotalStudents();
        java.lang.Class<?> wildcardClass13 = studentManager0.getClass();
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertNotNull(courseList8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        int int7 = studentManager0.getTotalStudents();
        int int8 = studentManager0.getTotalStudents();
        Student student9 = null;
        java.util.List<Course> courseList10 = studentManager0.getCourses(student9);
        int int11 = studentManager0.getTotalStudents();
        int int12 = studentManager0.getTotalStudents();
        Student student13 = null;
        Course course14 = null;
        studentManager0.registerCourse(student13, course14);
        java.lang.Class<?> wildcardClass16 = studentManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(courseList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        Course course6 = null;
        studentManager0.registerCourse(student5, course6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        int int10 = studentManager0.getTotalStudents();
        Student student11 = null;
        java.util.List<Course> courseList12 = studentManager0.getCourses(student11);
        int int13 = studentManager0.getTotalStudents();
        Student student14 = null;
        java.util.List<Course> courseList15 = studentManager0.getCourses(student14);
        Student student16 = null;
        java.util.List<Course> courseList17 = studentManager0.getCourses(student16);
        Student student18 = null;
        Course course19 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student18, course19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(courseList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(courseList15);
        org.junit.Assert.assertNotNull(courseList17);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        int int2 = studentManager0.getTotalStudents();
        Student student3 = null;
        studentManager0.addStudent(student3);
        Student student5 = null;
        Course course6 = null;
        studentManager0.registerCourse(student5, course6);
        java.lang.Class<?> wildcardClass8 = studentManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        int int7 = studentManager0.getTotalStudents();
        int int8 = studentManager0.getTotalStudents();
        Student student9 = null;
        java.util.List<Course> courseList10 = studentManager0.getCourses(student9);
        int int11 = studentManager0.getTotalStudents();
        int int12 = studentManager0.getTotalStudents();
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(courseList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        Course course4 = null;
        studentManager0.registerCourse(student3, course4);
        Student student6 = null;
        java.util.List<Course> courseList7 = studentManager0.getCourses(student6);
        int int8 = studentManager0.getTotalStudents();
        Student student9 = null;
        java.util.List<Course> courseList10 = studentManager0.getCourses(student9);
        Student student11 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(courseList10);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        Student student7 = null;
        java.util.List<Course> courseList8 = studentManager0.getCourses(student7);
        int int9 = studentManager0.getTotalStudents();
        int int10 = studentManager0.getTotalStudents();
        Student student11 = null;
        java.util.List<Course> courseList12 = studentManager0.getCourses(student11);
        int int13 = studentManager0.getTotalStudents();
        Student student14 = null;
        java.util.List<Course> courseList15 = studentManager0.getCourses(student14);
        int int16 = studentManager0.getTotalStudents();
        Student student17 = null;
        Course course18 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student17, course18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(courseList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(courseList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(courseList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        int int7 = studentManager0.getTotalStudents();
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        int int10 = studentManager0.getTotalStudents();
        Student student11 = null;
        java.util.List<Course> courseList12 = studentManager0.getCourses(student11);
        java.lang.Class<?> wildcardClass13 = courseList12.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(courseList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        int int7 = studentManager0.getTotalStudents();
        int int8 = studentManager0.getTotalStudents();
        int int9 = studentManager0.getTotalStudents();
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        int int12 = studentManager0.getTotalStudents();
        Student student13 = null;
        java.util.List<Course> courseList14 = studentManager0.getCourses(student13);
        Student student15 = null;
        java.util.List<Course> courseList16 = studentManager0.getCourses(student15);
        int int17 = studentManager0.getTotalStudents();
        Student student18 = null;
        java.util.List<Course> courseList19 = studentManager0.getCourses(student18);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(courseList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(courseList14);
        org.junit.Assert.assertNotNull(courseList16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(courseList19);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        Course course4 = null;
        studentManager0.registerCourse(student3, course4);
        Student student6 = null;
        java.util.List<Course> courseList7 = studentManager0.getCourses(student6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        Student student12 = null;
        java.util.List<Course> courseList13 = studentManager0.getCourses(student12);
        int int14 = studentManager0.getTotalStudents();
        Student student15 = null;
        java.util.List<Course> courseList16 = studentManager0.getCourses(student15);
        java.lang.Class<?> wildcardClass17 = studentManager0.getClass();
        org.junit.Assert.assertNotNull(courseList7);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertNotNull(courseList11);
        org.junit.Assert.assertNotNull(courseList13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(courseList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        int int7 = studentManager0.getTotalStudents();
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        java.lang.Class<?> wildcardClass10 = courseList9.getClass();
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        int int7 = studentManager0.getTotalStudents();
        int int8 = studentManager0.getTotalStudents();
        Student student9 = null;
        java.util.List<Course> courseList10 = studentManager0.getCourses(student9);
        int int11 = studentManager0.getTotalStudents();
        Student student12 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(courseList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        Course course6 = null;
        studentManager0.registerCourse(student5, course6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        int int10 = studentManager0.getTotalStudents();
        int int11 = studentManager0.getTotalStudents();
        Student student12 = null;
        java.util.List<Course> courseList13 = studentManager0.getCourses(student12);
        int int14 = studentManager0.getTotalStudents();
        Student student15 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(courseList13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        Student student7 = null;
        Course course8 = null;
        studentManager0.registerCourse(student7, course8);
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        Student student12 = null;
        java.util.List<Course> courseList13 = studentManager0.getCourses(student12);
        java.lang.Class<?> wildcardClass14 = courseList13.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertNotNull(courseList11);
        org.junit.Assert.assertNotNull(courseList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        int int7 = studentManager0.getTotalStudents();
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        int int12 = studentManager0.getTotalStudents();
        Student student13 = null;
        java.util.List<Course> courseList14 = studentManager0.getCourses(student13);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertNotNull(courseList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(courseList14);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        int int7 = studentManager0.getTotalStudents();
        int int8 = studentManager0.getTotalStudents();
        int int9 = studentManager0.getTotalStudents();
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        int int12 = studentManager0.getTotalStudents();
        Student student13 = null;
        java.util.List<Course> courseList14 = studentManager0.getCourses(student13);
        int int15 = studentManager0.getTotalStudents();
        int int16 = studentManager0.getTotalStudents();
        Student student17 = null;
        java.util.List<Course> courseList18 = studentManager0.getCourses(student17);
        Student student19 = null;
        java.util.List<Course> courseList20 = studentManager0.getCourses(student19);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(courseList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(courseList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(courseList18);
        org.junit.Assert.assertNotNull(courseList20);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        Course course4 = null;
        studentManager0.registerCourse(student3, course4);
        Student student6 = null;
        java.util.List<Course> courseList7 = studentManager0.getCourses(student6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        int int10 = studentManager0.getTotalStudents();
        Student student11 = null;
        java.util.List<Course> courseList12 = studentManager0.getCourses(student11);
        Student student13 = null;
        java.util.List<Course> courseList14 = studentManager0.getCourses(student13);
        Student student15 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseList7);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(courseList12);
        org.junit.Assert.assertNotNull(courseList14);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        int int7 = studentManager0.getTotalStudents();
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        int int10 = studentManager0.getTotalStudents();
        Student student11 = null;
        java.util.List<Course> courseList12 = studentManager0.getCourses(student11);
        Student student13 = null;
        Course course14 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student13, course14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(courseList12);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        Course course4 = null;
        studentManager0.registerCourse(student3, course4);
        Student student6 = null;
        java.util.List<Course> courseList7 = studentManager0.getCourses(student6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        int int10 = studentManager0.getTotalStudents();
        Student student11 = null;
        java.util.List<Course> courseList12 = studentManager0.getCourses(student11);
        int int13 = studentManager0.getTotalStudents();
        Student student14 = null;
        java.util.List<Course> courseList15 = studentManager0.getCourses(student14);
        org.junit.Assert.assertNotNull(courseList7);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(courseList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(courseList15);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        Student student7 = null;
        Course course8 = null;
        studentManager0.registerCourse(student7, course8);
        int int10 = studentManager0.getTotalStudents();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        int int7 = studentManager0.getTotalStudents();
        int int8 = studentManager0.getTotalStudents();
        int int9 = studentManager0.getTotalStudents();
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        int int12 = studentManager0.getTotalStudents();
        Student student13 = null;
        Course course14 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student13, course14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(courseList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        int int7 = studentManager0.getTotalStudents();
        Student student8 = null;
        Course course9 = null;
        studentManager0.registerCourse(student8, course9);
        Student student11 = null;
        java.util.List<Course> courseList12 = studentManager0.getCourses(student11);
        Student student13 = null;
        java.util.List<Course> courseList14 = studentManager0.getCourses(student13);
        int int15 = studentManager0.getTotalStudents();
        Student student16 = null;
        java.util.List<Course> courseList17 = studentManager0.getCourses(student16);
        int int18 = studentManager0.getTotalStudents();
        int int19 = studentManager0.getTotalStudents();
        java.lang.Class<?> wildcardClass20 = studentManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(courseList12);
        org.junit.Assert.assertNotNull(courseList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(courseList17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        int int7 = studentManager0.getTotalStudents();
        Student student8 = null;
        Course course9 = null;
        studentManager0.registerCourse(student8, course9);
        Student student11 = null;
        java.util.List<Course> courseList12 = studentManager0.getCourses(student11);
        Student student13 = null;
        java.util.List<Course> courseList14 = studentManager0.getCourses(student13);
        int int15 = studentManager0.getTotalStudents();
        Student student16 = null;
        java.util.List<Course> courseList17 = studentManager0.getCourses(student16);
        Student student18 = null;
        java.util.List<Course> courseList19 = studentManager0.getCourses(student18);
        Student student20 = null;
        java.util.List<Course> courseList21 = studentManager0.getCourses(student20);
        java.lang.Class<?> wildcardClass22 = courseList21.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(courseList12);
        org.junit.Assert.assertNotNull(courseList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(courseList17);
        org.junit.Assert.assertNotNull(courseList19);
        org.junit.Assert.assertNotNull(courseList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        Student student7 = null;
        java.util.List<Course> courseList8 = studentManager0.getCourses(student7);
        Student student9 = null;
        Course course10 = null;
        studentManager0.registerCourse(student9, course10);
        Student student12 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertNotNull(courseList8);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        int int7 = studentManager0.getTotalStudents();
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        Student student12 = null;
        java.util.List<Course> courseList13 = studentManager0.getCourses(student12);
        int int14 = studentManager0.getTotalStudents();
        java.lang.Class<?> wildcardClass15 = studentManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertNotNull(courseList11);
        org.junit.Assert.assertNotNull(courseList13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        Student student7 = null;
        java.util.List<Course> courseList8 = studentManager0.getCourses(student7);
        Student student9 = null;
        java.util.List<Course> courseList10 = studentManager0.getCourses(student9);
        int int11 = studentManager0.getTotalStudents();
        Student student12 = null;
        Course course13 = null;
        studentManager0.registerCourse(student12, course13);
        java.lang.Class<?> wildcardClass15 = studentManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertNotNull(courseList8);
        org.junit.Assert.assertNotNull(courseList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        int int7 = studentManager0.getTotalStudents();
        int int8 = studentManager0.getTotalStudents();
        int int9 = studentManager0.getTotalStudents();
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        int int12 = studentManager0.getTotalStudents();
        Student student13 = null;
        java.util.List<Course> courseList14 = studentManager0.getCourses(student13);
        int int15 = studentManager0.getTotalStudents();
        int int16 = studentManager0.getTotalStudents();
        int int17 = studentManager0.getTotalStudents();
        Student student18 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(courseList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(courseList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        Course course6 = null;
        studentManager0.registerCourse(student5, course6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        int int10 = studentManager0.getTotalStudents();
        int int11 = studentManager0.getTotalStudents();
        int int12 = studentManager0.getTotalStudents();
        int int13 = studentManager0.getTotalStudents();
        Student student14 = null;
        java.util.List<Course> courseList15 = studentManager0.getCourses(student14);
        java.lang.Class<?> wildcardClass16 = courseList15.getClass();
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(courseList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        Student student7 = null;
        java.util.List<Course> courseList8 = studentManager0.getCourses(student7);
        int int9 = studentManager0.getTotalStudents();
        int int10 = studentManager0.getTotalStudents();
        Student student11 = null;
        Course course12 = null;
        studentManager0.registerCourse(student11, course12);
        java.lang.Class<?> wildcardClass14 = studentManager0.getClass();
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertNotNull(courseList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        int int7 = studentManager0.getTotalStudents();
        int int8 = studentManager0.getTotalStudents();
        int int9 = studentManager0.getTotalStudents();
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        int int12 = studentManager0.getTotalStudents();
        int int13 = studentManager0.getTotalStudents();
        Student student14 = null;
        java.util.List<Course> courseList15 = studentManager0.getCourses(student14);
        Student student16 = null;
        java.util.List<Course> courseList17 = studentManager0.getCourses(student16);
        int int18 = studentManager0.getTotalStudents();
        int int19 = studentManager0.getTotalStudents();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(courseList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(courseList15);
        org.junit.Assert.assertNotNull(courseList17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        Course course6 = null;
        studentManager0.registerCourse(student5, course6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        int int10 = studentManager0.getTotalStudents();
        Student student11 = null;
        java.util.List<Course> courseList12 = studentManager0.getCourses(student11);
        int int13 = studentManager0.getTotalStudents();
        int int14 = studentManager0.getTotalStudents();
        Student student15 = null;
        java.util.List<Course> courseList16 = studentManager0.getCourses(student15);
        java.lang.Class<?> wildcardClass17 = studentManager0.getClass();
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(courseList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(courseList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        int int2 = studentManager0.getTotalStudents();
        Student student3 = null;
        studentManager0.addStudent(student3);
        Student student5 = null;
        Course course6 = null;
        studentManager0.registerCourse(student5, course6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        java.lang.Class<?> wildcardClass10 = courseList9.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        Student student7 = null;
        Course course8 = null;
        studentManager0.registerCourse(student7, course8);
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        Student student12 = null;
        Course course13 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student12, course13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertNotNull(courseList11);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        Course course4 = null;
        studentManager0.registerCourse(student3, course4);
        int int6 = studentManager0.getTotalStudents();
        Student student7 = null;
        java.util.List<Course> courseList8 = studentManager0.getCourses(student7);
        int int9 = studentManager0.getTotalStudents();
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        Student student12 = null;
        Course course13 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student12, course13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(courseList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(courseList11);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        int int7 = studentManager0.getTotalStudents();
        Student student8 = null;
        Course course9 = null;
        studentManager0.registerCourse(student8, course9);
        Student student11 = null;
        java.util.List<Course> courseList12 = studentManager0.getCourses(student11);
        int int13 = studentManager0.getTotalStudents();
        Student student14 = null;
        java.util.List<Course> courseList15 = studentManager0.getCourses(student14);
        int int16 = studentManager0.getTotalStudents();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(courseList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(courseList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        Course course6 = null;
        studentManager0.registerCourse(student5, course6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        int int10 = studentManager0.getTotalStudents();
        int int11 = studentManager0.getTotalStudents();
        int int12 = studentManager0.getTotalStudents();
        int int13 = studentManager0.getTotalStudents();
        int int14 = studentManager0.getTotalStudents();
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        Student student7 = null;
        java.util.List<Course> courseList8 = studentManager0.getCourses(student7);
        int int9 = studentManager0.getTotalStudents();
        int int10 = studentManager0.getTotalStudents();
        Student student11 = null;
        java.util.List<Course> courseList12 = studentManager0.getCourses(student11);
        int int13 = studentManager0.getTotalStudents();
        Student student14 = null;
        java.util.List<Course> courseList15 = studentManager0.getCourses(student14);
        int int16 = studentManager0.getTotalStudents();
        Student student17 = null;
        java.util.List<Course> courseList18 = studentManager0.getCourses(student17);
        Student student19 = null;
        java.util.List<Course> courseList20 = studentManager0.getCourses(student19);
        java.lang.Class<?> wildcardClass21 = courseList20.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(courseList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(courseList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(courseList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(courseList18);
        org.junit.Assert.assertNotNull(courseList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        int int7 = studentManager0.getTotalStudents();
        int int8 = studentManager0.getTotalStudents();
        int int9 = studentManager0.getTotalStudents();
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        int int12 = studentManager0.getTotalStudents();
        Student student13 = null;
        java.util.List<Course> courseList14 = studentManager0.getCourses(student13);
        Student student15 = null;
        java.util.List<Course> courseList16 = studentManager0.getCourses(student15);
        int int17 = studentManager0.getTotalStudents();
        java.lang.Class<?> wildcardClass18 = studentManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(courseList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(courseList14);
        org.junit.Assert.assertNotNull(courseList16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        Student student7 = null;
        java.util.List<Course> courseList8 = studentManager0.getCourses(student7);
        Student student9 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertNotNull(courseList8);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        int int7 = studentManager0.getTotalStudents();
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        Student student12 = null;
        java.util.List<Course> courseList13 = studentManager0.getCourses(student12);
        java.lang.Class<?> wildcardClass14 = studentManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertNotNull(courseList11);
        org.junit.Assert.assertNotNull(courseList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        Student student7 = null;
        java.util.List<Course> courseList8 = studentManager0.getCourses(student7);
        Student student9 = null;
        java.util.List<Course> courseList10 = studentManager0.getCourses(student9);
        Student student11 = null;
        java.util.List<Course> courseList12 = studentManager0.getCourses(student11);
        java.lang.Class<?> wildcardClass13 = studentManager0.getClass();
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertNotNull(courseList8);
        org.junit.Assert.assertNotNull(courseList10);
        org.junit.Assert.assertNotNull(courseList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        int int7 = studentManager0.getTotalStudents();
        int int8 = studentManager0.getTotalStudents();
        Student student9 = null;
        java.util.List<Course> courseList10 = studentManager0.getCourses(student9);
        int int11 = studentManager0.getTotalStudents();
        Student student12 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(courseList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        int int7 = studentManager0.getTotalStudents();
        int int8 = studentManager0.getTotalStudents();
        int int9 = studentManager0.getTotalStudents();
        int int10 = studentManager0.getTotalStudents();
        Student student11 = null;
        java.util.List<Course> courseList12 = studentManager0.getCourses(student11);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(courseList12);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        int int7 = studentManager0.getTotalStudents();
        int int8 = studentManager0.getTotalStudents();
        Student student9 = null;
        java.util.List<Course> courseList10 = studentManager0.getCourses(student9);
        Student student11 = null;
        java.util.List<Course> courseList12 = studentManager0.getCourses(student11);
        Student student13 = null;
        java.util.List<Course> courseList14 = studentManager0.getCourses(student13);
        Student student15 = null;
        java.util.List<Course> courseList16 = studentManager0.getCourses(student15);
        Student student17 = null;
        Course course18 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student17, course18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(courseList10);
        org.junit.Assert.assertNotNull(courseList12);
        org.junit.Assert.assertNotNull(courseList14);
        org.junit.Assert.assertNotNull(courseList16);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        Course course6 = null;
        studentManager0.registerCourse(student5, course6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        Student student10 = null;
        Course course11 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student10, course11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList9);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        int int7 = studentManager0.getTotalStudents();
        int int8 = studentManager0.getTotalStudents();
        int int9 = studentManager0.getTotalStudents();
        int int10 = studentManager0.getTotalStudents();
        int int11 = studentManager0.getTotalStudents();
        Student student12 = null;
        java.util.List<Course> courseList13 = studentManager0.getCourses(student12);
        java.lang.Class<?> wildcardClass14 = courseList13.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(courseList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        Course course6 = null;
        studentManager0.registerCourse(student5, course6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        int int10 = studentManager0.getTotalStudents();
        Student student11 = null;
        java.util.List<Course> courseList12 = studentManager0.getCourses(student11);
        int int13 = studentManager0.getTotalStudents();
        int int14 = studentManager0.getTotalStudents();
        Student student15 = null;
        java.util.List<Course> courseList16 = studentManager0.getCourses(student15);
        java.lang.Class<?> wildcardClass17 = courseList16.getClass();
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(courseList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(courseList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        int int7 = studentManager0.getTotalStudents();
        int int8 = studentManager0.getTotalStudents();
        int int9 = studentManager0.getTotalStudents();
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        int int12 = studentManager0.getTotalStudents();
        Student student13 = null;
        java.util.List<Course> courseList14 = studentManager0.getCourses(student13);
        int int15 = studentManager0.getTotalStudents();
        java.lang.Class<?> wildcardClass16 = studentManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(courseList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(courseList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        int int7 = studentManager0.getTotalStudents();
        Student student8 = null;
        Course course9 = null;
        studentManager0.registerCourse(student8, course9);
        Student student11 = null;
        java.util.List<Course> courseList12 = studentManager0.getCourses(student11);
        Student student13 = null;
        java.util.List<Course> courseList14 = studentManager0.getCourses(student13);
        int int15 = studentManager0.getTotalStudents();
        Student student16 = null;
        java.util.List<Course> courseList17 = studentManager0.getCourses(student16);
        java.lang.Class<?> wildcardClass18 = studentManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(courseList12);
        org.junit.Assert.assertNotNull(courseList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(courseList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        Course course4 = null;
        studentManager0.registerCourse(student3, course4);
        Student student6 = null;
        java.util.List<Course> courseList7 = studentManager0.getCourses(student6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        int int10 = studentManager0.getTotalStudents();
        Student student11 = null;
        java.util.List<Course> courseList12 = studentManager0.getCourses(student11);
        Student student13 = null;
        java.util.List<Course> courseList14 = studentManager0.getCourses(student13);
        java.lang.Class<?> wildcardClass15 = studentManager0.getClass();
        org.junit.Assert.assertNotNull(courseList7);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(courseList12);
        org.junit.Assert.assertNotNull(courseList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        java.lang.Class<?> wildcardClass7 = courseList6.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        Student student7 = null;
        java.util.List<Course> courseList8 = studentManager0.getCourses(student7);
        int int9 = studentManager0.getTotalStudents();
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        java.lang.Class<?> wildcardClass12 = studentManager0.getClass();
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertNotNull(courseList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(courseList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        Student student7 = null;
        java.util.List<Course> courseList8 = studentManager0.getCourses(student7);
        Student student9 = null;
        java.util.List<Course> courseList10 = studentManager0.getCourses(student9);
        Student student11 = null;
        java.util.List<Course> courseList12 = studentManager0.getCourses(student11);
        int int13 = studentManager0.getTotalStudents();
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertNotNull(courseList8);
        org.junit.Assert.assertNotNull(courseList10);
        org.junit.Assert.assertNotNull(courseList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        Student student7 = null;
        java.util.List<Course> courseList8 = studentManager0.getCourses(student7);
        int int9 = studentManager0.getTotalStudents();
        int int10 = studentManager0.getTotalStudents();
        Student student11 = null;
        java.util.List<Course> courseList12 = studentManager0.getCourses(student11);
        int int13 = studentManager0.getTotalStudents();
        Student student14 = null;
        java.util.List<Course> courseList15 = studentManager0.getCourses(student14);
        int int16 = studentManager0.getTotalStudents();
        Student student17 = null;
        java.util.List<Course> courseList18 = studentManager0.getCourses(student17);
        java.lang.Class<?> wildcardClass19 = studentManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(courseList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(courseList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(courseList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(courseList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        int int7 = studentManager0.getTotalStudents();
        int int8 = studentManager0.getTotalStudents();
        Student student9 = null;
        java.util.List<Course> courseList10 = studentManager0.getCourses(student9);
        java.lang.Class<?> wildcardClass11 = courseList10.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(courseList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        Student student7 = null;
        java.util.List<Course> courseList8 = studentManager0.getCourses(student7);
        int int9 = studentManager0.getTotalStudents();
        int int10 = studentManager0.getTotalStudents();
        Student student11 = null;
        java.util.List<Course> courseList12 = studentManager0.getCourses(student11);
        int int13 = studentManager0.getTotalStudents();
        Student student14 = null;
        java.util.List<Course> courseList15 = studentManager0.getCourses(student14);
        int int16 = studentManager0.getTotalStudents();
        Student student17 = null;
        java.util.List<Course> courseList18 = studentManager0.getCourses(student17);
        Student student19 = null;
        java.util.List<Course> courseList20 = studentManager0.getCourses(student19);
        Student student21 = null;
        java.util.List<Course> courseList22 = studentManager0.getCourses(student21);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(courseList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(courseList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(courseList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(courseList18);
        org.junit.Assert.assertNotNull(courseList20);
        org.junit.Assert.assertNotNull(courseList22);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        Student student7 = null;
        java.util.List<Course> courseList8 = studentManager0.getCourses(student7);
        Student student9 = null;
        java.util.List<Course> courseList10 = studentManager0.getCourses(student9);
        int int11 = studentManager0.getTotalStudents();
        int int12 = studentManager0.getTotalStudents();
        int int13 = studentManager0.getTotalStudents();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertNotNull(courseList8);
        org.junit.Assert.assertNotNull(courseList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        Student student7 = null;
        java.util.List<Course> courseList8 = studentManager0.getCourses(student7);
        int int9 = studentManager0.getTotalStudents();
        int int10 = studentManager0.getTotalStudents();
        int int11 = studentManager0.getTotalStudents();
        Student student12 = null;
        java.util.List<Course> courseList13 = studentManager0.getCourses(student12);
        java.lang.Class<?> wildcardClass14 = courseList13.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(courseList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(courseList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        int int7 = studentManager0.getTotalStudents();
        int int8 = studentManager0.getTotalStudents();
        Student student9 = null;
        java.util.List<Course> courseList10 = studentManager0.getCourses(student9);
        int int11 = studentManager0.getTotalStudents();
        Student student12 = null;
        java.util.List<Course> courseList13 = studentManager0.getCourses(student12);
        Student student14 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(courseList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(courseList13);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        Course course6 = null;
        studentManager0.registerCourse(student5, course6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        int int10 = studentManager0.getTotalStudents();
        int int11 = studentManager0.getTotalStudents();
        int int12 = studentManager0.getTotalStudents();
        Student student13 = null;
        java.util.List<Course> courseList14 = studentManager0.getCourses(student13);
        int int15 = studentManager0.getTotalStudents();
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(courseList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        Course course6 = null;
        studentManager0.registerCourse(student5, course6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        int int12 = studentManager0.getTotalStudents();
        Student student13 = null;
        java.util.List<Course> courseList14 = studentManager0.getCourses(student13);
        int int15 = studentManager0.getTotalStudents();
        Student student16 = null;
        java.util.List<Course> courseList17 = studentManager0.getCourses(student16);
        int int18 = studentManager0.getTotalStudents();
        Student student19 = null;
        java.util.List<Course> courseList20 = studentManager0.getCourses(student19);
        int int21 = studentManager0.getTotalStudents();
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertNotNull(courseList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(courseList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(courseList17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(courseList20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        Course course6 = null;
        studentManager0.registerCourse(student5, course6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        int int10 = studentManager0.getTotalStudents();
        Student student11 = null;
        java.util.List<Course> courseList12 = studentManager0.getCourses(student11);
        Student student13 = null;
        java.util.List<Course> courseList14 = studentManager0.getCourses(student13);
        int int15 = studentManager0.getTotalStudents();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(courseList12);
        org.junit.Assert.assertNotNull(courseList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        Student student7 = null;
        java.util.List<Course> courseList8 = studentManager0.getCourses(student7);
        int int9 = studentManager0.getTotalStudents();
        int int10 = studentManager0.getTotalStudents();
        Student student11 = null;
        java.util.List<Course> courseList12 = studentManager0.getCourses(student11);
        Student student13 = null;
        java.util.List<Course> courseList14 = studentManager0.getCourses(student13);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(courseList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(courseList12);
        org.junit.Assert.assertNotNull(courseList14);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        int int7 = studentManager0.getTotalStudents();
        int int8 = studentManager0.getTotalStudents();
        int int9 = studentManager0.getTotalStudents();
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        int int12 = studentManager0.getTotalStudents();
        int int13 = studentManager0.getTotalStudents();
        int int14 = studentManager0.getTotalStudents();
        Student student15 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(courseList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        int int7 = studentManager0.getTotalStudents();
        int int8 = studentManager0.getTotalStudents();
        int int9 = studentManager0.getTotalStudents();
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        int int12 = studentManager0.getTotalStudents();
        Student student13 = null;
        java.util.List<Course> courseList14 = studentManager0.getCourses(student13);
        java.lang.Class<?> wildcardClass15 = studentManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(courseList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(courseList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        int int7 = studentManager0.getTotalStudents();
        int int8 = studentManager0.getTotalStudents();
        Student student9 = null;
        java.util.List<Course> courseList10 = studentManager0.getCourses(student9);
        int int11 = studentManager0.getTotalStudents();
        java.lang.Class<?> wildcardClass12 = studentManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(courseList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        Student student7 = null;
        java.util.List<Course> courseList8 = studentManager0.getCourses(student7);
        int int9 = studentManager0.getTotalStudents();
        Student student10 = null;
        Course course11 = null;
        studentManager0.registerCourse(student10, course11);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertNotNull(courseList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        int int7 = studentManager0.getTotalStudents();
        int int8 = studentManager0.getTotalStudents();
        Student student9 = null;
        java.util.List<Course> courseList10 = studentManager0.getCourses(student9);
        java.lang.Class<?> wildcardClass11 = studentManager0.getClass();
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(courseList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        int int7 = studentManager0.getTotalStudents();
        int int8 = studentManager0.getTotalStudents();
        Student student9 = null;
        java.util.List<Course> courseList10 = studentManager0.getCourses(student9);
        int int11 = studentManager0.getTotalStudents();
        Student student12 = null;
        java.util.List<Course> courseList13 = studentManager0.getCourses(student12);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(courseList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(courseList13);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        Course course6 = null;
        studentManager0.registerCourse(student5, course6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        int int10 = studentManager0.getTotalStudents();
        int int11 = studentManager0.getTotalStudents();
        int int12 = studentManager0.getTotalStudents();
        Student student13 = null;
        java.util.List<Course> courseList14 = studentManager0.getCourses(student13);
        java.lang.Class<?> wildcardClass15 = courseList14.getClass();
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(courseList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        int int7 = studentManager0.getTotalStudents();
        int int8 = studentManager0.getTotalStudents();
        int int9 = studentManager0.getTotalStudents();
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        java.lang.Class<?> wildcardClass12 = courseList11.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(courseList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        int int5 = studentManager0.getTotalStudents();
        Student student6 = null;
        Course course7 = null;
        studentManager0.registerCourse(student6, course7);
        Student student9 = null;
        java.util.List<Course> courseList10 = studentManager0.getCourses(student9);
        int int11 = studentManager0.getTotalStudents();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(courseList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        Student student7 = null;
        java.util.List<Course> courseList8 = studentManager0.getCourses(student7);
        int int9 = studentManager0.getTotalStudents();
        int int10 = studentManager0.getTotalStudents();
        Student student11 = null;
        java.util.List<Course> courseList12 = studentManager0.getCourses(student11);
        int int13 = studentManager0.getTotalStudents();
        Student student14 = null;
        java.util.List<Course> courseList15 = studentManager0.getCourses(student14);
        int int16 = studentManager0.getTotalStudents();
        Student student17 = null;
        java.util.List<Course> courseList18 = studentManager0.getCourses(student17);
        int int19 = studentManager0.getTotalStudents();
        Student student20 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(courseList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(courseList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(courseList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(courseList18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        int int7 = studentManager0.getTotalStudents();
        int int8 = studentManager0.getTotalStudents();
        Student student9 = null;
        java.util.List<Course> courseList10 = studentManager0.getCourses(student9);
        Student student11 = null;
        Course course12 = null;
        studentManager0.registerCourse(student11, course12);
        int int14 = studentManager0.getTotalStudents();
        java.lang.Class<?> wildcardClass15 = studentManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(courseList10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        int int7 = studentManager0.getTotalStudents();
        int int8 = studentManager0.getTotalStudents();
        int int9 = studentManager0.getTotalStudents();
        Student student10 = null;
        Course course11 = null;
        studentManager0.registerCourse(student10, course11);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        int int7 = studentManager0.getTotalStudents();
        int int8 = studentManager0.getTotalStudents();
        Student student9 = null;
        java.util.List<Course> courseList10 = studentManager0.getCourses(student9);
        Student student11 = null;
        Course course12 = null;
        studentManager0.registerCourse(student11, course12);
        Student student14 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(courseList10);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        int int7 = studentManager0.getTotalStudents();
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        Student student12 = null;
        java.util.List<Course> courseList13 = studentManager0.getCourses(student12);
        int int14 = studentManager0.getTotalStudents();
        Student student15 = null;
        java.util.List<Course> courseList16 = studentManager0.getCourses(student15);
        Student student17 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertNotNull(courseList11);
        org.junit.Assert.assertNotNull(courseList13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(courseList16);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        Student student7 = null;
        java.util.List<Course> courseList8 = studentManager0.getCourses(student7);
        Student student9 = null;
        java.util.List<Course> courseList10 = studentManager0.getCourses(student9);
        int int11 = studentManager0.getTotalStudents();
        Student student12 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(courseList8);
        org.junit.Assert.assertNotNull(courseList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        int int7 = studentManager0.getTotalStudents();
        Student student8 = null;
        Course course9 = null;
        studentManager0.registerCourse(student8, course9);
        Student student11 = null;
        java.util.List<Course> courseList12 = studentManager0.getCourses(student11);
        int int13 = studentManager0.getTotalStudents();
        Student student14 = null;
        java.util.List<Course> courseList15 = studentManager0.getCourses(student14);
        Student student16 = null;
        java.util.List<Course> courseList17 = studentManager0.getCourses(student16);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(courseList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(courseList15);
        org.junit.Assert.assertNotNull(courseList17);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        int int7 = studentManager0.getTotalStudents();
        Student student8 = null;
        Course course9 = null;
        studentManager0.registerCourse(student8, course9);
        Student student11 = null;
        java.util.List<Course> courseList12 = studentManager0.getCourses(student11);
        java.lang.Class<?> wildcardClass13 = studentManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(courseList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        Course course6 = null;
        studentManager0.registerCourse(student5, course6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        int int12 = studentManager0.getTotalStudents();
        Student student13 = null;
        java.util.List<Course> courseList14 = studentManager0.getCourses(student13);
        int int15 = studentManager0.getTotalStudents();
        Student student16 = null;
        java.util.List<Course> courseList17 = studentManager0.getCourses(student16);
        int int18 = studentManager0.getTotalStudents();
        Student student19 = null;
        Course course20 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student19, course20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertNotNull(courseList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(courseList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(courseList17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        Course course4 = null;
        studentManager0.registerCourse(student3, course4);
        Student student6 = null;
        java.util.List<Course> courseList7 = studentManager0.getCourses(student6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        int int10 = studentManager0.getTotalStudents();
        Student student11 = null;
        java.util.List<Course> courseList12 = studentManager0.getCourses(student11);
        Student student13 = null;
        java.util.List<Course> courseList14 = studentManager0.getCourses(student13);
        Student student15 = null;
        java.util.List<Course> courseList16 = studentManager0.getCourses(student15);
        org.junit.Assert.assertNotNull(courseList7);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(courseList12);
        org.junit.Assert.assertNotNull(courseList14);
        org.junit.Assert.assertNotNull(courseList16);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        int int7 = studentManager0.getTotalStudents();
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        Student student10 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(courseList9);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        Course course4 = null;
        studentManager0.registerCourse(student3, course4);
        int int6 = studentManager0.getTotalStudents();
        Student student7 = null;
        java.util.List<Course> courseList8 = studentManager0.getCourses(student7);
        int int9 = studentManager0.getTotalStudents();
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        java.lang.Class<?> wildcardClass12 = studentManager0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(courseList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(courseList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        int int7 = studentManager0.getTotalStudents();
        int int8 = studentManager0.getTotalStudents();
        Student student9 = null;
        java.util.List<Course> courseList10 = studentManager0.getCourses(student9);
        Student student11 = null;
        Course course12 = null;
        studentManager0.registerCourse(student11, course12);
        int int14 = studentManager0.getTotalStudents();
        Student student15 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(courseList10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        int int7 = studentManager0.getTotalStudents();
        Student student8 = null;
        Course course9 = null;
        studentManager0.registerCourse(student8, course9);
        Student student11 = null;
        java.util.List<Course> courseList12 = studentManager0.getCourses(student11);
        int int13 = studentManager0.getTotalStudents();
        int int14 = studentManager0.getTotalStudents();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(courseList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        int int7 = studentManager0.getTotalStudents();
        int int8 = studentManager0.getTotalStudents();
        Student student9 = null;
        java.util.List<Course> courseList10 = studentManager0.getCourses(student9);
        Student student11 = null;
        java.util.List<Course> courseList12 = studentManager0.getCourses(student11);
        int int13 = studentManager0.getTotalStudents();
        Student student14 = null;
        java.util.List<Course> courseList15 = studentManager0.getCourses(student14);
        Student student16 = null;
        Course course17 = null;
        studentManager0.registerCourse(student16, course17);
        Student student19 = null;
        java.util.List<Course> courseList20 = studentManager0.getCourses(student19);
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(courseList10);
        org.junit.Assert.assertNotNull(courseList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(courseList15);
        org.junit.Assert.assertNotNull(courseList20);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        int int5 = studentManager0.getTotalStudents();
        Student student6 = null;
        java.util.List<Course> courseList7 = studentManager0.getCourses(student6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        Student student10 = null;
        Course course11 = null;
        studentManager0.registerCourse(student10, course11);
        Student student13 = null;
        java.util.List<Course> courseList14 = studentManager0.getCourses(student13);
        Student student15 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(courseList7);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertNotNull(courseList14);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        int int7 = studentManager0.getTotalStudents();
        int int8 = studentManager0.getTotalStudents();
        int int9 = studentManager0.getTotalStudents();
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        int int12 = studentManager0.getTotalStudents();
        Student student13 = null;
        java.util.List<Course> courseList14 = studentManager0.getCourses(student13);
        int int15 = studentManager0.getTotalStudents();
        int int16 = studentManager0.getTotalStudents();
        int int17 = studentManager0.getTotalStudents();
        int int18 = studentManager0.getTotalStudents();
        java.lang.Class<?> wildcardClass19 = studentManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(courseList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(courseList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        java.util.List<Course> courseList5 = studentManager0.getCourses(student4);
        int int6 = studentManager0.getTotalStudents();
        Student student7 = null;
        java.util.List<Course> courseList8 = studentManager0.getCourses(student7);
        Student student9 = null;
        java.util.List<Course> courseList10 = studentManager0.getCourses(student9);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(courseList5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(courseList8);
        org.junit.Assert.assertNotNull(courseList10);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        int int7 = studentManager0.getTotalStudents();
        java.lang.Class<?> wildcardClass8 = studentManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        int int7 = studentManager0.getTotalStudents();
        int int8 = studentManager0.getTotalStudents();
        Student student9 = null;
        java.util.List<Course> courseList10 = studentManager0.getCourses(student9);
        Student student11 = null;
        java.util.List<Course> courseList12 = studentManager0.getCourses(student11);
        int int13 = studentManager0.getTotalStudents();
        Student student14 = null;
        java.util.List<Course> courseList15 = studentManager0.getCourses(student14);
        int int16 = studentManager0.getTotalStudents();
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(courseList10);
        org.junit.Assert.assertNotNull(courseList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(courseList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        int int7 = studentManager0.getTotalStudents();
        int int8 = studentManager0.getTotalStudents();
        int int9 = studentManager0.getTotalStudents();
        int int10 = studentManager0.getTotalStudents();
        int int11 = studentManager0.getTotalStudents();
        Student student12 = null;
        java.util.List<Course> courseList13 = studentManager0.getCourses(student12);
        int int14 = studentManager0.getTotalStudents();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(courseList13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        Student student7 = null;
        Course course8 = null;
        studentManager0.registerCourse(student7, course8);
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        int int12 = studentManager0.getTotalStudents();
        Student student13 = null;
        java.util.List<Course> courseList14 = studentManager0.getCourses(student13);
        Student student15 = null;
        Course course16 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student15, course16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertNotNull(courseList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(courseList14);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        int int2 = studentManager0.getTotalStudents();
        Student student3 = null;
        studentManager0.addStudent(student3);
        int int5 = studentManager0.getTotalStudents();
        int int6 = studentManager0.getTotalStudents();
        Student student7 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        int int2 = studentManager0.getTotalStudents();
        Student student3 = null;
        studentManager0.addStudent(student3);
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(courseList6);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        Course course6 = null;
        studentManager0.registerCourse(student5, course6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        int int10 = studentManager0.getTotalStudents();
        int int11 = studentManager0.getTotalStudents();
        Student student12 = null;
        java.util.List<Course> courseList13 = studentManager0.getCourses(student12);
        int int14 = studentManager0.getTotalStudents();
        int int15 = studentManager0.getTotalStudents();
        Student student16 = null;
        java.util.List<Course> courseList17 = studentManager0.getCourses(student16);
        Student student18 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(courseList13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(courseList17);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        Course course6 = null;
        studentManager0.registerCourse(student5, course6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        int int10 = studentManager0.getTotalStudents();
        int int11 = studentManager0.getTotalStudents();
        Student student12 = null;
        java.util.List<Course> courseList13 = studentManager0.getCourses(student12);
        int int14 = studentManager0.getTotalStudents();
        java.lang.Class<?> wildcardClass15 = studentManager0.getClass();
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(courseList13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        Student student7 = null;
        java.util.List<Course> courseList8 = studentManager0.getCourses(student7);
        int int9 = studentManager0.getTotalStudents();
        int int10 = studentManager0.getTotalStudents();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertNotNull(courseList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        int int7 = studentManager0.getTotalStudents();
        int int8 = studentManager0.getTotalStudents();
        Student student9 = null;
        Course course10 = null;
        studentManager0.registerCourse(student9, course10);
        Student student12 = null;
        java.util.List<Course> courseList13 = studentManager0.getCourses(student12);
        Student student14 = null;
        Course course15 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student14, course15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(courseList13);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        Student student7 = null;
        java.util.List<Course> courseList8 = studentManager0.getCourses(student7);
        Student student9 = null;
        java.util.List<Course> courseList10 = studentManager0.getCourses(student9);
        int int11 = studentManager0.getTotalStudents();
        Student student12 = null;
        Course course13 = null;
        studentManager0.registerCourse(student12, course13);
        Student student15 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertNotNull(courseList8);
        org.junit.Assert.assertNotNull(courseList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        Course course4 = null;
        studentManager0.registerCourse(student3, course4);
        int int6 = studentManager0.getTotalStudents();
        Student student7 = null;
        java.util.List<Course> courseList8 = studentManager0.getCourses(student7);
        Student student9 = null;
        java.util.List<Course> courseList10 = studentManager0.getCourses(student9);
        int int11 = studentManager0.getTotalStudents();
        Student student12 = null;
        java.util.List<Course> courseList13 = studentManager0.getCourses(student12);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(courseList8);
        org.junit.Assert.assertNotNull(courseList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(courseList13);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        Student student7 = null;
        java.util.List<Course> courseList8 = studentManager0.getCourses(student7);
        Student student9 = null;
        java.util.List<Course> courseList10 = studentManager0.getCourses(student9);
        Student student11 = null;
        Course course12 = null;
        studentManager0.registerCourse(student11, course12);
        java.lang.Class<?> wildcardClass14 = studentManager0.getClass();
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertNotNull(courseList8);
        org.junit.Assert.assertNotNull(courseList10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        int int7 = studentManager0.getTotalStudents();
        int int8 = studentManager0.getTotalStudents();
        Student student9 = null;
        java.util.List<Course> courseList10 = studentManager0.getCourses(student9);
        int int11 = studentManager0.getTotalStudents();
        Student student12 = null;
        java.util.List<Course> courseList13 = studentManager0.getCourses(student12);
        int int14 = studentManager0.getTotalStudents();
        Student student15 = null;
        Course course16 = null;
        studentManager0.registerCourse(student15, course16);
        Student student18 = null;
        java.util.List<Course> courseList19 = studentManager0.getCourses(student18);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(courseList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(courseList13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(courseList19);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        Course course6 = null;
        studentManager0.registerCourse(student5, course6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        int int10 = studentManager0.getTotalStudents();
        int int11 = studentManager0.getTotalStudents();
        Student student12 = null;
        java.util.List<Course> courseList13 = studentManager0.getCourses(student12);
        java.lang.Class<?> wildcardClass14 = courseList13.getClass();
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(courseList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        Course course6 = null;
        studentManager0.registerCourse(student5, course6);
        int int8 = studentManager0.getTotalStudents();
        Student student9 = null;
        java.util.List<Course> courseList10 = studentManager0.getCourses(student9);
        Student student11 = null;
        Course course12 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student11, course12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(courseList10);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        Course course6 = null;
        studentManager0.registerCourse(student5, course6);
        int int8 = studentManager0.getTotalStudents();
        int int9 = studentManager0.getTotalStudents();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        Student student7 = null;
        java.util.List<Course> courseList8 = studentManager0.getCourses(student7);
        int int9 = studentManager0.getTotalStudents();
        int int10 = studentManager0.getTotalStudents();
        Student student11 = null;
        Course course12 = null;
        studentManager0.registerCourse(student11, course12);
        int int14 = studentManager0.getTotalStudents();
        java.lang.Class<?> wildcardClass15 = studentManager0.getClass();
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertNotNull(courseList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        Course course6 = null;
        studentManager0.registerCourse(student5, course6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        int int10 = studentManager0.getTotalStudents();
        Student student11 = null;
        java.util.List<Course> courseList12 = studentManager0.getCourses(student11);
        int int13 = studentManager0.getTotalStudents();
        Student student14 = null;
        java.util.List<Course> courseList15 = studentManager0.getCourses(student14);
        java.lang.Class<?> wildcardClass16 = studentManager0.getClass();
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(courseList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(courseList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        int int7 = studentManager0.getTotalStudents();
        Student student8 = null;
        Course course9 = null;
        studentManager0.registerCourse(student8, course9);
        Student student11 = null;
        java.util.List<Course> courseList12 = studentManager0.getCourses(student11);
        Student student13 = null;
        java.util.List<Course> courseList14 = studentManager0.getCourses(student13);
        int int15 = studentManager0.getTotalStudents();
        Student student16 = null;
        java.util.List<Course> courseList17 = studentManager0.getCourses(student16);
        Student student18 = null;
        java.util.List<Course> courseList19 = studentManager0.getCourses(student18);
        int int20 = studentManager0.getTotalStudents();
        Student student21 = null;
        Course course22 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student21, course22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(courseList12);
        org.junit.Assert.assertNotNull(courseList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(courseList17);
        org.junit.Assert.assertNotNull(courseList19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        int int5 = studentManager0.getTotalStudents();
        Student student6 = null;
        Course course7 = null;
        studentManager0.registerCourse(student6, course7);
        int int9 = studentManager0.getTotalStudents();
        int int10 = studentManager0.getTotalStudents();
        Student student11 = null;
        Course course12 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student11, course12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        int int5 = studentManager0.getTotalStudents();
        Student student6 = null;
        Course course7 = null;
        studentManager0.registerCourse(student6, course7);
        int int9 = studentManager0.getTotalStudents();
        int int10 = studentManager0.getTotalStudents();
        Student student11 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        java.util.List<Course> courseList5 = studentManager0.getCourses(student4);
        Student student6 = null;
        Course course7 = null;
        studentManager0.registerCourse(student6, course7);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(courseList5);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        Course course6 = null;
        studentManager0.registerCourse(student5, course6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        int int10 = studentManager0.getTotalStudents();
        int int11 = studentManager0.getTotalStudents();
        int int12 = studentManager0.getTotalStudents();
        int int13 = studentManager0.getTotalStudents();
        Student student14 = null;
        java.util.List<Course> courseList15 = studentManager0.getCourses(student14);
        Student student16 = null;
        java.util.List<Course> courseList17 = studentManager0.getCourses(student16);
        Student student18 = null;
        Course course19 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student18, course19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(courseList15);
        org.junit.Assert.assertNotNull(courseList17);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        int int7 = studentManager0.getTotalStudents();
        int int8 = studentManager0.getTotalStudents();
        int int9 = studentManager0.getTotalStudents();
        int int10 = studentManager0.getTotalStudents();
        int int11 = studentManager0.getTotalStudents();
        Student student12 = null;
        Course course13 = null;
        studentManager0.registerCourse(student12, course13);
        java.lang.Class<?> wildcardClass15 = studentManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        Course course6 = null;
        studentManager0.registerCourse(student5, course6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        java.lang.Class<?> wildcardClass10 = studentManager0.getClass();
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        int int5 = studentManager0.getTotalStudents();
        Student student6 = null;
        Course course7 = null;
        studentManager0.registerCourse(student6, course7);
        int int9 = studentManager0.getTotalStudents();
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        java.lang.Class<?> wildcardClass12 = courseList11.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(courseList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        Course course6 = null;
        studentManager0.registerCourse(student5, course6);
        int int8 = studentManager0.getTotalStudents();
        Student student9 = null;
        java.util.List<Course> courseList10 = studentManager0.getCourses(student9);
        java.lang.Class<?> wildcardClass11 = studentManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(courseList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        int int7 = studentManager0.getTotalStudents();
        int int8 = studentManager0.getTotalStudents();
        int int9 = studentManager0.getTotalStudents();
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        Student student12 = null;
        java.util.List<Course> courseList13 = studentManager0.getCourses(student12);
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(courseList11);
        org.junit.Assert.assertNotNull(courseList13);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        Course course6 = null;
        studentManager0.registerCourse(student5, course6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        int int10 = studentManager0.getTotalStudents();
        java.lang.Class<?> wildcardClass11 = studentManager0.getClass();
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        int int7 = studentManager0.getTotalStudents();
        int int8 = studentManager0.getTotalStudents();
        Student student9 = null;
        java.util.List<Course> courseList10 = studentManager0.getCourses(student9);
        Student student11 = null;
        java.util.List<Course> courseList12 = studentManager0.getCourses(student11);
        Student student13 = null;
        Course course14 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student13, course14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(courseList10);
        org.junit.Assert.assertNotNull(courseList12);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        Student student7 = null;
        java.util.List<Course> courseList8 = studentManager0.getCourses(student7);
        int int9 = studentManager0.getTotalStudents();
        java.lang.Class<?> wildcardClass10 = studentManager0.getClass();
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertNotNull(courseList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        int int7 = studentManager0.getTotalStudents();
        int int8 = studentManager0.getTotalStudents();
        int int9 = studentManager0.getTotalStudents();
        int int10 = studentManager0.getTotalStudents();
        int int11 = studentManager0.getTotalStudents();
        Student student12 = null;
        java.util.List<Course> courseList13 = studentManager0.getCourses(student12);
        Student student14 = null;
        java.util.List<Course> courseList15 = studentManager0.getCourses(student14);
        Student student16 = null;
        java.util.List<Course> courseList17 = studentManager0.getCourses(student16);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(courseList13);
        org.junit.Assert.assertNotNull(courseList15);
        org.junit.Assert.assertNotNull(courseList17);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        int int7 = studentManager0.getTotalStudents();
        int int8 = studentManager0.getTotalStudents();
        Student student9 = null;
        java.util.List<Course> courseList10 = studentManager0.getCourses(student9);
        int int11 = studentManager0.getTotalStudents();
        Student student12 = null;
        java.util.List<Course> courseList13 = studentManager0.getCourses(student12);
        int int14 = studentManager0.getTotalStudents();
        Student student15 = null;
        Course course16 = null;
        studentManager0.registerCourse(student15, course16);
        Student student18 = null;
        Course course19 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student18, course19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(courseList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(courseList13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        Student student7 = null;
        Course course8 = null;
        studentManager0.registerCourse(student7, course8);
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        java.lang.Class<?> wildcardClass12 = studentManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertNotNull(courseList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        Course course4 = null;
        studentManager0.registerCourse(student3, course4);
        Student student6 = null;
        java.util.List<Course> courseList7 = studentManager0.getCourses(student6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        int int10 = studentManager0.getTotalStudents();
        int int11 = studentManager0.getTotalStudents();
        Student student12 = null;
        java.util.List<Course> courseList13 = studentManager0.getCourses(student12);
        int int14 = studentManager0.getTotalStudents();
        Student student15 = null;
        Course course16 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student15, course16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseList7);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(courseList13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        int int7 = studentManager0.getTotalStudents();
        int int8 = studentManager0.getTotalStudents();
        Student student9 = null;
        java.util.List<Course> courseList10 = studentManager0.getCourses(student9);
        Student student11 = null;
        java.util.List<Course> courseList12 = studentManager0.getCourses(student11);
        Student student13 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(courseList10);
        org.junit.Assert.assertNotNull(courseList12);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        Student student7 = null;
        java.util.List<Course> courseList8 = studentManager0.getCourses(student7);
        int int9 = studentManager0.getTotalStudents();
        Student student10 = null;
        Course course11 = null;
        studentManager0.registerCourse(student10, course11);
        Student student13 = null;
        java.util.List<Course> courseList14 = studentManager0.getCourses(student13);
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertNotNull(courseList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(courseList14);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        Course course6 = null;
        studentManager0.registerCourse(student5, course6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        int int12 = studentManager0.getTotalStudents();
        int int13 = studentManager0.getTotalStudents();
        Student student14 = null;
        java.util.List<Course> courseList15 = studentManager0.getCourses(student14);
        Student student16 = null;
        Course course17 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student16, course17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertNotNull(courseList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(courseList15);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        Student student7 = null;
        java.util.List<Course> courseList8 = studentManager0.getCourses(student7);
        Student student9 = null;
        java.util.List<Course> courseList10 = studentManager0.getCourses(student9);
        int int11 = studentManager0.getTotalStudents();
        int int12 = studentManager0.getTotalStudents();
        Student student13 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertNotNull(courseList8);
        org.junit.Assert.assertNotNull(courseList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        int int7 = studentManager0.getTotalStudents();
        Student student8 = null;
        Course course9 = null;
        studentManager0.registerCourse(student8, course9);
        Student student11 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        int int7 = studentManager0.getTotalStudents();
        int int8 = studentManager0.getTotalStudents();
        Student student9 = null;
        Course course10 = null;
        studentManager0.registerCourse(student9, course10);
        int int12 = studentManager0.getTotalStudents();
        int int13 = studentManager0.getTotalStudents();
        int int14 = studentManager0.getTotalStudents();
        int int15 = studentManager0.getTotalStudents();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        int int7 = studentManager0.getTotalStudents();
        int int8 = studentManager0.getTotalStudents();
        Student student9 = null;
        java.util.List<Course> courseList10 = studentManager0.getCourses(student9);
        int int11 = studentManager0.getTotalStudents();
        Student student12 = null;
        java.util.List<Course> courseList13 = studentManager0.getCourses(student12);
        Student student14 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(courseList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(courseList13);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        Course course6 = null;
        studentManager0.registerCourse(student5, course6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        int int10 = studentManager0.getTotalStudents();
        int int11 = studentManager0.getTotalStudents();
        int int12 = studentManager0.getTotalStudents();
        int int13 = studentManager0.getTotalStudents();
        Student student14 = null;
        java.util.List<Course> courseList15 = studentManager0.getCourses(student14);
        Student student16 = null;
        java.util.List<Course> courseList17 = studentManager0.getCourses(student16);
        java.lang.Class<?> wildcardClass18 = studentManager0.getClass();
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(courseList15);
        org.junit.Assert.assertNotNull(courseList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        Course course6 = null;
        studentManager0.registerCourse(student5, course6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        int int10 = studentManager0.getTotalStudents();
        Student student11 = null;
        java.util.List<Course> courseList12 = studentManager0.getCourses(student11);
        Student student13 = null;
        java.util.List<Course> courseList14 = studentManager0.getCourses(student13);
        Student student15 = null;
        java.util.List<Course> courseList16 = studentManager0.getCourses(student15);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(courseList12);
        org.junit.Assert.assertNotNull(courseList14);
        org.junit.Assert.assertNotNull(courseList16);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        Student student7 = null;
        Course course8 = null;
        studentManager0.registerCourse(student7, course8);
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        Student student12 = null;
        java.util.List<Course> courseList13 = studentManager0.getCourses(student12);
        Student student14 = null;
        Course course15 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student14, course15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertNotNull(courseList11);
        org.junit.Assert.assertNotNull(courseList13);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        int int7 = studentManager0.getTotalStudents();
        int int8 = studentManager0.getTotalStudents();
        int int9 = studentManager0.getTotalStudents();
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        int int12 = studentManager0.getTotalStudents();
        Student student13 = null;
        java.util.List<Course> courseList14 = studentManager0.getCourses(student13);
        Student student15 = null;
        Course course16 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student15, course16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(courseList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(courseList14);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        int int7 = studentManager0.getTotalStudents();
        int int8 = studentManager0.getTotalStudents();
        int int9 = studentManager0.getTotalStudents();
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        int int12 = studentManager0.getTotalStudents();
        Student student13 = null;
        java.util.List<Course> courseList14 = studentManager0.getCourses(student13);
        int int15 = studentManager0.getTotalStudents();
        int int16 = studentManager0.getTotalStudents();
        Student student17 = null;
        java.util.List<Course> courseList18 = studentManager0.getCourses(student17);
        Student student19 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(courseList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(courseList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(courseList18);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        int int7 = studentManager0.getTotalStudents();
        int int8 = studentManager0.getTotalStudents();
        int int9 = studentManager0.getTotalStudents();
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        int int12 = studentManager0.getTotalStudents();
        Student student13 = null;
        java.util.List<Course> courseList14 = studentManager0.getCourses(student13);
        int int15 = studentManager0.getTotalStudents();
        int int16 = studentManager0.getTotalStudents();
        Student student17 = null;
        java.util.List<Course> courseList18 = studentManager0.getCourses(student17);
        int int19 = studentManager0.getTotalStudents();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(courseList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(courseList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(courseList18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        Student student7 = null;
        java.util.List<Course> courseList8 = studentManager0.getCourses(student7);
        Student student9 = null;
        java.util.List<Course> courseList10 = studentManager0.getCourses(student9);
        int int11 = studentManager0.getTotalStudents();
        Student student12 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertNotNull(courseList8);
        org.junit.Assert.assertNotNull(courseList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        Student student7 = null;
        Course course8 = null;
        studentManager0.registerCourse(student7, course8);
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        Student student12 = null;
        java.util.List<Course> courseList13 = studentManager0.getCourses(student12);
        java.lang.Class<?> wildcardClass14 = studentManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertNotNull(courseList11);
        org.junit.Assert.assertNotNull(courseList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        Course course6 = null;
        studentManager0.registerCourse(student5, course6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        int int10 = studentManager0.getTotalStudents();
        Student student11 = null;
        java.util.List<Course> courseList12 = studentManager0.getCourses(student11);
        Student student13 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(courseList12);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        int int7 = studentManager0.getTotalStudents();
        int int8 = studentManager0.getTotalStudents();
        Student student9 = null;
        java.util.List<Course> courseList10 = studentManager0.getCourses(student9);
        int int11 = studentManager0.getTotalStudents();
        Student student12 = null;
        Course course13 = null;
        studentManager0.registerCourse(student12, course13);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(courseList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        Course course6 = null;
        studentManager0.registerCourse(student5, course6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        Student student10 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList9);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        int int5 = studentManager0.getTotalStudents();
        Student student6 = null;
        java.util.List<Course> courseList7 = studentManager0.getCourses(student6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        int int10 = studentManager0.getTotalStudents();
        Student student11 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(courseList7);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        Course course6 = null;
        studentManager0.registerCourse(student5, course6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        int int12 = studentManager0.getTotalStudents();
        int int13 = studentManager0.getTotalStudents();
        Student student14 = null;
        java.util.List<Course> courseList15 = studentManager0.getCourses(student14);
        Student student16 = null;
        java.util.List<Course> courseList17 = studentManager0.getCourses(student16);
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertNotNull(courseList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(courseList15);
        org.junit.Assert.assertNotNull(courseList17);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        int int7 = studentManager0.getTotalStudents();
        int int8 = studentManager0.getTotalStudents();
        int int9 = studentManager0.getTotalStudents();
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        int int12 = studentManager0.getTotalStudents();
        int int13 = studentManager0.getTotalStudents();
        int int14 = studentManager0.getTotalStudents();
        Student student15 = null;
        java.util.List<Course> courseList16 = studentManager0.getCourses(student15);
        Student student17 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(courseList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(courseList16);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        int int7 = studentManager0.getTotalStudents();
        Student student8 = null;
        Course course9 = null;
        studentManager0.registerCourse(student8, course9);
        Student student11 = null;
        java.util.List<Course> courseList12 = studentManager0.getCourses(student11);
        Student student13 = null;
        java.util.List<Course> courseList14 = studentManager0.getCourses(student13);
        int int15 = studentManager0.getTotalStudents();
        Student student16 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.addStudent(student16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(courseList12);
        org.junit.Assert.assertNotNull(courseList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        Course course6 = null;
        studentManager0.registerCourse(student5, course6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        int int10 = studentManager0.getTotalStudents();
        int int11 = studentManager0.getTotalStudents();
        Student student12 = null;
        java.util.List<Course> courseList13 = studentManager0.getCourses(student12);
        Student student14 = null;
        Course course15 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student14, course15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(courseList13);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        Student student7 = null;
        java.util.List<Course> courseList8 = studentManager0.getCourses(student7);
        Student student9 = null;
        java.util.List<Course> courseList10 = studentManager0.getCourses(student9);
        int int11 = studentManager0.getTotalStudents();
        Student student12 = null;
        Course course13 = null;
        studentManager0.registerCourse(student12, course13);
        Student student15 = null;
        java.util.List<Course> courseList16 = studentManager0.getCourses(student15);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertNotNull(courseList8);
        org.junit.Assert.assertNotNull(courseList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(courseList16);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        int int5 = studentManager0.getTotalStudents();
        Student student6 = null;
        java.util.List<Course> courseList7 = studentManager0.getCourses(student6);
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        Student student10 = null;
        Course course11 = null;
        studentManager0.registerCourse(student10, course11);
        Student student13 = null;
        java.util.List<Course> courseList14 = studentManager0.getCourses(student13);
        java.lang.Class<?> wildcardClass15 = studentManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(courseList7);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertNotNull(courseList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        int int7 = studentManager0.getTotalStudents();
        int int8 = studentManager0.getTotalStudents();
        int int9 = studentManager0.getTotalStudents();
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        int int12 = studentManager0.getTotalStudents();
        int int13 = studentManager0.getTotalStudents();
        int int14 = studentManager0.getTotalStudents();
        int int15 = studentManager0.getTotalStudents();
        Student student16 = null;
        java.util.List<Course> courseList17 = studentManager0.getCourses(student16);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(courseList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(courseList17);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        int int7 = studentManager0.getTotalStudents();
        Student student8 = null;
        Course course9 = null;
        studentManager0.registerCourse(student8, course9);
        Student student11 = null;
        java.util.List<Course> courseList12 = studentManager0.getCourses(student11);
        Student student13 = null;
        java.util.List<Course> courseList14 = studentManager0.getCourses(student13);
        int int15 = studentManager0.getTotalStudents();
        Student student16 = null;
        java.util.List<Course> courseList17 = studentManager0.getCourses(student16);
        int int18 = studentManager0.getTotalStudents();
        Student student19 = null;
        java.util.List<Course> courseList20 = studentManager0.getCourses(student19);
        Student student21 = null;
        java.util.List<Course> courseList22 = studentManager0.getCourses(student21);
        java.lang.Class<?> wildcardClass23 = courseList22.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(courseList12);
        org.junit.Assert.assertNotNull(courseList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(courseList17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(courseList20);
        org.junit.Assert.assertNotNull(courseList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        int int4 = studentManager0.getTotalStudents();
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        int int7 = studentManager0.getTotalStudents();
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        int int10 = studentManager0.getTotalStudents();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        StudentManager studentManager0 = new StudentManager();
        Student student1 = null;
        studentManager0.addStudent(student1);
        Student student3 = null;
        java.util.List<Course> courseList4 = studentManager0.getCourses(student3);
        Student student5 = null;
        java.util.List<Course> courseList6 = studentManager0.getCourses(student5);
        int int7 = studentManager0.getTotalStudents();
        int int8 = studentManager0.getTotalStudents();
        int int9 = studentManager0.getTotalStudents();
        Student student10 = null;
        Course course11 = null;
        studentManager0.registerCourse(student10, course11);
        org.junit.Assert.assertNotNull(courseList4);
        org.junit.Assert.assertNotNull(courseList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        StudentManager studentManager0 = new StudentManager();
        int int1 = studentManager0.getTotalStudents();
        Student student2 = null;
        studentManager0.addStudent(student2);
        Student student4 = null;
        Course course5 = null;
        studentManager0.registerCourse(student4, course5);
        int int7 = studentManager0.getTotalStudents();
        Student student8 = null;
        java.util.List<Course> courseList9 = studentManager0.getCourses(student8);
        Student student10 = null;
        java.util.List<Course> courseList11 = studentManager0.getCourses(student10);
        Student student12 = null;
        java.util.List<Course> courseList13 = studentManager0.getCourses(student12);
        int int14 = studentManager0.getTotalStudents();
        Student student15 = null;
        java.util.List<Course> courseList16 = studentManager0.getCourses(student15);
        Student student17 = null;
        Course course18 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentManager0.registerCourse(student17, course18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Already registered");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(courseList9);
        org.junit.Assert.assertNotNull(courseList11);
        org.junit.Assert.assertNotNull(courseList13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(courseList16);
    }
}

