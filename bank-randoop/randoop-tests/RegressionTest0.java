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
        Customer customer2 = new Customer("", 1);
        java.lang.String str3 = customer2.getName();
        java.lang.Class<?> wildcardClass4 = customer2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        Customer customer2 = new Customer("", 1);
        java.lang.String str3 = customer2.getName();
        int int4 = customer2.getCurrentDebt();
        // The following exception was thrown during execution in test generation
        try {
            customer2.makePurchase((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Credit limit exceeded");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        Customer customer2 = new Customer("hi!", 100);
        java.lang.Class<?> wildcardClass3 = customer2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        customer2.makePurchase((int) '#');
        customer2.makePurchase((int) (short) 1);
        int int9 = customer2.getRemainingCredit();
        java.lang.Class<?> wildcardClass10 = customer2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        Customer customer2 = new Customer("hi!", 10);
        int int3 = customer2.getRemainingCredit();
        int int4 = customer2.getCurrentDebt();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        Customer customer2 = new Customer("hi!", 10);
        java.lang.Class<?> wildcardClass3 = customer2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        Customer customer2 = new Customer("hi!", 10);
        int int3 = customer2.getCurrentDebt();
        // The following exception was thrown during execution in test generation
        try {
            customer2.makePurchase(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Credit limit exceeded");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getCurrentDebt();
        java.lang.Class<?> wildcardClass5 = customer2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        customer2.makePurchase((int) '#');
        int int7 = customer2.getRemainingCredit();
        // The following exception was thrown during execution in test generation
        try {
            customer2.makePurchase(67);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Credit limit exceeded");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 65 + "'", int7 == 65);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        Customer customer2 = new Customer("", 1);
        java.lang.String str3 = customer2.getName();
        int int4 = customer2.getRemainingCredit();
        java.lang.String str5 = customer2.getName();
        java.lang.String str6 = customer2.getName();
        // The following exception was thrown during execution in test generation
        try {
            customer2.makePurchase((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Credit limit exceeded");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        customer2.makePurchase((int) '#');
        customer2.makePurchase((int) (short) 1);
        java.lang.Class<?> wildcardClass9 = customer2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        Customer customer2 = new Customer("hi!", 10);
        int int3 = customer2.getCurrentDebt();
        java.lang.Class<?> wildcardClass4 = customer2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        Customer customer2 = new Customer("", 1);
        java.lang.String str3 = customer2.getName();
        int int4 = customer2.getRemainingCredit();
        java.lang.String str5 = customer2.getName();
        // The following exception was thrown during execution in test generation
        try {
            customer2.makePurchase(36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Credit limit exceeded");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        customer2.makePurchase((int) '#');
        customer2.makePurchase((int) (short) 1);
        int int9 = customer2.getRemainingCredit();
        int int10 = customer2.getCurrentDebt();
        java.lang.String str11 = customer2.getName();
        java.lang.Class<?> wildcardClass12 = customer2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 36 + "'", int10 == 36);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        customer2.makePurchase((int) '#');
        java.lang.Class<?> wildcardClass7 = customer2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        Customer customer2 = new Customer("", 1);
        java.lang.String str3 = customer2.getName();
        int int4 = customer2.getCurrentDebt();
        int int5 = customer2.getRemainingCredit();
        int int6 = customer2.getRemainingCredit();
        // The following exception was thrown during execution in test generation
        try {
            customer2.makePurchase(64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Credit limit exceeded");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        Customer customer2 = new Customer("hi!", 10);
        int int3 = customer2.getCurrentDebt();
        // The following exception was thrown during execution in test generation
        try {
            customer2.makePurchase((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Credit limit exceeded");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        Customer customer2 = new Customer("", (int) (short) -1);
        java.lang.Class<?> wildcardClass3 = customer2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        customer2.makePurchase((int) '#');
        int int7 = customer2.getRemainingCredit();
        customer2.makePurchase((int) ' ');
        java.lang.String str10 = customer2.getName();
        customer2.makePurchase(0);
        java.lang.Class<?> wildcardClass13 = customer2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 65 + "'", int7 == 65);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        Customer customer2 = new Customer("", 1);
        java.lang.String str3 = customer2.getName();
        int int4 = customer2.getCurrentDebt();
        int int5 = customer2.getRemainingCredit();
        int int6 = customer2.getCurrentDebt();
        java.lang.Class<?> wildcardClass7 = customer2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        Customer customer2 = new Customer("hi!", 10);
        int int3 = customer2.getCurrentDebt();
        // The following exception was thrown during execution in test generation
        try {
            customer2.makePurchase((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid amount");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        Customer customer2 = new Customer("", (int) (short) -1);
        int int3 = customer2.getRemainingCredit();
        java.lang.String str4 = customer2.getName();
        int int5 = customer2.getCurrentDebt();
        // The following exception was thrown during execution in test generation
        try {
            customer2.makePurchase((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid amount");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        customer2.makePurchase((int) '#');
        int int7 = customer2.getRemainingCredit();
        customer2.makePurchase((int) (byte) 10);
        java.lang.Class<?> wildcardClass10 = customer2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 65 + "'", int7 == 65);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getRemainingCredit();
        java.lang.Class<?> wildcardClass4 = customer2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        customer2.makePurchase((int) '#');
        customer2.makePurchase((int) (short) 1);
        int int9 = customer2.getRemainingCredit();
        int int10 = customer2.getCurrentDebt();
        java.lang.Class<?> wildcardClass11 = customer2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 36 + "'", int10 == 36);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        Customer customer2 = new Customer("", 1);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getCurrentDebt();
        java.lang.Class<?> wildcardClass5 = customer2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        Customer customer2 = new Customer("", 1);
        java.lang.String str3 = customer2.getName();
        int int4 = customer2.getCurrentDebt();
        int int5 = customer2.getCurrentDebt();
        java.lang.String str6 = customer2.getName();
        java.lang.Class<?> wildcardClass7 = customer2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        Customer customer2 = new Customer("hi!", (int) 'a');
        int int3 = customer2.getCurrentDebt();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        customer2.makePurchase((int) '#');
        int int7 = customer2.getRemainingCredit();
        customer2.makePurchase((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            customer2.makePurchase((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid amount");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 65 + "'", int7 == 65);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        Customer customer2 = new Customer("hi!", (int) 'a');
        java.lang.Class<?> wildcardClass3 = customer2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        Customer customer2 = new Customer("", 1);
        java.lang.String str3 = customer2.getName();
        int int4 = customer2.getRemainingCredit();
        java.lang.String str5 = customer2.getName();
        // The following exception was thrown during execution in test generation
        try {
            customer2.makePurchase(64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Credit limit exceeded");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        customer2.makePurchase((int) '#');
        customer2.makePurchase((int) (short) 1);
        int int9 = customer2.getRemainingCredit();
        int int10 = customer2.getRemainingCredit();
        java.lang.Class<?> wildcardClass11 = customer2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        Customer customer2 = new Customer("hi!", 10);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        java.lang.Class<?> wildcardClass5 = customer2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        customer2.makePurchase((int) '#');
        customer2.makePurchase((int) (short) 1);
        int int9 = customer2.getRemainingCredit();
        java.lang.String str10 = customer2.getName();
        java.lang.String str11 = customer2.getName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        Customer customer2 = new Customer("hi!", 0);
        int int3 = customer2.getRemainingCredit();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        customer2.makePurchase((int) '#');
        int int7 = customer2.getRemainingCredit();
        customer2.makePurchase((int) ' ');
        java.lang.String str10 = customer2.getName();
        customer2.makePurchase(0);
        // The following exception was thrown during execution in test generation
        try {
            customer2.makePurchase(67);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Credit limit exceeded");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 65 + "'", int7 == 65);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        java.lang.String str5 = customer2.getName();
        java.lang.Class<?> wildcardClass6 = customer2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        customer2.makePurchase((int) '#');
        customer2.makePurchase((int) (short) 1);
        int int9 = customer2.getRemainingCredit();
        int int10 = customer2.getRemainingCredit();
        // The following exception was thrown during execution in test generation
        try {
            customer2.makePurchase((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Credit limit exceeded");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        customer2.makePurchase((int) '#');
        int int7 = customer2.getRemainingCredit();
        customer2.makePurchase((int) ' ');
        java.lang.String str10 = customer2.getName();
        customer2.makePurchase(0);
        int int13 = customer2.getRemainingCredit();
        int int14 = customer2.getCurrentDebt();
        java.lang.Class<?> wildcardClass15 = customer2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 65 + "'", int7 == 65);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 33 + "'", int13 == 33);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 67 + "'", int14 == 67);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        Customer customer2 = new Customer("hi!", 0);
        java.lang.String str3 = customer2.getName();
        int int4 = customer2.getRemainingCredit();
        java.lang.Class<?> wildcardClass5 = customer2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        Customer customer2 = new Customer("", 1);
        java.lang.String str3 = customer2.getName();
        java.lang.String str4 = customer2.getName();
        java.lang.String str5 = customer2.getName();
        java.lang.Class<?> wildcardClass6 = customer2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        Customer customer2 = new Customer("", (int) (short) -1);
        int int3 = customer2.getRemainingCredit();
        // The following exception was thrown during execution in test generation
        try {
            customer2.makePurchase((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid amount");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        Customer customer2 = new Customer("", 1);
        java.lang.String str3 = customer2.getName();
        int int4 = customer2.getRemainingCredit();
        java.lang.String str5 = customer2.getName();
        java.lang.String str6 = customer2.getName();
        java.lang.Class<?> wildcardClass7 = customer2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        Customer customer2 = new Customer("", (int) (byte) 100);
        java.lang.Class<?> wildcardClass3 = customer2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        Customer customer2 = new Customer("", 1);
        java.lang.String str3 = customer2.getName();
        int int4 = customer2.getCurrentDebt();
        int int5 = customer2.getCurrentDebt();
        int int6 = customer2.getRemainingCredit();
        int int7 = customer2.getRemainingCredit();
        java.lang.String str8 = customer2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        Customer customer2 = new Customer("hi!", 100);
        customer2.makePurchase(65);
        // The following exception was thrown during execution in test generation
        try {
            customer2.makePurchase((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Credit limit exceeded");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        Customer customer2 = new Customer("hi!", 36);
        int int3 = customer2.getCurrentDebt();
        java.lang.Class<?> wildcardClass4 = customer2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        Customer customer2 = new Customer("", 1);
        java.lang.String str3 = customer2.getName();
        int int4 = customer2.getCurrentDebt();
        int int5 = customer2.getCurrentDebt();
        int int6 = customer2.getRemainingCredit();
        int int7 = customer2.getRemainingCredit();
        // The following exception was thrown during execution in test generation
        try {
            customer2.makePurchase((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Credit limit exceeded");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        Customer customer2 = new Customer("hi!", (int) (byte) -1);
        java.lang.String str3 = customer2.getName();
        // The following exception was thrown during execution in test generation
        try {
            customer2.makePurchase((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Credit limit exceeded");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        Customer customer2 = new Customer("", 1);
        java.lang.String str3 = customer2.getName();
        int int4 = customer2.getCurrentDebt();
        int int5 = customer2.getRemainingCredit();
        // The following exception was thrown during execution in test generation
        try {
            customer2.makePurchase((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid amount");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        Customer customer2 = new Customer("hi!", 100);
        customer2.makePurchase(65);
        // The following exception was thrown during execution in test generation
        try {
            customer2.makePurchase(36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Credit limit exceeded");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        Customer customer2 = new Customer("", 68);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        Customer customer2 = new Customer("", 65);
        int int3 = customer2.getRemainingCredit();
        customer2.makePurchase(36);
        java.lang.Class<?> wildcardClass6 = customer2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 65 + "'", int3 == 65);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        Customer customer2 = new Customer("", 65);
        java.lang.String str3 = customer2.getName();
        java.lang.Class<?> wildcardClass4 = customer2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        customer2.makePurchase((int) '#');
        customer2.makePurchase((int) (short) 1);
        int int9 = customer2.getRemainingCredit();
        int int10 = customer2.getCurrentDebt();
        java.lang.String str11 = customer2.getName();
        int int12 = customer2.getRemainingCredit();
        int int13 = customer2.getCurrentDebt();
        java.lang.Class<?> wildcardClass14 = customer2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 36 + "'", int10 == 36);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 36 + "'", int13 == 36);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        customer2.makePurchase((int) '#');
        int int7 = customer2.getRemainingCredit();
        customer2.makePurchase((int) ' ');
        java.lang.String str10 = customer2.getName();
        customer2.makePurchase(0);
        int int13 = customer2.getRemainingCredit();
        int int14 = customer2.getCurrentDebt();
        java.lang.String str15 = customer2.getName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 65 + "'", int7 == 65);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 33 + "'", int13 == 33);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 67 + "'", int14 == 67);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        Customer customer2 = new Customer("hi!", (int) (byte) -1);
        java.lang.String str3 = customer2.getName();
        // The following exception was thrown during execution in test generation
        try {
            customer2.makePurchase(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Credit limit exceeded");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        Customer customer2 = new Customer("", (int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = customer2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        int int5 = customer2.getCurrentDebt();
        int int6 = customer2.getRemainingCredit();
        java.lang.String str7 = customer2.getName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        customer2.makePurchase((int) '#');
        int int7 = customer2.getRemainingCredit();
        customer2.makePurchase((int) (byte) 10);
        int int10 = customer2.getCurrentDebt();
        customer2.makePurchase((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 65 + "'", int7 == 65);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 45 + "'", int10 == 45);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        Customer customer2 = new Customer("", 1);
        java.lang.String str3 = customer2.getName();
        java.lang.String str4 = customer2.getName();
        java.lang.String str5 = customer2.getName();
        // The following exception was thrown during execution in test generation
        try {
            customer2.makePurchase(68);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Credit limit exceeded");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        Customer customer2 = new Customer("hi!", 0);
        java.lang.String str3 = customer2.getName();
        // The following exception was thrown during execution in test generation
        try {
            customer2.makePurchase(68);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Credit limit exceeded");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        Customer customer2 = new Customer("", (int) (byte) 0);
        int int3 = customer2.getRemainingCredit();
        java.lang.String str4 = customer2.getName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        customer2.makePurchase((int) '#');
        customer2.makePurchase((int) (short) 1);
        int int9 = customer2.getRemainingCredit();
        int int10 = customer2.getCurrentDebt();
        java.lang.String str11 = customer2.getName();
        int int12 = customer2.getRemainingCredit();
        customer2.makePurchase((int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 36 + "'", int10 == 36);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        Customer customer2 = new Customer("", 1);
        java.lang.String str3 = customer2.getName();
        int int4 = customer2.getCurrentDebt();
        int int5 = customer2.getCurrentDebt();
        java.lang.String str6 = customer2.getName();
        java.lang.String str7 = customer2.getName();
        java.lang.String str8 = customer2.getName();
        java.lang.Class<?> wildcardClass9 = customer2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        customer2.makePurchase((int) '#');
        int int7 = customer2.getRemainingCredit();
        customer2.makePurchase((int) ' ');
        java.lang.Class<?> wildcardClass10 = customer2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 65 + "'", int7 == 65);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        Customer customer2 = new Customer("", (int) (short) -1);
        int int3 = customer2.getRemainingCredit();
        // The following exception was thrown during execution in test generation
        try {
            customer2.makePurchase(67);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Credit limit exceeded");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        int int5 = customer2.getCurrentDebt();
        int int6 = customer2.getRemainingCredit();
        int int7 = customer2.getRemainingCredit();
        java.lang.Class<?> wildcardClass8 = customer2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        Customer customer2 = new Customer("", (int) (short) -1);
        int int3 = customer2.getRemainingCredit();
        // The following exception was thrown during execution in test generation
        try {
            customer2.makePurchase((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Credit limit exceeded");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        customer2.makePurchase((int) '#');
        int int7 = customer2.getRemainingCredit();
        customer2.makePurchase((int) ' ');
        java.lang.String str10 = customer2.getName();
        customer2.makePurchase(0);
        int int13 = customer2.getRemainingCredit();
        int int14 = customer2.getRemainingCredit();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 65 + "'", int7 == 65);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 33 + "'", int13 == 33);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 33 + "'", int14 == 33);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        Customer customer2 = new Customer("", (int) (byte) 0);
        int int3 = customer2.getRemainingCredit();
        java.lang.Class<?> wildcardClass4 = customer2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        Customer customer2 = new Customer("", (int) (short) -1);
        int int3 = customer2.getRemainingCredit();
        java.lang.String str4 = customer2.getName();
        int int5 = customer2.getCurrentDebt();
        java.lang.Class<?> wildcardClass6 = customer2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        Customer customer2 = new Customer("", 90);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        Customer customer2 = new Customer("", 1);
        java.lang.String str3 = customer2.getName();
        int int4 = customer2.getCurrentDebt();
        int int5 = customer2.getCurrentDebt();
        int int6 = customer2.getRemainingCredit();
        int int7 = customer2.getRemainingCredit();
        java.lang.Class<?> wildcardClass8 = customer2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getRemainingCredit();
        customer2.makePurchase(1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        Customer customer2 = new Customer("", 1);
        java.lang.String str3 = customer2.getName();
        int int4 = customer2.getCurrentDebt();
        int int5 = customer2.getRemainingCredit();
        // The following exception was thrown during execution in test generation
        try {
            customer2.makePurchase((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Credit limit exceeded");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getRemainingCredit();
        customer2.makePurchase((int) '4');
        int int6 = customer2.getRemainingCredit();
        // The following exception was thrown during execution in test generation
        try {
            customer2.makePurchase((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Credit limit exceeded");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        Customer customer2 = new Customer("", (int) (byte) -1);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        Customer customer2 = new Customer("", 1);
        java.lang.String str3 = customer2.getName();
        int int4 = customer2.getCurrentDebt();
        int int5 = customer2.getCurrentDebt();
        java.lang.String str6 = customer2.getName();
        int int7 = customer2.getRemainingCredit();
        int int8 = customer2.getRemainingCredit();
        java.lang.String str9 = customer2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        Customer customer2 = new Customer("", 1);
        java.lang.String str3 = customer2.getName();
        int int4 = customer2.getCurrentDebt();
        int int5 = customer2.getRemainingCredit();
        int int6 = customer2.getCurrentDebt();
        int int7 = customer2.getRemainingCredit();
        java.lang.String str8 = customer2.getName();
        java.lang.Class<?> wildcardClass9 = customer2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        Customer customer2 = new Customer("", 65);
        int int3 = customer2.getRemainingCredit();
        customer2.makePurchase(36);
        java.lang.String str6 = customer2.getName();
        // The following exception was thrown during execution in test generation
        try {
            customer2.makePurchase(67);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Credit limit exceeded");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 65 + "'", int3 == 65);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        Customer customer2 = new Customer("", 100);
        java.lang.String str3 = customer2.getName();
        java.lang.String str4 = customer2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        Customer customer2 = new Customer("hi!", 100);
        customer2.makePurchase(65);
        customer2.makePurchase(35);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        Customer customer2 = new Customer("hi!", 97);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        Customer customer2 = new Customer("", 67);
        customer2.makePurchase(10);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        Customer customer2 = new Customer("", 1);
        java.lang.String str3 = customer2.getName();
        int int4 = customer2.getRemainingCredit();
        java.lang.String str5 = customer2.getName();
        java.lang.Class<?> wildcardClass6 = customer2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        customer2.makePurchase((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        Customer customer2 = new Customer("", 0);
        // The following exception was thrown during execution in test generation
        try {
            customer2.makePurchase(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Credit limit exceeded");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        Customer customer2 = new Customer("", 1);
        java.lang.String str3 = customer2.getName();
        int int4 = customer2.getCurrentDebt();
        int int5 = customer2.getRemainingCredit();
        java.lang.Class<?> wildcardClass6 = customer2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        Customer customer2 = new Customer("hi!", 10);
        int int3 = customer2.getRemainingCredit();
        int int4 = customer2.getRemainingCredit();
        // The following exception was thrown during execution in test generation
        try {
            customer2.makePurchase((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Credit limit exceeded");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        Customer customer2 = new Customer("", 1);
        java.lang.String str3 = customer2.getName();
        int int4 = customer2.getCurrentDebt();
        int int5 = customer2.getCurrentDebt();
        int int6 = customer2.getRemainingCredit();
        int int7 = customer2.getCurrentDebt();
        int int8 = customer2.getCurrentDebt();
        java.lang.Class<?> wildcardClass9 = customer2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        customer2.makePurchase((int) '#');
        int int7 = customer2.getRemainingCredit();
        customer2.makePurchase((int) ' ');
        java.lang.String str10 = customer2.getName();
        customer2.makePurchase(0);
        customer2.makePurchase((int) (short) 1);
        java.lang.Class<?> wildcardClass15 = customer2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 65 + "'", int7 == 65);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        Customer customer2 = new Customer("hi!", 10);
        int int3 = customer2.getRemainingCredit();
        int int4 = customer2.getRemainingCredit();
        customer2.makePurchase((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        customer2.makePurchase((int) '#');
        int int7 = customer2.getRemainingCredit();
        customer2.makePurchase((int) ' ');
        java.lang.String str10 = customer2.getName();
        customer2.makePurchase(0);
        customer2.makePurchase((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            customer2.makePurchase(45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Credit limit exceeded");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 65 + "'", int7 == 65);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        customer2.makePurchase((int) '#');
        int int7 = customer2.getRemainingCredit();
        customer2.makePurchase((int) (byte) 10);
        int int10 = customer2.getRemainingCredit();
        java.lang.Class<?> wildcardClass11 = customer2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 65 + "'", int7 == 65);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 55 + "'", int10 == 55);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        Customer customer2 = new Customer("", 1);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getCurrentDebt();
        int int5 = customer2.getRemainingCredit();
        java.lang.Class<?> wildcardClass6 = customer2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        customer2.makePurchase((int) '#');
        int int7 = customer2.getRemainingCredit();
        customer2.makePurchase((int) ' ');
        java.lang.String str10 = customer2.getName();
        customer2.makePurchase(0);
        // The following exception was thrown during execution in test generation
        try {
            customer2.makePurchase((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid amount");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 65 + "'", int7 == 65);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        Customer customer2 = new Customer("", 1);
        java.lang.String str3 = customer2.getName();
        int int4 = customer2.getCurrentDebt();
        int int5 = customer2.getRemainingCredit();
        int int6 = customer2.getCurrentDebt();
        // The following exception was thrown during execution in test generation
        try {
            customer2.makePurchase((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid amount");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        Customer customer2 = new Customer("", (int) 'a');
        customer2.makePurchase(1);
        java.lang.String str5 = customer2.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        Customer customer2 = new Customer("hi!", 10);
        int int3 = customer2.getRemainingCredit();
        customer2.makePurchase((int) (byte) 10);
        int int6 = customer2.getCurrentDebt();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        Customer customer2 = new Customer("", (int) (short) -1);
        int int3 = customer2.getRemainingCredit();
        java.lang.Class<?> wildcardClass4 = customer2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        Customer customer2 = new Customer("", 65);
        int int3 = customer2.getRemainingCredit();
        int int4 = customer2.getRemainingCredit();
        java.lang.Class<?> wildcardClass5 = customer2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 65 + "'", int3 == 65);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 65 + "'", int4 == 65);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        Customer customer2 = new Customer("hi!", (int) (short) 10);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        Customer customer2 = new Customer("hi!", 36);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        int int5 = customer2.getCurrentDebt();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 36 + "'", int4 == 36);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        Customer customer2 = new Customer("", 1);
        java.lang.String str3 = customer2.getName();
        int int4 = customer2.getCurrentDebt();
        int int5 = customer2.getRemainingCredit();
        int int6 = customer2.getCurrentDebt();
        int int7 = customer2.getRemainingCredit();
        java.lang.String str8 = customer2.getName();
        java.lang.String str9 = customer2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        Customer customer2 = new Customer("", 100);
        int int3 = customer2.getRemainingCredit();
        int int4 = customer2.getCurrentDebt();
        int int5 = customer2.getCurrentDebt();
        customer2.makePurchase((int) (short) 100);
        int int8 = customer2.getRemainingCredit();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        Customer customer2 = new Customer("hi!", 48);
        int int3 = customer2.getCurrentDebt();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        Customer customer2 = new Customer("hi!", 36);
        java.lang.String str3 = customer2.getName();
        // The following exception was thrown during execution in test generation
        try {
            customer2.makePurchase(65);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Credit limit exceeded");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        Customer customer2 = new Customer("", (int) (short) 1);
        java.lang.String str3 = customer2.getName();
        // The following exception was thrown during execution in test generation
        try {
            customer2.makePurchase((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Credit limit exceeded");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        customer2.makePurchase((int) '#');
        int int7 = customer2.getRemainingCredit();
        java.lang.Class<?> wildcardClass8 = customer2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 65 + "'", int7 == 65);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        Customer customer2 = new Customer("", 0);
        // The following exception was thrown during execution in test generation
        try {
            customer2.makePurchase((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Credit limit exceeded");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        int int5 = customer2.getCurrentDebt();
        customer2.makePurchase(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        Customer customer2 = new Customer("", (int) (short) 1);
        java.lang.String str3 = customer2.getName();
        int int4 = customer2.getRemainingCredit();
        // The following exception was thrown during execution in test generation
        try {
            customer2.makePurchase(36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Credit limit exceeded");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        Customer customer2 = new Customer("hi!", 10);
        int int3 = customer2.getRemainingCredit();
        int int4 = customer2.getRemainingCredit();
        customer2.makePurchase(1);
        int int7 = customer2.getCurrentDebt();
        int int8 = customer2.getCurrentDebt();
        java.lang.Class<?> wildcardClass9 = customer2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        Customer customer2 = new Customer("", (int) (short) 100);
        java.lang.String str3 = customer2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        Customer customer2 = new Customer("", 35);
        customer2.makePurchase((int) (byte) 1);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        customer2.makePurchase((int) '#');
        int int7 = customer2.getRemainingCredit();
        customer2.makePurchase((int) ' ');
        java.lang.String str10 = customer2.getName();
        customer2.makePurchase(0);
        customer2.makePurchase((int) (short) 1);
        int int15 = customer2.getCurrentDebt();
        java.lang.Class<?> wildcardClass16 = customer2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 65 + "'", int7 == 65);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 68 + "'", int15 == 68);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        Customer customer2 = new Customer("hi!", (int) (short) 0);
        int int3 = customer2.getRemainingCredit();
        java.lang.String str4 = customer2.getName();
        int int5 = customer2.getCurrentDebt();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        Customer customer2 = new Customer("hi!", 0);
        int int3 = customer2.getCurrentDebt();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        Customer customer2 = new Customer("hi!", 10);
        int int3 = customer2.getRemainingCredit();
        int int4 = customer2.getRemainingCredit();
        customer2.makePurchase(1);
        int int7 = customer2.getCurrentDebt();
        // The following exception was thrown during execution in test generation
        try {
            customer2.makePurchase((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Credit limit exceeded");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        customer2.makePurchase((int) '#');
        int int7 = customer2.getRemainingCredit();
        customer2.makePurchase((int) (byte) 10);
        int int10 = customer2.getCurrentDebt();
        customer2.makePurchase((int) (short) 0);
        java.lang.Class<?> wildcardClass13 = customer2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 65 + "'", int7 == 65);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 45 + "'", int10 == 45);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        Customer customer2 = new Customer("", 1);
        java.lang.String str3 = customer2.getName();
        int int4 = customer2.getCurrentDebt();
        int int5 = customer2.getCurrentDebt();
        java.lang.String str6 = customer2.getName();
        int int7 = customer2.getRemainingCredit();
        int int8 = customer2.getRemainingCredit();
        int int9 = customer2.getRemainingCredit();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        Customer customer2 = new Customer("", 1);
        java.lang.String str3 = customer2.getName();
        int int4 = customer2.getCurrentDebt();
        java.lang.String str5 = customer2.getName();
        int int6 = customer2.getRemainingCredit();
        int int7 = customer2.getCurrentDebt();
        int int8 = customer2.getRemainingCredit();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        Customer customer2 = new Customer("", 1);
        java.lang.String str3 = customer2.getName();
        int int4 = customer2.getCurrentDebt();
        int int5 = customer2.getRemainingCredit();
        int int6 = customer2.getCurrentDebt();
        int int7 = customer2.getRemainingCredit();
        customer2.makePurchase(0);
        int int10 = customer2.getRemainingCredit();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        Customer customer2 = new Customer("hi!", (int) (byte) -1);
        java.lang.String str3 = customer2.getName();
        int int4 = customer2.getRemainingCredit();
        java.lang.String str5 = customer2.getName();
        java.lang.Class<?> wildcardClass6 = customer2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        Customer customer2 = new Customer("", (int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = customer2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        Customer customer2 = new Customer("", 1);
        java.lang.String str3 = customer2.getName();
        int int4 = customer2.getCurrentDebt();
        int int5 = customer2.getCurrentDebt();
        int int6 = customer2.getRemainingCredit();
        int int7 = customer2.getRemainingCredit();
        // The following exception was thrown during execution in test generation
        try {
            customer2.makePurchase(68);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Credit limit exceeded");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        Customer customer2 = new Customer("", 1);
        java.lang.String str3 = customer2.getName();
        int int4 = customer2.getCurrentDebt();
        int int5 = customer2.getCurrentDebt();
        java.lang.String str6 = customer2.getName();
        java.lang.String str7 = customer2.getName();
        java.lang.Class<?> wildcardClass8 = customer2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        java.lang.String str4 = customer2.getName();
        int int5 = customer2.getRemainingCredit();
        int int6 = customer2.getCurrentDebt();
        int int7 = customer2.getRemainingCredit();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        Customer customer2 = new Customer("", 65);
        // The following exception was thrown during execution in test generation
        try {
            customer2.makePurchase(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Credit limit exceeded");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        Customer customer2 = new Customer("", 1);
        java.lang.String str3 = customer2.getName();
        int int4 = customer2.getCurrentDebt();
        int int5 = customer2.getCurrentDebt();
        int int6 = customer2.getRemainingCredit();
        int int7 = customer2.getRemainingCredit();
        int int8 = customer2.getRemainingCredit();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        Customer customer2 = new Customer("", (int) (short) 1);
        java.lang.Class<?> wildcardClass3 = customer2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        Customer customer2 = new Customer("", (int) (byte) 100);
        java.lang.String str3 = customer2.getName();
        java.lang.Class<?> wildcardClass4 = customer2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        Customer customer2 = new Customer("", 1);
        java.lang.String str3 = customer2.getName();
        int int4 = customer2.getCurrentDebt();
        int int5 = customer2.getRemainingCredit();
        int int6 = customer2.getCurrentDebt();
        int int7 = customer2.getRemainingCredit();
        java.lang.String str8 = customer2.getName();
        // The following exception was thrown during execution in test generation
        try {
            customer2.makePurchase(87);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Credit limit exceeded");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        Customer customer2 = new Customer("", 67);
        java.lang.Class<?> wildcardClass3 = customer2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        Customer customer2 = new Customer("", 1);
        java.lang.String str3 = customer2.getName();
        int int4 = customer2.getCurrentDebt();
        int int5 = customer2.getRemainingCredit();
        int int6 = customer2.getCurrentDebt();
        int int7 = customer2.getRemainingCredit();
        // The following exception was thrown during execution in test generation
        try {
            customer2.makePurchase(68);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Credit limit exceeded");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        customer2.makePurchase((int) '#');
        customer2.makePurchase((int) (short) 1);
        int int9 = customer2.getRemainingCredit();
        int int10 = customer2.getRemainingCredit();
        int int11 = customer2.getRemainingCredit();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 64 + "'", int11 == 64);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        Customer customer2 = new Customer("hi!", 10);
        int int3 = customer2.getRemainingCredit();
        customer2.makePurchase((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            customer2.makePurchase(9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Credit limit exceeded");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        Customer customer2 = new Customer("", (int) (short) -1);
        int int3 = customer2.getRemainingCredit();
        java.lang.String str4 = customer2.getName();
        int int5 = customer2.getRemainingCredit();
        java.lang.Class<?> wildcardClass6 = customer2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        Customer customer2 = new Customer("", 10);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        int int5 = customer2.getCurrentDebt();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        java.lang.String str4 = customer2.getName();
        customer2.makePurchase((int) (byte) 10);
        int int7 = customer2.getRemainingCredit();
        int int8 = customer2.getRemainingCredit();
        int int9 = customer2.getCurrentDebt();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 90 + "'", int7 == 90);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 90 + "'", int8 == 90);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        Customer customer2 = new Customer("", 48);
        java.lang.Class<?> wildcardClass3 = customer2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        Customer customer2 = new Customer("hi!", (int) (byte) 100);
        java.lang.Class<?> wildcardClass3 = customer2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        java.lang.String str5 = customer2.getName();
        int int6 = customer2.getRemainingCredit();
        java.lang.String str7 = customer2.getName();
        java.lang.String str8 = customer2.getName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        Customer customer2 = new Customer("", 65);
        java.lang.String str3 = customer2.getName();
        java.lang.String str4 = customer2.getName();
        java.lang.String str5 = customer2.getName();
        java.lang.String str6 = customer2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        int int5 = customer2.getCurrentDebt();
        int int6 = customer2.getRemainingCredit();
        customer2.makePurchase(65);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        Customer customer2 = new Customer("", 1);
        java.lang.String str3 = customer2.getName();
        int int4 = customer2.getCurrentDebt();
        int int5 = customer2.getCurrentDebt();
        java.lang.String str6 = customer2.getName();
        java.lang.String str7 = customer2.getName();
        int int8 = customer2.getCurrentDebt();
        java.lang.Class<?> wildcardClass9 = customer2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        Customer customer2 = new Customer("", 1);
        customer2.makePurchase(1);
        java.lang.String str5 = customer2.getName();
        int int6 = customer2.getRemainingCredit();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        Customer customer2 = new Customer("hi!", 100);
        customer2.makePurchase(97);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        Customer customer2 = new Customer("", (int) 'a');
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getCurrentDebt();
        java.lang.Class<?> wildcardClass5 = customer2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getRemainingCredit();
        customer2.makePurchase((int) '4');
        int int6 = customer2.getRemainingCredit();
        int int7 = customer2.getRemainingCredit();
        java.lang.String str8 = customer2.getName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        Customer customer2 = new Customer("", 0);
        // The following exception was thrown during execution in test generation
        try {
            customer2.makePurchase(45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Credit limit exceeded");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        java.lang.String str4 = customer2.getName();
        customer2.makePurchase((int) (byte) 10);
        java.lang.String str7 = customer2.getName();
        java.lang.String str8 = customer2.getName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        Customer customer2 = new Customer("hi!", (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            customer2.makePurchase(48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Credit limit exceeded");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        Customer customer2 = new Customer("", 1);
        customer2.makePurchase(1);
        // The following exception was thrown during execution in test generation
        try {
            customer2.makePurchase((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Credit limit exceeded");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        Customer customer2 = new Customer("hi!", 100);
        customer2.makePurchase(65);
        java.lang.Class<?> wildcardClass5 = customer2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        Customer customer2 = new Customer("", 1);
        java.lang.String str3 = customer2.getName();
        int int4 = customer2.getRemainingCredit();
        java.lang.String str5 = customer2.getName();
        int int6 = customer2.getCurrentDebt();
        java.lang.String str7 = customer2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        Customer customer2 = new Customer("", 65);
        java.lang.String str3 = customer2.getName();
        int int4 = customer2.getRemainingCredit();
        java.lang.String str5 = customer2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 65 + "'", int4 == 65);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        Customer customer2 = new Customer("", (int) (short) 0);
        java.lang.String str3 = customer2.getName();
        // The following exception was thrown during execution in test generation
        try {
            customer2.makePurchase((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Credit limit exceeded");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        customer2.makePurchase((int) '#');
        customer2.makePurchase((int) (short) 1);
        int int9 = customer2.getRemainingCredit();
        int int10 = customer2.getCurrentDebt();
        java.lang.String str11 = customer2.getName();
        int int12 = customer2.getRemainingCredit();
        int int13 = customer2.getCurrentDebt();
        int int14 = customer2.getRemainingCredit();
        customer2.makePurchase(64);
        int int17 = customer2.getRemainingCredit();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 36 + "'", int10 == 36);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 36 + "'", int13 == 36);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        Customer customer2 = new Customer("hi!", 35);
        // The following exception was thrown during execution in test generation
        try {
            customer2.makePurchase((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid amount");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        Customer customer2 = new Customer("", 65);
        java.lang.String str3 = customer2.getName();
        java.lang.String str4 = customer2.getName();
        java.lang.String str5 = customer2.getName();
        int int6 = customer2.getRemainingCredit();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 65 + "'", int6 == 65);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        Customer customer2 = new Customer("", (int) (short) 1);
        java.lang.String str3 = customer2.getName();
        int int4 = customer2.getRemainingCredit();
        java.lang.Class<?> wildcardClass5 = customer2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        customer2.makePurchase((int) '#');
        customer2.makePurchase((int) (short) 1);
        int int9 = customer2.getRemainingCredit();
        int int10 = customer2.getCurrentDebt();
        // The following exception was thrown during execution in test generation
        try {
            customer2.makePurchase(68);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Credit limit exceeded");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 36 + "'", int10 == 36);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        Customer customer2 = new Customer("", 1);
        java.lang.String str3 = customer2.getName();
        int int4 = customer2.getCurrentDebt();
        int int5 = customer2.getCurrentDebt();
        java.lang.String str6 = customer2.getName();
        java.lang.String str7 = customer2.getName();
        int int8 = customer2.getCurrentDebt();
        int int9 = customer2.getCurrentDebt();
        java.lang.String str10 = customer2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        Customer customer2 = new Customer("hi!", (int) (short) 0);
        int int3 = customer2.getCurrentDebt();
        java.lang.String str4 = customer2.getName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        Customer customer2 = new Customer("hi!", 10);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        int int5 = customer2.getCurrentDebt();
        int int6 = customer2.getCurrentDebt();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        Customer customer2 = new Customer("hi!", 67);
        java.lang.Class<?> wildcardClass3 = customer2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        Customer customer2 = new Customer("hi!", (int) (short) 0);
        java.lang.Class<?> wildcardClass3 = customer2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        Customer customer2 = new Customer("hi!", 9);
        java.lang.Class<?> wildcardClass3 = customer2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        Customer customer2 = new Customer("hi!", (int) (byte) -1);
        java.lang.String str3 = customer2.getName();
        java.lang.String str4 = customer2.getName();
        java.lang.Class<?> wildcardClass5 = customer2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        Customer customer2 = new Customer("hi!", (int) (short) 100);
        java.lang.String str3 = customer2.getName();
        int int4 = customer2.getCurrentDebt();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        Customer customer2 = new Customer("hi!", 68);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        java.lang.Class<?> wildcardClass5 = customer2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 68 + "'", int4 == 68);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        Customer customer2 = new Customer("", 1);
        java.lang.String str3 = customer2.getName();
        int int4 = customer2.getCurrentDebt();
        int int5 = customer2.getCurrentDebt();
        java.lang.String str6 = customer2.getName();
        java.lang.String str7 = customer2.getName();
        java.lang.String str8 = customer2.getName();
        java.lang.String str9 = customer2.getName();
        java.lang.Class<?> wildcardClass10 = customer2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        Customer customer2 = new Customer("hi!", (int) (byte) -1);
        java.lang.String str3 = customer2.getName();
        // The following exception was thrown during execution in test generation
        try {
            customer2.makePurchase((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Credit limit exceeded");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        Customer customer2 = new Customer("", 1);
        java.lang.String str3 = customer2.getName();
        java.lang.String str4 = customer2.getName();
        java.lang.String str5 = customer2.getName();
        int int6 = customer2.getCurrentDebt();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        Customer customer2 = new Customer("", 1);
        java.lang.String str3 = customer2.getName();
        int int4 = customer2.getCurrentDebt();
        int int5 = customer2.getCurrentDebt();
        java.lang.String str6 = customer2.getName();
        int int7 = customer2.getRemainingCredit();
        java.lang.Class<?> wildcardClass8 = customer2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        Customer customer2 = new Customer("", 45);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        Customer customer2 = new Customer("", 1);
        java.lang.String str3 = customer2.getName();
        int int4 = customer2.getCurrentDebt();
        int int5 = customer2.getCurrentDebt();
        int int6 = customer2.getRemainingCredit();
        int int7 = customer2.getRemainingCredit();
        int int8 = customer2.getCurrentDebt();
        // The following exception was thrown during execution in test generation
        try {
            customer2.makePurchase((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Credit limit exceeded");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        Customer customer2 = new Customer("hi!", 36);
        java.lang.String str3 = customer2.getName();
        int int4 = customer2.getRemainingCredit();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 36 + "'", int4 == 36);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        java.lang.String str5 = customer2.getName();
        int int6 = customer2.getRemainingCredit();
        int int7 = customer2.getRemainingCredit();
        int int8 = customer2.getRemainingCredit();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        Customer customer2 = new Customer("", 1);
        java.lang.String str3 = customer2.getName();
        java.lang.String str4 = customer2.getName();
        java.lang.String str5 = customer2.getName();
        java.lang.String str6 = customer2.getName();
        java.lang.String str7 = customer2.getName();
        java.lang.Class<?> wildcardClass8 = customer2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        Customer customer2 = new Customer("", 9);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        java.lang.String str4 = customer2.getName();
        customer2.makePurchase((int) (byte) 10);
        java.lang.String str7 = customer2.getName();
        int int8 = customer2.getRemainingCredit();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 90 + "'", int8 == 90);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        Customer customer2 = new Customer("", 36);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        Customer customer2 = new Customer("hi!", (int) 'a');
        customer2.makePurchase((int) (short) 10);
        int int5 = customer2.getRemainingCredit();
        int int6 = customer2.getCurrentDebt();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 87 + "'", int5 == 87);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        Customer customer2 = new Customer("", 1);
        java.lang.String str3 = customer2.getName();
        int int4 = customer2.getCurrentDebt();
        int int5 = customer2.getCurrentDebt();
        int int6 = customer2.getCurrentDebt();
        customer2.makePurchase(0);
        java.lang.Class<?> wildcardClass9 = customer2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        Customer customer2 = new Customer("", 1);
        java.lang.String str3 = customer2.getName();
        int int4 = customer2.getCurrentDebt();
        int int5 = customer2.getCurrentDebt();
        int int6 = customer2.getRemainingCredit();
        int int7 = customer2.getRemainingCredit();
        int int8 = customer2.getCurrentDebt();
        java.lang.String str9 = customer2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        Customer customer2 = new Customer("hi!", (int) (byte) -1);
        java.lang.String str3 = customer2.getName();
        java.lang.Class<?> wildcardClass4 = customer2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        Customer customer2 = new Customer("", 1);
        java.lang.String str3 = customer2.getName();
        int int4 = customer2.getCurrentDebt();
        int int5 = customer2.getRemainingCredit();
        int int6 = customer2.getCurrentDebt();
        int int7 = customer2.getRemainingCredit();
        java.lang.String str8 = customer2.getName();
        // The following exception was thrown during execution in test generation
        try {
            customer2.makePurchase(68);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Credit limit exceeded");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        Customer customer2 = new Customer("", 1);
        java.lang.String str3 = customer2.getName();
        int int4 = customer2.getRemainingCredit();
        java.lang.String str5 = customer2.getName();
        int int6 = customer2.getCurrentDebt();
        int int7 = customer2.getCurrentDebt();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        Customer customer2 = new Customer("", (int) '4');
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        Customer customer2 = new Customer("hi!", 10);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        int int5 = customer2.getRemainingCredit();
        java.lang.Class<?> wildcardClass6 = customer2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        customer2.makePurchase((int) '#');
        int int7 = customer2.getRemainingCredit();
        java.lang.String str8 = customer2.getName();
        int int9 = customer2.getCurrentDebt();
        // The following exception was thrown during execution in test generation
        try {
            customer2.makePurchase(68);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Credit limit exceeded");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 65 + "'", int7 == 65);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        Customer customer2 = new Customer("", (int) (short) 100);
        customer2.makePurchase((int) (short) 10);
        int int5 = customer2.getCurrentDebt();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        Customer customer2 = new Customer("", 48);
        int int3 = customer2.getRemainingCredit();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        customer2.makePurchase((int) '#');
        customer2.makePurchase((int) (short) 1);
        int int9 = customer2.getRemainingCredit();
        int int10 = customer2.getCurrentDebt();
        java.lang.String str11 = customer2.getName();
        int int12 = customer2.getRemainingCredit();
        int int13 = customer2.getCurrentDebt();
        int int14 = customer2.getRemainingCredit();
        customer2.makePurchase(64);
        java.lang.String str17 = customer2.getName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 36 + "'", int10 == 36);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 36 + "'", int13 == 36);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        Customer customer2 = new Customer("", 65);
        java.lang.String str3 = customer2.getName();
        java.lang.String str4 = customer2.getName();
        java.lang.String str5 = customer2.getName();
        int int6 = customer2.getCurrentDebt();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        Customer customer2 = new Customer("hi!", 45);
        int int3 = customer2.getRemainingCredit();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 45 + "'", int3 == 45);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        Customer customer2 = new Customer("", 1);
        java.lang.String str3 = customer2.getName();
        int int4 = customer2.getRemainingCredit();
        java.lang.String str5 = customer2.getName();
        java.lang.String str6 = customer2.getName();
        java.lang.String str7 = customer2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        customer2.makePurchase((int) '#');
        int int7 = customer2.getRemainingCredit();
        customer2.makePurchase((int) (byte) 10);
        int int10 = customer2.getRemainingCredit();
        int int11 = customer2.getCurrentDebt();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 65 + "'", int7 == 65);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 55 + "'", int10 == 55);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 45 + "'", int11 == 45);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        Customer customer2 = new Customer("", 1);
        java.lang.String str3 = customer2.getName();
        int int4 = customer2.getCurrentDebt();
        int int5 = customer2.getRemainingCredit();
        int int6 = customer2.getRemainingCredit();
        int int7 = customer2.getRemainingCredit();
        java.lang.Class<?> wildcardClass8 = customer2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        Customer customer2 = new Customer("hi!", 36);
        java.lang.String str3 = customer2.getName();
        java.lang.Class<?> wildcardClass4 = customer2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        Customer customer2 = new Customer("", 1);
        java.lang.String str3 = customer2.getName();
        int int4 = customer2.getCurrentDebt();
        java.lang.String str5 = customer2.getName();
        int int6 = customer2.getRemainingCredit();
        int int7 = customer2.getCurrentDebt();
        // The following exception was thrown during execution in test generation
        try {
            customer2.makePurchase(87);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Credit limit exceeded");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        customer2.makePurchase((int) '#');
        customer2.makePurchase((int) (short) 1);
        int int9 = customer2.getRemainingCredit();
        int int10 = customer2.getCurrentDebt();
        int int11 = customer2.getRemainingCredit();
        int int12 = customer2.getCurrentDebt();
        int int13 = customer2.getCurrentDebt();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 36 + "'", int10 == 36);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 64 + "'", int11 == 64);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 36 + "'", int12 == 36);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 36 + "'", int13 == 36);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        Customer customer2 = new Customer("", (int) ' ');
        java.lang.String str3 = customer2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        Customer customer2 = new Customer("hi!", 10);
        int int3 = customer2.getRemainingCredit();
        int int4 = customer2.getRemainingCredit();
        customer2.makePurchase(1);
        int int7 = customer2.getCurrentDebt();
        int int8 = customer2.getCurrentDebt();
        int int9 = customer2.getRemainingCredit();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        java.lang.String str5 = customer2.getName();
        int int6 = customer2.getRemainingCredit();
        int int7 = customer2.getCurrentDebt();
        int int8 = customer2.getRemainingCredit();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        Customer customer2 = new Customer("", 67);
        // The following exception was thrown during execution in test generation
        try {
            customer2.makePurchase((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Credit limit exceeded");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        Customer customer2 = new Customer("hi!", 10);
        int int3 = customer2.getRemainingCredit();
        int int4 = customer2.getRemainingCredit();
        customer2.makePurchase(1);
        int int7 = customer2.getCurrentDebt();
        int int8 = customer2.getRemainingCredit();
        int int9 = customer2.getRemainingCredit();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        customer2.makePurchase((int) '#');
        int int7 = customer2.getRemainingCredit();
        customer2.makePurchase((int) ' ');
        java.lang.String str10 = customer2.getName();
        customer2.makePurchase(0);
        int int13 = customer2.getCurrentDebt();
        // The following exception was thrown during execution in test generation
        try {
            customer2.makePurchase(68);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Credit limit exceeded");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 65 + "'", int7 == 65);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 67 + "'", int13 == 67);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        Customer customer2 = new Customer("hi!", 10);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        int int5 = customer2.getRemainingCredit();
        // The following exception was thrown during execution in test generation
        try {
            customer2.makePurchase(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Credit limit exceeded");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        Customer customer2 = new Customer("hi!", (int) 'a');
        java.lang.String str3 = customer2.getName();
        java.lang.String str4 = customer2.getName();
        int int5 = customer2.getCurrentDebt();
        customer2.makePurchase(65);
        int int8 = customer2.getCurrentDebt();
        int int9 = customer2.getCurrentDebt();
        customer2.makePurchase((int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 65 + "'", int8 == 65);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        Customer customer2 = new Customer("hi!", (int) '4');
        java.lang.Class<?> wildcardClass3 = customer2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        customer2.makePurchase((int) '#');
        int int7 = customer2.getRemainingCredit();
        java.lang.String str8 = customer2.getName();
        java.lang.Class<?> wildcardClass9 = customer2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 65 + "'", int7 == 65);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        Customer customer2 = new Customer("hi!", (int) 'a');
        customer2.makePurchase((int) (short) 10);
        java.lang.Class<?> wildcardClass5 = customer2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        Customer customer2 = new Customer("hi!", 67);
        java.lang.String str3 = customer2.getName();
        int int4 = customer2.getCurrentDebt();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        Customer customer2 = new Customer("hi!", (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            customer2.makePurchase(48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Credit limit exceeded");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        Customer customer2 = new Customer("hi!", 10);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        int int5 = customer2.getCurrentDebt();
        java.lang.String str6 = customer2.getName();
        int int7 = customer2.getRemainingCredit();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        Customer customer2 = new Customer("hi!", 10);
        java.lang.String str3 = customer2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        Customer customer2 = new Customer("", 65);
        int int3 = customer2.getRemainingCredit();
        customer2.makePurchase(36);
        java.lang.String str6 = customer2.getName();
        java.lang.String str7 = customer2.getName();
        java.lang.String str8 = customer2.getName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 65 + "'", int3 == 65);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        Customer customer2 = new Customer("hi!", 35);
        java.lang.Class<?> wildcardClass3 = customer2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        Customer customer2 = new Customer("", 1);
        java.lang.String str3 = customer2.getName();
        int int4 = customer2.getCurrentDebt();
        int int5 = customer2.getRemainingCredit();
        java.lang.String str6 = customer2.getName();
        int int7 = customer2.getRemainingCredit();
        customer2.makePurchase(0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        Customer customer2 = new Customer("", 100);
        java.lang.String str3 = customer2.getName();
        int int4 = customer2.getRemainingCredit();
        customer2.makePurchase(55);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        java.lang.String str4 = customer2.getName();
        customer2.makePurchase((int) (byte) 10);
        int int7 = customer2.getRemainingCredit();
        int int8 = customer2.getCurrentDebt();
        java.lang.Class<?> wildcardClass9 = customer2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 90 + "'", int7 == 90);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        Customer customer2 = new Customer("hi!", 48);
        java.lang.String str3 = customer2.getName();
        java.lang.Class<?> wildcardClass4 = customer2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        int int5 = customer2.getRemainingCredit();
        int int6 = customer2.getRemainingCredit();
        java.lang.Class<?> wildcardClass7 = customer2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        java.lang.String str5 = customer2.getName();
        int int6 = customer2.getRemainingCredit();
        int int7 = customer2.getRemainingCredit();
        customer2.makePurchase((int) (byte) 100);
        int int10 = customer2.getRemainingCredit();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        Customer customer2 = new Customer("", (int) (byte) 1);
        int int3 = customer2.getRemainingCredit();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        Customer customer2 = new Customer("hi!", 10);
        int int3 = customer2.getRemainingCredit();
        int int4 = customer2.getRemainingCredit();
        int int5 = customer2.getCurrentDebt();
        java.lang.Class<?> wildcardClass6 = customer2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        java.lang.String str4 = customer2.getName();
        customer2.makePurchase((int) (byte) 10);
        int int7 = customer2.getRemainingCredit();
        int int8 = customer2.getRemainingCredit();
        customer2.makePurchase(64);
        java.lang.Class<?> wildcardClass11 = customer2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 90 + "'", int7 == 90);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 90 + "'", int8 == 90);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        Customer customer2 = new Customer("", (-1));
        // The following exception was thrown during execution in test generation
        try {
            customer2.makePurchase(33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Credit limit exceeded");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        Customer customer2 = new Customer("", 65);
        java.lang.String str3 = customer2.getName();
        java.lang.String str4 = customer2.getName();
        java.lang.String str5 = customer2.getName();
        customer2.makePurchase((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            customer2.makePurchase(45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Credit limit exceeded");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        Customer customer2 = new Customer("", (int) (short) 10);
        int int3 = customer2.getRemainingCredit();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        Customer customer2 = new Customer("hi!", (int) (short) 0);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getCurrentDebt();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        customer2.makePurchase((int) '#');
        java.lang.String str7 = customer2.getName();
        // The following exception was thrown during execution in test generation
        try {
            customer2.makePurchase(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Credit limit exceeded");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        customer2.makePurchase((int) '#');
        int int7 = customer2.getRemainingCredit();
        customer2.makePurchase((int) (byte) 10);
        int int10 = customer2.getCurrentDebt();
        int int11 = customer2.getCurrentDebt();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 65 + "'", int7 == 65);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 45 + "'", int10 == 45);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 45 + "'", int11 == 45);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        Customer customer2 = new Customer("", (int) (short) -1);
        int int3 = customer2.getRemainingCredit();
        java.lang.String str4 = customer2.getName();
        java.lang.String str5 = customer2.getName();
        int int6 = customer2.getRemainingCredit();
        int int7 = customer2.getRemainingCredit();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        int int5 = customer2.getCurrentDebt();
        java.lang.String str6 = customer2.getName();
        // The following exception was thrown during execution in test generation
        try {
            customer2.makePurchase((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid amount");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        Customer customer2 = new Customer("", 1);
        java.lang.String str3 = customer2.getName();
        int int4 = customer2.getCurrentDebt();
        int int5 = customer2.getCurrentDebt();
        int int6 = customer2.getCurrentDebt();
        java.lang.String str7 = customer2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        Customer customer2 = new Customer("", 1);
        java.lang.String str3 = customer2.getName();
        int int4 = customer2.getCurrentDebt();
        int int5 = customer2.getCurrentDebt();
        int int6 = customer2.getRemainingCredit();
        int int7 = customer2.getCurrentDebt();
        int int8 = customer2.getCurrentDebt();
        int int9 = customer2.getRemainingCredit();
        // The following exception was thrown during execution in test generation
        try {
            customer2.makePurchase(33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Credit limit exceeded");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        Customer customer2 = new Customer("", 10);
        int int3 = customer2.getRemainingCredit();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        Customer customer2 = new Customer("hi!", (int) 'a');
        java.lang.String str3 = customer2.getName();
        java.lang.String str4 = customer2.getName();
        int int5 = customer2.getCurrentDebt();
        int int6 = customer2.getRemainingCredit();
        java.lang.String str7 = customer2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getRemainingCredit();
        customer2.makePurchase((int) '4');
        int int6 = customer2.getRemainingCredit();
        customer2.makePurchase((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        Customer customer2 = new Customer("hi!", (int) 'a');
        java.lang.String str3 = customer2.getName();
        java.lang.Class<?> wildcardClass4 = customer2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        customer2.makePurchase((int) '#');
        customer2.makePurchase((int) (short) 1);
        int int9 = customer2.getRemainingCredit();
        int int10 = customer2.getCurrentDebt();
        customer2.makePurchase(64);
        int int13 = customer2.getRemainingCredit();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 36 + "'", int10 == 36);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        Customer customer2 = new Customer("hi!", (int) (byte) 10);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        Customer customer2 = new Customer("hi!", 36);
        int int3 = customer2.getCurrentDebt();
        // The following exception was thrown during execution in test generation
        try {
            customer2.makePurchase(67);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Credit limit exceeded");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        customer2.makePurchase((int) '#');
        customer2.makePurchase((int) (short) 1);
        int int9 = customer2.getRemainingCredit();
        int int10 = customer2.getCurrentDebt();
        customer2.makePurchase(64);
        // The following exception was thrown during execution in test generation
        try {
            customer2.makePurchase(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Credit limit exceeded");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 36 + "'", int10 == 36);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        Customer customer2 = new Customer("hi!", 10);
        int int3 = customer2.getRemainingCredit();
        int int4 = customer2.getRemainingCredit();
        customer2.makePurchase(1);
        java.lang.String str7 = customer2.getName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        Customer customer2 = new Customer("", 100);
        int int3 = customer2.getRemainingCredit();
        int int4 = customer2.getCurrentDebt();
        java.lang.String str5 = customer2.getName();
        int int6 = customer2.getRemainingCredit();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        java.lang.String str4 = customer2.getName();
        java.lang.Class<?> wildcardClass5 = customer2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        int int5 = customer2.getCurrentDebt();
        int int6 = customer2.getRemainingCredit();
        java.lang.Class<?> wildcardClass7 = customer2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        int int5 = customer2.getCurrentDebt();
        java.lang.String str6 = customer2.getName();
        java.lang.Class<?> wildcardClass7 = customer2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        Customer customer2 = new Customer("", 1);
        java.lang.String str3 = customer2.getName();
        int int4 = customer2.getCurrentDebt();
        int int5 = customer2.getRemainingCredit();
        int int6 = customer2.getCurrentDebt();
        int int7 = customer2.getRemainingCredit();
        // The following exception was thrown during execution in test generation
        try {
            customer2.makePurchase(97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Credit limit exceeded");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        customer2.makePurchase((int) '#');
        int int7 = customer2.getRemainingCredit();
        java.lang.String str8 = customer2.getName();
        int int9 = customer2.getCurrentDebt();
        java.lang.Class<?> wildcardClass10 = customer2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 65 + "'", int7 == 65);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        Customer customer2 = new Customer("hi!", (int) 'a');
        java.lang.String str3 = customer2.getName();
        java.lang.String str4 = customer2.getName();
        int int5 = customer2.getCurrentDebt();
        int int6 = customer2.getRemainingCredit();
        java.lang.Class<?> wildcardClass7 = customer2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        Customer customer2 = new Customer("hi!", 90);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        Customer customer2 = new Customer("hi!", (int) (short) 0);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        Customer customer2 = new Customer("hi!", 68);
        int int3 = customer2.getCurrentDebt();
        java.lang.Class<?> wildcardClass4 = customer2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        customer2.makePurchase((int) '#');
        int int7 = customer2.getRemainingCredit();
        customer2.makePurchase((int) ' ');
        java.lang.String str10 = customer2.getName();
        int int11 = customer2.getCurrentDebt();
        int int12 = customer2.getRemainingCredit();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 65 + "'", int7 == 65);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 67 + "'", int11 == 67);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 33 + "'", int12 == 33);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        Customer customer2 = new Customer("hi!", (int) (short) 0);
        int int3 = customer2.getRemainingCredit();
        java.lang.String str4 = customer2.getName();
        int int5 = customer2.getRemainingCredit();
        int int6 = customer2.getRemainingCredit();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        customer2.makePurchase((int) '#');
        customer2.makePurchase((int) (short) 1);
        int int9 = customer2.getRemainingCredit();
        int int10 = customer2.getCurrentDebt();
        int int11 = customer2.getRemainingCredit();
        // The following exception was thrown during execution in test generation
        try {
            customer2.makePurchase((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Credit limit exceeded");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 36 + "'", int10 == 36);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 64 + "'", int11 == 64);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        Customer customer2 = new Customer("", (int) '#');
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        Customer customer2 = new Customer("", 65);
        int int3 = customer2.getRemainingCredit();
        int int4 = customer2.getRemainingCredit();
        int int5 = customer2.getRemainingCredit();
        java.lang.String str6 = customer2.getName();
        java.lang.String str7 = customer2.getName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 65 + "'", int3 == 65);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 65 + "'", int4 == 65);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 65 + "'", int5 == 65);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        customer2.makePurchase((int) '#');
        int int7 = customer2.getRemainingCredit();
        customer2.makePurchase((int) ' ');
        java.lang.String str10 = customer2.getName();
        java.lang.String str11 = customer2.getName();
        java.lang.Class<?> wildcardClass12 = customer2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 65 + "'", int7 == 65);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        customer2.makePurchase((int) '#');
        customer2.makePurchase((int) (short) 1);
        int int9 = customer2.getRemainingCredit();
        int int10 = customer2.getRemainingCredit();
        int int11 = customer2.getCurrentDebt();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 36 + "'", int11 == 36);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        Customer customer2 = new Customer("", (int) (short) -1);
        int int3 = customer2.getCurrentDebt();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        Customer customer2 = new Customer("hi!", 100);
        customer2.makePurchase(65);
        java.lang.String str5 = customer2.getName();
        java.lang.String str6 = customer2.getName();
        customer2.makePurchase(1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        Customer customer2 = new Customer("hi!", 100);
        customer2.makePurchase(65);
        java.lang.String str5 = customer2.getName();
        java.lang.String str6 = customer2.getName();
        java.lang.String str7 = customer2.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        Customer customer2 = new Customer("", 1);
        java.lang.String str3 = customer2.getName();
        java.lang.String str4 = customer2.getName();
        java.lang.String str5 = customer2.getName();
        int int6 = customer2.getRemainingCredit();
        int int7 = customer2.getRemainingCredit();
        int int8 = customer2.getCurrentDebt();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        Customer customer2 = new Customer("", 100);
        int int3 = customer2.getRemainingCredit();
        int int4 = customer2.getCurrentDebt();
        customer2.makePurchase((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getRemainingCredit();
        customer2.makePurchase((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            customer2.makePurchase(55);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Credit limit exceeded");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        Customer customer2 = new Customer("", 1);
        java.lang.String str3 = customer2.getName();
        int int4 = customer2.getCurrentDebt();
        int int5 = customer2.getCurrentDebt();
        java.lang.String str6 = customer2.getName();
        int int7 = customer2.getRemainingCredit();
        // The following exception was thrown during execution in test generation
        try {
            customer2.makePurchase((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Credit limit exceeded");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        Customer customer2 = new Customer("", 1);
        java.lang.String str3 = customer2.getName();
        int int4 = customer2.getCurrentDebt();
        int int5 = customer2.getRemainingCredit();
        int int6 = customer2.getRemainingCredit();
        int int7 = customer2.getCurrentDebt();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        Customer customer2 = new Customer("", (int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = customer2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        Customer customer2 = new Customer("", (int) (short) 0);
        java.lang.Class<?> wildcardClass3 = customer2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        Customer customer2 = new Customer("", 1);
        java.lang.String str3 = customer2.getName();
        int int4 = customer2.getCurrentDebt();
        int int5 = customer2.getCurrentDebt();
        int int6 = customer2.getRemainingCredit();
        int int7 = customer2.getCurrentDebt();
        int int8 = customer2.getCurrentDebt();
        int int9 = customer2.getCurrentDebt();
        int int10 = customer2.getRemainingCredit();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        customer2.makePurchase((int) '#');
        customer2.makePurchase((int) (short) 1);
        int int9 = customer2.getRemainingCredit();
        int int10 = customer2.getCurrentDebt();
        int int11 = customer2.getRemainingCredit();
        java.lang.String str12 = customer2.getName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 36 + "'", int10 == 36);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 64 + "'", int11 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        Customer customer2 = new Customer("hi!", 33);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        Customer customer2 = new Customer("hi!", 36);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        java.lang.String str5 = customer2.getName();
        int int6 = customer2.getRemainingCredit();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 36 + "'", int4 == 36);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        customer2.makePurchase((int) '#');
        int int7 = customer2.getRemainingCredit();
        java.lang.String str8 = customer2.getName();
        int int9 = customer2.getCurrentDebt();
        java.lang.String str10 = customer2.getName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 65 + "'", int7 == 65);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        Customer customer2 = new Customer("hi!", 55);
        int int3 = customer2.getRemainingCredit();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 55 + "'", int3 == 55);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        customer2.makePurchase((int) '#');
        int int7 = customer2.getRemainingCredit();
        customer2.makePurchase((int) ' ');
        java.lang.String str10 = customer2.getName();
        customer2.makePurchase(0);
        customer2.makePurchase((int) (short) 1);
        int int15 = customer2.getCurrentDebt();
        int int16 = customer2.getRemainingCredit();
        // The following exception was thrown during execution in test generation
        try {
            customer2.makePurchase(68);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Credit limit exceeded");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 65 + "'", int7 == 65);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 68 + "'", int15 == 68);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        int int5 = customer2.getRemainingCredit();
        int int6 = customer2.getRemainingCredit();
        int int7 = customer2.getRemainingCredit();
        int int8 = customer2.getCurrentDebt();
        int int9 = customer2.getCurrentDebt();
        java.lang.Class<?> wildcardClass10 = customer2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        int int5 = customer2.getCurrentDebt();
        java.lang.String str6 = customer2.getName();
        int int7 = customer2.getRemainingCredit();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        Customer customer2 = new Customer("", 1);
        java.lang.Class<?> wildcardClass3 = customer2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        customer2.makePurchase((int) '#');
        customer2.makePurchase((int) (short) 1);
        int int9 = customer2.getCurrentDebt();
        java.lang.String str10 = customer2.getName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        Customer customer2 = new Customer("", 100);
        int int3 = customer2.getRemainingCredit();
        int int4 = customer2.getCurrentDebt();
        int int5 = customer2.getCurrentDebt();
        int int6 = customer2.getCurrentDebt();
        int int7 = customer2.getCurrentDebt();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        Customer customer2 = new Customer("", 55);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        Customer customer2 = new Customer("", 64);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        Customer customer2 = new Customer("hi!", (int) 'a');
        java.lang.String str3 = customer2.getName();
        java.lang.String str4 = customer2.getName();
        int int5 = customer2.getCurrentDebt();
        customer2.makePurchase(65);
        int int8 = customer2.getCurrentDebt();
        int int9 = customer2.getCurrentDebt();
        java.lang.Class<?> wildcardClass10 = customer2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 65 + "'", int8 == 65);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        Customer customer2 = new Customer("", 67);
        java.lang.String str3 = customer2.getName();
        java.lang.Class<?> wildcardClass4 = customer2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        Customer customer2 = new Customer("hi!", 10);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        int int5 = customer2.getCurrentDebt();
        java.lang.String str6 = customer2.getName();
        // The following exception was thrown during execution in test generation
        try {
            customer2.makePurchase((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Credit limit exceeded");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        Customer customer2 = new Customer("hi!", 0);
        java.lang.String str3 = customer2.getName();
        java.lang.Class<?> wildcardClass4 = customer2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        Customer customer2 = new Customer("", 100);
        int int3 = customer2.getRemainingCredit();
        int int4 = customer2.getCurrentDebt();
        int int5 = customer2.getCurrentDebt();
        java.lang.String str6 = customer2.getName();
        int int7 = customer2.getCurrentDebt();
        java.lang.Class<?> wildcardClass8 = customer2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        Customer customer2 = new Customer("", 1);
        java.lang.String str3 = customer2.getName();
        int int4 = customer2.getRemainingCredit();
        java.lang.String str5 = customer2.getName();
        int int6 = customer2.getCurrentDebt();
        int int7 = customer2.getRemainingCredit();
        int int8 = customer2.getRemainingCredit();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        Customer customer2 = new Customer("", 97);
        int int3 = customer2.getCurrentDebt();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        Customer customer2 = new Customer("hi!", 10);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        int int5 = customer2.getRemainingCredit();
        int int6 = customer2.getRemainingCredit();
        int int7 = customer2.getRemainingCredit();
        java.lang.String str8 = customer2.getName();
        customer2.makePurchase((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        Customer customer2 = new Customer("", 65);
        int int3 = customer2.getRemainingCredit();
        int int4 = customer2.getRemainingCredit();
        int int5 = customer2.getRemainingCredit();
        java.lang.String str6 = customer2.getName();
        java.lang.Class<?> wildcardClass7 = customer2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 65 + "'", int3 == 65);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 65 + "'", int4 == 65);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 65 + "'", int5 == 65);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        Customer customer2 = new Customer("hi!", 10);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        int int5 = customer2.getRemainingCredit();
        int int6 = customer2.getRemainingCredit();
        java.lang.Class<?> wildcardClass7 = customer2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        Customer customer2 = new Customer("", 1);
        java.lang.String str3 = customer2.getName();
        int int4 = customer2.getRemainingCredit();
        java.lang.String str5 = customer2.getName();
        int int6 = customer2.getRemainingCredit();
        java.lang.Class<?> wildcardClass7 = customer2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        int int5 = customer2.getRemainingCredit();
        int int6 = customer2.getRemainingCredit();
        int int7 = customer2.getRemainingCredit();
        int int8 = customer2.getCurrentDebt();
        customer2.makePurchase(100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        Customer customer2 = new Customer("hi!", (int) 'a');
        java.lang.String str3 = customer2.getName();
        java.lang.String str4 = customer2.getName();
        int int5 = customer2.getCurrentDebt();
        customer2.makePurchase(65);
        int int8 = customer2.getCurrentDebt();
        int int9 = customer2.getRemainingCredit();
        // The following exception was thrown during execution in test generation
        try {
            customer2.makePurchase(33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Credit limit exceeded");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 65 + "'", int8 == 65);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        int int5 = customer2.getRemainingCredit();
        java.lang.String str6 = customer2.getName();
        int int7 = customer2.getRemainingCredit();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        java.lang.String str4 = customer2.getName();
        customer2.makePurchase((int) (byte) 10);
        int int7 = customer2.getRemainingCredit();
        int int8 = customer2.getRemainingCredit();
        customer2.makePurchase(64);
        int int11 = customer2.getCurrentDebt();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 90 + "'", int7 == 90);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 90 + "'", int8 == 90);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 74 + "'", int11 == 74);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        Customer customer2 = new Customer("", (int) 'a');
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getCurrentDebt();
        int int5 = customer2.getRemainingCredit();
        java.lang.String str6 = customer2.getName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        Customer customer2 = new Customer("", (int) 'a');
        java.lang.Class<?> wildcardClass3 = customer2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        Customer customer2 = new Customer("", 10);
        int int3 = customer2.getCurrentDebt();
        java.lang.Class<?> wildcardClass4 = customer2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        int int5 = customer2.getCurrentDebt();
        int int6 = customer2.getRemainingCredit();
        int int7 = customer2.getCurrentDebt();
        int int8 = customer2.getRemainingCredit();
        customer2.makePurchase((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        Customer customer2 = new Customer("", 1);
        java.lang.String str3 = customer2.getName();
        int int4 = customer2.getCurrentDebt();
        java.lang.String str5 = customer2.getName();
        int int6 = customer2.getRemainingCredit();
        java.lang.String str7 = customer2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        customer2.makePurchase((int) '#');
        customer2.makePurchase((int) (short) 1);
        int int9 = customer2.getRemainingCredit();
        int int10 = customer2.getCurrentDebt();
        java.lang.String str11 = customer2.getName();
        int int12 = customer2.getRemainingCredit();
        int int13 = customer2.getCurrentDebt();
        int int14 = customer2.getRemainingCredit();
        int int15 = customer2.getCurrentDebt();
        java.lang.String str16 = customer2.getName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 36 + "'", int10 == 36);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 36 + "'", int13 == 36);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        Customer customer2 = new Customer("", 67);
        java.lang.String str3 = customer2.getName();
        int int4 = customer2.getCurrentDebt();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        customer2.makePurchase((int) '#');
        customer2.makePurchase((int) (short) 1);
        int int9 = customer2.getRemainingCredit();
        int int10 = customer2.getCurrentDebt();
        java.lang.String str11 = customer2.getName();
        int int12 = customer2.getRemainingCredit();
        int int13 = customer2.getCurrentDebt();
        int int14 = customer2.getRemainingCredit();
        customer2.makePurchase(64);
        // The following exception was thrown during execution in test generation
        try {
            customer2.makePurchase((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Credit limit exceeded");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 36 + "'", int10 == 36);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 36 + "'", int13 == 36);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getCurrentDebt();
        int int5 = customer2.getRemainingCredit();
        customer2.makePurchase((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        Customer customer2 = new Customer("", 100);
        java.lang.String str3 = customer2.getName();
        int int4 = customer2.getRemainingCredit();
        int int5 = customer2.getRemainingCredit();
        customer2.makePurchase((int) (byte) 10);
        java.lang.Class<?> wildcardClass8 = customer2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        Customer customer2 = new Customer("hi!", 87);
        java.lang.Class<?> wildcardClass3 = customer2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        Customer customer2 = new Customer("", 1);
        java.lang.String str3 = customer2.getName();
        int int4 = customer2.getCurrentDebt();
        int int5 = customer2.getRemainingCredit();
        int int6 = customer2.getCurrentDebt();
        int int7 = customer2.getRemainingCredit();
        java.lang.String str8 = customer2.getName();
        int int9 = customer2.getCurrentDebt();
        int int10 = customer2.getRemainingCredit();
        // The following exception was thrown during execution in test generation
        try {
            customer2.makePurchase((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Credit limit exceeded");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        Customer customer2 = new Customer("", 67);
        int int3 = customer2.getCurrentDebt();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        Customer customer2 = new Customer("", 100);
        java.lang.String str3 = customer2.getName();
        int int4 = customer2.getRemainingCredit();
        customer2.makePurchase((int) (byte) 100);
        int int7 = customer2.getRemainingCredit();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        customer2.makePurchase((int) '#');
        customer2.makePurchase((int) (short) 1);
        int int9 = customer2.getRemainingCredit();
        int int10 = customer2.getCurrentDebt();
        customer2.makePurchase(64);
        int int13 = customer2.getCurrentDebt();
        java.lang.String str14 = customer2.getName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 36 + "'", int10 == 36);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        Customer customer2 = new Customer("hi!", 0);
        java.lang.String str3 = customer2.getName();
        int int4 = customer2.getRemainingCredit();
        java.lang.String str5 = customer2.getName();
        // The following exception was thrown during execution in test generation
        try {
            customer2.makePurchase((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Credit limit exceeded");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        Customer customer2 = new Customer("hi!", (int) (short) 100);
        java.lang.String str3 = customer2.getName();
        java.lang.Class<?> wildcardClass4 = customer2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        java.lang.String str4 = customer2.getName();
        customer2.makePurchase((int) (byte) 10);
        int int7 = customer2.getRemainingCredit();
        java.lang.String str8 = customer2.getName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 90 + "'", int7 == 90);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        Customer customer2 = new Customer("", (int) 'a');
        int int3 = customer2.getCurrentDebt();
        customer2.makePurchase(65);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        Customer customer2 = new Customer("", (int) (byte) 0);
        int int3 = customer2.getRemainingCredit();
        int int4 = customer2.getCurrentDebt();
        // The following exception was thrown during execution in test generation
        try {
            customer2.makePurchase(74);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Credit limit exceeded");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        Customer customer2 = new Customer("", 1);
        java.lang.String str3 = customer2.getName();
        int int4 = customer2.getCurrentDebt();
        int int5 = customer2.getCurrentDebt();
        int int6 = customer2.getCurrentDebt();
        java.lang.Class<?> wildcardClass7 = customer2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        customer2.makePurchase((int) '#');
        int int7 = customer2.getRemainingCredit();
        customer2.makePurchase((int) ' ');
        int int10 = customer2.getCurrentDebt();
        customer2.makePurchase((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 65 + "'", int7 == 65);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 67 + "'", int10 == 67);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        Customer customer2 = new Customer("", 100);
        java.lang.String str3 = customer2.getName();
        int int4 = customer2.getRemainingCredit();
        java.lang.Class<?> wildcardClass5 = customer2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        Customer customer2 = new Customer("hi!", (int) (short) -1);
        java.lang.String str3 = customer2.getName();
        int int4 = customer2.getRemainingCredit();
        java.lang.String str5 = customer2.getName();
        java.lang.String str6 = customer2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        Customer customer2 = new Customer("", (int) (short) -1);
        int int3 = customer2.getRemainingCredit();
        int int4 = customer2.getRemainingCredit();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        java.lang.String str4 = customer2.getName();
        customer2.makePurchase((int) (byte) 10);
        int int7 = customer2.getRemainingCredit();
        int int8 = customer2.getRemainingCredit();
        customer2.makePurchase(64);
        int int11 = customer2.getRemainingCredit();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 90 + "'", int7 == 90);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 90 + "'", int8 == 90);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 26 + "'", int11 == 26);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getRemainingCredit();
        customer2.makePurchase((int) '4');
        int int6 = customer2.getRemainingCredit();
        int int7 = customer2.getRemainingCredit();
        int int8 = customer2.getRemainingCredit();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48 + "'", int8 == 48);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        customer2.makePurchase((int) '#');
        int int7 = customer2.getRemainingCredit();
        java.lang.String str8 = customer2.getName();
        int int9 = customer2.getCurrentDebt();
        int int10 = customer2.getCurrentDebt();
        // The following exception was thrown during execution in test generation
        try {
            customer2.makePurchase(67);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Credit limit exceeded");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 65 + "'", int7 == 65);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        Customer customer2 = new Customer("", (int) (short) 1);
        java.lang.String str3 = customer2.getName();
        int int4 = customer2.getRemainingCredit();
        int int5 = customer2.getCurrentDebt();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        customer2.makePurchase((int) '#');
        int int7 = customer2.getCurrentDebt();
        // The following exception was thrown during execution in test generation
        try {
            customer2.makePurchase((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Credit limit exceeded");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        java.lang.String str5 = customer2.getName();
        int int6 = customer2.getRemainingCredit();
        java.lang.String str7 = customer2.getName();
        int int8 = customer2.getCurrentDebt();
        int int9 = customer2.getRemainingCredit();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        Customer customer2 = new Customer("hi!", 10);
        int int3 = customer2.getRemainingCredit();
        int int4 = customer2.getRemainingCredit();
        int int5 = customer2.getCurrentDebt();
        // The following exception was thrown during execution in test generation
        try {
            customer2.makePurchase((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Credit limit exceeded");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        Customer customer2 = new Customer("", 1);
        java.lang.String str3 = customer2.getName();
        int int4 = customer2.getCurrentDebt();
        int int5 = customer2.getRemainingCredit();
        int int6 = customer2.getRemainingCredit();
        int int7 = customer2.getRemainingCredit();
        java.lang.String str8 = customer2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        Customer customer2 = new Customer("hi!", (int) (short) 1);
        java.lang.String str3 = customer2.getName();
        java.lang.Class<?> wildcardClass4 = customer2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        customer2.makePurchase((int) '#');
        customer2.makePurchase((int) (short) 1);
        int int9 = customer2.getRemainingCredit();
        int int10 = customer2.getCurrentDebt();
        customer2.makePurchase(64);
        java.lang.Class<?> wildcardClass13 = customer2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 36 + "'", int10 == 36);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        Customer customer2 = new Customer("hi!", (int) 'a');
        int int3 = customer2.getRemainingCredit();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        Customer customer2 = new Customer("", 1);
        customer2.makePurchase((int) (byte) 1);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        Customer customer2 = new Customer("hi!", 10);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        int int5 = customer2.getRemainingCredit();
        int int6 = customer2.getRemainingCredit();
        int int7 = customer2.getRemainingCredit();
        int int8 = customer2.getCurrentDebt();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        Customer customer2 = new Customer("", 100);
        int int3 = customer2.getRemainingCredit();
        int int4 = customer2.getCurrentDebt();
        int int5 = customer2.getCurrentDebt();
        java.lang.String str6 = customer2.getName();
        int int7 = customer2.getCurrentDebt();
        java.lang.String str8 = customer2.getName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        Customer customer2 = new Customer("", 0);
        int int3 = customer2.getRemainingCredit();
        java.lang.String str4 = customer2.getName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        Customer customer2 = new Customer("", 1);
        java.lang.String str3 = customer2.getName();
        int int4 = customer2.getCurrentDebt();
        int int5 = customer2.getRemainingCredit();
        int int6 = customer2.getCurrentDebt();
        int int7 = customer2.getRemainingCredit();
        customer2.makePurchase(0);
        // The following exception was thrown during execution in test generation
        try {
            customer2.makePurchase(68);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Credit limit exceeded");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        Customer customer2 = new Customer("", 100);
        int int3 = customer2.getRemainingCredit();
        int int4 = customer2.getCurrentDebt();
        int int5 = customer2.getCurrentDebt();
        customer2.makePurchase(74);
        int int8 = customer2.getRemainingCredit();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 26 + "'", int8 == 26);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        Customer customer2 = new Customer("", 1);
        java.lang.String str3 = customer2.getName();
        int int4 = customer2.getCurrentDebt();
        int int5 = customer2.getCurrentDebt();
        int int6 = customer2.getRemainingCredit();
        int int7 = customer2.getCurrentDebt();
        int int8 = customer2.getCurrentDebt();
        int int9 = customer2.getCurrentDebt();
        customer2.makePurchase(0);
        java.lang.String str12 = customer2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        customer2.makePurchase((int) '#');
        int int7 = customer2.getRemainingCredit();
        customer2.makePurchase((int) ' ');
        customer2.makePurchase((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 65 + "'", int7 == 65);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        int int5 = customer2.getRemainingCredit();
        int int6 = customer2.getRemainingCredit();
        int int7 = customer2.getRemainingCredit();
        int int8 = customer2.getRemainingCredit();
        java.lang.String str9 = customer2.getName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        Customer customer2 = new Customer("", (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            customer2.makePurchase((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid amount");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        Customer customer2 = new Customer("", (int) 'a');
        int int3 = customer2.getCurrentDebt();
        java.lang.String str4 = customer2.getName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        customer2.makePurchase((int) '#');
        int int7 = customer2.getRemainingCredit();
        customer2.makePurchase((int) (byte) 10);
        int int10 = customer2.getRemainingCredit();
        java.lang.String str11 = customer2.getName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 65 + "'", int7 == 65);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 55 + "'", int10 == 55);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        Customer customer2 = new Customer("", 1);
        java.lang.String str3 = customer2.getName();
        int int4 = customer2.getCurrentDebt();
        int int5 = customer2.getCurrentDebt();
        java.lang.String str6 = customer2.getName();
        int int7 = customer2.getRemainingCredit();
        // The following exception was thrown during execution in test generation
        try {
            customer2.makePurchase((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Credit limit exceeded");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getCurrentDebt();
        int int5 = customer2.getRemainingCredit();
        int int6 = customer2.getRemainingCredit();
        java.lang.String str7 = customer2.getName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        Customer customer2 = new Customer("hi!", (int) (short) -1);
        java.lang.String str3 = customer2.getName();
        int int4 = customer2.getRemainingCredit();
        int int5 = customer2.getCurrentDebt();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        Customer customer2 = new Customer("", 1);
        java.lang.String str3 = customer2.getName();
        int int4 = customer2.getRemainingCredit();
        java.lang.String str5 = customer2.getName();
        java.lang.String str6 = customer2.getName();
        int int7 = customer2.getRemainingCredit();
        java.lang.String str8 = customer2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        Customer customer2 = new Customer("", 1);
        java.lang.String str3 = customer2.getName();
        int int4 = customer2.getCurrentDebt();
        int int5 = customer2.getCurrentDebt();
        java.lang.String str6 = customer2.getName();
        customer2.makePurchase(0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        customer2.makePurchase((int) '#');
        int int7 = customer2.getRemainingCredit();
        customer2.makePurchase((int) ' ');
        java.lang.String str10 = customer2.getName();
        java.lang.String str11 = customer2.getName();
        java.lang.String str12 = customer2.getName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 65 + "'", int7 == 65);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        Customer customer2 = new Customer("hi!", (int) (byte) -1);
        java.lang.String str3 = customer2.getName();
        int int4 = customer2.getCurrentDebt();
        // The following exception was thrown during execution in test generation
        try {
            customer2.makePurchase((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Credit limit exceeded");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        Customer customer2 = new Customer("", (int) 'a');
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getCurrentDebt();
        customer2.makePurchase((int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        Customer customer2 = new Customer("hi!", (int) (byte) 1);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        Customer customer2 = new Customer("", 1);
        customer2.makePurchase(1);
        int int5 = customer2.getCurrentDebt();
        int int6 = customer2.getCurrentDebt();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        Customer customer2 = new Customer("hi!", 10);
        int int3 = customer2.getRemainingCredit();
        int int4 = customer2.getRemainingCredit();
        customer2.makePurchase(1);
        int int7 = customer2.getCurrentDebt();
        java.lang.String str8 = customer2.getName();
        java.lang.Class<?> wildcardClass9 = customer2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        Customer customer2 = new Customer("", (int) 'a');
        customer2.makePurchase(1);
        int int5 = customer2.getCurrentDebt();
        java.lang.String str6 = customer2.getName();
        int int7 = customer2.getRemainingCredit();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 96 + "'", int7 == 96);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        customer2.makePurchase((int) '#');
        int int7 = customer2.getCurrentDebt();
        java.lang.Class<?> wildcardClass8 = customer2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        customer2.makePurchase((int) '#');
        customer2.makePurchase((int) (short) 1);
        int int9 = customer2.getRemainingCredit();
        int int10 = customer2.getCurrentDebt();
        java.lang.String str11 = customer2.getName();
        int int12 = customer2.getRemainingCredit();
        int int13 = customer2.getCurrentDebt();
        int int14 = customer2.getCurrentDebt();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 36 + "'", int10 == 36);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 36 + "'", int13 == 36);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 36 + "'", int14 == 36);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        Customer customer2 = new Customer("hi!", 100);
        int int3 = customer2.getCurrentDebt();
        int int4 = customer2.getRemainingCredit();
        java.lang.String str5 = customer2.getName();
        int int6 = customer2.getCurrentDebt();
        int int7 = customer2.getCurrentDebt();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        Customer customer2 = new Customer("", 100);
        java.lang.String str3 = customer2.getName();
        int int4 = customer2.getCurrentDebt();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }
}

