package dao;

import junit.framework.*;

public class RandoopTest3 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test1");


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
    var0.closeConnection();
    boolean var19 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
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
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test2");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var14 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    var0.closeConnection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var18 = var0.getAllEvaluatesTo((java.lang.Long)10L);
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
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test3");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var14 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var16 = var0.getAllEvaluatesTo((java.lang.Long)10L);
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

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test4");


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
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test5");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    var0.closeConnection();
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)0L);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test6");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    boolean var14 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var16 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    
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

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test7");


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
    var0.closeConnection();
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var17 = var0.getAllEvaluatesTo((java.lang.Long)(-1L));
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
    assertTrue(var15 == false);

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test8");


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
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var17 = var0.removeEvaluatesOfService((java.lang.Long)1L);
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
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test9");


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
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test10");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)100L);
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

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test11");


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
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var17 = var0.getAllEvaluatesTo((java.lang.Long)(-1L));
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

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test12");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    boolean var2 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    var0.closeConnection();
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
    assertTrue(var2 == false);

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test13");


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
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    var0.closeConnection();
    boolean var18 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    boolean var21 = var0.removeEvaluatesOfService((java.lang.Long)100L);
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
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test14");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)0L);
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
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test15");


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
    assertTrue(var14 == false);

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test16");


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
    var0.closeConnection();
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var17 = var0.removeEvaluatesOfService((java.lang.Long)10L);
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
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test17");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    boolean var14 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var16 = var0.getAllEvaluatesTo((java.lang.Long)0L);
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
    assertTrue(var14 == false);

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test18");


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
    assertTrue(var8 == false);

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test19");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)10L);
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
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test20");


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
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var19 = var0.removeEvaluatesOfService((java.lang.Long)0L);
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
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test21");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    boolean var2 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    var0.closeConnection();
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
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test22");


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
      var0.removeEvaluatesBy((java.lang.Long)100L);
      fail("Expected exception of type br.com.addvisor.webservice.exceptions.EvaluateTransactionException");
    } catch (br.com.addvisor.webservice.exceptions.EvaluateTransactionException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test23");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var17 = var0.removeEvaluatesOfService((java.lang.Long)1L);
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
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test24");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    boolean var2 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var16 = var0.removeEvaluatesOfService((java.lang.Long)0L);
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
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test25");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var15 = var0.getAllEvaluatesTo((java.lang.Long)(-1L));
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test26");


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
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test27");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
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

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test28");


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
    boolean var23 = var0.removeEvaluatesOfService((java.lang.Long)1L);
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

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test29");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var17 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
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
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test30");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var15 = var0.getAllEvaluatesTo((java.lang.Long)(-1L));
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test31");


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
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var17 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var19 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var22 = var0.getAllEvaluatesTo((java.lang.Long)0L);
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
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test32");


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
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var17 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var19 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var21 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var23 = var0.getAllEvaluatesTo((java.lang.Long)10L);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test33");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var14 = var0.getAllEvaluatesTo((java.lang.Long)100L);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test34");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    var0.closeConnection();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test35");


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
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    boolean var18 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var20 = var0.removeEvaluatesOfService((java.lang.Long)1L);
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
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test36");


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
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var18 = var0.getAllEvaluatesTo((java.lang.Long)10L);
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
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test37");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)100L);
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
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test38");


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
    var0.closeConnection();
    var0.closeConnection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var16 = var0.getAllEvaluatesTo((java.lang.Long)10L);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test39");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var17 = var0.removeEvaluatesOfService((java.lang.Long)0L);
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
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test40");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)1L);
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
    assertTrue(var8 == false);

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test41");


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
    assertTrue(var8 == false);

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test42");


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

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test43");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)10L);
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
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test44");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)10L);
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
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test45");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)1L);
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
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test46");


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
    boolean var14 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var16 = var0.removeEvaluatesOfService((java.lang.Long)100L);
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
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test47");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    boolean var2 = var0.removeEvaluatesOfService((java.lang.Long)0L);
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
    assertTrue(var2 == false);

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test48");


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
    boolean var16 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var18 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var21 = var0.getAllEvaluatesTo((java.lang.Long)1L);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test49");


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
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    boolean var18 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var20 = var0.removeEvaluatesOfService((java.lang.Long)1L);
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

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test50");


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
    boolean var20 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var22 = var0.getAllEvaluatesTo((java.lang.Long)10L);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test51");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var9 = var0.getAllEvaluatesTo((java.lang.Long)0L);
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

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test52");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var17 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var20 = var0.getAllEvaluatesTo((java.lang.Long)0L);
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
    assertTrue(var17 == false);

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test53");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var14 = var0.getAllEvaluatesTo((java.lang.Long)100L);
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
    assertTrue(var12 == false);

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test54");


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
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var17 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var19 = var0.removeEvaluatesOfService((java.lang.Long)1L);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test55");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)10L);
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

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test56");


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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test57");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)1L);
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
    assertTrue(var11 == false);

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test58");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    boolean var2 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
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
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test59");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var17 = var0.getAllEvaluatesTo((java.lang.Long)1L);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test60");


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

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test61");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    
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

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test62");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    boolean var2 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var14 = var0.getAllEvaluatesTo((java.lang.Long)(-1L));
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

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test63");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    var0.closeConnection();
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var17 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    
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
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test64");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)10L);
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
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test65");


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
    boolean var17 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test66");


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
    boolean var16 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var18 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var20 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var22 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var24 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    
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
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test67");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)1L);
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
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test68");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var14 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var16 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    
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

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test69");


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
    boolean var24 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    
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
    assertTrue(var24 == false);

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test70");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test71");


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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test72");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    
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

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test73");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)1L);
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
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test74");


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
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)0L);
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
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test75");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var8 = var0.getAllEvaluatesTo((java.lang.Long)10L);
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

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test76");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)0L);
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

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test77");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    boolean var2 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)1L);
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
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test78");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var14 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var16 = var0.removeEvaluatesOfService((java.lang.Long)100L);
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
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test79");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var11 = var0.getAllEvaluatesTo((java.lang.Long)1L);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test80");


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
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)10L);
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
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test81");


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
      java.util.List var15 = var0.getAllEvaluatesTo((java.lang.Long)1L);
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

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test82");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    boolean var2 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test83");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)0L);
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

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test84");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    boolean var18 = var0.removeEvaluatesOfService((java.lang.Long)1L);
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
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test85");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var17 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var19 = var0.getAllEvaluatesTo((java.lang.Long)100L);
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
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test86");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)100L);
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
    assertTrue(var10 == false);

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test87");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
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
    assertTrue(var5 == false);

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test88");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    boolean var16 = var0.removeEvaluatesOfService((java.lang.Long)100L);
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
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test89");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)10L);
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
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test90");


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
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var17 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test91");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)1L);
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
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test92");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var12 = var0.getAllEvaluatesTo((java.lang.Long)1L);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test93");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)1L);
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

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test94");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)10L);
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
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test95");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    boolean var2 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
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
    assertTrue(var2 == false);

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test96");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var11 = var0.getAllEvaluatesTo((java.lang.Long)10L);
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

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test97");


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
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var19 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    
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
    assertTrue(var19 == false);

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test98");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
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

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test99");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)1L);
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
    assertTrue(var9 == false);

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test100");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
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
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test101");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var14 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var16 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    boolean var19 = var0.removeEvaluatesOfService((java.lang.Long)0L);
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
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test102");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var12 = var0.getAllEvaluatesTo((java.lang.Long)1L);
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

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test103");


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
    boolean var17 = var0.removeEvaluatesOfService((java.lang.Long)10L);
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
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test104");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var13 = var0.getAllEvaluatesTo((java.lang.Long)(-1L));
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

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test105");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var13 = var0.getAllEvaluatesTo((java.lang.Long)(-1L));
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

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test106");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var15 = var0.getAllEvaluatesTo((java.lang.Long)1L);
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

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test107");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)1L);
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
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test108");


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
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var20 = var0.getAllEvaluatesTo((java.lang.Long)(-1L));
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
    assertTrue(var15 == false);

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test109");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    boolean var2 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    var0.closeConnection();
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
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test110");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    
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

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test111");


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
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)100L);
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
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test112");


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
    boolean var23 = var0.removeEvaluatesOfService((java.lang.Long)1L);
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

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test113");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)100L);
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
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test114");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var8 = var0.getAllEvaluatesTo((java.lang.Long)0L);
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

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test115");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    boolean var2 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)1L);
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
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test116");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var19 = var0.getAllEvaluatesTo((java.lang.Long)(-1L));
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

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test117");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var13 = var0.getAllEvaluatesTo((java.lang.Long)1L);
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

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test118");


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
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test119");


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
    assertTrue(var14 == false);

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test120");


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
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test121");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    var0.closeConnection();
    boolean var14 = var0.removeEvaluatesOfService((java.lang.Long)10L);
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
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test122");


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
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    var0.closeConnection();
    boolean var18 = var0.removeEvaluatesOfService((java.lang.Long)0L);
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
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test123");


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
      java.util.List var10 = var0.getAllEvaluatesTo((java.lang.Long)10L);
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

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test124");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)1L);
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
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test125");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
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
    assertTrue(var9 == false);

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test126");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)10L);
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
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test127");


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
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    var0.closeConnection();
    boolean var18 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var20 = var0.getAllEvaluatesTo((java.lang.Long)1L);
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
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test128");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)10L);
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
    assertTrue(var9 == false);

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test129");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var17 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    
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

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test130");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
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
    assertTrue(var15 == false);

  }

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test131");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
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

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test132");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    boolean var2 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)10L);
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
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test133");


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
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var17 = var0.removeEvaluatesOfService((java.lang.Long)1L);
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
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test134");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var9 = var0.getAllEvaluatesTo((java.lang.Long)1L);
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

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test135");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)1L);
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

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test136");


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
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    var0.closeConnection();
    boolean var18 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    boolean var21 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var23 = var0.getAllEvaluatesTo((java.lang.Long)0L);
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
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test137");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var16 = var0.getAllEvaluatesTo((java.lang.Long)1L);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test138");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    boolean var2 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)10L);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test139");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
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
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test140");


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
    var0.closeConnection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var20 = var0.getAllEvaluatesTo((java.lang.Long)1L);
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

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test141");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)1L);
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
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test142");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
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
    assertTrue(var7 == false);

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test143");


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
    boolean var20 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var22 = var0.getAllEvaluatesTo((java.lang.Long)1L);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test144");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var14 = var0.getAllEvaluatesTo((java.lang.Long)100L);
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

  }

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test145");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)1L);
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
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test146");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)100L);
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
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test147");


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
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var17 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var19 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var21 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test148");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
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
    assertTrue(var13 == false);

  }

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test149");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var16 = var0.getAllEvaluatesTo((java.lang.Long)0L);
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
    assertTrue(var13 == false);

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test150");


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
    var0.closeConnection();
    boolean var16 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var18 = var0.getAllEvaluatesTo((java.lang.Long)(-1L));
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test151");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)10L);
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
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test152");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    var0.closeConnection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var13 = var0.getAllEvaluatesTo((java.lang.Long)1L);
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

  }

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test153");


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
    var0.closeConnection();
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var17 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    var0.closeConnection();
    var0.closeConnection();
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
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test154");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var21 = var0.getAllEvaluatesTo((java.lang.Long)100L);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test155");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    var0.closeConnection();
    var0.closeConnection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var14 = var0.getAllEvaluatesTo((java.lang.Long)10L);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test156() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test156");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    boolean var14 = var0.removeEvaluatesOfService((java.lang.Long)100L);
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
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test157() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test157");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test158() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test158");


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
    var0.closeConnection();
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    boolean var18 = var0.removeEvaluatesOfService((java.lang.Long)0L);
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
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test159() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test159");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var14 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var16 = var0.getAllEvaluatesTo((java.lang.Long)100L);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test160() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test160");


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
      java.util.List var16 = var0.getAllEvaluatesTo((java.lang.Long)10L);
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
    assertTrue(var13 == false);

  }

  public void test161() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test161");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
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
    assertTrue(var10 == false);

  }

  public void test162() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test162");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    boolean var2 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    var0.closeConnection();
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    
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

  public void test163() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test163");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)100L);
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
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test164() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test164");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var18 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var20 = var0.removeEvaluatesOfService((java.lang.Long)0L);
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
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test165() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test165");


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
    boolean var17 = var0.removeEvaluatesOfService((java.lang.Long)10L);
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

  }

  public void test166() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test166");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var14 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var16 = var0.removeEvaluatesOfService((java.lang.Long)10L);
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
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test167() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test167");


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
    var0.closeConnection();
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var17 = var0.removeEvaluatesOfService((java.lang.Long)100L);
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
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test168() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test168");


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
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test169() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test169");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test170() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test170");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var15 = var0.getAllEvaluatesTo((java.lang.Long)(-1L));
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test171() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test171");


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
    boolean var17 = var0.removeEvaluatesOfService((java.lang.Long)1L);
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
    assertTrue(var17 == false);

  }

  public void test172() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test172");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)0L);
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

  }

  public void test173() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test173");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    var0.closeConnection();
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)0L);
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
    assertTrue(var13 == false);

  }

  public void test174() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test174");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)100L);
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
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test175() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test175");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
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
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test176() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test176");


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
    var0.closeConnection();
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
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test177() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test177");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    var0.closeConnection();
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
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test178() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test178");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var18 = var0.getAllEvaluatesTo((java.lang.Long)10L);
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

  public void test179() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test179");


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
    var0.closeConnection();
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var17 = var0.removeEvaluatesOfService((java.lang.Long)100L);
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
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test180() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test180");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)100L);
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
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test181() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test181");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
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

  public void test182() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test182");


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
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var17 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var19 = var0.removeEvaluatesOfService((java.lang.Long)10L);
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
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test183() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test183");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    boolean var2 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
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

  }

  public void test184() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test184");


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
    var0.closeConnection();
    boolean var16 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    var0.closeConnection();
    boolean var19 = var0.removeEvaluatesOfService((java.lang.Long)0L);
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
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test185() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test185");


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
    var0.closeConnection();
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
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test186() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test186");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)0L);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test187() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test187");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var15 = var0.getAllEvaluatesTo((java.lang.Long)1L);
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
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test188() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test188");


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
    var0.closeConnection();
    boolean var21 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var23 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    var0.closeConnection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var26 = var0.getAllEvaluatesTo((java.lang.Long)0L);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test189() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test189");


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
    var0.closeConnection();
    var0.closeConnection();
    boolean var22 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test190() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test190");


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
    boolean var16 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    boolean var19 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    
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
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test191() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test191");


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
    boolean var16 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var19 = var0.getAllEvaluatesTo((java.lang.Long)100L);
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
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test192() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test192");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var18 = var0.getAllEvaluatesTo((java.lang.Long)10L);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test193() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test193");


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
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
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
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test194() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test194");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var14 = var0.removeEvaluatesOfService((java.lang.Long)10L);
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
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test195() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test195");


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
    boolean var19 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var21 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var23 = var0.removeEvaluatesOfService((java.lang.Long)10L);
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

  public void test196() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test196");


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
    var0.closeConnection();
    var0.closeConnection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var16 = var0.getAllEvaluatesTo((java.lang.Long)100L);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test197() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test197");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var16 = var0.getAllEvaluatesTo((java.lang.Long)100L);
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

  }

  public void test198() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test198");


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
    var0.closeConnection();
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    boolean var18 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var20 = var0.removeEvaluatesOfService((java.lang.Long)1L);
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
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test199() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test199");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    var0.closeConnection();
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)10L);
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
    assertTrue(var13 == false);

  }

  public void test200() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test200");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    boolean var2 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var14 = var0.getAllEvaluatesTo((java.lang.Long)10L);
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
    assertTrue(var12 == false);

  }

  public void test201() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test201");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)100L);
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
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test202() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test202");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)10L);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test203() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test203");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var10 = var0.getAllEvaluatesTo((java.lang.Long)1L);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test204() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test204");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var17 = var0.getAllEvaluatesTo((java.lang.Long)(-1L));
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
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test205() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test205");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
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
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test206() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test206");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)100L);
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
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test207() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test207");


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
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    boolean var18 = var0.removeEvaluatesOfService((java.lang.Long)0L);
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
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test208() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test208");


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
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var17 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var19 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var21 = var0.getAllEvaluatesTo((java.lang.Long)100L);
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
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test209() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test209");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var14 = var0.getAllEvaluatesTo((java.lang.Long)(-1L));
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
    assertTrue(var12 == false);

  }

  public void test210() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test210");


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
    boolean var16 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var18 = var0.removeEvaluatesOfService((java.lang.Long)1L);
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
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test211() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test211");


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
    boolean var16 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    var0.closeConnection();
    var0.closeConnection();
    boolean var20 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    
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
    assertTrue(var20 == false);

  }

  public void test212() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test212");


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

  }

  public void test213() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test213");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
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
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test214() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test214");


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
    boolean var14 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
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
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test215() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test215");


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
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test216() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test216");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var11 = var0.getAllEvaluatesTo((java.lang.Long)100L);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test217() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test217");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var15 = var0.getAllEvaluatesTo((java.lang.Long)(-1L));
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
    assertTrue(var13 == false);

  }

  public void test218() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test218");


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

  }

  public void test219() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test219");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    boolean var14 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var16 = var0.removeEvaluatesOfService((java.lang.Long)100L);
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
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test220() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test220");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var20 = var0.getAllEvaluatesTo((java.lang.Long)(-1L));
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
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test221() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test221");


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
    boolean var21 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    
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

  }

  public void test222() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test222");


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
    boolean var17 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var19 = var0.removeEvaluatesOfService((java.lang.Long)100L);
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
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test223() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test223");


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
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var16 = var0.getAllEvaluatesTo((java.lang.Long)100L);
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

  }

  public void test224() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test224");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var10 = var0.getAllEvaluatesTo((java.lang.Long)10L);
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

  }

  public void test225() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test225");


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
    boolean var14 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var16 = var0.getAllEvaluatesTo((java.lang.Long)1L);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test226() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test226");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)10L);
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
    assertTrue(var9 == false);

  }

  public void test227() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test227");


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
    boolean var14 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test228() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test228");


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
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test229() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test229");


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
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var17 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var19 = var0.removeEvaluatesOfService((java.lang.Long)100L);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test230() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test230");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
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
    assertTrue(var7 == false);

  }

  public void test231() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test231");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var14 = var0.getAllEvaluatesTo((java.lang.Long)(-1L));
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

  public void test232() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test232");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test233() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test233");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    boolean var2 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    var0.closeConnection();
    boolean var16 = var0.removeEvaluatesOfService((java.lang.Long)0L);
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
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test234() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test234");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    var0.closeConnection();
    boolean var14 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var16 = var0.getAllEvaluatesTo((java.lang.Long)1L);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test235() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test235");


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
    var0.closeConnection();
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var17 = var0.getAllEvaluatesTo((java.lang.Long)1L);
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
    assertTrue(var15 == false);

  }

  public void test236() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test236");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var18 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var20 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var22 = var0.getAllEvaluatesTo((java.lang.Long)10L);
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
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test237() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test237");


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
    assertTrue(var11 == false);

  }

  public void test238() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test238");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var15 = var0.getAllEvaluatesTo((java.lang.Long)1L);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test239() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test239");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)10L);
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

  }

  public void test240() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test240");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var17 = var0.removeEvaluatesOfService((java.lang.Long)0L);
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
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test241() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test241");


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
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
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
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test242() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test242");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)100L);
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

  public void test243() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test243");


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
    var0.closeConnection();
    
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

  public void test244() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test244");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)10L);
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
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test245() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test245");


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
    var0.closeConnection();
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var17 = var0.getAllEvaluatesTo((java.lang.Long)1L);
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
    assertTrue(var15 == false);

  }

  public void test246() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test246");


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
    var0.closeConnection();
    boolean var19 = var0.removeEvaluatesOfService((java.lang.Long)0L);
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
    assertTrue(var19 == false);

  }

  public void test247() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test247");


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
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)10L);
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
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test248() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test248");


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
    var0.closeConnection();
    boolean var16 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var18 = var0.removeEvaluatesOfService((java.lang.Long)0L);
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

  public void test249() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test249");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var16 = var0.getAllEvaluatesTo((java.lang.Long)100L);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test250() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test250");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)0L);
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
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test251() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test251");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var18 = var0.getAllEvaluatesTo((java.lang.Long)100L);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test252() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test252");


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
    boolean var14 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test253() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test253");


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

  public void test254() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test254");


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
    var0.closeConnection();
    boolean var19 = var0.removeEvaluatesOfService((java.lang.Long)0L);
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
    assertTrue(var19 == false);

  }

  public void test255() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test255");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    boolean var2 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    var0.closeConnection();
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

  }

  public void test256() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test256");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test257() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test257");


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
    boolean var16 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    var0.closeConnection();
    boolean var19 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var22 = var0.getAllEvaluatesTo((java.lang.Long)1L);
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

  public void test258() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test258");


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
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var17 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var19 = var0.removeEvaluatesOfService((java.lang.Long)100L);
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
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test259() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test259");


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
    boolean var16 = var0.removeEvaluatesOfService((java.lang.Long)0L);
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
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test260() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test260");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    var0.closeConnection();
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)0L);
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
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test261() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test261");


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
    var0.closeConnection();
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

  }

  public void test262() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test262");


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
    boolean var18 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var20 = var0.removeEvaluatesOfService((java.lang.Long)1L);
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
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test263() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test263");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    boolean var14 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var16 = var0.getAllEvaluatesTo((java.lang.Long)10L);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test264() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test264");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)100L);
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

  }

  public void test265() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test265");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)10L);
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
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test266() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test266");


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
    assertTrue(var10 == false);

  }

  public void test267() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test267");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)10L);
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
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test268() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test268");


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
    boolean var16 = var0.removeEvaluatesOfService((java.lang.Long)0L);
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
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test269() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test269");


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
    boolean var16 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
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
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test270() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test270");


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
    boolean var17 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var19 = var0.removeEvaluatesOfService((java.lang.Long)0L);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test271() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test271");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var14 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    var0.closeConnection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var17 = var0.getAllEvaluatesTo((java.lang.Long)0L);
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
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test272() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test272");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)1L);
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
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test273() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test273");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    
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

  }

  public void test274() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test274");


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
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var17 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var19 = var0.getAllEvaluatesTo((java.lang.Long)(-1L));
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test275() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test275");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)1L);
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
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test276() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test276");


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
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)1L);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test277() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test277");


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
    var0.closeConnection();
    var0.closeConnection();
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
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test278() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test278");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    boolean var2 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    var0.closeConnection();
    var0.closeConnection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var17 = var0.getAllEvaluatesTo((java.lang.Long)1L);
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
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test279() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test279");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    var0.closeConnection();
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
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test280() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test280");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)10L);
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
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test281() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test281");


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
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var17 = var0.getAllEvaluatesTo((java.lang.Long)(-1L));
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
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test282() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test282");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    boolean var2 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var15 = var0.getAllEvaluatesTo((java.lang.Long)(-1L));
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

  }

  public void test283() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test283");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
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

  }

  public void test284() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test284");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    var0.closeConnection();
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var13 = var0.getAllEvaluatesTo((java.lang.Long)1L);
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
    assertTrue(var11 == false);

  }

  public void test285() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test285");


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
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    boolean var18 = var0.removeEvaluatesOfService((java.lang.Long)1L);
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
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test286() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test286");


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
    var0.closeConnection();
    var0.closeConnection();
    boolean var18 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    boolean var21 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var23 = var0.getAllEvaluatesTo((java.lang.Long)100L);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test287() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test287");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)1L);
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
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test288() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test288");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    boolean var14 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var16 = var0.getAllEvaluatesTo((java.lang.Long)1L);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test289() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test289");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    boolean var2 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    var0.closeConnection();
    var0.closeConnection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var17 = var0.getAllEvaluatesTo((java.lang.Long)100L);
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
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test290() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test290");


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
    var0.closeConnection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var20 = var0.getAllEvaluatesTo((java.lang.Long)0L);
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

  }

  public void test291() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test291");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var12 = var0.getAllEvaluatesTo((java.lang.Long)0L);
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

  }

  public void test292() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test292");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)100L);
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
    assertTrue(var13 == false);

  }

  public void test293() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test293");


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
    boolean var14 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
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
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test294() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test294");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test295() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test295");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var14 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    
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

  public void test296() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test296");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var12 = var0.getAllEvaluatesTo((java.lang.Long)1L);
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
    assertTrue(var9 == false);

  }

  public void test297() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test297");


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
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test298() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test298");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)100L);
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
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test299() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test299");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var14 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    var0.closeConnection();
    var0.closeConnection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var18 = var0.getAllEvaluatesTo((java.lang.Long)100L);
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
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test300() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test300");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test301() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test301");


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
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var17 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var19 = var0.removeEvaluatesOfService((java.lang.Long)10L);
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
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test302() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test302");


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
    var0.closeConnection();
    boolean var16 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var18 = var0.removeEvaluatesOfService((java.lang.Long)0L);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test303() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test303");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)100L);
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
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test304() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test304");


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
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    var0.closeConnection();
    boolean var18 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test305() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test305");


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
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test306() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test306");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)10L);
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

  public void test307() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test307");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)10L);
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

  public void test308() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test308");


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
    var0.closeConnection();
    var0.closeConnection();
    boolean var18 = var0.removeEvaluatesOfService((java.lang.Long)10L);
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
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test309() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test309");


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
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var17 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var19 = var0.getAllEvaluatesTo((java.lang.Long)100L);
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
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test310() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test310");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var16 = var0.getAllEvaluatesTo((java.lang.Long)10L);
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

  }

  public void test311() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test311");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)0L);
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

  }

  public void test312() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test312");


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
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var17 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var19 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var21 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var23 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var25 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var27 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var29 = var0.getAllEvaluatesTo((java.lang.Long)(-1L));
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test313() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test313");


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
    assertTrue(var14 == false);

  }

  public void test314() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test314");


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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test315() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test315");


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
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    boolean var18 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var20 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    
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
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test316() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test316");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    
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

  public void test317() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test317");


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
    var0.closeConnection();
    var0.closeConnection();
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
    assertTrue(var14 == false);

  }

  public void test318() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test318");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    var0.closeConnection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var14 = var0.getAllEvaluatesTo((java.lang.Long)(-1L));
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

  public void test319() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test319");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var14 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    var0.closeConnection();
    boolean var17 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var19 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var21 = var0.getAllEvaluatesTo((java.lang.Long)100L);
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
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test320() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test320");


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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test321() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test321");


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
    var0.closeConnection();
    boolean var21 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var23 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    var0.closeConnection();
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
    assertTrue(var23 == false);

  }

  public void test322() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test322");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var17 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var19 = var0.getAllEvaluatesTo((java.lang.Long)100L);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test323() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test323");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    var0.closeConnection();
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
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test324() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test324");


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
    var0.closeConnection();
    var0.closeConnection();
    boolean var16 = var0.removeEvaluatesOfService((java.lang.Long)100L);
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
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test325() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test325");


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
    var0.closeConnection();
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var17 = var0.removeEvaluatesOfService((java.lang.Long)1L);
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
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test326() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test326");


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
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var17 = var0.removeEvaluatesOfService((java.lang.Long)0L);
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
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test327() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test327");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
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
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test328() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test328");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var11 = var0.getAllEvaluatesTo((java.lang.Long)1L);
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

  }

  public void test329() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test329");


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
    var0.closeConnection();
    var0.closeConnection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var22 = var0.getAllEvaluatesTo((java.lang.Long)1L);
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
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test330() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test330");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    boolean var2 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var9 = var0.getAllEvaluatesTo((java.lang.Long)1L);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test331() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test331");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var14 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var16 = var0.getAllEvaluatesTo((java.lang.Long)100L);
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
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test332() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test332");


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
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var17 = var0.getAllEvaluatesTo((java.lang.Long)10L);
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
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test333() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test333");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var17 = var0.getAllEvaluatesTo((java.lang.Long)10L);
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
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test334() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test334");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)100L);
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
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test335() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test335");


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
    var0.closeConnection();
    var0.closeConnection();
    boolean var18 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var23 = var0.getAllEvaluatesTo((java.lang.Long)1L);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test336() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test336");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var11 = var0.getAllEvaluatesTo((java.lang.Long)100L);
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

  }

  public void test337() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test337");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)100L);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test338() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test338");


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
    boolean var22 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test339() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test339");


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

  public void test340() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test340");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test341() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test341");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    boolean var2 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var9 = var0.getAllEvaluatesTo((java.lang.Long)0L);
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

  }

  public void test342() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test342");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var18 = var0.getAllEvaluatesTo((java.lang.Long)10L);
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

  }

  public void test343() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test343");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)1L);
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
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test344() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test344");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var17 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test345() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test345");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    var0.closeConnection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var15 = var0.getAllEvaluatesTo((java.lang.Long)(-1L));
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
    assertTrue(var12 == false);

  }

  public void test346() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test346");


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
    boolean var14 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var16 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    
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

  }

  public void test347() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test347");


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
    var0.closeConnection();
    boolean var16 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var18 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test348() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test348");


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
    var0.closeConnection();
    boolean var17 = var0.removeEvaluatesOfService((java.lang.Long)100L);
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
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test349() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test349");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var17 = var0.removeEvaluatesOfService((java.lang.Long)1L);
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

  }

  public void test350() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test350");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    var0.closeConnection();
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)10L);
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

  }

  public void test351() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test351");


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
    boolean var16 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    var0.closeConnection();
    var0.closeConnection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var20 = var0.getAllEvaluatesTo((java.lang.Long)(-1L));
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

  }

  public void test352() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test352");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
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
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test353() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test353");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)0L);
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
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test354() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test354");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var14 = var0.getAllEvaluatesTo((java.lang.Long)10L);
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
    assertTrue(var12 == false);

  }

  public void test355() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test355");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var11 = var0.getAllEvaluatesTo((java.lang.Long)10L);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test356() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test356");


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
    boolean var17 = var0.removeEvaluatesOfService((java.lang.Long)1L);
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
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test357() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test357");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)100L);
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
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test358() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test358");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var17 = var0.removeEvaluatesOfService((java.lang.Long)1L);
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
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test359() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test359");


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
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test360() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test360");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    boolean var2 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var14 = var0.getAllEvaluatesTo((java.lang.Long)(-1L));
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
    assertTrue(var12 == false);

  }

  public void test361() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test361");


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
    var0.closeConnection();
    boolean var16 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var18 = var0.getAllEvaluatesTo((java.lang.Long)10L);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test362() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test362");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var14 = var0.getAllEvaluatesTo((java.lang.Long)10L);
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
    assertTrue(var12 == false);

  }

  public void test363() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test363");


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
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var18 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var20 = var0.getAllEvaluatesTo((java.lang.Long)1L);
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
    assertTrue(var18 == false);

  }

  public void test364() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test364");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
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
    assertTrue(var8 == false);

  }

  public void test365() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test365");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)100L);
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
    assertTrue(var8 == false);

  }

  public void test366() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test366");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var14 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var16 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    
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

  }

  public void test367() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test367");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)1L);
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
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test368() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test368");


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
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test369() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test369");


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
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test370() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test370");


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
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    var0.closeConnection();
    boolean var18 = var0.removeEvaluatesOfService((java.lang.Long)0L);
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
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test371() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test371");


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
    boolean var16 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
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
    assertTrue(var18 == false);

  }

  public void test372() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test372");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var12 = var0.getAllEvaluatesTo((java.lang.Long)100L);
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

  }

  public void test373() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test373");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var14 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    var0.closeConnection();
    boolean var17 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var19 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test374() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test374");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var14 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var16 = var0.removeEvaluatesOfService((java.lang.Long)10L);
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
    assertTrue(var16 == false);

  }

  public void test375() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test375");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
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
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test376() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test376");


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
    var0.closeConnection();
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
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
    assertTrue(var15 == false);

  }

  public void test377() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test377");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
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
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test378() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test378");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    boolean var2 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
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
    assertTrue(var7 == false);

  }

  public void test379() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test379");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
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
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test380() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test380");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)100L);
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
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test381() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test381");


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
    var0.closeConnection();
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)0L);
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
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test382() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test382");


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
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var17 = var0.removeEvaluatesOfService((java.lang.Long)10L);
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
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test383() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test383");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    boolean var2 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)10L);
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
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test384() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test384");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)100L);
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
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test385() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test385");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var17 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var19 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    var0.closeConnection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var22 = var0.getAllEvaluatesTo((java.lang.Long)(-1L));
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
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test386() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test386");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
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
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test387() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test387");


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
    boolean var16 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var19 = var0.getAllEvaluatesTo((java.lang.Long)(-1L));
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
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test388() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test388");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test389() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test389");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var14 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var16 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var18 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    
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
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test390() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test390");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
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
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test391() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test391");


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
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var17 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var19 = var0.removeEvaluatesOfService((java.lang.Long)0L);
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
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test392() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test392");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var17 = var0.removeEvaluatesOfService((java.lang.Long)1L);
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

  }

  public void test393() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test393");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var13 = var0.getAllEvaluatesTo((java.lang.Long)(-1L));
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

  public void test394() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test394");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var14 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
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
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test395() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test395");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test396() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test396");


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
    var0.closeConnection();
    boolean var16 = var0.removeEvaluatesOfService((java.lang.Long)1L);
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
    assertTrue(var16 == false);

  }

  public void test397() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test397");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    boolean var14 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var16 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
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
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test398() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test398");


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
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test399() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test399");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var17 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var19 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test400() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test400");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)100L);
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

  }

  public void test401() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test401");


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
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test402() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test402");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)10L);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test403() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test403");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var16 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test404() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test404");


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
    var0.closeConnection();
    var0.closeConnection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var21 = var0.getAllEvaluatesTo((java.lang.Long)100L);
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

  }

  public void test405() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test405");


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
    boolean var20 = var0.removeEvaluatesOfService((java.lang.Long)1L);
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

  public void test406() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test406");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var10 = var0.getAllEvaluatesTo((java.lang.Long)0L);
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

  }

  public void test407() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test407");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var14 = var0.getAllEvaluatesTo((java.lang.Long)(-1L));
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
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test408() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test408");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)10L);
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
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test409() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test409");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    boolean var2 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)1L);
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
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test410() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test410");


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
    var0.closeConnection();
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var20 = var0.getAllEvaluatesTo((java.lang.Long)0L);
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
    assertTrue(var15 == false);

  }

  public void test411() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test411");


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
    boolean var14 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var16 = var0.getAllEvaluatesTo((java.lang.Long)10L);
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

  }

  public void test412() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test412");


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
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)10L);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test413() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test413");


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
    var0.closeConnection();
    boolean var19 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    
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
    assertTrue(var19 == false);

  }

  public void test414() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test414");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    var0.closeConnection();
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)0L);
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
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test415() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test415");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    boolean var14 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var16 = var0.getAllEvaluatesTo((java.lang.Long)1L);
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
    assertTrue(var14 == false);

  }

  public void test416() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test416");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    boolean var2 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var14 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var16 = var0.removeEvaluatesOfService((java.lang.Long)0L);
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
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test417() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test417");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var16 = var0.getAllEvaluatesTo((java.lang.Long)100L);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test418() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test418");


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
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
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
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test419() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test419");


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
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var17 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var19 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var21 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var23 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var25 = var0.getAllEvaluatesTo((java.lang.Long)1L);
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

  public void test420() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test420");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var14 = var0.getAllEvaluatesTo((java.lang.Long)(-1L));
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

  }

  public void test421() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test421");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)0L);
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
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test422() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test422");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var10 = var0.getAllEvaluatesTo((java.lang.Long)(-1L));
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

  }

  public void test423() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test423");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    boolean var14 = var0.removeEvaluatesOfService((java.lang.Long)1L);
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
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test424() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test424");


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
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var18 = var0.removeEvaluatesOfService((java.lang.Long)0L);
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
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test425() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test425");


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
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)10L);
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
    assertTrue(var15 == false);

  }

  public void test426() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test426");


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
    var0.closeConnection();
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
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test427() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test427");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test428() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test428");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    boolean var2 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var9 = var0.getAllEvaluatesTo((java.lang.Long)(-1L));
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
    assertTrue(var7 == false);

  }

  public void test429() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test429");


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
    var0.closeConnection();
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    var0.closeConnection();
    
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

  public void test430() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test430");


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
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var17 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var19 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var21 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var23 = var0.getAllEvaluatesTo((java.lang.Long)10L);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test431() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test431");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
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
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test432() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test432");


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
      java.util.List var13 = var0.getAllEvaluatesTo((java.lang.Long)100L);
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

  public void test433() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test433");


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

  }

  public void test434() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test434");


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
    boolean var14 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    
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

  public void test435() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test435");


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
    var0.closeConnection();
    var0.closeConnection();
    boolean var16 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
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
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test436() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test436");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var13 = var0.getAllEvaluatesTo((java.lang.Long)10L);
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

  }

  public void test437() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test437");


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
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test438() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test438");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var17 = var0.getAllEvaluatesTo((java.lang.Long)(-1L));
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test439() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test439");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    boolean var2 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var14 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var16 = var0.removeEvaluatesOfService((java.lang.Long)100L);
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
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test440() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test440");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    
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

  }

  public void test441() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test441");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    boolean var2 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)10L);
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
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test442() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test442");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
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
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test443() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test443");


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
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)0L);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test444() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test444");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    var0.closeConnection();
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test445() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test445");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var11 = var0.getAllEvaluatesTo((java.lang.Long)10L);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test446() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test446");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    boolean var2 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
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

  }

  public void test447() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test447");


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
    var0.closeConnection();
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    boolean var18 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    boolean var21 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
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
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test448() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test448");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var12 = var0.getAllEvaluatesTo((java.lang.Long)100L);
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
    assertTrue(var9 == false);

  }

  public void test449() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test449");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)10L);
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

  }

  public void test450() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test450");


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
    boolean var16 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test451() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test451");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var15 = var0.getAllEvaluatesTo((java.lang.Long)1L);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test452() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test452");


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
    var0.closeConnection();
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var17 = var0.removeEvaluatesOfService((java.lang.Long)100L);
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
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test453() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test453");


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
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    
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

  }

  public void test454() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test454");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    boolean var18 = var0.removeEvaluatesOfService((java.lang.Long)1L);
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
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test455() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test455");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)0L);
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
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test456() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test456");


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
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var17 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    
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
    assertTrue(var17 == false);

  }

  public void test457() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test457");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    var0.closeConnection();
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)10L);
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
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test458() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test458");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)1L);
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
    assertTrue(var13 == false);

  }

  public void test459() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test459");


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
    var0.closeConnection();
    var0.closeConnection();
    
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

  }

  public void test460() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test460");


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
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var17 = var0.removeEvaluatesOfService((java.lang.Long)1L);
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
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test461() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test461");


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
    var0.closeConnection();
    var0.closeConnection();
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

  }

  public void test462() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test462");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)10L);
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

  public void test463() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test463");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
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
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test464() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test464");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    boolean var2 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    var0.closeConnection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var11 = var0.getAllEvaluatesTo((java.lang.Long)(-1L));
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

  }

  public void test465() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test465");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    boolean var2 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var14 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var16 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var18 = var0.getAllEvaluatesTo((java.lang.Long)100L);
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
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test466() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test466");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var13 = var0.getAllEvaluatesTo((java.lang.Long)1L);
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

  }

  public void test467() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test467");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var14 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var16 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var18 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
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

  public void test468() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test468");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    boolean var2 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test469() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test469");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var12 = var0.getAllEvaluatesTo((java.lang.Long)(-1L));
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
    assertTrue(var10 == false);

  }

  public void test470() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test470");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var17 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var19 = var0.getAllEvaluatesTo((java.lang.Long)100L);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test471() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test471");


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
    var0.closeConnection();
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var17 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test472() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test472");


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
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test473() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test473");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var14 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var16 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    
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

  }

  public void test474() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test474");


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
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test475() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test475");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var14 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test476() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test476");


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
    boolean var18 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var20 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var22 = var0.getAllEvaluatesTo((java.lang.Long)(-1L));
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test477() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test477");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)10L);
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
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test478() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test478");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)100L);
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

  }

  public void test479() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test479");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    var0.closeConnection();
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test480() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test480");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var17 = var0.getAllEvaluatesTo((java.lang.Long)1L);
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

  }

  public void test481() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test481");


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
    var0.closeConnection();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test482() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test482");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var7 = var0.getAllEvaluatesTo((java.lang.Long)0L);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test483() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test483");


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
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test484() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test484");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var17 = var0.getAllEvaluatesTo((java.lang.Long)10L);
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
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test485() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test485");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var6 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var10 = var0.getAllEvaluatesTo((java.lang.Long)0L);
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

  }

  public void test486() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test486");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var8 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var12 = var0.removeEvaluatesOfService((java.lang.Long)1L);
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
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test487() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test487");


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
    boolean var18 = var0.removeEvaluatesOfService((java.lang.Long)1L);
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
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test488() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test488");


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
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    boolean var18 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var20 = var0.removeEvaluatesOfService((java.lang.Long)1L);
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
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test489() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test489");


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
    var0.closeConnection();
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var17 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var19 = var0.removeEvaluatesOfService((java.lang.Long)0L);
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
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test490() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test490");


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
    var0.closeConnection();
    boolean var19 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var21 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
    var0.closeConnection();
    
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
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test491() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test491");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    var0.closeConnection();
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
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
    assertTrue(var9 == false);

  }

  public void test492() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test492");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    boolean var4 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    var0.closeConnection();
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)100L);
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
    assertTrue(var10 == false);

  }

  public void test493() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test493");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)1L);
    var0.closeConnection();
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
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test494() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test494");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var9 = var0.removeEvaluatesOfService((java.lang.Long)100L);
    boolean var11 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    boolean var14 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var16 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test495() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test495");


    br.com.addvisor.webservice.dao.EvaluateDAO var0 = br.com.addvisor.webservice.dao.EvaluateDAO.getInstance();
    var0.closeConnection();
    var0.closeConnection();
    var0.closeConnection();
    boolean var5 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    boolean var7 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    boolean var10 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    var0.closeConnection();
    boolean var13 = var0.removeEvaluatesOfService((java.lang.Long)0L);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test496() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test496");


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
    boolean var15 = var0.removeEvaluatesOfService((java.lang.Long)0L);
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
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test497() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test497");


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
    boolean var21 = var0.removeEvaluatesOfService((java.lang.Long)(-1L));
    boolean var23 = var0.removeEvaluatesOfService((java.lang.Long)10L);
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
    assertTrue(var23 == false);

  }

  public void test498() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test498");


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
    boolean var16 = var0.removeEvaluatesOfService((java.lang.Long)0L);
    var0.closeConnection();
    var0.closeConnection();
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
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test499() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test499");


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
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test500() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test500");


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
    boolean var18 = var0.removeEvaluatesOfService((java.lang.Long)10L);
    
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

  }

}
