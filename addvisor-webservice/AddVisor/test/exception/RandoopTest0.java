package exception;

import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test1");


    br.com.addvisor.webservice.exceptions.UserTransactionException var1 = new br.com.addvisor.webservice.exceptions.UserTransactionException("");
    java.lang.String var2 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "br.com.addvisor.webservice.exceptions.UserTransactionException: "+ "'", var2.equals("br.com.addvisor.webservice.exceptions.UserTransactionException: "));

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test2");


    br.com.addvisor.webservice.exceptions.EvaluateTransactionException var1 = new br.com.addvisor.webservice.exceptions.EvaluateTransactionException("hi!");

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test3");


    br.com.addvisor.webservice.exceptions.UserTransactionException var1 = new br.com.addvisor.webservice.exceptions.UserTransactionException("br.com.addvisor.webservice.exceptions.AddressInvalidException: hi!");

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test4");


    br.com.addvisor.webservice.exceptions.UserTransactionException var1 = new br.com.addvisor.webservice.exceptions.UserTransactionException("hi!");
    java.lang.String var2 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "br.com.addvisor.webservice.exceptions.UserTransactionException: hi!"+ "'", var2.equals("br.com.addvisor.webservice.exceptions.UserTransactionException: hi!"));

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test5");


    br.com.addvisor.webservice.exceptions.ServiceTransactionException var1 = new br.com.addvisor.webservice.exceptions.ServiceTransactionException("br.com.addvisor.webservice.exceptions.UserTransactionException: hi!");

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test6");


    br.com.addvisor.webservice.exceptions.AddressInvalidException var1 = new br.com.addvisor.webservice.exceptions.AddressInvalidException("br.com.addvisor.webservice.exceptions.UserTransactionException: hi!");

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test7");


    br.com.addvisor.webservice.exceptions.EvaluateTransactionException var1 = new br.com.addvisor.webservice.exceptions.EvaluateTransactionException("");
    java.lang.String var2 = var1.toString();
    br.com.addvisor.webservice.exceptions.ServiceTransactionException var4 = new br.com.addvisor.webservice.exceptions.ServiceTransactionException("hi!");
    java.lang.Throwable[] var5 = var4.getSuppressed();
    java.lang.Throwable[] var6 = var4.getSuppressed();
    java.lang.Throwable[] var7 = var4.getSuppressed();
    java.lang.Throwable[] var8 = var4.getSuppressed();
    var1.addSuppressed((java.lang.Throwable)var4);
    java.lang.Throwable[] var10 = var1.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "br.com.addvisor.webservice.exceptions.EvaluateTransactionException: "+ "'", var2.equals("br.com.addvisor.webservice.exceptions.EvaluateTransactionException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test8");


    br.com.addvisor.webservice.exceptions.EvaluateTransactionException var1 = new br.com.addvisor.webservice.exceptions.EvaluateTransactionException("br.com.addvisor.webservice.exceptions.UserTransactionException: hi!");
    java.lang.String var2 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "br.com.addvisor.webservice.exceptions.EvaluateTransactionException: br.com.addvisor.webservice.exceptions.UserTransactionException: hi!"+ "'", var2.equals("br.com.addvisor.webservice.exceptions.EvaluateTransactionException: br.com.addvisor.webservice.exceptions.UserTransactionException: hi!"));

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test9");


    br.com.addvisor.webservice.exceptions.AddressInvalidException var1 = new br.com.addvisor.webservice.exceptions.AddressInvalidException("br.com.addvisor.webservice.exceptions.ServiceTransactionException: br.com.addvisor.webservice.exceptions.UserTransactionException: ");

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test10");


    br.com.addvisor.webservice.exceptions.AddressInvalidException var1 = new br.com.addvisor.webservice.exceptions.AddressInvalidException("br.com.addvisor.webservice.exceptions.EvaluateTransactionException: br.com.addvisor.webservice.exceptions.UserTransactionException: hi!");

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test11");


    br.com.addvisor.webservice.exceptions.ServiceTransactionException var1 = new br.com.addvisor.webservice.exceptions.ServiceTransactionException("br.com.addvisor.webservice.exceptions.UserTransactionException: br.com.addvisor.webservice.exceptions.UserTransactionException: ");
    br.com.addvisor.webservice.exceptions.ServiceTransactionException var3 = new br.com.addvisor.webservice.exceptions.ServiceTransactionException("hi!");
    br.com.addvisor.webservice.exceptions.ServiceTransactionException var5 = new br.com.addvisor.webservice.exceptions.ServiceTransactionException("hi!");
    var3.addSuppressed((java.lang.Throwable)var5);
    var1.addSuppressed((java.lang.Throwable)var5);

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test12");


    br.com.addvisor.webservice.exceptions.AddressInvalidException var1 = new br.com.addvisor.webservice.exceptions.AddressInvalidException("br.com.addvisor.webservice.exceptions.AddressInvalidException: br.com.addvisor.webservice.exceptions.AddressInvalidException: hi!");

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test13");


    br.com.addvisor.webservice.exceptions.ServiceTransactionException var1 = new br.com.addvisor.webservice.exceptions.ServiceTransactionException("");
    java.lang.Throwable[] var2 = var1.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test14");


    br.com.addvisor.webservice.exceptions.ServiceTransactionException var1 = new br.com.addvisor.webservice.exceptions.ServiceTransactionException("br.com.addvisor.webservice.exceptions.EvaluateTransactionException: br.com.addvisor.webservice.exceptions.UserTransactionException: ");

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test15");


    br.com.addvisor.webservice.exceptions.AddressInvalidException var1 = new br.com.addvisor.webservice.exceptions.AddressInvalidException("br.com.addvisor.webservice.exceptions.AddressInvalidException: hi!");
    java.lang.String var2 = var1.toString();
    br.com.addvisor.webservice.exceptions.ServiceTransactionException var4 = new br.com.addvisor.webservice.exceptions.ServiceTransactionException("hi!");
    java.lang.Throwable[] var5 = var4.getSuppressed();
    java.lang.Throwable[] var6 = var4.getSuppressed();
    java.lang.Throwable[] var7 = var4.getSuppressed();
    var1.addSuppressed((java.lang.Throwable)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "br.com.addvisor.webservice.exceptions.AddressInvalidException: br.com.addvisor.webservice.exceptions.AddressInvalidException: hi!"+ "'", var2.equals("br.com.addvisor.webservice.exceptions.AddressInvalidException: br.com.addvisor.webservice.exceptions.AddressInvalidException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test16");


    br.com.addvisor.webservice.exceptions.UserTransactionException var1 = new br.com.addvisor.webservice.exceptions.UserTransactionException("br.com.addvisor.webservice.exceptions.UserTransactionException: hi!");

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test17");


    br.com.addvisor.webservice.exceptions.ServiceTransactionException var1 = new br.com.addvisor.webservice.exceptions.ServiceTransactionException("br.com.addvisor.webservice.exceptions.ServiceTransactionException: br.com.addvisor.webservice.exceptions.UserTransactionException: ");

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test18");


    br.com.addvisor.webservice.exceptions.EvaluateTransactionException var1 = new br.com.addvisor.webservice.exceptions.EvaluateTransactionException("br.com.addvisor.webservice.exceptions.AddressInvalidException: hi!");

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test19");


    br.com.addvisor.webservice.exceptions.UserTransactionException var1 = new br.com.addvisor.webservice.exceptions.UserTransactionException("br.com.addvisor.webservice.exceptions.UserTransactionException: br.com.addvisor.webservice.exceptions.UserTransactionException: ");
    java.lang.String var2 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "br.com.addvisor.webservice.exceptions.UserTransactionException: br.com.addvisor.webservice.exceptions.UserTransactionException: br.com.addvisor.webservice.exceptions.UserTransactionException: "+ "'", var2.equals("br.com.addvisor.webservice.exceptions.UserTransactionException: br.com.addvisor.webservice.exceptions.UserTransactionException: br.com.addvisor.webservice.exceptions.UserTransactionException: "));

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test20");


    br.com.addvisor.webservice.exceptions.UserTransactionException var1 = new br.com.addvisor.webservice.exceptions.UserTransactionException("br.com.addvisor.webservice.exceptions.AddressInvalidException: br.com.addvisor.webservice.exceptions.AddressInvalidException: hi!");
    java.lang.String var2 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "br.com.addvisor.webservice.exceptions.UserTransactionException: br.com.addvisor.webservice.exceptions.AddressInvalidException: br.com.addvisor.webservice.exceptions.AddressInvalidException: hi!"+ "'", var2.equals("br.com.addvisor.webservice.exceptions.UserTransactionException: br.com.addvisor.webservice.exceptions.AddressInvalidException: br.com.addvisor.webservice.exceptions.AddressInvalidException: hi!"));

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test21");


    br.com.addvisor.webservice.exceptions.AddressInvalidException var1 = new br.com.addvisor.webservice.exceptions.AddressInvalidException("hi!");
    java.lang.String var2 = var1.toString();
    java.lang.Throwable[] var3 = var1.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "br.com.addvisor.webservice.exceptions.AddressInvalidException: hi!"+ "'", var2.equals("br.com.addvisor.webservice.exceptions.AddressInvalidException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test22");


    br.com.addvisor.webservice.exceptions.EvaluateTransactionException var1 = new br.com.addvisor.webservice.exceptions.EvaluateTransactionException("br.com.addvisor.webservice.exceptions.AddressInvalidException: br.com.addvisor.webservice.exceptions.UserTransactionException: ");

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test23");


    br.com.addvisor.webservice.exceptions.AddressInvalidException var1 = new br.com.addvisor.webservice.exceptions.AddressInvalidException("br.com.addvisor.webservice.exceptions.AddressInvalidException: br.com.addvisor.webservice.exceptions.UserTransactionException: ");

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test24");


    br.com.addvisor.webservice.exceptions.AddressInvalidException var1 = new br.com.addvisor.webservice.exceptions.AddressInvalidException("br.com.addvisor.webservice.exceptions.EvaluateTransactionException: ");

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test25");


    br.com.addvisor.webservice.exceptions.AddressInvalidException var1 = new br.com.addvisor.webservice.exceptions.AddressInvalidException("br.com.addvisor.webservice.exceptions.ServiceTransactionException: br.com.addvisor.webservice.exceptions.UserTransactionException: br.com.addvisor.webservice.exceptions.UserTransactionException: ");

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test26");


    br.com.addvisor.webservice.exceptions.ServiceTransactionException var1 = new br.com.addvisor.webservice.exceptions.ServiceTransactionException("hi!");
    java.lang.Throwable[] var2 = var1.getSuppressed();
    java.lang.Throwable[] var3 = var1.getSuppressed();
    java.lang.Throwable[] var4 = var1.getSuppressed();
    br.com.addvisor.webservice.exceptions.ServiceTransactionException var6 = new br.com.addvisor.webservice.exceptions.ServiceTransactionException("hi!");
    java.lang.Throwable[] var7 = var6.getSuppressed();
    br.com.addvisor.webservice.exceptions.ServiceTransactionException var9 = new br.com.addvisor.webservice.exceptions.ServiceTransactionException("br.com.addvisor.webservice.exceptions.UserTransactionException: br.com.addvisor.webservice.exceptions.UserTransactionException: ");
    var6.addSuppressed((java.lang.Throwable)var9);
    var1.addSuppressed((java.lang.Throwable)var9);
    br.com.addvisor.webservice.exceptions.UserTransactionException var13 = new br.com.addvisor.webservice.exceptions.UserTransactionException("br.com.addvisor.webservice.exceptions.UserTransactionException: ");
    java.lang.String var14 = var13.toString();
    br.com.addvisor.webservice.exceptions.ServiceTransactionException var16 = new br.com.addvisor.webservice.exceptions.ServiceTransactionException("hi!");
    java.lang.Throwable[] var17 = var16.getSuppressed();
    java.lang.Throwable[] var18 = var16.getSuppressed();
    java.lang.Throwable[] var19 = var16.getSuppressed();
    var13.addSuppressed((java.lang.Throwable)var16);
    var9.addSuppressed((java.lang.Throwable)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "br.com.addvisor.webservice.exceptions.UserTransactionException: br.com.addvisor.webservice.exceptions.UserTransactionException: "+ "'", var14.equals("br.com.addvisor.webservice.exceptions.UserTransactionException: br.com.addvisor.webservice.exceptions.UserTransactionException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test27");


    br.com.addvisor.webservice.exceptions.EvaluateTransactionException var1 = new br.com.addvisor.webservice.exceptions.EvaluateTransactionException("br.com.addvisor.webservice.exceptions.EvaluateTransactionException: ");
    br.com.addvisor.webservice.exceptions.AddressInvalidException var3 = new br.com.addvisor.webservice.exceptions.AddressInvalidException("br.com.addvisor.webservice.exceptions.UserTransactionException: ");
    java.lang.String var4 = var3.toString();
    var1.addSuppressed((java.lang.Throwable)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "br.com.addvisor.webservice.exceptions.AddressInvalidException: br.com.addvisor.webservice.exceptions.UserTransactionException: "+ "'", var4.equals("br.com.addvisor.webservice.exceptions.AddressInvalidException: br.com.addvisor.webservice.exceptions.UserTransactionException: "));

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test28");


    br.com.addvisor.webservice.exceptions.UserTransactionException var1 = new br.com.addvisor.webservice.exceptions.UserTransactionException("br.com.addvisor.webservice.exceptions.EvaluateTransactionException: br.com.addvisor.webservice.exceptions.UserTransactionException: ");

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test29");


    br.com.addvisor.webservice.exceptions.ServiceTransactionException var1 = new br.com.addvisor.webservice.exceptions.ServiceTransactionException("hi!");
    java.lang.Throwable[] var2 = var1.getSuppressed();
    br.com.addvisor.webservice.exceptions.ServiceTransactionException var4 = new br.com.addvisor.webservice.exceptions.ServiceTransactionException("br.com.addvisor.webservice.exceptions.UserTransactionException: br.com.addvisor.webservice.exceptions.UserTransactionException: ");
    var1.addSuppressed((java.lang.Throwable)var4);
    java.lang.Throwable[] var6 = var4.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test30");


    br.com.addvisor.webservice.exceptions.AddressInvalidException var1 = new br.com.addvisor.webservice.exceptions.AddressInvalidException("br.com.addvisor.webservice.exceptions.UserTransactionException: br.com.addvisor.webservice.exceptions.UserTransactionException: ");

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test31");


    br.com.addvisor.webservice.exceptions.UserTransactionException var1 = new br.com.addvisor.webservice.exceptions.UserTransactionException("br.com.addvisor.webservice.exceptions.EvaluateTransactionException: ");
    java.lang.Throwable[] var2 = var1.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test32");


    br.com.addvisor.webservice.exceptions.ServiceTransactionException var1 = new br.com.addvisor.webservice.exceptions.ServiceTransactionException("hi!");
    br.com.addvisor.webservice.exceptions.ServiceTransactionException var3 = new br.com.addvisor.webservice.exceptions.ServiceTransactionException("hi!");
    var1.addSuppressed((java.lang.Throwable)var3);
    java.lang.String var5 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "br.com.addvisor.webservice.exceptions.ServiceTransactionException: hi!"+ "'", var5.equals("br.com.addvisor.webservice.exceptions.ServiceTransactionException: hi!"));

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test33");


    br.com.addvisor.webservice.exceptions.ServiceTransactionException var1 = new br.com.addvisor.webservice.exceptions.ServiceTransactionException("hi!");
    java.lang.Throwable[] var2 = var1.getSuppressed();
    br.com.addvisor.webservice.exceptions.ServiceTransactionException var4 = new br.com.addvisor.webservice.exceptions.ServiceTransactionException("hi!");
    br.com.addvisor.webservice.exceptions.ServiceTransactionException var6 = new br.com.addvisor.webservice.exceptions.ServiceTransactionException("hi!");
    var4.addSuppressed((java.lang.Throwable)var6);
    br.com.addvisor.webservice.exceptions.EvaluateTransactionException var9 = new br.com.addvisor.webservice.exceptions.EvaluateTransactionException("br.com.addvisor.webservice.exceptions.UserTransactionException: ");
    java.lang.String var10 = var9.toString();
    var4.addSuppressed((java.lang.Throwable)var9);
    var1.addSuppressed((java.lang.Throwable)var4);
    br.com.addvisor.webservice.exceptions.ServiceTransactionException var14 = new br.com.addvisor.webservice.exceptions.ServiceTransactionException("hi!");
    java.lang.Throwable[] var15 = var14.getSuppressed();
    java.lang.Throwable[] var16 = var14.getSuppressed();
    java.lang.Throwable[] var17 = var14.getSuppressed();
    br.com.addvisor.webservice.exceptions.ServiceTransactionException var19 = new br.com.addvisor.webservice.exceptions.ServiceTransactionException("hi!");
    java.lang.Throwable[] var20 = var19.getSuppressed();
    br.com.addvisor.webservice.exceptions.ServiceTransactionException var22 = new br.com.addvisor.webservice.exceptions.ServiceTransactionException("br.com.addvisor.webservice.exceptions.UserTransactionException: br.com.addvisor.webservice.exceptions.UserTransactionException: ");
    var19.addSuppressed((java.lang.Throwable)var22);
    var14.addSuppressed((java.lang.Throwable)var22);
    var1.addSuppressed((java.lang.Throwable)var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "br.com.addvisor.webservice.exceptions.EvaluateTransactionException: br.com.addvisor.webservice.exceptions.UserTransactionException: "+ "'", var10.equals("br.com.addvisor.webservice.exceptions.EvaluateTransactionException: br.com.addvisor.webservice.exceptions.UserTransactionException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test34");


    br.com.addvisor.webservice.exceptions.UserTransactionException var1 = new br.com.addvisor.webservice.exceptions.UserTransactionException("br.com.addvisor.webservice.exceptions.UserTransactionException: ");
    java.lang.String var2 = var1.toString();
    br.com.addvisor.webservice.exceptions.ServiceTransactionException var4 = new br.com.addvisor.webservice.exceptions.ServiceTransactionException("hi!");
    java.lang.Throwable[] var5 = var4.getSuppressed();
    java.lang.Throwable[] var6 = var4.getSuppressed();
    java.lang.Throwable[] var7 = var4.getSuppressed();
    var1.addSuppressed((java.lang.Throwable)var4);
    java.lang.Throwable[] var9 = var4.getSuppressed();
    java.lang.Throwable[] var10 = var4.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "br.com.addvisor.webservice.exceptions.UserTransactionException: br.com.addvisor.webservice.exceptions.UserTransactionException: "+ "'", var2.equals("br.com.addvisor.webservice.exceptions.UserTransactionException: br.com.addvisor.webservice.exceptions.UserTransactionException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test35");


    br.com.addvisor.webservice.exceptions.UserTransactionException var1 = new br.com.addvisor.webservice.exceptions.UserTransactionException("");
    java.lang.Throwable[] var2 = var1.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test36");


    br.com.addvisor.webservice.exceptions.UserTransactionException var1 = new br.com.addvisor.webservice.exceptions.UserTransactionException("br.com.addvisor.webservice.exceptions.UserTransactionException: ");
    br.com.addvisor.webservice.exceptions.EvaluateTransactionException var3 = new br.com.addvisor.webservice.exceptions.EvaluateTransactionException("br.com.addvisor.webservice.exceptions.EvaluateTransactionException: br.com.addvisor.webservice.exceptions.UserTransactionException: ");
    var1.addSuppressed((java.lang.Throwable)var3);

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test37");


    br.com.addvisor.webservice.exceptions.ServiceTransactionException var1 = new br.com.addvisor.webservice.exceptions.ServiceTransactionException("br.com.addvisor.webservice.exceptions.AddressInvalidException: br.com.addvisor.webservice.exceptions.AddressInvalidException: hi!");
    java.lang.Throwable[] var2 = var1.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test38");


    br.com.addvisor.webservice.exceptions.AddressInvalidException var1 = new br.com.addvisor.webservice.exceptions.AddressInvalidException("");
    br.com.addvisor.webservice.exceptions.EvaluateTransactionException var3 = new br.com.addvisor.webservice.exceptions.EvaluateTransactionException("br.com.addvisor.webservice.exceptions.EvaluateTransactionException: ");
    var1.addSuppressed((java.lang.Throwable)var3);

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test39");


    br.com.addvisor.webservice.exceptions.ServiceTransactionException var1 = new br.com.addvisor.webservice.exceptions.ServiceTransactionException("br.com.addvisor.webservice.exceptions.EvaluateTransactionException: br.com.addvisor.webservice.exceptions.UserTransactionException: hi!");

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test40");


    br.com.addvisor.webservice.exceptions.UserTransactionException var1 = new br.com.addvisor.webservice.exceptions.UserTransactionException("br.com.addvisor.webservice.exceptions.UserTransactionException: br.com.addvisor.webservice.exceptions.UserTransactionException: br.com.addvisor.webservice.exceptions.UserTransactionException: ");

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test41");


    br.com.addvisor.webservice.exceptions.EvaluateTransactionException var1 = new br.com.addvisor.webservice.exceptions.EvaluateTransactionException("br.com.addvisor.webservice.exceptions.UserTransactionException: br.com.addvisor.webservice.exceptions.UserTransactionException: ");

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test42");


    br.com.addvisor.webservice.exceptions.EvaluateTransactionException var1 = new br.com.addvisor.webservice.exceptions.EvaluateTransactionException("br.com.addvisor.webservice.exceptions.ServiceTransactionException: br.com.addvisor.webservice.exceptions.UserTransactionException: br.com.addvisor.webservice.exceptions.UserTransactionException: ");

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test43");


    br.com.addvisor.webservice.exceptions.EvaluateTransactionException var1 = new br.com.addvisor.webservice.exceptions.EvaluateTransactionException("br.com.addvisor.webservice.exceptions.UserTransactionException: ");
    java.lang.String var2 = var1.toString();
    br.com.addvisor.webservice.exceptions.AddressInvalidException var4 = new br.com.addvisor.webservice.exceptions.AddressInvalidException("hi!");
    var1.addSuppressed((java.lang.Throwable)var4);
    br.com.addvisor.webservice.exceptions.ServiceTransactionException var7 = new br.com.addvisor.webservice.exceptions.ServiceTransactionException("hi!");
    java.lang.Throwable[] var8 = var7.getSuppressed();
    java.lang.Throwable[] var9 = var7.getSuppressed();
    java.lang.Throwable[] var10 = var7.getSuppressed();
    br.com.addvisor.webservice.exceptions.ServiceTransactionException var12 = new br.com.addvisor.webservice.exceptions.ServiceTransactionException("hi!");
    java.lang.Throwable[] var13 = var12.getSuppressed();
    br.com.addvisor.webservice.exceptions.ServiceTransactionException var15 = new br.com.addvisor.webservice.exceptions.ServiceTransactionException("br.com.addvisor.webservice.exceptions.UserTransactionException: br.com.addvisor.webservice.exceptions.UserTransactionException: ");
    var12.addSuppressed((java.lang.Throwable)var15);
    var7.addSuppressed((java.lang.Throwable)var15);
    java.lang.String var18 = var15.toString();
    br.com.addvisor.webservice.exceptions.ServiceTransactionException var20 = new br.com.addvisor.webservice.exceptions.ServiceTransactionException("hi!");
    var15.addSuppressed((java.lang.Throwable)var20);
    var1.addSuppressed((java.lang.Throwable)var20);
    java.lang.String var23 = var20.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "br.com.addvisor.webservice.exceptions.EvaluateTransactionException: br.com.addvisor.webservice.exceptions.UserTransactionException: "+ "'", var2.equals("br.com.addvisor.webservice.exceptions.EvaluateTransactionException: br.com.addvisor.webservice.exceptions.UserTransactionException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "br.com.addvisor.webservice.exceptions.ServiceTransactionException: br.com.addvisor.webservice.exceptions.UserTransactionException: br.com.addvisor.webservice.exceptions.UserTransactionException: "+ "'", var18.equals("br.com.addvisor.webservice.exceptions.ServiceTransactionException: br.com.addvisor.webservice.exceptions.UserTransactionException: br.com.addvisor.webservice.exceptions.UserTransactionException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "br.com.addvisor.webservice.exceptions.ServiceTransactionException: hi!"+ "'", var23.equals("br.com.addvisor.webservice.exceptions.ServiceTransactionException: hi!"));

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test44");


    br.com.addvisor.webservice.exceptions.ServiceTransactionException var1 = new br.com.addvisor.webservice.exceptions.ServiceTransactionException("hi!");
    br.com.addvisor.webservice.exceptions.ServiceTransactionException var3 = new br.com.addvisor.webservice.exceptions.ServiceTransactionException("hi!");
    var1.addSuppressed((java.lang.Throwable)var3);
    br.com.addvisor.webservice.exceptions.EvaluateTransactionException var6 = new br.com.addvisor.webservice.exceptions.EvaluateTransactionException("br.com.addvisor.webservice.exceptions.UserTransactionException: ");
    java.lang.String var7 = var6.toString();
    var1.addSuppressed((java.lang.Throwable)var6);
    br.com.addvisor.webservice.exceptions.AddressInvalidException var10 = new br.com.addvisor.webservice.exceptions.AddressInvalidException("hi!");
    java.lang.String var11 = var10.toString();
    java.lang.String var12 = var10.toString();
    br.com.addvisor.webservice.exceptions.ServiceTransactionException var14 = new br.com.addvisor.webservice.exceptions.ServiceTransactionException("hi!");
    java.lang.Throwable[] var15 = var14.getSuppressed();
    java.lang.Throwable[] var16 = var14.getSuppressed();
    java.lang.Throwable[] var17 = var14.getSuppressed();
    var10.addSuppressed((java.lang.Throwable)var14);
    var1.addSuppressed((java.lang.Throwable)var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "br.com.addvisor.webservice.exceptions.EvaluateTransactionException: br.com.addvisor.webservice.exceptions.UserTransactionException: "+ "'", var7.equals("br.com.addvisor.webservice.exceptions.EvaluateTransactionException: br.com.addvisor.webservice.exceptions.UserTransactionException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "br.com.addvisor.webservice.exceptions.AddressInvalidException: hi!"+ "'", var11.equals("br.com.addvisor.webservice.exceptions.AddressInvalidException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "br.com.addvisor.webservice.exceptions.AddressInvalidException: hi!"+ "'", var12.equals("br.com.addvisor.webservice.exceptions.AddressInvalidException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test45");


    br.com.addvisor.webservice.exceptions.ServiceTransactionException var1 = new br.com.addvisor.webservice.exceptions.ServiceTransactionException("br.com.addvisor.webservice.exceptions.AddressInvalidException: hi!");
    java.lang.Throwable[] var2 = var1.getSuppressed();
    java.lang.String var3 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "br.com.addvisor.webservice.exceptions.ServiceTransactionException: br.com.addvisor.webservice.exceptions.AddressInvalidException: hi!"+ "'", var3.equals("br.com.addvisor.webservice.exceptions.ServiceTransactionException: br.com.addvisor.webservice.exceptions.AddressInvalidException: hi!"));

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test46");


    br.com.addvisor.webservice.exceptions.ServiceTransactionException var1 = new br.com.addvisor.webservice.exceptions.ServiceTransactionException("br.com.addvisor.webservice.exceptions.AddressInvalidException: hi!");
    br.com.addvisor.webservice.exceptions.ServiceTransactionException var3 = new br.com.addvisor.webservice.exceptions.ServiceTransactionException("br.com.addvisor.webservice.exceptions.UserTransactionException: ");
    java.lang.String var4 = var3.toString();
    var1.addSuppressed((java.lang.Throwable)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "br.com.addvisor.webservice.exceptions.ServiceTransactionException: br.com.addvisor.webservice.exceptions.UserTransactionException: "+ "'", var4.equals("br.com.addvisor.webservice.exceptions.ServiceTransactionException: br.com.addvisor.webservice.exceptions.UserTransactionException: "));

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test47");


    br.com.addvisor.webservice.exceptions.EvaluateTransactionException var1 = new br.com.addvisor.webservice.exceptions.EvaluateTransactionException("br.com.addvisor.webservice.exceptions.EvaluateTransactionException: br.com.addvisor.webservice.exceptions.UserTransactionException: hi!");

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test48");


    br.com.addvisor.webservice.exceptions.UserTransactionException var1 = new br.com.addvisor.webservice.exceptions.UserTransactionException("br.com.addvisor.webservice.exceptions.ServiceTransactionException: br.com.addvisor.webservice.exceptions.UserTransactionException: br.com.addvisor.webservice.exceptions.UserTransactionException: ");
    java.lang.Throwable[] var2 = var1.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test49");


    br.com.addvisor.webservice.exceptions.AddressInvalidException var1 = new br.com.addvisor.webservice.exceptions.AddressInvalidException("");
    br.com.addvisor.webservice.exceptions.ServiceTransactionException var3 = new br.com.addvisor.webservice.exceptions.ServiceTransactionException("hi!");
    br.com.addvisor.webservice.exceptions.ServiceTransactionException var5 = new br.com.addvisor.webservice.exceptions.ServiceTransactionException("hi!");
    java.lang.Throwable[] var6 = var5.getSuppressed();
    java.lang.Throwable[] var7 = var5.getSuppressed();
    java.lang.Throwable[] var8 = var5.getSuppressed();
    var3.addSuppressed((java.lang.Throwable)var5);
    var1.addSuppressed((java.lang.Throwable)var3);
    java.lang.Throwable[] var11 = var1.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

}
