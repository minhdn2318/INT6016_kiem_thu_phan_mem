import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test1");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        App app0 = new App();
        java.lang.Class<?> wildcardClass1 = app0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        App app0 = new App();
        App app1 = new App();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "hi!" };
        app1.run(strArray6);
        app0.run(strArray6);
        java.lang.Class<?> wildcardClass9 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test4");
        App app0 = new App();
        App app1 = new App();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "hi!" };
        app1.run(strArray6);
        app0.run(strArray6);
        java.lang.Class<?> wildcardClass9 = app0.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test5");
        App app0 = new App();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!" };
        app0.run(strArray5);
        java.lang.Class<?> wildcardClass7 = app0.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test6");
        App app0 = new App();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!" };
        app0.run(strArray5);
        java.lang.String[] strArray7 = null;
        // The following exception was thrown during execution in test generation
        try {
            app0.run(strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test7");
        App app0 = new App();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!" };
        app0.run(strArray5);
        java.lang.Class<?> wildcardClass7 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test8() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test8");
        App app0 = new App();
        App app1 = new App();
        App app2 = new App();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!", "", "hi!" };
        app2.run(strArray7);
        app1.run(strArray7);
        App app10 = new App();
        App app11 = new App();
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!" };
        app11.run(strArray16);
        app10.run(strArray16);
        app1.run(strArray16);
        app0.run(strArray16);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "hi!", "", "hi!" });
    }
}

