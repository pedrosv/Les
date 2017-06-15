package pojo;

import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test1");


    br.com.addvisor.webservice.models.pojo.Service var0 = new br.com.addvisor.webservice.models.pojo.Service();
    br.com.addvisor.webservice.models.pojo.Address var1 = var0.getAddress();
    java.lang.String var2 = var0.getTags();
    java.lang.String var3 = var0.getTags();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test2");


    br.com.addvisor.webservice.models.pojo.User var1 = new br.com.addvisor.webservice.models.pojo.User((java.lang.Long)(-1L));

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test3");


    br.com.addvisor.webservice.models.pojo.Service var0 = new br.com.addvisor.webservice.models.pojo.Service();
    br.com.addvisor.webservice.models.pojo.Address var1 = var0.getAddress();
    java.lang.String var2 = var0.getTags();
    java.lang.String var3 = var0.getDescription();
    var0.setDescription("");
    java.lang.Float var6 = var0.getMedia();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test4");


    br.com.addvisor.webservice.models.pojo.Service var0 = new br.com.addvisor.webservice.models.pojo.Service();
    br.com.addvisor.webservice.models.pojo.Address var1 = var0.getAddress();
    java.lang.String var2 = var0.getTags();
    java.lang.Float var3 = var0.getMedia();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test5");


    br.com.addvisor.webservice.models.pojo.State var0 = new br.com.addvisor.webservice.models.pojo.State();
    var0.setId((java.lang.Long)(-1L));

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test6");


    br.com.addvisor.webservice.models.pojo.City var2 = new br.com.addvisor.webservice.models.pojo.City();
    br.com.addvisor.webservice.models.pojo.User var4 = new br.com.addvisor.webservice.models.pojo.User("hi!", "hi!", var2, "");
    var4.setPassword("");

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test7");


    br.com.addvisor.webservice.models.pojo.User var1 = new br.com.addvisor.webservice.models.pojo.User((java.lang.Long)0L);
    var1.setPhone("hi!");
    var1.setName("");
    var1.setPhone("");
    boolean var9 = var1.authenticatePassword("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test8");


    br.com.addvisor.webservice.models.pojo.City var2 = new br.com.addvisor.webservice.models.pojo.City();
    br.com.addvisor.webservice.models.pojo.User var4 = new br.com.addvisor.webservice.models.pojo.User("hi!", "hi!", var2, "");
    java.lang.String var5 = var2.getName();
    java.lang.String var6 = var2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test9");


    br.com.addvisor.webservice.models.pojo.Agenda var0 = new br.com.addvisor.webservice.models.pojo.Agenda();
    var0.addContact("hi!", "");
    br.com.addvisor.webservice.models.pojo.Agenda var4 = new br.com.addvisor.webservice.models.pojo.Agenda();
    java.util.List var5 = var4.getNumbers();
    java.util.List var6 = var4.getNumbers();
    var0.setNumbers(var6);
    br.com.addvisor.webservice.models.pojo.City var10 = new br.com.addvisor.webservice.models.pojo.City();
    br.com.addvisor.webservice.models.pojo.User var12 = new br.com.addvisor.webservice.models.pojo.User("hi!", "hi!", var10, "");
    boolean var13 = var0.equals((java.lang.Object)"hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test10");


    br.com.addvisor.webservice.models.pojo.User var1 = new br.com.addvisor.webservice.models.pojo.User((java.lang.Long)0L);
    var1.setPhone("hi!");
    var1.setPhone("");
    java.lang.Long var6 = var1.getId();
    java.lang.String var7 = var1.getPhone();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + 0L+ "'", var6.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test11");


    br.com.addvisor.webservice.models.pojo.City var2 = new br.com.addvisor.webservice.models.pojo.City();
    br.com.addvisor.webservice.models.pojo.User var4 = new br.com.addvisor.webservice.models.pojo.User("hi!", "", var2, "hi!");
    br.com.addvisor.webservice.models.pojo.State var5 = new br.com.addvisor.webservice.models.pojo.State();
    java.lang.String var6 = var5.getName();
    br.com.addvisor.webservice.models.pojo.Country var7 = var5.getCountry();
    br.com.addvisor.webservice.models.pojo.Country var8 = new br.com.addvisor.webservice.models.pojo.Country();
    var5.setCountry(var8);
    var2.setState(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test12");


    br.com.addvisor.webservice.models.pojo.State var0 = new br.com.addvisor.webservice.models.pojo.State();
    java.lang.String var1 = var0.getName();
    br.com.addvisor.webservice.models.pojo.Country var2 = var0.getCountry();
    br.com.addvisor.webservice.models.pojo.Country var3 = new br.com.addvisor.webservice.models.pojo.Country();
    var0.setCountry(var3);
    java.lang.String var5 = var0.getName();
    var0.setUf("hi!");
    var0.setId((java.lang.Long)10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test13");


    br.com.addvisor.webservice.models.pojo.User var1 = new br.com.addvisor.webservice.models.pojo.User((java.lang.Long)0L);
    java.lang.String var2 = var1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test14");


    br.com.addvisor.webservice.models.pojo.Address var0 = new br.com.addvisor.webservice.models.pojo.Address();
    var0.setComplement("");
    var0.setLocation("hi!");

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test15");


    br.com.addvisor.webservice.models.pojo.State var0 = new br.com.addvisor.webservice.models.pojo.State();
    br.com.addvisor.webservice.models.pojo.Country var1 = new br.com.addvisor.webservice.models.pojo.Country();
    var1.setName("");
    java.lang.String var4 = var1.getAcronym();
    var1.setAcronym("");
    var0.setCountry(var1);
    java.lang.String var8 = var1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test16");


    br.com.addvisor.webservice.models.pojo.User var0 = new br.com.addvisor.webservice.models.pojo.User();
    boolean var2 = var0.equals((java.lang.Object)(short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test17");


    br.com.addvisor.webservice.models.pojo.City var2 = new br.com.addvisor.webservice.models.pojo.City();
    br.com.addvisor.webservice.models.pojo.User var4 = new br.com.addvisor.webservice.models.pojo.User("hi!", "hi!", var2, "");
    br.com.addvisor.webservice.models.pojo.City var5 = var4.getCity();
    var4.setEmail("hi!");
    br.com.addvisor.webservice.models.pojo.City var8 = var4.getCity();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test18");


    br.com.addvisor.webservice.models.pojo.Country var0 = new br.com.addvisor.webservice.models.pojo.Country();
    var0.setName("");
    java.lang.String var3 = var0.getAcronym();
    java.lang.String var4 = var0.getAcronym();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test19");


    br.com.addvisor.webservice.models.pojo.Service var0 = new br.com.addvisor.webservice.models.pojo.Service();
    br.com.addvisor.webservice.models.pojo.Address var1 = var0.getAddress();
    java.lang.String var2 = var0.getTags();
    java.lang.String var3 = var0.getDescription();
    var0.setId((java.lang.Long)10L);
    br.com.addvisor.webservice.models.pojo.Service var6 = new br.com.addvisor.webservice.models.pojo.Service();
    br.com.addvisor.webservice.models.pojo.Address var7 = var6.getAddress();
    var6.setId((java.lang.Long)0L);
    int var10 = var0.compareTo(var6);
    var6.setDescription("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test20");


    br.com.addvisor.webservice.models.pojo.User var1 = new br.com.addvisor.webservice.models.pojo.User((java.lang.Long)0L);
    var1.setPhone("hi!");
    var1.setName("");
    java.lang.String var6 = var1.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test21");


    br.com.addvisor.webservice.models.pojo.Country var0 = new br.com.addvisor.webservice.models.pojo.Country();
    java.lang.String var1 = var0.getAcronym();
    var0.setId((java.lang.Long)100L);
    var0.setName("hi!");
    br.com.addvisor.webservice.models.pojo.Service var6 = new br.com.addvisor.webservice.models.pojo.Service();
    br.com.addvisor.webservice.models.pojo.Address var7 = var6.getAddress();
    var6.setMedia((java.lang.Float)(-1.0f));
    var6.setDescription("hi!");
    boolean var12 = var0.equals((java.lang.Object)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test22");


    br.com.addvisor.webservice.models.pojo.City var4 = new br.com.addvisor.webservice.models.pojo.City();
    br.com.addvisor.webservice.models.pojo.User var6 = new br.com.addvisor.webservice.models.pojo.User("hi!", "hi!", var4, "");
    java.lang.String var7 = var4.getName();
    br.com.addvisor.webservice.models.pojo.User var9 = new br.com.addvisor.webservice.models.pojo.User("hi!", "hi!", var4, "");
    var9.setName("hi!");
    var9.setName("hi!");
    java.lang.String var14 = var9.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test23");


    br.com.addvisor.webservice.models.pojo.User var1 = new br.com.addvisor.webservice.models.pojo.User((java.lang.Long)10L);

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test24");


    br.com.addvisor.webservice.models.pojo.Address var0 = new br.com.addvisor.webservice.models.pojo.Address();
    var0.setComplement("");
    java.lang.String var3 = var0.toString();

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test25");


    br.com.addvisor.webservice.models.pojo.Service var0 = new br.com.addvisor.webservice.models.pojo.Service();
    br.com.addvisor.webservice.models.pojo.Address var1 = var0.getAddress();
    var0.setMedia((java.lang.Float)(-1.0f));
    var0.setDescription("hi!");
    java.util.List var6 = var0.getPhones();
    br.com.addvisor.webservice.models.pojo.Address var7 = new br.com.addvisor.webservice.models.pojo.Address();
    java.lang.String var8 = var7.getComplement();
    var0.setAddress(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test26");


    br.com.addvisor.webservice.models.pojo.Agenda var0 = new br.com.addvisor.webservice.models.pojo.Agenda();
    java.util.List var1 = var0.getNumbers();
    java.util.List var2 = var0.getNumbers();
    java.util.List var3 = var0.getNumbers();
    java.util.Map var4 = var0.getContacts();
    java.util.Map var5 = var0.getContacts();
    br.com.addvisor.webservice.models.pojo.Agenda var6 = new br.com.addvisor.webservice.models.pojo.Agenda();
    var6.addContact("hi!", "");
    java.util.Map var10 = var6.getContacts();
    var0.setContacts(var10);
    br.com.addvisor.webservice.models.pojo.Agenda var12 = new br.com.addvisor.webservice.models.pojo.Agenda();
    java.util.List var13 = var12.getNumbers();
    java.util.List var14 = var12.getNumbers();
    java.util.List var15 = var12.getNumbers();
    java.util.Map var16 = var12.getContacts();
    var0.setContacts(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test27");


    br.com.addvisor.webservice.models.pojo.User var1 = new br.com.addvisor.webservice.models.pojo.User((java.lang.Long)0L);
    var1.setPhone("hi!");
    var1.setName("");
    var1.setPhone("");
    java.lang.String var8 = var1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test28");


    br.com.addvisor.webservice.models.pojo.Evaluate var2 = new br.com.addvisor.webservice.models.pojo.Evaluate((java.lang.Float)100.0f, "");
    var2.setNote((java.lang.Float)10.0f);
    java.lang.String var5 = var2.getComment();
    boolean var7 = var2.equals((java.lang.Object)10L);
    br.com.addvisor.webservice.models.pojo.User var9 = new br.com.addvisor.webservice.models.pojo.User((java.lang.Long)1L);
    var2.setUser(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test29");


    br.com.addvisor.webservice.models.pojo.Service var0 = new br.com.addvisor.webservice.models.pojo.Service();
    br.com.addvisor.webservice.models.pojo.Address var1 = var0.getAddress();
    java.lang.String var2 = var0.getTags();
    java.lang.String var3 = var0.getDescription();
    var0.setId((java.lang.Long)10L);
    br.com.addvisor.webservice.models.pojo.Service var6 = new br.com.addvisor.webservice.models.pojo.Service();
    br.com.addvisor.webservice.models.pojo.Address var7 = var6.getAddress();
    var6.setId((java.lang.Long)0L);
    int var10 = var0.compareTo(var6);
    java.lang.String var11 = var6.getTags();
    var6.setName("User [id=0, name=null, email=null, password=null, city=null, phone=hi!]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test30");


    br.com.addvisor.webservice.models.pojo.Evaluate var2 = new br.com.addvisor.webservice.models.pojo.Evaluate((java.lang.Float)100.0f, "");
    br.com.addvisor.webservice.models.pojo.Service var3 = var2.getService();
    var2.setComment("hi!");
    var2.setComment("hi!");
    br.com.addvisor.webservice.models.pojo.City var10 = new br.com.addvisor.webservice.models.pojo.City();
    br.com.addvisor.webservice.models.pojo.User var12 = new br.com.addvisor.webservice.models.pojo.User("hi!", "hi!", var10, "");
    var2.setUser(var12);
    br.com.addvisor.webservice.models.pojo.Service var14 = var2.getService();
    br.com.addvisor.webservice.models.pojo.Service var15 = new br.com.addvisor.webservice.models.pojo.Service();
    br.com.addvisor.webservice.models.pojo.Address var16 = var15.getAddress();
    java.lang.String var17 = var15.getTags();
    java.lang.String var18 = var15.getDescription();
    var15.setId((java.lang.Long)10L);
    br.com.addvisor.webservice.models.pojo.enums.ServiceCat var21 = var15.getCategory();
    var2.setService(var15);
    java.lang.Long var23 = var15.getId();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + 10L+ "'", var23.equals(10L));

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test31");


    br.com.addvisor.webservice.models.pojo.User var1 = new br.com.addvisor.webservice.models.pojo.User((java.lang.Long)0L);
    var1.setPhone("hi!");
    var1.setPhone("User [id=0, name=null, email=null, password=null, city=null, phone=hi!]");

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test32");


    br.com.addvisor.webservice.models.pojo.Evaluate var0 = new br.com.addvisor.webservice.models.pojo.Evaluate();
    var0.setNote((java.lang.Float)0.0f);

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test33");


    br.com.addvisor.webservice.models.pojo.Country var0 = new br.com.addvisor.webservice.models.pojo.Country();
    var0.setName("");
    java.lang.String var3 = var0.getAcronym();
    br.com.addvisor.webservice.models.pojo.State var4 = new br.com.addvisor.webservice.models.pojo.State();
    java.lang.String var5 = var4.getName();
    br.com.addvisor.webservice.models.pojo.Country var6 = var4.getCountry();
    br.com.addvisor.webservice.models.pojo.Country var7 = new br.com.addvisor.webservice.models.pojo.Country();
    var4.setCountry(var7);
    var7.setId((java.lang.Long)(-1L));
    boolean var11 = var0.equals((java.lang.Object)var7);
    br.com.addvisor.webservice.models.pojo.State var12 = new br.com.addvisor.webservice.models.pojo.State();
    br.com.addvisor.webservice.models.pojo.Country var13 = new br.com.addvisor.webservice.models.pojo.Country();
    var13.setName("");
    java.lang.String var16 = var13.getAcronym();
    var13.setAcronym("");
    var12.setCountry(var13);
    java.lang.String var20 = var12.toString();
    var12.setUf("Service [id=0, address=null, phones=[], name=null, description=null, category=null]");
    boolean var23 = var7.equals((java.lang.Object)"Service [id=0, address=null, phones=[], name=null, description=null, category=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test34");


    br.com.addvisor.webservice.models.pojo.User var1 = new br.com.addvisor.webservice.models.pojo.User((java.lang.Long)0L);
    var1.setPhone("hi!");
    var1.setPhone("");
    boolean var7 = var1.authenticatePassword("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test35");


    br.com.addvisor.webservice.models.pojo.Service var0 = new br.com.addvisor.webservice.models.pojo.Service();
    java.lang.String var1 = var0.toString();
    br.com.addvisor.webservice.models.pojo.enums.ServiceCat var2 = var0.getCategory();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Service [id=null, address=null, phones=[], name=null, description=null, category=null]"+ "'", var1.equals("Service [id=null, address=null, phones=[], name=null, description=null, category=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test36");


    br.com.addvisor.webservice.models.pojo.Service var0 = new br.com.addvisor.webservice.models.pojo.Service();
    br.com.addvisor.webservice.models.pojo.Address var1 = var0.getAddress();
    br.com.addvisor.webservice.models.pojo.enums.ServiceCat var2 = var0.getCategory();
    var0.setId((java.lang.Long)0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test37");


    br.com.addvisor.webservice.models.pojo.Evaluate var2 = new br.com.addvisor.webservice.models.pojo.Evaluate((java.lang.Float)100.0f, "");
    var2.setId((java.lang.Long)10L);
    br.com.addvisor.webservice.models.pojo.Evaluate var7 = new br.com.addvisor.webservice.models.pojo.Evaluate((java.lang.Float)100.0f, "");
    var7.setId((java.lang.Long)10L);
    boolean var10 = var2.equals((java.lang.Object)var7);
    br.com.addvisor.webservice.models.pojo.User var12 = new br.com.addvisor.webservice.models.pojo.User((java.lang.Long)0L);
    var12.setPhone("hi!");
    var12.setPhone("");
    java.lang.Long var17 = var12.getId();
    var7.setUser(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + 0L+ "'", var17.equals(0L));

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test38");


    br.com.addvisor.webservice.models.pojo.City var2 = new br.com.addvisor.webservice.models.pojo.City();
    br.com.addvisor.webservice.models.pojo.User var4 = new br.com.addvisor.webservice.models.pojo.User("hi!", "hi!", var2, "");
    var2.setId((java.lang.Long)10L);

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test39");


    br.com.addvisor.webservice.models.pojo.Agenda var0 = new br.com.addvisor.webservice.models.pojo.Agenda();
    java.util.List var1 = var0.getNames();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test40");


    br.com.addvisor.webservice.models.pojo.City var4 = new br.com.addvisor.webservice.models.pojo.City();
    br.com.addvisor.webservice.models.pojo.User var6 = new br.com.addvisor.webservice.models.pojo.User("hi!", "hi!", var4, "");
    java.lang.String var7 = var4.getName();
    br.com.addvisor.webservice.models.pojo.User var9 = new br.com.addvisor.webservice.models.pojo.User("hi!", "hi!", var4, "");
    java.lang.Long var10 = var4.getId();
    java.lang.String var11 = var4.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test41");


    br.com.addvisor.webservice.models.pojo.Service var0 = new br.com.addvisor.webservice.models.pojo.Service();
    br.com.addvisor.webservice.models.pojo.Address var1 = var0.getAddress();
    java.lang.String var2 = var0.getTags();
    java.lang.String var3 = var0.getDescription();
    var0.setId((java.lang.Long)10L);
    br.com.addvisor.webservice.models.pojo.Service var6 = new br.com.addvisor.webservice.models.pojo.Service();
    br.com.addvisor.webservice.models.pojo.Address var7 = var6.getAddress();
    var6.setId((java.lang.Long)0L);
    int var10 = var0.compareTo(var6);
    java.lang.String var11 = var6.getTags();
    br.com.addvisor.webservice.models.pojo.Address var12 = new br.com.addvisor.webservice.models.pojo.Address();
    var6.setAddress(var12);
    java.util.List var14 = var6.getPhones();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test42");


    br.com.addvisor.webservice.models.pojo.Address var0 = new br.com.addvisor.webservice.models.pojo.Address();
    java.lang.String var1 = var0.getComplement();
    br.com.addvisor.webservice.models.pojo.City var2 = var0.getCity();
    br.com.addvisor.webservice.models.pojo.State var3 = new br.com.addvisor.webservice.models.pojo.State();
    br.com.addvisor.webservice.models.pojo.Country var4 = new br.com.addvisor.webservice.models.pojo.Country();
    var4.setName("");
    java.lang.String var7 = var4.getAcronym();
    var4.setAcronym("");
    var3.setCountry(var4);
    java.lang.String var11 = var3.getUf();
    var2.setState(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test43");


    br.com.addvisor.webservice.models.pojo.Service var0 = new br.com.addvisor.webservice.models.pojo.Service();
    br.com.addvisor.webservice.models.pojo.Address var1 = var0.getAddress();
    java.lang.String var2 = var0.getTags();
    java.lang.String var3 = var0.getDescription();
    var0.setId((java.lang.Long)10L);
    br.com.addvisor.webservice.models.pojo.Service var6 = new br.com.addvisor.webservice.models.pojo.Service();
    br.com.addvisor.webservice.models.pojo.Address var7 = var6.getAddress();
    var6.setId((java.lang.Long)0L);
    int var10 = var0.compareTo(var6);
    java.lang.String var11 = var6.getTags();
    br.com.addvisor.webservice.models.pojo.Address var12 = new br.com.addvisor.webservice.models.pojo.Address();
    var6.setAddress(var12);
    var12.setComplement("User [id=0, name=null, email=null, password=null, city=null, phone=hi!]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test44");


    br.com.addvisor.webservice.models.pojo.State var0 = new br.com.addvisor.webservice.models.pojo.State();
    java.lang.String var1 = var0.getName();
    br.com.addvisor.webservice.models.pojo.Country var2 = var0.getCountry();
    br.com.addvisor.webservice.models.pojo.Evaluate var5 = new br.com.addvisor.webservice.models.pojo.Evaluate((java.lang.Float)100.0f, "");
    br.com.addvisor.webservice.models.pojo.Service var6 = var5.getService();
    var5.setComment("hi!");
    var5.setComment("hi!");
    br.com.addvisor.webservice.models.pojo.City var13 = new br.com.addvisor.webservice.models.pojo.City();
    br.com.addvisor.webservice.models.pojo.User var15 = new br.com.addvisor.webservice.models.pojo.User("hi!", "hi!", var13, "");
    var5.setUser(var15);
    br.com.addvisor.webservice.models.pojo.Service var17 = var5.getService();
    br.com.addvisor.webservice.models.pojo.User var19 = new br.com.addvisor.webservice.models.pojo.User((java.lang.Long)0L);
    var5.setUser(var19);
    boolean var21 = var0.equals((java.lang.Object)var19);
    java.lang.String var22 = var0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test45");


    br.com.addvisor.webservice.models.pojo.User var1 = new br.com.addvisor.webservice.models.pojo.User((java.lang.Long)0L);
    br.com.addvisor.webservice.models.pojo.City var2 = new br.com.addvisor.webservice.models.pojo.City();
    var1.setCity(var2);
    java.lang.Long var4 = var1.getId();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0L+ "'", var4.equals(0L));

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test46");


    br.com.addvisor.webservice.models.pojo.Service var0 = new br.com.addvisor.webservice.models.pojo.Service();
    br.com.addvisor.webservice.models.pojo.Address var1 = var0.getAddress();
    var0.setId((java.lang.Long)0L);
    var0.addPhone("");
    java.lang.Long var6 = var0.getId();
    br.com.addvisor.webservice.models.pojo.Address var7 = new br.com.addvisor.webservice.models.pojo.Address();
    var7.setComplement("");
    var0.setAddress(var7);
    br.com.addvisor.webservice.models.pojo.User var12 = new br.com.addvisor.webservice.models.pojo.User((java.lang.Long)0L);
    var12.setPhone("hi!");
    var0.setUser(var12);
    var0.addPhone("User [id=0, name=null, email=null, password=null, city=null, phone=hi!]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + 0L+ "'", var6.equals(0L));

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test47");


    br.com.addvisor.webservice.models.pojo.Service var0 = new br.com.addvisor.webservice.models.pojo.Service();
    br.com.addvisor.webservice.models.pojo.Address var1 = var0.getAddress();
    java.lang.String var2 = var0.getDescription();
    br.com.addvisor.webservice.models.pojo.User var4 = new br.com.addvisor.webservice.models.pojo.User((java.lang.Long)0L);
    var4.setPhone("hi!");
    var4.setName("");
    var4.setPhone("");
    boolean var11 = var0.equals((java.lang.Object)var4);
    var0.setDescription("hi!");
    var0.setId((java.lang.Long)100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test48");


    br.com.addvisor.webservice.models.pojo.State var0 = new br.com.addvisor.webservice.models.pojo.State();
    br.com.addvisor.webservice.models.pojo.Country var1 = new br.com.addvisor.webservice.models.pojo.Country();
    var1.setName("");
    java.lang.String var4 = var1.getAcronym();
    var1.setAcronym("");
    var0.setCountry(var1);
    var0.setName("");
    java.lang.Long var10 = var0.getId();
    var0.setId((java.lang.Long)100L);
    br.com.addvisor.webservice.models.pojo.City var17 = new br.com.addvisor.webservice.models.pojo.City();
    br.com.addvisor.webservice.models.pojo.User var19 = new br.com.addvisor.webservice.models.pojo.User("hi!", "hi!", var17, "");
    java.lang.String var20 = var17.getName();
    br.com.addvisor.webservice.models.pojo.User var22 = new br.com.addvisor.webservice.models.pojo.User("hi!", "hi!", var17, "");
    var22.setName("hi!");
    var22.setName("hi!");
    boolean var27 = var0.equals((java.lang.Object)var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test49");


    br.com.addvisor.webservice.models.pojo.State var0 = new br.com.addvisor.webservice.models.pojo.State();
    java.lang.String var1 = var0.getName();
    br.com.addvisor.webservice.models.pojo.Country var2 = var0.getCountry();
    br.com.addvisor.webservice.models.pojo.Country var3 = new br.com.addvisor.webservice.models.pojo.Country();
    var0.setCountry(var3);
    br.com.addvisor.webservice.models.pojo.Country var5 = var0.getCountry();
    java.lang.String var6 = var0.getName();
    br.com.addvisor.webservice.models.pojo.Country var7 = new br.com.addvisor.webservice.models.pojo.Country();
    java.lang.String var8 = var7.getAcronym();
    var7.setId((java.lang.Long)100L);
    var0.setCountry(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test50");


    br.com.addvisor.webservice.models.pojo.Evaluate var2 = new br.com.addvisor.webservice.models.pojo.Evaluate((java.lang.Float)100.0f, "");
    br.com.addvisor.webservice.models.pojo.Service var3 = var2.getService();
    var2.setComment("hi!");
    var2.setComment("hi!");
    br.com.addvisor.webservice.models.pojo.City var10 = new br.com.addvisor.webservice.models.pojo.City();
    br.com.addvisor.webservice.models.pojo.User var12 = new br.com.addvisor.webservice.models.pojo.User("hi!", "hi!", var10, "");
    var2.setUser(var12);
    boolean var15 = var2.equals((java.lang.Object)false);
    var2.setComment("Service [id=0, address=null, phones=[], name=null, description=null, category=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test51");


    br.com.addvisor.webservice.models.pojo.Address var0 = new br.com.addvisor.webservice.models.pojo.Address();
    java.lang.String var1 = var0.getComplement();
    var0.setLocation("hi!");
    var0.setLocation("Service [id=0, address=null, phones=[], name=null, description=null, category=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test52");


    br.com.addvisor.webservice.models.pojo.City var2 = new br.com.addvisor.webservice.models.pojo.City();
    br.com.addvisor.webservice.models.pojo.User var4 = new br.com.addvisor.webservice.models.pojo.User("hi!", "hi!", var2, "");
    java.lang.String var5 = var2.getName();
    var2.setName("hi!");
    br.com.addvisor.webservice.models.pojo.State var8 = new br.com.addvisor.webservice.models.pojo.State();
    java.lang.String var9 = var8.getName();
    var2.setState(var8);
    br.com.addvisor.webservice.models.pojo.State var11 = new br.com.addvisor.webservice.models.pojo.State();
    java.lang.String var12 = var11.getName();
    br.com.addvisor.webservice.models.pojo.Country var13 = var11.getCountry();
    br.com.addvisor.webservice.models.pojo.Country var14 = new br.com.addvisor.webservice.models.pojo.Country();
    var11.setCountry(var14);
    br.com.addvisor.webservice.models.pojo.Country var16 = new br.com.addvisor.webservice.models.pojo.Country();
    var16.setName("");
    java.lang.String var19 = var16.getAcronym();
    var16.setId((java.lang.Long)100L);
    boolean var22 = var11.equals((java.lang.Object)var16);
    var2.setState(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test53");


    br.com.addvisor.webservice.models.pojo.Service var0 = new br.com.addvisor.webservice.models.pojo.Service();
    br.com.addvisor.webservice.models.pojo.Address var1 = var0.getAddress();
    br.com.addvisor.webservice.models.pojo.Address var2 = var0.getAddress();
    java.lang.String var3 = var0.toString();
    var0.setId((java.lang.Long)10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Service [id=null, address=null, phones=[], name=null, description=null, category=null]"+ "'", var3.equals("Service [id=null, address=null, phones=[], name=null, description=null, category=null]"));

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test54");


    br.com.addvisor.webservice.models.pojo.Service var0 = new br.com.addvisor.webservice.models.pojo.Service();
    br.com.addvisor.webservice.models.pojo.Address var1 = var0.getAddress();
    java.lang.String var2 = var0.getTags();
    java.lang.String var3 = var0.getDescription();
    var0.setId((java.lang.Long)10L);
    br.com.addvisor.webservice.models.pojo.Service var6 = new br.com.addvisor.webservice.models.pojo.Service();
    br.com.addvisor.webservice.models.pojo.Address var7 = var6.getAddress();
    var6.setId((java.lang.Long)0L);
    int var10 = var0.compareTo(var6);
    java.lang.Long var11 = var0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + 10L+ "'", var11.equals(10L));

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test55");


    br.com.addvisor.webservice.models.pojo.Service var0 = new br.com.addvisor.webservice.models.pojo.Service();
    br.com.addvisor.webservice.models.pojo.Address var1 = var0.getAddress();
    var0.setMedia((java.lang.Float)(-1.0f));
    var0.setDescription("hi!");
    java.util.List var6 = var0.getPhones();
    java.lang.Float var7 = var0.getMedia();
    java.lang.String var8 = var0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + (-1.0f)+ "'", var7.equals((-1.0f)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test56");


    br.com.addvisor.webservice.models.pojo.Country var0 = new br.com.addvisor.webservice.models.pojo.Country();
    var0.setName("");
    java.lang.String var3 = var0.getAcronym();
    var0.setAcronym("");
    var0.setAcronym("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test57");


    br.com.addvisor.webservice.models.pojo.Evaluate var2 = new br.com.addvisor.webservice.models.pojo.Evaluate((java.lang.Float)100.0f, "");
    var2.setNote((java.lang.Float)10.0f);
    java.lang.String var5 = var2.getComment();
    java.lang.String var6 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Evaluate [id=null, user=null, service=null, note=10.0, comment=]"+ "'", var6.equals("Evaluate [id=null, user=null, service=null, note=10.0, comment=]"));

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test58");


    br.com.addvisor.webservice.models.pojo.Country var0 = new br.com.addvisor.webservice.models.pojo.Country();
    var0.setName("");
    java.lang.String var3 = var0.getAcronym();
    var0.setAcronym("");
    var0.setId((java.lang.Long)0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test59");


    br.com.addvisor.webservice.models.pojo.Agenda var0 = new br.com.addvisor.webservice.models.pojo.Agenda();
    java.util.List var1 = var0.getNumbers();
    br.com.addvisor.webservice.models.pojo.Agenda var2 = new br.com.addvisor.webservice.models.pojo.Agenda();
    java.util.List var3 = var2.getNumbers();
    java.util.List var4 = var2.getNumbers();
    var0.setNumbers(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test60");


    br.com.addvisor.webservice.models.pojo.Service var0 = new br.com.addvisor.webservice.models.pojo.Service();
    br.com.addvisor.webservice.models.pojo.Address var1 = var0.getAddress();
    java.lang.String var2 = var0.getDescription();
    java.lang.Float var3 = var0.getMedia();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test61");


    br.com.addvisor.webservice.models.pojo.User var1 = new br.com.addvisor.webservice.models.pojo.User((java.lang.Long)0L);
    var1.setPhone("hi!");
    var1.setPhone("");
    var1.setPhone("");
    br.com.addvisor.webservice.models.pojo.State var8 = new br.com.addvisor.webservice.models.pojo.State();
    java.lang.String var9 = var8.getName();
    br.com.addvisor.webservice.models.pojo.Country var10 = var8.getCountry();
    br.com.addvisor.webservice.models.pojo.Country var11 = new br.com.addvisor.webservice.models.pojo.Country();
    var8.setCountry(var11);
    boolean var13 = var1.equals((java.lang.Object)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test62");


    br.com.addvisor.webservice.models.pojo.Service var0 = new br.com.addvisor.webservice.models.pojo.Service();
    br.com.addvisor.webservice.models.pojo.Address var1 = var0.getAddress();
    java.lang.String var2 = var0.getTags();
    java.lang.String var3 = var0.getDescription();
    var0.setDescription("");
    var0.setId((java.lang.Long)1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test63");


    br.com.addvisor.webservice.models.pojo.City var4 = new br.com.addvisor.webservice.models.pojo.City();
    br.com.addvisor.webservice.models.pojo.User var6 = new br.com.addvisor.webservice.models.pojo.User("hi!", "hi!", var4, "");
    java.lang.String var7 = var4.getName();
    br.com.addvisor.webservice.models.pojo.User var9 = new br.com.addvisor.webservice.models.pojo.User("hi!", "hi!", var4, "");
    var4.setId((java.lang.Long)10L);
    br.com.addvisor.webservice.models.pojo.User var13 = new br.com.addvisor.webservice.models.pojo.User((java.lang.Long)0L);
    var13.setPhone("hi!");
    var13.setPhone("");
    var13.setPhone("");
    var13.setEmail("Service [id=null, address=null, phones=[], name=null, description=null, category=null]");
    boolean var22 = var4.equals((java.lang.Object)"Service [id=null, address=null, phones=[], name=null, description=null, category=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test64");


    br.com.addvisor.webservice.models.pojo.Service var0 = new br.com.addvisor.webservice.models.pojo.Service();
    br.com.addvisor.webservice.models.pojo.Address var1 = var0.getAddress();
    java.lang.String var2 = var0.getTags();
    java.lang.String var3 = var0.getDescription();
    var0.setId((java.lang.Long)10L);
    br.com.addvisor.webservice.models.pojo.Service var6 = new br.com.addvisor.webservice.models.pojo.Service();
    br.com.addvisor.webservice.models.pojo.Address var7 = var6.getAddress();
    var6.setId((java.lang.Long)0L);
    int var10 = var0.compareTo(var6);
    java.lang.String var11 = var6.getTags();
    java.lang.String var12 = var6.toString();
    java.lang.String var13 = var6.getDescription();
    java.lang.Long var14 = var6.getId();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Service [id=0, address=null, phones=[], name=null, description=null, category=null]"+ "'", var12.equals("Service [id=0, address=null, phones=[], name=null, description=null, category=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + 0L+ "'", var14.equals(0L));

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test65");


    br.com.addvisor.webservice.models.pojo.Country var0 = new br.com.addvisor.webservice.models.pojo.Country();
    java.lang.String var1 = var0.getAcronym();
    java.lang.Long var2 = var0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test66");


    br.com.addvisor.webservice.models.pojo.Evaluate var2 = new br.com.addvisor.webservice.models.pojo.Evaluate((java.lang.Float)100.0f, "");
    var2.setNote((java.lang.Float)10.0f);
    java.lang.String var5 = var2.getComment();
    java.lang.Long var6 = var2.getId();
    br.com.addvisor.webservice.models.pojo.Service var7 = new br.com.addvisor.webservice.models.pojo.Service();
    br.com.addvisor.webservice.models.pojo.Address var8 = var7.getAddress();
    java.lang.String var9 = var7.getTags();
    java.lang.String var10 = var7.getDescription();
    var7.setId((java.lang.Long)10L);
    br.com.addvisor.webservice.models.pojo.enums.ServiceCat var13 = var7.getCategory();
    br.com.addvisor.webservice.models.pojo.User var14 = var7.getUser();
    var2.setService(var7);
    java.lang.String var16 = var7.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test67");


    br.com.addvisor.webservice.models.pojo.City var2 = new br.com.addvisor.webservice.models.pojo.City();
    br.com.addvisor.webservice.models.pojo.User var4 = new br.com.addvisor.webservice.models.pojo.User("hi!", "", var2, "hi!");
    br.com.addvisor.webservice.models.pojo.State var5 = new br.com.addvisor.webservice.models.pojo.State();
    java.lang.String var6 = var5.getName();
    java.lang.String var7 = var5.getUf();
    var2.setState(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test68");


    br.com.addvisor.webservice.models.pojo.Evaluate var0 = new br.com.addvisor.webservice.models.pojo.Evaluate();
    br.com.addvisor.webservice.models.pojo.Service var1 = var0.getService();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test69");


    br.com.addvisor.webservice.models.pojo.Country var0 = new br.com.addvisor.webservice.models.pojo.Country();
    java.lang.String var1 = var0.getAcronym();
    java.lang.String var2 = var0.getAcronym();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test70");


    br.com.addvisor.webservice.models.pojo.Agenda var0 = new br.com.addvisor.webservice.models.pojo.Agenda();
    java.util.List var1 = var0.getNumbers();
    java.util.List var2 = var0.getNumbers();
    java.util.List var3 = var0.getNumbers();
    java.util.Map var4 = var0.getContacts();
    br.com.addvisor.webservice.models.pojo.Agenda var5 = new br.com.addvisor.webservice.models.pojo.Agenda();
    java.util.List var6 = var5.getNumbers();
    java.util.List var7 = var5.getNumbers();
    java.util.List var8 = var5.getNumbers();
    java.util.Map var9 = var5.getContacts();
    java.util.Map var10 = var5.getContacts();
    var0.setContacts(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test71");


    br.com.addvisor.webservice.models.pojo.Evaluate var0 = new br.com.addvisor.webservice.models.pojo.Evaluate();
    br.com.addvisor.webservice.models.pojo.State var1 = new br.com.addvisor.webservice.models.pojo.State();
    br.com.addvisor.webservice.models.pojo.Country var2 = new br.com.addvisor.webservice.models.pojo.Country();
    var2.setName("");
    java.lang.String var5 = var2.getAcronym();
    var2.setAcronym("");
    var1.setCountry(var2);
    var1.setName("");
    boolean var11 = var0.equals((java.lang.Object)"");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test72");


    br.com.addvisor.webservice.models.pojo.Service var0 = new br.com.addvisor.webservice.models.pojo.Service();
    br.com.addvisor.webservice.models.pojo.Address var1 = var0.getAddress();
    java.lang.String var2 = var0.getTags();
    java.lang.String var3 = var0.getName();
    var0.setName("hi!");
    java.lang.String var6 = var0.getDescription();
    br.com.addvisor.webservice.models.pojo.Address var7 = var0.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test73");


    br.com.addvisor.webservice.models.pojo.Service var0 = new br.com.addvisor.webservice.models.pojo.Service();
    br.com.addvisor.webservice.models.pojo.Address var1 = var0.getAddress();
    java.lang.String var2 = var0.getTags();
    java.lang.String var3 = var0.getDescription();
    var0.setId((java.lang.Long)10L);
    br.com.addvisor.webservice.models.pojo.enums.ServiceCat var6 = var0.getCategory();
    java.lang.Long var7 = var0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + 10L+ "'", var7.equals(10L));

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test74");


    br.com.addvisor.webservice.models.pojo.State var0 = new br.com.addvisor.webservice.models.pojo.State();
    java.lang.String var1 = var0.getName();
    br.com.addvisor.webservice.models.pojo.Country var2 = var0.getCountry();
    br.com.addvisor.webservice.models.pojo.Country var3 = new br.com.addvisor.webservice.models.pojo.Country();
    var0.setCountry(var3);
    var0.setUf("hi!");
    var0.setUf("User [id=0, name=null, email=null, password=null, city=null, phone=hi!]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test75");


    br.com.addvisor.webservice.models.pojo.City var2 = new br.com.addvisor.webservice.models.pojo.City();
    br.com.addvisor.webservice.models.pojo.User var4 = new br.com.addvisor.webservice.models.pojo.User("hi!", "hi!", var2, "");
    java.lang.String var5 = var2.getName();
    var2.setName("hi!");
    br.com.addvisor.webservice.models.pojo.State var8 = new br.com.addvisor.webservice.models.pojo.State();
    java.lang.String var9 = var8.getName();
    var2.setState(var8);
    var8.setName("Service [id=null, address=null, phones=[], name=null, description=null, category=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test76");


    br.com.addvisor.webservice.models.pojo.Evaluate var0 = new br.com.addvisor.webservice.models.pojo.Evaluate();
    java.lang.String var1 = var0.getComment();
    java.lang.Float var2 = var0.getNote();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test77");


    br.com.addvisor.webservice.models.pojo.Service var0 = new br.com.addvisor.webservice.models.pojo.Service();
    br.com.addvisor.webservice.models.pojo.Address var1 = var0.getAddress();
    var0.setMedia((java.lang.Float)(-1.0f));
    br.com.addvisor.webservice.models.pojo.Address var4 = new br.com.addvisor.webservice.models.pojo.Address();
    java.lang.String var5 = var4.toString();
    java.lang.String var6 = var4.getComplement();
    var0.setAddress(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test78");


    br.com.addvisor.webservice.models.pojo.Service var0 = new br.com.addvisor.webservice.models.pojo.Service();
    br.com.addvisor.webservice.models.pojo.Address var1 = var0.getAddress();
    var0.setMedia((java.lang.Float)(-1.0f));
    var0.setDescription("hi!");
    var0.addPhone("hi!");
    java.lang.String var8 = var0.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test79");


    br.com.addvisor.webservice.models.pojo.Service var0 = new br.com.addvisor.webservice.models.pojo.Service();
    br.com.addvisor.webservice.models.pojo.Address var1 = var0.getAddress();
    var0.setId((java.lang.Long)0L);
    var0.addPhone("");
    java.lang.Long var6 = var0.getId();
    br.com.addvisor.webservice.models.pojo.Address var7 = new br.com.addvisor.webservice.models.pojo.Address();
    var7.setComplement("");
    var0.setAddress(var7);
    java.lang.String var11 = var0.getTags();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + 0L+ "'", var6.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test80");


    br.com.addvisor.webservice.models.pojo.Agenda var0 = new br.com.addvisor.webservice.models.pojo.Agenda();
    br.com.addvisor.webservice.models.pojo.Agenda var1 = new br.com.addvisor.webservice.models.pojo.Agenda();
    java.util.List var2 = var1.getNumbers();
    var0.setNames(var2);
    java.util.List var4 = var0.getNames();
    java.util.List var5 = var0.getNumbers();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test81");


    br.com.addvisor.webservice.models.pojo.Agenda var0 = new br.com.addvisor.webservice.models.pojo.Agenda();
    var0.addContact("hi!", "");
    br.com.addvisor.webservice.models.pojo.Agenda var4 = new br.com.addvisor.webservice.models.pojo.Agenda();
    java.util.List var5 = var4.getNumbers();
    java.util.List var6 = var4.getNumbers();
    var0.setNumbers(var6);
    br.com.addvisor.webservice.models.pojo.Service var8 = new br.com.addvisor.webservice.models.pojo.Service();
    br.com.addvisor.webservice.models.pojo.Address var9 = var8.getAddress();
    var8.setMedia((java.lang.Float)(-1.0f));
    var8.setDescription("hi!");
    java.util.List var14 = var8.getPhones();
    var0.setNames(var14);
    br.com.addvisor.webservice.models.pojo.Service var16 = new br.com.addvisor.webservice.models.pojo.Service();
    br.com.addvisor.webservice.models.pojo.Address var17 = var16.getAddress();
    var16.setMedia((java.lang.Float)(-1.0f));
    var16.setDescription("hi!");
    java.util.List var22 = var16.getPhones();
    var0.setNames(var22);
    br.com.addvisor.webservice.models.pojo.Agenda var24 = new br.com.addvisor.webservice.models.pojo.Agenda();
    java.util.List var25 = var24.getNumbers();
    java.util.List var26 = var24.getNumbers();
    var0.setNumbers(var26);
    java.util.List var28 = var0.getNames();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test82");


    br.com.addvisor.webservice.models.pojo.Service var0 = new br.com.addvisor.webservice.models.pojo.Service();
    br.com.addvisor.webservice.models.pojo.Address var1 = var0.getAddress();
    java.lang.String var2 = var0.getTags();
    java.lang.String var3 = var0.getDescription();
    boolean var5 = var0.equals((java.lang.Object)' ');
    var0.setId((java.lang.Long)10L);
    br.com.addvisor.webservice.models.pojo.User var8 = new br.com.addvisor.webservice.models.pojo.User();
    var0.setUser(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test83");


    br.com.addvisor.webservice.models.pojo.User var1 = new br.com.addvisor.webservice.models.pojo.User((java.lang.Long)0L);
    var1.setPhone("hi!");
    var1.setPhone("");
    java.lang.Long var6 = var1.getId();
    br.com.addvisor.webservice.models.pojo.City var7 = var1.getCity();
    java.lang.String var8 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + 0L+ "'", var6.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "User [id=0, name=null, email=null, password=null, city=null, phone=]"+ "'", var8.equals("User [id=0, name=null, email=null, password=null, city=null, phone=]"));

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test84");


    br.com.addvisor.webservice.models.pojo.Evaluate var0 = new br.com.addvisor.webservice.models.pojo.Evaluate();
    br.com.addvisor.webservice.models.pojo.City var3 = new br.com.addvisor.webservice.models.pojo.City();
    br.com.addvisor.webservice.models.pojo.User var5 = new br.com.addvisor.webservice.models.pojo.User("hi!", "hi!", var3, "");
    br.com.addvisor.webservice.models.pojo.City var6 = var5.getCity();
    java.lang.String var7 = var5.getPassword();
    var0.setUser(var5);
    java.lang.String var9 = var5.getPhone();
    boolean var11 = var5.authenticatePassword("hi!");
    java.lang.String var12 = var5.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test85");


    br.com.addvisor.webservice.models.pojo.User var1 = new br.com.addvisor.webservice.models.pojo.User((java.lang.Long)0L);
    var1.setPhone("hi!");
    var1.setPhone("");
    var1.setEmail("Service [id=0, address=null, phones=[], name=null, description=null, category=null]");

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test86");


    br.com.addvisor.webservice.models.pojo.Service var0 = new br.com.addvisor.webservice.models.pojo.Service();
    br.com.addvisor.webservice.models.pojo.Address var1 = var0.getAddress();
    var0.setId((java.lang.Long)0L);
    var0.addPhone("");
    java.lang.String var6 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Service [id=0, address=null, phones=[], name=null, description=null, category=null]"+ "'", var6.equals("Service [id=0, address=null, phones=[], name=null, description=null, category=null]"));

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test87");


    br.com.addvisor.webservice.models.pojo.User var1 = new br.com.addvisor.webservice.models.pojo.User((java.lang.Long)0L);
    br.com.addvisor.webservice.models.pojo.City var2 = new br.com.addvisor.webservice.models.pojo.City();
    var1.setCity(var2);
    java.lang.Long var4 = var2.getId();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test88");


    br.com.addvisor.webservice.models.pojo.Address var0 = new br.com.addvisor.webservice.models.pojo.Address();
    java.lang.String var1 = var0.getComplement();
    br.com.addvisor.webservice.models.pojo.City var2 = var0.getCity();
    boolean var4 = var2.equals((java.lang.Object)false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test89");


    br.com.addvisor.webservice.models.pojo.User var1 = new br.com.addvisor.webservice.models.pojo.User((java.lang.Long)0L);
    br.com.addvisor.webservice.models.pojo.City var2 = new br.com.addvisor.webservice.models.pojo.City();
    var1.setCity(var2);
    br.com.addvisor.webservice.models.pojo.User var5 = new br.com.addvisor.webservice.models.pojo.User((java.lang.Long)0L);
    br.com.addvisor.webservice.models.pojo.City var6 = new br.com.addvisor.webservice.models.pojo.City();
    var5.setCity(var6);
    boolean var8 = var1.equals((java.lang.Object)var5);
    br.com.addvisor.webservice.models.pojo.City var13 = new br.com.addvisor.webservice.models.pojo.City();
    br.com.addvisor.webservice.models.pojo.User var15 = new br.com.addvisor.webservice.models.pojo.User("hi!", "hi!", var13, "");
    java.lang.String var16 = var13.getName();
    br.com.addvisor.webservice.models.pojo.User var18 = new br.com.addvisor.webservice.models.pojo.User("hi!", "hi!", var13, "");
    java.lang.Long var19 = var13.getId();
    var5.setCity(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test90");


    br.com.addvisor.webservice.models.pojo.User var1 = new br.com.addvisor.webservice.models.pojo.User((java.lang.Long)100L);

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test91");


    br.com.addvisor.webservice.models.pojo.Evaluate var2 = new br.com.addvisor.webservice.models.pojo.Evaluate((java.lang.Float)100.0f, "");
    var2.setId((java.lang.Long)10L);
    var2.setComment("User [id=0, name=null, email=null, password=null, city=null, phone=hi!]");

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test92");


    br.com.addvisor.webservice.models.pojo.Agenda var0 = new br.com.addvisor.webservice.models.pojo.Agenda();
    var0.addContact("hi!", "");
    br.com.addvisor.webservice.models.pojo.Agenda var4 = new br.com.addvisor.webservice.models.pojo.Agenda();
    java.util.List var5 = var4.getNumbers();
    java.util.List var6 = var4.getNumbers();
    var0.setNumbers(var6);
    java.util.Map var8 = var0.getContacts();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test93");


    br.com.addvisor.webservice.models.pojo.Country var0 = new br.com.addvisor.webservice.models.pojo.Country();
    java.lang.Long var1 = var0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test94");


    br.com.addvisor.webservice.models.pojo.User var1 = new br.com.addvisor.webservice.models.pojo.User((java.lang.Long)0L);
    var1.setPhone("hi!");
    java.lang.String var4 = var1.toString();
    br.com.addvisor.webservice.models.pojo.City var5 = var1.getCity();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "User [id=0, name=null, email=null, password=null, city=null, phone=hi!]"+ "'", var4.equals("User [id=0, name=null, email=null, password=null, city=null, phone=hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test95");


    br.com.addvisor.webservice.models.pojo.State var0 = new br.com.addvisor.webservice.models.pojo.State();
    java.lang.String var1 = var0.getName();
    br.com.addvisor.webservice.models.pojo.Country var2 = var0.getCountry();
    br.com.addvisor.webservice.models.pojo.Country var3 = new br.com.addvisor.webservice.models.pojo.Country();
    var0.setCountry(var3);
    br.com.addvisor.webservice.models.pojo.Country var5 = var0.getCountry();
    br.com.addvisor.webservice.models.pojo.Country var6 = new br.com.addvisor.webservice.models.pojo.Country();
    var6.setName("");
    java.lang.String var9 = var6.getAcronym();
    br.com.addvisor.webservice.models.pojo.State var10 = new br.com.addvisor.webservice.models.pojo.State();
    java.lang.String var11 = var10.getName();
    br.com.addvisor.webservice.models.pojo.Country var12 = var10.getCountry();
    br.com.addvisor.webservice.models.pojo.Country var13 = new br.com.addvisor.webservice.models.pojo.Country();
    var10.setCountry(var13);
    var13.setId((java.lang.Long)(-1L));
    boolean var17 = var6.equals((java.lang.Object)var13);
    var0.setCountry(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test96");


    br.com.addvisor.webservice.models.pojo.Agenda var0 = new br.com.addvisor.webservice.models.pojo.Agenda();
    br.com.addvisor.webservice.models.pojo.Agenda var1 = new br.com.addvisor.webservice.models.pojo.Agenda();
    java.util.List var2 = var1.getNumbers();
    var0.setNames(var2);
    java.util.List var4 = var0.getNames();
    var0.addContact("Evaluate [id=null, user=null, service=null, note=10.0, comment=]", "Service [id=0, address=null, phones=[], name=null, description=null, category=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test97");


    br.com.addvisor.webservice.models.pojo.City var2 = new br.com.addvisor.webservice.models.pojo.City();
    br.com.addvisor.webservice.models.pojo.User var4 = new br.com.addvisor.webservice.models.pojo.User("hi!", "hi!", var2, "");
    br.com.addvisor.webservice.models.pojo.City var5 = var4.getCity();
    java.lang.String var6 = var4.getName();
    java.lang.String var7 = var4.getPhone();
    boolean var9 = var4.authenticatePassword("Service [id=0, address=null, phones=[], name=null, description=null, category=null]");
    br.com.addvisor.webservice.models.pojo.City var12 = new br.com.addvisor.webservice.models.pojo.City();
    br.com.addvisor.webservice.models.pojo.User var14 = new br.com.addvisor.webservice.models.pojo.User("hi!", "hi!", var12, "");
    java.lang.String var15 = var12.getName();
    var4.setCity(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test98");


    br.com.addvisor.webservice.models.pojo.Service var0 = new br.com.addvisor.webservice.models.pojo.Service();
    br.com.addvisor.webservice.models.pojo.Address var1 = var0.getAddress();
    var0.setMedia((java.lang.Float)(-1.0f));
    var0.setDescription("hi!");
    boolean var7 = var0.equals((java.lang.Object)false);
    java.lang.Float var8 = var0.getMedia();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + (-1.0f)+ "'", var8.equals((-1.0f)));

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test99");


    br.com.addvisor.webservice.models.pojo.Evaluate var2 = new br.com.addvisor.webservice.models.pojo.Evaluate((java.lang.Float)100.0f, "");
    br.com.addvisor.webservice.models.pojo.Service var3 = var2.getService();
    var2.setComment("hi!");
    var2.setComment("hi!");
    br.com.addvisor.webservice.models.pojo.City var10 = new br.com.addvisor.webservice.models.pojo.City();
    br.com.addvisor.webservice.models.pojo.User var12 = new br.com.addvisor.webservice.models.pojo.User("hi!", "hi!", var10, "");
    var2.setUser(var12);
    var12.setPassword("User [id=0, name=null, email=null, password=null, city=null, phone=hi!]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test100");


    br.com.addvisor.webservice.models.pojo.Country var0 = new br.com.addvisor.webservice.models.pojo.Country();
    java.lang.String var1 = var0.getAcronym();
    var0.setId((java.lang.Long)100L);
    java.lang.String var4 = var0.getAcronym();
    java.lang.Long var5 = var0.getId();
    java.lang.Long var6 = var0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 100L+ "'", var5.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + 100L+ "'", var6.equals(100L));

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test101");


    br.com.addvisor.webservice.models.pojo.Service var0 = new br.com.addvisor.webservice.models.pojo.Service();
    br.com.addvisor.webservice.models.pojo.Address var1 = var0.getAddress();
    java.lang.String var2 = var0.getTags();
    java.lang.String var3 = var0.getName();
    var0.setName("hi!");
    var0.addPhone("");
    var0.addPhone("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test102");


    br.com.addvisor.webservice.models.pojo.Country var0 = new br.com.addvisor.webservice.models.pojo.Country();
    var0.setName("");
    java.lang.String var3 = var0.getAcronym();
    br.com.addvisor.webservice.models.pojo.State var4 = new br.com.addvisor.webservice.models.pojo.State();
    java.lang.String var5 = var4.getName();
    br.com.addvisor.webservice.models.pojo.Country var6 = var4.getCountry();
    br.com.addvisor.webservice.models.pojo.Country var7 = new br.com.addvisor.webservice.models.pojo.Country();
    var4.setCountry(var7);
    var7.setId((java.lang.Long)(-1L));
    boolean var11 = var0.equals((java.lang.Object)var7);
    var7.setName("");
    var7.setId((java.lang.Long)0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test103");


    br.com.addvisor.webservice.models.pojo.Service var0 = new br.com.addvisor.webservice.models.pojo.Service();
    br.com.addvisor.webservice.models.pojo.Address var1 = var0.getAddress();
    java.lang.String var2 = var0.getTags();
    java.lang.String var3 = var0.getDescription();
    boolean var5 = var0.equals((java.lang.Object)' ');
    var0.setId((java.lang.Long)10L);
    br.com.addvisor.webservice.models.pojo.Address var8 = var0.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test104");


    br.com.addvisor.webservice.models.pojo.Agenda var0 = new br.com.addvisor.webservice.models.pojo.Agenda();
    var0.addContact("hi!", "");
    br.com.addvisor.webservice.models.pojo.Agenda var4 = new br.com.addvisor.webservice.models.pojo.Agenda();
    java.util.List var5 = var4.getNumbers();
    java.util.List var6 = var4.getNumbers();
    var0.setNumbers(var6);
    br.com.addvisor.webservice.models.pojo.Service var8 = new br.com.addvisor.webservice.models.pojo.Service();
    br.com.addvisor.webservice.models.pojo.Address var9 = var8.getAddress();
    var8.setMedia((java.lang.Float)(-1.0f));
    var8.setDescription("hi!");
    java.util.List var14 = var8.getPhones();
    var0.setNames(var14);
    br.com.addvisor.webservice.models.pojo.Service var16 = new br.com.addvisor.webservice.models.pojo.Service();
    br.com.addvisor.webservice.models.pojo.Address var17 = var16.getAddress();
    var16.setMedia((java.lang.Float)(-1.0f));
    var16.setDescription("hi!");
    java.util.List var22 = var16.getPhones();
    var0.setNames(var22);
    java.util.Map var24 = var0.getContacts();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test105");


    br.com.addvisor.webservice.models.pojo.Evaluate var2 = new br.com.addvisor.webservice.models.pojo.Evaluate((java.lang.Float)100.0f, "");
    var2.setId((java.lang.Long)10L);
    java.lang.String var5 = var2.toString();
    java.lang.Long var6 = var2.getId();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Evaluate [id=10, user=null, service=null, note=100.0, comment=]"+ "'", var5.equals("Evaluate [id=10, user=null, service=null, note=100.0, comment=]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + 10L+ "'", var6.equals(10L));

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test106");


    br.com.addvisor.webservice.models.pojo.Country var0 = new br.com.addvisor.webservice.models.pojo.Country();
    java.lang.String var1 = var0.getAcronym();
    var0.setId((java.lang.Long)100L);
    var0.setName("hi!");
    java.lang.String var6 = var0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test107");


    br.com.addvisor.webservice.models.pojo.Evaluate var2 = new br.com.addvisor.webservice.models.pojo.Evaluate((java.lang.Float)100.0f, "hi!");
    br.com.addvisor.webservice.models.pojo.User var4 = new br.com.addvisor.webservice.models.pojo.User((java.lang.Long)0L);
    var4.setPhone("hi!");
    var4.setName("");
    var4.setPhone("");
    var4.setId((java.lang.Long)1L);
    var2.setUser(var4);
    java.lang.Long var14 = var2.getId();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test108");


    br.com.addvisor.webservice.models.pojo.Evaluate var2 = new br.com.addvisor.webservice.models.pojo.Evaluate((java.lang.Float)100.0f, "");
    br.com.addvisor.webservice.models.pojo.Service var3 = var2.getService();
    var2.setComment("hi!");
    var2.setComment("hi!");
    br.com.addvisor.webservice.models.pojo.City var10 = new br.com.addvisor.webservice.models.pojo.City();
    br.com.addvisor.webservice.models.pojo.User var12 = new br.com.addvisor.webservice.models.pojo.User("hi!", "hi!", var10, "");
    var2.setUser(var12);
    br.com.addvisor.webservice.models.pojo.Service var14 = var2.getService();
    java.lang.Long var15 = var2.getId();
    br.com.addvisor.webservice.models.pojo.Service var16 = new br.com.addvisor.webservice.models.pojo.Service();
    br.com.addvisor.webservice.models.pojo.Address var17 = var16.getAddress();
    java.lang.String var18 = var16.getTags();
    java.lang.String var19 = var16.getDescription();
    var16.setId((java.lang.Long)10L);
    var16.setMedia((java.lang.Float)10.0f);
    var16.setName("Service [id=0, address=null, phones=[], name=null, description=null, category=null]");
    br.com.addvisor.webservice.models.pojo.Service var26 = new br.com.addvisor.webservice.models.pojo.Service();
    br.com.addvisor.webservice.models.pojo.Address var27 = var26.getAddress();
    java.lang.String var28 = var26.getDescription();
    br.com.addvisor.webservice.models.pojo.User var30 = new br.com.addvisor.webservice.models.pojo.User((java.lang.Long)0L);
    var30.setPhone("hi!");
    var30.setName("");
    var30.setPhone("");
    boolean var37 = var26.equals((java.lang.Object)var30);
    java.lang.String var38 = var30.getName();
    var16.setUser(var30);
    var2.setService(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + ""+ "'", var38.equals(""));

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test109");


    br.com.addvisor.webservice.models.pojo.Address var0 = new br.com.addvisor.webservice.models.pojo.Address();
    boolean var2 = var0.equals((java.lang.Object)(short)1);
    java.lang.String var3 = var0.toString();
    java.lang.String var4 = var0.getComplement();
    java.lang.String var5 = var0.toString();
    java.lang.String var6 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test110");


    br.com.addvisor.webservice.models.pojo.Evaluate var2 = new br.com.addvisor.webservice.models.pojo.Evaluate((java.lang.Float)100.0f, "");
    var2.setNote((java.lang.Float)10.0f);
    java.lang.String var5 = var2.getComment();
    br.com.addvisor.webservice.models.pojo.Service var6 = new br.com.addvisor.webservice.models.pojo.Service();
    br.com.addvisor.webservice.models.pojo.Address var7 = var6.getAddress();
    br.com.addvisor.webservice.models.pojo.Address var8 = var6.getAddress();
    var2.setService(var6);
    br.com.addvisor.webservice.models.pojo.User var10 = var6.getUser();
    br.com.addvisor.webservice.models.pojo.Service var11 = new br.com.addvisor.webservice.models.pojo.Service();
    br.com.addvisor.webservice.models.pojo.Address var12 = var11.getAddress();
    var11.setMedia((java.lang.Float)(-1.0f));
    var11.setDescription("hi!");
    int var17 = var6.compareTo(var11);
    br.com.addvisor.webservice.models.pojo.Agenda var18 = new br.com.addvisor.webservice.models.pojo.Agenda();
    var18.addContact("hi!", "");
    br.com.addvisor.webservice.models.pojo.Agenda var22 = new br.com.addvisor.webservice.models.pojo.Agenda();
    java.util.List var23 = var22.getNumbers();
    java.util.List var24 = var22.getNumbers();
    var18.setNumbers(var24);
    br.com.addvisor.webservice.models.pojo.Service var26 = new br.com.addvisor.webservice.models.pojo.Service();
    br.com.addvisor.webservice.models.pojo.Address var27 = var26.getAddress();
    var26.setMedia((java.lang.Float)(-1.0f));
    var26.setDescription("hi!");
    java.util.List var32 = var26.getPhones();
    var18.setNames(var32);
    br.com.addvisor.webservice.models.pojo.Service var34 = new br.com.addvisor.webservice.models.pojo.Service();
    br.com.addvisor.webservice.models.pojo.Address var35 = var34.getAddress();
    var34.setMedia((java.lang.Float)(-1.0f));
    var34.setDescription("hi!");
    java.util.List var40 = var34.getPhones();
    var18.setNames(var40);
    var6.setPhones(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test111");


    br.com.addvisor.webservice.models.pojo.City var2 = new br.com.addvisor.webservice.models.pojo.City();
    br.com.addvisor.webservice.models.pojo.User var4 = new br.com.addvisor.webservice.models.pojo.User("hi!", "hi!", var2, "");
    br.com.addvisor.webservice.models.pojo.City var5 = var4.getCity();
    java.lang.String var6 = var4.getName();
    br.com.addvisor.webservice.models.pojo.City var7 = var4.getCity();
    var7.setName("Service [id=null, address=null, phones=[], name=null, description=null, category=null]");
    br.com.addvisor.webservice.models.pojo.City var14 = new br.com.addvisor.webservice.models.pojo.City();
    br.com.addvisor.webservice.models.pojo.User var16 = new br.com.addvisor.webservice.models.pojo.User("hi!", "hi!", var14, "");
    java.lang.String var17 = var14.getName();
    br.com.addvisor.webservice.models.pojo.User var19 = new br.com.addvisor.webservice.models.pojo.User("hi!", "hi!", var14, "");
    br.com.addvisor.webservice.models.pojo.State var20 = var14.getState();
    var14.setId((java.lang.Long)(-1L));
    boolean var23 = var7.equals((java.lang.Object)var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test112");


    br.com.addvisor.webservice.models.pojo.Service var0 = new br.com.addvisor.webservice.models.pojo.Service();
    br.com.addvisor.webservice.models.pojo.Address var1 = var0.getAddress();
    java.lang.String var2 = var0.getDescription();
    br.com.addvisor.webservice.models.pojo.User var4 = new br.com.addvisor.webservice.models.pojo.User((java.lang.Long)0L);
    var4.setPhone("hi!");
    var4.setName("");
    var4.setPhone("");
    boolean var11 = var0.equals((java.lang.Object)var4);
    br.com.addvisor.webservice.models.pojo.City var12 = var4.getCity();
    java.lang.String var13 = var4.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test113");


    br.com.addvisor.webservice.models.pojo.Service var0 = new br.com.addvisor.webservice.models.pojo.Service();
    br.com.addvisor.webservice.models.pojo.Address var1 = var0.getAddress();
    java.lang.String var2 = var0.getTags();
    java.lang.String var3 = var0.getDescription();
    var0.setDescription("");
    var0.addPhone("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test114");


    br.com.addvisor.webservice.models.pojo.Evaluate var2 = new br.com.addvisor.webservice.models.pojo.Evaluate((java.lang.Float)100.0f, "");
    br.com.addvisor.webservice.models.pojo.Service var3 = var2.getService();
    var2.setComment("hi!");
    br.com.addvisor.webservice.models.pojo.Service var6 = new br.com.addvisor.webservice.models.pojo.Service();
    br.com.addvisor.webservice.models.pojo.Address var7 = var6.getAddress();
    java.lang.String var8 = var6.getTags();
    java.lang.String var9 = var6.getDescription();
    var6.setId((java.lang.Long)10L);
    br.com.addvisor.webservice.models.pojo.enums.ServiceCat var12 = var6.getCategory();
    br.com.addvisor.webservice.models.pojo.User var13 = var6.getUser();
    boolean var14 = var2.equals((java.lang.Object)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test115");


    br.com.addvisor.webservice.models.pojo.State var0 = new br.com.addvisor.webservice.models.pojo.State();
    br.com.addvisor.webservice.models.pojo.Country var1 = new br.com.addvisor.webservice.models.pojo.Country();
    var1.setName("");
    java.lang.String var4 = var1.getAcronym();
    var1.setAcronym("");
    var0.setCountry(var1);
    var0.setName("");
    br.com.addvisor.webservice.models.pojo.Country var10 = var0.getCountry();
    java.lang.String var11 = var0.toString();
    br.com.addvisor.webservice.models.pojo.Service var12 = new br.com.addvisor.webservice.models.pojo.Service();
    br.com.addvisor.webservice.models.pojo.Address var13 = var12.getAddress();
    var12.setMedia((java.lang.Float)(-1.0f));
    boolean var16 = var0.equals((java.lang.Object)var12);
    br.com.addvisor.webservice.models.pojo.Agenda var17 = new br.com.addvisor.webservice.models.pojo.Agenda();
    var17.addContact("hi!", "");
    var17.addContact("hi!", "");
    java.util.List var24 = var17.getNumbers();
    var12.setPhones(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test116");


    br.com.addvisor.webservice.models.pojo.Agenda var0 = new br.com.addvisor.webservice.models.pojo.Agenda();
    var0.addContact("hi!", "");
    br.com.addvisor.webservice.models.pojo.Agenda var4 = new br.com.addvisor.webservice.models.pojo.Agenda();
    java.util.List var5 = var4.getNumbers();
    java.util.List var6 = var4.getNumbers();
    var0.setNumbers(var6);
    br.com.addvisor.webservice.models.pojo.Service var8 = new br.com.addvisor.webservice.models.pojo.Service();
    br.com.addvisor.webservice.models.pojo.Address var9 = var8.getAddress();
    var8.setMedia((java.lang.Float)(-1.0f));
    var8.setDescription("hi!");
    java.util.List var14 = var8.getPhones();
    var0.setNames(var14);
    br.com.addvisor.webservice.models.pojo.Service var16 = new br.com.addvisor.webservice.models.pojo.Service();
    br.com.addvisor.webservice.models.pojo.Address var17 = var16.getAddress();
    var16.setMedia((java.lang.Float)(-1.0f));
    var16.setDescription("hi!");
    java.util.List var22 = var16.getPhones();
    var0.setNames(var22);
    br.com.addvisor.webservice.models.pojo.Agenda var24 = new br.com.addvisor.webservice.models.pojo.Agenda();
    java.util.List var25 = var24.getNumbers();
    java.util.List var26 = var24.getNumbers();
    java.util.List var27 = var24.getNumbers();
    var0.setNumbers(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test117");


    br.com.addvisor.webservice.models.pojo.Country var0 = new br.com.addvisor.webservice.models.pojo.Country();
    var0.setName("");
    java.lang.String var3 = var0.getAcronym();
    br.com.addvisor.webservice.models.pojo.State var4 = new br.com.addvisor.webservice.models.pojo.State();
    java.lang.String var5 = var4.getName();
    br.com.addvisor.webservice.models.pojo.Country var6 = var4.getCountry();
    br.com.addvisor.webservice.models.pojo.Country var7 = new br.com.addvisor.webservice.models.pojo.Country();
    var4.setCountry(var7);
    var7.setId((java.lang.Long)(-1L));
    boolean var11 = var0.equals((java.lang.Object)var7);
    var0.setAcronym("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test118");


    br.com.addvisor.webservice.models.pojo.Evaluate var2 = new br.com.addvisor.webservice.models.pojo.Evaluate((java.lang.Float)100.0f, "");
    var2.setNote((java.lang.Float)10.0f);
    java.lang.String var5 = var2.getComment();
    java.lang.Long var6 = var2.getId();
    java.lang.Long var7 = var2.getId();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test119");


    br.com.addvisor.webservice.models.pojo.State var0 = new br.com.addvisor.webservice.models.pojo.State();
    java.lang.String var1 = var0.getName();
    br.com.addvisor.webservice.models.pojo.Country var2 = var0.getCountry();
    br.com.addvisor.webservice.models.pojo.Evaluate var5 = new br.com.addvisor.webservice.models.pojo.Evaluate((java.lang.Float)100.0f, "");
    br.com.addvisor.webservice.models.pojo.Service var6 = var5.getService();
    var5.setComment("hi!");
    var5.setComment("hi!");
    br.com.addvisor.webservice.models.pojo.City var13 = new br.com.addvisor.webservice.models.pojo.City();
    br.com.addvisor.webservice.models.pojo.User var15 = new br.com.addvisor.webservice.models.pojo.User("hi!", "hi!", var13, "");
    var5.setUser(var15);
    br.com.addvisor.webservice.models.pojo.Service var17 = var5.getService();
    br.com.addvisor.webservice.models.pojo.User var19 = new br.com.addvisor.webservice.models.pojo.User((java.lang.Long)0L);
    var5.setUser(var19);
    boolean var21 = var0.equals((java.lang.Object)var19);
    var19.setEmail("Service [id=0, address=null, phones=[], name=null, description=null, category=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test120");


    br.com.addvisor.webservice.models.pojo.City var2 = new br.com.addvisor.webservice.models.pojo.City();
    br.com.addvisor.webservice.models.pojo.User var4 = new br.com.addvisor.webservice.models.pojo.User("hi!", "hi!", var2, "");
    br.com.addvisor.webservice.models.pojo.City var5 = var4.getCity();
    java.lang.String var6 = var4.getName();
    java.lang.Long var7 = var4.getId();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test121");


    br.com.addvisor.webservice.models.pojo.State var0 = new br.com.addvisor.webservice.models.pojo.State();
    java.lang.String var1 = var0.getName();
    br.com.addvisor.webservice.models.pojo.Country var2 = var0.getCountry();
    br.com.addvisor.webservice.models.pojo.Country var3 = new br.com.addvisor.webservice.models.pojo.Country();
    var0.setCountry(var3);
    java.lang.String var5 = var0.getName();
    br.com.addvisor.webservice.models.pojo.Country var6 = var0.getCountry();
    java.lang.String var7 = var0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test122");


    br.com.addvisor.webservice.models.pojo.Service var0 = new br.com.addvisor.webservice.models.pojo.Service();
    br.com.addvisor.webservice.models.pojo.Address var1 = var0.getAddress();
    java.lang.String var2 = var0.getTags();
    java.lang.String var3 = var0.getDescription();
    var0.setId((java.lang.Long)10L);
    var0.setMedia((java.lang.Float)10.0f);
    var0.setName("Service [id=0, address=null, phones=[], name=null, description=null, category=null]");
    br.com.addvisor.webservice.models.pojo.Service var10 = new br.com.addvisor.webservice.models.pojo.Service();
    br.com.addvisor.webservice.models.pojo.Address var11 = var10.getAddress();
    java.lang.String var12 = var10.getDescription();
    br.com.addvisor.webservice.models.pojo.User var14 = new br.com.addvisor.webservice.models.pojo.User((java.lang.Long)0L);
    var14.setPhone("hi!");
    var14.setName("");
    var14.setPhone("");
    boolean var21 = var10.equals((java.lang.Object)var14);
    java.lang.String var22 = var14.getName();
    var0.setUser(var14);
    var0.setName("Service [id=null, address=null, phones=[], name=null, description=null, category=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + ""+ "'", var22.equals(""));

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test123");


    br.com.addvisor.webservice.models.pojo.State var0 = new br.com.addvisor.webservice.models.pojo.State();
    br.com.addvisor.webservice.models.pojo.Country var1 = new br.com.addvisor.webservice.models.pojo.Country();
    var1.setName("");
    java.lang.String var4 = var1.getAcronym();
    var1.setAcronym("");
    var0.setCountry(var1);
    var0.setName("");
    br.com.addvisor.webservice.models.pojo.Country var10 = var0.getCountry();
    java.lang.String var11 = var0.toString();
    var0.setUf("User [id=0, name=null, email=null, password=null, city=null, phone=]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test124");


    br.com.addvisor.webservice.models.pojo.Agenda var0 = new br.com.addvisor.webservice.models.pojo.Agenda();
    var0.addContact("hi!", "");
    br.com.addvisor.webservice.models.pojo.Agenda var4 = new br.com.addvisor.webservice.models.pojo.Agenda();
    java.util.List var5 = var4.getNumbers();
    java.util.List var6 = var4.getNumbers();
    var0.setNumbers(var6);
    br.com.addvisor.webservice.models.pojo.Service var8 = new br.com.addvisor.webservice.models.pojo.Service();
    br.com.addvisor.webservice.models.pojo.Address var9 = var8.getAddress();
    var8.setMedia((java.lang.Float)(-1.0f));
    var8.setDescription("hi!");
    java.util.List var14 = var8.getPhones();
    var0.setNames(var14);
    br.com.addvisor.webservice.models.pojo.Service var16 = new br.com.addvisor.webservice.models.pojo.Service();
    br.com.addvisor.webservice.models.pojo.Address var17 = var16.getAddress();
    var16.setMedia((java.lang.Float)(-1.0f));
    var16.setDescription("hi!");
    java.util.List var22 = var16.getPhones();
    var0.setNames(var22);
    br.com.addvisor.webservice.models.pojo.Agenda var24 = new br.com.addvisor.webservice.models.pojo.Agenda();
    java.util.List var25 = var24.getNumbers();
    java.util.List var26 = var24.getNumbers();
    java.util.List var27 = var24.getNumbers();
    java.util.Map var28 = var24.getContacts();
    java.util.Map var29 = var24.getContacts();
    var0.setContacts(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test125");


    br.com.addvisor.webservice.models.pojo.Address var0 = new br.com.addvisor.webservice.models.pojo.Address();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.getComplement();
    var0.setComplement("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test126");


    br.com.addvisor.webservice.models.pojo.Service var0 = new br.com.addvisor.webservice.models.pojo.Service();
    br.com.addvisor.webservice.models.pojo.Address var1 = var0.getAddress();
    java.lang.String var2 = var0.getTags();
    java.lang.String var3 = var0.getDescription();
    var0.setId((java.lang.Long)10L);
    br.com.addvisor.webservice.models.pojo.Service var6 = new br.com.addvisor.webservice.models.pojo.Service();
    br.com.addvisor.webservice.models.pojo.Address var7 = var6.getAddress();
    var6.setId((java.lang.Long)0L);
    int var10 = var0.compareTo(var6);
    java.lang.String var11 = var6.getTags();
    br.com.addvisor.webservice.models.pojo.Address var12 = new br.com.addvisor.webservice.models.pojo.Address();
    var6.setAddress(var12);
    br.com.addvisor.webservice.models.pojo.City var14 = var12.getCity();
    java.lang.String var15 = var12.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test127");


    br.com.addvisor.webservice.models.pojo.Service var0 = new br.com.addvisor.webservice.models.pojo.Service();
    br.com.addvisor.webservice.models.pojo.Address var1 = var0.getAddress();
    java.lang.String var2 = var0.getTags();
    java.lang.String var3 = var0.getDescription();
    var0.setId((java.lang.Long)10L);
    br.com.addvisor.webservice.models.pojo.Service var6 = new br.com.addvisor.webservice.models.pojo.Service();
    br.com.addvisor.webservice.models.pojo.Address var7 = var6.getAddress();
    var6.setId((java.lang.Long)0L);
    int var10 = var0.compareTo(var6);
    java.lang.String var11 = var6.getTags();
    br.com.addvisor.webservice.models.pojo.Address var12 = new br.com.addvisor.webservice.models.pojo.Address();
    var6.setAddress(var12);
    br.com.addvisor.webservice.models.pojo.City var14 = var12.getCity();
    br.com.addvisor.webservice.models.pojo.User var16 = new br.com.addvisor.webservice.models.pojo.User((java.lang.Long)0L);
    br.com.addvisor.webservice.models.pojo.City var17 = new br.com.addvisor.webservice.models.pojo.City();
    var16.setCity(var17);
    java.lang.String var19 = var17.getName();
    var12.setCity(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test128");


    br.com.addvisor.webservice.models.pojo.State var0 = new br.com.addvisor.webservice.models.pojo.State();
    br.com.addvisor.webservice.models.pojo.Country var1 = new br.com.addvisor.webservice.models.pojo.Country();
    var1.setName("");
    java.lang.String var4 = var1.getAcronym();
    var1.setAcronym("");
    var0.setCountry(var1);
    var0.setName("");
    br.com.addvisor.webservice.models.pojo.Country var10 = var0.getCountry();
    java.lang.String var11 = var0.toString();
    br.com.addvisor.webservice.models.pojo.Service var12 = new br.com.addvisor.webservice.models.pojo.Service();
    br.com.addvisor.webservice.models.pojo.Address var13 = var12.getAddress();
    var12.setMedia((java.lang.Float)(-1.0f));
    boolean var16 = var0.equals((java.lang.Object)var12);
    var0.setId((java.lang.Long)1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test129");


    br.com.addvisor.webservice.models.pojo.User var1 = new br.com.addvisor.webservice.models.pojo.User((java.lang.Long)0L);
    br.com.addvisor.webservice.models.pojo.City var2 = new br.com.addvisor.webservice.models.pojo.City();
    var1.setCity(var2);
    br.com.addvisor.webservice.models.pojo.User var5 = new br.com.addvisor.webservice.models.pojo.User((java.lang.Long)0L);
    br.com.addvisor.webservice.models.pojo.City var6 = new br.com.addvisor.webservice.models.pojo.City();
    var5.setCity(var6);
    boolean var8 = var1.equals((java.lang.Object)var5);
    br.com.addvisor.webservice.models.pojo.City var9 = var1.getCity();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test130");


    br.com.addvisor.webservice.models.pojo.State var0 = new br.com.addvisor.webservice.models.pojo.State();
    java.lang.String var1 = var0.getName();
    br.com.addvisor.webservice.models.pojo.Country var2 = var0.getCountry();
    br.com.addvisor.webservice.models.pojo.Evaluate var5 = new br.com.addvisor.webservice.models.pojo.Evaluate((java.lang.Float)100.0f, "");
    br.com.addvisor.webservice.models.pojo.Service var6 = var5.getService();
    var5.setComment("hi!");
    var5.setComment("hi!");
    br.com.addvisor.webservice.models.pojo.City var13 = new br.com.addvisor.webservice.models.pojo.City();
    br.com.addvisor.webservice.models.pojo.User var15 = new br.com.addvisor.webservice.models.pojo.User("hi!", "hi!", var13, "");
    var5.setUser(var15);
    br.com.addvisor.webservice.models.pojo.Service var17 = var5.getService();
    br.com.addvisor.webservice.models.pojo.User var19 = new br.com.addvisor.webservice.models.pojo.User((java.lang.Long)0L);
    var5.setUser(var19);
    boolean var21 = var0.equals((java.lang.Object)var19);
    var19.setName("Service [id=0, address=null, phones=[], name=null, description=null, category=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test131");


    br.com.addvisor.webservice.models.pojo.Address var0 = new br.com.addvisor.webservice.models.pojo.Address();
    boolean var2 = var0.equals((java.lang.Object)(short)1);
    java.lang.String var3 = var0.toString();
    java.lang.String var4 = var0.getComplement();
    java.lang.String var5 = var0.toString();
    var0.setComplement("Evaluate [id=10, user=null, service=null, note=100.0, comment=]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test132");


    br.com.addvisor.webservice.models.pojo.Service var0 = new br.com.addvisor.webservice.models.pojo.Service();
    br.com.addvisor.webservice.models.pojo.Address var1 = var0.getAddress();
    var0.setMedia((java.lang.Float)(-1.0f));
    var0.setDescription("hi!");
    var0.setTags("Service [id=0, address=null, phones=[], name=null, description=null, category=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test133");


    br.com.addvisor.webservice.models.pojo.City var4 = new br.com.addvisor.webservice.models.pojo.City();
    br.com.addvisor.webservice.models.pojo.User var6 = new br.com.addvisor.webservice.models.pojo.User("hi!", "hi!", var4, "");
    java.lang.String var7 = var4.getName();
    br.com.addvisor.webservice.models.pojo.User var9 = new br.com.addvisor.webservice.models.pojo.User("hi!", "hi!", var4, "");
    var9.setName("hi!");
    var9.setName("hi!");
    java.lang.String var14 = var9.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test134");


    br.com.addvisor.webservice.models.pojo.Service var0 = new br.com.addvisor.webservice.models.pojo.Service();
    br.com.addvisor.webservice.models.pojo.Address var1 = var0.getAddress();
    var0.setId((java.lang.Long)0L);
    var0.addPhone("");
    java.lang.Long var6 = var0.getId();
    br.com.addvisor.webservice.models.pojo.User var8 = new br.com.addvisor.webservice.models.pojo.User((java.lang.Long)0L);
    br.com.addvisor.webservice.models.pojo.City var9 = new br.com.addvisor.webservice.models.pojo.City();
    var8.setCity(var9);
    br.com.addvisor.webservice.models.pojo.User var12 = new br.com.addvisor.webservice.models.pojo.User((java.lang.Long)0L);
    br.com.addvisor.webservice.models.pojo.City var13 = new br.com.addvisor.webservice.models.pojo.City();
    var12.setCity(var13);
    boolean var15 = var8.equals((java.lang.Object)var12);
    var12.setPassword("Service [id=0, address=null, phones=[], name=null, description=null, category=null]");
    var0.setUser(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + 0L+ "'", var6.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test135");


    br.com.addvisor.webservice.models.pojo.State var0 = new br.com.addvisor.webservice.models.pojo.State();
    br.com.addvisor.webservice.models.pojo.Country var1 = new br.com.addvisor.webservice.models.pojo.Country();
    var1.setName("");
    java.lang.String var4 = var1.getAcronym();
    var1.setAcronym("");
    var0.setCountry(var1);
    var0.setName("");
    br.com.addvisor.webservice.models.pojo.Country var10 = var0.getCountry();
    java.lang.String var11 = var10.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test136");


    br.com.addvisor.webservice.models.pojo.City var2 = new br.com.addvisor.webservice.models.pojo.City();
    br.com.addvisor.webservice.models.pojo.User var4 = new br.com.addvisor.webservice.models.pojo.User("hi!", "hi!", var2, "");
    var4.setName("");
    java.lang.String var7 = var4.getName();
    java.lang.String var8 = var4.getName();
    var4.setName("Service [id=null, address=null, phones=[], name=null, description=null, category=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test137");


    br.com.addvisor.webservice.models.pojo.Service var0 = new br.com.addvisor.webservice.models.pojo.Service();
    br.com.addvisor.webservice.models.pojo.Address var1 = var0.getAddress();
    java.lang.String var2 = var0.getTags();
    java.lang.String var3 = var0.getDescription();
    var0.setId((java.lang.Long)10L);
    br.com.addvisor.webservice.models.pojo.Service var6 = new br.com.addvisor.webservice.models.pojo.Service();
    br.com.addvisor.webservice.models.pojo.Address var7 = var6.getAddress();
    var6.setId((java.lang.Long)0L);
    int var10 = var0.compareTo(var6);
    java.lang.String var11 = var6.getTags();
    br.com.addvisor.webservice.models.pojo.Address var12 = new br.com.addvisor.webservice.models.pojo.Address();
    var6.setAddress(var12);
    br.com.addvisor.webservice.models.pojo.City var14 = var12.getCity();
    br.com.addvisor.webservice.models.pojo.City var15 = var12.getCity();
    java.lang.String var16 = var12.getLocation();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test138");


    br.com.addvisor.webservice.models.pojo.Evaluate var2 = new br.com.addvisor.webservice.models.pojo.Evaluate((java.lang.Float)100.0f, "");
    br.com.addvisor.webservice.models.pojo.Service var3 = var2.getService();
    var2.setId((java.lang.Long)10L);
    br.com.addvisor.webservice.models.pojo.User var6 = var2.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test139");


    br.com.addvisor.webservice.models.pojo.Address var0 = new br.com.addvisor.webservice.models.pojo.Address();
    boolean var2 = var0.equals((java.lang.Object)(short)1);
    java.lang.String var3 = var0.toString();
    java.lang.String var4 = var0.getComplement();
    java.lang.String var5 = var0.toString();
    var0.setComplement("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test140");


    br.com.addvisor.webservice.models.pojo.Service var0 = new br.com.addvisor.webservice.models.pojo.Service();
    br.com.addvisor.webservice.models.pojo.Address var1 = var0.getAddress();
    br.com.addvisor.webservice.models.pojo.Address var2 = var0.getAddress();
    java.lang.String var3 = var0.toString();
    var0.setDescription("User [id=0, name=null, email=null, password=null, city=null, phone=hi!]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Service [id=null, address=null, phones=[], name=null, description=null, category=null]"+ "'", var3.equals("Service [id=null, address=null, phones=[], name=null, description=null, category=null]"));

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test141");


    br.com.addvisor.webservice.models.pojo.Evaluate var2 = new br.com.addvisor.webservice.models.pojo.Evaluate((java.lang.Float)100.0f, "");
    var2.setNote((java.lang.Float)10.0f);
    java.lang.String var5 = var2.getComment();
    br.com.addvisor.webservice.models.pojo.Service var6 = new br.com.addvisor.webservice.models.pojo.Service();
    br.com.addvisor.webservice.models.pojo.Address var7 = var6.getAddress();
    br.com.addvisor.webservice.models.pojo.Address var8 = var6.getAddress();
    var2.setService(var6);
    br.com.addvisor.webservice.models.pojo.User var10 = var6.getUser();
    br.com.addvisor.webservice.models.pojo.Service var11 = new br.com.addvisor.webservice.models.pojo.Service();
    br.com.addvisor.webservice.models.pojo.Address var12 = var11.getAddress();
    java.lang.String var13 = var11.getTags();
    java.lang.String var14 = var11.getDescription();
    java.util.List var15 = var11.getPhones();
    var6.setPhones(var15);
    java.lang.Long var17 = var6.getId();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test142");


    br.com.addvisor.webservice.models.pojo.Service var0 = new br.com.addvisor.webservice.models.pojo.Service();
    br.com.addvisor.webservice.models.pojo.Address var1 = var0.getAddress();
    java.lang.String var2 = var0.getTags();
    java.lang.String var3 = var0.getName();
    var0.setName("hi!");
    var0.addPhone("");
    java.lang.Float var8 = var0.getMedia();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test143");


    br.com.addvisor.webservice.models.pojo.State var0 = new br.com.addvisor.webservice.models.pojo.State();
    br.com.addvisor.webservice.models.pojo.Country var1 = new br.com.addvisor.webservice.models.pojo.Country();
    var1.setName("");
    java.lang.String var4 = var1.getAcronym();
    var1.setAcronym("");
    var0.setCountry(var1);
    java.lang.String var8 = var0.getUf();
    var0.setId((java.lang.Long)1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test144");


    br.com.addvisor.webservice.models.pojo.Service var0 = new br.com.addvisor.webservice.models.pojo.Service();
    br.com.addvisor.webservice.models.pojo.Address var1 = var0.getAddress();
    var0.setMedia((java.lang.Float)(-1.0f));
    var0.setDescription("hi!");
    boolean var7 = var0.equals((java.lang.Object)false);
    var0.setMedia((java.lang.Float)100.0f);
    br.com.addvisor.webservice.models.pojo.Service var10 = new br.com.addvisor.webservice.models.pojo.Service();
    br.com.addvisor.webservice.models.pojo.Address var11 = var10.getAddress();
    var10.setId((java.lang.Long)0L);
    var10.addPhone("");
    java.lang.Long var16 = var10.getId();
    br.com.addvisor.webservice.models.pojo.Address var17 = new br.com.addvisor.webservice.models.pojo.Address();
    var17.setComplement("");
    var10.setAddress(var17);
    var0.setAddress(var17);
    br.com.addvisor.webservice.models.pojo.User var23 = new br.com.addvisor.webservice.models.pojo.User((java.lang.Long)0L);
    br.com.addvisor.webservice.models.pojo.City var24 = new br.com.addvisor.webservice.models.pojo.City();
    var23.setCity(var24);
    br.com.addvisor.webservice.models.pojo.User var27 = new br.com.addvisor.webservice.models.pojo.User((java.lang.Long)0L);
    br.com.addvisor.webservice.models.pojo.City var28 = new br.com.addvisor.webservice.models.pojo.City();
    var27.setCity(var28);
    boolean var30 = var23.equals((java.lang.Object)var27);
    java.lang.String var31 = var27.getName();
    var27.setPhone("");
    br.com.addvisor.webservice.models.pojo.User var35 = new br.com.addvisor.webservice.models.pojo.User((java.lang.Long)0L);
    br.com.addvisor.webservice.models.pojo.City var36 = new br.com.addvisor.webservice.models.pojo.City();
    var35.setCity(var36);
    br.com.addvisor.webservice.models.pojo.User var39 = new br.com.addvisor.webservice.models.pojo.User((java.lang.Long)0L);
    br.com.addvisor.webservice.models.pojo.City var40 = new br.com.addvisor.webservice.models.pojo.City();
    var39.setCity(var40);
    boolean var42 = var35.equals((java.lang.Object)var39);
    var39.setPhone("User [id=0, name=null, email=null, password=null, city=null, phone=hi!]");
    boolean var45 = var27.equals((java.lang.Object)var39);
    boolean var46 = var17.equals((java.lang.Object)var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + 0L+ "'", var16.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);

  }

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test145");


    br.com.addvisor.webservice.models.pojo.Agenda var0 = new br.com.addvisor.webservice.models.pojo.Agenda();
    var0.addContact("hi!", "");
    br.com.addvisor.webservice.models.pojo.Service var4 = new br.com.addvisor.webservice.models.pojo.Service();
    br.com.addvisor.webservice.models.pojo.Address var5 = var4.getAddress();
    br.com.addvisor.webservice.models.pojo.enums.ServiceCat var6 = var4.getCategory();
    br.com.addvisor.webservice.models.pojo.enums.ServiceCat var7 = var4.getCategory();
    java.util.List var8 = var4.getPhones();
    boolean var9 = var0.equals((java.lang.Object)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test146");


    br.com.addvisor.webservice.models.pojo.Agenda var0 = new br.com.addvisor.webservice.models.pojo.Agenda();
    java.util.Map var1 = var0.getContacts();
    java.util.List var2 = var0.getNumbers();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test147");


    br.com.addvisor.webservice.models.pojo.City var2 = new br.com.addvisor.webservice.models.pojo.City();
    br.com.addvisor.webservice.models.pojo.User var4 = new br.com.addvisor.webservice.models.pojo.User("hi!", "hi!", var2, "");
    java.lang.String var5 = var2.getName();
    var2.setName("hi!");
    var2.setId((java.lang.Long)0L);
    br.com.addvisor.webservice.models.pojo.State var10 = new br.com.addvisor.webservice.models.pojo.State();
    java.lang.String var11 = var10.getName();
    br.com.addvisor.webservice.models.pojo.Country var12 = var10.getCountry();
    br.com.addvisor.webservice.models.pojo.Country var13 = new br.com.addvisor.webservice.models.pojo.Country();
    var10.setCountry(var13);
    var10.setUf("hi!");
    var2.setState(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test148");


    br.com.addvisor.webservice.models.pojo.Service var0 = new br.com.addvisor.webservice.models.pojo.Service();
    br.com.addvisor.webservice.models.pojo.Address var1 = var0.getAddress();
    br.com.addvisor.webservice.models.pojo.Agenda var2 = new br.com.addvisor.webservice.models.pojo.Agenda();
    var2.addContact("hi!", "");
    br.com.addvisor.webservice.models.pojo.Agenda var6 = new br.com.addvisor.webservice.models.pojo.Agenda();
    java.util.List var7 = var6.getNumbers();
    java.util.List var8 = var6.getNumbers();
    var2.setNumbers(var8);
    br.com.addvisor.webservice.models.pojo.Service var10 = new br.com.addvisor.webservice.models.pojo.Service();
    br.com.addvisor.webservice.models.pojo.Address var11 = var10.getAddress();
    var10.setMedia((java.lang.Float)(-1.0f));
    var10.setDescription("hi!");
    java.util.List var16 = var10.getPhones();
    var2.setNames(var16);
    br.com.addvisor.webservice.models.pojo.Service var18 = new br.com.addvisor.webservice.models.pojo.Service();
    br.com.addvisor.webservice.models.pojo.Address var19 = var18.getAddress();
    var18.setMedia((java.lang.Float)(-1.0f));
    var18.setDescription("hi!");
    java.util.List var24 = var18.getPhones();
    var2.setNames(var24);
    java.util.List var26 = var2.getNames();
    var0.setPhones(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test149");


    br.com.addvisor.webservice.models.pojo.Service var0 = new br.com.addvisor.webservice.models.pojo.Service();
    br.com.addvisor.webservice.models.pojo.Address var1 = var0.getAddress();
    java.lang.String var2 = var0.getTags();
    java.lang.String var3 = var0.getDescription();
    var0.setId((java.lang.Long)10L);
    br.com.addvisor.webservice.models.pojo.Service var6 = new br.com.addvisor.webservice.models.pojo.Service();
    br.com.addvisor.webservice.models.pojo.Address var7 = var6.getAddress();
    var6.setId((java.lang.Long)0L);
    int var10 = var0.compareTo(var6);
    java.lang.String var11 = var6.getDescription();
    br.com.addvisor.webservice.models.pojo.Service var12 = new br.com.addvisor.webservice.models.pojo.Service();
    br.com.addvisor.webservice.models.pojo.Address var13 = var12.getAddress();
    java.lang.String var14 = var12.getDescription();
    br.com.addvisor.webservice.models.pojo.User var16 = new br.com.addvisor.webservice.models.pojo.User((java.lang.Long)0L);
    var16.setPhone("hi!");
    var16.setName("");
    var16.setPhone("");
    boolean var23 = var12.equals((java.lang.Object)var16);
    br.com.addvisor.webservice.models.pojo.City var24 = var16.getCity();
    var6.setUser(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test150");


    br.com.addvisor.webservice.models.pojo.Evaluate var2 = new br.com.addvisor.webservice.models.pojo.Evaluate((java.lang.Float)100.0f, "");
    br.com.addvisor.webservice.models.pojo.Service var3 = var2.getService();
    var2.setComment("hi!");
    var2.setComment("hi!");
    br.com.addvisor.webservice.models.pojo.City var10 = new br.com.addvisor.webservice.models.pojo.City();
    br.com.addvisor.webservice.models.pojo.User var12 = new br.com.addvisor.webservice.models.pojo.User("hi!", "hi!", var10, "");
    var2.setUser(var12);
    br.com.addvisor.webservice.models.pojo.Service var14 = var2.getService();
    java.lang.String var15 = var2.getComment();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));

  }

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test151");


    br.com.addvisor.webservice.models.pojo.Service var0 = new br.com.addvisor.webservice.models.pojo.Service();
    br.com.addvisor.webservice.models.pojo.Address var1 = var0.getAddress();
    br.com.addvisor.webservice.models.pojo.enums.ServiceCat var2 = var0.getCategory();
    br.com.addvisor.webservice.models.pojo.enums.ServiceCat var3 = var0.getCategory();
    java.util.List var4 = var0.getPhones();
    java.lang.String var5 = var0.getDescription();
    var0.setName("User [id=0, name=null, email=null, password=null, city=null, phone=]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test152");


    br.com.addvisor.webservice.models.pojo.State var0 = new br.com.addvisor.webservice.models.pojo.State();
    br.com.addvisor.webservice.models.pojo.Country var1 = new br.com.addvisor.webservice.models.pojo.Country();
    var1.setName("");
    java.lang.String var4 = var1.getAcronym();
    var1.setAcronym("");
    var0.setCountry(var1);
    var0.setName("");
    br.com.addvisor.webservice.models.pojo.Country var10 = var0.getCountry();
    java.lang.String var11 = var0.toString();
    br.com.addvisor.webservice.models.pojo.Service var12 = new br.com.addvisor.webservice.models.pojo.Service();
    br.com.addvisor.webservice.models.pojo.Address var13 = var12.getAddress();
    var12.setMedia((java.lang.Float)(-1.0f));
    boolean var16 = var0.equals((java.lang.Object)var12);
    var12.setId((java.lang.Long)100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test153");


    br.com.addvisor.webservice.models.pojo.Service var0 = new br.com.addvisor.webservice.models.pojo.Service();
    br.com.addvisor.webservice.models.pojo.Address var1 = var0.getAddress();
    var0.setMedia((java.lang.Float)(-1.0f));
    var0.setMedia((java.lang.Float)(-1.0f));
    br.com.addvisor.webservice.models.pojo.enums.ServiceCat var6 = var0.getCategory();
    br.com.addvisor.webservice.models.pojo.Service var7 = new br.com.addvisor.webservice.models.pojo.Service();
    br.com.addvisor.webservice.models.pojo.Address var8 = var7.getAddress();
    java.lang.String var9 = var7.getTags();
    java.lang.String var10 = var7.getDescription();
    var7.setId((java.lang.Long)10L);
    br.com.addvisor.webservice.models.pojo.Service var13 = new br.com.addvisor.webservice.models.pojo.Service();
    br.com.addvisor.webservice.models.pojo.Address var14 = var13.getAddress();
    var13.setId((java.lang.Long)0L);
    int var17 = var7.compareTo(var13);
    java.lang.String var18 = var13.getTags();
    br.com.addvisor.webservice.models.pojo.Address var19 = new br.com.addvisor.webservice.models.pojo.Address();
    var13.setAddress(var19);
    var0.setAddress(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test154");


    br.com.addvisor.webservice.models.pojo.Service var0 = new br.com.addvisor.webservice.models.pojo.Service();
    br.com.addvisor.webservice.models.pojo.Address var1 = var0.getAddress();
    var0.setMedia((java.lang.Float)(-1.0f));
    var0.setDescription("hi!");
    java.util.List var6 = var0.getPhones();
    br.com.addvisor.webservice.models.pojo.User var7 = var0.getUser();
    br.com.addvisor.webservice.models.pojo.State var8 = new br.com.addvisor.webservice.models.pojo.State();
    java.lang.String var9 = var8.getName();
    br.com.addvisor.webservice.models.pojo.Country var10 = var8.getCountry();
    br.com.addvisor.webservice.models.pojo.Evaluate var13 = new br.com.addvisor.webservice.models.pojo.Evaluate((java.lang.Float)100.0f, "");
    br.com.addvisor.webservice.models.pojo.Service var14 = var13.getService();
    var13.setComment("hi!");
    var13.setComment("hi!");
    br.com.addvisor.webservice.models.pojo.City var21 = new br.com.addvisor.webservice.models.pojo.City();
    br.com.addvisor.webservice.models.pojo.User var23 = new br.com.addvisor.webservice.models.pojo.User("hi!", "hi!", var21, "");
    var13.setUser(var23);
    br.com.addvisor.webservice.models.pojo.Service var25 = var13.getService();
    br.com.addvisor.webservice.models.pojo.User var27 = new br.com.addvisor.webservice.models.pojo.User((java.lang.Long)0L);
    var13.setUser(var27);
    boolean var29 = var8.equals((java.lang.Object)var27);
    var27.setId((java.lang.Long)0L);
    var0.setUser(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test155");


    br.com.addvisor.webservice.models.pojo.Service var0 = new br.com.addvisor.webservice.models.pojo.Service();
    br.com.addvisor.webservice.models.pojo.Address var1 = var0.getAddress();
    var0.setMedia((java.lang.Float)(-1.0f));
    var0.setDescription("hi!");
    boolean var7 = var0.equals((java.lang.Object)false);
    var0.setMedia((java.lang.Float)100.0f);
    br.com.addvisor.webservice.models.pojo.Service var10 = new br.com.addvisor.webservice.models.pojo.Service();
    br.com.addvisor.webservice.models.pojo.Address var11 = var10.getAddress();
    var10.setId((java.lang.Long)0L);
    var10.addPhone("");
    java.lang.Long var16 = var10.getId();
    br.com.addvisor.webservice.models.pojo.Address var17 = new br.com.addvisor.webservice.models.pojo.Address();
    var17.setComplement("");
    var10.setAddress(var17);
    var0.setAddress(var17);
    br.com.addvisor.webservice.models.pojo.City var24 = new br.com.addvisor.webservice.models.pojo.City();
    br.com.addvisor.webservice.models.pojo.User var26 = new br.com.addvisor.webservice.models.pojo.User("hi!", "hi!", var24, "");
    br.com.addvisor.webservice.models.pojo.City var27 = var26.getCity();
    java.lang.String var28 = var26.getName();
    br.com.addvisor.webservice.models.pojo.City var29 = var26.getCity();
    var29.setName("Service [id=null, address=null, phones=[], name=null, description=null, category=null]");
    var17.setCity(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + 0L+ "'", var16.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!"+ "'", var28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test156() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test156");


    br.com.addvisor.webservice.models.pojo.City var2 = new br.com.addvisor.webservice.models.pojo.City();
    br.com.addvisor.webservice.models.pojo.User var4 = new br.com.addvisor.webservice.models.pojo.User("hi!", "hi!", var2, "");
    java.lang.String var5 = var4.getEmail();
    br.com.addvisor.webservice.models.pojo.User var7 = new br.com.addvisor.webservice.models.pojo.User((java.lang.Long)0L);
    var7.setPhone("hi!");
    var7.setPhone("");
    boolean var12 = var4.equals((java.lang.Object)"");
    java.lang.String var13 = var4.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));

  }

  public void test157() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test157");


    br.com.addvisor.webservice.models.pojo.Evaluate var2 = new br.com.addvisor.webservice.models.pojo.Evaluate((java.lang.Float)100.0f, "");
    var2.setNote((java.lang.Float)10.0f);
    java.lang.String var5 = var2.getComment();
    java.lang.Long var6 = var2.getId();
    var2.setNote((java.lang.Float)(-1.0f));
    java.lang.String var9 = var2.getComment();
    var2.setComment("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));

  }

  public void test158() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test158");


    br.com.addvisor.webservice.models.pojo.Agenda var0 = new br.com.addvisor.webservice.models.pojo.Agenda();
    java.util.List var1 = var0.getNumbers();
    java.util.List var2 = var0.getNumbers();
    java.util.List var3 = var0.getNumbers();
    java.util.Map var4 = var0.getContacts();
    java.util.Map var5 = var0.getContacts();
    br.com.addvisor.webservice.models.pojo.Agenda var6 = new br.com.addvisor.webservice.models.pojo.Agenda();
    var6.addContact("hi!", "");
    java.util.Map var10 = var6.getContacts();
    var0.setContacts(var10);
    br.com.addvisor.webservice.models.pojo.Service var12 = new br.com.addvisor.webservice.models.pojo.Service();
    br.com.addvisor.webservice.models.pojo.Address var13 = var12.getAddress();
    java.lang.String var14 = var12.getTags();
    java.lang.String var15 = var12.getDescription();
    var12.setId((java.lang.Long)10L);
    br.com.addvisor.webservice.models.pojo.Service var18 = new br.com.addvisor.webservice.models.pojo.Service();
    br.com.addvisor.webservice.models.pojo.Address var19 = var18.getAddress();
    var18.setId((java.lang.Long)0L);
    int var22 = var12.compareTo(var18);
    java.lang.String var23 = var18.getTags();
    java.lang.String var24 = var18.toString();
    boolean var25 = var0.equals((java.lang.Object)var24);
    br.com.addvisor.webservice.models.pojo.Agenda var26 = new br.com.addvisor.webservice.models.pojo.Agenda();
    var26.addContact("hi!", "");
    java.util.Map var30 = var26.getContacts();
    java.util.Map var31 = var26.getContacts();
    java.util.Map var32 = var26.getContacts();
    var0.setContacts(var32);
    br.com.addvisor.webservice.models.pojo.Agenda var34 = new br.com.addvisor.webservice.models.pojo.Agenda();
    var34.addContact("hi!", "");
    java.util.Map var38 = var34.getContacts();
    java.util.Map var39 = var34.getContacts();
    java.util.Map var40 = var34.getContacts();
    var0.setContacts(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "Service [id=0, address=null, phones=[], name=null, description=null, category=null]"+ "'", var24.equals("Service [id=0, address=null, phones=[], name=null, description=null, category=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);

  }

}
