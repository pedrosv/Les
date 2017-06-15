package dao;

import junit.framework.*;

public class RandoopTest7 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test1");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    boolean var14 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var16 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var19 = var0.getAllEvaluatesTo((java.lang.Long)0L);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test2");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    var0.closeConnection();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test3");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.removeEvaluatesBy((java.lang.Long)100L);
      fail("Expected exception of type br.com.addvisor.webservice.exceptions.EvaluateTransactionException");
    } catch (br.com.addvisor.webservice.exceptions.EvaluateTransactionException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test4");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test5");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    var0.closeConnection();
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.removeEvaluatesBy((java.lang.Long)(-1L));
      fail("Expected exception of type br.com.addvisor.webservice.exceptions.EvaluateTransactionException");
    } catch (br.com.addvisor.webservice.exceptions.EvaluateTransactionException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test6");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    var0.closeConnection();
    var0.closeConnection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.removeEvaluatesBy((java.lang.Long)10L);
      fail("Expected exception of type br.com.addvisor.webservice.exceptions.EvaluateTransactionException");
    } catch (br.com.addvisor.webservice.exceptions.EvaluateTransactionException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test7");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    boolean var14 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var16 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    var0.closeConnection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var19 = var0.getAllEvaluatesTo((java.lang.Long)10L);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test8");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test9");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var17 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.removeEvaluatesBy((java.lang.Long)10L);
      fail("Expected exception of type br.com.addvisor.webservice.exceptions.EvaluateTransactionException");
    } catch (br.com.addvisor.webservice.exceptions.EvaluateTransactionException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test10");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var17 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var19 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.removeEvaluatesBy((java.lang.Long)(-1L));
      fail("Expected exception of type br.com.addvisor.webservice.exceptions.EvaluateTransactionException");
    } catch (br.com.addvisor.webservice.exceptions.EvaluateTransactionException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test11");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    boolean var14 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    var0.closeConnection();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test12");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var14 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    var0.closeConnection();
    boolean var17 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var19 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    var0.closeConnection();
    boolean var22 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test13");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var15 = var0.getAllEvaluatesTo((java.lang.Long)100L);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test14");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var17 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var19 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var21 = var0.getAllEvaluatesTo((java.lang.Long)(-1L));
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test15");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var14 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var16 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var18 = var0.getAllEvaluatesTo((java.lang.Long)1L);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test16");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var14 = var0.getAllEvaluatesTo((java.lang.Long)0L);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test17");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    var0.closeConnection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.removeEvaluatesBy((java.lang.Long)100L);
      fail("Expected exception of type br.com.addvisor.webservice.exceptions.EvaluateTransactionException");
    } catch (br.com.addvisor.webservice.exceptions.EvaluateTransactionException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test18");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    boolean var14 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    var0.closeConnection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.removeEvaluatesBy((java.lang.Long)0L);
      fail("Expected exception of type br.com.addvisor.webservice.exceptions.EvaluateTransactionException");
    } catch (br.com.addvisor.webservice.exceptions.EvaluateTransactionException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test19");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test20");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var14 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    boolean var17 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test21");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var16 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test22");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    var0.closeConnection();
    var0.closeConnection();
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test23");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var17 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var19 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var21 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var23 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var25 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.removeEvaluatesBy((java.lang.Long)10L);
      fail("Expected exception of type br.com.addvisor.webservice.exceptions.EvaluateTransactionException");
    } catch (br.com.addvisor.webservice.exceptions.EvaluateTransactionException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test24");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var10 = var0.getAllEvaluatesTo((java.lang.Long)100L);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test25");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var17 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var19 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var21 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var23 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test26");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var14 = var0.getAllEvaluatesTo((java.lang.Long)1L);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test27");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var14 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    boolean var17 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.removeEvaluatesBy((java.lang.Long)100L);
      fail("Expected exception of type br.com.addvisor.webservice.exceptions.EvaluateTransactionException");
    } catch (br.com.addvisor.webservice.exceptions.EvaluateTransactionException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test28");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var14 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var16 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var22 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test29");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var14 = var0.getAllEvaluatesTo((java.lang.Long)0L);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test30");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var14 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var16 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var18 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var20 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test31");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    boolean var14 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var16 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var18 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var20 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test32");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.removeEvaluatesBy((java.lang.Long)1L);
      fail("Expected exception of type br.com.addvisor.webservice.exceptions.EvaluateTransactionException");
    } catch (br.com.addvisor.webservice.exceptions.EvaluateTransactionException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test33");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    boolean var14 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var16 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test34");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var18 = var0.getAllEvaluatesTo((java.lang.Long)0L);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test35");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var16 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var18 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test36");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var14 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test37");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var15 = var0.getAllEvaluatesTo((java.lang.Long)10L);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test38");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    boolean var14 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var16 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var18 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.removeEvaluatesBy((java.lang.Long)10L);
      fail("Expected exception of type br.com.addvisor.webservice.exceptions.EvaluateTransactionException");
    } catch (br.com.addvisor.webservice.exceptions.EvaluateTransactionException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test39");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var14 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    boolean var17 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test40");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var17 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var19 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var21 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    boolean var24 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test41");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var14 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var16 = var0.getAllEvaluatesTo((java.lang.Long)(-1L));
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test42");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    boolean var14 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var16 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var18 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    var0.closeConnection();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test43");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    var0.closeConnection();
    var0.closeConnection();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test44");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    boolean var16 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var18 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var20 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    var0.closeConnection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var23 = var0.getAllEvaluatesTo((java.lang.Long)(-1L));
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test45");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    var0.closeConnection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var15 = var0.getAllEvaluatesTo((java.lang.Long)0L);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test46");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var14 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    var0.closeConnection();
    boolean var17 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var19 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var21 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test47");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var14 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var16 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var18 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.removeEvaluatesBy((java.lang.Long)0L);
      fail("Expected exception of type br.com.addvisor.webservice.exceptions.EvaluateTransactionException");
    } catch (br.com.addvisor.webservice.exceptions.EvaluateTransactionException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test48");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var14 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var16 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var18 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    boolean var21 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    boolean var24 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test49");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    boolean var14 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    var0.closeConnection();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test50");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var14 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    var0.closeConnection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.removeEvaluatesBy((java.lang.Long)0L);
      fail("Expected exception of type br.com.addvisor.webservice.exceptions.EvaluateTransactionException");
    } catch (br.com.addvisor.webservice.exceptions.EvaluateTransactionException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test51");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    boolean var2 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test52");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    var0.closeConnection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.removeEvaluatesBy((java.lang.Long)0L);
      fail("Expected exception of type br.com.addvisor.webservice.exceptions.EvaluateTransactionException");
    } catch (br.com.addvisor.webservice.exceptions.EvaluateTransactionException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test53");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.removeEvaluatesBy((java.lang.Long)0L);
      fail("Expected exception of type br.com.addvisor.webservice.exceptions.EvaluateTransactionException");
    } catch (br.com.addvisor.webservice.exceptions.EvaluateTransactionException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test54");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    var0.closeConnection();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test55");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var14 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    boolean var17 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var19 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var21 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var23 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test56");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var14 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var16 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    boolean var19 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    var0.closeConnection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var22 = var0.getAllEvaluatesTo((java.lang.Long)100L);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test57");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var14 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test58");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var14 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    var0.closeConnection();
    var0.closeConnection();
    boolean var18 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.removeEvaluatesBy((java.lang.Long)(-1L));
      fail("Expected exception of type br.com.addvisor.webservice.exceptions.EvaluateTransactionException");
    } catch (br.com.addvisor.webservice.exceptions.EvaluateTransactionException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test59");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    boolean var14 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var20 = var0.getAllEvaluatesTo((java.lang.Long)10L);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test60");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    boolean var14 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test61");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    boolean var14 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var16 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var18 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var20 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var24 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test62");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.removeEvaluatesBy((java.lang.Long)1L);
      fail("Expected exception of type br.com.addvisor.webservice.exceptions.EvaluateTransactionException");
    } catch (br.com.addvisor.webservice.exceptions.EvaluateTransactionException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test63");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.removeEvaluatesBy((java.lang.Long)1L);
      fail("Expected exception of type br.com.addvisor.webservice.exceptions.EvaluateTransactionException");
    } catch (br.com.addvisor.webservice.exceptions.EvaluateTransactionException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test64");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var13 = var0.getAllEvaluatesTo((java.lang.Long)0L);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test65");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var14 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    var0.closeConnection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.removeEvaluatesBy((java.lang.Long)(-1L));
      fail("Expected exception of type br.com.addvisor.webservice.exceptions.EvaluateTransactionException");
    } catch (br.com.addvisor.webservice.exceptions.EvaluateTransactionException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test66");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test67");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.removeEvaluatesBy((java.lang.Long)0L);
      fail("Expected exception of type br.com.addvisor.webservice.exceptions.EvaluateTransactionException");
    } catch (br.com.addvisor.webservice.exceptions.EvaluateTransactionException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test68");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    boolean var14 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var16 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var18 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    boolean var21 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var25 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test69");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var13 = var0.getAllEvaluatesTo((java.lang.Long)100L);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test70");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var12 = var0.getAllEvaluatesTo((java.lang.Long)10L);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test71");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.removeEvaluatesBy((java.lang.Long)0L);
      fail("Expected exception of type br.com.addvisor.webservice.exceptions.EvaluateTransactionException");
    } catch (br.com.addvisor.webservice.exceptions.EvaluateTransactionException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test72");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test73");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test74");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    boolean var14 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var16 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var18 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.removeEvaluatesBy((java.lang.Long)(-1L));
      fail("Expected exception of type br.com.addvisor.webservice.exceptions.EvaluateTransactionException");
    } catch (br.com.addvisor.webservice.exceptions.EvaluateTransactionException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test75");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    var0.closeConnection();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test76");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var14 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var16 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var18 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var20 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    var0.closeConnection();
    boolean var23 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test77");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.removeEvaluatesBy((java.lang.Long)(-1L));
      fail("Expected exception of type br.com.addvisor.webservice.exceptions.EvaluateTransactionException");
    } catch (br.com.addvisor.webservice.exceptions.EvaluateTransactionException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test78");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    var0.closeConnection();
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test79");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    var0.closeConnection();
    boolean var18 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var20 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var22 = var0.getAllEvaluatesTo((java.lang.Long)100L);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test80");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test81");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    boolean var2 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var18 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var20 = var0.getAllEvaluatesTo((java.lang.Long)100L);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test82");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    boolean var2 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    var0.closeConnection();
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var17 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var19 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var21 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.removeEvaluatesBy((java.lang.Long)100L);
      fail("Expected exception of type br.com.addvisor.webservice.exceptions.EvaluateTransactionException");
    } catch (br.com.addvisor.webservice.exceptions.EvaluateTransactionException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test83");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    boolean var14 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var16 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var18 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var20 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test84");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var17 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var19 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var21 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var23 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var25 = var0.getAllEvaluatesTo((java.lang.Long)100L);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test85");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    var0.closeConnection();
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.removeEvaluatesBy((java.lang.Long)0L);
      fail("Expected exception of type br.com.addvisor.webservice.exceptions.EvaluateTransactionException");
    } catch (br.com.addvisor.webservice.exceptions.EvaluateTransactionException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test86");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var14 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    boolean var17 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var19 = var0.getAllEvaluatesTo((java.lang.Long)0L);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test87");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.removeEvaluatesBy((java.lang.Long)100L);
      fail("Expected exception of type br.com.addvisor.webservice.exceptions.EvaluateTransactionException");
    } catch (br.com.addvisor.webservice.exceptions.EvaluateTransactionException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test88");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.removeEvaluatesBy((java.lang.Long)10L);
      fail("Expected exception of type br.com.addvisor.webservice.exceptions.EvaluateTransactionException");
    } catch (br.com.addvisor.webservice.exceptions.EvaluateTransactionException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test89");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var17 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var19 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var21 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var23 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var25 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    var0.closeConnection();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test90");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    boolean var14 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    boolean var17 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test91");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    boolean var2 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    var0.closeConnection();
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.removeEvaluatesBy((java.lang.Long)0L);
      fail("Expected exception of type br.com.addvisor.webservice.exceptions.EvaluateTransactionException");
    } catch (br.com.addvisor.webservice.exceptions.EvaluateTransactionException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test92");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.removeEvaluatesBy((java.lang.Long)100L);
      fail("Expected exception of type br.com.addvisor.webservice.exceptions.EvaluateTransactionException");
    } catch (br.com.addvisor.webservice.exceptions.EvaluateTransactionException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test93");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    var0.closeConnection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var11 = var0.getAllEvaluatesTo((java.lang.Long)0L);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

}
