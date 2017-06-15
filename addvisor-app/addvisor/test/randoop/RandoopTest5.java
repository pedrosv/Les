package randoop;

import junit.framework.*;

public class RandoopTest5 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test1");


    br.com.addvisor.model.Address var0 = new br.com.addvisor.model.Address();
    java.lang.String var1 = var0.getComplement();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.getComplement();
    br.com.addvisor.model.City var8 = new br.com.addvisor.model.City();
    var8.setName("hi!");
    var8.setName("null\nnull\nnull");
    br.com.addvisor.model.Address var13 = new br.com.addvisor.model.Address();
    java.lang.String var14 = var13.getComplement();
    java.lang.String var15 = var13.toString();
    boolean var16 = var8.equals((java.lang.Object)var15);
    br.com.addvisor.model.User var17 = new br.com.addvisor.model.User("hi!", "", "hi!", "User [id=null, name=null, email=null, password=null, phone=null, city=null]", var8);
    var0.setCity(var8);
    var0.setLocation("hi!");
    var0.setComplement("Evaluate [id=0, user=null, service=Service [id=null, name=null, description=null, tags=null, media=null, address=null\nnull\nnull, category=null, phones=null], note=0.0, comment=null]");
    br.com.addvisor.model.City var25 = new br.com.addvisor.model.City();
    var25.setName("hi!");
    var25.setName("null\nnull\nnull");
    br.com.addvisor.model.Address var30 = new br.com.addvisor.model.Address();
    java.lang.String var31 = var30.getComplement();
    java.lang.String var32 = var30.toString();
    boolean var33 = var25.equals((java.lang.Object)var32);
    br.com.addvisor.model.User var34 = new br.com.addvisor.model.User();
    br.com.addvisor.model.State var35 = new br.com.addvisor.model.State();
    var35.setId((java.lang.Long)1L);
    var35.setName("null\nnull\nnull");
    var35.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var42 = var35.getUf();
    boolean var43 = var34.equals((java.lang.Object)var35);
    var25.setState(var35);
    br.com.addvisor.model.Address var45 = new br.com.addvisor.model.Address("Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]]", "", var25);
    br.com.addvisor.model.City var46 = var45.getCity();
    var0.setCity(var46);
    br.com.addvisor.model.User var48 = new br.com.addvisor.model.User();
    boolean var50 = var48.equals((java.lang.Object)(-1L));
    java.lang.String var51 = var48.toString();
    java.lang.String var52 = var48.getPassword();
    java.lang.String var53 = var48.getName();
    java.lang.String var54 = var48.getPassword();
    java.lang.String var55 = var48.getName();
    br.com.addvisor.model.Service var56 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var57 = new br.com.addvisor.model.User();
    boolean var59 = var57.equals((java.lang.Object)(-1L));
    java.lang.String var60 = var57.toString();
    java.lang.String var61 = var57.getPassword();
    var56.setUser(var57);
    br.com.addvisor.model.Address var63 = var56.getAddress();
    java.lang.String var64 = var56.getName();
    br.com.addvisor.model.Address var65 = var56.getAddress();
    br.com.addvisor.model.User var66 = new br.com.addvisor.model.User();
    boolean var68 = var66.equals((java.lang.Object)(-1L));
    java.lang.String var69 = var66.toString();
    br.com.addvisor.model.Evaluate var70 = new br.com.addvisor.model.Evaluate();
    var70.setId((java.lang.Long)10L);
    var70.setId((java.lang.Long)0L);
    br.com.addvisor.model.User var75 = var70.getUser();
    boolean var76 = var66.equals((java.lang.Object)var70);
    java.lang.String var77 = var66.getPassword();
    var66.setId((java.lang.Long)(-1L));
    java.lang.String var80 = var66.getPhone();
    var56.setUser(var66);
    br.com.addvisor.model.Evaluate var84 = new br.com.addvisor.model.Evaluate(var48, var56, (java.lang.Float)10.0f, "User [id=null, name=null, email=null, password=null, phone=null, city=null] - null");
    boolean var85 = var0.equals((java.lang.Object)var56);
    java.lang.String var86 = var0.getLocation();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "null\nnull\nnull"+ "'", var2.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "null\nnull\nnull"+ "'", var15.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "null\nnull\nnull"+ "'", var32.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var51.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var60.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var69 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var69.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var86 + "' != '" + "hi!"+ "'", var86.equals("hi!"));

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test2");


    br.com.addvisor.model.Address var0 = new br.com.addvisor.model.Address();
    java.lang.String var1 = var0.toString();
    br.com.addvisor.model.City var2 = new br.com.addvisor.model.City();
    var2.setName("hi!");
    var2.setName("null\nnull\nnull");
    var0.setCity(var2);
    var0.setLocation("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.Long var10 = var0.getId();
    java.lang.Long var11 = var0.getId();
    java.lang.String var12 = var0.getComplement();
    var0.setComplement("Country [id=null, name=null, acronym=Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "null\nnull\nnull"+ "'", var1.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test3");


    br.com.addvisor.model.City var0 = new br.com.addvisor.model.City();
    var0.setName("hi!");
    var0.setName("Service [id=1, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]");
    br.com.addvisor.model.Address var5 = new br.com.addvisor.model.Address();
    java.lang.String var6 = var5.toString();
    br.com.addvisor.model.City var7 = new br.com.addvisor.model.City();
    var7.setName("hi!");
    var7.setName("null\nnull\nnull");
    var5.setCity(var7);
    java.lang.String var13 = var7.getName();
    br.com.addvisor.model.User var16 = new br.com.addvisor.model.User("Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]]", "null - null\nnull\nnull");
    br.com.addvisor.model.State var17 = new br.com.addvisor.model.State();
    var17.setId((java.lang.Long)1L);
    var17.setName("null\nnull\nnull");
    var17.setUf("Country [id=null, name=null, acronym=null]");
    var17.setName("null - null");
    boolean var26 = var16.equals((java.lang.Object)var17);
    java.lang.String var27 = var17.toString();
    var7.setState(var17);
    var0.setState(var17);
    java.lang.String var30 = var0.getName();
    br.com.addvisor.model.Address var31 = new br.com.addvisor.model.Address();
    java.lang.String var32 = var31.getComplement();
    java.lang.String var33 = var31.toString();
    br.com.addvisor.model.City var34 = var31.getCity();
    br.com.addvisor.model.State var35 = new br.com.addvisor.model.State();
    var35.setId((java.lang.Long)1L);
    var35.setName("null\nnull\nnull");
    var35.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var42 = var35.getUf();
    boolean var43 = var31.equals((java.lang.Object)var35);
    var31.setComplement("Service [id=10, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]");
    boolean var46 = var0.equals((java.lang.Object)"Service [id=10, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "null\nnull\nnull"+ "'", var6.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "null\nnull\nnull"+ "'", var13.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "null - null - Country [id=null, name=null, acronym=null]"+ "'", var27.equals("null - null - Country [id=null, name=null, acronym=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "Service [id=1, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]"+ "'", var30.equals("Service [id=1, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "null\nnull\nnull"+ "'", var33.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test4");


    br.com.addvisor.model.Service var0 = new br.com.addvisor.model.Service();
    java.lang.Float var1 = var0.getMedia();
    var0.setName("hi!");
    java.lang.String var4 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Service [id=null, name=hi!, description=null, tags=null, media=null, address=null, category=null, phones=null]"+ "'", var4.equals("Service [id=null, name=hi!, description=null, tags=null, media=null, address=null, category=null, phones=null]"));

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test5");


    br.com.addvisor.model.Service var0 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var1 = new br.com.addvisor.model.User();
    boolean var3 = var1.equals((java.lang.Object)(-1L));
    java.lang.String var4 = var1.toString();
    java.lang.String var5 = var1.getPassword();
    var0.setUser(var1);
    java.lang.Long var7 = var1.getId();
    var1.setPhone("null - User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    var1.setPhone("Evaluate [id=1, user=User [id=null, name=null, email=null, password=4733c1e4c93840f406b626b1699a3659, phone=null\nnull\nnull, city=null], service=Service [id=null, name=null, description=null, tags=null, media=1.0, address=null, category=null, phones=null], note=100.0, comment=hi!]");
    java.lang.String var12 = var1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var4.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test6");


    br.com.addvisor.model.Evaluate var0 = new br.com.addvisor.model.Evaluate();
    br.com.addvisor.model.Service var1 = var0.getService();
    java.lang.Long var2 = var0.getId();
    java.lang.Long var3 = var0.getId();
    br.com.addvisor.model.Evaluate var4 = new br.com.addvisor.model.Evaluate();
    var4.setId((java.lang.Long)10L);
    var4.setId((java.lang.Long)0L);
    br.com.addvisor.model.Service var9 = var4.getService();
    br.com.addvisor.model.User var10 = new br.com.addvisor.model.User();
    boolean var12 = var10.equals((java.lang.Object)(-1L));
    java.lang.String var13 = var10.toString();
    java.lang.String var14 = var10.getPassword();
    java.lang.String var15 = var10.getPhone();
    var4.setUser(var10);
    br.com.addvisor.model.Service var17 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var18 = new br.com.addvisor.model.User();
    boolean var20 = var18.equals((java.lang.Object)(-1L));
    java.lang.String var21 = var18.toString();
    java.lang.String var22 = var18.getPassword();
    var17.setUser(var18);
    br.com.addvisor.model.Address var24 = var17.getAddress();
    br.com.addvisor.model.Address var25 = new br.com.addvisor.model.Address();
    java.lang.String var26 = var25.getComplement();
    java.lang.String var27 = var25.toString();
    br.com.addvisor.model.City var28 = var25.getCity();
    br.com.addvisor.model.State var29 = new br.com.addvisor.model.State();
    var29.setId((java.lang.Long)1L);
    var29.setName("null\nnull\nnull");
    var29.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var36 = var29.getUf();
    boolean var37 = var25.equals((java.lang.Object)var29);
    var17.setAddress(var25);
    var17.setTags("Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]]");
    java.lang.String var41 = var17.getDescription();
    var4.setService(var17);
    java.lang.Long var43 = var4.getId();
    br.com.addvisor.model.User var44 = new br.com.addvisor.model.User();
    br.com.addvisor.model.State var45 = new br.com.addvisor.model.State();
    var45.setId((java.lang.Long)1L);
    var45.setName("null\nnull\nnull");
    var45.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var52 = var45.getUf();
    boolean var53 = var44.equals((java.lang.Object)var45);
    var44.setId((java.lang.Long)0L);
    br.com.addvisor.model.Service var56 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var57 = new br.com.addvisor.model.User();
    boolean var59 = var57.equals((java.lang.Object)(-1L));
    java.lang.String var60 = var57.toString();
    java.lang.String var61 = var57.getPassword();
    var56.setUser(var57);
    br.com.addvisor.model.Address var63 = var56.getAddress();
    java.lang.String var64 = var56.getName();
    var56.setName("Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]]");
    java.lang.String var67 = var56.getName();
    br.com.addvisor.model.Evaluate var70 = new br.com.addvisor.model.Evaluate(var44, var56, (java.lang.Float)(-1.0f), "Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]]");
    br.com.addvisor.model.enums.ServiceCat var71 = var56.getCategory();
    var4.setService(var56);
    br.com.addvisor.model.User var73 = var56.getUser();
    br.com.addvisor.model.State var74 = new br.com.addvisor.model.State();
    boolean var76 = var74.equals((java.lang.Object)(byte)100);
    var74.setUf("null\nnull\nnull");
    br.com.addvisor.model.State var79 = new br.com.addvisor.model.State();
    int var80 = var74.compareTo(var79);
    var79.setName("");
    br.com.addvisor.model.Country var83 = new br.com.addvisor.model.Country();
    java.lang.Integer var84 = var83.getId();
    var79.setCountry(var83);
    br.com.addvisor.model.Country var86 = new br.com.addvisor.model.Country();
    var79.setCountry(var86);
    boolean var88 = var73.equals((java.lang.Object)var86);
    boolean var89 = var0.equals((java.lang.Object)var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var13.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var21.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "null\nnull\nnull"+ "'", var27.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + 0L+ "'", var43.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var60.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var67 + "' != '" + "Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]]"+ "'", var67.equals("Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == false);

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test7");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.addvisor.model.enums.PriceCat var1 = br.com.addvisor.model.enums.PriceCat.getPrice("Service [id=-1, name=null, description=Service [id=null, name=null, description=null, tags=null, media=100.0, address=null, category=null, phones=null], tags=null, media=null, address=null\nnull\nnull, category=null, phones=null]");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test8");


    br.com.addvisor.model.User var4 = new br.com.addvisor.model.User();
    boolean var6 = var4.equals((java.lang.Object)(-1L));
    boolean var8 = var4.equals((java.lang.Object)100.0d);
    var4.setEmail("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    br.com.addvisor.model.City var15 = new br.com.addvisor.model.City();
    var15.setName("hi!");
    var15.setName("null\nnull\nnull");
    br.com.addvisor.model.Address var20 = new br.com.addvisor.model.Address();
    java.lang.String var21 = var20.getComplement();
    java.lang.String var22 = var20.toString();
    boolean var23 = var15.equals((java.lang.Object)var22);
    br.com.addvisor.model.User var24 = new br.com.addvisor.model.User("hi!", "", "hi!", "User [id=null, name=null, email=null, password=null, phone=null, city=null]", var15);
    br.com.addvisor.model.City var27 = new br.com.addvisor.model.City();
    var27.setName("hi!");
    var27.setName("null\nnull\nnull");
    br.com.addvisor.model.Address var32 = new br.com.addvisor.model.Address();
    java.lang.String var33 = var32.getComplement();
    java.lang.String var34 = var32.toString();
    boolean var35 = var27.equals((java.lang.Object)var34);
    br.com.addvisor.model.User var36 = new br.com.addvisor.model.User();
    br.com.addvisor.model.State var37 = new br.com.addvisor.model.State();
    var37.setId((java.lang.Long)1L);
    var37.setName("null\nnull\nnull");
    var37.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var44 = var37.getUf();
    boolean var45 = var36.equals((java.lang.Object)var37);
    var27.setState(var37);
    br.com.addvisor.model.Address var47 = new br.com.addvisor.model.Address("Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]]", "", var27);
    int var48 = var15.compareTo(var27);
    var4.setCity(var27);
    var27.setName("Evaluate [id=null, user=User [id=null, name=null, email=null, password=null, phone=null, city=null], service=Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null], note=0.0, comment=User [id=null, name=null, email=User [id=null, name=null, email=null, password=null, phone=null, city=null], password=null, phone=null, city=null]]");
    var27.setName("User [id=null, name=Evaluate [id=0, user=User [id=-1, name=User [id=null, name=null, email=User [id=null, name=null, email=null, password=null, phone=null, city=null], password=null, phone=null, city=null], email=null, password=21c96d96756cfeed7f71110d9cb1788b, phone=null\nnull\nnull, city=null], service=null, note=null, comment=null], email=Evaluate [id=null, user=null, service=null, note=10.0, comment=null], password=f3bbd10077d9cef5ced80df4e3d3fbd8, phone=Us, city=\nnull\nhi!]");
    br.com.addvisor.model.User var54 = new br.com.addvisor.model.User("Country [id=null, name=null\nnull\nnull, acronym=null]", "Evaluate [id=0, user=null, service=null, note=null, comment=null]\n\nnull", "User [id=null, name=null, email=null, password=null, phone=Evaluate [id=0, user=null, service=Service [id=null, name=null, description=null, tags=null, media=null, address=null\nnull\nnull, category=null, phones=null], note=0.0, comment=null], city=null]", "Service [id=null, name=null, description=null, tags=Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]], media=null, address=null\nnull\nnull, category=null, phones=null]", var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "null\nnull\nnull"+ "'", var22.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "null\nnull\nnull"+ "'", var34.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 0);

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test9");


    br.com.addvisor.model.Address var0 = new br.com.addvisor.model.Address();
    java.lang.String var1 = var0.getComplement();
    java.lang.String var2 = var0.toString();
    br.com.addvisor.model.City var3 = var0.getCity();
    br.com.addvisor.model.State var4 = new br.com.addvisor.model.State();
    var4.setId((java.lang.Long)1L);
    var4.setName("null\nnull\nnull");
    var4.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var11 = var4.getUf();
    boolean var12 = var0.equals((java.lang.Object)var4);
    java.lang.Long var13 = var4.getId();
    boolean var15 = var4.equals((java.lang.Object)"User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    var4.setId((java.lang.Long)(-1L));
    br.com.addvisor.model.Evaluate var18 = new br.com.addvisor.model.Evaluate();
    var18.setId((java.lang.Long)10L);
    var18.setId((java.lang.Long)0L);
    br.com.addvisor.model.Service var23 = var18.getService();
    br.com.addvisor.model.User var26 = new br.com.addvisor.model.User("Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]]", "User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.Long var27 = var26.getId();
    var26.setId((java.lang.Long)(-1L));
    var26.setPhone("null\nnull\nnull");
    java.lang.String var32 = var26.getEmail();
    var26.setName("User [id=null, name=null, email=User [id=null, name=null, email=null, password=null, phone=null, city=null], password=null, phone=null, city=null]");
    var18.setUser(var26);
    boolean var36 = var4.equals((java.lang.Object)var18);
    br.com.addvisor.model.Address var37 = new br.com.addvisor.model.Address();
    java.lang.String var38 = var37.getComplement();
    java.lang.String var39 = var37.toString();
    java.lang.String var40 = var37.getComplement();
    boolean var41 = var4.equals((java.lang.Object)var37);
    br.com.addvisor.model.Evaluate var42 = new br.com.addvisor.model.Evaluate();
    br.com.addvisor.model.State var43 = new br.com.addvisor.model.State();
    boolean var45 = var43.equals((java.lang.Object)(byte)100);
    var43.setUf("null\nnull\nnull");
    boolean var48 = var42.equals((java.lang.Object)var43);
    br.com.addvisor.model.Service var49 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var50 = new br.com.addvisor.model.User();
    boolean var52 = var50.equals((java.lang.Object)(-1L));
    java.lang.String var53 = var50.toString();
    java.lang.String var54 = var50.getPassword();
    var49.setUser(var50);
    br.com.addvisor.model.Address var56 = var49.getAddress();
    var42.setService(var49);
    br.com.addvisor.model.enums.ServiceCat var58 = var49.getCategory();
    br.com.addvisor.model.Address var59 = new br.com.addvisor.model.Address();
    var59.setId((java.lang.Long)0L);
    var49.setAddress(var59);
    java.lang.String var63 = var49.getName();
    boolean var64 = var4.equals((java.lang.Object)var49);
    java.lang.String var65 = var4.getUf();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "null\nnull\nnull"+ "'", var2.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + 1L+ "'", var13.equals(1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "null\nnull\nnull"+ "'", var39.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var53.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var65);

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test10");


    br.com.addvisor.model.Address var0 = new br.com.addvisor.model.Address();
    java.lang.String var1 = var0.getComplement();
    java.lang.String var2 = var0.toString();
    var0.setId((java.lang.Long)1L);
    java.lang.Long var5 = var0.getId();
    br.com.addvisor.model.Address var6 = new br.com.addvisor.model.Address();
    java.lang.String var7 = var6.toString();
    br.com.addvisor.model.City var8 = new br.com.addvisor.model.City();
    var8.setName("hi!");
    var6.setCity(var8);
    br.com.addvisor.model.City var12 = new br.com.addvisor.model.City();
    var12.setName("hi!");
    int var15 = var8.compareTo(var12);
    var0.setCity(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "null\nnull\nnull"+ "'", var2.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 1L+ "'", var5.equals(1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "null\nnull\nnull"+ "'", var7.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test11");


    br.com.addvisor.model.City var0 = new br.com.addvisor.model.City();
    var0.setName("hi!");
    var0.setName("null\nnull\nnull");
    java.lang.String var5 = var0.getName();
    br.com.addvisor.model.Evaluate var6 = new br.com.addvisor.model.Evaluate();
    var6.setId((java.lang.Long)10L);
    var6.setId((java.lang.Long)0L);
    var6.setComment("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    br.com.addvisor.model.Agenda var13 = new br.com.addvisor.model.Agenda();
    java.util.List var14 = var13.getNames();
    br.com.addvisor.model.Agenda var15 = new br.com.addvisor.model.Agenda();
    java.util.List var16 = var15.getNames();
    var13.setNames(var16);
    java.util.List var18 = var13.getNumbers();
    boolean var19 = var6.equals((java.lang.Object)var13);
    java.util.List var20 = var13.getNumbers();
    boolean var21 = var0.equals((java.lang.Object)var13);
    br.com.addvisor.model.Agenda var22 = new br.com.addvisor.model.Agenda();
    java.util.List var23 = var22.getNames();
    br.com.addvisor.model.Agenda var24 = new br.com.addvisor.model.Agenda();
    java.util.List var25 = var24.getNames();
    var22.setNames(var25);
    java.util.List var27 = var22.getNumbers();
    br.com.addvisor.model.Agenda var28 = new br.com.addvisor.model.Agenda();
    java.util.List var29 = var28.getNames();
    java.util.List var30 = var28.getNumbers();
    br.com.addvisor.model.Agenda var31 = new br.com.addvisor.model.Agenda();
    java.util.List var32 = var31.getNames();
    java.util.List var33 = var31.getNumbers();
    var28.setNames(var33);
    br.com.addvisor.model.Agenda var35 = new br.com.addvisor.model.Agenda();
    java.util.List var36 = var35.getNames();
    java.util.List var37 = var35.getNumbers();
    br.com.addvisor.model.Agenda var38 = new br.com.addvisor.model.Agenda();
    java.util.List var39 = var38.getNames();
    java.util.List var40 = var38.getNumbers();
    var35.setNames(var40);
    var28.setNames(var40);
    var22.setNumbers(var40);
    var13.setNames(var40);
    br.com.addvisor.model.Agenda var45 = new br.com.addvisor.model.Agenda();
    java.util.List var46 = var45.getNames();
    java.util.List var47 = var45.getNumbers();
    br.com.addvisor.model.Agenda var48 = new br.com.addvisor.model.Agenda();
    java.util.List var49 = var48.getNames();
    java.util.List var50 = var48.getNumbers();
    var45.setNames(var50);
    br.com.addvisor.model.Agenda var52 = new br.com.addvisor.model.Agenda();
    java.util.List var53 = var52.getNames();
    java.util.List var54 = var52.getNumbers();
    br.com.addvisor.model.Agenda var55 = new br.com.addvisor.model.Agenda();
    java.util.List var56 = var55.getNames();
    java.util.List var57 = var55.getNumbers();
    var52.setNames(var57);
    var45.setNames(var57);
    br.com.addvisor.model.Agenda var60 = new br.com.addvisor.model.Agenda();
    java.util.List var61 = var60.getNames();
    java.util.List var62 = var60.getNumbers();
    var45.setNames(var62);
    br.com.addvisor.model.Service var64 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var65 = new br.com.addvisor.model.User();
    boolean var67 = var65.equals((java.lang.Object)(-1L));
    java.lang.String var68 = var65.toString();
    java.lang.String var69 = var65.getPassword();
    var64.setUser(var65);
    br.com.addvisor.model.Address var71 = var64.getAddress();
    java.util.List var72 = var64.getPhones();
    br.com.addvisor.model.Agenda var73 = new br.com.addvisor.model.Agenda();
    java.util.List var74 = var73.getNames();
    java.util.List var75 = var73.getNumbers();
    br.com.addvisor.model.Agenda var76 = new br.com.addvisor.model.Agenda();
    java.util.List var77 = var76.getNames();
    java.util.List var78 = var76.getNumbers();
    var73.setNames(var78);
    var64.setPhones(var78);
    var45.setNames(var78);
    var13.setNumbers(var78);
    java.util.Map var83 = var13.getContacts();
    var13.addContact(" -", "User [id=null, name=null, email=null, password=6f30ecc3178699bdb54df7daf6f7f49e, phone=User [id=null, name=null, email=null, password=null, phone=null, city=null], city=null\nnull\nnull]");
    java.util.Map var87 = var13.getContacts();
    java.util.List var88 = var13.getNumbers();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "null\nnull\nnull"+ "'", var5.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var68 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var68.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test12");


    br.com.addvisor.model.Evaluate var0 = new br.com.addvisor.model.Evaluate();
    br.com.addvisor.model.State var1 = new br.com.addvisor.model.State();
    boolean var3 = var1.equals((java.lang.Object)(byte)100);
    var1.setUf("null\nnull\nnull");
    boolean var6 = var0.equals((java.lang.Object)var1);
    br.com.addvisor.model.Service var7 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var8 = new br.com.addvisor.model.User();
    boolean var10 = var8.equals((java.lang.Object)(-1L));
    java.lang.String var11 = var8.toString();
    java.lang.String var12 = var8.getPassword();
    var7.setUser(var8);
    br.com.addvisor.model.Address var14 = var7.getAddress();
    var0.setService(var7);
    var7.setTags("User [id=null, name=Country [id=null, name=Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null], acronym=User [id=-1, name=null, email=null, password=21c96d96756cfeed7f71110d9cb1788b, phone=null\nnull\nnull, city=null]], email= - , password=bab90b8667e900a415ffe18829d9e6f9, phone=Country [id=null, name=Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null], acronym=User [id=-1, name=null, email=null, password=21c96d96756cfeed7f71110d9cb1788b, phone=null\nnull\nnull, city=null]], city=hi!]");
    br.com.addvisor.model.Evaluate var18 = new br.com.addvisor.model.Evaluate();
    br.com.addvisor.model.State var19 = new br.com.addvisor.model.State();
    boolean var21 = var19.equals((java.lang.Object)(byte)100);
    var19.setUf("null\nnull\nnull");
    boolean var24 = var18.equals((java.lang.Object)var19);
    br.com.addvisor.model.Service var25 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var26 = new br.com.addvisor.model.User();
    boolean var28 = var26.equals((java.lang.Object)(-1L));
    java.lang.String var29 = var26.toString();
    java.lang.String var30 = var26.getPassword();
    var25.setUser(var26);
    br.com.addvisor.model.Address var32 = var25.getAddress();
    java.lang.String var33 = var25.getDescription();
    boolean var34 = var18.equals((java.lang.Object)var25);
    br.com.addvisor.model.Evaluate var35 = new br.com.addvisor.model.Evaluate();
    var35.setId((java.lang.Long)10L);
    var35.setId((java.lang.Long)0L);
    br.com.addvisor.model.User var40 = var35.getUser();
    java.lang.Long var41 = var35.getId();
    br.com.addvisor.model.Service var42 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var43 = new br.com.addvisor.model.User();
    boolean var45 = var43.equals((java.lang.Object)(-1L));
    java.lang.String var46 = var43.toString();
    java.lang.String var47 = var43.getPassword();
    var42.setUser(var43);
    br.com.addvisor.model.Address var49 = var42.getAddress();
    java.lang.String var50 = var42.getDescription();
    var35.setService(var42);
    boolean var52 = var25.equals((java.lang.Object)var42);
    br.com.addvisor.model.User var53 = new br.com.addvisor.model.User();
    boolean var55 = var53.equals((java.lang.Object)(-1L));
    java.lang.String var56 = var53.toString();
    java.lang.String var57 = var53.getPassword();
    java.lang.String var58 = var53.getName();
    boolean var59 = var25.equals((java.lang.Object)var53);
    var7.setUser(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var11.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var29.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + 0L+ "'", var41.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var46.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var56.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test13");


    br.com.addvisor.model.State var0 = new br.com.addvisor.model.State();
    var0.setId((java.lang.Long)1L);
    var0.setName("null\nnull\nnull");
    var0.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    br.com.addvisor.model.Country var7 = var0.getCountry();
    java.lang.String var8 = var0.getUf();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test14");


    br.com.addvisor.model.User var6 = new br.com.addvisor.model.User();
    boolean var8 = var6.equals((java.lang.Object)(-1L));
    boolean var10 = var6.equals((java.lang.Object)100.0d);
    var6.setEmail("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    br.com.addvisor.model.City var17 = new br.com.addvisor.model.City();
    var17.setName("hi!");
    var17.setName("null\nnull\nnull");
    br.com.addvisor.model.Address var22 = new br.com.addvisor.model.Address();
    java.lang.String var23 = var22.getComplement();
    java.lang.String var24 = var22.toString();
    boolean var25 = var17.equals((java.lang.Object)var24);
    br.com.addvisor.model.User var26 = new br.com.addvisor.model.User("hi!", "", "hi!", "User [id=null, name=null, email=null, password=null, phone=null, city=null]", var17);
    br.com.addvisor.model.City var29 = new br.com.addvisor.model.City();
    var29.setName("hi!");
    var29.setName("null\nnull\nnull");
    br.com.addvisor.model.Address var34 = new br.com.addvisor.model.Address();
    java.lang.String var35 = var34.getComplement();
    java.lang.String var36 = var34.toString();
    boolean var37 = var29.equals((java.lang.Object)var36);
    br.com.addvisor.model.User var38 = new br.com.addvisor.model.User();
    br.com.addvisor.model.State var39 = new br.com.addvisor.model.State();
    var39.setId((java.lang.Long)1L);
    var39.setName("null\nnull\nnull");
    var39.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var46 = var39.getUf();
    boolean var47 = var38.equals((java.lang.Object)var39);
    var29.setState(var39);
    br.com.addvisor.model.Address var49 = new br.com.addvisor.model.Address("Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]]", "", var29);
    int var50 = var17.compareTo(var29);
    var6.setCity(var29);
    var29.setName("\nnull\nhi!");
    java.lang.String var54 = var29.toString();
    br.com.addvisor.model.User var55 = new br.com.addvisor.model.User("Evaluate [id=0, user=User [id=-1, name=User [id=null, name=null, email=User [id=null, name=null, email=null, password=null, phone=null, city=null], password=null, phone=null, city=null], email=null, password=21c96d96756cfeed7f71110d9cb1788b, phone=null\nnull\nnull, city=null], service=null, note=null, comment=null]", "Evaluate [id=null, user=null, service=null, note=10.0, comment=null]", "4238a597ad0f3ff8363f52f6e8c3507", "Us", var29);
    br.com.addvisor.model.Address var56 = new br.com.addvisor.model.Address("Evaluate [id=0, user=null, service=null, note=null, comment=null]\n\nnull", "null - null - null", var29);
    var29.setName("User [id=null, name=null, email=null, password=31da43824047429f3b1fa47f621f02f4, phone=null, city=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "null\nnull\nnull"+ "'", var24.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "null\nnull\nnull"+ "'", var36.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + "\nnull\nhi!"+ "'", var54.equals("\nnull\nhi!"));

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test15");


    br.com.addvisor.model.State var0 = new br.com.addvisor.model.State();
    boolean var2 = var0.equals((java.lang.Object)(byte)100);
    br.com.addvisor.model.State var3 = new br.com.addvisor.model.State();
    var3.setId((java.lang.Long)1L);
    int var6 = var0.compareTo(var3);
    br.com.addvisor.model.State var7 = new br.com.addvisor.model.State();
    var7.setId((java.lang.Long)1L);
    var7.setName("null\nnull\nnull");
    var7.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var14 = var7.getUf();
    var7.setName("Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]");
    int var17 = var0.compareTo(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test16");


    br.com.addvisor.model.Service var0 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var1 = new br.com.addvisor.model.User();
    boolean var3 = var1.equals((java.lang.Object)(-1L));
    java.lang.String var4 = var1.toString();
    java.lang.String var5 = var1.getPassword();
    var0.setUser(var1);
    br.com.addvisor.model.Address var7 = var0.getAddress();
    br.com.addvisor.model.User var8 = new br.com.addvisor.model.User();
    boolean var10 = var8.equals((java.lang.Object)(-1L));
    boolean var12 = var8.equals((java.lang.Object)100.0d);
    var0.setUser(var8);
    java.lang.String var14 = var8.getPhone();
    var8.setEmail("null - User [id=-1, name=null, email=null, password=21c96d96756cfeed7f71110d9cb1788b, phone=null\nnull\nnull, city=null]");
    var8.setPassword("Evaluate [id=0, user=null, service=null, note=null, comment=null]\n\nnull");
    java.lang.String var19 = var8.getDDD();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var4.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test17");


    br.com.addvisor.model.Evaluate var0 = new br.com.addvisor.model.Evaluate();
    var0.setId((java.lang.Long)10L);
    var0.setId((java.lang.Long)0L);
    java.lang.Float var5 = var0.getNote();
    java.lang.Float var6 = var0.getNote();
    var0.setNote((java.lang.Float)100.0f);
    java.lang.Long var9 = var0.getId();
    br.com.addvisor.model.User var10 = var0.getUser();
    br.com.addvisor.model.User var11 = var0.getUser();
    br.com.addvisor.model.User var12 = var0.getUser();
    var0.setNote((java.lang.Float)100.0f);
    br.com.addvisor.model.State var15 = new br.com.addvisor.model.State();
    boolean var17 = var15.equals((java.lang.Object)(byte)100);
    var15.setUf("null\nnull\nnull");
    br.com.addvisor.model.State var20 = new br.com.addvisor.model.State();
    int var21 = var15.compareTo(var20);
    java.lang.String var22 = var20.getName();
    br.com.addvisor.model.User var23 = new br.com.addvisor.model.User();
    boolean var25 = var23.equals((java.lang.Object)(-1L));
    java.lang.String var26 = var23.getDDD();
    var23.setPhone("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    var23.setEmail("hi!");
    var23.setEmail("null\nnull\nnull");
    br.com.addvisor.model.City var33 = var23.getCity();
    java.lang.String var34 = var23.getPhone();
    boolean var35 = var20.equals((java.lang.Object)var23);
    var0.setUser(var23);
    java.lang.String var37 = var23.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + 0L+ "'", var9.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var34.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test18");


    br.com.addvisor.model.User var2 = new br.com.addvisor.model.User("null - null", "Evaluate [id=0, user=null, service=Service [id=null, name=null, description=null, tags=null, media=null, address=null\nnull\nnull, category=null, phones=null], note=0.0, comment=null]");
    var2.setPhone("Service [id=1, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]");
    java.lang.String var5 = var2.toString();
    java.lang.Long var6 = var2.getId();
    java.lang.String var7 = var2.getPhone();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "User [id=null, name=null, email=null, password=91eeda0175cc5456fa7e09c1f71e6de6, phone=Service [id=1, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null], city=null]"+ "'", var5.equals("User [id=null, name=null, email=null, password=91eeda0175cc5456fa7e09c1f71e6de6, phone=Service [id=1, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null], city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Service [id=1, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]"+ "'", var7.equals("Service [id=1, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]"));

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test19");


    br.com.addvisor.model.Service var0 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var1 = new br.com.addvisor.model.User();
    boolean var3 = var1.equals((java.lang.Object)(-1L));
    java.lang.String var4 = var1.toString();
    java.lang.String var5 = var1.getPassword();
    var0.setUser(var1);
    var0.setTags("Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]]");
    java.lang.String var9 = var0.getName();
    br.com.addvisor.model.enums.ServiceCat var10 = var0.getCategory();
    java.lang.String var11 = var0.getTags();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var4.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]]"+ "'", var11.equals("Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]]"));

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test20");


    br.com.addvisor.model.User var0 = new br.com.addvisor.model.User();
    boolean var2 = var0.equals((java.lang.Object)(-1L));
    java.lang.String var3 = var0.getDDD();
    var0.setPhone("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    br.com.addvisor.model.Address var6 = new br.com.addvisor.model.Address();
    java.lang.String var7 = var6.toString();
    br.com.addvisor.model.City var8 = new br.com.addvisor.model.City();
    var8.setName("hi!");
    var8.setName("null\nnull\nnull");
    var6.setCity(var8);
    var0.setCity(var8);
    var0.setPassword("hi!");
    var0.setPassword(" - null");
    var0.setPhone("Service [id=null, name=null, description=Country [id=null, name=Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null], acronym=User [id=-1, name=null, email=null, password=21c96d96756cfeed7f71110d9cb1788b, phone=null\nnull\nnull, city=null]], tags=null, media=1.0, address=null, category=null, phones=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "null\nnull\nnull"+ "'", var7.equals("null\nnull\nnull"));

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test21");


    br.com.addvisor.model.City var2 = new br.com.addvisor.model.City();
    var2.setName("hi!");
    var2.setName("null\nnull\nnull");
    br.com.addvisor.model.Address var7 = new br.com.addvisor.model.Address();
    java.lang.String var8 = var7.getComplement();
    java.lang.String var9 = var7.toString();
    boolean var10 = var2.equals((java.lang.Object)var9);
    br.com.addvisor.model.User var11 = new br.com.addvisor.model.User();
    br.com.addvisor.model.State var12 = new br.com.addvisor.model.State();
    var12.setId((java.lang.Long)1L);
    var12.setName("null\nnull\nnull");
    var12.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var19 = var12.getUf();
    boolean var20 = var11.equals((java.lang.Object)var12);
    var2.setState(var12);
    br.com.addvisor.model.Address var22 = new br.com.addvisor.model.Address("Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]]", "", var2);
    br.com.addvisor.model.City var27 = new br.com.addvisor.model.City();
    var27.setName("hi!");
    var27.setName("null\nnull\nnull");
    br.com.addvisor.model.Address var32 = new br.com.addvisor.model.Address();
    java.lang.String var33 = var32.getComplement();
    java.lang.String var34 = var32.toString();
    boolean var35 = var27.equals((java.lang.Object)var34);
    br.com.addvisor.model.User var36 = new br.com.addvisor.model.User();
    br.com.addvisor.model.State var37 = new br.com.addvisor.model.State();
    var37.setId((java.lang.Long)1L);
    var37.setName("null\nnull\nnull");
    var37.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var44 = var37.getUf();
    boolean var45 = var36.equals((java.lang.Object)var37);
    var27.setState(var37);
    br.com.addvisor.model.Address var47 = new br.com.addvisor.model.Address("Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]]", "", var27);
    var47.setLocation("null\nnull\nnull");
    br.com.addvisor.model.Service var50 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var51 = new br.com.addvisor.model.User();
    boolean var53 = var51.equals((java.lang.Object)(-1L));
    java.lang.String var54 = var51.toString();
    java.lang.String var55 = var51.getPassword();
    var50.setUser(var51);
    br.com.addvisor.model.Address var57 = var50.getAddress();
    java.lang.String var58 = var50.getName();
    br.com.addvisor.model.City var59 = new br.com.addvisor.model.City();
    var59.setName("hi!");
    var59.setName("null\nnull\nnull");
    br.com.addvisor.model.Address var64 = new br.com.addvisor.model.Address();
    java.lang.String var65 = var64.getComplement();
    java.lang.String var66 = var64.toString();
    boolean var67 = var59.equals((java.lang.Object)var66);
    br.com.addvisor.model.State var68 = new br.com.addvisor.model.State();
    var68.setId((java.lang.Long)1L);
    var68.setName("null\nnull\nnull");
    var68.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var75 = var68.getUf();
    var59.setState(var68);
    boolean var77 = var50.equals((java.lang.Object)var59);
    var47.setCity(var59);
    br.com.addvisor.model.Address var79 = new br.com.addvisor.model.Address("User [id=null, name=null, email=User [id=null, name=null, email=null, password=null, phone=null, city=null], password=null, phone=null, city=null]", "User [id=null, name=null, email=null, password=null, phone=null, city=null]", var59);
    java.lang.Long var80 = var59.getId();
    var22.setCity(var59);
    var22.setComplement("User [id=1, name=null, email=null, password=6a526e9ea8abcc547d30e98aac13c6cc, phone=User [id=null, name=null, email=User [id=null, name=null, email=null, password=null, phone=null, city=null], password=null, phone=null, city=null], city=null]");
    br.com.addvisor.model.City var84 = var22.getCity();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "null\nnull\nnull"+ "'", var9.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "null\nnull\nnull"+ "'", var34.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var54.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var66 + "' != '" + "null\nnull\nnull"+ "'", var66.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test22");


    br.com.addvisor.model.User var2 = new br.com.addvisor.model.User("", "Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]");
    var2.setPhone("null - null");
    var2.setEmail("Service [id=100, name=, description=null, tags=null, media=null, address=null, category=null, phones=null]");
    java.lang.Long var7 = var2.getId();
    java.lang.String var8 = var2.getEmail();
    java.lang.String var9 = var2.getDDD();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Service [id=100, name=, description=null, tags=null, media=null, address=null, category=null, phones=null]"+ "'", var8.equals("Service [id=100, name=, description=null, tags=null, media=null, address=null, category=null, phones=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "nu"+ "'", var9.equals("nu"));

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test23");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.addvisor.model.enums.PriceCat var1 = br.com.addvisor.model.enums.PriceCat.getPrice("Country [id=null, name=null, acronym=null]");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test24");


    br.com.addvisor.model.Evaluate var0 = new br.com.addvisor.model.Evaluate();
    var0.setId((java.lang.Long)10L);
    var0.setId((java.lang.Long)0L);
    br.com.addvisor.model.Service var5 = var0.getService();
    br.com.addvisor.model.User var6 = new br.com.addvisor.model.User();
    boolean var8 = var6.equals((java.lang.Object)(-1L));
    java.lang.String var9 = var6.toString();
    java.lang.String var10 = var6.getPassword();
    java.lang.String var11 = var6.getPhone();
    var0.setUser(var6);
    br.com.addvisor.model.Service var13 = new br.com.addvisor.model.Service();
    java.lang.String var14 = var13.toString();
    var13.setTags("User [id=-1, name=null, email=null, password=21c96d96756cfeed7f71110d9cb1788b, phone=null\nnull\nnull, city=null]");
    br.com.addvisor.model.Address var17 = var13.getAddress();
    var13.setDescription("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var20 = var13.getName();
    br.com.addvisor.model.Evaluate var23 = new br.com.addvisor.model.Evaluate(var6, var13, (java.lang.Float)1.0f, "");
    br.com.addvisor.model.Evaluate var24 = new br.com.addvisor.model.Evaluate();
    br.com.addvisor.model.State var25 = new br.com.addvisor.model.State();
    boolean var27 = var25.equals((java.lang.Object)(byte)100);
    var25.setUf("null\nnull\nnull");
    boolean var30 = var24.equals((java.lang.Object)var25);
    br.com.addvisor.model.Service var31 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var32 = new br.com.addvisor.model.User();
    boolean var34 = var32.equals((java.lang.Object)(-1L));
    java.lang.String var35 = var32.toString();
    java.lang.String var36 = var32.getPassword();
    var31.setUser(var32);
    br.com.addvisor.model.Address var38 = var31.getAddress();
    java.lang.String var39 = var31.getDescription();
    boolean var40 = var24.equals((java.lang.Object)var31);
    br.com.addvisor.model.Evaluate var41 = new br.com.addvisor.model.Evaluate();
    var41.setId((java.lang.Long)10L);
    var41.setId((java.lang.Long)0L);
    br.com.addvisor.model.User var46 = var41.getUser();
    java.lang.Long var47 = var41.getId();
    br.com.addvisor.model.Service var48 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var49 = new br.com.addvisor.model.User();
    boolean var51 = var49.equals((java.lang.Object)(-1L));
    java.lang.String var52 = var49.toString();
    java.lang.String var53 = var49.getPassword();
    var48.setUser(var49);
    br.com.addvisor.model.Address var55 = var48.getAddress();
    java.lang.String var56 = var48.getDescription();
    var41.setService(var48);
    boolean var58 = var31.equals((java.lang.Object)var48);
    br.com.addvisor.model.User var59 = new br.com.addvisor.model.User();
    boolean var61 = var59.equals((java.lang.Object)(-1L));
    java.lang.String var62 = var59.getDDD();
    var59.setPhone("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    boolean var65 = var48.equals((java.lang.Object)"User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    br.com.addvisor.model.User var68 = new br.com.addvisor.model.User("User [id=null, name=null, email=User [id=null, name=null, email=null, password=null, phone=null, city=null], password=null, phone=null, city=null]", "Country [id=null, name=null, acronym=null]");
    var48.setUser(var68);
    java.lang.String var70 = var48.getName();
    boolean var71 = var13.equals((java.lang.Object)var48);
    br.com.addvisor.model.City var74 = new br.com.addvisor.model.City();
    var74.setName("hi!");
    java.lang.String var77 = var74.getName();
    br.com.addvisor.model.Address var78 = new br.com.addvisor.model.Address("Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]", "", var74);
    var78.setLocation("Country [id=null, name=null, acronym=null]");
    var48.setAddress(var78);
    var78.setId((java.lang.Long)10L);
    br.com.addvisor.model.City var84 = var78.getCity();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var9.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]"+ "'", var14.equals("Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var35.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + 0L+ "'", var47.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var52.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var77 + "' != '" + "hi!"+ "'", var77.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test25");


    br.com.addvisor.model.City var2 = new br.com.addvisor.model.City();
    var2.setName("hi!");
    java.lang.String var5 = var2.getName();
    br.com.addvisor.model.Address var6 = new br.com.addvisor.model.Address("Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]", "", var2);
    br.com.addvisor.model.City var7 = var6.getCity();
    java.lang.String var8 = var6.toString();
    java.lang.String var9 = var6.toString();
    br.com.addvisor.model.User var10 = new br.com.addvisor.model.User();
    boolean var12 = var10.equals((java.lang.Object)(-1L));
    boolean var14 = var10.equals((java.lang.Object)100.0d);
    var10.setEmail("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var17 = var10.getName();
    var10.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    boolean var20 = var6.equals((java.lang.Object)"User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]\n\nhi!"+ "'", var8.equals("Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]\n\nhi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]\n\nhi!"+ "'", var9.equals("Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]\n\nhi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test26");


    br.com.addvisor.model.Evaluate var0 = new br.com.addvisor.model.Evaluate();
    var0.setId((java.lang.Long)10L);
    var0.setId((java.lang.Long)0L);
    var0.setComment("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    br.com.addvisor.model.Service var7 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var8 = new br.com.addvisor.model.User();
    boolean var10 = var8.equals((java.lang.Object)(-1L));
    java.lang.String var11 = var8.toString();
    java.lang.String var12 = var8.getPassword();
    var7.setUser(var8);
    br.com.addvisor.model.Address var14 = var7.getAddress();
    java.lang.String var15 = var7.getName();
    var0.setService(var7);
    java.lang.Float var17 = var0.getNote();
    br.com.addvisor.model.User var18 = var0.getUser();
    br.com.addvisor.model.City var21 = new br.com.addvisor.model.City();
    br.com.addvisor.model.Address var22 = new br.com.addvisor.model.Address("null\nnull\nnull", "Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]]", var21);
    br.com.addvisor.model.State var23 = new br.com.addvisor.model.State();
    boolean var25 = var23.equals((java.lang.Object)(byte)100);
    var23.setUf("null\nnull\nnull");
    br.com.addvisor.model.State var28 = new br.com.addvisor.model.State();
    int var29 = var23.compareTo(var28);
    var28.setName("");
    var21.setState(var28);
    var28.setId((java.lang.Long)100L);
    var28.setUf("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    boolean var37 = var0.equals((java.lang.Object)var28);
    java.lang.String var38 = var28.getName();
    var28.setName("Service [id=null, name=null, description=Country [id=null, name=Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null], acronym=User [id=-1, name=null, email=null, password=21c96d96756cfeed7f71110d9cb1788b, phone=null\nnull\nnull, city=null]], tags=null, media=1.0, address=null, category=null, phones=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var11.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + ""+ "'", var38.equals(""));

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test27");


    br.com.addvisor.model.Service var0 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var1 = new br.com.addvisor.model.User();
    boolean var3 = var1.equals((java.lang.Object)(-1L));
    java.lang.String var4 = var1.toString();
    java.lang.String var5 = var1.getPassword();
    var0.setUser(var1);
    br.com.addvisor.model.Address var7 = var0.getAddress();
    java.lang.String var8 = var0.getName();
    var0.setName("Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]]");
    java.lang.String var11 = var0.getName();
    java.lang.String var12 = var0.getTags();
    br.com.addvisor.model.User var13 = var0.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var4.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]]"+ "'", var11.equals("Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test28");


    br.com.addvisor.model.Service var0 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var1 = new br.com.addvisor.model.User();
    boolean var3 = var1.equals((java.lang.Object)(-1L));
    java.lang.String var4 = var1.toString();
    java.lang.String var5 = var1.getPassword();
    var0.setUser(var1);
    java.lang.Long var7 = var1.getId();
    var1.setPhone("null - User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    var1.setPhone("Evaluate [id=1, user=User [id=null, name=null, email=null, password=4733c1e4c93840f406b626b1699a3659, phone=null\nnull\nnull, city=null], service=Service [id=null, name=null, description=null, tags=null, media=1.0, address=null, category=null, phones=null], note=100.0, comment=hi!]");
    br.com.addvisor.model.City var14 = new br.com.addvisor.model.City();
    var14.setName("hi!");
    java.lang.String var17 = var14.getName();
    br.com.addvisor.model.Address var18 = new br.com.addvisor.model.Address("Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]", "", var14);
    var18.setLocation("Country [id=null, name=null, acronym=null]");
    br.com.addvisor.model.City var33 = new br.com.addvisor.model.City();
    var33.setName("hi!");
    var33.setName("null\nnull\nnull");
    br.com.addvisor.model.Address var38 = new br.com.addvisor.model.Address();
    java.lang.String var39 = var38.getComplement();
    java.lang.String var40 = var38.toString();
    boolean var41 = var33.equals((java.lang.Object)var40);
    br.com.addvisor.model.User var42 = new br.com.addvisor.model.User("hi!", "", "hi!", "User [id=null, name=null, email=null, password=null, phone=null, city=null]", var33);
    br.com.addvisor.model.Address var43 = new br.com.addvisor.model.Address("null\nnull\nnull", "User [id=null, name=null, email=null, password=null, phone=null, city=null]", var33);
    var33.setId((java.lang.Long)100L);
    br.com.addvisor.model.User var46 = new br.com.addvisor.model.User("Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]]", "Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]]", "User [id=null, name=null, email=null, password=21c96d96756cfeed7f71110d9cb1788b, phone=Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]], city=null]", "hi!", var33);
    br.com.addvisor.model.Address var47 = new br.com.addvisor.model.Address("Service [id=1, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]", "null - User [id=-1, name=null, email=null, password=21c96d96756cfeed7f71110d9cb1788b, phone=null\nnull\nnull, city=null]", var33);
    var18.setCity(var33);
    br.com.addvisor.model.City var51 = new br.com.addvisor.model.City();
    br.com.addvisor.model.Address var52 = new br.com.addvisor.model.Address("null\nnull\nnull", "Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]]", var51);
    br.com.addvisor.model.State var53 = new br.com.addvisor.model.State();
    boolean var55 = var53.equals((java.lang.Object)(byte)100);
    var53.setUf("null\nnull\nnull");
    br.com.addvisor.model.State var58 = new br.com.addvisor.model.State();
    int var59 = var53.compareTo(var58);
    var58.setName("");
    var51.setState(var58);
    var58.setId((java.lang.Long)100L);
    var33.setState(var58);
    br.com.addvisor.model.State var66 = var33.getState();
    var33.setName("Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]");
    var1.setCity(var33);
    br.com.addvisor.model.Address var70 = new br.com.addvisor.model.Address();
    java.lang.String var71 = var70.toString();
    br.com.addvisor.model.City var72 = new br.com.addvisor.model.City();
    var72.setName("hi!");
    var70.setCity(var72);
    var72.setId((java.lang.Long)10L);
    java.lang.String var78 = var72.getName();
    br.com.addvisor.model.State var79 = new br.com.addvisor.model.State();
    var79.setId((java.lang.Long)1L);
    var79.setName("null\nnull\nnull");
    var79.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var86 = var79.getUf();
    var79.setName("Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]");
    var79.setName("null - null");
    java.lang.String var91 = var79.toString();
    var72.setState(var79);
    int var93 = var33.compareTo(var72);
    var72.setId((java.lang.Long)10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var4.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "null\nnull\nnull"+ "'", var40.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var71 + "' != '" + "null\nnull\nnull"+ "'", var71.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var78 + "' != '" + "hi!"+ "'", var78.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var91 + "' != '" + "null - null - null"+ "'", var91.equals("null - null - null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var93 == (-21));

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test29");


    br.com.addvisor.model.User var2 = new br.com.addvisor.model.User("", "Country [id=null, name=null, acronym=null]");
    br.com.addvisor.model.City var3 = var2.getCity();
    br.com.addvisor.model.City var6 = new br.com.addvisor.model.City();
    var6.setName("hi!");
    var6.setName("null\nnull\nnull");
    br.com.addvisor.model.Address var11 = new br.com.addvisor.model.Address();
    java.lang.String var12 = var11.getComplement();
    java.lang.String var13 = var11.toString();
    boolean var14 = var6.equals((java.lang.Object)var13);
    br.com.addvisor.model.User var15 = new br.com.addvisor.model.User();
    br.com.addvisor.model.State var16 = new br.com.addvisor.model.State();
    var16.setId((java.lang.Long)1L);
    var16.setName("null\nnull\nnull");
    var16.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var23 = var16.getUf();
    boolean var24 = var15.equals((java.lang.Object)var16);
    var6.setState(var16);
    br.com.addvisor.model.Address var26 = new br.com.addvisor.model.Address("Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]]", "", var6);
    br.com.addvisor.model.City var31 = new br.com.addvisor.model.City();
    var31.setName("hi!");
    var31.setName("null\nnull\nnull");
    br.com.addvisor.model.Address var36 = new br.com.addvisor.model.Address();
    java.lang.String var37 = var36.getComplement();
    java.lang.String var38 = var36.toString();
    boolean var39 = var31.equals((java.lang.Object)var38);
    br.com.addvisor.model.User var40 = new br.com.addvisor.model.User();
    br.com.addvisor.model.State var41 = new br.com.addvisor.model.State();
    var41.setId((java.lang.Long)1L);
    var41.setName("null\nnull\nnull");
    var41.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var48 = var41.getUf();
    boolean var49 = var40.equals((java.lang.Object)var41);
    var31.setState(var41);
    br.com.addvisor.model.Address var51 = new br.com.addvisor.model.Address("Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]]", "", var31);
    var51.setLocation("null\nnull\nnull");
    br.com.addvisor.model.Service var54 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var55 = new br.com.addvisor.model.User();
    boolean var57 = var55.equals((java.lang.Object)(-1L));
    java.lang.String var58 = var55.toString();
    java.lang.String var59 = var55.getPassword();
    var54.setUser(var55);
    br.com.addvisor.model.Address var61 = var54.getAddress();
    java.lang.String var62 = var54.getName();
    br.com.addvisor.model.City var63 = new br.com.addvisor.model.City();
    var63.setName("hi!");
    var63.setName("null\nnull\nnull");
    br.com.addvisor.model.Address var68 = new br.com.addvisor.model.Address();
    java.lang.String var69 = var68.getComplement();
    java.lang.String var70 = var68.toString();
    boolean var71 = var63.equals((java.lang.Object)var70);
    br.com.addvisor.model.State var72 = new br.com.addvisor.model.State();
    var72.setId((java.lang.Long)1L);
    var72.setName("null\nnull\nnull");
    var72.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var79 = var72.getUf();
    var63.setState(var72);
    boolean var81 = var54.equals((java.lang.Object)var63);
    var51.setCity(var63);
    br.com.addvisor.model.Address var83 = new br.com.addvisor.model.Address("User [id=null, name=null, email=User [id=null, name=null, email=null, password=null, phone=null, city=null], password=null, phone=null, city=null]", "User [id=null, name=null, email=null, password=null, phone=null, city=null]", var63);
    java.lang.Long var84 = var63.getId();
    var26.setCity(var63);
    br.com.addvisor.model.State var86 = var63.getState();
    var2.setCity(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "null\nnull\nnull"+ "'", var13.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "null\nnull\nnull"+ "'", var38.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var58 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var58.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var70 + "' != '" + "null\nnull\nnull"+ "'", var70.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test30");


    br.com.addvisor.model.Service var0 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var1 = new br.com.addvisor.model.User();
    boolean var3 = var1.equals((java.lang.Object)(-1L));
    java.lang.String var4 = var1.toString();
    java.lang.String var5 = var1.getPassword();
    var0.setUser(var1);
    br.com.addvisor.model.Address var7 = var0.getAddress();
    br.com.addvisor.model.enums.ServiceCat var8 = var0.getCategory();
    br.com.addvisor.model.Agenda var9 = new br.com.addvisor.model.Agenda();
    java.util.List var10 = var9.getNames();
    br.com.addvisor.model.Agenda var11 = new br.com.addvisor.model.Agenda();
    java.util.List var12 = var11.getNames();
    var9.setNames(var12);
    java.util.List var14 = var9.getNumbers();
    br.com.addvisor.model.Agenda var15 = new br.com.addvisor.model.Agenda();
    java.util.List var16 = var15.getNames();
    java.util.List var17 = var15.getNumbers();
    br.com.addvisor.model.Agenda var18 = new br.com.addvisor.model.Agenda();
    java.util.List var19 = var18.getNames();
    java.util.List var20 = var18.getNumbers();
    var15.setNames(var20);
    br.com.addvisor.model.Agenda var22 = new br.com.addvisor.model.Agenda();
    java.util.List var23 = var22.getNames();
    java.util.List var24 = var22.getNumbers();
    br.com.addvisor.model.Agenda var25 = new br.com.addvisor.model.Agenda();
    java.util.List var26 = var25.getNames();
    java.util.List var27 = var25.getNumbers();
    var22.setNames(var27);
    var15.setNames(var27);
    var9.setNumbers(var27);
    var0.setPhones(var27);
    java.lang.String var32 = var0.getDescription();
    br.com.addvisor.model.enums.ServiceCat var33 = var0.getCategory();
    java.lang.String var34 = var0.toString();
    java.lang.String var35 = var0.getName();
    br.com.addvisor.model.Address var36 = var0.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var4.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=[]]"+ "'", var34.equals("Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test31");


    br.com.addvisor.model.Service var0 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var1 = new br.com.addvisor.model.User();
    boolean var3 = var1.equals((java.lang.Object)(-1L));
    java.lang.String var4 = var1.toString();
    java.lang.String var5 = var1.getPassword();
    var0.setUser(var1);
    br.com.addvisor.model.Address var7 = var0.getAddress();
    java.lang.String var8 = var0.getTags();
    br.com.addvisor.model.Agenda var9 = new br.com.addvisor.model.Agenda();
    java.util.List var10 = var9.getNames();
    java.util.List var11 = var9.getNumbers();
    var0.setPhones(var11);
    br.com.addvisor.model.enums.ServiceCat var13 = var0.getCategory();
    java.lang.Float var14 = var0.getMedia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var4.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test32");


    br.com.addvisor.model.User var2 = new br.com.addvisor.model.User("", "Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]");
    java.lang.String var3 = var2.getPhone();
    br.com.addvisor.model.Service var4 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var5 = new br.com.addvisor.model.User();
    boolean var7 = var5.equals((java.lang.Object)(-1L));
    java.lang.String var8 = var5.toString();
    java.lang.String var9 = var5.getPassword();
    var4.setUser(var5);
    br.com.addvisor.model.Address var11 = var4.getAddress();
    br.com.addvisor.model.Address var12 = new br.com.addvisor.model.Address();
    java.lang.String var13 = var12.getComplement();
    java.lang.String var14 = var12.toString();
    br.com.addvisor.model.City var15 = var12.getCity();
    br.com.addvisor.model.State var16 = new br.com.addvisor.model.State();
    var16.setId((java.lang.Long)1L);
    var16.setName("null\nnull\nnull");
    var16.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var23 = var16.getUf();
    boolean var24 = var12.equals((java.lang.Object)var16);
    var4.setAddress(var12);
    br.com.addvisor.model.User var26 = var4.getUser();
    java.lang.String var27 = var4.toString();
    br.com.addvisor.model.enums.ServiceCat var28 = var4.getCategory();
    br.com.addvisor.model.Evaluate var31 = new br.com.addvisor.model.Evaluate(var2, var4, (java.lang.Float)0.0f, "Service [id=1, name=null, description=Evaluate [id=null, user=null, service=null, note=null, comment=null], tags=null, media=null, address=null, category=null, phones=null]");
    java.lang.String var32 = var31.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var8.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "null\nnull\nnull"+ "'", var14.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "Service [id=null, name=null, description=null, tags=null, media=null, address=null\nnull\nnull, category=null, phones=null]"+ "'", var27.equals("Service [id=null, name=null, description=null, tags=null, media=null, address=null\nnull\nnull, category=null, phones=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "Evaluate [id=null, user=User [id=null, name=null, email=null, password=bab90b8667e900a415ffe18829d9e6f9, phone=, city=null], service=Service [id=null, name=null, description=null, tags=null, media=null, address=null\nnull\nnull, category=null, phones=null], note=0.0, comment=Service [id=1, name=null, description=Evaluate [id=null, user=null, service=null, note=null, comment=null], tags=null, media=null, address=null, category=null, phones=null]]"+ "'", var32.equals("Evaluate [id=null, user=User [id=null, name=null, email=null, password=bab90b8667e900a415ffe18829d9e6f9, phone=, city=null], service=Service [id=null, name=null, description=null, tags=null, media=null, address=null\nnull\nnull, category=null, phones=null], note=0.0, comment=Service [id=1, name=null, description=Evaluate [id=null, user=null, service=null, note=null, comment=null], tags=null, media=null, address=null, category=null, phones=null]]"));

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test33");


    br.com.addvisor.model.State var0 = new br.com.addvisor.model.State();
    var0.setId((java.lang.Long)100L);
    java.lang.String var3 = var0.getUf();
    java.lang.String var4 = var0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test34");


    br.com.addvisor.model.Service var0 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var1 = new br.com.addvisor.model.User();
    boolean var3 = var1.equals((java.lang.Object)(-1L));
    java.lang.String var4 = var1.toString();
    java.lang.String var5 = var1.getPassword();
    var0.setUser(var1);
    java.lang.Long var7 = var1.getId();
    var1.setPassword("Evaluate [id=null, user=null, service=Service [id=1, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null], note=null, comment=null] - null");
    br.com.addvisor.model.City var10 = var1.getCity();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var4.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test35");


    br.com.addvisor.model.Evaluate var0 = new br.com.addvisor.model.Evaluate();
    var0.setId((java.lang.Long)10L);
    var0.setId((java.lang.Long)0L);
    java.lang.Float var5 = var0.getNote();
    br.com.addvisor.model.Service var6 = new br.com.addvisor.model.Service();
    java.lang.String var7 = var6.toString();
    var0.setService(var6);
    var0.setId((java.lang.Long)(-1L));
    java.lang.String var11 = var0.toString();
    java.lang.Float var12 = var0.getNote();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]"+ "'", var7.equals("Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Evaluate [id=-1, user=null, service=Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null], note=null, comment=null]"+ "'", var11.equals("Evaluate [id=-1, user=null, service=Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null], note=null, comment=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test36");


    br.com.addvisor.model.Address var8 = new br.com.addvisor.model.Address();
    java.lang.String var9 = var8.toString();
    br.com.addvisor.model.City var10 = new br.com.addvisor.model.City();
    var10.setName("hi!");
    var8.setCity(var10);
    br.com.addvisor.model.City var14 = new br.com.addvisor.model.City();
    var14.setName("hi!");
    int var17 = var10.compareTo(var14);
    br.com.addvisor.model.City var18 = new br.com.addvisor.model.City();
    var18.setName("hi!");
    var18.setName("null\nnull\nnull");
    br.com.addvisor.model.Address var23 = new br.com.addvisor.model.Address();
    java.lang.String var24 = var23.getComplement();
    java.lang.String var25 = var23.toString();
    boolean var26 = var18.equals((java.lang.Object)var25);
    br.com.addvisor.model.User var27 = new br.com.addvisor.model.User();
    br.com.addvisor.model.State var28 = new br.com.addvisor.model.State();
    var28.setId((java.lang.Long)1L);
    var28.setName("null\nnull\nnull");
    var28.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var35 = var28.getUf();
    boolean var36 = var27.equals((java.lang.Object)var28);
    var18.setState(var28);
    var28.setName("Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]]");
    var10.setState(var28);
    java.lang.Long var41 = var10.getId();
    br.com.addvisor.model.User var42 = new br.com.addvisor.model.User("null - null - Country [id=null, name=null, acronym=null]", "User [id=null, name=null, email=null, password=21c96d96756cfeed7f71110d9cb1788b, phone=Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]], city=null]\nnull\nnull", "null - null - Country [id=null, name=null, acronym=null]", "Service [id=1, name=null, description=Evaluate [id=null, user=null, service=null, note=null, comment=null], tags=null, media=null, address=null, category=null, phones=null]", var10);
    br.com.addvisor.model.User var43 = new br.com.addvisor.model.User("hi", "null\nnull\nnull - null", "Evaluate [id=null, user=null, service=null, note=null, comment=]", "hi! - User [id=null, name=null, email=null, password=null, phone=null, city=null] - null", var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "null\nnull\nnull"+ "'", var9.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "null\nnull\nnull"+ "'", var25.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test37");


    br.com.addvisor.model.Address var0 = new br.com.addvisor.model.Address();
    java.lang.String var1 = var0.toString();
    br.com.addvisor.model.City var2 = new br.com.addvisor.model.City();
    var2.setName("hi!");
    var0.setCity(var2);
    br.com.addvisor.model.City var6 = new br.com.addvisor.model.City();
    var6.setName("hi!");
    var6.setName("null\nnull\nnull");
    br.com.addvisor.model.Address var11 = new br.com.addvisor.model.Address();
    java.lang.String var12 = var11.getComplement();
    java.lang.String var13 = var11.toString();
    boolean var14 = var6.equals((java.lang.Object)var13);
    br.com.addvisor.model.State var15 = new br.com.addvisor.model.State();
    var15.setId((java.lang.Long)1L);
    var15.setName("null\nnull\nnull");
    var15.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var22 = var15.getUf();
    var6.setState(var15);
    int var24 = var2.compareTo(var6);
    var6.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    br.com.addvisor.model.Address var27 = new br.com.addvisor.model.Address();
    java.lang.String var28 = var27.toString();
    br.com.addvisor.model.City var29 = new br.com.addvisor.model.City();
    var29.setName("hi!");
    var27.setCity(var29);
    var29.setId((java.lang.Long)10L);
    br.com.addvisor.model.City var35 = new br.com.addvisor.model.City();
    var35.setName("hi!");
    var35.setName("null\nnull\nnull");
    br.com.addvisor.model.Address var40 = new br.com.addvisor.model.Address();
    java.lang.String var41 = var40.getComplement();
    java.lang.String var42 = var40.toString();
    boolean var43 = var35.equals((java.lang.Object)var42);
    br.com.addvisor.model.State var44 = new br.com.addvisor.model.State();
    var44.setId((java.lang.Long)1L);
    var44.setName("null\nnull\nnull");
    var44.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var51 = var44.getUf();
    var35.setState(var44);
    boolean var53 = var29.equals((java.lang.Object)var35);
    int var54 = var6.compareTo(var29);
    br.com.addvisor.model.Agenda var55 = new br.com.addvisor.model.Agenda();
    java.util.List var56 = var55.getNames();
    java.util.List var57 = var55.getNumbers();
    br.com.addvisor.model.Agenda var58 = new br.com.addvisor.model.Agenda();
    java.util.List var59 = var58.getNames();
    java.util.List var60 = var58.getNumbers();
    var55.setNames(var60);
    br.com.addvisor.model.Agenda var62 = new br.com.addvisor.model.Agenda();
    java.util.List var63 = var62.getNames();
    java.util.List var64 = var62.getNumbers();
    br.com.addvisor.model.Agenda var65 = new br.com.addvisor.model.Agenda();
    java.util.List var66 = var65.getNames();
    java.util.List var67 = var65.getNumbers();
    var62.setNames(var67);
    var55.setNames(var67);
    br.com.addvisor.model.Agenda var70 = new br.com.addvisor.model.Agenda();
    java.util.List var71 = var70.getNames();
    java.util.List var72 = var70.getNumbers();
    var55.setNames(var72);
    boolean var74 = var6.equals((java.lang.Object)var72);
    br.com.addvisor.model.Address var75 = new br.com.addvisor.model.Address();
    java.lang.String var76 = var75.getComplement();
    java.lang.String var77 = var75.toString();
    java.lang.String var78 = var75.getComplement();
    br.com.addvisor.model.City var83 = new br.com.addvisor.model.City();
    var83.setName("hi!");
    var83.setName("null\nnull\nnull");
    br.com.addvisor.model.Address var88 = new br.com.addvisor.model.Address();
    java.lang.String var89 = var88.getComplement();
    java.lang.String var90 = var88.toString();
    boolean var91 = var83.equals((java.lang.Object)var90);
    br.com.addvisor.model.User var92 = new br.com.addvisor.model.User("hi!", "", "hi!", "User [id=null, name=null, email=null, password=null, phone=null, city=null]", var83);
    var75.setCity(var83);
    java.lang.Long var94 = var75.getId();
    br.com.addvisor.model.City var95 = var75.getCity();
    int var96 = var6.compareTo(var95);
    java.lang.String var97 = var95.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "null\nnull\nnull"+ "'", var1.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "null\nnull\nnull"+ "'", var13.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == (-6));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "null\nnull\nnull"+ "'", var28.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "null\nnull\nnull"+ "'", var42.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == (-19));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var77 + "' != '" + "null\nnull\nnull"+ "'", var77.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var90 + "' != '" + "null\nnull\nnull"+ "'", var90.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var91 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var94);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var95);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var96 == (-25));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var97 + "' != '" + "null\nnull\nnull"+ "'", var97.equals("null\nnull\nnull"));

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test38");


    br.com.addvisor.model.Address var8 = new br.com.addvisor.model.Address();
    java.lang.String var9 = var8.getComplement();
    java.lang.String var10 = var8.toString();
    java.lang.String var11 = var8.getComplement();
    br.com.addvisor.model.City var16 = new br.com.addvisor.model.City();
    var16.setName("hi!");
    var16.setName("null\nnull\nnull");
    br.com.addvisor.model.Address var21 = new br.com.addvisor.model.Address();
    java.lang.String var22 = var21.getComplement();
    java.lang.String var23 = var21.toString();
    boolean var24 = var16.equals((java.lang.Object)var23);
    br.com.addvisor.model.User var25 = new br.com.addvisor.model.User("hi!", "", "hi!", "User [id=null, name=null, email=null, password=null, phone=null, city=null]", var16);
    var8.setCity(var16);
    java.lang.Long var27 = var8.getId();
    br.com.addvisor.model.City var28 = var8.getCity();
    br.com.addvisor.model.State var29 = var28.getState();
    br.com.addvisor.model.User var30 = new br.com.addvisor.model.User("User [id=null, name=null, email=null, password=null, phone=null, city=null]", "Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]]", "User [id=null, name=null, email=null, password=21c96d96756cfeed7f71110d9cb1788b, phone=Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]], city=null]", "User [id=null, name=null, email=null, password=null, phone=null, city=null]", var28);
    java.lang.String var31 = var28.toString();
    br.com.addvisor.model.User var32 = new br.com.addvisor.model.User("Evaluate [id=null, user=null, service=null, note=10.0, comment=null]", "User [id=null, name=null, email=null, password=null, phone=null, city=null]", "null\nnull\nnull\nEvaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]]\nnull", "Evaluate [id=0, user=User [id=-1, name=User [id=null, name=null, email=User [id=null, name=null, email=null, password=null, phone=null, city=null], password=null, phone=null, city=null], email=null, password=21c96d96756cfeed7f71110d9cb1788b, phone=null\nnull\nnull, city=null], service=null, note=null, comment=null]", var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "null\nnull\nnull"+ "'", var10.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "null\nnull\nnull"+ "'", var23.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "null\nnull\nnull"+ "'", var31.equals("null\nnull\nnull"));

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test39");


    br.com.addvisor.model.Service var0 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var1 = new br.com.addvisor.model.User();
    boolean var3 = var1.equals((java.lang.Object)(-1L));
    java.lang.String var4 = var1.toString();
    java.lang.String var5 = var1.getPassword();
    var0.setUser(var1);
    br.com.addvisor.model.Address var7 = var0.getAddress();
    java.lang.String var8 = var0.getTags();
    br.com.addvisor.model.Agenda var9 = new br.com.addvisor.model.Agenda();
    java.util.List var10 = var9.getNames();
    java.util.List var11 = var9.getNumbers();
    var0.setPhones(var11);
    var0.setDescription("User [id=null, name=null, email=User [id=null, name=null, email=null, password=null, phone=null, city=null], password=null, phone=null, city=null]");
    var0.setMedia((java.lang.Float)1.0f);
    java.lang.String var17 = var0.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var4.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "User [id=null, name=null, email=User [id=null, name=null, email=null, password=null, phone=null, city=null], password=null, phone=null, city=null]"+ "'", var17.equals("User [id=null, name=null, email=User [id=null, name=null, email=null, password=null, phone=null, city=null], password=null, phone=null, city=null]"));

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test40");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.addvisor.model.enums.PriceCat var1 = br.com.addvisor.model.enums.PriceCat.getPrice("6a526e9ea8abcc547d30e98aac13c6cc");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test41");


    br.com.addvisor.model.User var2 = new br.com.addvisor.model.User("Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]\n\nnull", "Evaluate [id=10, user=null, service=null, note=null, comment=null]");

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test42");


    br.com.addvisor.model.City var2 = new br.com.addvisor.model.City();
    var2.setName("hi!");
    var2.setName("null\nnull\nnull");
    br.com.addvisor.model.Address var7 = new br.com.addvisor.model.Address();
    java.lang.String var8 = var7.getComplement();
    java.lang.String var9 = var7.toString();
    boolean var10 = var2.equals((java.lang.Object)var9);
    br.com.addvisor.model.State var11 = new br.com.addvisor.model.State();
    var11.setId((java.lang.Long)1L);
    var11.setName("null\nnull\nnull");
    var11.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var18 = var11.getUf();
    var2.setState(var11);
    br.com.addvisor.model.State var20 = var2.getState();
    var2.setId((java.lang.Long)(-1L));
    br.com.addvisor.model.Address var23 = new br.com.addvisor.model.Address("null - null", " - ", var2);
    var2.setName("User [id=null, name=null, email=null, password=4238a597ad0f3ff8363f52f6e8c3507, phone=Evaluate [id=0, user=null, service=null, note=null, comment=null], city=null]");
    br.com.addvisor.model.State var26 = var2.getState();
    java.lang.Long var27 = var26.getId();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "null\nnull\nnull"+ "'", var9.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + 1L+ "'", var27.equals(1L));

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test43");


    br.com.addvisor.model.User var2 = new br.com.addvisor.model.User();
    boolean var4 = var2.equals((java.lang.Object)(-1L));
    java.lang.String var5 = var2.toString();
    java.lang.String var6 = var2.getPassword();
    java.lang.String var7 = var2.getPassword();
    var2.setName("User [id=null, name=null, email=User [id=null, name=null, email=null, password=null, phone=null, city=null], password=null, phone=null, city=null]");
    br.com.addvisor.model.User var14 = new br.com.addvisor.model.User();
    boolean var16 = var14.equals((java.lang.Object)(-1L));
    java.lang.String var17 = var14.getEmail();
    java.lang.String var18 = var14.getName();
    java.lang.String var19 = var14.getPhone();
    java.lang.String var20 = var14.getName();
    br.com.addvisor.model.Address var21 = new br.com.addvisor.model.Address();
    java.lang.String var22 = var21.toString();
    br.com.addvisor.model.City var23 = new br.com.addvisor.model.City();
    var23.setName("hi!");
    var21.setCity(var23);
    br.com.addvisor.model.City var27 = new br.com.addvisor.model.City();
    var27.setName("hi!");
    var27.setName("null\nnull\nnull");
    br.com.addvisor.model.Address var32 = new br.com.addvisor.model.Address();
    java.lang.String var33 = var32.getComplement();
    java.lang.String var34 = var32.toString();
    boolean var35 = var27.equals((java.lang.Object)var34);
    br.com.addvisor.model.State var36 = new br.com.addvisor.model.State();
    var36.setId((java.lang.Long)1L);
    var36.setName("null\nnull\nnull");
    var36.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var43 = var36.getUf();
    var27.setState(var36);
    int var45 = var23.compareTo(var27);
    java.lang.Long var46 = var23.getId();
    br.com.addvisor.model.Service var47 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var48 = new br.com.addvisor.model.User();
    boolean var50 = var48.equals((java.lang.Object)(-1L));
    java.lang.String var51 = var48.toString();
    java.lang.String var52 = var48.getPassword();
    var47.setUser(var48);
    boolean var54 = var23.equals((java.lang.Object)var48);
    br.com.addvisor.model.State var55 = var23.getState();
    var14.setCity(var23);
    br.com.addvisor.model.User var57 = new br.com.addvisor.model.User("User [id=null, name=Country [id=null, name=Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null], acronym=User [id=-1, name=null, email=null, password=21c96d96756cfeed7f71110d9cb1788b, phone=null\nnull\nnull, city=null]], email= - , password=bab90b8667e900a415ffe18829d9e6f9, phone=Country [id=null, name=Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null], acronym=User [id=-1, name=null, email=null, password=21c96d96756cfeed7f71110d9cb1788b, phone=null\nnull\nnull, city=null]], city=hi!]", "null - User [id=null, name=null, email=null, password=null, phone=null, city=null]", "null\nhi!\nnull\nnull\nnull", "User [id=null, name=null, email=null, password=21c96d96756cfeed7f71110d9cb1788b, phone=Service [id=10, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null], city=null]", var23);
    var2.setCity(var23);
    br.com.addvisor.model.Address var59 = new br.com.addvisor.model.Address("User [id=null, name=null, email=null, password=null, phone=User [id=null, name=null, email=null, password=null, phone=null, city=null], city=null]", "Evaluate [id=0, user=null, service=Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null], note=null, comment=Evaluate [id=0, user=null, service=null, note=null, comment=null]]", var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var5.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "null\nnull\nnull"+ "'", var22.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "null\nnull\nnull"+ "'", var34.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == (-6));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var51.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test44");


    br.com.addvisor.model.Address var2 = new br.com.addvisor.model.Address();
    java.lang.String var3 = var2.toString();
    br.com.addvisor.model.City var4 = new br.com.addvisor.model.City();
    var4.setName("hi!");
    var2.setCity(var4);
    br.com.addvisor.model.City var8 = new br.com.addvisor.model.City();
    var8.setName("hi!");
    var8.setName("null\nnull\nnull");
    br.com.addvisor.model.Address var13 = new br.com.addvisor.model.Address();
    java.lang.String var14 = var13.getComplement();
    java.lang.String var15 = var13.toString();
    boolean var16 = var8.equals((java.lang.Object)var15);
    br.com.addvisor.model.State var17 = new br.com.addvisor.model.State();
    var17.setId((java.lang.Long)1L);
    var17.setName("null\nnull\nnull");
    var17.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var24 = var17.getUf();
    var8.setState(var17);
    int var26 = var4.compareTo(var8);
    br.com.addvisor.model.Address var27 = new br.com.addvisor.model.Address("Country [id=null, name=null\nnull\nnull, acronym=null]", "Country [id=null, name=Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null], acronym=User [id=-1, name=null, email=null, password=21c96d96756cfeed7f71110d9cb1788b, phone=null\nnull\nnull, city=null]]", var4);
    java.lang.String var28 = var27.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "null\nnull\nnull"+ "'", var3.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "null\nnull\nnull"+ "'", var15.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == (-6));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "Country [id=null, name=null\nnull\nnull, acronym=null]\nCountry [id=null, name=Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null], acronym=User [id=-1, name=null, email=null, password=21c96d96756cfeed7f71110d9cb1788b, phone=null\nnull\nnull, city=null]]\nhi!"+ "'", var28.equals("Country [id=null, name=null\nnull\nnull, acronym=null]\nCountry [id=null, name=Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null], acronym=User [id=-1, name=null, email=null, password=21c96d96756cfeed7f71110d9cb1788b, phone=null\nnull\nnull, city=null]]\nhi!"));

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test45");


    br.com.addvisor.model.City var6 = new br.com.addvisor.model.City();
    var6.setName("hi!");
    var6.setName("null\nnull\nnull");
    br.com.addvisor.model.Address var11 = new br.com.addvisor.model.Address();
    java.lang.String var12 = var11.getComplement();
    java.lang.String var13 = var11.toString();
    boolean var14 = var6.equals((java.lang.Object)var13);
    br.com.addvisor.model.User var15 = new br.com.addvisor.model.User("hi!", "", "hi!", "User [id=null, name=null, email=null, password=null, phone=null, city=null]", var6);
    br.com.addvisor.model.Address var16 = new br.com.addvisor.model.Address("hi!", "User [id=null, name=null, email=null, password=null, phone=null, city=null]", var6);
    java.lang.Long var17 = var6.getId();
    br.com.addvisor.model.State var18 = var6.getState();
    br.com.addvisor.model.State var19 = new br.com.addvisor.model.State();
    boolean var21 = var19.equals((java.lang.Object)(byte)100);
    br.com.addvisor.model.State var22 = new br.com.addvisor.model.State();
    var22.setId((java.lang.Long)1L);
    int var25 = var19.compareTo(var22);
    java.lang.Long var26 = var22.getId();
    java.lang.Long var27 = var22.getId();
    br.com.addvisor.model.Country var28 = new br.com.addvisor.model.Country();
    java.lang.Integer var29 = var28.getId();
    java.lang.String var30 = var28.getName();
    var28.setAcronym("Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]]");
    java.lang.String var33 = var28.getName();
    java.lang.String var34 = var28.getName();
    br.com.addvisor.model.State var35 = new br.com.addvisor.model.State();
    boolean var37 = var35.equals((java.lang.Object)(byte)100);
    br.com.addvisor.model.State var38 = new br.com.addvisor.model.State();
    boolean var40 = var38.equals((java.lang.Object)(byte)100);
    var38.setUf("null\nnull\nnull");
    br.com.addvisor.model.State var43 = new br.com.addvisor.model.State();
    int var44 = var38.compareTo(var43);
    java.lang.String var45 = var43.getName();
    var43.setId((java.lang.Long)10L);
    java.lang.Long var48 = var43.getId();
    int var49 = var35.compareTo(var43);
    boolean var50 = var28.equals((java.lang.Object)var35);
    int var51 = var22.compareTo(var35);
    boolean var52 = var6.equals((java.lang.Object)var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "null\nnull\nnull"+ "'", var13.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + 1L+ "'", var26.equals(1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + 1L+ "'", var27.equals(1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + 10L+ "'", var48.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test46");


    br.com.addvisor.model.Evaluate var0 = new br.com.addvisor.model.Evaluate();
    br.com.addvisor.model.State var1 = new br.com.addvisor.model.State();
    boolean var3 = var1.equals((java.lang.Object)(byte)100);
    var1.setUf("null\nnull\nnull");
    boolean var6 = var0.equals((java.lang.Object)var1);
    br.com.addvisor.model.Service var7 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var8 = new br.com.addvisor.model.User();
    boolean var10 = var8.equals((java.lang.Object)(-1L));
    java.lang.String var11 = var8.toString();
    java.lang.String var12 = var8.getPassword();
    var7.setUser(var8);
    br.com.addvisor.model.Address var14 = var7.getAddress();
    var0.setService(var7);
    br.com.addvisor.model.Service var16 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var17 = new br.com.addvisor.model.User();
    boolean var19 = var17.equals((java.lang.Object)(-1L));
    java.lang.String var20 = var17.toString();
    java.lang.String var21 = var17.getPassword();
    var16.setUser(var17);
    br.com.addvisor.model.Address var23 = var16.getAddress();
    java.lang.String var24 = var16.getName();
    var16.setId((java.lang.Long)1L);
    java.lang.Long var27 = var16.getId();
    var0.setService(var16);
    java.lang.Float var29 = var0.getNote();
    br.com.addvisor.model.Service var30 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var31 = new br.com.addvisor.model.User();
    boolean var33 = var31.equals((java.lang.Object)(-1L));
    java.lang.String var34 = var31.toString();
    java.lang.String var35 = var31.getPassword();
    var30.setUser(var31);
    br.com.addvisor.model.Address var37 = var30.getAddress();
    var0.setService(var30);
    br.com.addvisor.model.Service var39 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var40 = new br.com.addvisor.model.User();
    boolean var42 = var40.equals((java.lang.Object)(-1L));
    java.lang.String var43 = var40.toString();
    java.lang.String var44 = var40.getPassword();
    var39.setUser(var40);
    br.com.addvisor.model.Address var46 = var39.getAddress();
    br.com.addvisor.model.enums.ServiceCat var47 = var39.getCategory();
    var0.setService(var39);
    var0.setId((java.lang.Long)0L);
    br.com.addvisor.model.User var51 = var0.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var11.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var20.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + 1L+ "'", var27.equals(1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var34.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var43.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test47");


    br.com.addvisor.model.Service var0 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var1 = new br.com.addvisor.model.User();
    boolean var3 = var1.equals((java.lang.Object)(-1L));
    java.lang.String var4 = var1.toString();
    java.lang.String var5 = var1.getPassword();
    var0.setUser(var1);
    br.com.addvisor.model.Address var7 = var0.getAddress();
    java.lang.String var8 = var0.getName();
    java.lang.String var9 = var0.getDescription();
    br.com.addvisor.model.Address var10 = new br.com.addvisor.model.Address();
    java.lang.String var11 = var10.toString();
    br.com.addvisor.model.City var12 = new br.com.addvisor.model.City();
    var12.setName("hi!");
    var10.setCity(var12);
    var10.setLocation("");
    java.lang.String var18 = var10.getLocation();
    var0.setAddress(var10);
    java.lang.Float var20 = var0.getMedia();
    java.lang.String var21 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var4.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "null\nnull\nnull"+ "'", var11.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "Service [id=null, name=null, description=null, tags=null, media=null, address=\nnull\nhi!, category=null, phones=null]"+ "'", var21.equals("Service [id=null, name=null, description=null, tags=null, media=null, address=\nnull\nhi!, category=null, phones=null]"));

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test48");


    br.com.addvisor.model.City var2 = new br.com.addvisor.model.City();
    br.com.addvisor.model.State var3 = var2.getState();
    java.lang.Long var4 = var2.getId();
    br.com.addvisor.model.Address var5 = new br.com.addvisor.model.Address("Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]", "null - null", var2);
    var5.setComplement("");
    var5.setId((java.lang.Long)1L);
    java.lang.String var10 = var5.toString();
    java.lang.String var11 = var5.toString();
    java.lang.Long var12 = var5.getId();
    br.com.addvisor.model.User var13 = new br.com.addvisor.model.User();
    boolean var15 = var13.equals((java.lang.Object)(-1L));
    java.lang.String var16 = var13.toString();
    java.lang.String var17 = var13.getPassword();
    java.lang.String var18 = var13.getName();
    java.lang.String var19 = var13.getPassword();
    java.lang.String var20 = var13.getName();
    br.com.addvisor.model.Service var21 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var22 = new br.com.addvisor.model.User();
    boolean var24 = var22.equals((java.lang.Object)(-1L));
    java.lang.String var25 = var22.toString();
    java.lang.String var26 = var22.getPassword();
    var21.setUser(var22);
    br.com.addvisor.model.Address var28 = var21.getAddress();
    java.lang.String var29 = var21.getName();
    br.com.addvisor.model.Address var30 = var21.getAddress();
    br.com.addvisor.model.User var31 = new br.com.addvisor.model.User();
    boolean var33 = var31.equals((java.lang.Object)(-1L));
    java.lang.String var34 = var31.toString();
    br.com.addvisor.model.Evaluate var35 = new br.com.addvisor.model.Evaluate();
    var35.setId((java.lang.Long)10L);
    var35.setId((java.lang.Long)0L);
    br.com.addvisor.model.User var40 = var35.getUser();
    boolean var41 = var31.equals((java.lang.Object)var35);
    java.lang.String var42 = var31.getPassword();
    var31.setId((java.lang.Long)(-1L));
    java.lang.String var45 = var31.getPhone();
    var21.setUser(var31);
    br.com.addvisor.model.Evaluate var49 = new br.com.addvisor.model.Evaluate(var13, var21, (java.lang.Float)10.0f, "User [id=null, name=null, email=null, password=null, phone=null, city=null] - null");
    br.com.addvisor.model.Address var50 = new br.com.addvisor.model.Address();
    java.lang.String var51 = var50.getComplement();
    java.lang.String var52 = var50.toString();
    var50.setComplement("Service [id=null, name=null, description=null, tags=null, media=null, address=null\nnull\nnull, category=null, phones=null]");
    var21.setAddress(var50);
    java.lang.String var56 = var50.getLocation();
    br.com.addvisor.model.City var63 = new br.com.addvisor.model.City();
    var63.setName("hi!");
    var63.setName("null\nnull\nnull");
    br.com.addvisor.model.Address var68 = new br.com.addvisor.model.Address();
    java.lang.String var69 = var68.getComplement();
    java.lang.String var70 = var68.toString();
    boolean var71 = var63.equals((java.lang.Object)var70);
    br.com.addvisor.model.User var72 = new br.com.addvisor.model.User("hi!", "", "hi!", "User [id=null, name=null, email=null, password=null, phone=null, city=null]", var63);
    br.com.addvisor.model.Address var73 = new br.com.addvisor.model.Address("null\nnull\nnull", "User [id=null, name=null, email=null, password=null, phone=null, city=null]", var63);
    java.lang.Long var74 = var63.getId();
    java.lang.Long var75 = var63.getId();
    var50.setCity(var63);
    var5.setCity(var63);
    var63.setId((java.lang.Long)(-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]\n\nnull"+ "'", var10.equals("Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]\n\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]\n\nnull"+ "'", var11.equals("Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]\n\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + 1L+ "'", var12.equals(1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var16.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var25.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var34.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "null\nnull\nnull"+ "'", var52.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var70 + "' != '" + "null\nnull\nnull"+ "'", var70.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var75);

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test49");


    br.com.addvisor.model.State var0 = new br.com.addvisor.model.State();
    boolean var2 = var0.equals((java.lang.Object)(byte)100);
    var0.setUf("null\nnull\nnull");
    br.com.addvisor.model.State var5 = new br.com.addvisor.model.State();
    int var6 = var0.compareTo(var5);
    var5.setName("");
    br.com.addvisor.model.Country var9 = new br.com.addvisor.model.Country();
    java.lang.Integer var10 = var9.getId();
    var5.setCountry(var9);
    java.lang.String var12 = var9.getName();
    var9.setId((java.lang.Integer)(-43));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test50");


    br.com.addvisor.model.Evaluate var0 = new br.com.addvisor.model.Evaluate();
    br.com.addvisor.model.State var1 = new br.com.addvisor.model.State();
    boolean var3 = var1.equals((java.lang.Object)(byte)100);
    var1.setUf("null\nnull\nnull");
    boolean var6 = var0.equals((java.lang.Object)var1);
    br.com.addvisor.model.Service var7 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var8 = new br.com.addvisor.model.User();
    boolean var10 = var8.equals((java.lang.Object)(-1L));
    java.lang.String var11 = var8.toString();
    java.lang.String var12 = var8.getPassword();
    var7.setUser(var8);
    br.com.addvisor.model.Address var14 = var7.getAddress();
    java.lang.String var15 = var7.getDescription();
    boolean var16 = var0.equals((java.lang.Object)var7);
    br.com.addvisor.model.Evaluate var17 = new br.com.addvisor.model.Evaluate();
    var17.setId((java.lang.Long)10L);
    var17.setId((java.lang.Long)0L);
    br.com.addvisor.model.User var22 = var17.getUser();
    java.lang.Long var23 = var17.getId();
    br.com.addvisor.model.Service var24 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var25 = new br.com.addvisor.model.User();
    boolean var27 = var25.equals((java.lang.Object)(-1L));
    java.lang.String var28 = var25.toString();
    java.lang.String var29 = var25.getPassword();
    var24.setUser(var25);
    br.com.addvisor.model.Address var31 = var24.getAddress();
    java.lang.String var32 = var24.getDescription();
    var17.setService(var24);
    boolean var34 = var7.equals((java.lang.Object)var24);
    var24.setMedia((java.lang.Float)1.0f);
    var24.setId((java.lang.Long)1L);
    br.com.addvisor.model.enums.ServiceCat var39 = var24.getCategory();
    br.com.addvisor.model.User var40 = var24.getUser();
    var40.setPhone("User [id=null, name=null, email=null, password=null, phone=Evaluate [id=0, user=null, service=Service [id=null, name=null, description=null, tags=null, media=null, address=null\nnull\nnull, category=null, phones=null], note=0.0, comment=null], city=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var11.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + 0L+ "'", var23.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var28.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test51");


    br.com.addvisor.model.Evaluate var0 = new br.com.addvisor.model.Evaluate();
    var0.setId((java.lang.Long)10L);
    var0.setId((java.lang.Long)0L);
    br.com.addvisor.model.Service var5 = var0.getService();
    br.com.addvisor.model.User var8 = new br.com.addvisor.model.User("Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]]", "User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.Long var9 = var8.getId();
    var8.setId((java.lang.Long)(-1L));
    var8.setPhone("null\nnull\nnull");
    java.lang.String var14 = var8.getEmail();
    var8.setName("User [id=null, name=null, email=User [id=null, name=null, email=null, password=null, phone=null, city=null], password=null, phone=null, city=null]");
    var0.setUser(var8);
    br.com.addvisor.model.Address var18 = new br.com.addvisor.model.Address();
    java.lang.String var19 = var18.toString();
    br.com.addvisor.model.City var20 = new br.com.addvisor.model.City();
    var20.setName("hi!");
    var20.setName("null\nnull\nnull");
    var18.setCity(var20);
    java.lang.String var26 = var20.getName();
    br.com.addvisor.model.State var27 = var20.getState();
    var8.setCity(var20);
    java.lang.String var29 = var8.getPassword();
    br.com.addvisor.model.City var30 = var8.getCity();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "null\nnull\nnull"+ "'", var19.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "null\nnull\nnull"+ "'", var26.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "21c96d96756cfeed7f71110d9cb1788b"+ "'", var29.equals("21c96d96756cfeed7f71110d9cb1788b"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test52");


    br.com.addvisor.model.Evaluate var0 = new br.com.addvisor.model.Evaluate();
    var0.setId((java.lang.Long)10L);
    var0.setId((java.lang.Long)0L);
    br.com.addvisor.model.User var5 = var0.getUser();
    java.lang.Long var6 = var0.getId();
    br.com.addvisor.model.Service var7 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var8 = new br.com.addvisor.model.User();
    boolean var10 = var8.equals((java.lang.Object)(-1L));
    java.lang.String var11 = var8.toString();
    java.lang.String var12 = var8.getPassword();
    var7.setUser(var8);
    br.com.addvisor.model.Address var14 = var7.getAddress();
    java.lang.String var15 = var7.getDescription();
    var0.setService(var7);
    br.com.addvisor.model.Evaluate var17 = new br.com.addvisor.model.Evaluate();
    br.com.addvisor.model.State var18 = new br.com.addvisor.model.State();
    boolean var20 = var18.equals((java.lang.Object)(byte)100);
    var18.setUf("null\nnull\nnull");
    boolean var23 = var17.equals((java.lang.Object)var18);
    br.com.addvisor.model.Service var24 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var25 = new br.com.addvisor.model.User();
    boolean var27 = var25.equals((java.lang.Object)(-1L));
    java.lang.String var28 = var25.toString();
    java.lang.String var29 = var25.getPassword();
    var24.setUser(var25);
    br.com.addvisor.model.Address var31 = var24.getAddress();
    var17.setService(var24);
    br.com.addvisor.model.enums.ServiceCat var33 = var24.getCategory();
    br.com.addvisor.model.Address var34 = new br.com.addvisor.model.Address();
    var34.setId((java.lang.Long)0L);
    var24.setAddress(var34);
    var0.setService(var24);
    java.lang.String var39 = var0.getComment();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + 0L+ "'", var6.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var11.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var28.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test53");


    br.com.addvisor.model.State var0 = new br.com.addvisor.model.State();
    var0.setId((java.lang.Long)1L);
    var0.setName("null\nnull\nnull");
    var0.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var7 = var0.getUf();
    br.com.addvisor.model.Country var8 = var0.getCountry();
    br.com.addvisor.model.State var9 = new br.com.addvisor.model.State();
    boolean var11 = var9.equals((java.lang.Object)(byte)100);
    var9.setUf("null\nnull\nnull");
    br.com.addvisor.model.State var14 = new br.com.addvisor.model.State();
    int var15 = var9.compareTo(var14);
    var14.setName("");
    br.com.addvisor.model.Country var18 = new br.com.addvisor.model.Country();
    java.lang.Integer var19 = var18.getId();
    var14.setCountry(var18);
    br.com.addvisor.model.Country var21 = new br.com.addvisor.model.Country();
    var14.setCountry(var21);
    int var23 = var0.compareTo(var14);
    br.com.addvisor.model.City var24 = new br.com.addvisor.model.City();
    var24.setName("hi!");
    var24.setName("null\nnull\nnull");
    br.com.addvisor.model.Address var29 = new br.com.addvisor.model.Address();
    java.lang.String var30 = var29.getComplement();
    java.lang.String var31 = var29.toString();
    boolean var32 = var24.equals((java.lang.Object)var31);
    br.com.addvisor.model.User var33 = new br.com.addvisor.model.User();
    br.com.addvisor.model.State var34 = new br.com.addvisor.model.State();
    var34.setId((java.lang.Long)1L);
    var34.setName("null\nnull\nnull");
    var34.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var41 = var34.getUf();
    boolean var42 = var33.equals((java.lang.Object)var34);
    var24.setState(var34);
    br.com.addvisor.model.Evaluate var44 = new br.com.addvisor.model.Evaluate();
    var44.setId((java.lang.Long)10L);
    var44.setId((java.lang.Long)0L);
    br.com.addvisor.model.User var49 = var44.getUser();
    boolean var50 = var24.equals((java.lang.Object)var44);
    br.com.addvisor.model.State var51 = new br.com.addvisor.model.State();
    boolean var53 = var51.equals((java.lang.Object)(byte)100);
    var51.setUf("null\nnull\nnull");
    br.com.addvisor.model.State var56 = new br.com.addvisor.model.State();
    int var57 = var51.compareTo(var56);
    java.lang.String var58 = var56.getName();
    var24.setState(var56);
    br.com.addvisor.model.State var60 = new br.com.addvisor.model.State();
    boolean var62 = var60.equals((java.lang.Object)(byte)100);
    var60.setUf("null\nnull\nnull");
    br.com.addvisor.model.State var65 = new br.com.addvisor.model.State();
    int var66 = var60.compareTo(var65);
    var65.setName("");
    br.com.addvisor.model.Country var69 = new br.com.addvisor.model.Country();
    java.lang.Integer var70 = var69.getId();
    var65.setCountry(var69);
    java.lang.String var72 = var69.getName();
    var56.setCountry(var69);
    java.lang.String var74 = var69.getAcronym();
    java.lang.String var75 = var69.getAcronym();
    var69.setId((java.lang.Integer)0);
    var14.setCountry(var69);
    java.lang.String var79 = var69.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "null\nnull\nnull"+ "'", var31.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var79);

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test54");


    br.com.addvisor.model.User var0 = new br.com.addvisor.model.User();
    boolean var2 = var0.equals((java.lang.Object)(-1L));
    java.lang.String var3 = var0.getDDD();
    var0.setPhone("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    br.com.addvisor.model.Address var6 = new br.com.addvisor.model.Address();
    java.lang.String var7 = var6.toString();
    br.com.addvisor.model.City var8 = new br.com.addvisor.model.City();
    var8.setName("hi!");
    var8.setName("null\nnull\nnull");
    var6.setCity(var8);
    var0.setCity(var8);
    var0.setPassword("Evaluate [id=0, user=User [id=null, name=null, email=null, password=null, phone=null, city=null], service=Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null], note=null, comment=null]");
    br.com.addvisor.model.City var17 = var0.getCity();
    var0.setEmail("Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]\n\nnull");
    br.com.addvisor.model.Evaluate var20 = new br.com.addvisor.model.Evaluate();
    var20.setId((java.lang.Long)10L);
    var20.setId((java.lang.Long)0L);
    var20.setComment("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    br.com.addvisor.model.Service var27 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var28 = new br.com.addvisor.model.User();
    boolean var30 = var28.equals((java.lang.Object)(-1L));
    java.lang.String var31 = var28.toString();
    java.lang.String var32 = var28.getPassword();
    var27.setUser(var28);
    br.com.addvisor.model.Address var34 = var27.getAddress();
    java.lang.String var35 = var27.getName();
    var20.setService(var27);
    var27.setDescription("");
    java.lang.String var39 = var27.getTags();
    br.com.addvisor.model.Evaluate var42 = new br.com.addvisor.model.Evaluate(var0, var27, (java.lang.Float)10.0f, "User [id=null, name=User [id=null, name=null, email=User [id=null, name=null, email=null, password=null, phone=null, city=null], password=null, phone=null, city=null], email=null, password=null, phone=null, city=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "null\nnull\nnull"+ "'", var7.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var31.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test55");


    br.com.addvisor.model.Country var0 = new br.com.addvisor.model.Country();
    java.lang.Integer var1 = var0.getId();
    java.lang.Integer var2 = var0.getId();
    var0.setId((java.lang.Integer)(-6));
    java.lang.String var5 = var0.toString();
    var0.setId((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Country [id=-6, name=null, acronym=null]"+ "'", var5.equals("Country [id=-6, name=null, acronym=null]"));

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test56");


    br.com.addvisor.model.Address var4 = new br.com.addvisor.model.Address();
    java.lang.String var5 = var4.toString();
    br.com.addvisor.model.City var6 = new br.com.addvisor.model.City();
    var6.setName("hi!");
    var4.setCity(var6);
    br.com.addvisor.model.State var10 = var6.getState();
    br.com.addvisor.model.State var11 = var6.getState();
    var6.setId((java.lang.Long)(-1L));
    br.com.addvisor.model.User var14 = new br.com.addvisor.model.User("Country [id=null, name=null, acronym=null\nnull\nnull]", "Service [id=1, name=Service [id=10, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null], description=null, tags=null, media=null, address=null\nnull\nnull, category=null, phones=null]", "hi! - User [id=null, name=null, email=null, password=null, phone=null, city=null] - null", "Evaluate [id=null, user=User [id=null, name=null, email=User [id=null, name=null, email=null, password=null, phone=null, city=null], password=null, phone=null, city=null], service=Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null], note=1.0, comment=User [id=null, name=null, email=null, password=21c96d96756cfeed7f71110d9cb1788b, phone=Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]], city=null]]", var6);
    java.lang.String var15 = var6.toString();
    java.lang.String var16 = var6.toString();
    br.com.addvisor.model.User var17 = new br.com.addvisor.model.User();
    boolean var19 = var17.equals((java.lang.Object)(-1L));
    java.lang.String var20 = var17.toString();
    java.lang.String var21 = var17.getName();
    java.lang.String var22 = var17.getName();
    java.lang.String var23 = var17.getName();
    java.lang.String var24 = var17.getPassword();
    br.com.addvisor.model.City var25 = var17.getCity();
    boolean var26 = var6.equals((java.lang.Object)var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "null\nnull\nnull"+ "'", var5.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var20.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test57");


    br.com.addvisor.model.City var6 = new br.com.addvisor.model.City();
    var6.setName("hi!");
    var6.setName("null\nnull\nnull");
    br.com.addvisor.model.Address var11 = new br.com.addvisor.model.Address();
    java.lang.String var12 = var11.getComplement();
    java.lang.String var13 = var11.toString();
    boolean var14 = var6.equals((java.lang.Object)var13);
    br.com.addvisor.model.User var15 = new br.com.addvisor.model.User("hi!", "", "hi!", "User [id=null, name=null, email=null, password=null, phone=null, city=null]", var6);
    br.com.addvisor.model.Address var16 = new br.com.addvisor.model.Address("null\nnull\nnull", "User [id=null, name=null, email=null, password=null, phone=null, city=null]", var6);
    var16.setComplement("");
    var16.setId((java.lang.Long)0L);
    java.lang.Long var21 = var16.getId();
    java.lang.String var22 = var16.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "null\nnull\nnull"+ "'", var13.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + 0L+ "'", var21.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "null\nnull\nnull\n\nnull\nnull\nnull"+ "'", var22.equals("null\nnull\nnull\n\nnull\nnull\nnull"));

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test58");


    br.com.addvisor.model.Evaluate var0 = new br.com.addvisor.model.Evaluate();
    br.com.addvisor.model.Service var1 = var0.getService();
    br.com.addvisor.model.City var4 = new br.com.addvisor.model.City();
    br.com.addvisor.model.Address var5 = new br.com.addvisor.model.Address("null\nnull\nnull", "Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]]", var4);
    br.com.addvisor.model.State var6 = new br.com.addvisor.model.State();
    boolean var8 = var6.equals((java.lang.Object)(byte)100);
    var6.setUf("null\nnull\nnull");
    br.com.addvisor.model.State var11 = new br.com.addvisor.model.State();
    int var12 = var6.compareTo(var11);
    var11.setName("");
    var4.setState(var11);
    var11.setId((java.lang.Long)100L);
    br.com.addvisor.model.State var18 = new br.com.addvisor.model.State();
    boolean var20 = var18.equals((java.lang.Object)(byte)100);
    var18.setUf("null\nnull\nnull");
    br.com.addvisor.model.State var23 = new br.com.addvisor.model.State();
    int var24 = var18.compareTo(var23);
    var23.setName("");
    int var27 = var11.compareTo(var23);
    boolean var28 = var0.equals((java.lang.Object)var11);
    br.com.addvisor.model.User var31 = new br.com.addvisor.model.User("User [id=null, name=null, email=User [id=null, name=null, email=null, password=null, phone=null, city=null], password=null, phone=null, city=null]", "");
    var0.setUser(var31);
    var31.setName("Service [id=1, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]");
    br.com.addvisor.model.Address var35 = new br.com.addvisor.model.Address();
    java.lang.String var36 = var35.toString();
    br.com.addvisor.model.City var37 = new br.com.addvisor.model.City();
    var37.setName("hi!");
    var35.setCity(var37);
    var37.setId((java.lang.Long)10L);
    br.com.addvisor.model.City var43 = new br.com.addvisor.model.City();
    var43.setName("hi!");
    var43.setName("null\nnull\nnull");
    br.com.addvisor.model.Address var48 = new br.com.addvisor.model.Address();
    java.lang.String var49 = var48.getComplement();
    java.lang.String var50 = var48.toString();
    boolean var51 = var43.equals((java.lang.Object)var50);
    br.com.addvisor.model.State var52 = new br.com.addvisor.model.State();
    var52.setId((java.lang.Long)1L);
    var52.setName("null\nnull\nnull");
    var52.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var59 = var52.getUf();
    var43.setState(var52);
    boolean var61 = var37.equals((java.lang.Object)var43);
    var31.setCity(var43);
    br.com.addvisor.model.Address var63 = new br.com.addvisor.model.Address();
    java.lang.String var64 = var63.getComplement();
    java.lang.String var65 = var63.toString();
    br.com.addvisor.model.City var66 = var63.getCity();
    br.com.addvisor.model.State var67 = new br.com.addvisor.model.State();
    var67.setId((java.lang.Long)1L);
    var67.setName("null\nnull\nnull");
    var67.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var74 = var67.getUf();
    boolean var75 = var63.equals((java.lang.Object)var67);
    java.lang.Long var76 = var67.getId();
    boolean var78 = var67.equals((java.lang.Object)"User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    var67.setId((java.lang.Long)10L);
    var43.setState(var67);
    br.com.addvisor.model.State var82 = var43.getState();
    var82.setUf("Evaluate [id=100, user=User [id=null, name=User [id=null, name=null, email=User [id=null, name=null, email=null, password=null, phone=null, city=null], password=null, phone=null, city=null], email=null, password=null, phone=null, city=null], service=Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null], note=0.0, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]]");
    java.lang.String var85 = var82.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "null\nnull\nnull"+ "'", var36.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + "null\nnull\nnull"+ "'", var50.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var65 + "' != '" + "null\nnull\nnull"+ "'", var65.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var76 + "' != '" + 1L+ "'", var76.equals(1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var85 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var85.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test59");


    br.com.addvisor.model.Address var0 = new br.com.addvisor.model.Address();
    java.lang.String var1 = var0.getComplement();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.getComplement();
    br.com.addvisor.model.City var8 = new br.com.addvisor.model.City();
    var8.setName("hi!");
    var8.setName("null\nnull\nnull");
    br.com.addvisor.model.Address var13 = new br.com.addvisor.model.Address();
    java.lang.String var14 = var13.getComplement();
    java.lang.String var15 = var13.toString();
    boolean var16 = var8.equals((java.lang.Object)var15);
    br.com.addvisor.model.User var17 = new br.com.addvisor.model.User("hi!", "", "hi!", "User [id=null, name=null, email=null, password=null, phone=null, city=null]", var8);
    var0.setCity(var8);
    var0.setLocation("hi!");
    var0.setComplement("Evaluate [id=0, user=null, service=Service [id=null, name=null, description=null, tags=null, media=null, address=null\nnull\nnull, category=null, phones=null], note=0.0, comment=null]");
    br.com.addvisor.model.City var25 = new br.com.addvisor.model.City();
    var25.setName("hi!");
    var25.setName("null\nnull\nnull");
    br.com.addvisor.model.Address var30 = new br.com.addvisor.model.Address();
    java.lang.String var31 = var30.getComplement();
    java.lang.String var32 = var30.toString();
    boolean var33 = var25.equals((java.lang.Object)var32);
    br.com.addvisor.model.User var34 = new br.com.addvisor.model.User();
    br.com.addvisor.model.State var35 = new br.com.addvisor.model.State();
    var35.setId((java.lang.Long)1L);
    var35.setName("null\nnull\nnull");
    var35.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var42 = var35.getUf();
    boolean var43 = var34.equals((java.lang.Object)var35);
    var25.setState(var35);
    br.com.addvisor.model.Address var45 = new br.com.addvisor.model.Address("Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]]", "", var25);
    br.com.addvisor.model.City var46 = var45.getCity();
    var0.setCity(var46);
    br.com.addvisor.model.User var48 = new br.com.addvisor.model.User();
    boolean var50 = var48.equals((java.lang.Object)(-1L));
    java.lang.String var51 = var48.toString();
    java.lang.String var52 = var48.getPassword();
    java.lang.String var53 = var48.getName();
    java.lang.String var54 = var48.getPassword();
    java.lang.String var55 = var48.getName();
    br.com.addvisor.model.Service var56 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var57 = new br.com.addvisor.model.User();
    boolean var59 = var57.equals((java.lang.Object)(-1L));
    java.lang.String var60 = var57.toString();
    java.lang.String var61 = var57.getPassword();
    var56.setUser(var57);
    br.com.addvisor.model.Address var63 = var56.getAddress();
    java.lang.String var64 = var56.getName();
    br.com.addvisor.model.Address var65 = var56.getAddress();
    br.com.addvisor.model.User var66 = new br.com.addvisor.model.User();
    boolean var68 = var66.equals((java.lang.Object)(-1L));
    java.lang.String var69 = var66.toString();
    br.com.addvisor.model.Evaluate var70 = new br.com.addvisor.model.Evaluate();
    var70.setId((java.lang.Long)10L);
    var70.setId((java.lang.Long)0L);
    br.com.addvisor.model.User var75 = var70.getUser();
    boolean var76 = var66.equals((java.lang.Object)var70);
    java.lang.String var77 = var66.getPassword();
    var66.setId((java.lang.Long)(-1L));
    java.lang.String var80 = var66.getPhone();
    var56.setUser(var66);
    br.com.addvisor.model.Evaluate var84 = new br.com.addvisor.model.Evaluate(var48, var56, (java.lang.Float)10.0f, "User [id=null, name=null, email=null, password=null, phone=null, city=null] - null");
    boolean var85 = var0.equals((java.lang.Object)var56);
    var56.setDescription("User [id=1, name=null, email=null, password=6a526e9ea8abcc547d30e98aac13c6cc, phone=User [id=null, name=null, email=User [id=null, name=null, email=null, password=null, phone=null, city=null], password=null, phone=null, city=null], city=null]");
    br.com.addvisor.model.Address var88 = var56.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "null\nnull\nnull"+ "'", var2.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "null\nnull\nnull"+ "'", var15.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "null\nnull\nnull"+ "'", var32.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var51.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var60.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var69 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var69.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var88);

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test60");


    br.com.addvisor.model.Address var4 = new br.com.addvisor.model.Address();
    java.lang.String var5 = var4.getComplement();
    java.lang.String var6 = var4.toString();
    java.lang.String var7 = var4.getComplement();
    br.com.addvisor.model.City var12 = new br.com.addvisor.model.City();
    var12.setName("hi!");
    var12.setName("null\nnull\nnull");
    br.com.addvisor.model.Address var17 = new br.com.addvisor.model.Address();
    java.lang.String var18 = var17.getComplement();
    java.lang.String var19 = var17.toString();
    boolean var20 = var12.equals((java.lang.Object)var19);
    br.com.addvisor.model.User var21 = new br.com.addvisor.model.User("hi!", "", "hi!", "User [id=null, name=null, email=null, password=null, phone=null, city=null]", var12);
    var4.setCity(var12);
    java.lang.Long var23 = var4.getId();
    br.com.addvisor.model.City var24 = var4.getCity();
    br.com.addvisor.model.State var25 = var24.getState();
    br.com.addvisor.model.User var26 = new br.com.addvisor.model.User("User [id=null, name=null, email=null, password=null, phone=null, city=null]", "Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]]", "User [id=null, name=null, email=null, password=21c96d96756cfeed7f71110d9cb1788b, phone=Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]], city=null]", "User [id=null, name=null, email=null, password=null, phone=null, city=null]", var24);
    br.com.addvisor.model.User var27 = new br.com.addvisor.model.User();
    br.com.addvisor.model.State var28 = new br.com.addvisor.model.State();
    var28.setId((java.lang.Long)1L);
    var28.setName("null\nnull\nnull");
    var28.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var35 = var28.getUf();
    boolean var36 = var27.equals((java.lang.Object)var28);
    java.lang.String var37 = var28.getUf();
    var24.setState(var28);
    java.lang.String var39 = var28.toString();
    br.com.addvisor.model.State var40 = new br.com.addvisor.model.State();
    var40.setId((java.lang.Long)1L);
    var40.setName("null\nnull\nnull");
    boolean var45 = var28.equals((java.lang.Object)var40);
    br.com.addvisor.model.Country var46 = var40.getCountry();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "null\nnull\nnull"+ "'", var6.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "null\nnull\nnull"+ "'", var19.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null] - null"+ "'", var39.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null] - null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test61");


    br.com.addvisor.model.Evaluate var0 = new br.com.addvisor.model.Evaluate();
    br.com.addvisor.model.State var1 = new br.com.addvisor.model.State();
    boolean var3 = var1.equals((java.lang.Object)(byte)100);
    var1.setUf("null\nnull\nnull");
    boolean var6 = var0.equals((java.lang.Object)var1);
    br.com.addvisor.model.Service var7 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var8 = new br.com.addvisor.model.User();
    boolean var10 = var8.equals((java.lang.Object)(-1L));
    java.lang.String var11 = var8.toString();
    java.lang.String var12 = var8.getPassword();
    var7.setUser(var8);
    br.com.addvisor.model.Address var14 = var7.getAddress();
    var0.setService(var7);
    br.com.addvisor.model.enums.ServiceCat var16 = var7.getCategory();
    br.com.addvisor.model.Address var17 = new br.com.addvisor.model.Address();
    var17.setId((java.lang.Long)0L);
    var7.setAddress(var17);
    br.com.addvisor.model.User var21 = new br.com.addvisor.model.User();
    boolean var23 = var21.equals((java.lang.Object)(-1L));
    java.lang.String var24 = var21.toString();
    java.lang.String var25 = var21.getName();
    java.lang.String var26 = var21.getName();
    java.lang.String var27 = var21.getName();
    boolean var28 = var17.equals((java.lang.Object)var21);
    var17.setId((java.lang.Long)10L);
    br.com.addvisor.model.City var31 = var17.getCity();
    var17.setComplement("Country [id=100, name=null, acronym=hi!]");
    br.com.addvisor.model.City var34 = var17.getCity();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var11.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var24.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test62");


    br.com.addvisor.model.User var0 = new br.com.addvisor.model.User();
    boolean var2 = var0.equals((java.lang.Object)(-1L));
    java.lang.String var3 = var0.toString();
    br.com.addvisor.model.Evaluate var4 = new br.com.addvisor.model.Evaluate();
    var4.setId((java.lang.Long)10L);
    var4.setId((java.lang.Long)0L);
    br.com.addvisor.model.User var9 = var4.getUser();
    boolean var10 = var0.equals((java.lang.Object)var4);
    java.lang.String var11 = var0.getPassword();
    var0.setId((java.lang.Long)0L);
    java.lang.String var14 = var0.getEmail();
    br.com.addvisor.model.City var15 = var0.getCity();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var3.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test63");


    br.com.addvisor.model.State var0 = new br.com.addvisor.model.State();
    boolean var2 = var0.equals((java.lang.Object)(byte)100);
    br.com.addvisor.model.State var3 = new br.com.addvisor.model.State();
    var3.setId((java.lang.Long)1L);
    int var6 = var0.compareTo(var3);
    java.lang.Long var7 = var3.getId();
    java.lang.Long var8 = var3.getId();
    br.com.addvisor.model.Country var9 = new br.com.addvisor.model.Country();
    java.lang.Integer var10 = var9.getId();
    java.lang.String var11 = var9.getName();
    var9.setAcronym("Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]]");
    java.lang.String var14 = var9.getName();
    java.lang.String var15 = var9.getName();
    br.com.addvisor.model.State var16 = new br.com.addvisor.model.State();
    boolean var18 = var16.equals((java.lang.Object)(byte)100);
    br.com.addvisor.model.State var19 = new br.com.addvisor.model.State();
    boolean var21 = var19.equals((java.lang.Object)(byte)100);
    var19.setUf("null\nnull\nnull");
    br.com.addvisor.model.State var24 = new br.com.addvisor.model.State();
    int var25 = var19.compareTo(var24);
    java.lang.String var26 = var24.getName();
    var24.setId((java.lang.Long)10L);
    java.lang.Long var29 = var24.getId();
    int var30 = var16.compareTo(var24);
    boolean var31 = var9.equals((java.lang.Object)var16);
    int var32 = var3.compareTo(var16);
    java.lang.String var33 = var3.getName();
    var3.setId((java.lang.Long)0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + 1L+ "'", var7.equals(1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + 1L+ "'", var8.equals(1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + 10L+ "'", var29.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test64");


    br.com.addvisor.model.User var2 = new br.com.addvisor.model.User("Service [id=null, name=null, description=null, tags=null, media=null, address=null\nnull\nnull, category=null, phones=null]", "User [id=null, name=null, email=null, password=null, phone=null, city=null] - null");
    br.com.addvisor.model.State var3 = new br.com.addvisor.model.State();
    boolean var5 = var3.equals((java.lang.Object)(byte)100);
    var3.setUf("null\nnull\nnull");
    br.com.addvisor.model.State var8 = new br.com.addvisor.model.State();
    int var9 = var3.compareTo(var8);
    br.com.addvisor.model.Country var10 = var8.getCountry();
    boolean var11 = var2.equals((java.lang.Object)var8);
    java.lang.Long var12 = var2.getId();
    br.com.addvisor.model.Service var13 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var14 = new br.com.addvisor.model.User();
    boolean var16 = var14.equals((java.lang.Object)(-1L));
    java.lang.String var17 = var14.toString();
    java.lang.String var18 = var14.getPassword();
    var13.setUser(var14);
    br.com.addvisor.model.Address var20 = var13.getAddress();
    java.lang.String var21 = var13.getTags();
    java.lang.String var22 = var13.getName();
    br.com.addvisor.model.Evaluate var25 = new br.com.addvisor.model.Evaluate(var2, var13, (java.lang.Float)(-1.0f), "Service [id=null, name=null, description=null, tags=null, media=10.0, address=null, category=null, phones=null]");
    java.lang.String var26 = var25.getComment();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var17.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "Service [id=null, name=null, description=null, tags=null, media=10.0, address=null, category=null, phones=null]"+ "'", var26.equals("Service [id=null, name=null, description=null, tags=null, media=10.0, address=null, category=null, phones=null]"));

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test65");


    br.com.addvisor.model.Service var0 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var1 = new br.com.addvisor.model.User();
    boolean var3 = var1.equals((java.lang.Object)(-1L));
    java.lang.String var4 = var1.toString();
    java.lang.String var5 = var1.getPassword();
    var0.setUser(var1);
    br.com.addvisor.model.Address var7 = var0.getAddress();
    java.lang.String var8 = var0.getName();
    java.lang.String var9 = var0.getDescription();
    br.com.addvisor.model.Address var10 = new br.com.addvisor.model.Address();
    java.lang.String var11 = var10.toString();
    br.com.addvisor.model.City var12 = new br.com.addvisor.model.City();
    var12.setName("hi!");
    var10.setCity(var12);
    var10.setLocation("");
    java.lang.String var18 = var10.getLocation();
    var0.setAddress(var10);
    br.com.addvisor.model.City var20 = var10.getCity();
    br.com.addvisor.model.State var21 = new br.com.addvisor.model.State();
    var21.setId((java.lang.Long)1L);
    boolean var25 = var21.equals((java.lang.Object)10.0f);
    var21.setUf("Evaluate [id=0, user=null, service=Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null], note=null, comment=Evaluate [id=0, user=null, service=null, note=null, comment=null]]");
    var20.setState(var21);
    br.com.addvisor.model.Country var29 = var21.getCountry();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var4.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "null\nnull\nnull"+ "'", var11.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test66");


    br.com.addvisor.model.Agenda var0 = new br.com.addvisor.model.Agenda();
    java.util.List var1 = var0.getNames();
    br.com.addvisor.model.Agenda var2 = new br.com.addvisor.model.Agenda();
    java.util.List var3 = var2.getNames();
    var0.setNames(var3);
    java.util.List var5 = var0.getNumbers();
    br.com.addvisor.model.Agenda var6 = new br.com.addvisor.model.Agenda();
    java.util.List var7 = var6.getNames();
    java.util.List var8 = var6.getNumbers();
    br.com.addvisor.model.Agenda var9 = new br.com.addvisor.model.Agenda();
    java.util.List var10 = var9.getNames();
    java.util.List var11 = var9.getNumbers();
    var6.setNames(var11);
    br.com.addvisor.model.Agenda var13 = new br.com.addvisor.model.Agenda();
    java.util.List var14 = var13.getNames();
    java.util.List var15 = var13.getNumbers();
    br.com.addvisor.model.Agenda var16 = new br.com.addvisor.model.Agenda();
    java.util.List var17 = var16.getNames();
    java.util.List var18 = var16.getNumbers();
    var13.setNames(var18);
    var6.setNames(var18);
    var0.setNumbers(var18);
    var0.addContact("Evaluate [id=-1, user=null, service=Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null], note=null, comment=null]", "hi!");
    var0.addContact("User [id=0, name=null, email=null, password=null, phone=null, city=null]", "Evaluate [id=0, user=null, service=Service [id=null, name=null, description=null, tags=null, media=null, address=null\nnull\nnull, category=null, phones=null], note=0.0, comment=null]");
    br.com.addvisor.model.Agenda var28 = new br.com.addvisor.model.Agenda();
    br.com.addvisor.model.State var29 = new br.com.addvisor.model.State();
    boolean var31 = var29.equals((java.lang.Object)(byte)100);
    var29.setUf("null\nnull\nnull");
    br.com.addvisor.model.Agenda var34 = new br.com.addvisor.model.Agenda();
    java.util.List var35 = var34.getNames();
    br.com.addvisor.model.Agenda var36 = new br.com.addvisor.model.Agenda();
    java.util.List var37 = var36.getNames();
    var34.setNames(var37);
    java.util.List var39 = var34.getNumbers();
    br.com.addvisor.model.Agenda var40 = new br.com.addvisor.model.Agenda();
    java.util.List var41 = var40.getNames();
    java.util.List var42 = var40.getNumbers();
    br.com.addvisor.model.Agenda var43 = new br.com.addvisor.model.Agenda();
    java.util.List var44 = var43.getNames();
    java.util.List var45 = var43.getNumbers();
    var40.setNames(var45);
    br.com.addvisor.model.Agenda var47 = new br.com.addvisor.model.Agenda();
    java.util.List var48 = var47.getNames();
    java.util.List var49 = var47.getNumbers();
    br.com.addvisor.model.Agenda var50 = new br.com.addvisor.model.Agenda();
    java.util.List var51 = var50.getNames();
    java.util.List var52 = var50.getNumbers();
    var47.setNames(var52);
    var40.setNames(var52);
    var34.setNumbers(var52);
    var34.addContact("", "");
    br.com.addvisor.model.Agenda var59 = new br.com.addvisor.model.Agenda();
    java.util.List var60 = var59.getNames();
    br.com.addvisor.model.Agenda var61 = new br.com.addvisor.model.Agenda();
    java.util.List var62 = var61.getNames();
    var59.setNames(var62);
    java.util.List var64 = var59.getNumbers();
    var34.setNames(var64);
    boolean var66 = var29.equals((java.lang.Object)var34);
    java.util.List var67 = var34.getNames();
    var28.setNumbers(var67);
    var0.setNumbers(var67);
    java.util.List var70 = var0.getNames();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test67");


    br.com.addvisor.model.City var2 = new br.com.addvisor.model.City();
    br.com.addvisor.model.State var3 = var2.getState();
    java.lang.Long var4 = var2.getId();
    br.com.addvisor.model.Address var5 = new br.com.addvisor.model.Address("Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]", "null - null", var2);
    var5.setComplement("");
    var5.setId((java.lang.Long)1L);
    java.lang.String var10 = var5.toString();
    java.lang.String var11 = var5.toString();
    var5.setComplement("Service [id=null, name=null, description=null, tags=null, media=null, address=null\nnull\nnull, category=null, phones=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]\n\nnull"+ "'", var10.equals("Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]\n\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]\n\nnull"+ "'", var11.equals("Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]\n\nnull"));

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test68");


    br.com.addvisor.model.User var0 = new br.com.addvisor.model.User();
    br.com.addvisor.model.State var1 = new br.com.addvisor.model.State();
    var1.setId((java.lang.Long)1L);
    var1.setName("null\nnull\nnull");
    var1.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var8 = var1.getUf();
    boolean var9 = var0.equals((java.lang.Object)var1);
    br.com.addvisor.model.Service var10 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var11 = new br.com.addvisor.model.User();
    boolean var13 = var11.equals((java.lang.Object)(-1L));
    java.lang.String var14 = var11.toString();
    java.lang.String var15 = var11.getPassword();
    var10.setUser(var11);
    br.com.addvisor.model.Address var17 = var10.getAddress();
    java.lang.String var18 = var10.getName();
    br.com.addvisor.model.City var19 = new br.com.addvisor.model.City();
    var19.setName("hi!");
    var19.setName("null\nnull\nnull");
    br.com.addvisor.model.Address var24 = new br.com.addvisor.model.Address();
    java.lang.String var25 = var24.getComplement();
    java.lang.String var26 = var24.toString();
    boolean var27 = var19.equals((java.lang.Object)var26);
    br.com.addvisor.model.State var28 = new br.com.addvisor.model.State();
    var28.setId((java.lang.Long)1L);
    var28.setName("null\nnull\nnull");
    var28.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var35 = var28.getUf();
    var19.setState(var28);
    boolean var37 = var10.equals((java.lang.Object)var19);
    br.com.addvisor.model.Evaluate var40 = new br.com.addvisor.model.Evaluate(var0, var10, (java.lang.Float)100.0f, "");
    br.com.addvisor.model.User var41 = new br.com.addvisor.model.User();
    boolean var43 = var41.equals((java.lang.Object)(-1L));
    java.lang.String var44 = var41.getDDD();
    var41.setPhone("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    br.com.addvisor.model.Address var47 = new br.com.addvisor.model.Address();
    java.lang.String var48 = var47.toString();
    br.com.addvisor.model.City var49 = new br.com.addvisor.model.City();
    var49.setName("hi!");
    var49.setName("null\nnull\nnull");
    var47.setCity(var49);
    var41.setCity(var49);
    var40.setUser(var41);
    var40.setComment("Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]\n\nnull");
    br.com.addvisor.model.City var69 = new br.com.addvisor.model.City();
    var69.setName("hi!");
    var69.setName("null\nnull\nnull");
    br.com.addvisor.model.Address var74 = new br.com.addvisor.model.Address();
    java.lang.String var75 = var74.getComplement();
    java.lang.String var76 = var74.toString();
    boolean var77 = var69.equals((java.lang.Object)var76);
    br.com.addvisor.model.User var78 = new br.com.addvisor.model.User("hi!", "", "hi!", "User [id=null, name=null, email=null, password=null, phone=null, city=null]", var69);
    br.com.addvisor.model.Address var79 = new br.com.addvisor.model.Address("null\nnull\nnull", "User [id=null, name=null, email=null, password=null, phone=null, city=null]", var69);
    java.lang.Long var80 = var69.getId();
    br.com.addvisor.model.Address var81 = new br.com.addvisor.model.Address("User [id=null, name=null, email=null, password=null, phone=null, city=null] - null", "null - null\nnull\nnull", var69);
    br.com.addvisor.model.Address var82 = new br.com.addvisor.model.Address("User [id=10, name=null, email=null, password=bab90b8667e900a415ffe18829d9e6f9, phone=null - null, city=null]", "User [id=null, name=null, email=null, password=6f30ecc3178699bdb54df7daf6f7f49e, phone=User [id=null, name=null, email=null, password=null, phone=null, city=null], city=null\nnull\nnull]", var69);
    boolean var83 = var40.equals((java.lang.Object)"User [id=10, name=null, email=null, password=bab90b8667e900a415ffe18829d9e6f9, phone=null - null, city=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var14.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "null\nnull\nnull"+ "'", var26.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "null\nnull\nnull"+ "'", var48.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var76 + "' != '" + "null\nnull\nnull"+ "'", var76.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == false);

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test69");


    br.com.addvisor.model.Address var0 = new br.com.addvisor.model.Address();
    java.lang.String var1 = var0.getLocation();
    java.lang.Long var2 = var0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test70");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.addvisor.model.enums.PriceCat var1 = br.com.addvisor.model.enums.PriceCat.getPrice(" -");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test71");


    br.com.addvisor.model.User var0 = new br.com.addvisor.model.User();
    boolean var2 = var0.equals((java.lang.Object)(-1L));
    java.lang.String var3 = var0.toString();
    br.com.addvisor.model.Evaluate var4 = new br.com.addvisor.model.Evaluate();
    var4.setId((java.lang.Long)10L);
    var4.setId((java.lang.Long)0L);
    br.com.addvisor.model.User var9 = var4.getUser();
    boolean var10 = var0.equals((java.lang.Object)var4);
    java.lang.String var11 = var0.getPassword();
    java.lang.String var12 = var0.getPhone();
    br.com.addvisor.model.Evaluate var13 = new br.com.addvisor.model.Evaluate();
    br.com.addvisor.model.State var14 = new br.com.addvisor.model.State();
    boolean var16 = var14.equals((java.lang.Object)(byte)100);
    var14.setUf("null\nnull\nnull");
    boolean var19 = var13.equals((java.lang.Object)var14);
    br.com.addvisor.model.Service var20 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var21 = new br.com.addvisor.model.User();
    boolean var23 = var21.equals((java.lang.Object)(-1L));
    java.lang.String var24 = var21.toString();
    java.lang.String var25 = var21.getPassword();
    var20.setUser(var21);
    br.com.addvisor.model.Address var27 = var20.getAddress();
    var13.setService(var20);
    br.com.addvisor.model.Service var29 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var30 = new br.com.addvisor.model.User();
    boolean var32 = var30.equals((java.lang.Object)(-1L));
    java.lang.String var33 = var30.toString();
    java.lang.String var34 = var30.getPassword();
    var29.setUser(var30);
    br.com.addvisor.model.Address var36 = var29.getAddress();
    java.lang.String var37 = var29.getName();
    var29.setId((java.lang.Long)1L);
    java.lang.Long var40 = var29.getId();
    var13.setService(var29);
    java.lang.String var42 = var29.getTags();
    br.com.addvisor.model.enums.ServiceCat var43 = var29.getCategory();
    br.com.addvisor.model.Evaluate var46 = new br.com.addvisor.model.Evaluate(var0, var29, (java.lang.Float)1.0f, "User [id=-1, name=null, email=null, password=21c96d96756cfeed7f71110d9cb1788b, phone=null\nnull\nnull, city=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var3.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var24.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var33.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + 1L+ "'", var40.equals(1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test72");


    br.com.addvisor.model.City var2 = new br.com.addvisor.model.City();
    br.com.addvisor.model.State var3 = var2.getState();
    java.lang.Long var4 = var2.getId();
    br.com.addvisor.model.Address var5 = new br.com.addvisor.model.Address("Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]", "null - null", var2);
    var5.setComplement("null - User [id=-1, name=null, email=null, password=21c96d96756cfeed7f71110d9cb1788b, phone=null\nnull\nnull, city=null]");
    java.lang.String var8 = var5.getComplement();
    java.lang.String var9 = var5.getComplement();
    java.lang.Long var10 = var5.getId();
    java.lang.String var11 = var5.getLocation();
    var5.setComplement("null\nnull\nnull\nEvaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]]\nnull");
    java.lang.Long var14 = var5.getId();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "null - User [id=-1, name=null, email=null, password=21c96d96756cfeed7f71110d9cb1788b, phone=null\nnull\nnull, city=null]"+ "'", var8.equals("null - User [id=-1, name=null, email=null, password=21c96d96756cfeed7f71110d9cb1788b, phone=null\nnull\nnull, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "null - User [id=-1, name=null, email=null, password=21c96d96756cfeed7f71110d9cb1788b, phone=null\nnull\nnull, city=null]"+ "'", var9.equals("null - User [id=-1, name=null, email=null, password=21c96d96756cfeed7f71110d9cb1788b, phone=null\nnull\nnull, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]"+ "'", var11.equals("Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test73");


    br.com.addvisor.model.User var0 = new br.com.addvisor.model.User();
    boolean var2 = var0.equals((java.lang.Object)(-1L));
    boolean var4 = var0.equals((java.lang.Object)100.0d);
    var0.setEmail("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    br.com.addvisor.model.City var11 = new br.com.addvisor.model.City();
    var11.setName("hi!");
    var11.setName("null\nnull\nnull");
    br.com.addvisor.model.Address var16 = new br.com.addvisor.model.Address();
    java.lang.String var17 = var16.getComplement();
    java.lang.String var18 = var16.toString();
    boolean var19 = var11.equals((java.lang.Object)var18);
    br.com.addvisor.model.User var20 = new br.com.addvisor.model.User("hi!", "", "hi!", "User [id=null, name=null, email=null, password=null, phone=null, city=null]", var11);
    br.com.addvisor.model.City var23 = new br.com.addvisor.model.City();
    var23.setName("hi!");
    var23.setName("null\nnull\nnull");
    br.com.addvisor.model.Address var28 = new br.com.addvisor.model.Address();
    java.lang.String var29 = var28.getComplement();
    java.lang.String var30 = var28.toString();
    boolean var31 = var23.equals((java.lang.Object)var30);
    br.com.addvisor.model.User var32 = new br.com.addvisor.model.User();
    br.com.addvisor.model.State var33 = new br.com.addvisor.model.State();
    var33.setId((java.lang.Long)1L);
    var33.setName("null\nnull\nnull");
    var33.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var40 = var33.getUf();
    boolean var41 = var32.equals((java.lang.Object)var33);
    var23.setState(var33);
    br.com.addvisor.model.Address var43 = new br.com.addvisor.model.Address("Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]]", "", var23);
    int var44 = var11.compareTo(var23);
    var0.setCity(var23);
    var23.setName("\nnull\nhi!");
    java.lang.String var48 = var23.toString();
    java.lang.Long var49 = var23.getId();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "null\nnull\nnull"+ "'", var18.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "null\nnull\nnull"+ "'", var30.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "\nnull\nhi!"+ "'", var48.equals("\nnull\nhi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test74");


    br.com.addvisor.model.Address var0 = new br.com.addvisor.model.Address();
    java.lang.String var1 = var0.toString();
    br.com.addvisor.model.City var2 = new br.com.addvisor.model.City();
    var2.setName("hi!");
    var0.setCity(var2);
    var0.setLocation("");
    java.lang.String var8 = var0.getLocation();
    var0.setLocation("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    var0.setComplement("Evaluate [id=null, user=null, service=null, note=10.0, comment=null]");
    java.lang.String var13 = var0.toString();
    java.lang.String var14 = var0.getLocation();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "null\nnull\nnull"+ "'", var1.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]\nEvaluate [id=null, user=null, service=null, note=10.0, comment=null]\nhi!"+ "'", var13.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]\nEvaluate [id=null, user=null, service=null, note=10.0, comment=null]\nhi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var14.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test75");


    br.com.addvisor.model.Evaluate var0 = new br.com.addvisor.model.Evaluate();
    var0.setId((java.lang.Long)10L);
    var0.setId((java.lang.Long)0L);
    br.com.addvisor.model.User var5 = var0.getUser();
    var0.setComment("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    var0.setComment("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.Float var10 = var0.getNote();
    br.com.addvisor.model.User var11 = new br.com.addvisor.model.User();
    boolean var13 = var11.equals((java.lang.Object)(-1L));
    java.lang.String var14 = var11.toString();
    br.com.addvisor.model.Evaluate var15 = new br.com.addvisor.model.Evaluate();
    var15.setId((java.lang.Long)10L);
    var15.setId((java.lang.Long)0L);
    br.com.addvisor.model.User var20 = var15.getUser();
    boolean var21 = var11.equals((java.lang.Object)var15);
    java.lang.String var22 = var11.getPassword();
    var0.setUser(var11);
    var0.setNote((java.lang.Float)(-1.0f));
    var0.setId((java.lang.Long)1L);
    br.com.addvisor.model.Service var28 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var29 = new br.com.addvisor.model.User();
    boolean var31 = var29.equals((java.lang.Object)(-1L));
    java.lang.String var32 = var29.toString();
    java.lang.String var33 = var29.getPassword();
    var28.setUser(var29);
    br.com.addvisor.model.Address var35 = var28.getAddress();
    java.lang.String var36 = var28.getTags();
    var28.setId((java.lang.Long)1L);
    br.com.addvisor.model.Service var39 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var40 = new br.com.addvisor.model.User();
    boolean var42 = var40.equals((java.lang.Object)(-1L));
    java.lang.String var43 = var40.toString();
    java.lang.String var44 = var40.getPassword();
    var39.setUser(var40);
    br.com.addvisor.model.Address var46 = var39.getAddress();
    java.lang.String var47 = var39.getName();
    var39.setId((java.lang.Long)1L);
    java.lang.Long var50 = var39.getId();
    var39.setDescription("null - null\nnull\nnull");
    boolean var53 = var28.equals((java.lang.Object)var39);
    var28.setDescription("Evaluate [id=null, user=User [id=100, name=null, email=null, password=null, phone=null, city=null\nnull\nnull], service=Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null], note=0.0, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]]");
    var0.setService(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var14.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var32.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var43.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + 1L+ "'", var50.equals(1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test76");


    br.com.addvisor.model.City var6 = new br.com.addvisor.model.City();
    var6.setName("hi!");
    var6.setName("null\nnull\nnull");
    br.com.addvisor.model.Address var11 = new br.com.addvisor.model.Address();
    java.lang.String var12 = var11.getComplement();
    java.lang.String var13 = var11.toString();
    boolean var14 = var6.equals((java.lang.Object)var13);
    br.com.addvisor.model.Address var15 = new br.com.addvisor.model.Address("Country [id=100, name=Country [id=null, name=null, acronym=null], acronym=null]", "Country [id=100, name=Country [id=null, name=null, acronym=null], acronym=null]", var6);
    br.com.addvisor.model.Address var20 = new br.com.addvisor.model.Address();
    java.lang.String var21 = var20.getComplement();
    java.lang.String var22 = var20.toString();
    java.lang.String var23 = var20.getComplement();
    br.com.addvisor.model.City var28 = new br.com.addvisor.model.City();
    var28.setName("hi!");
    var28.setName("null\nnull\nnull");
    br.com.addvisor.model.Address var33 = new br.com.addvisor.model.Address();
    java.lang.String var34 = var33.getComplement();
    java.lang.String var35 = var33.toString();
    boolean var36 = var28.equals((java.lang.Object)var35);
    br.com.addvisor.model.User var37 = new br.com.addvisor.model.User("hi!", "", "hi!", "User [id=null, name=null, email=null, password=null, phone=null, city=null]", var28);
    var20.setCity(var28);
    var20.setComplement("hi!");
    br.com.addvisor.model.City var41 = var20.getCity();
    br.com.addvisor.model.User var42 = new br.com.addvisor.model.User("null - Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]", "Evaluate [id=0, user=null, service=Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null], note=null, comment=Evaluate [id=0, user=null, service=null, note=null, comment=null]]", "null - Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]", "Evaluate [id=null, user=null, service=null, note=null, comment=]", var41);
    boolean var43 = var6.equals((java.lang.Object)var41);
    br.com.addvisor.model.User var44 = new br.com.addvisor.model.User("Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]\n\nnull", "Service [id=null, name=null, description=null, tags=null, media=100.0, address=null, category=null, phones=null]", "User [id=null, name=null, email=null, password=null, phone=null, city=null] - null", "Evaluate [id=null, user=null, service=null, note=null, comment=null]", var6);
    br.com.addvisor.model.Service var45 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var46 = new br.com.addvisor.model.User();
    boolean var48 = var46.equals((java.lang.Object)(-1L));
    java.lang.String var49 = var46.toString();
    java.lang.String var50 = var46.getPassword();
    var45.setUser(var46);
    br.com.addvisor.model.Address var52 = var45.getAddress();
    br.com.addvisor.model.Address var53 = new br.com.addvisor.model.Address();
    java.lang.String var54 = var53.getComplement();
    java.lang.String var55 = var53.toString();
    br.com.addvisor.model.City var56 = var53.getCity();
    br.com.addvisor.model.State var57 = new br.com.addvisor.model.State();
    var57.setId((java.lang.Long)1L);
    var57.setName("null\nnull\nnull");
    var57.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var64 = var57.getUf();
    boolean var65 = var53.equals((java.lang.Object)var57);
    var45.setAddress(var53);
    br.com.addvisor.model.User var67 = new br.com.addvisor.model.User();
    boolean var69 = var67.equals((java.lang.Object)(-1L));
    java.lang.String var70 = var67.toString();
    java.lang.String var71 = var67.getName();
    java.lang.String var72 = var67.getName();
    java.lang.String var73 = var67.getName();
    java.lang.String var74 = var67.getPassword();
    var45.setUser(var67);
    boolean var76 = var6.equals((java.lang.Object)var45);
    br.com.addvisor.model.enums.ServiceCat var77 = var45.getCategory();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "null\nnull\nnull"+ "'", var13.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "null\nnull\nnull"+ "'", var22.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "null\nnull\nnull"+ "'", var35.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var49.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "null\nnull\nnull"+ "'", var55.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var70 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var70.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var77);

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test77");


    br.com.addvisor.model.State var0 = new br.com.addvisor.model.State();
    boolean var2 = var0.equals((java.lang.Object)(byte)100);
    var0.setUf("null\nnull\nnull");
    br.com.addvisor.model.State var5 = new br.com.addvisor.model.State();
    int var6 = var0.compareTo(var5);
    var5.setUf("User [id=-1, name=null, email=null, password=21c96d96756cfeed7f71110d9cb1788b, phone=null\nnull\nnull, city=null]");
    java.lang.Long var9 = var5.getId();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test78");


    br.com.addvisor.model.Service var0 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var1 = new br.com.addvisor.model.User();
    boolean var3 = var1.equals((java.lang.Object)(-1L));
    java.lang.String var4 = var1.toString();
    java.lang.String var5 = var1.getPassword();
    var0.setUser(var1);
    br.com.addvisor.model.Address var7 = var0.getAddress();
    br.com.addvisor.model.Address var8 = new br.com.addvisor.model.Address();
    java.lang.String var9 = var8.getComplement();
    java.lang.String var10 = var8.toString();
    br.com.addvisor.model.City var11 = var8.getCity();
    br.com.addvisor.model.State var12 = new br.com.addvisor.model.State();
    var12.setId((java.lang.Long)1L);
    var12.setName("null\nnull\nnull");
    var12.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var19 = var12.getUf();
    boolean var20 = var8.equals((java.lang.Object)var12);
    var0.setAddress(var8);
    var0.setTags("\nnull\nhi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var4.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "null\nnull\nnull"+ "'", var10.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test79");


    br.com.addvisor.model.Service var0 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var1 = new br.com.addvisor.model.User();
    boolean var3 = var1.equals((java.lang.Object)(-1L));
    java.lang.String var4 = var1.toString();
    java.lang.String var5 = var1.getPassword();
    var0.setUser(var1);
    br.com.addvisor.model.Address var7 = var0.getAddress();
    br.com.addvisor.model.Address var8 = new br.com.addvisor.model.Address();
    java.lang.String var9 = var8.getComplement();
    java.lang.String var10 = var8.toString();
    br.com.addvisor.model.City var11 = var8.getCity();
    br.com.addvisor.model.State var12 = new br.com.addvisor.model.State();
    var12.setId((java.lang.Long)1L);
    var12.setName("null\nnull\nnull");
    var12.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var19 = var12.getUf();
    boolean var20 = var8.equals((java.lang.Object)var12);
    var0.setAddress(var8);
    br.com.addvisor.model.User var22 = var0.getUser();
    br.com.addvisor.model.City var23 = var22.getCity();
    br.com.addvisor.model.Evaluate var24 = new br.com.addvisor.model.Evaluate();
    br.com.addvisor.model.State var25 = new br.com.addvisor.model.State();
    boolean var27 = var25.equals((java.lang.Object)(byte)100);
    var25.setUf("null\nnull\nnull");
    boolean var30 = var24.equals((java.lang.Object)var25);
    br.com.addvisor.model.Service var31 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var32 = new br.com.addvisor.model.User();
    boolean var34 = var32.equals((java.lang.Object)(-1L));
    java.lang.String var35 = var32.toString();
    java.lang.String var36 = var32.getPassword();
    var31.setUser(var32);
    br.com.addvisor.model.Address var38 = var31.getAddress();
    java.lang.String var39 = var31.getDescription();
    boolean var40 = var24.equals((java.lang.Object)var31);
    br.com.addvisor.model.Evaluate var41 = new br.com.addvisor.model.Evaluate();
    var41.setId((java.lang.Long)10L);
    var41.setId((java.lang.Long)0L);
    br.com.addvisor.model.User var46 = var41.getUser();
    java.lang.Long var47 = var41.getId();
    br.com.addvisor.model.Service var48 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var49 = new br.com.addvisor.model.User();
    boolean var51 = var49.equals((java.lang.Object)(-1L));
    java.lang.String var52 = var49.toString();
    java.lang.String var53 = var49.getPassword();
    var48.setUser(var49);
    br.com.addvisor.model.Address var55 = var48.getAddress();
    java.lang.String var56 = var48.getDescription();
    var41.setService(var48);
    boolean var58 = var31.equals((java.lang.Object)var48);
    br.com.addvisor.model.User var59 = new br.com.addvisor.model.User();
    boolean var61 = var59.equals((java.lang.Object)(-1L));
    java.lang.String var62 = var59.toString();
    java.lang.String var63 = var59.getPassword();
    java.lang.String var64 = var59.getName();
    boolean var65 = var31.equals((java.lang.Object)var59);
    java.lang.Float var66 = var31.getMedia();
    var31.setName("null\nnull\nnull\nnull\nnull");
    java.util.List var69 = var31.getPhones();
    br.com.addvisor.model.Evaluate var72 = new br.com.addvisor.model.Evaluate(var22, var31, (java.lang.Float)100.0f, "User [id=null, name=null, email=Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]\n\nnull, password=null, phone=null, city=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var4.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "null\nnull\nnull"+ "'", var10.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var35.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + 0L+ "'", var47.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var52.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var62 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var62.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var69);

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test80");


    br.com.addvisor.model.City var14 = new br.com.addvisor.model.City();
    var14.setName("hi!");
    var14.setName("null\nnull\nnull");
    br.com.addvisor.model.Address var19 = new br.com.addvisor.model.Address();
    java.lang.String var20 = var19.getComplement();
    java.lang.String var21 = var19.toString();
    boolean var22 = var14.equals((java.lang.Object)var21);
    br.com.addvisor.model.User var23 = new br.com.addvisor.model.User("hi!", "", "hi!", "User [id=null, name=null, email=null, password=null, phone=null, city=null]", var14);
    br.com.addvisor.model.Address var24 = new br.com.addvisor.model.Address("null\nnull\nnull", "User [id=null, name=null, email=null, password=null, phone=null, city=null]", var14);
    var14.setId((java.lang.Long)100L);
    br.com.addvisor.model.User var27 = new br.com.addvisor.model.User("Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]]", "Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]]", "User [id=null, name=null, email=null, password=21c96d96756cfeed7f71110d9cb1788b, phone=Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]], city=null]", "hi!", var14);
    br.com.addvisor.model.Address var28 = new br.com.addvisor.model.Address("Service [id=1, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]", "null - User [id=-1, name=null, email=null, password=21c96d96756cfeed7f71110d9cb1788b, phone=null\nnull\nnull, city=null]", var14);
    br.com.addvisor.model.Address var29 = new br.com.addvisor.model.Address("Evaluate [id=null, user=null, service=null, note=null, comment=null]", "Service [id=1, name=Service [id=10, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null], description=null, tags=null, media=null, address=null\nnull\nnull, category=null, phones=null]", var14);
    br.com.addvisor.model.User var30 = new br.com.addvisor.model.User();
    boolean var32 = var30.equals((java.lang.Object)(-1L));
    java.lang.String var33 = var30.getDDD();
    var30.setPhone("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    var30.setEmail("hi!");
    var30.setEmail("null\nnull\nnull");
    br.com.addvisor.model.City var40 = var30.getCity();
    java.lang.String var41 = var30.getName();
    br.com.addvisor.model.Address var42 = new br.com.addvisor.model.Address();
    java.lang.String var43 = var42.getLocation();
    java.lang.String var44 = var42.getComplement();
    br.com.addvisor.model.Address var45 = new br.com.addvisor.model.Address();
    java.lang.String var46 = var45.toString();
    br.com.addvisor.model.City var47 = new br.com.addvisor.model.City();
    var47.setName("hi!");
    var47.setName("null\nnull\nnull");
    var45.setCity(var47);
    java.lang.Long var53 = var47.getId();
    var42.setCity(var47);
    var30.setCity(var47);
    int var56 = var14.compareTo(var47);
    br.com.addvisor.model.City var59 = new br.com.addvisor.model.City();
    var59.setName("hi!");
    var59.setName("null\nnull\nnull");
    br.com.addvisor.model.Address var64 = new br.com.addvisor.model.Address();
    java.lang.String var65 = var64.getComplement();
    java.lang.String var66 = var64.toString();
    boolean var67 = var59.equals((java.lang.Object)var66);
    br.com.addvisor.model.State var68 = new br.com.addvisor.model.State();
    var68.setId((java.lang.Long)1L);
    var68.setName("null\nnull\nnull");
    var68.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var75 = var68.getUf();
    var59.setState(var68);
    br.com.addvisor.model.State var77 = var59.getState();
    var59.setId((java.lang.Long)(-1L));
    br.com.addvisor.model.Address var80 = new br.com.addvisor.model.Address("null - null", " - ", var59);
    var59.setName("User [id=null, name=null, email=null, password=4238a597ad0f3ff8363f52f6e8c3507, phone=Evaluate [id=0, user=null, service=null, note=null, comment=null], city=null]");
    br.com.addvisor.model.State var83 = var59.getState();
    var14.setState(var83);
    java.lang.String var85 = var14.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "null\nnull\nnull"+ "'", var21.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "null\nnull\nnull"+ "'", var46.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var66 + "' != '" + "null\nnull\nnull"+ "'", var66.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var85 + "' != '" + "null\nnull\nnull"+ "'", var85.equals("null\nnull\nnull"));

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test81");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.addvisor.model.enums.ServiceCat var1 = br.com.addvisor.model.enums.ServiceCat.valueOf("Service [id=null, name=null, description=null, tags=null, media=100.0, address=null, category=null, phones=null]");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test82");


    br.com.addvisor.model.Evaluate var0 = new br.com.addvisor.model.Evaluate();
    var0.setId((java.lang.Long)10L);
    var0.setId((java.lang.Long)0L);
    br.com.addvisor.model.Service var5 = var0.getService();
    br.com.addvisor.model.User var6 = new br.com.addvisor.model.User();
    boolean var8 = var6.equals((java.lang.Object)(-1L));
    java.lang.String var9 = var6.toString();
    java.lang.String var10 = var6.getPassword();
    java.lang.String var11 = var6.getPhone();
    var0.setUser(var6);
    var0.setComment("Country [id=100, name=null, acronym=null]");
    java.lang.Long var15 = var0.getId();
    java.lang.String var16 = var0.getComment();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var9.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + 0L+ "'", var15.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Country [id=100, name=null, acronym=null]"+ "'", var16.equals("Country [id=100, name=null, acronym=null]"));

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test83");


    br.com.addvisor.model.Evaluate var0 = new br.com.addvisor.model.Evaluate();
    br.com.addvisor.model.State var1 = new br.com.addvisor.model.State();
    boolean var3 = var1.equals((java.lang.Object)(byte)100);
    var1.setUf("null\nnull\nnull");
    boolean var6 = var0.equals((java.lang.Object)var1);
    br.com.addvisor.model.Service var7 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var8 = new br.com.addvisor.model.User();
    boolean var10 = var8.equals((java.lang.Object)(-1L));
    java.lang.String var11 = var8.toString();
    java.lang.String var12 = var8.getPassword();
    var7.setUser(var8);
    br.com.addvisor.model.Address var14 = var7.getAddress();
    java.lang.String var15 = var7.getDescription();
    boolean var16 = var0.equals((java.lang.Object)var7);
    br.com.addvisor.model.Evaluate var17 = new br.com.addvisor.model.Evaluate();
    var17.setId((java.lang.Long)10L);
    var17.setId((java.lang.Long)0L);
    br.com.addvisor.model.User var22 = var17.getUser();
    java.lang.Long var23 = var17.getId();
    br.com.addvisor.model.Service var24 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var25 = new br.com.addvisor.model.User();
    boolean var27 = var25.equals((java.lang.Object)(-1L));
    java.lang.String var28 = var25.toString();
    java.lang.String var29 = var25.getPassword();
    var24.setUser(var25);
    br.com.addvisor.model.Address var31 = var24.getAddress();
    java.lang.String var32 = var24.getDescription();
    var17.setService(var24);
    boolean var34 = var7.equals((java.lang.Object)var24);
    br.com.addvisor.model.User var35 = new br.com.addvisor.model.User();
    boolean var37 = var35.equals((java.lang.Object)(-1L));
    java.lang.String var38 = var35.getDDD();
    var35.setPhone("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    boolean var41 = var24.equals((java.lang.Object)"User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    br.com.addvisor.model.User var44 = new br.com.addvisor.model.User("User [id=null, name=null, email=User [id=null, name=null, email=null, password=null, phone=null, city=null], password=null, phone=null, city=null]", "Country [id=null, name=null, acronym=null]");
    var24.setUser(var44);
    var44.setId((java.lang.Long)1L);
    java.lang.String var48 = var44.toString();
    var44.setName("Country [id=null, name=null, acronym=null]");
    br.com.addvisor.model.Evaluate var51 = new br.com.addvisor.model.Evaluate();
    var51.setId((java.lang.Long)10L);
    var51.setId((java.lang.Long)0L);
    br.com.addvisor.model.User var56 = var51.getUser();
    var51.setComment("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    br.com.addvisor.model.Service var59 = new br.com.addvisor.model.Service();
    java.lang.String var60 = var59.getName();
    var51.setService(var59);
    br.com.addvisor.model.Evaluate var64 = new br.com.addvisor.model.Evaluate(var44, var59, (java.lang.Float)100.0f, "Service [id=100, name=, description=null, tags=null, media=null, address=null, category=null, phones=null]");
    java.lang.Long var65 = var44.getId();
    java.lang.String var66 = var44.getPhone();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var11.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + 0L+ "'", var23.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var28.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "User [id=1, name=null, email=null, password=6a526e9ea8abcc547d30e98aac13c6cc, phone=User [id=null, name=null, email=User [id=null, name=null, email=null, password=null, phone=null, city=null], password=null, phone=null, city=null], city=null]"+ "'", var48.equals("User [id=1, name=null, email=null, password=6a526e9ea8abcc547d30e98aac13c6cc, phone=User [id=null, name=null, email=User [id=null, name=null, email=null, password=null, phone=null, city=null], password=null, phone=null, city=null], city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var65 + "' != '" + 1L+ "'", var65.equals(1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var66 + "' != '" + "User [id=null, name=null, email=User [id=null, name=null, email=null, password=null, phone=null, city=null], password=null, phone=null, city=null]"+ "'", var66.equals("User [id=null, name=null, email=User [id=null, name=null, email=null, password=null, phone=null, city=null], password=null, phone=null, city=null]"));

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test84");


    br.com.addvisor.model.Address var2 = new br.com.addvisor.model.Address();
    java.lang.String var3 = var2.toString();
    br.com.addvisor.model.City var4 = new br.com.addvisor.model.City();
    var4.setName("hi!");
    var4.setName("null\nnull\nnull");
    var2.setCity(var4);
    var2.setLocation("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.Long var12 = var2.getId();
    java.lang.String var13 = var2.getLocation();
    br.com.addvisor.model.City var14 = var2.getCity();
    java.lang.String var15 = var2.getComplement();
    br.com.addvisor.model.City var16 = var2.getCity();
    br.com.addvisor.model.City var17 = var2.getCity();
    br.com.addvisor.model.Address var18 = new br.com.addvisor.model.Address("Se", "Evaluate [id=0, user=null, service=Service [id=null, name=null, description=null, tags=null, media=null, address=null\nnull\nnull, category=null, phones=null], note=0.0, comment=null] - Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]", var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "null\nnull\nnull"+ "'", var3.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var13.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test85");


    br.com.addvisor.model.User var0 = new br.com.addvisor.model.User();
    boolean var2 = var0.equals((java.lang.Object)(-1L));
    java.lang.String var3 = var0.toString();
    java.lang.String var4 = var0.getPassword();
    br.com.addvisor.model.City var5 = var0.getCity();
    br.com.addvisor.model.Evaluate var6 = new br.com.addvisor.model.Evaluate();
    var6.setId((java.lang.Long)10L);
    var6.setId((java.lang.Long)0L);
    br.com.addvisor.model.Service var11 = var6.getService();
    br.com.addvisor.model.User var14 = new br.com.addvisor.model.User("Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]]", "User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.Long var15 = var14.getId();
    var14.setId((java.lang.Long)(-1L));
    var14.setPhone("null\nnull\nnull");
    java.lang.String var20 = var14.getEmail();
    var14.setName("User [id=null, name=null, email=User [id=null, name=null, email=null, password=null, phone=null, city=null], password=null, phone=null, city=null]");
    var6.setUser(var14);
    var14.setPhone("Evaluate [id=0, user=null, service=null, note=null, comment=null]");
    br.com.addvisor.model.City var26 = var14.getCity();
    br.com.addvisor.model.Evaluate var27 = new br.com.addvisor.model.Evaluate();
    var27.setId((java.lang.Long)10L);
    var27.setId((java.lang.Long)0L);
    br.com.addvisor.model.User var32 = var27.getUser();
    var27.setComment("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    var27.setComment("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    br.com.addvisor.model.Service var37 = new br.com.addvisor.model.Service();
    java.lang.String var38 = var37.toString();
    var37.setMedia((java.lang.Float)10.0f);
    var27.setService(var37);
    boolean var42 = var14.equals((java.lang.Object)var37);
    br.com.addvisor.model.Evaluate var45 = new br.com.addvisor.model.Evaluate(var0, var37, (java.lang.Float)(-1.0f), "null - User [id=-1, name=null, email=null, password=21c96d96756cfeed7f71110d9cb1788b, phone=null\nnull\nnull, city=null]");
    java.util.List var46 = var37.getPhones();
    var37.setTags("Evaluate [id=null, user=null, service=null, note=10.0, comment=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var3.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]"+ "'", var38.equals("Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test86");


    br.com.addvisor.model.State var0 = new br.com.addvisor.model.State();
    boolean var2 = var0.equals((java.lang.Object)(byte)100);
    var0.setUf("null\nnull\nnull");
    br.com.addvisor.model.State var5 = new br.com.addvisor.model.State();
    int var6 = var0.compareTo(var5);
    java.lang.String var7 = var5.getName();
    var5.setId((java.lang.Long)10L);
    java.lang.Long var10 = var5.getId();
    java.lang.String var11 = var5.getName();
    java.lang.String var12 = var5.toString();
    br.com.addvisor.model.City var15 = new br.com.addvisor.model.City();
    br.com.addvisor.model.Address var16 = new br.com.addvisor.model.Address("null\nnull\nnull", "Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]]", var15);
    br.com.addvisor.model.State var17 = new br.com.addvisor.model.State();
    boolean var19 = var17.equals((java.lang.Object)(byte)100);
    var17.setUf("null\nnull\nnull");
    br.com.addvisor.model.State var22 = new br.com.addvisor.model.State();
    int var23 = var17.compareTo(var22);
    var22.setName("");
    var15.setState(var22);
    var22.setId((java.lang.Long)100L);
    br.com.addvisor.model.State var29 = new br.com.addvisor.model.State();
    boolean var31 = var29.equals((java.lang.Object)(byte)100);
    var29.setUf("null\nnull\nnull");
    br.com.addvisor.model.State var34 = new br.com.addvisor.model.State();
    int var35 = var29.compareTo(var34);
    var34.setName("");
    int var38 = var22.compareTo(var34);
    br.com.addvisor.model.State var39 = new br.com.addvisor.model.State();
    var39.setId((java.lang.Long)1L);
    br.com.addvisor.model.State var42 = new br.com.addvisor.model.State();
    var42.setId((java.lang.Long)1L);
    var42.setName("null\nnull\nnull");
    var42.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var49 = var42.getUf();
    java.lang.String var50 = var42.getName();
    br.com.addvisor.model.Country var51 = new br.com.addvisor.model.Country();
    java.lang.String var52 = var51.getAcronym();
    boolean var53 = var42.equals((java.lang.Object)var51);
    var39.setCountry(var51);
    var34.setCountry(var51);
    java.lang.Integer var56 = var51.getId();
    java.lang.String var57 = var51.getName();
    var51.setName("Evaluate [id=null, user=null, service=null, note=null, comment=null]");
    var51.setName("Evaluate [id=null, user=null, service=Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null], note=null, comment=null]");
    var5.setCountry(var51);
    br.com.addvisor.model.State var63 = new br.com.addvisor.model.State();
    boolean var65 = var63.equals((java.lang.Object)(byte)100);
    var63.setUf("null\nnull\nnull");
    br.com.addvisor.model.State var68 = new br.com.addvisor.model.State();
    int var69 = var63.compareTo(var68);
    java.lang.String var70 = var68.getName();
    var68.setId((java.lang.Long)10L);
    br.com.addvisor.model.Country var73 = var68.getCountry();
    var68.setUf("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var76 = var68.getName();
    br.com.addvisor.model.State var77 = new br.com.addvisor.model.State();
    boolean var79 = var77.equals((java.lang.Object)(byte)100);
    var77.setUf("null\nnull\nnull");
    br.com.addvisor.model.State var82 = new br.com.addvisor.model.State();
    int var83 = var77.compareTo(var82);
    var82.setName("");
    br.com.addvisor.model.Country var86 = new br.com.addvisor.model.Country();
    java.lang.Integer var87 = var86.getId();
    var82.setCountry(var86);
    int var89 = var68.compareTo(var82);
    boolean var90 = var5.equals((java.lang.Object)var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + 10L+ "'", var10.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "null - null"+ "'", var12.equals("null - null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var50.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var90 == false);

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test87");


    br.com.addvisor.model.Evaluate var0 = new br.com.addvisor.model.Evaluate();
    var0.setId((java.lang.Long)10L);
    var0.setId((java.lang.Long)0L);
    br.com.addvisor.model.Service var5 = var0.getService();
    br.com.addvisor.model.Service var6 = var0.getService();
    var0.setId((java.lang.Long)0L);
    java.lang.String var9 = var0.getComment();
    br.com.addvisor.model.Evaluate var10 = new br.com.addvisor.model.Evaluate();
    var10.setId((java.lang.Long)10L);
    var10.setId((java.lang.Long)0L);
    br.com.addvisor.model.Service var15 = var10.getService();
    br.com.addvisor.model.Service var16 = var10.getService();
    var10.setId((java.lang.Long)0L);
    boolean var19 = var0.equals((java.lang.Object)0L);
    java.lang.String var20 = var0.toString();
    br.com.addvisor.model.Address var21 = new br.com.addvisor.model.Address();
    java.lang.String var22 = var21.getComplement();
    java.lang.String var23 = var21.toString();
    br.com.addvisor.model.City var24 = var21.getCity();
    java.lang.String var25 = var21.getComplement();
    var21.setComplement("Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]]\nService [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]\nhi!");
    boolean var28 = var0.equals((java.lang.Object)"Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]]\nService [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]\nhi!");
    br.com.addvisor.model.Evaluate var29 = new br.com.addvisor.model.Evaluate();
    var29.setId((java.lang.Long)10L);
    var29.setId((java.lang.Long)0L);
    br.com.addvisor.model.Service var34 = var29.getService();
    br.com.addvisor.model.User var37 = new br.com.addvisor.model.User("Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]]", "User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.Long var38 = var37.getId();
    var37.setId((java.lang.Long)(-1L));
    var37.setPhone("null\nnull\nnull");
    java.lang.String var43 = var37.getEmail();
    var37.setName("User [id=null, name=null, email=User [id=null, name=null, email=null, password=null, phone=null, city=null], password=null, phone=null, city=null]");
    var29.setUser(var37);
    var37.setPhone("Evaluate [id=0, user=null, service=null, note=null, comment=null]");
    br.com.addvisor.model.City var49 = var37.getCity();
    br.com.addvisor.model.Evaluate var50 = new br.com.addvisor.model.Evaluate();
    var50.setId((java.lang.Long)10L);
    var50.setId((java.lang.Long)0L);
    br.com.addvisor.model.User var55 = var50.getUser();
    var50.setComment("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    var50.setComment("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    br.com.addvisor.model.Service var60 = new br.com.addvisor.model.Service();
    java.lang.String var61 = var60.toString();
    var60.setMedia((java.lang.Float)10.0f);
    var50.setService(var60);
    boolean var65 = var37.equals((java.lang.Object)var60);
    var0.setService(var60);
    java.lang.Float var67 = var0.getNote();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "Evaluate [id=0, user=null, service=null, note=null, comment=null]"+ "'", var20.equals("Evaluate [id=0, user=null, service=null, note=null, comment=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "null\nnull\nnull"+ "'", var23.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var61 + "' != '" + "Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]"+ "'", var61.equals("Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var67);

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test88");


    br.com.addvisor.model.Address var4 = new br.com.addvisor.model.Address();
    java.lang.String var5 = var4.getComplement();
    java.lang.String var6 = var4.toString();
    var4.setId((java.lang.Long)1L);
    br.com.addvisor.model.Address var9 = new br.com.addvisor.model.Address();
    java.lang.String var10 = var9.toString();
    br.com.addvisor.model.City var11 = new br.com.addvisor.model.City();
    var11.setName("hi!");
    var9.setCity(var11);
    var4.setCity(var11);
    java.lang.Long var16 = var11.getId();
    br.com.addvisor.model.User var17 = new br.com.addvisor.model.User();
    br.com.addvisor.model.State var18 = new br.com.addvisor.model.State();
    var18.setId((java.lang.Long)1L);
    var18.setName("null\nnull\nnull");
    var18.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var25 = var18.getUf();
    boolean var26 = var17.equals((java.lang.Object)var18);
    var18.setName("");
    br.com.addvisor.model.State var29 = new br.com.addvisor.model.State();
    var29.setId((java.lang.Long)1L);
    br.com.addvisor.model.Country var32 = var29.getCountry();
    int var33 = var18.compareTo(var29);
    br.com.addvisor.model.Country var34 = var29.getCountry();
    var11.setState(var29);
    br.com.addvisor.model.User var36 = new br.com.addvisor.model.User("Service [id=1, name=null, description=User [id=null, name=null, email=null, password=21c96d96756cfeed7f71110d9cb1788b, phone=Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]], city=null]\nnull\nnull, tags=null, media=null, address=null, category=null, phones=null]", "User [id=null, name=null, email=null, password=6f30ecc3178699bdb54df7daf6f7f49e, phone=User [id=null, name=null, email=null, password=null, phone=null, city=null], city=null\nnull\nnull]", "Service [id=null, name=null, description=User [id=null, name=null, email=null, password=null, phone=null, city=null], tags=User [id=-1, name=null, email=null, password=21c96d96756cfeed7f71110d9cb1788b, phone=null\nnull\nnull, city=null], media=null, address=null, category=null, phones=null]", "User [id=-1, name=null, email=null, password=21c96d96756cfeed7f71110d9cb1788b, phone=null\nnull\nnull, city=null]", var11);
    var36.setPhone("User [id=null, name=Country [id=null, name=Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null], acronym=User [id=-1, name=null, email=null, password=21c96d96756cfeed7f71110d9cb1788b, phone=null\nnull\nnull, city=null]], email= - , password=bab90b8667e900a415ffe18829d9e6f9, phone=Country [id=null, name=Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null], acronym=User [id=-1, name=null, email=null, password=21c96d96756cfeed7f71110d9cb1788b, phone=null\nnull\nnull, city=null]], city=hi!]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "null\nnull\nnull"+ "'", var6.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "null\nnull\nnull"+ "'", var10.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test89");


    br.com.addvisor.model.State var0 = new br.com.addvisor.model.State();
    boolean var2 = var0.equals((java.lang.Object)(byte)100);
    var0.setUf("null\nnull\nnull");
    br.com.addvisor.model.State var5 = new br.com.addvisor.model.State();
    int var6 = var0.compareTo(var5);
    var5.setName("");
    br.com.addvisor.model.Country var9 = new br.com.addvisor.model.Country();
    java.lang.Integer var10 = var9.getId();
    var5.setCountry(var9);
    br.com.addvisor.model.Country var12 = new br.com.addvisor.model.Country();
    java.lang.Integer var13 = var12.getId();
    java.lang.String var14 = var12.getName();
    var5.setCountry(var12);
    var5.setId((java.lang.Long)10L);
    br.com.addvisor.model.Agenda var18 = new br.com.addvisor.model.Agenda();
    java.util.List var19 = var18.getNames();
    java.util.List var20 = var18.getNumbers();
    br.com.addvisor.model.Agenda var21 = new br.com.addvisor.model.Agenda();
    java.util.List var22 = var21.getNames();
    java.util.List var23 = var21.getNumbers();
    var18.setNames(var23);
    br.com.addvisor.model.Agenda var25 = new br.com.addvisor.model.Agenda();
    java.util.List var26 = var25.getNames();
    java.util.List var27 = var25.getNumbers();
    br.com.addvisor.model.Agenda var28 = new br.com.addvisor.model.Agenda();
    java.util.List var29 = var28.getNames();
    java.util.List var30 = var28.getNumbers();
    var25.setNames(var30);
    var18.setNames(var30);
    java.util.Map var33 = var18.getContacts();
    br.com.addvisor.model.Agenda var34 = new br.com.addvisor.model.Agenda();
    java.util.Map var35 = var34.getContacts();
    var18.setContacts(var35);
    br.com.addvisor.model.Agenda var37 = new br.com.addvisor.model.Agenda();
    java.util.List var38 = var37.getNames();
    br.com.addvisor.model.Agenda var39 = new br.com.addvisor.model.Agenda();
    java.util.List var40 = var39.getNames();
    var37.setNames(var40);
    java.util.List var42 = var37.getNumbers();
    br.com.addvisor.model.Agenda var43 = new br.com.addvisor.model.Agenda();
    java.util.List var44 = var43.getNames();
    java.util.List var45 = var43.getNumbers();
    br.com.addvisor.model.Agenda var46 = new br.com.addvisor.model.Agenda();
    java.util.List var47 = var46.getNames();
    java.util.List var48 = var46.getNumbers();
    var43.setNames(var48);
    br.com.addvisor.model.Agenda var50 = new br.com.addvisor.model.Agenda();
    java.util.List var51 = var50.getNames();
    java.util.List var52 = var50.getNumbers();
    br.com.addvisor.model.Agenda var53 = new br.com.addvisor.model.Agenda();
    java.util.List var54 = var53.getNames();
    java.util.List var55 = var53.getNumbers();
    var50.setNames(var55);
    var43.setNames(var55);
    var37.setNumbers(var55);
    var37.addContact("", "");
    br.com.addvisor.model.Agenda var62 = new br.com.addvisor.model.Agenda();
    java.util.List var63 = var62.getNames();
    br.com.addvisor.model.Agenda var64 = new br.com.addvisor.model.Agenda();
    java.util.List var65 = var64.getNames();
    var62.setNames(var65);
    java.util.List var67 = var62.getNumbers();
    var37.setNames(var67);
    java.util.Map var69 = var37.getContacts();
    var18.setContacts(var69);
    boolean var71 = var5.equals((java.lang.Object)var69);
    var5.setName("Evaluate [id=0, user=null, service=Service [id=null, name=null, description=null, tags=null, media=null, address=null\nnull\nnull, category=null, phones=null], note=0.0, comment=null] - Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test90");


    br.com.addvisor.model.Country var0 = new br.com.addvisor.model.Country();
    java.lang.Integer var1 = var0.getId();
    java.lang.String var2 = var0.getName();
    java.lang.Integer var3 = var0.getId();
    var0.setName("Evaluate [id=-1, user=null, service=Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null], note=null, comment=null]");
    java.lang.String var6 = var0.getAcronym();
    br.com.addvisor.model.Evaluate var7 = new br.com.addvisor.model.Evaluate();
    var7.setId((java.lang.Long)10L);
    var7.setId((java.lang.Long)0L);
    br.com.addvisor.model.User var12 = var7.getUser();
    var7.setComment("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    br.com.addvisor.model.Service var15 = new br.com.addvisor.model.Service();
    java.lang.String var16 = var15.getName();
    var7.setService(var15);
    boolean var18 = var0.equals((java.lang.Object)var15);
    java.util.List var19 = var15.getPhones();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test91");


    br.com.addvisor.model.User var0 = new br.com.addvisor.model.User();
    boolean var2 = var0.equals((java.lang.Object)(-1L));
    java.lang.String var3 = var0.getDDD();
    var0.setPhone("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    br.com.addvisor.model.Address var6 = new br.com.addvisor.model.Address();
    java.lang.String var7 = var6.toString();
    br.com.addvisor.model.City var8 = new br.com.addvisor.model.City();
    var8.setName("hi!");
    var8.setName("null\nnull\nnull");
    var6.setCity(var8);
    var0.setCity(var8);
    java.lang.String var15 = var0.toString();
    java.lang.String var16 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "null\nnull\nnull"+ "'", var7.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=User [id=null, name=null, email=null, password=null, phone=null, city=null], city=null\nnull\nnull]"+ "'", var15.equals("User [id=null, name=null, email=null, password=null, phone=User [id=null, name=null, email=null, password=null, phone=null, city=null], city=null\nnull\nnull]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=User [id=null, name=null, email=null, password=null, phone=null, city=null], city=null\nnull\nnull]"+ "'", var16.equals("User [id=null, name=null, email=null, password=null, phone=User [id=null, name=null, email=null, password=null, phone=null, city=null], city=null\nnull\nnull]"));

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test92");


    br.com.addvisor.model.User var0 = new br.com.addvisor.model.User();
    br.com.addvisor.model.State var1 = new br.com.addvisor.model.State();
    var1.setId((java.lang.Long)1L);
    var1.setName("null\nnull\nnull");
    var1.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var8 = var1.getUf();
    boolean var9 = var0.equals((java.lang.Object)var1);
    br.com.addvisor.model.Service var10 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var11 = new br.com.addvisor.model.User();
    boolean var13 = var11.equals((java.lang.Object)(-1L));
    java.lang.String var14 = var11.toString();
    java.lang.String var15 = var11.getPassword();
    var10.setUser(var11);
    br.com.addvisor.model.Address var17 = var10.getAddress();
    java.lang.String var18 = var10.getName();
    br.com.addvisor.model.City var19 = new br.com.addvisor.model.City();
    var19.setName("hi!");
    var19.setName("null\nnull\nnull");
    br.com.addvisor.model.Address var24 = new br.com.addvisor.model.Address();
    java.lang.String var25 = var24.getComplement();
    java.lang.String var26 = var24.toString();
    boolean var27 = var19.equals((java.lang.Object)var26);
    br.com.addvisor.model.State var28 = new br.com.addvisor.model.State();
    var28.setId((java.lang.Long)1L);
    var28.setName("null\nnull\nnull");
    var28.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var35 = var28.getUf();
    var19.setState(var28);
    boolean var37 = var10.equals((java.lang.Object)var19);
    br.com.addvisor.model.Evaluate var40 = new br.com.addvisor.model.Evaluate(var0, var10, (java.lang.Float)100.0f, "");
    var10.setName("User [id=null, name=Country [id=null, name=Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null], acronym=User [id=-1, name=null, email=null, password=21c96d96756cfeed7f71110d9cb1788b, phone=null\nnull\nnull, city=null]], email= - , password=bab90b8667e900a415ffe18829d9e6f9, phone=Country [id=null, name=Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null], acronym=User [id=-1, name=null, email=null, password=21c96d96756cfeed7f71110d9cb1788b, phone=null\nnull\nnull, city=null]], city=hi!]");
    var10.setMedia((java.lang.Float)10.0f);
    br.com.addvisor.model.Address var45 = var10.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var14.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "null\nnull\nnull"+ "'", var26.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test93");


    br.com.addvisor.model.Country var0 = new br.com.addvisor.model.Country();
    java.lang.Integer var1 = var0.getId();
    java.lang.String var2 = var0.getName();
    java.lang.Integer var3 = var0.getId();
    var0.setName("Evaluate [id=-1, user=null, service=Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null], note=null, comment=null]");
    java.lang.String var6 = var0.getAcronym();
    var0.setAcronym("Evaluate [id=0, user=null, service=null, note=null, comment=null]\n\nnull");
    java.lang.String var9 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Country [id=null, name=Evaluate [id=-1, user=null, service=Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null], note=null, comment=null], acronym=Evaluate [id=0, user=null, service=null, note=null, comment=null]\n\nnull]"+ "'", var9.equals("Country [id=null, name=Evaluate [id=-1, user=null, service=Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null], note=null, comment=null], acronym=Evaluate [id=0, user=null, service=null, note=null, comment=null]\n\nnull]"));

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test94");


    br.com.addvisor.model.State var0 = new br.com.addvisor.model.State();
    boolean var2 = var0.equals((java.lang.Object)(byte)100);
    var0.setUf("null\nnull\nnull");
    java.lang.String var5 = var0.getName();
    java.lang.String var6 = var0.toString();
    java.lang.Long var7 = var0.getId();
    br.com.addvisor.model.Country var8 = var0.getCountry();
    br.com.addvisor.model.State var9 = new br.com.addvisor.model.State();
    var9.setId((java.lang.Long)1L);
    var9.setName("null\nnull\nnull");
    var9.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var16 = var9.getUf();
    java.lang.String var17 = var9.getName();
    br.com.addvisor.model.State var18 = new br.com.addvisor.model.State();
    var18.setId((java.lang.Long)1L);
    var18.setName("null\nnull\nnull");
    var18.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var25 = var18.getUf();
    java.lang.String var26 = var18.getName();
    br.com.addvisor.model.Country var27 = new br.com.addvisor.model.Country();
    java.lang.String var28 = var27.getAcronym();
    boolean var29 = var18.equals((java.lang.Object)var27);
    java.lang.String var30 = var27.getAcronym();
    java.lang.String var31 = var27.toString();
    var9.setCountry(var27);
    var0.setCountry(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "null - null\nnull\nnull"+ "'", var6.equals("null - null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var17.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var26.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "Country [id=null, name=null, acronym=null]"+ "'", var31.equals("Country [id=null, name=null, acronym=null]"));

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test95");


    br.com.addvisor.model.User var0 = new br.com.addvisor.model.User();
    boolean var2 = var0.equals((java.lang.Object)(-1L));
    java.lang.String var3 = var0.toString();
    java.lang.String var4 = var0.getPassword();
    java.lang.String var5 = var0.getPassword();
    br.com.addvisor.model.Evaluate var6 = new br.com.addvisor.model.Evaluate();
    var6.setId((java.lang.Long)10L);
    var6.setId((java.lang.Long)0L);
    var6.setComment("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    br.com.addvisor.model.Agenda var13 = new br.com.addvisor.model.Agenda();
    java.util.List var14 = var13.getNames();
    br.com.addvisor.model.Agenda var15 = new br.com.addvisor.model.Agenda();
    java.util.List var16 = var15.getNames();
    var13.setNames(var16);
    java.util.List var18 = var13.getNumbers();
    boolean var19 = var6.equals((java.lang.Object)var13);
    java.util.List var20 = var13.getNumbers();
    boolean var21 = var0.equals((java.lang.Object)var13);
    var13.addContact("Evaluate [id=0, user=null, service=Service [id=null, name=null, description=null, tags=null, media=null, address=null\nnull\nnull, category=null, phones=null], note=0.0, comment=null]", "Country [id=100, name=null, acronym=null]");
    java.util.List var25 = var13.getNumbers();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var3.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test96");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.addvisor.model.enums.PriceCat var1 = br.com.addvisor.model.enums.PriceCat.getPrice("Service [id=null, name=null, description=null, tags=null, media=100.0, address=null, category=null, phones=null]");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test97");


    br.com.addvisor.model.Agenda var0 = new br.com.addvisor.model.Agenda();
    java.util.List var1 = var0.getNames();
    java.util.List var2 = var0.getNumbers();
    br.com.addvisor.model.Agenda var3 = new br.com.addvisor.model.Agenda();
    java.util.List var4 = var3.getNames();
    java.util.List var5 = var3.getNumbers();
    var0.setNames(var5);
    br.com.addvisor.model.Agenda var7 = new br.com.addvisor.model.Agenda();
    java.util.List var8 = var7.getNames();
    java.util.List var9 = var7.getNumbers();
    br.com.addvisor.model.Agenda var10 = new br.com.addvisor.model.Agenda();
    java.util.List var11 = var10.getNames();
    java.util.List var12 = var10.getNumbers();
    var7.setNames(var12);
    var0.setNames(var12);
    java.util.Map var15 = var0.getContacts();
    br.com.addvisor.model.Agenda var16 = new br.com.addvisor.model.Agenda();
    java.util.Map var17 = var16.getContacts();
    var0.setContacts(var17);
    var0.addContact("User [id=null, name=null, email=null, password=428e147830819130e93707f1ce3a3cdb, phone=null, city=null]", "null - null");
    br.com.addvisor.model.Agenda var22 = new br.com.addvisor.model.Agenda();
    java.util.List var23 = var22.getNames();
    java.util.List var24 = var22.getNumbers();
    br.com.addvisor.model.Agenda var25 = new br.com.addvisor.model.Agenda();
    java.util.List var26 = var25.getNames();
    java.util.List var27 = var25.getNumbers();
    var22.setNames(var27);
    br.com.addvisor.model.Agenda var29 = new br.com.addvisor.model.Agenda();
    java.util.List var30 = var29.getNames();
    java.util.List var31 = var29.getNumbers();
    br.com.addvisor.model.Agenda var32 = new br.com.addvisor.model.Agenda();
    java.util.List var33 = var32.getNames();
    java.util.List var34 = var32.getNumbers();
    var29.setNames(var34);
    var22.setNames(var34);
    br.com.addvisor.model.Agenda var37 = new br.com.addvisor.model.Agenda();
    java.util.List var38 = var37.getNames();
    java.util.List var39 = var37.getNumbers();
    var22.setNames(var39);
    var0.setNames(var39);
    br.com.addvisor.model.Agenda var42 = new br.com.addvisor.model.Agenda();
    java.util.List var43 = var42.getNames();
    java.util.List var44 = var42.getNumbers();
    br.com.addvisor.model.Agenda var45 = new br.com.addvisor.model.Agenda();
    java.util.List var46 = var45.getNames();
    java.util.List var47 = var45.getNumbers();
    var42.setNames(var47);
    br.com.addvisor.model.Agenda var49 = new br.com.addvisor.model.Agenda();
    java.util.List var50 = var49.getNames();
    java.util.List var51 = var49.getNumbers();
    br.com.addvisor.model.Agenda var52 = new br.com.addvisor.model.Agenda();
    java.util.List var53 = var52.getNames();
    java.util.List var54 = var52.getNumbers();
    var49.setNames(var54);
    var42.setNames(var54);
    java.util.Map var57 = var42.getContacts();
    br.com.addvisor.model.Agenda var58 = new br.com.addvisor.model.Agenda();
    java.util.Map var59 = var58.getContacts();
    var42.setContacts(var59);
    var42.addContact("User [id=null, name=null, email=null, password=428e147830819130e93707f1ce3a3cdb, phone=null, city=null]", "null - null");
    br.com.addvisor.model.Agenda var64 = new br.com.addvisor.model.Agenda();
    java.util.List var65 = var64.getNames();
    java.util.List var66 = var64.getNumbers();
    br.com.addvisor.model.Agenda var67 = new br.com.addvisor.model.Agenda();
    java.util.List var68 = var67.getNames();
    java.util.List var69 = var67.getNumbers();
    var64.setNames(var69);
    br.com.addvisor.model.Agenda var71 = new br.com.addvisor.model.Agenda();
    java.util.List var72 = var71.getNames();
    java.util.List var73 = var71.getNumbers();
    br.com.addvisor.model.Agenda var74 = new br.com.addvisor.model.Agenda();
    java.util.List var75 = var74.getNames();
    java.util.List var76 = var74.getNumbers();
    var71.setNames(var76);
    var64.setNames(var76);
    br.com.addvisor.model.Agenda var79 = new br.com.addvisor.model.Agenda();
    java.util.List var80 = var79.getNames();
    java.util.List var81 = var79.getNumbers();
    var64.setNames(var81);
    var42.setNames(var81);
    var0.setNames(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test98");


    br.com.addvisor.model.Evaluate var0 = new br.com.addvisor.model.Evaluate();
    br.com.addvisor.model.Country var1 = new br.com.addvisor.model.Country();
    java.lang.Integer var2 = var1.getId();
    java.lang.String var3 = var1.getName();
    java.lang.String var4 = var1.getName();
    var1.setId((java.lang.Integer)100);
    boolean var7 = var0.equals((java.lang.Object)var1);
    java.lang.String var8 = var1.getName();
    java.lang.String var9 = var1.getAcronym();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test99");


    br.com.addvisor.model.Evaluate var0 = new br.com.addvisor.model.Evaluate();
    br.com.addvisor.model.State var1 = new br.com.addvisor.model.State();
    boolean var3 = var1.equals((java.lang.Object)(byte)100);
    var1.setUf("null\nnull\nnull");
    boolean var6 = var0.equals((java.lang.Object)var1);
    br.com.addvisor.model.Service var7 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var8 = new br.com.addvisor.model.User();
    boolean var10 = var8.equals((java.lang.Object)(-1L));
    java.lang.String var11 = var8.toString();
    java.lang.String var12 = var8.getPassword();
    var7.setUser(var8);
    br.com.addvisor.model.Address var14 = var7.getAddress();
    java.lang.String var15 = var7.getDescription();
    boolean var16 = var0.equals((java.lang.Object)var7);
    br.com.addvisor.model.Evaluate var17 = new br.com.addvisor.model.Evaluate();
    var17.setId((java.lang.Long)10L);
    var17.setId((java.lang.Long)0L);
    br.com.addvisor.model.User var22 = var17.getUser();
    java.lang.Long var23 = var17.getId();
    br.com.addvisor.model.Service var24 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var25 = new br.com.addvisor.model.User();
    boolean var27 = var25.equals((java.lang.Object)(-1L));
    java.lang.String var28 = var25.toString();
    java.lang.String var29 = var25.getPassword();
    var24.setUser(var25);
    br.com.addvisor.model.Address var31 = var24.getAddress();
    java.lang.String var32 = var24.getDescription();
    var17.setService(var24);
    boolean var34 = var7.equals((java.lang.Object)var24);
    br.com.addvisor.model.User var35 = new br.com.addvisor.model.User();
    boolean var37 = var35.equals((java.lang.Object)(-1L));
    java.lang.String var38 = var35.getDDD();
    var35.setPhone("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    boolean var41 = var24.equals((java.lang.Object)"User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    br.com.addvisor.model.User var44 = new br.com.addvisor.model.User("User [id=null, name=null, email=User [id=null, name=null, email=null, password=null, phone=null, city=null], password=null, phone=null, city=null]", "Country [id=null, name=null, acronym=null]");
    var24.setUser(var44);
    br.com.addvisor.model.Country var46 = new br.com.addvisor.model.Country();
    java.lang.Integer var47 = var46.getId();
    br.com.addvisor.model.State var48 = new br.com.addvisor.model.State();
    boolean var50 = var48.equals((java.lang.Object)(byte)100);
    var48.setUf("null\nnull\nnull");
    br.com.addvisor.model.State var53 = new br.com.addvisor.model.State();
    int var54 = var48.compareTo(var53);
    boolean var55 = var46.equals((java.lang.Object)var53);
    var46.setName("Service [id=100, name=, description=null, tags=null, media=null, address=null, category=null, phones=null]");
    br.com.addvisor.model.Address var58 = new br.com.addvisor.model.Address();
    java.lang.String var59 = var58.getLocation();
    java.lang.String var60 = var58.getComplement();
    br.com.addvisor.model.Address var61 = new br.com.addvisor.model.Address();
    java.lang.String var62 = var61.toString();
    br.com.addvisor.model.City var63 = new br.com.addvisor.model.City();
    var63.setName("hi!");
    var63.setName("null\nnull\nnull");
    var61.setCity(var63);
    java.lang.Long var69 = var63.getId();
    var58.setCity(var63);
    boolean var71 = var46.equals((java.lang.Object)var63);
    br.com.addvisor.model.Address var72 = new br.com.addvisor.model.Address();
    java.lang.String var73 = var72.toString();
    br.com.addvisor.model.City var74 = new br.com.addvisor.model.City();
    var74.setName("hi!");
    var74.setName("null\nnull\nnull");
    var72.setCity(var74);
    java.lang.String var80 = var74.getName();
    var74.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    int var83 = var63.compareTo(var74);
    boolean var84 = var24.equals((java.lang.Object)var63);
    java.lang.Long var85 = var24.getId();
    br.com.addvisor.model.User var86 = var24.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var11.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + 0L+ "'", var23.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var28.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var62 + "' != '" + "null\nnull\nnull"+ "'", var62.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var73 + "' != '" + "null\nnull\nnull"+ "'", var73.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var80 + "' != '" + "null\nnull\nnull"+ "'", var80.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == 25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test100");


    br.com.addvisor.model.Evaluate var0 = new br.com.addvisor.model.Evaluate();
    var0.setId((java.lang.Long)10L);
    var0.setId((java.lang.Long)0L);
    var0.setComment("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    br.com.addvisor.model.Agenda var7 = new br.com.addvisor.model.Agenda();
    java.util.List var8 = var7.getNames();
    br.com.addvisor.model.Agenda var9 = new br.com.addvisor.model.Agenda();
    java.util.List var10 = var9.getNames();
    var7.setNames(var10);
    java.util.List var12 = var7.getNumbers();
    boolean var13 = var0.equals((java.lang.Object)var7);
    java.util.List var14 = var7.getNumbers();
    java.util.List var15 = var7.getNumbers();
    var7.addContact("Us", "Country [id=10, name=null, acronym=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test101");


    br.com.addvisor.model.Address var0 = new br.com.addvisor.model.Address();
    java.lang.String var1 = var0.toString();
    br.com.addvisor.model.City var2 = new br.com.addvisor.model.City();
    var2.setName("hi!");
    var0.setCity(var2);
    var0.setLocation("");
    java.lang.String var8 = var0.getLocation();
    java.lang.String var9 = var0.getComplement();
    java.lang.String var10 = var0.toString();
    java.lang.String var11 = var0.getLocation();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "null\nnull\nnull"+ "'", var1.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "\nnull\nhi!"+ "'", var10.equals("\nnull\nhi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test102");


    br.com.addvisor.model.Evaluate var0 = new br.com.addvisor.model.Evaluate();
    br.com.addvisor.model.Service var1 = var0.getService();
    java.lang.Long var2 = var0.getId();
    var0.setId((java.lang.Long)10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test103");


    br.com.addvisor.model.Service var0 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var1 = new br.com.addvisor.model.User();
    boolean var3 = var1.equals((java.lang.Object)(-1L));
    java.lang.String var4 = var1.toString();
    java.lang.String var5 = var1.getPassword();
    var0.setUser(var1);
    br.com.addvisor.model.Address var7 = var0.getAddress();
    br.com.addvisor.model.enums.ServiceCat var8 = var0.getCategory();
    java.lang.String var9 = var0.getTags();
    java.lang.String var10 = var0.toString();
    var0.setId((java.lang.Long)1L);
    br.com.addvisor.model.User var13 = var0.getUser();
    br.com.addvisor.model.User var16 = new br.com.addvisor.model.User("Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]]", "User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.Long var17 = var16.getId();
    var16.setId((java.lang.Long)(-1L));
    var16.setPhone("null\nnull\nnull");
    java.lang.String var22 = var16.getEmail();
    var16.setName("User [id=null, name=null, email=User [id=null, name=null, email=null, password=null, phone=null, city=null], password=null, phone=null, city=null]");
    br.com.addvisor.model.City var31 = new br.com.addvisor.model.City();
    var31.setName("hi!");
    var31.setName("null\nnull\nnull");
    br.com.addvisor.model.Address var36 = new br.com.addvisor.model.Address();
    java.lang.String var37 = var36.getComplement();
    java.lang.String var38 = var36.toString();
    boolean var39 = var31.equals((java.lang.Object)var38);
    br.com.addvisor.model.User var40 = new br.com.addvisor.model.User("hi!", "", "hi!", "User [id=null, name=null, email=null, password=null, phone=null, city=null]", var31);
    br.com.addvisor.model.Address var41 = new br.com.addvisor.model.Address("null\nnull\nnull", "User [id=null, name=null, email=null, password=null, phone=null, city=null]", var31);
    var41.setComplement("");
    br.com.addvisor.model.City var44 = var41.getCity();
    boolean var45 = var16.equals((java.lang.Object)var41);
    var16.setId((java.lang.Long)1L);
    boolean var48 = var13.equals((java.lang.Object)1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var4.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]"+ "'", var10.equals("Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "null\nnull\nnull"+ "'", var38.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test104");


    br.com.addvisor.model.State var0 = new br.com.addvisor.model.State();
    var0.setId((java.lang.Long)1L);
    br.com.addvisor.model.Country var3 = var0.getCountry();
    java.lang.String var4 = var0.getUf();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test105");


    br.com.addvisor.model.Service var0 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var1 = new br.com.addvisor.model.User();
    boolean var3 = var1.equals((java.lang.Object)(-1L));
    java.lang.String var4 = var1.toString();
    java.lang.String var5 = var1.getPassword();
    var0.setUser(var1);
    br.com.addvisor.model.Address var7 = var0.getAddress();
    java.lang.String var8 = var0.getDescription();
    java.lang.Float var9 = var0.getMedia();
    var0.setMedia((java.lang.Float)10.0f);
    java.lang.Long var12 = var0.getId();
    java.lang.String var13 = var0.getTags();
    br.com.addvisor.model.enums.ServiceCat var14 = var0.getCategory();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var4.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
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
    assertNull(var14);

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test106");


    br.com.addvisor.model.User var0 = new br.com.addvisor.model.User();
    boolean var2 = var0.equals((java.lang.Object)(-1L));
    java.lang.String var3 = var0.toString();
    br.com.addvisor.model.Evaluate var4 = new br.com.addvisor.model.Evaluate();
    var4.setId((java.lang.Long)10L);
    var4.setId((java.lang.Long)0L);
    br.com.addvisor.model.User var9 = var4.getUser();
    boolean var10 = var0.equals((java.lang.Object)var4);
    java.lang.String var11 = var0.getPassword();
    var0.setId((java.lang.Long)100L);
    br.com.addvisor.model.Address var14 = new br.com.addvisor.model.Address();
    java.lang.String var15 = var14.getComplement();
    java.lang.String var16 = var14.toString();
    boolean var17 = var0.equals((java.lang.Object)var14);
    var0.setPassword("Evaluate [id=0, user=null, service=Service [id=null, name=null, description=null, tags=null, media=null, address=null\nnull\nnull, category=null, phones=null], note=0.0, comment=null]");
    var0.setName("null\nnull\nnull - null");
    br.com.addvisor.model.City var22 = new br.com.addvisor.model.City();
    var22.setName("hi!");
    var22.setName("null\nnull\nnull");
    java.lang.String var27 = var22.getName();
    var0.setCity(var22);
    java.lang.String var29 = var22.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var3.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "null\nnull\nnull"+ "'", var16.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "null\nnull\nnull"+ "'", var27.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "null\nnull\nnull"+ "'", var29.equals("null\nnull\nnull"));

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test107");


    br.com.addvisor.model.User var0 = new br.com.addvisor.model.User();
    boolean var2 = var0.equals((java.lang.Object)(-1L));
    java.lang.String var3 = var0.toString();
    br.com.addvisor.model.Evaluate var4 = new br.com.addvisor.model.Evaluate();
    var4.setId((java.lang.Long)10L);
    var4.setId((java.lang.Long)0L);
    br.com.addvisor.model.User var9 = var4.getUser();
    boolean var10 = var0.equals((java.lang.Object)var4);
    java.lang.String var11 = var4.getComment();
    var4.setId((java.lang.Long)1L);
    java.lang.Long var14 = var4.getId();
    br.com.addvisor.model.User var15 = var4.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var3.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + 1L+ "'", var14.equals(1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test108");


    br.com.addvisor.model.Evaluate var0 = new br.com.addvisor.model.Evaluate();
    var0.setId((java.lang.Long)10L);
    var0.setId((java.lang.Long)0L);
    java.lang.Float var5 = var0.getNote();
    br.com.addvisor.model.Service var6 = new br.com.addvisor.model.Service();
    java.lang.String var7 = var6.toString();
    var0.setService(var6);
    var0.setId((java.lang.Long)(-1L));
    br.com.addvisor.model.Evaluate var11 = new br.com.addvisor.model.Evaluate();
    br.com.addvisor.model.State var12 = new br.com.addvisor.model.State();
    boolean var14 = var12.equals((java.lang.Object)(byte)100);
    var12.setUf("null\nnull\nnull");
    boolean var17 = var11.equals((java.lang.Object)var12);
    br.com.addvisor.model.Service var18 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var19 = new br.com.addvisor.model.User();
    boolean var21 = var19.equals((java.lang.Object)(-1L));
    java.lang.String var22 = var19.toString();
    java.lang.String var23 = var19.getPassword();
    var18.setUser(var19);
    br.com.addvisor.model.Address var25 = var18.getAddress();
    var11.setService(var18);
    br.com.addvisor.model.enums.ServiceCat var27 = var18.getCategory();
    br.com.addvisor.model.Address var28 = new br.com.addvisor.model.Address();
    var28.setId((java.lang.Long)0L);
    var18.setAddress(var28);
    boolean var32 = var0.equals((java.lang.Object)var18);
    var18.setId((java.lang.Long)(-1L));
    br.com.addvisor.model.User var35 = new br.com.addvisor.model.User();
    boolean var37 = var35.equals((java.lang.Object)(-1L));
    java.lang.String var38 = var35.toString();
    br.com.addvisor.model.Evaluate var39 = new br.com.addvisor.model.Evaluate();
    var39.setId((java.lang.Long)10L);
    var39.setId((java.lang.Long)0L);
    br.com.addvisor.model.User var44 = var39.getUser();
    boolean var45 = var35.equals((java.lang.Object)var39);
    java.lang.String var46 = var35.getPassword();
    var35.setId((java.lang.Long)0L);
    var35.setName("null\nnull\nnull");
    var18.setUser(var35);
    var35.setPhone("Service [id=1, name=Service [id=10, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null], description=null, tags=null, media=null, address=null\nnull\nnull, category=null, phones=null]");
    java.lang.String var54 = var35.getPhone();
    var35.setPhone("Service [id=100, name=, description=null, tags=null, media=null, address=null, category=null, phones=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]"+ "'", var7.equals("Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var22.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var38.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + "Service [id=1, name=Service [id=10, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null], description=null, tags=null, media=null, address=null\nnull\nnull, category=null, phones=null]"+ "'", var54.equals("Service [id=1, name=Service [id=10, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null], description=null, tags=null, media=null, address=null\nnull\nnull, category=null, phones=null]"));

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test109");


    br.com.addvisor.model.Evaluate var0 = new br.com.addvisor.model.Evaluate();
    var0.setId((java.lang.Long)10L);
    var0.setId((java.lang.Long)0L);
    java.lang.Float var5 = var0.getNote();
    java.lang.Float var6 = var0.getNote();
    var0.setNote((java.lang.Float)100.0f);
    java.lang.Long var9 = var0.getId();
    br.com.addvisor.model.User var10 = var0.getUser();
    br.com.addvisor.model.User var11 = var0.getUser();
    java.lang.String var12 = var0.getComment();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + 0L+ "'", var9.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test110");


    br.com.addvisor.model.User var2 = new br.com.addvisor.model.User("Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]]", "User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.Long var3 = var2.getId();
    var2.setId((java.lang.Long)(-1L));
    var2.setPhone("null\nnull\nnull");
    java.lang.String var8 = var2.getEmail();
    var2.setName("User [id=null, name=null, email=User [id=null, name=null, email=null, password=null, phone=null, city=null], password=null, phone=null, city=null]");
    var2.setName("");
    br.com.addvisor.model.City var13 = var2.getCity();
    var2.setPhone("Evaluate [id=0, user=User [id=null, name=null, email=null, password=null, phone=User [id=null, name=null, email=null, password=null, phone=null, city=null], city=null], service=Service [id=null, name=null, description=null, tags=null, media=null, address=null\nnull\nnull, category=null, phones=null], note=null, comment=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test111");


    br.com.addvisor.model.User var2 = new br.com.addvisor.model.User("", "Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]");
    java.lang.String var3 = var2.getPhone();
    br.com.addvisor.model.Service var4 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var5 = new br.com.addvisor.model.User();
    boolean var7 = var5.equals((java.lang.Object)(-1L));
    java.lang.String var8 = var5.toString();
    java.lang.String var9 = var5.getPassword();
    var4.setUser(var5);
    br.com.addvisor.model.Address var11 = var4.getAddress();
    br.com.addvisor.model.Address var12 = new br.com.addvisor.model.Address();
    java.lang.String var13 = var12.getComplement();
    java.lang.String var14 = var12.toString();
    br.com.addvisor.model.City var15 = var12.getCity();
    br.com.addvisor.model.State var16 = new br.com.addvisor.model.State();
    var16.setId((java.lang.Long)1L);
    var16.setName("null\nnull\nnull");
    var16.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var23 = var16.getUf();
    boolean var24 = var12.equals((java.lang.Object)var16);
    var4.setAddress(var12);
    br.com.addvisor.model.User var26 = var4.getUser();
    java.lang.String var27 = var4.toString();
    br.com.addvisor.model.enums.ServiceCat var28 = var4.getCategory();
    br.com.addvisor.model.Evaluate var31 = new br.com.addvisor.model.Evaluate(var2, var4, (java.lang.Float)0.0f, "Service [id=1, name=null, description=Evaluate [id=null, user=null, service=null, note=null, comment=null], tags=null, media=null, address=null, category=null, phones=null]");
    java.lang.Float var32 = var31.getNote();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var8.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "null\nnull\nnull"+ "'", var14.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "Service [id=null, name=null, description=null, tags=null, media=null, address=null\nnull\nnull, category=null, phones=null]"+ "'", var27.equals("Service [id=null, name=null, description=null, tags=null, media=null, address=null\nnull\nnull, category=null, phones=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + 0.0f+ "'", var32.equals(0.0f));

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test112");


    br.com.addvisor.model.Service var0 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var1 = new br.com.addvisor.model.User();
    boolean var3 = var1.equals((java.lang.Object)(-1L));
    java.lang.String var4 = var1.toString();
    java.lang.String var5 = var1.getPassword();
    var0.setUser(var1);
    br.com.addvisor.model.Address var7 = var0.getAddress();
    br.com.addvisor.model.Address var8 = new br.com.addvisor.model.Address();
    java.lang.String var9 = var8.getComplement();
    java.lang.String var10 = var8.toString();
    br.com.addvisor.model.City var11 = var8.getCity();
    br.com.addvisor.model.State var12 = new br.com.addvisor.model.State();
    var12.setId((java.lang.Long)1L);
    var12.setName("null\nnull\nnull");
    var12.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var19 = var12.getUf();
    boolean var20 = var8.equals((java.lang.Object)var12);
    var0.setAddress(var8);
    br.com.addvisor.model.User var22 = new br.com.addvisor.model.User();
    boolean var24 = var22.equals((java.lang.Object)(-1L));
    java.lang.String var25 = var22.toString();
    java.lang.String var26 = var22.getName();
    java.lang.String var27 = var22.getName();
    java.lang.String var28 = var22.getName();
    java.lang.String var29 = var22.getPassword();
    var0.setUser(var22);
    java.lang.String var31 = var22.toString();
    java.lang.String var32 = var22.getPassword();
    var22.setName("6a526e9ea8abcc547d30e98aac13c6cc");
    br.com.addvisor.model.City var35 = var22.getCity();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var4.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "null\nnull\nnull"+ "'", var10.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var25.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var31.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test113");


    br.com.addvisor.model.Agenda var0 = new br.com.addvisor.model.Agenda();
    java.util.Map var1 = var0.getContacts();
    br.com.addvisor.model.Evaluate var2 = new br.com.addvisor.model.Evaluate();
    var2.setId((java.lang.Long)10L);
    var2.setId((java.lang.Long)0L);
    var2.setComment("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    br.com.addvisor.model.Agenda var9 = new br.com.addvisor.model.Agenda();
    java.util.List var10 = var9.getNames();
    br.com.addvisor.model.Agenda var11 = new br.com.addvisor.model.Agenda();
    java.util.List var12 = var11.getNames();
    var9.setNames(var12);
    java.util.List var14 = var9.getNumbers();
    boolean var15 = var2.equals((java.lang.Object)var9);
    br.com.addvisor.model.Agenda var16 = new br.com.addvisor.model.Agenda();
    java.util.List var17 = var16.getNames();
    br.com.addvisor.model.Agenda var18 = new br.com.addvisor.model.Agenda();
    java.util.List var19 = var18.getNames();
    var16.setNames(var19);
    java.util.List var21 = var16.getNumbers();
    br.com.addvisor.model.Agenda var22 = new br.com.addvisor.model.Agenda();
    java.util.List var23 = var22.getNames();
    java.util.List var24 = var22.getNumbers();
    br.com.addvisor.model.Agenda var25 = new br.com.addvisor.model.Agenda();
    java.util.List var26 = var25.getNames();
    java.util.List var27 = var25.getNumbers();
    var22.setNames(var27);
    br.com.addvisor.model.Agenda var29 = new br.com.addvisor.model.Agenda();
    java.util.List var30 = var29.getNames();
    java.util.List var31 = var29.getNumbers();
    br.com.addvisor.model.Agenda var32 = new br.com.addvisor.model.Agenda();
    java.util.List var33 = var32.getNames();
    java.util.List var34 = var32.getNumbers();
    var29.setNames(var34);
    var22.setNames(var34);
    var16.setNumbers(var34);
    var16.addContact("", "");
    br.com.addvisor.model.Agenda var41 = new br.com.addvisor.model.Agenda();
    java.util.List var42 = var41.getNames();
    br.com.addvisor.model.Agenda var43 = new br.com.addvisor.model.Agenda();
    java.util.List var44 = var43.getNames();
    var41.setNames(var44);
    java.util.List var46 = var41.getNumbers();
    var16.setNames(var46);
    br.com.addvisor.model.Agenda var48 = new br.com.addvisor.model.Agenda();
    java.util.List var49 = var48.getNames();
    br.com.addvisor.model.Agenda var50 = new br.com.addvisor.model.Agenda();
    java.util.List var51 = var50.getNames();
    var48.setNames(var51);
    var16.setNames(var51);
    var9.setNumbers(var51);
    java.util.List var55 = var9.getNames();
    var0.setNumbers(var55);
    java.util.List var57 = var0.getNames();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test114");


    br.com.addvisor.model.Evaluate var0 = new br.com.addvisor.model.Evaluate();
    br.com.addvisor.model.State var1 = new br.com.addvisor.model.State();
    boolean var3 = var1.equals((java.lang.Object)(byte)100);
    var1.setUf("null\nnull\nnull");
    boolean var6 = var0.equals((java.lang.Object)var1);
    br.com.addvisor.model.Service var7 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var8 = new br.com.addvisor.model.User();
    boolean var10 = var8.equals((java.lang.Object)(-1L));
    java.lang.String var11 = var8.toString();
    java.lang.String var12 = var8.getPassword();
    var7.setUser(var8);
    br.com.addvisor.model.Address var14 = var7.getAddress();
    java.lang.String var15 = var7.getDescription();
    boolean var16 = var0.equals((java.lang.Object)var7);
    var0.setNote((java.lang.Float)0.0f);
    java.lang.String var19 = var0.getComment();
    br.com.addvisor.model.User var22 = new br.com.addvisor.model.User("Evaluate [id=null, user=null, service=null, note=null, comment=]", "Service [id=100, name=, description=null, tags=null, media=null, address=null, category=null, phones=null]");
    var0.setUser(var22);
    java.lang.Long var24 = var0.getId();
    br.com.addvisor.model.Service var25 = var0.getService();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var11.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test115");


    br.com.addvisor.model.Evaluate var0 = new br.com.addvisor.model.Evaluate();
    var0.setId((java.lang.Long)10L);
    java.lang.Long var3 = var0.getId();
    var0.setComment("Service [id=1, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]");
    br.com.addvisor.model.User var6 = new br.com.addvisor.model.User();
    boolean var8 = var6.equals((java.lang.Object)(-1L));
    java.lang.String var9 = var6.toString();
    java.lang.String var10 = var6.getPassword();
    java.lang.String var11 = var6.getPhone();
    br.com.addvisor.model.User var12 = new br.com.addvisor.model.User();
    br.com.addvisor.model.State var13 = new br.com.addvisor.model.State();
    var13.setId((java.lang.Long)1L);
    var13.setName("null\nnull\nnull");
    var13.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var20 = var13.getUf();
    boolean var21 = var12.equals((java.lang.Object)var13);
    br.com.addvisor.model.Service var22 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var23 = new br.com.addvisor.model.User();
    boolean var25 = var23.equals((java.lang.Object)(-1L));
    java.lang.String var26 = var23.toString();
    java.lang.String var27 = var23.getPassword();
    var22.setUser(var23);
    br.com.addvisor.model.Address var29 = var22.getAddress();
    java.lang.String var30 = var22.getName();
    br.com.addvisor.model.City var31 = new br.com.addvisor.model.City();
    var31.setName("hi!");
    var31.setName("null\nnull\nnull");
    br.com.addvisor.model.Address var36 = new br.com.addvisor.model.Address();
    java.lang.String var37 = var36.getComplement();
    java.lang.String var38 = var36.toString();
    boolean var39 = var31.equals((java.lang.Object)var38);
    br.com.addvisor.model.State var40 = new br.com.addvisor.model.State();
    var40.setId((java.lang.Long)1L);
    var40.setName("null\nnull\nnull");
    var40.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var47 = var40.getUf();
    var31.setState(var40);
    boolean var49 = var22.equals((java.lang.Object)var31);
    br.com.addvisor.model.Evaluate var52 = new br.com.addvisor.model.Evaluate(var12, var22, (java.lang.Float)100.0f, "");
    br.com.addvisor.model.Evaluate var55 = new br.com.addvisor.model.Evaluate(var6, var22, (java.lang.Float)0.0f, "User [id=null, name=null, email=User [id=null, name=null, email=null, password=null, phone=null, city=null], password=null, phone=null, city=null]");
    java.lang.Long var56 = var22.getId();
    br.com.addvisor.model.User var57 = new br.com.addvisor.model.User();
    boolean var59 = var57.equals((java.lang.Object)(-1L));
    boolean var61 = var57.equals((java.lang.Object)100.0d);
    var57.setEmail("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var64 = var57.toString();
    var22.setUser(var57);
    br.com.addvisor.model.Service var66 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var67 = new br.com.addvisor.model.User();
    boolean var69 = var67.equals((java.lang.Object)(-1L));
    java.lang.String var70 = var67.toString();
    java.lang.String var71 = var67.getPassword();
    var66.setUser(var67);
    br.com.addvisor.model.Address var73 = var66.getAddress();
    br.com.addvisor.model.Evaluate var76 = new br.com.addvisor.model.Evaluate(var57, var66, (java.lang.Float)1.0f, "User [id=null, name=null, email=null, password=21c96d96756cfeed7f71110d9cb1788b, phone=Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]], city=null]");
    var66.setDescription("Evaluate [id=0, user=null, service=null, note=null, comment=null]");
    br.com.addvisor.model.enums.ServiceCat var79 = var66.getCategory();
    java.lang.String var80 = var66.getName();
    var66.setId((java.lang.Long)100L);
    br.com.addvisor.model.Address var83 = new br.com.addvisor.model.Address();
    java.lang.Long var84 = var83.getId();
    java.lang.String var85 = var83.getComplement();
    var66.setAddress(var83);
    boolean var87 = var0.equals((java.lang.Object)var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 10L+ "'", var3.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var9.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var26.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "null\nnull\nnull"+ "'", var38.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var64 + "' != '" + "User [id=null, name=null, email=User [id=null, name=null, email=null, password=null, phone=null, city=null], password=null, phone=null, city=null]"+ "'", var64.equals("User [id=null, name=null, email=User [id=null, name=null, email=null, password=null, phone=null, city=null], password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var70 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var70.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == false);

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test116");


    br.com.addvisor.model.User var0 = new br.com.addvisor.model.User();
    boolean var2 = var0.equals((java.lang.Object)(-1L));
    boolean var4 = var0.equals((java.lang.Object)100.0d);
    var0.setId((java.lang.Long)100L);
    br.com.addvisor.model.Evaluate var7 = new br.com.addvisor.model.Evaluate();
    var7.setId((java.lang.Long)10L);
    var7.setId((java.lang.Long)0L);
    java.lang.Float var12 = var7.getNote();
    br.com.addvisor.model.Service var13 = new br.com.addvisor.model.Service();
    java.lang.String var14 = var13.toString();
    var7.setService(var13);
    var7.setId((java.lang.Long)(-1L));
    br.com.addvisor.model.Evaluate var18 = new br.com.addvisor.model.Evaluate();
    br.com.addvisor.model.State var19 = new br.com.addvisor.model.State();
    boolean var21 = var19.equals((java.lang.Object)(byte)100);
    var19.setUf("null\nnull\nnull");
    boolean var24 = var18.equals((java.lang.Object)var19);
    br.com.addvisor.model.Service var25 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var26 = new br.com.addvisor.model.User();
    boolean var28 = var26.equals((java.lang.Object)(-1L));
    java.lang.String var29 = var26.toString();
    java.lang.String var30 = var26.getPassword();
    var25.setUser(var26);
    br.com.addvisor.model.Address var32 = var25.getAddress();
    var18.setService(var25);
    br.com.addvisor.model.enums.ServiceCat var34 = var25.getCategory();
    br.com.addvisor.model.Address var35 = new br.com.addvisor.model.Address();
    var35.setId((java.lang.Long)0L);
    var25.setAddress(var35);
    boolean var39 = var7.equals((java.lang.Object)var25);
    java.lang.String var40 = var25.getName();
    var25.setMedia((java.lang.Float)100.0f);
    br.com.addvisor.model.Evaluate var45 = new br.com.addvisor.model.Evaluate(var0, var25, (java.lang.Float)1.0f, "Country [id=100, name=null, acronym=Evaluate [id=0, user=null, service=null, note=null, comment=Country [id=null, name=null, acronym=null]]]");
    java.lang.String var46 = var45.getComment();
    br.com.addvisor.model.User var47 = var45.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]"+ "'", var14.equals("Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var29.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "Country [id=100, name=null, acronym=Evaluate [id=0, user=null, service=null, note=null, comment=Country [id=null, name=null, acronym=null]]]"+ "'", var46.equals("Country [id=100, name=null, acronym=Evaluate [id=0, user=null, service=null, note=null, comment=Country [id=null, name=null, acronym=null]]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test117");


    br.com.addvisor.model.Evaluate var2 = new br.com.addvisor.model.Evaluate();
    var2.setId((java.lang.Long)10L);
    var2.setId((java.lang.Long)0L);
    br.com.addvisor.model.Service var7 = var2.getService();
    br.com.addvisor.model.User var10 = new br.com.addvisor.model.User("Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]]", "User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.Long var11 = var10.getId();
    var10.setId((java.lang.Long)(-1L));
    var10.setPhone("null\nnull\nnull");
    java.lang.String var16 = var10.getEmail();
    var10.setName("User [id=null, name=null, email=User [id=null, name=null, email=null, password=null, phone=null, city=null], password=null, phone=null, city=null]");
    var2.setUser(var10);
    br.com.addvisor.model.Address var20 = new br.com.addvisor.model.Address();
    java.lang.String var21 = var20.toString();
    br.com.addvisor.model.City var22 = new br.com.addvisor.model.City();
    var22.setName("hi!");
    var22.setName("null\nnull\nnull");
    var20.setCity(var22);
    java.lang.String var28 = var22.getName();
    br.com.addvisor.model.State var29 = var22.getState();
    var10.setCity(var22);
    br.com.addvisor.model.Address var31 = new br.com.addvisor.model.Address("User [id=null, name=null, email=User [id=null, name=null, email=null, password=null, phone=null, city=null], password=null, phone=null, city=null]", "Evaluate [id=0, user=null, service=Service [id=null, name=null, description=null, tags=null, media=null, address=null\nnull\nnull, category=null, phones=null], note=0.0, comment=null]", var22);
    br.com.addvisor.model.Address var32 = new br.com.addvisor.model.Address();
    java.lang.String var33 = var32.toString();
    br.com.addvisor.model.City var34 = new br.com.addvisor.model.City();
    var34.setName("hi!");
    var34.setName("null\nnull\nnull");
    var32.setCity(var34);
    java.lang.String var40 = var34.getName();
    br.com.addvisor.model.State var41 = var34.getState();
    int var42 = var22.compareTo(var34);
    var22.setName("Evaluate [id=null, user=User [id=null, name=null, email=User [id=null, name=null, email=null, password=null, phone=null, city=null], password=null, phone=null, city=null], service=Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null], note=1.0, comment=User [id=null, name=null, email=null, password=21c96d96756cfeed7f71110d9cb1788b, phone=Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]], city=null]]");
    var22.setId((java.lang.Long)(-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "null\nnull\nnull"+ "'", var21.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "null\nnull\nnull"+ "'", var28.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "null\nnull\nnull"+ "'", var33.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "null\nnull\nnull"+ "'", var40.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0);

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test118");


    br.com.addvisor.model.City var2 = new br.com.addvisor.model.City();
    br.com.addvisor.model.State var3 = var2.getState();
    java.lang.Long var4 = var2.getId();
    br.com.addvisor.model.Address var5 = new br.com.addvisor.model.Address("Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]", "null - null", var2);
    br.com.addvisor.model.City var6 = var5.getCity();
    br.com.addvisor.model.City var9 = new br.com.addvisor.model.City();
    var9.setName("hi!");
    var9.setName("null\nnull\nnull");
    br.com.addvisor.model.Address var14 = new br.com.addvisor.model.Address();
    java.lang.String var15 = var14.getComplement();
    java.lang.String var16 = var14.toString();
    boolean var17 = var9.equals((java.lang.Object)var16);
    br.com.addvisor.model.User var18 = new br.com.addvisor.model.User();
    br.com.addvisor.model.State var19 = new br.com.addvisor.model.State();
    var19.setId((java.lang.Long)1L);
    var19.setName("null\nnull\nnull");
    var19.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var26 = var19.getUf();
    boolean var27 = var18.equals((java.lang.Object)var19);
    var9.setState(var19);
    br.com.addvisor.model.Address var29 = new br.com.addvisor.model.Address("Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]]", "", var9);
    java.lang.String var30 = var9.getName();
    int var31 = var6.compareTo(var9);
    java.lang.String var32 = var6.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "null\nnull\nnull"+ "'", var16.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "null\nnull\nnull"+ "'", var30.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test119");


    br.com.addvisor.model.City var4 = new br.com.addvisor.model.City();
    var4.setName("hi!");
    var4.setName("null\nnull\nnull");
    br.com.addvisor.model.Address var9 = new br.com.addvisor.model.Address();
    java.lang.String var10 = var9.getComplement();
    java.lang.String var11 = var9.toString();
    boolean var12 = var4.equals((java.lang.Object)var11);
    br.com.addvisor.model.User var13 = new br.com.addvisor.model.User("hi!", "", "hi!", "User [id=null, name=null, email=null, password=null, phone=null, city=null]", var4);
    br.com.addvisor.model.City var14 = var13.getCity();
    var13.setPhone("Evaluate [id=null, user=null, service=null, note=null, comment=null]\nService [id=1, name=Service [id=10, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null], description=null, tags=null, media=null, address=null\nnull\nnull, category=null, phones=null]\nnull\nnull\nnull\n21c96d96756cfeed7f71110d9cb1788b\nEvaluate [id=0, user=null, service=null, note=null, comment=null]");
    var13.setPhone("User [id=null, name=null, email=null, password=75ede0e9e4c762359b0d3d78967635e0, phone=null - null\nnull\nnull, city=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "null\nnull\nnull"+ "'", var11.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test120");


    br.com.addvisor.model.Service var0 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var1 = new br.com.addvisor.model.User();
    boolean var3 = var1.equals((java.lang.Object)(-1L));
    java.lang.String var4 = var1.toString();
    java.lang.String var5 = var1.getPassword();
    var0.setUser(var1);
    br.com.addvisor.model.Address var7 = var0.getAddress();
    java.lang.String var8 = var0.getName();
    br.com.addvisor.model.Address var9 = var0.getAddress();
    var0.setTags("Evaluate [id=0, user=User [id=-1, name=User [id=null, name=null, email=User [id=null, name=null, email=null, password=null, phone=null, city=null], password=null, phone=null, city=null], email=null, password=21c96d96756cfeed7f71110d9cb1788b, phone=null\nnull\nnull, city=null], service=null, note=null, comment=null]");
    java.lang.String var12 = var0.getTags();
    java.lang.Long var13 = var0.getId();
    br.com.addvisor.model.User var14 = new br.com.addvisor.model.User();
    boolean var16 = var14.equals((java.lang.Object)(-1L));
    java.lang.String var17 = var14.getDDD();
    var14.setPhone("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    var14.setEmail("hi!");
    java.lang.Long var22 = var14.getId();
    var0.setUser(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var4.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Evaluate [id=0, user=User [id=-1, name=User [id=null, name=null, email=User [id=null, name=null, email=null, password=null, phone=null, city=null], password=null, phone=null, city=null], email=null, password=21c96d96756cfeed7f71110d9cb1788b, phone=null\nnull\nnull, city=null], service=null, note=null, comment=null]"+ "'", var12.equals("Evaluate [id=0, user=User [id=-1, name=User [id=null, name=null, email=User [id=null, name=null, email=null, password=null, phone=null, city=null], password=null, phone=null, city=null], email=null, password=21c96d96756cfeed7f71110d9cb1788b, phone=null\nnull\nnull, city=null], service=null, note=null, comment=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test121");


    br.com.addvisor.model.State var0 = new br.com.addvisor.model.State();
    var0.setUf("Service [id=1, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]");
    br.com.addvisor.model.State var3 = new br.com.addvisor.model.State();
    var3.setId((java.lang.Long)1L);
    var3.setName("null\nnull\nnull");
    var3.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var10 = var3.getUf();
    java.lang.String var11 = var3.getName();
    br.com.addvisor.model.Country var12 = new br.com.addvisor.model.Country();
    java.lang.String var13 = var12.getAcronym();
    boolean var14 = var3.equals((java.lang.Object)var12);
    java.lang.String var15 = var12.getAcronym();
    var12.setAcronym("User [id=-1, name=null, email=null, password=21c96d96756cfeed7f71110d9cb1788b, phone=null\nnull\nnull, city=null]");
    var12.setName("Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]");
    java.lang.String var20 = var12.toString();
    var0.setCountry(var12);
    java.lang.Long var22 = var0.getId();
    var0.setId((java.lang.Long)100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var11.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "Country [id=null, name=Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null], acronym=User [id=-1, name=null, email=null, password=21c96d96756cfeed7f71110d9cb1788b, phone=null\nnull\nnull, city=null]]"+ "'", var20.equals("Country [id=null, name=Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null], acronym=User [id=-1, name=null, email=null, password=21c96d96756cfeed7f71110d9cb1788b, phone=null\nnull\nnull, city=null]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test122");


    br.com.addvisor.model.User var0 = new br.com.addvisor.model.User();
    boolean var2 = var0.equals((java.lang.Object)(-1L));
    java.lang.String var3 = var0.toString();
    java.lang.String var4 = var0.getPassword();
    java.lang.String var5 = var0.getPhone();
    br.com.addvisor.model.User var6 = new br.com.addvisor.model.User();
    br.com.addvisor.model.State var7 = new br.com.addvisor.model.State();
    var7.setId((java.lang.Long)1L);
    var7.setName("null\nnull\nnull");
    var7.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var14 = var7.getUf();
    boolean var15 = var6.equals((java.lang.Object)var7);
    br.com.addvisor.model.Service var16 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var17 = new br.com.addvisor.model.User();
    boolean var19 = var17.equals((java.lang.Object)(-1L));
    java.lang.String var20 = var17.toString();
    java.lang.String var21 = var17.getPassword();
    var16.setUser(var17);
    br.com.addvisor.model.Address var23 = var16.getAddress();
    java.lang.String var24 = var16.getName();
    br.com.addvisor.model.City var25 = new br.com.addvisor.model.City();
    var25.setName("hi!");
    var25.setName("null\nnull\nnull");
    br.com.addvisor.model.Address var30 = new br.com.addvisor.model.Address();
    java.lang.String var31 = var30.getComplement();
    java.lang.String var32 = var30.toString();
    boolean var33 = var25.equals((java.lang.Object)var32);
    br.com.addvisor.model.State var34 = new br.com.addvisor.model.State();
    var34.setId((java.lang.Long)1L);
    var34.setName("null\nnull\nnull");
    var34.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var41 = var34.getUf();
    var25.setState(var34);
    boolean var43 = var16.equals((java.lang.Object)var25);
    br.com.addvisor.model.Evaluate var46 = new br.com.addvisor.model.Evaluate(var6, var16, (java.lang.Float)100.0f, "");
    br.com.addvisor.model.Evaluate var49 = new br.com.addvisor.model.Evaluate(var0, var16, (java.lang.Float)0.0f, "User [id=null, name=null, email=User [id=null, name=null, email=null, password=null, phone=null, city=null], password=null, phone=null, city=null]");
    br.com.addvisor.model.City var50 = var0.getCity();
    java.lang.String var51 = var0.getPhone();
    br.com.addvisor.model.Service var52 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var53 = new br.com.addvisor.model.User();
    boolean var55 = var53.equals((java.lang.Object)(-1L));
    java.lang.String var56 = var53.toString();
    java.lang.String var57 = var53.getPassword();
    var52.setUser(var53);
    java.lang.String var59 = var53.getPassword();
    java.lang.String var60 = var53.toString();
    br.com.addvisor.model.City var63 = new br.com.addvisor.model.City();
    var63.setName("hi!");
    var63.setName("null\nnull\nnull");
    br.com.addvisor.model.Address var68 = new br.com.addvisor.model.Address();
    java.lang.String var69 = var68.getComplement();
    java.lang.String var70 = var68.toString();
    boolean var71 = var63.equals((java.lang.Object)var70);
    br.com.addvisor.model.User var72 = new br.com.addvisor.model.User();
    br.com.addvisor.model.State var73 = new br.com.addvisor.model.State();
    var73.setId((java.lang.Long)1L);
    var73.setName("null\nnull\nnull");
    var73.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var80 = var73.getUf();
    boolean var81 = var72.equals((java.lang.Object)var73);
    var63.setState(var73);
    br.com.addvisor.model.Address var83 = new br.com.addvisor.model.Address("Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]]", "", var63);
    var63.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null] - null");
    var53.setCity(var63);
    var0.setCity(var63);
    var63.setName("Evaluate [id=null, user=User [id=null, name=null, email=null, password=null, phone=null, city=null], service=Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null], note=0.0, comment=User [id=null, name=null, email=User [id=null, name=null, email=null, password=null, phone=null, city=null], password=null, phone=null, city=null]]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var3.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var20.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "null\nnull\nnull"+ "'", var32.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var56.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var60.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var70 + "' != '" + "null\nnull\nnull"+ "'", var70.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == false);

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test123");


    br.com.addvisor.model.Service var0 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var1 = new br.com.addvisor.model.User();
    boolean var3 = var1.equals((java.lang.Object)(-1L));
    java.lang.String var4 = var1.toString();
    java.lang.String var5 = var1.getPassword();
    var0.setUser(var1);
    br.com.addvisor.model.Address var7 = var0.getAddress();
    br.com.addvisor.model.Address var8 = new br.com.addvisor.model.Address();
    java.lang.String var9 = var8.getComplement();
    java.lang.String var10 = var8.toString();
    br.com.addvisor.model.City var11 = var8.getCity();
    br.com.addvisor.model.State var12 = new br.com.addvisor.model.State();
    var12.setId((java.lang.Long)1L);
    var12.setName("null\nnull\nnull");
    var12.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var19 = var12.getUf();
    boolean var20 = var8.equals((java.lang.Object)var12);
    var0.setAddress(var8);
    br.com.addvisor.model.User var22 = var0.getUser();
    br.com.addvisor.model.Address var23 = new br.com.addvisor.model.Address();
    java.lang.String var24 = var23.getLocation();
    java.lang.String var25 = var23.toString();
    var0.setAddress(var23);
    var0.setDescription("User [id=null, name=null, email=User [id=null, name=null, email=null, password=null, phone=null, city=null], password=null, phone=null, city=null]");
    br.com.addvisor.model.enums.ServiceCat var29 = var0.getCategory();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var4.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "null\nnull\nnull"+ "'", var10.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "null\nnull\nnull"+ "'", var25.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test124");


    br.com.addvisor.model.Address var0 = new br.com.addvisor.model.Address();
    java.lang.String var1 = var0.getComplement();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.getComplement();
    br.com.addvisor.model.Address var4 = new br.com.addvisor.model.Address();
    java.lang.String var5 = var4.toString();
    br.com.addvisor.model.City var6 = new br.com.addvisor.model.City();
    var6.setName("hi!");
    var4.setCity(var6);
    var6.setId((java.lang.Long)10L);
    java.lang.String var12 = var6.getName();
    java.lang.String var13 = var6.getName();
    var0.setCity(var6);
    br.com.addvisor.model.State var15 = var6.getState();
    br.com.addvisor.model.State var16 = var6.getState();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "null\nnull\nnull"+ "'", var2.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "null\nnull\nnull"+ "'", var5.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test125");


    br.com.addvisor.model.Service var0 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var1 = new br.com.addvisor.model.User();
    boolean var3 = var1.equals((java.lang.Object)(-1L));
    java.lang.String var4 = var1.toString();
    java.lang.String var5 = var1.getPassword();
    var0.setUser(var1);
    br.com.addvisor.model.Address var7 = var0.getAddress();
    br.com.addvisor.model.enums.ServiceCat var8 = var0.getCategory();
    java.lang.String var9 = var0.getTags();
    java.lang.String var10 = var0.toString();
    br.com.addvisor.model.User var11 = var0.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var4.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]"+ "'", var10.equals("Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test126");


    br.com.addvisor.model.State var0 = new br.com.addvisor.model.State();
    boolean var2 = var0.equals((java.lang.Object)(byte)100);
    var0.setUf("null\nnull\nnull");
    br.com.addvisor.model.State var5 = new br.com.addvisor.model.State();
    int var6 = var0.compareTo(var5);
    java.lang.String var7 = var5.getName();
    var5.setId((java.lang.Long)10L);
    br.com.addvisor.model.Country var10 = var5.getCountry();
    var5.setUf("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var13 = var5.getName();
    java.lang.String var14 = var5.toString();
    java.lang.String var15 = var5.getUf();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "null - User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var14.equals("null - User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var15.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test127");


    br.com.addvisor.model.State var0 = new br.com.addvisor.model.State();
    boolean var2 = var0.equals((java.lang.Object)(byte)100);
    var0.setUf("null\nnull\nnull");
    br.com.addvisor.model.State var5 = new br.com.addvisor.model.State();
    int var6 = var0.compareTo(var5);
    var5.setName("");
    br.com.addvisor.model.Country var9 = new br.com.addvisor.model.Country();
    java.lang.Integer var10 = var9.getId();
    var5.setCountry(var9);
    java.lang.String var12 = var9.getAcronym();
    java.lang.String var13 = var9.getAcronym();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test128");


    br.com.addvisor.model.User var2 = new br.com.addvisor.model.User("null - null\nnull\nnull", "Evaluate [id=0, user=null, service=null, note=null, comment=Country [id=null, name=null, acronym=null]]");
    java.lang.String var3 = var2.toString();
    java.lang.String var4 = var2.getPhone();
    java.lang.String var5 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "User [id=null, name=null, email=null, password=75ede0e9e4c762359b0d3d78967635e0, phone=null - null\nnull\nnull, city=null]"+ "'", var3.equals("User [id=null, name=null, email=null, password=75ede0e9e4c762359b0d3d78967635e0, phone=null - null\nnull\nnull, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "null - null\nnull\nnull"+ "'", var4.equals("null - null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "User [id=null, name=null, email=null, password=75ede0e9e4c762359b0d3d78967635e0, phone=null - null\nnull\nnull, city=null]"+ "'", var5.equals("User [id=null, name=null, email=null, password=75ede0e9e4c762359b0d3d78967635e0, phone=null - null\nnull\nnull, city=null]"));

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test129");


    br.com.addvisor.model.Service var0 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var1 = new br.com.addvisor.model.User();
    boolean var3 = var1.equals((java.lang.Object)(-1L));
    java.lang.String var4 = var1.toString();
    java.lang.String var5 = var1.getPassword();
    var0.setUser(var1);
    br.com.addvisor.model.Address var7 = var0.getAddress();
    java.lang.String var8 = var0.getName();
    java.lang.String var9 = var0.getDescription();
    br.com.addvisor.model.Address var10 = new br.com.addvisor.model.Address();
    java.lang.String var11 = var10.toString();
    br.com.addvisor.model.City var12 = new br.com.addvisor.model.City();
    var12.setName("hi!");
    var10.setCity(var12);
    var10.setLocation("");
    java.lang.String var18 = var10.getLocation();
    var0.setAddress(var10);
    java.lang.String var20 = var0.getTags();
    br.com.addvisor.model.enums.ServiceCat var21 = var0.getCategory();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var4.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "null\nnull\nnull"+ "'", var11.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test130");


    br.com.addvisor.model.Address var0 = new br.com.addvisor.model.Address();
    java.lang.String var1 = var0.getComplement();
    java.lang.String var2 = var0.toString();
    br.com.addvisor.model.City var3 = var0.getCity();
    br.com.addvisor.model.State var4 = new br.com.addvisor.model.State();
    var4.setId((java.lang.Long)1L);
    var4.setName("null\nnull\nnull");
    var4.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var11 = var4.getUf();
    boolean var12 = var0.equals((java.lang.Object)var4);
    java.lang.Long var13 = var4.getId();
    boolean var15 = var4.equals((java.lang.Object)"User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    br.com.addvisor.model.Agenda var16 = new br.com.addvisor.model.Agenda();
    java.util.List var17 = var16.getNames();
    java.util.List var18 = var16.getNumbers();
    br.com.addvisor.model.Country var19 = new br.com.addvisor.model.Country();
    java.lang.Integer var20 = var19.getId();
    br.com.addvisor.model.Agenda var21 = new br.com.addvisor.model.Agenda();
    java.util.List var22 = var21.getNames();
    br.com.addvisor.model.Agenda var23 = new br.com.addvisor.model.Agenda();
    java.util.List var24 = var23.getNames();
    var21.setNames(var24);
    java.util.List var26 = var21.getNumbers();
    br.com.addvisor.model.Agenda var27 = new br.com.addvisor.model.Agenda();
    java.util.List var28 = var27.getNames();
    java.util.List var29 = var27.getNumbers();
    br.com.addvisor.model.Agenda var30 = new br.com.addvisor.model.Agenda();
    java.util.List var31 = var30.getNames();
    java.util.List var32 = var30.getNumbers();
    var27.setNames(var32);
    br.com.addvisor.model.Agenda var34 = new br.com.addvisor.model.Agenda();
    java.util.List var35 = var34.getNames();
    java.util.List var36 = var34.getNumbers();
    br.com.addvisor.model.Agenda var37 = new br.com.addvisor.model.Agenda();
    java.util.List var38 = var37.getNames();
    java.util.List var39 = var37.getNumbers();
    var34.setNames(var39);
    var27.setNames(var39);
    var21.setNumbers(var39);
    var21.addContact("", "");
    br.com.addvisor.model.Agenda var46 = new br.com.addvisor.model.Agenda();
    java.util.List var47 = var46.getNames();
    br.com.addvisor.model.Agenda var48 = new br.com.addvisor.model.Agenda();
    java.util.List var49 = var48.getNames();
    var46.setNames(var49);
    java.util.List var51 = var46.getNumbers();
    var21.setNames(var51);
    boolean var53 = var19.equals((java.lang.Object)var21);
    br.com.addvisor.model.Agenda var54 = new br.com.addvisor.model.Agenda();
    java.util.List var55 = var54.getNames();
    br.com.addvisor.model.Agenda var56 = new br.com.addvisor.model.Agenda();
    java.util.List var57 = var56.getNames();
    var54.setNames(var57);
    java.util.List var59 = var54.getNumbers();
    br.com.addvisor.model.Agenda var60 = new br.com.addvisor.model.Agenda();
    java.util.List var61 = var60.getNames();
    java.util.List var62 = var60.getNumbers();
    br.com.addvisor.model.Agenda var63 = new br.com.addvisor.model.Agenda();
    java.util.List var64 = var63.getNames();
    java.util.List var65 = var63.getNumbers();
    var60.setNames(var65);
    br.com.addvisor.model.Agenda var67 = new br.com.addvisor.model.Agenda();
    java.util.List var68 = var67.getNames();
    java.util.List var69 = var67.getNumbers();
    br.com.addvisor.model.Agenda var70 = new br.com.addvisor.model.Agenda();
    java.util.List var71 = var70.getNames();
    java.util.List var72 = var70.getNumbers();
    var67.setNames(var72);
    var60.setNames(var72);
    var54.setNumbers(var72);
    var21.setNumbers(var72);
    var16.setNumbers(var72);
    boolean var78 = var4.equals((java.lang.Object)var16);
    var4.setName("");
    var4.setUf("User [id=null, name=null, email=null, password=300fac9da4ec249ae6eb64ef8825ae47, phone=null - null - null, city=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "null\nnull\nnull"+ "'", var2.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + 1L+ "'", var13.equals(1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == false);

  }

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test131");


    br.com.addvisor.model.Address var0 = new br.com.addvisor.model.Address();
    java.lang.String var1 = var0.getComplement();
    java.lang.String var2 = var0.toString();
    br.com.addvisor.model.City var3 = var0.getCity();
    br.com.addvisor.model.State var4 = new br.com.addvisor.model.State();
    var4.setId((java.lang.Long)1L);
    var4.setName("null\nnull\nnull");
    var4.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var11 = var4.getUf();
    boolean var12 = var0.equals((java.lang.Object)var4);
    java.lang.Long var13 = var4.getId();
    boolean var15 = var4.equals((java.lang.Object)"User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    br.com.addvisor.model.Agenda var16 = new br.com.addvisor.model.Agenda();
    java.util.List var17 = var16.getNames();
    java.util.List var18 = var16.getNumbers();
    br.com.addvisor.model.Country var19 = new br.com.addvisor.model.Country();
    java.lang.Integer var20 = var19.getId();
    br.com.addvisor.model.Agenda var21 = new br.com.addvisor.model.Agenda();
    java.util.List var22 = var21.getNames();
    br.com.addvisor.model.Agenda var23 = new br.com.addvisor.model.Agenda();
    java.util.List var24 = var23.getNames();
    var21.setNames(var24);
    java.util.List var26 = var21.getNumbers();
    br.com.addvisor.model.Agenda var27 = new br.com.addvisor.model.Agenda();
    java.util.List var28 = var27.getNames();
    java.util.List var29 = var27.getNumbers();
    br.com.addvisor.model.Agenda var30 = new br.com.addvisor.model.Agenda();
    java.util.List var31 = var30.getNames();
    java.util.List var32 = var30.getNumbers();
    var27.setNames(var32);
    br.com.addvisor.model.Agenda var34 = new br.com.addvisor.model.Agenda();
    java.util.List var35 = var34.getNames();
    java.util.List var36 = var34.getNumbers();
    br.com.addvisor.model.Agenda var37 = new br.com.addvisor.model.Agenda();
    java.util.List var38 = var37.getNames();
    java.util.List var39 = var37.getNumbers();
    var34.setNames(var39);
    var27.setNames(var39);
    var21.setNumbers(var39);
    var21.addContact("", "");
    br.com.addvisor.model.Agenda var46 = new br.com.addvisor.model.Agenda();
    java.util.List var47 = var46.getNames();
    br.com.addvisor.model.Agenda var48 = new br.com.addvisor.model.Agenda();
    java.util.List var49 = var48.getNames();
    var46.setNames(var49);
    java.util.List var51 = var46.getNumbers();
    var21.setNames(var51);
    boolean var53 = var19.equals((java.lang.Object)var21);
    br.com.addvisor.model.Agenda var54 = new br.com.addvisor.model.Agenda();
    java.util.List var55 = var54.getNames();
    br.com.addvisor.model.Agenda var56 = new br.com.addvisor.model.Agenda();
    java.util.List var57 = var56.getNames();
    var54.setNames(var57);
    java.util.List var59 = var54.getNumbers();
    br.com.addvisor.model.Agenda var60 = new br.com.addvisor.model.Agenda();
    java.util.List var61 = var60.getNames();
    java.util.List var62 = var60.getNumbers();
    br.com.addvisor.model.Agenda var63 = new br.com.addvisor.model.Agenda();
    java.util.List var64 = var63.getNames();
    java.util.List var65 = var63.getNumbers();
    var60.setNames(var65);
    br.com.addvisor.model.Agenda var67 = new br.com.addvisor.model.Agenda();
    java.util.List var68 = var67.getNames();
    java.util.List var69 = var67.getNumbers();
    br.com.addvisor.model.Agenda var70 = new br.com.addvisor.model.Agenda();
    java.util.List var71 = var70.getNames();
    java.util.List var72 = var70.getNumbers();
    var67.setNames(var72);
    var60.setNames(var72);
    var54.setNumbers(var72);
    var21.setNumbers(var72);
    var16.setNumbers(var72);
    boolean var78 = var4.equals((java.lang.Object)var16);
    java.lang.Long var79 = var4.getId();
    java.lang.String var80 = var4.getUf();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "null\nnull\nnull"+ "'", var2.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + 1L+ "'", var13.equals(1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var79 + "' != '" + 1L+ "'", var79.equals(1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var80);

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test132");


    br.com.addvisor.model.City var0 = new br.com.addvisor.model.City();
    var0.setName("hi!");
    var0.setName("null\nnull\nnull");
    br.com.addvisor.model.Address var5 = new br.com.addvisor.model.Address();
    java.lang.String var6 = var5.getComplement();
    java.lang.String var7 = var5.toString();
    boolean var8 = var0.equals((java.lang.Object)var7);
    br.com.addvisor.model.User var9 = new br.com.addvisor.model.User();
    br.com.addvisor.model.State var10 = new br.com.addvisor.model.State();
    var10.setId((java.lang.Long)1L);
    var10.setName("null\nnull\nnull");
    var10.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var17 = var10.getUf();
    boolean var18 = var9.equals((java.lang.Object)var10);
    var0.setState(var10);
    br.com.addvisor.model.Evaluate var20 = new br.com.addvisor.model.Evaluate();
    var20.setId((java.lang.Long)10L);
    var20.setId((java.lang.Long)0L);
    br.com.addvisor.model.User var25 = var20.getUser();
    boolean var26 = var0.equals((java.lang.Object)var20);
    br.com.addvisor.model.State var27 = new br.com.addvisor.model.State();
    boolean var29 = var27.equals((java.lang.Object)(byte)100);
    var27.setUf("null\nnull\nnull");
    br.com.addvisor.model.State var32 = new br.com.addvisor.model.State();
    int var33 = var27.compareTo(var32);
    java.lang.String var34 = var32.getName();
    var0.setState(var32);
    br.com.addvisor.model.Country var36 = var32.getCountry();
    var32.setName("null\nhi!\nnull\nnull\nnull");
    br.com.addvisor.model.City var41 = new br.com.addvisor.model.City();
    var41.setName("hi!");
    java.lang.String var44 = var41.getName();
    br.com.addvisor.model.Address var45 = new br.com.addvisor.model.Address("Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]", "", var41);
    var45.setLocation("Country [id=null, name=null, acronym=null]");
    br.com.addvisor.model.City var60 = new br.com.addvisor.model.City();
    var60.setName("hi!");
    var60.setName("null\nnull\nnull");
    br.com.addvisor.model.Address var65 = new br.com.addvisor.model.Address();
    java.lang.String var66 = var65.getComplement();
    java.lang.String var67 = var65.toString();
    boolean var68 = var60.equals((java.lang.Object)var67);
    br.com.addvisor.model.User var69 = new br.com.addvisor.model.User("hi!", "", "hi!", "User [id=null, name=null, email=null, password=null, phone=null, city=null]", var60);
    br.com.addvisor.model.Address var70 = new br.com.addvisor.model.Address("null\nnull\nnull", "User [id=null, name=null, email=null, password=null, phone=null, city=null]", var60);
    var60.setId((java.lang.Long)100L);
    br.com.addvisor.model.User var73 = new br.com.addvisor.model.User("Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]]", "Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]]", "User [id=null, name=null, email=null, password=21c96d96756cfeed7f71110d9cb1788b, phone=Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]], city=null]", "hi!", var60);
    br.com.addvisor.model.Address var74 = new br.com.addvisor.model.Address("Service [id=1, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]", "null - User [id=-1, name=null, email=null, password=21c96d96756cfeed7f71110d9cb1788b, phone=null\nnull\nnull, city=null]", var60);
    var45.setCity(var60);
    br.com.addvisor.model.City var78 = new br.com.addvisor.model.City();
    br.com.addvisor.model.Address var79 = new br.com.addvisor.model.Address("null\nnull\nnull", "Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]]", var78);
    br.com.addvisor.model.State var80 = new br.com.addvisor.model.State();
    boolean var82 = var80.equals((java.lang.Object)(byte)100);
    var80.setUf("null\nnull\nnull");
    br.com.addvisor.model.State var85 = new br.com.addvisor.model.State();
    int var86 = var80.compareTo(var85);
    var85.setName("");
    var78.setState(var85);
    var85.setId((java.lang.Long)100L);
    var60.setState(var85);
    br.com.addvisor.model.State var93 = var60.getState();
    int var94 = var32.compareTo(var93);
    var32.setId((java.lang.Long)10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "null\nnull\nnull"+ "'", var7.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "hi!"+ "'", var44.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var67 + "' != '" + "null\nnull\nnull"+ "'", var67.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var94 == 0);

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test133");


    br.com.addvisor.model.City var2 = new br.com.addvisor.model.City();
    br.com.addvisor.model.State var3 = var2.getState();
    java.lang.Long var4 = var2.getId();
    br.com.addvisor.model.Address var5 = new br.com.addvisor.model.Address("Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]", "null - null", var2);
    var5.setComplement("");
    var5.setId((java.lang.Long)1L);
    java.lang.String var10 = var5.toString();
    java.lang.String var11 = var5.toString();
    java.lang.Long var12 = var5.getId();
    br.com.addvisor.model.User var13 = new br.com.addvisor.model.User();
    boolean var15 = var13.equals((java.lang.Object)(-1L));
    java.lang.String var16 = var13.toString();
    java.lang.String var17 = var13.getPassword();
    java.lang.String var18 = var13.getName();
    java.lang.String var19 = var13.getPassword();
    java.lang.String var20 = var13.getName();
    br.com.addvisor.model.Service var21 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var22 = new br.com.addvisor.model.User();
    boolean var24 = var22.equals((java.lang.Object)(-1L));
    java.lang.String var25 = var22.toString();
    java.lang.String var26 = var22.getPassword();
    var21.setUser(var22);
    br.com.addvisor.model.Address var28 = var21.getAddress();
    java.lang.String var29 = var21.getName();
    br.com.addvisor.model.Address var30 = var21.getAddress();
    br.com.addvisor.model.User var31 = new br.com.addvisor.model.User();
    boolean var33 = var31.equals((java.lang.Object)(-1L));
    java.lang.String var34 = var31.toString();
    br.com.addvisor.model.Evaluate var35 = new br.com.addvisor.model.Evaluate();
    var35.setId((java.lang.Long)10L);
    var35.setId((java.lang.Long)0L);
    br.com.addvisor.model.User var40 = var35.getUser();
    boolean var41 = var31.equals((java.lang.Object)var35);
    java.lang.String var42 = var31.getPassword();
    var31.setId((java.lang.Long)(-1L));
    java.lang.String var45 = var31.getPhone();
    var21.setUser(var31);
    br.com.addvisor.model.Evaluate var49 = new br.com.addvisor.model.Evaluate(var13, var21, (java.lang.Float)10.0f, "User [id=null, name=null, email=null, password=null, phone=null, city=null] - null");
    br.com.addvisor.model.Address var50 = new br.com.addvisor.model.Address();
    java.lang.String var51 = var50.getComplement();
    java.lang.String var52 = var50.toString();
    var50.setComplement("Service [id=null, name=null, description=null, tags=null, media=null, address=null\nnull\nnull, category=null, phones=null]");
    var21.setAddress(var50);
    java.lang.String var56 = var50.getLocation();
    br.com.addvisor.model.City var63 = new br.com.addvisor.model.City();
    var63.setName("hi!");
    var63.setName("null\nnull\nnull");
    br.com.addvisor.model.Address var68 = new br.com.addvisor.model.Address();
    java.lang.String var69 = var68.getComplement();
    java.lang.String var70 = var68.toString();
    boolean var71 = var63.equals((java.lang.Object)var70);
    br.com.addvisor.model.User var72 = new br.com.addvisor.model.User("hi!", "", "hi!", "User [id=null, name=null, email=null, password=null, phone=null, city=null]", var63);
    br.com.addvisor.model.Address var73 = new br.com.addvisor.model.Address("null\nnull\nnull", "User [id=null, name=null, email=null, password=null, phone=null, city=null]", var63);
    java.lang.Long var74 = var63.getId();
    java.lang.Long var75 = var63.getId();
    var50.setCity(var63);
    var5.setCity(var63);
    var5.setLocation("User [id=null, name=User [id=null, name=null, email=null, password=21c96d96756cfeed7f71110d9cb1788b, phone=Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]], city=null]\nnull\nnull, email=Service [id=10, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null], password=767ca4906ff527b215592f830290ac13, phone=User [id=-1, name=null, email=null, password=21c96d96756cfeed7f71110d9cb1788b, phone=null\nnull\nnull, city=null], city=null\nnull\nnull]");
    java.lang.Long var80 = var5.getId();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]\n\nnull"+ "'", var10.equals("Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]\n\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]\n\nnull"+ "'", var11.equals("Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]\n\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + 1L+ "'", var12.equals(1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var16.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var25.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var34.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "null\nnull\nnull"+ "'", var52.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var70 + "' != '" + "null\nnull\nnull"+ "'", var70.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var80 + "' != '" + 1L+ "'", var80.equals(1L));

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test134");


    br.com.addvisor.model.User var0 = new br.com.addvisor.model.User();
    boolean var2 = var0.equals((java.lang.Object)(-1L));
    java.lang.String var3 = var0.toString();
    java.lang.String var4 = var0.getPassword();
    java.lang.String var5 = var0.getPhone();
    br.com.addvisor.model.User var6 = new br.com.addvisor.model.User();
    br.com.addvisor.model.State var7 = new br.com.addvisor.model.State();
    var7.setId((java.lang.Long)1L);
    var7.setName("null\nnull\nnull");
    var7.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var14 = var7.getUf();
    boolean var15 = var6.equals((java.lang.Object)var7);
    br.com.addvisor.model.Service var16 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var17 = new br.com.addvisor.model.User();
    boolean var19 = var17.equals((java.lang.Object)(-1L));
    java.lang.String var20 = var17.toString();
    java.lang.String var21 = var17.getPassword();
    var16.setUser(var17);
    br.com.addvisor.model.Address var23 = var16.getAddress();
    java.lang.String var24 = var16.getName();
    br.com.addvisor.model.City var25 = new br.com.addvisor.model.City();
    var25.setName("hi!");
    var25.setName("null\nnull\nnull");
    br.com.addvisor.model.Address var30 = new br.com.addvisor.model.Address();
    java.lang.String var31 = var30.getComplement();
    java.lang.String var32 = var30.toString();
    boolean var33 = var25.equals((java.lang.Object)var32);
    br.com.addvisor.model.State var34 = new br.com.addvisor.model.State();
    var34.setId((java.lang.Long)1L);
    var34.setName("null\nnull\nnull");
    var34.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var41 = var34.getUf();
    var25.setState(var34);
    boolean var43 = var16.equals((java.lang.Object)var25);
    br.com.addvisor.model.Evaluate var46 = new br.com.addvisor.model.Evaluate(var6, var16, (java.lang.Float)100.0f, "");
    br.com.addvisor.model.Evaluate var49 = new br.com.addvisor.model.Evaluate(var0, var16, (java.lang.Float)0.0f, "User [id=null, name=null, email=User [id=null, name=null, email=null, password=null, phone=null, city=null], password=null, phone=null, city=null]");
    br.com.addvisor.model.City var50 = var0.getCity();
    var0.setName("Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]]");
    var0.setPhone("Service [id=null, name=Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]], description=null, tags=null, media=null, address=null, category=null, phones=null]");
    java.lang.Long var55 = var0.getId();
    br.com.addvisor.model.City var56 = var0.getCity();
    br.com.addvisor.model.City var57 = new br.com.addvisor.model.City();
    var57.setName("null\nnull\nnull");
    var57.setId((java.lang.Long)10L);
    var0.setCity(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var3.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var20.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "null\nnull\nnull"+ "'", var32.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test135");


    br.com.addvisor.model.Evaluate var0 = new br.com.addvisor.model.Evaluate();
    var0.setId((java.lang.Long)10L);
    var0.setId((java.lang.Long)0L);
    java.lang.Float var5 = var0.getNote();
    br.com.addvisor.model.Service var6 = var0.getService();
    var0.setComment("User [id=-1, name=null, email=null, password=21c96d96756cfeed7f71110d9cb1788b, phone=null\nnull\nnull, city=null]");
    java.lang.String var9 = var0.getComment();
    br.com.addvisor.model.Evaluate var10 = new br.com.addvisor.model.Evaluate();
    br.com.addvisor.model.State var11 = new br.com.addvisor.model.State();
    boolean var13 = var11.equals((java.lang.Object)(byte)100);
    var11.setUf("null\nnull\nnull");
    boolean var16 = var10.equals((java.lang.Object)var11);
    br.com.addvisor.model.Service var17 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var18 = new br.com.addvisor.model.User();
    boolean var20 = var18.equals((java.lang.Object)(-1L));
    java.lang.String var21 = var18.toString();
    java.lang.String var22 = var18.getPassword();
    var17.setUser(var18);
    br.com.addvisor.model.Address var24 = var17.getAddress();
    var10.setService(var17);
    br.com.addvisor.model.enums.ServiceCat var26 = var17.getCategory();
    br.com.addvisor.model.Address var27 = new br.com.addvisor.model.Address();
    var27.setId((java.lang.Long)0L);
    var17.setAddress(var27);
    br.com.addvisor.model.User var31 = new br.com.addvisor.model.User();
    boolean var33 = var31.equals((java.lang.Object)(-1L));
    java.lang.String var34 = var31.toString();
    java.lang.String var35 = var31.getName();
    java.lang.String var36 = var31.getName();
    java.lang.String var37 = var31.getName();
    boolean var38 = var27.equals((java.lang.Object)var31);
    br.com.addvisor.model.User var39 = new br.com.addvisor.model.User();
    boolean var41 = var39.equals((java.lang.Object)(-1L));
    java.lang.String var42 = var39.getDDD();
    var39.setPhone("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    var39.setEmail("hi!");
    var39.setEmail("null\nnull\nnull");
    br.com.addvisor.model.City var49 = var39.getCity();
    java.lang.String var50 = var39.getName();
    br.com.addvisor.model.Address var51 = new br.com.addvisor.model.Address();
    java.lang.String var52 = var51.getLocation();
    java.lang.String var53 = var51.getComplement();
    br.com.addvisor.model.Address var54 = new br.com.addvisor.model.Address();
    java.lang.String var55 = var54.toString();
    br.com.addvisor.model.City var56 = new br.com.addvisor.model.City();
    var56.setName("hi!");
    var56.setName("null\nnull\nnull");
    var54.setCity(var56);
    java.lang.Long var62 = var56.getId();
    var51.setCity(var56);
    var39.setCity(var56);
    boolean var65 = var31.equals((java.lang.Object)var39);
    boolean var66 = var0.equals((java.lang.Object)var39);
    br.com.addvisor.model.Service var67 = new br.com.addvisor.model.Service();
    java.lang.Float var68 = var67.getMedia();
    java.lang.String var69 = var67.getTags();
    var0.setService(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "User [id=-1, name=null, email=null, password=21c96d96756cfeed7f71110d9cb1788b, phone=null\nnull\nnull, city=null]"+ "'", var9.equals("User [id=-1, name=null, email=null, password=21c96d96756cfeed7f71110d9cb1788b, phone=null\nnull\nnull, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var21.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var34.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "null\nnull\nnull"+ "'", var55.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var69);

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test136");


    br.com.addvisor.model.User var0 = new br.com.addvisor.model.User();
    boolean var2 = var0.equals((java.lang.Object)(-1L));
    java.lang.String var3 = var0.getEmail();
    java.lang.String var4 = var0.getName();
    java.lang.String var5 = var0.toString();
    java.lang.Long var6 = var0.getId();
    var0.setName("User [id=null, name=null, email=null, password=21c96d96756cfeed7f71110d9cb1788b, phone=Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]], city=null]\nnull\nnull");
    java.lang.String var9 = var0.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var5.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test137");


    br.com.addvisor.model.Country var0 = new br.com.addvisor.model.Country();
    java.lang.Integer var1 = var0.getId();
    br.com.addvisor.model.Agenda var2 = new br.com.addvisor.model.Agenda();
    java.util.List var3 = var2.getNames();
    br.com.addvisor.model.Agenda var4 = new br.com.addvisor.model.Agenda();
    java.util.List var5 = var4.getNames();
    var2.setNames(var5);
    java.util.List var7 = var2.getNumbers();
    br.com.addvisor.model.Agenda var8 = new br.com.addvisor.model.Agenda();
    java.util.List var9 = var8.getNames();
    java.util.List var10 = var8.getNumbers();
    br.com.addvisor.model.Agenda var11 = new br.com.addvisor.model.Agenda();
    java.util.List var12 = var11.getNames();
    java.util.List var13 = var11.getNumbers();
    var8.setNames(var13);
    br.com.addvisor.model.Agenda var15 = new br.com.addvisor.model.Agenda();
    java.util.List var16 = var15.getNames();
    java.util.List var17 = var15.getNumbers();
    br.com.addvisor.model.Agenda var18 = new br.com.addvisor.model.Agenda();
    java.util.List var19 = var18.getNames();
    java.util.List var20 = var18.getNumbers();
    var15.setNames(var20);
    var8.setNames(var20);
    var2.setNumbers(var20);
    var2.addContact("", "");
    br.com.addvisor.model.Agenda var27 = new br.com.addvisor.model.Agenda();
    java.util.List var28 = var27.getNames();
    br.com.addvisor.model.Agenda var29 = new br.com.addvisor.model.Agenda();
    java.util.List var30 = var29.getNames();
    var27.setNames(var30);
    java.util.List var32 = var27.getNumbers();
    var2.setNames(var32);
    boolean var34 = var0.equals((java.lang.Object)var2);
    br.com.addvisor.model.Agenda var35 = new br.com.addvisor.model.Agenda();
    java.util.List var36 = var35.getNames();
    br.com.addvisor.model.Agenda var37 = new br.com.addvisor.model.Agenda();
    java.util.List var38 = var37.getNames();
    var35.setNames(var38);
    java.util.List var40 = var35.getNumbers();
    br.com.addvisor.model.Agenda var41 = new br.com.addvisor.model.Agenda();
    java.util.List var42 = var41.getNames();
    java.util.List var43 = var41.getNumbers();
    br.com.addvisor.model.Agenda var44 = new br.com.addvisor.model.Agenda();
    java.util.List var45 = var44.getNames();
    java.util.List var46 = var44.getNumbers();
    var41.setNames(var46);
    br.com.addvisor.model.Agenda var48 = new br.com.addvisor.model.Agenda();
    java.util.List var49 = var48.getNames();
    java.util.List var50 = var48.getNumbers();
    br.com.addvisor.model.Agenda var51 = new br.com.addvisor.model.Agenda();
    java.util.List var52 = var51.getNames();
    java.util.List var53 = var51.getNumbers();
    var48.setNames(var53);
    var41.setNames(var53);
    var35.setNumbers(var53);
    var2.setNumbers(var53);
    var2.addContact("Country [id=null, name=null, acronym=null]", "null - null");
    java.util.Map var61 = var2.getContacts();
    var2.addContact("Evaluate [id=100, user=null, service=null, note=null, comment=Country [id=null, name=null, acronym=User [id=null, name=null, email=User [id=null, name=null, email=null, password=null, phone=null, city=null], password=null, phone=null, city=null]]]", "User [id=null, name=null, email=null, password=21c96d96756cfeed7f71110d9cb1788b, phone=Service [id=10, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null], city=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test138");


    br.com.addvisor.model.Service var4 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var5 = new br.com.addvisor.model.User();
    boolean var7 = var5.equals((java.lang.Object)(-1L));
    java.lang.String var8 = var5.toString();
    java.lang.String var9 = var5.getPassword();
    var4.setUser(var5);
    br.com.addvisor.model.Address var11 = var4.getAddress();
    java.lang.String var12 = var4.getName();
    br.com.addvisor.model.City var13 = new br.com.addvisor.model.City();
    var13.setName("hi!");
    var13.setName("null\nnull\nnull");
    br.com.addvisor.model.Address var18 = new br.com.addvisor.model.Address();
    java.lang.String var19 = var18.getComplement();
    java.lang.String var20 = var18.toString();
    boolean var21 = var13.equals((java.lang.Object)var20);
    br.com.addvisor.model.State var22 = new br.com.addvisor.model.State();
    var22.setId((java.lang.Long)1L);
    var22.setName("null\nnull\nnull");
    var22.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var29 = var22.getUf();
    var13.setState(var22);
    boolean var31 = var4.equals((java.lang.Object)var13);
    br.com.addvisor.model.Service var32 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var33 = new br.com.addvisor.model.User();
    boolean var35 = var33.equals((java.lang.Object)(-1L));
    java.lang.String var36 = var33.toString();
    java.lang.String var37 = var33.getPassword();
    var32.setUser(var33);
    br.com.addvisor.model.Address var39 = var32.getAddress();
    java.lang.String var40 = var32.getName();
    java.lang.String var41 = var32.getDescription();
    br.com.addvisor.model.Address var42 = new br.com.addvisor.model.Address();
    java.lang.String var43 = var42.toString();
    br.com.addvisor.model.City var44 = new br.com.addvisor.model.City();
    var44.setName("hi!");
    var42.setCity(var44);
    var42.setLocation("");
    java.lang.String var50 = var42.getLocation();
    var32.setAddress(var42);
    boolean var52 = var13.equals((java.lang.Object)var42);
    br.com.addvisor.model.User var53 = new br.com.addvisor.model.User("User [id=null, name=null, email=User [id=null, name=null, email=null, password=null, phone=null, city=null], password=null, phone=null, city=null]", "User [id=-1, name=null, email=null, password=21c96d96756cfeed7f71110d9cb1788b, phone=null\nnull\nnull, city=null]", "User [id=-1, name=null, email=null, password=21c96d96756cfeed7f71110d9cb1788b, phone=null\nnull\nnull, city=null]", "User [id=null, name=null, email=null, password=null, phone=null, city=null]", var13);
    br.com.addvisor.model.State var54 = var13.getState();
    br.com.addvisor.model.State var55 = var13.getState();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var8.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "null\nnull\nnull"+ "'", var20.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var36.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "null\nnull\nnull"+ "'", var43.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + ""+ "'", var50.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test139");


    br.com.addvisor.model.State var0 = new br.com.addvisor.model.State();
    boolean var2 = var0.equals((java.lang.Object)(byte)100);
    var0.setUf("null\nnull\nnull");
    br.com.addvisor.model.State var5 = new br.com.addvisor.model.State();
    int var6 = var0.compareTo(var5);
    java.lang.String var7 = var5.getName();
    java.lang.String var8 = var5.toString();
    br.com.addvisor.model.State var9 = new br.com.addvisor.model.State();
    boolean var11 = var9.equals((java.lang.Object)(byte)100);
    br.com.addvisor.model.State var12 = new br.com.addvisor.model.State();
    boolean var14 = var12.equals((java.lang.Object)(byte)100);
    var12.setUf("null\nnull\nnull");
    br.com.addvisor.model.State var17 = new br.com.addvisor.model.State();
    int var18 = var12.compareTo(var17);
    java.lang.String var19 = var17.getName();
    var17.setId((java.lang.Long)10L);
    java.lang.Long var22 = var17.getId();
    int var23 = var9.compareTo(var17);
    br.com.addvisor.model.Evaluate var24 = new br.com.addvisor.model.Evaluate();
    var24.setId((java.lang.Long)10L);
    var24.setId((java.lang.Long)0L);
    br.com.addvisor.model.Service var29 = var24.getService();
    br.com.addvisor.model.User var30 = new br.com.addvisor.model.User();
    boolean var32 = var30.equals((java.lang.Object)(-1L));
    java.lang.String var33 = var30.toString();
    java.lang.String var34 = var30.getPassword();
    java.lang.String var35 = var30.getPhone();
    var24.setUser(var30);
    br.com.addvisor.model.Service var37 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var38 = new br.com.addvisor.model.User();
    boolean var40 = var38.equals((java.lang.Object)(-1L));
    java.lang.String var41 = var38.toString();
    java.lang.String var42 = var38.getPassword();
    var37.setUser(var38);
    br.com.addvisor.model.Address var44 = var37.getAddress();
    br.com.addvisor.model.Address var45 = new br.com.addvisor.model.Address();
    java.lang.String var46 = var45.getComplement();
    java.lang.String var47 = var45.toString();
    br.com.addvisor.model.City var48 = var45.getCity();
    br.com.addvisor.model.State var49 = new br.com.addvisor.model.State();
    var49.setId((java.lang.Long)1L);
    var49.setName("null\nnull\nnull");
    var49.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var56 = var49.getUf();
    boolean var57 = var45.equals((java.lang.Object)var49);
    var37.setAddress(var45);
    var37.setTags("Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]]");
    java.lang.String var61 = var37.getDescription();
    var24.setService(var37);
    java.lang.Long var63 = var24.getId();
    br.com.addvisor.model.User var64 = new br.com.addvisor.model.User();
    br.com.addvisor.model.State var65 = new br.com.addvisor.model.State();
    var65.setId((java.lang.Long)1L);
    var65.setName("null\nnull\nnull");
    var65.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var72 = var65.getUf();
    boolean var73 = var64.equals((java.lang.Object)var65);
    var64.setId((java.lang.Long)0L);
    br.com.addvisor.model.Service var76 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var77 = new br.com.addvisor.model.User();
    boolean var79 = var77.equals((java.lang.Object)(-1L));
    java.lang.String var80 = var77.toString();
    java.lang.String var81 = var77.getPassword();
    var76.setUser(var77);
    br.com.addvisor.model.Address var83 = var76.getAddress();
    java.lang.String var84 = var76.getName();
    var76.setName("Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]]");
    java.lang.String var87 = var76.getName();
    br.com.addvisor.model.Evaluate var90 = new br.com.addvisor.model.Evaluate(var64, var76, (java.lang.Float)(-1.0f), "Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]]");
    br.com.addvisor.model.enums.ServiceCat var91 = var76.getCategory();
    var24.setService(var76);
    java.lang.String var93 = var76.toString();
    boolean var94 = var9.equals((java.lang.Object)var76);
    int var95 = var5.compareTo(var9);
    java.lang.String var96 = var5.getUf();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "null - null"+ "'", var8.equals("null - null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + 10L+ "'", var22.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var33.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var41.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "null\nnull\nnull"+ "'", var47.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var63 + "' != '" + 0L+ "'", var63.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var80 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var80.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var87 + "' != '" + "Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]]"+ "'", var87.equals("Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var93 + "' != '" + "Service [id=null, name=Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]], description=null, tags=null, media=null, address=null, category=null, phones=null]"+ "'", var93.equals("Service [id=null, name=Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]], description=null, tags=null, media=null, address=null, category=null, phones=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var94 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var95 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var96);

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test140");


    br.com.addvisor.model.State var0 = new br.com.addvisor.model.State();
    boolean var2 = var0.equals((java.lang.Object)(byte)100);
    var0.setUf("null\nnull\nnull");
    br.com.addvisor.model.State var5 = new br.com.addvisor.model.State();
    int var6 = var0.compareTo(var5);
    java.lang.String var7 = var5.getName();
    var5.setId((java.lang.Long)10L);
    br.com.addvisor.model.Country var10 = var5.getCountry();
    br.com.addvisor.model.Country var11 = var5.getCountry();
    java.lang.String var12 = var5.getName();
    java.lang.String var13 = var5.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test141");


    br.com.addvisor.model.Country var0 = new br.com.addvisor.model.Country();
    java.lang.String var1 = var0.getAcronym();
    java.lang.String var2 = var0.getName();
    java.lang.Integer var3 = var0.getId();
    var0.setName("Evaluate [id=0, user=User [id=null, name=null, email=null, password=null, phone=null, city=null], service=Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null], note=null, comment=null]");
    var0.setName("Evaluate [id=0, user=null, service=null, note=null, comment=Country [id=null, name=null, acronym=null]]");
    java.lang.String var8 = var0.getAcronym();
    java.lang.String var9 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Country [id=null, name=Evaluate [id=0, user=null, service=null, note=null, comment=Country [id=null, name=null, acronym=null]], acronym=null]"+ "'", var9.equals("Country [id=null, name=Evaluate [id=0, user=null, service=null, note=null, comment=Country [id=null, name=null, acronym=null]], acronym=null]"));

  }

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test142");


    br.com.addvisor.model.City var2 = new br.com.addvisor.model.City();
    br.com.addvisor.model.Address var3 = new br.com.addvisor.model.Address("null\nnull\nnull", "Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]]", var2);
    br.com.addvisor.model.State var4 = new br.com.addvisor.model.State();
    boolean var6 = var4.equals((java.lang.Object)(byte)100);
    var4.setUf("null\nnull\nnull");
    br.com.addvisor.model.State var9 = new br.com.addvisor.model.State();
    int var10 = var4.compareTo(var9);
    var9.setName("");
    var2.setState(var9);
    var9.setId((java.lang.Long)100L);
    br.com.addvisor.model.State var16 = new br.com.addvisor.model.State();
    boolean var18 = var16.equals((java.lang.Object)(byte)100);
    var16.setUf("null\nnull\nnull");
    br.com.addvisor.model.State var21 = new br.com.addvisor.model.State();
    int var22 = var16.compareTo(var21);
    var21.setName("");
    int var25 = var9.compareTo(var21);
    br.com.addvisor.model.City var26 = new br.com.addvisor.model.City();
    var26.setName("hi!");
    var26.setName("null\nnull\nnull");
    br.com.addvisor.model.Address var31 = new br.com.addvisor.model.Address();
    java.lang.String var32 = var31.getComplement();
    java.lang.String var33 = var31.toString();
    boolean var34 = var26.equals((java.lang.Object)var33);
    br.com.addvisor.model.User var35 = new br.com.addvisor.model.User();
    br.com.addvisor.model.State var36 = new br.com.addvisor.model.State();
    var36.setId((java.lang.Long)1L);
    var36.setName("null\nnull\nnull");
    var36.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var43 = var36.getUf();
    boolean var44 = var35.equals((java.lang.Object)var36);
    var26.setState(var36);
    br.com.addvisor.model.Evaluate var46 = new br.com.addvisor.model.Evaluate();
    var46.setId((java.lang.Long)10L);
    var46.setId((java.lang.Long)0L);
    br.com.addvisor.model.User var51 = var46.getUser();
    boolean var52 = var26.equals((java.lang.Object)var46);
    br.com.addvisor.model.State var53 = new br.com.addvisor.model.State();
    boolean var55 = var53.equals((java.lang.Object)(byte)100);
    var53.setUf("null\nnull\nnull");
    br.com.addvisor.model.State var58 = new br.com.addvisor.model.State();
    int var59 = var53.compareTo(var58);
    java.lang.String var60 = var58.getName();
    var26.setState(var58);
    br.com.addvisor.model.State var62 = new br.com.addvisor.model.State();
    boolean var64 = var62.equals((java.lang.Object)(byte)100);
    var62.setUf("null\nnull\nnull");
    br.com.addvisor.model.State var67 = new br.com.addvisor.model.State();
    int var68 = var62.compareTo(var67);
    var67.setName("");
    br.com.addvisor.model.Country var71 = new br.com.addvisor.model.Country();
    java.lang.Integer var72 = var71.getId();
    var67.setCountry(var71);
    java.lang.String var74 = var71.getName();
    var58.setCountry(var71);
    br.com.addvisor.model.User var76 = new br.com.addvisor.model.User();
    br.com.addvisor.model.State var77 = new br.com.addvisor.model.State();
    var77.setId((java.lang.Long)1L);
    var77.setName("null\nnull\nnull");
    var77.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var84 = var77.getUf();
    boolean var85 = var76.equals((java.lang.Object)var77);
    int var86 = var58.compareTo(var77);
    int var87 = var21.compareTo(var77);
    java.lang.String var88 = var77.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "null\nnull\nnull"+ "'", var33.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var88 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var88.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test143");


    br.com.addvisor.model.Evaluate var0 = new br.com.addvisor.model.Evaluate();
    br.com.addvisor.model.State var1 = new br.com.addvisor.model.State();
    boolean var3 = var1.equals((java.lang.Object)(byte)100);
    var1.setUf("null\nnull\nnull");
    boolean var6 = var0.equals((java.lang.Object)var1);
    br.com.addvisor.model.Service var7 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var8 = new br.com.addvisor.model.User();
    boolean var10 = var8.equals((java.lang.Object)(-1L));
    java.lang.String var11 = var8.toString();
    java.lang.String var12 = var8.getPassword();
    var7.setUser(var8);
    br.com.addvisor.model.Address var14 = var7.getAddress();
    java.lang.String var15 = var7.getDescription();
    boolean var16 = var0.equals((java.lang.Object)var7);
    var0.setNote((java.lang.Float)0.0f);
    java.lang.String var19 = var0.getComment();
    var0.setComment("User [id=null, name=null, email=null, password=4238a597ad0f3ff8363f52f6e8c3507, phone=Evaluate [id=0, user=null, service=null, note=null, comment=null], city=null]");
    br.com.addvisor.model.User var24 = new br.com.addvisor.model.User("Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]]", "User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.Long var25 = var24.getId();
    var24.setId((java.lang.Long)(-1L));
    var24.setPhone("null\nnull\nnull");
    java.lang.String var30 = var24.getEmail();
    var24.setName("User [id=null, name=null, email=User [id=null, name=null, email=null, password=null, phone=null, city=null], password=null, phone=null, city=null]");
    br.com.addvisor.model.City var39 = new br.com.addvisor.model.City();
    var39.setName("hi!");
    var39.setName("null\nnull\nnull");
    br.com.addvisor.model.Address var44 = new br.com.addvisor.model.Address();
    java.lang.String var45 = var44.getComplement();
    java.lang.String var46 = var44.toString();
    boolean var47 = var39.equals((java.lang.Object)var46);
    br.com.addvisor.model.User var48 = new br.com.addvisor.model.User("hi!", "", "hi!", "User [id=null, name=null, email=null, password=null, phone=null, city=null]", var39);
    br.com.addvisor.model.Address var49 = new br.com.addvisor.model.Address("null\nnull\nnull", "User [id=null, name=null, email=null, password=null, phone=null, city=null]", var39);
    var49.setComplement("");
    br.com.addvisor.model.City var52 = var49.getCity();
    boolean var53 = var24.equals((java.lang.Object)var49);
    br.com.addvisor.model.Service var54 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var55 = new br.com.addvisor.model.User();
    boolean var57 = var55.equals((java.lang.Object)(-1L));
    java.lang.String var58 = var55.toString();
    java.lang.String var59 = var55.getPassword();
    var54.setUser(var55);
    br.com.addvisor.model.Address var61 = var54.getAddress();
    java.lang.String var62 = var54.getName();
    java.lang.String var63 = var54.getDescription();
    br.com.addvisor.model.Address var64 = new br.com.addvisor.model.Address();
    java.lang.String var65 = var64.toString();
    br.com.addvisor.model.City var66 = new br.com.addvisor.model.City();
    var66.setName("hi!");
    var64.setCity(var66);
    var64.setLocation("");
    java.lang.String var72 = var64.getLocation();
    var54.setAddress(var64);
    java.lang.String var74 = var64.toString();
    boolean var75 = var49.equals((java.lang.Object)var74);
    boolean var76 = var0.equals((java.lang.Object)var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var11.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "null\nnull\nnull"+ "'", var46.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var58 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var58.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var65 + "' != '" + "null\nnull\nnull"+ "'", var65.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var72 + "' != '" + ""+ "'", var72.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var74 + "' != '" + "\nnull\nhi!"+ "'", var74.equals("\nnull\nhi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == false);

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test144");


    br.com.addvisor.model.City var6 = new br.com.addvisor.model.City();
    br.com.addvisor.model.Address var7 = new br.com.addvisor.model.Address("null\nnull\nnull", "Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]]", var6);
    java.lang.String var8 = var7.getComplement();
    br.com.addvisor.model.City var9 = new br.com.addvisor.model.City();
    var9.setName("hi!");
    var9.setName("null\nnull\nnull");
    br.com.addvisor.model.Address var14 = new br.com.addvisor.model.Address();
    java.lang.String var15 = var14.getComplement();
    java.lang.String var16 = var14.toString();
    boolean var17 = var9.equals((java.lang.Object)var16);
    br.com.addvisor.model.User var18 = new br.com.addvisor.model.User();
    br.com.addvisor.model.State var19 = new br.com.addvisor.model.State();
    var19.setId((java.lang.Long)1L);
    var19.setName("null\nnull\nnull");
    var19.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var26 = var19.getUf();
    boolean var27 = var18.equals((java.lang.Object)var19);
    var9.setState(var19);
    br.com.addvisor.model.Evaluate var29 = new br.com.addvisor.model.Evaluate();
    var29.setId((java.lang.Long)10L);
    var29.setId((java.lang.Long)0L);
    br.com.addvisor.model.User var34 = var29.getUser();
    boolean var35 = var9.equals((java.lang.Object)var29);
    br.com.addvisor.model.Address var36 = new br.com.addvisor.model.Address();
    java.lang.String var37 = var36.getComplement();
    java.lang.String var38 = var36.toString();
    java.lang.String var39 = var36.getComplement();
    br.com.addvisor.model.City var44 = new br.com.addvisor.model.City();
    var44.setName("hi!");
    var44.setName("null\nnull\nnull");
    br.com.addvisor.model.Address var49 = new br.com.addvisor.model.Address();
    java.lang.String var50 = var49.getComplement();
    java.lang.String var51 = var49.toString();
    boolean var52 = var44.equals((java.lang.Object)var51);
    br.com.addvisor.model.User var53 = new br.com.addvisor.model.User("hi!", "", "hi!", "User [id=null, name=null, email=null, password=null, phone=null, city=null]", var44);
    var36.setCity(var44);
    java.lang.Long var55 = var36.getId();
    br.com.addvisor.model.City var56 = var36.getCity();
    int var57 = var9.compareTo(var56);
    var7.setCity(var56);
    java.lang.Long var59 = var56.getId();
    br.com.addvisor.model.User var60 = new br.com.addvisor.model.User("User [id=10, name=null, email=null, password=bab90b8667e900a415ffe18829d9e6f9, phone= - , city=null]", "User [id=null, name=User [id=null, name=null, email=User [id=null, name=null, email=null, password=null, phone=null, city=null], password=null, phone=null, city=null], email=null, password=null, phone=null, city=null]", "Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]", "Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]]\nService [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]\nhi!", var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]]"+ "'", var8.equals("Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "null\nnull\nnull"+ "'", var16.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "null\nnull\nnull"+ "'", var38.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + "null\nnull\nnull"+ "'", var51.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var59);

  }

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test145");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.addvisor.model.enums.ServiceCat var1 = br.com.addvisor.model.enums.ServiceCat.valueOf("Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]\n\nnull");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test146");


    br.com.addvisor.model.Evaluate var0 = new br.com.addvisor.model.Evaluate();
    var0.setId((java.lang.Long)10L);
    var0.setId((java.lang.Long)0L);
    br.com.addvisor.model.User var5 = var0.getUser();
    java.lang.String var6 = var0.getComment();
    java.lang.String var7 = var0.getComment();
    br.com.addvisor.model.Evaluate var8 = new br.com.addvisor.model.Evaluate();
    var8.setId((java.lang.Long)10L);
    var8.setId((java.lang.Long)0L);
    br.com.addvisor.model.User var13 = var8.getUser();
    var8.setComment("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    br.com.addvisor.model.Service var16 = new br.com.addvisor.model.Service();
    java.lang.String var17 = var16.getName();
    var8.setService(var16);
    var0.setService(var16);
    var16.setMedia((java.lang.Float)1.0f);
    var16.setId((java.lang.Long)0L);
    java.lang.String var24 = var16.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "Service [id=0, name=null, description=null, tags=null, media=1.0, address=null, category=null, phones=null]"+ "'", var24.equals("Service [id=0, name=null, description=null, tags=null, media=1.0, address=null, category=null, phones=null]"));

  }

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test147");


    br.com.addvisor.model.User var2 = new br.com.addvisor.model.User("Evaluate [id=null, user=null, service=Service [id=1, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null], note=null, comment=null]", "User [id=null, name=null, email=null, password=4238a597ad0f3ff8363f52f6e8c3507, phone=Evaluate [id=0, user=null, service=null, note=null, comment=null], city=null]");
    br.com.addvisor.model.User var3 = new br.com.addvisor.model.User();
    boolean var5 = var3.equals((java.lang.Object)(-1L));
    java.lang.String var6 = var3.toString();
    java.lang.String var7 = var3.getPassword();
    java.lang.String var8 = var3.getPhone();
    br.com.addvisor.model.User var9 = new br.com.addvisor.model.User();
    br.com.addvisor.model.State var10 = new br.com.addvisor.model.State();
    var10.setId((java.lang.Long)1L);
    var10.setName("null\nnull\nnull");
    var10.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var17 = var10.getUf();
    boolean var18 = var9.equals((java.lang.Object)var10);
    br.com.addvisor.model.Service var19 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var20 = new br.com.addvisor.model.User();
    boolean var22 = var20.equals((java.lang.Object)(-1L));
    java.lang.String var23 = var20.toString();
    java.lang.String var24 = var20.getPassword();
    var19.setUser(var20);
    br.com.addvisor.model.Address var26 = var19.getAddress();
    java.lang.String var27 = var19.getName();
    br.com.addvisor.model.City var28 = new br.com.addvisor.model.City();
    var28.setName("hi!");
    var28.setName("null\nnull\nnull");
    br.com.addvisor.model.Address var33 = new br.com.addvisor.model.Address();
    java.lang.String var34 = var33.getComplement();
    java.lang.String var35 = var33.toString();
    boolean var36 = var28.equals((java.lang.Object)var35);
    br.com.addvisor.model.State var37 = new br.com.addvisor.model.State();
    var37.setId((java.lang.Long)1L);
    var37.setName("null\nnull\nnull");
    var37.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var44 = var37.getUf();
    var28.setState(var37);
    boolean var46 = var19.equals((java.lang.Object)var28);
    br.com.addvisor.model.Evaluate var49 = new br.com.addvisor.model.Evaluate(var9, var19, (java.lang.Float)100.0f, "");
    br.com.addvisor.model.Evaluate var52 = new br.com.addvisor.model.Evaluate(var3, var19, (java.lang.Float)0.0f, "User [id=null, name=null, email=User [id=null, name=null, email=null, password=null, phone=null, city=null], password=null, phone=null, city=null]");
    java.lang.Long var53 = var19.getId();
    java.lang.String var54 = var19.getName();
    br.com.addvisor.model.Address var55 = var19.getAddress();
    boolean var56 = var2.equals((java.lang.Object)var19);
    java.lang.String var57 = var2.getPhone();
    java.lang.String var58 = var2.getPhone();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var6.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var23.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "null\nnull\nnull"+ "'", var35.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var57 + "' != '" + "Evaluate [id=null, user=null, service=Service [id=1, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null], note=null, comment=null]"+ "'", var57.equals("Evaluate [id=null, user=null, service=Service [id=1, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null], note=null, comment=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var58 + "' != '" + "Evaluate [id=null, user=null, service=Service [id=1, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null], note=null, comment=null]"+ "'", var58.equals("Evaluate [id=null, user=null, service=Service [id=1, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null], note=null, comment=null]"));

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test148");


    br.com.addvisor.model.City var2 = new br.com.addvisor.model.City();
    var2.setName("hi!");
    java.lang.String var5 = var2.getName();
    br.com.addvisor.model.Address var6 = new br.com.addvisor.model.Address("Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]", "", var2);
    br.com.addvisor.model.City var7 = var6.getCity();
    java.lang.String var8 = var7.getName();
    java.lang.String var9 = var7.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));

  }

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test149");


    br.com.addvisor.model.Agenda var0 = new br.com.addvisor.model.Agenda();
    java.util.List var1 = var0.getNames();
    java.util.List var2 = var0.getNumbers();
    var0.addContact("User [id=-1, name=null, email=null, password=21c96d96756cfeed7f71110d9cb1788b, phone=null\nnull\nnull, city=null]", "Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]");
    br.com.addvisor.model.Agenda var6 = new br.com.addvisor.model.Agenda();
    java.util.List var7 = var6.getNames();
    java.util.List var8 = var6.getNumbers();
    br.com.addvisor.model.Agenda var9 = new br.com.addvisor.model.Agenda();
    java.util.List var10 = var9.getNames();
    java.util.List var11 = var9.getNumbers();
    var6.setNames(var11);
    var6.addContact("null\nnull\nnull", "User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.util.List var16 = var6.getNames();
    var0.setNames(var16);
    br.com.addvisor.model.Agenda var18 = new br.com.addvisor.model.Agenda();
    java.util.List var19 = var18.getNames();
    java.util.List var20 = var18.getNumbers();
    br.com.addvisor.model.Agenda var21 = new br.com.addvisor.model.Agenda();
    java.util.List var22 = var21.getNames();
    java.util.List var23 = var21.getNumbers();
    var18.setNames(var23);
    var18.addContact("User [id=null, name=null, email=null, password=null, phone=null, city=null]", "User [id=-1, name=null, email=null, password=21c96d96756cfeed7f71110d9cb1788b, phone=null\nnull\nnull, city=null]");
    java.util.List var28 = var18.getNames();
    var0.setNumbers(var28);
    var0.addContact("User [id=null, name=null, email=null, password=null, phone=null, city=null]\nEvaluate [id=null, user=null, service=null, note=10.0, comment=null]\nhi!", "User [id=null, name=null, email=null, password=null, phone=User [id=null, name=null, email=null, password=null, phone=null, city=null], city=null\nnull\nnull]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test150");


    br.com.addvisor.model.City var2 = new br.com.addvisor.model.City();
    var2.setName("hi!");
    var2.setName("null\nnull\nnull");
    br.com.addvisor.model.Address var7 = new br.com.addvisor.model.Address();
    java.lang.String var8 = var7.getComplement();
    java.lang.String var9 = var7.toString();
    boolean var10 = var2.equals((java.lang.Object)var9);
    br.com.addvisor.model.Address var11 = new br.com.addvisor.model.Address("Country [id=100, name=Country [id=null, name=null, acronym=null], acronym=null]", "Country [id=100, name=Country [id=null, name=null, acronym=null], acronym=null]", var2);
    br.com.addvisor.model.State var12 = new br.com.addvisor.model.State();
    boolean var14 = var12.equals((java.lang.Object)(byte)100);
    br.com.addvisor.model.Country var15 = var12.getCountry();
    br.com.addvisor.model.State var16 = new br.com.addvisor.model.State();
    boolean var18 = var16.equals((java.lang.Object)(byte)100);
    br.com.addvisor.model.State var19 = new br.com.addvisor.model.State();
    boolean var21 = var19.equals((java.lang.Object)(byte)100);
    var19.setUf("null\nnull\nnull");
    br.com.addvisor.model.State var24 = new br.com.addvisor.model.State();
    int var25 = var19.compareTo(var24);
    java.lang.String var26 = var24.getName();
    var24.setId((java.lang.Long)10L);
    java.lang.Long var29 = var24.getId();
    int var30 = var16.compareTo(var24);
    int var31 = var12.compareTo(var24);
    var2.setState(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "null\nnull\nnull"+ "'", var9.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + 10L+ "'", var29.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0);

  }

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test151");


    br.com.addvisor.model.Address var0 = new br.com.addvisor.model.Address();
    java.lang.String var1 = var0.getComplement();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.getComplement();
    br.com.addvisor.model.City var8 = new br.com.addvisor.model.City();
    var8.setName("hi!");
    var8.setName("null\nnull\nnull");
    br.com.addvisor.model.Address var13 = new br.com.addvisor.model.Address();
    java.lang.String var14 = var13.getComplement();
    java.lang.String var15 = var13.toString();
    boolean var16 = var8.equals((java.lang.Object)var15);
    br.com.addvisor.model.User var17 = new br.com.addvisor.model.User("hi!", "", "hi!", "User [id=null, name=null, email=null, password=null, phone=null, city=null]", var8);
    var0.setCity(var8);
    var0.setLocation("hi!");
    var0.setComplement("Evaluate [id=0, user=null, service=Service [id=null, name=null, description=null, tags=null, media=null, address=null\nnull\nnull, category=null, phones=null], note=0.0, comment=null]");
    br.com.addvisor.model.City var25 = new br.com.addvisor.model.City();
    var25.setName("hi!");
    var25.setName("null\nnull\nnull");
    br.com.addvisor.model.Address var30 = new br.com.addvisor.model.Address();
    java.lang.String var31 = var30.getComplement();
    java.lang.String var32 = var30.toString();
    boolean var33 = var25.equals((java.lang.Object)var32);
    br.com.addvisor.model.User var34 = new br.com.addvisor.model.User();
    br.com.addvisor.model.State var35 = new br.com.addvisor.model.State();
    var35.setId((java.lang.Long)1L);
    var35.setName("null\nnull\nnull");
    var35.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var42 = var35.getUf();
    boolean var43 = var34.equals((java.lang.Object)var35);
    var25.setState(var35);
    br.com.addvisor.model.Address var45 = new br.com.addvisor.model.Address("Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]]", "", var25);
    br.com.addvisor.model.City var46 = var45.getCity();
    var0.setCity(var46);
    br.com.addvisor.model.User var48 = new br.com.addvisor.model.User();
    boolean var50 = var48.equals((java.lang.Object)(-1L));
    java.lang.String var51 = var48.toString();
    java.lang.String var52 = var48.getPassword();
    java.lang.String var53 = var48.getName();
    java.lang.String var54 = var48.getPassword();
    java.lang.String var55 = var48.getName();
    br.com.addvisor.model.Service var56 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var57 = new br.com.addvisor.model.User();
    boolean var59 = var57.equals((java.lang.Object)(-1L));
    java.lang.String var60 = var57.toString();
    java.lang.String var61 = var57.getPassword();
    var56.setUser(var57);
    br.com.addvisor.model.Address var63 = var56.getAddress();
    java.lang.String var64 = var56.getName();
    br.com.addvisor.model.Address var65 = var56.getAddress();
    br.com.addvisor.model.User var66 = new br.com.addvisor.model.User();
    boolean var68 = var66.equals((java.lang.Object)(-1L));
    java.lang.String var69 = var66.toString();
    br.com.addvisor.model.Evaluate var70 = new br.com.addvisor.model.Evaluate();
    var70.setId((java.lang.Long)10L);
    var70.setId((java.lang.Long)0L);
    br.com.addvisor.model.User var75 = var70.getUser();
    boolean var76 = var66.equals((java.lang.Object)var70);
    java.lang.String var77 = var66.getPassword();
    var66.setId((java.lang.Long)(-1L));
    java.lang.String var80 = var66.getPhone();
    var56.setUser(var66);
    br.com.addvisor.model.Evaluate var84 = new br.com.addvisor.model.Evaluate(var48, var56, (java.lang.Float)10.0f, "User [id=null, name=null, email=null, password=null, phone=null, city=null] - null");
    boolean var85 = var0.equals((java.lang.Object)var56);
    var0.setId((java.lang.Long)(-1L));
    java.lang.String var88 = var0.getLocation();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "null\nnull\nnull"+ "'", var2.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "null\nnull\nnull"+ "'", var15.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "null\nnull\nnull"+ "'", var32.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var51.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var60.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var69 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var69.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var88 + "' != '" + "hi!"+ "'", var88.equals("hi!"));

  }

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test152");


    br.com.addvisor.model.City var6 = new br.com.addvisor.model.City();
    var6.setName("hi!");
    var6.setName("null\nnull\nnull");
    br.com.addvisor.model.Address var11 = new br.com.addvisor.model.Address();
    java.lang.String var12 = var11.getComplement();
    java.lang.String var13 = var11.toString();
    boolean var14 = var6.equals((java.lang.Object)var13);
    br.com.addvisor.model.User var15 = new br.com.addvisor.model.User("hi!", "", "hi!", "User [id=null, name=null, email=null, password=null, phone=null, city=null]", var6);
    br.com.addvisor.model.Address var16 = new br.com.addvisor.model.Address("null\nnull\nnull", "User [id=null, name=null, email=null, password=null, phone=null, city=null]", var6);
    var16.setComplement("");
    br.com.addvisor.model.City var19 = var16.getCity();
    java.lang.String var20 = var19.toString();
    var19.setId((java.lang.Long)0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "null\nnull\nnull"+ "'", var13.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "null\nnull\nnull"+ "'", var20.equals("null\nnull\nnull"));

  }

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test153");


    br.com.addvisor.model.Evaluate var0 = new br.com.addvisor.model.Evaluate();
    var0.setId((java.lang.Long)10L);
    var0.setId((java.lang.Long)0L);
    br.com.addvisor.model.User var5 = var0.getUser();
    java.lang.String var6 = var0.getComment();
    java.lang.String var7 = var0.getComment();
    var0.setComment("null\nnull\nnull");
    var0.setComment("User [id=null, name=null, email=null, password=21c96d96756cfeed7f71110d9cb1788b, phone=Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]], city=null]");
    java.lang.String var12 = var0.getComment();
    br.com.addvisor.model.Service var13 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var14 = new br.com.addvisor.model.User();
    boolean var16 = var14.equals((java.lang.Object)(-1L));
    java.lang.String var17 = var14.toString();
    java.lang.String var18 = var14.getPassword();
    var13.setUser(var14);
    br.com.addvisor.model.Address var20 = var13.getAddress();
    java.lang.String var21 = var13.getName();
    var13.setId((java.lang.Long)1L);
    var13.setDescription("Service [id=100, name=, description=null, tags=null, media=null, address=null, category=null, phones=null]");
    java.lang.String var26 = var13.getName();
    var0.setService(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "User [id=null, name=null, email=null, password=21c96d96756cfeed7f71110d9cb1788b, phone=Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]], city=null]"+ "'", var12.equals("User [id=null, name=null, email=null, password=21c96d96756cfeed7f71110d9cb1788b, phone=Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]], city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var17.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);

  }

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test154");


    br.com.addvisor.model.Service var0 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var1 = new br.com.addvisor.model.User();
    boolean var3 = var1.equals((java.lang.Object)(-1L));
    java.lang.String var4 = var1.toString();
    java.lang.String var5 = var1.getPassword();
    var0.setUser(var1);
    br.com.addvisor.model.Address var7 = var0.getAddress();
    java.lang.String var8 = var0.getName();
    java.lang.String var9 = var0.getDescription();
    br.com.addvisor.model.Address var10 = new br.com.addvisor.model.Address();
    java.lang.String var11 = var10.toString();
    br.com.addvisor.model.City var12 = new br.com.addvisor.model.City();
    var12.setName("hi!");
    var10.setCity(var12);
    var10.setLocation("");
    java.lang.String var18 = var10.getLocation();
    var0.setAddress(var10);
    java.lang.Long var20 = var10.getId();
    br.com.addvisor.model.City var23 = new br.com.addvisor.model.City();
    var23.setName("hi!");
    var23.setName("null\nnull\nnull");
    br.com.addvisor.model.Address var28 = new br.com.addvisor.model.Address();
    java.lang.String var29 = var28.getComplement();
    java.lang.String var30 = var28.toString();
    boolean var31 = var23.equals((java.lang.Object)var30);
    br.com.addvisor.model.Address var32 = new br.com.addvisor.model.Address("Country [id=100, name=Country [id=null, name=null, acronym=null], acronym=null]", "Country [id=100, name=Country [id=null, name=null, acronym=null], acronym=null]", var23);
    br.com.addvisor.model.City var33 = var32.getCity();
    var10.setCity(var33);
    br.com.addvisor.model.State var35 = var33.getState();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var4.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "null\nnull\nnull"+ "'", var11.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "null\nnull\nnull"+ "'", var30.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);

  }

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test155");


    br.com.addvisor.model.Service var0 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var1 = new br.com.addvisor.model.User();
    boolean var3 = var1.equals((java.lang.Object)(-1L));
    java.lang.String var4 = var1.toString();
    java.lang.String var5 = var1.getPassword();
    var0.setUser(var1);
    var0.setTags("Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]]");
    java.lang.String var9 = var0.getName();
    br.com.addvisor.model.enums.ServiceCat var10 = var0.getCategory();
    br.com.addvisor.model.User var11 = new br.com.addvisor.model.User();
    boolean var13 = var11.equals((java.lang.Object)(-1L));
    java.lang.String var14 = var11.getEmail();
    var0.setUser(var11);
    var0.setName("Evaluate [id=-1, user=User [id=null, name=null, email=null, password=null, phone=null, city=null], service=Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null], note=null, comment=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var4.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test156() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test156");


    br.com.addvisor.model.Service var0 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var1 = new br.com.addvisor.model.User();
    boolean var3 = var1.equals((java.lang.Object)(-1L));
    java.lang.String var4 = var1.toString();
    java.lang.String var5 = var1.getPassword();
    var0.setUser(var1);
    br.com.addvisor.model.Address var7 = var0.getAddress();
    br.com.addvisor.model.Address var8 = new br.com.addvisor.model.Address();
    java.lang.String var9 = var8.getComplement();
    java.lang.String var10 = var8.toString();
    br.com.addvisor.model.City var11 = var8.getCity();
    br.com.addvisor.model.State var12 = new br.com.addvisor.model.State();
    var12.setId((java.lang.Long)1L);
    var12.setName("null\nnull\nnull");
    var12.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var19 = var12.getUf();
    boolean var20 = var8.equals((java.lang.Object)var12);
    var0.setAddress(var8);
    var0.setTags("Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]]");
    java.lang.String var24 = var0.getDescription();
    java.lang.String var25 = var0.toString();
    br.com.addvisor.model.enums.ServiceCat var26 = var0.getCategory();
    java.util.List var27 = var0.getPhones();
    br.com.addvisor.model.Address var28 = var0.getAddress();
    var0.setMedia((java.lang.Float)10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var4.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "null\nnull\nnull"+ "'", var10.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "Service [id=null, name=null, description=null, tags=Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]], media=null, address=null\nnull\nnull, category=null, phones=null]"+ "'", var25.equals("Service [id=null, name=null, description=null, tags=Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]], media=null, address=null\nnull\nnull, category=null, phones=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test157() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test157");


    br.com.addvisor.model.Evaluate var0 = new br.com.addvisor.model.Evaluate();
    br.com.addvisor.model.State var1 = new br.com.addvisor.model.State();
    boolean var3 = var1.equals((java.lang.Object)(byte)100);
    var1.setUf("null\nnull\nnull");
    boolean var6 = var0.equals((java.lang.Object)var1);
    br.com.addvisor.model.Service var7 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var8 = new br.com.addvisor.model.User();
    boolean var10 = var8.equals((java.lang.Object)(-1L));
    java.lang.String var11 = var8.toString();
    java.lang.String var12 = var8.getPassword();
    var7.setUser(var8);
    br.com.addvisor.model.Address var14 = var7.getAddress();
    var0.setService(var7);
    java.lang.String var16 = var0.toString();
    java.lang.String var17 = var0.getComment();
    br.com.addvisor.model.Service var18 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var19 = new br.com.addvisor.model.User();
    boolean var21 = var19.equals((java.lang.Object)(-1L));
    java.lang.String var22 = var19.toString();
    java.lang.String var23 = var19.getPassword();
    var18.setUser(var19);
    br.com.addvisor.model.Address var25 = var18.getAddress();
    java.lang.String var26 = var18.getName();
    java.lang.String var27 = var18.getDescription();
    br.com.addvisor.model.Address var28 = new br.com.addvisor.model.Address();
    java.lang.String var29 = var28.toString();
    br.com.addvisor.model.City var30 = new br.com.addvisor.model.City();
    var30.setName("hi!");
    var28.setCity(var30);
    var28.setLocation("");
    java.lang.String var36 = var28.getLocation();
    var18.setAddress(var28);
    java.lang.Float var38 = var18.getMedia();
    br.com.addvisor.model.enums.ServiceCat var39 = var18.getCategory();
    var0.setService(var18);
    br.com.addvisor.model.Evaluate var41 = new br.com.addvisor.model.Evaluate();
    var41.setId((java.lang.Long)10L);
    var41.setId((java.lang.Long)0L);
    var41.setComment("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    var41.setId((java.lang.Long)100L);
    br.com.addvisor.model.User var50 = new br.com.addvisor.model.User();
    boolean var52 = var50.equals((java.lang.Object)(-1L));
    java.lang.String var53 = var50.toString();
    java.lang.String var54 = var50.getPassword();
    java.lang.String var55 = var50.getName();
    var41.setUser(var50);
    java.lang.String var57 = var50.getName();
    var0.setUser(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var11.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Evaluate [id=null, user=null, service=Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null], note=null, comment=null]"+ "'", var16.equals("Evaluate [id=null, user=null, service=Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null], note=null, comment=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var22.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "null\nnull\nnull"+ "'", var29.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + ""+ "'", var36.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var53.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var57);

  }

  public void test158() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test158");


    br.com.addvisor.model.Address var4 = new br.com.addvisor.model.Address();
    java.lang.String var5 = var4.getComplement();
    java.lang.String var6 = var4.toString();
    java.lang.String var7 = var4.getComplement();
    br.com.addvisor.model.City var12 = new br.com.addvisor.model.City();
    var12.setName("hi!");
    var12.setName("null\nnull\nnull");
    br.com.addvisor.model.Address var17 = new br.com.addvisor.model.Address();
    java.lang.String var18 = var17.getComplement();
    java.lang.String var19 = var17.toString();
    boolean var20 = var12.equals((java.lang.Object)var19);
    br.com.addvisor.model.User var21 = new br.com.addvisor.model.User("hi!", "", "hi!", "User [id=null, name=null, email=null, password=null, phone=null, city=null]", var12);
    var4.setCity(var12);
    var4.setLocation("hi!");
    var4.setComplement("Evaluate [id=0, user=null, service=Service [id=null, name=null, description=null, tags=null, media=null, address=null\nnull\nnull, category=null, phones=null], note=0.0, comment=null]");
    br.com.addvisor.model.City var29 = new br.com.addvisor.model.City();
    var29.setName("hi!");
    var29.setName("null\nnull\nnull");
    br.com.addvisor.model.Address var34 = new br.com.addvisor.model.Address();
    java.lang.String var35 = var34.getComplement();
    java.lang.String var36 = var34.toString();
    boolean var37 = var29.equals((java.lang.Object)var36);
    br.com.addvisor.model.User var38 = new br.com.addvisor.model.User();
    br.com.addvisor.model.State var39 = new br.com.addvisor.model.State();
    var39.setId((java.lang.Long)1L);
    var39.setName("null\nnull\nnull");
    var39.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var46 = var39.getUf();
    boolean var47 = var38.equals((java.lang.Object)var39);
    var29.setState(var39);
    br.com.addvisor.model.Address var49 = new br.com.addvisor.model.Address("Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]]", "", var29);
    br.com.addvisor.model.City var50 = var49.getCity();
    var4.setCity(var50);
    br.com.addvisor.model.User var52 = new br.com.addvisor.model.User("Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]\n\nnull", "Evaluate [id=0, user=null, service=Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null], note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]]", " - ", "\nnull\nhi!", var50);
    br.com.addvisor.model.User var53 = new br.com.addvisor.model.User();
    boolean var55 = var53.equals((java.lang.Object)(-1L));
    java.lang.String var56 = var53.toString();
    br.com.addvisor.model.Evaluate var57 = new br.com.addvisor.model.Evaluate();
    var57.setId((java.lang.Long)10L);
    var57.setId((java.lang.Long)0L);
    br.com.addvisor.model.User var62 = var57.getUser();
    boolean var63 = var53.equals((java.lang.Object)var57);
    java.lang.String var64 = var57.getComment();
    var57.setId((java.lang.Long)1L);
    br.com.addvisor.model.User var67 = new br.com.addvisor.model.User();
    br.com.addvisor.model.State var68 = new br.com.addvisor.model.State();
    var68.setId((java.lang.Long)1L);
    var68.setName("null\nnull\nnull");
    var68.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var75 = var68.getUf();
    boolean var76 = var67.equals((java.lang.Object)var68);
    var57.setUser(var67);
    br.com.addvisor.model.User var78 = var57.getUser();
    boolean var79 = var50.equals((java.lang.Object)var57);
    java.lang.Float var80 = var57.getNote();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "null\nnull\nnull"+ "'", var6.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "null\nnull\nnull"+ "'", var19.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "null\nnull\nnull"+ "'", var36.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var56.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var80);

  }

  public void test159() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test159");


    br.com.addvisor.model.Evaluate var0 = new br.com.addvisor.model.Evaluate();
    var0.setId((java.lang.Long)10L);
    var0.setId((java.lang.Long)0L);
    java.lang.Float var5 = var0.getNote();
    br.com.addvisor.model.Service var6 = new br.com.addvisor.model.Service();
    java.lang.String var7 = var6.toString();
    var0.setService(var6);
    br.com.addvisor.model.User var9 = new br.com.addvisor.model.User();
    boolean var11 = var9.equals((java.lang.Object)(-1L));
    java.lang.String var12 = var9.toString();
    java.lang.String var13 = var9.getPassword();
    var0.setUser(var9);
    br.com.addvisor.model.Service var15 = var0.getService();
    var15.setName("21c96d96756cfeed7f71110d9cb1788b");
    br.com.addvisor.model.Address var18 = var15.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]"+ "'", var7.equals("Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var12.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

  public void test160() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test160");


    br.com.addvisor.model.Evaluate var0 = new br.com.addvisor.model.Evaluate();
    var0.setId((java.lang.Long)10L);
    var0.setId((java.lang.Long)0L);
    br.com.addvisor.model.User var5 = var0.getUser();
    java.lang.Long var6 = var0.getId();
    br.com.addvisor.model.Service var7 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var8 = new br.com.addvisor.model.User();
    boolean var10 = var8.equals((java.lang.Object)(-1L));
    java.lang.String var11 = var8.toString();
    java.lang.String var12 = var8.getPassword();
    var7.setUser(var8);
    br.com.addvisor.model.Address var14 = var7.getAddress();
    java.lang.String var15 = var7.getDescription();
    var0.setService(var7);
    java.lang.String var17 = var7.getName();
    java.lang.String var18 = var7.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + 0L+ "'", var6.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var11.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]"+ "'", var18.equals("Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]"));

  }

  public void test161() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test161");


    br.com.addvisor.model.Evaluate var0 = new br.com.addvisor.model.Evaluate();
    br.com.addvisor.model.State var1 = new br.com.addvisor.model.State();
    boolean var3 = var1.equals((java.lang.Object)(byte)100);
    var1.setUf("null\nnull\nnull");
    boolean var6 = var0.equals((java.lang.Object)var1);
    br.com.addvisor.model.Service var7 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var8 = new br.com.addvisor.model.User();
    boolean var10 = var8.equals((java.lang.Object)(-1L));
    java.lang.String var11 = var8.toString();
    java.lang.String var12 = var8.getPassword();
    var7.setUser(var8);
    br.com.addvisor.model.Address var14 = var7.getAddress();
    java.lang.String var15 = var7.getDescription();
    boolean var16 = var0.equals((java.lang.Object)var7);
    var0.setNote((java.lang.Float)0.0f);
    var0.setId((java.lang.Long)(-1L));
    br.com.addvisor.model.Service var21 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var22 = new br.com.addvisor.model.User();
    boolean var24 = var22.equals((java.lang.Object)(-1L));
    java.lang.String var25 = var22.toString();
    java.lang.String var26 = var22.getPassword();
    var21.setUser(var22);
    br.com.addvisor.model.Address var28 = var21.getAddress();
    br.com.addvisor.model.User var29 = new br.com.addvisor.model.User();
    boolean var31 = var29.equals((java.lang.Object)(-1L));
    boolean var33 = var29.equals((java.lang.Object)100.0d);
    var21.setUser(var29);
    br.com.addvisor.model.User var35 = var21.getUser();
    br.com.addvisor.model.Evaluate var36 = new br.com.addvisor.model.Evaluate();
    var36.setId((java.lang.Long)10L);
    var36.setId((java.lang.Long)0L);
    br.com.addvisor.model.User var41 = var36.getUser();
    java.lang.Long var42 = var36.getId();
    br.com.addvisor.model.Service var43 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var44 = new br.com.addvisor.model.User();
    boolean var46 = var44.equals((java.lang.Object)(-1L));
    java.lang.String var47 = var44.toString();
    java.lang.String var48 = var44.getPassword();
    var43.setUser(var44);
    br.com.addvisor.model.Address var50 = var43.getAddress();
    java.lang.String var51 = var43.getDescription();
    var36.setService(var43);
    var43.setId((java.lang.Long)1L);
    br.com.addvisor.model.Agenda var55 = new br.com.addvisor.model.Agenda();
    java.util.List var56 = var55.getNames();
    br.com.addvisor.model.Agenda var57 = new br.com.addvisor.model.Agenda();
    java.util.List var58 = var57.getNames();
    var55.setNames(var58);
    java.util.List var60 = var55.getNumbers();
    br.com.addvisor.model.Agenda var61 = new br.com.addvisor.model.Agenda();
    java.util.List var62 = var61.getNames();
    java.util.List var63 = var61.getNumbers();
    br.com.addvisor.model.Agenda var64 = new br.com.addvisor.model.Agenda();
    java.util.List var65 = var64.getNames();
    java.util.List var66 = var64.getNumbers();
    var61.setNames(var66);
    br.com.addvisor.model.Agenda var68 = new br.com.addvisor.model.Agenda();
    java.util.List var69 = var68.getNames();
    java.util.List var70 = var68.getNumbers();
    br.com.addvisor.model.Agenda var71 = new br.com.addvisor.model.Agenda();
    java.util.List var72 = var71.getNames();
    java.util.List var73 = var71.getNumbers();
    var68.setNames(var73);
    var61.setNames(var73);
    var55.setNumbers(var73);
    var55.addContact("", "");
    br.com.addvisor.model.Agenda var80 = new br.com.addvisor.model.Agenda();
    java.util.List var81 = var80.getNames();
    br.com.addvisor.model.Agenda var82 = new br.com.addvisor.model.Agenda();
    java.util.List var83 = var82.getNames();
    var80.setNames(var83);
    java.util.List var85 = var80.getNumbers();
    var55.setNames(var85);
    var43.setPhones(var85);
    var21.setPhones(var85);
    var0.setService(var21);
    java.lang.Long var90 = var0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var11.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var25.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + 0L+ "'", var42.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var47.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var90 + "' != '" + (-1L)+ "'", var90.equals((-1L)));

  }

  public void test162() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test162");


    br.com.addvisor.model.Evaluate var0 = new br.com.addvisor.model.Evaluate();
    var0.setId((java.lang.Long)10L);
    var0.setId((java.lang.Long)0L);
    br.com.addvisor.model.User var5 = var0.getUser();
    java.lang.String var6 = var0.toString();
    br.com.addvisor.model.Service var7 = var0.getService();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Evaluate [id=0, user=null, service=null, note=null, comment=null]"+ "'", var6.equals("Evaluate [id=0, user=null, service=null, note=null, comment=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test163() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test163");


    br.com.addvisor.model.Evaluate var0 = new br.com.addvisor.model.Evaluate();
    br.com.addvisor.model.State var1 = new br.com.addvisor.model.State();
    boolean var3 = var1.equals((java.lang.Object)(byte)100);
    var1.setUf("null\nnull\nnull");
    boolean var6 = var0.equals((java.lang.Object)var1);
    var1.setName("Evaluate [id=0, user=null, service=Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null], note=null, comment=Evaluate [id=0, user=null, service=null, note=null, comment=null]]");
    br.com.addvisor.model.State var9 = new br.com.addvisor.model.State();
    boolean var11 = var9.equals((java.lang.Object)(byte)100);
    var9.setUf("null\nnull\nnull");
    br.com.addvisor.model.State var14 = new br.com.addvisor.model.State();
    int var15 = var9.compareTo(var14);
    java.lang.String var16 = var14.getName();
    var14.setId((java.lang.Long)10L);
    var14.setUf("Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]");
    br.com.addvisor.model.Country var21 = new br.com.addvisor.model.Country();
    java.lang.Integer var22 = var21.getId();
    java.lang.String var23 = var21.getName();
    var21.setAcronym("Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]]");
    java.lang.String var26 = var21.getAcronym();
    var21.setAcronym("User [id=null, name=null, email=User [id=null, name=null, email=null, password=null, phone=null, city=null], password=null, phone=null, city=null]");
    var14.setCountry(var21);
    java.lang.Integer var30 = var21.getId();
    java.lang.Integer var31 = var21.getId();
    var1.setCountry(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]]"+ "'", var26.equals("Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);

  }

  public void test164() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test164");


    br.com.addvisor.model.City var6 = new br.com.addvisor.model.City();
    var6.setName("hi!");
    var6.setName("null\nnull\nnull");
    br.com.addvisor.model.Address var11 = new br.com.addvisor.model.Address();
    java.lang.String var12 = var11.getComplement();
    java.lang.String var13 = var11.toString();
    boolean var14 = var6.equals((java.lang.Object)var13);
    br.com.addvisor.model.User var15 = new br.com.addvisor.model.User("hi!", "", "hi!", "User [id=null, name=null, email=null, password=null, phone=null, city=null]", var6);
    br.com.addvisor.model.Address var16 = new br.com.addvisor.model.Address("null\nnull\nnull", "User [id=null, name=null, email=null, password=null, phone=null, city=null]", var6);
    var16.setComplement("");
    br.com.addvisor.model.City var19 = var16.getCity();
    br.com.addvisor.model.State var20 = var19.getState();
    java.lang.String var21 = var19.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "null\nnull\nnull"+ "'", var13.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "null\nnull\nnull"+ "'", var21.equals("null\nnull\nnull"));

  }

  public void test165() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test165");


    br.com.addvisor.model.User var0 = new br.com.addvisor.model.User();
    boolean var2 = var0.equals((java.lang.Object)(-1L));
    java.lang.String var3 = var0.toString();
    java.lang.String var4 = var0.getPassword();
    java.lang.String var5 = var0.getPhone();
    br.com.addvisor.model.User var6 = new br.com.addvisor.model.User();
    br.com.addvisor.model.State var7 = new br.com.addvisor.model.State();
    var7.setId((java.lang.Long)1L);
    var7.setName("null\nnull\nnull");
    var7.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var14 = var7.getUf();
    boolean var15 = var6.equals((java.lang.Object)var7);
    br.com.addvisor.model.Service var16 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var17 = new br.com.addvisor.model.User();
    boolean var19 = var17.equals((java.lang.Object)(-1L));
    java.lang.String var20 = var17.toString();
    java.lang.String var21 = var17.getPassword();
    var16.setUser(var17);
    br.com.addvisor.model.Address var23 = var16.getAddress();
    java.lang.String var24 = var16.getName();
    br.com.addvisor.model.City var25 = new br.com.addvisor.model.City();
    var25.setName("hi!");
    var25.setName("null\nnull\nnull");
    br.com.addvisor.model.Address var30 = new br.com.addvisor.model.Address();
    java.lang.String var31 = var30.getComplement();
    java.lang.String var32 = var30.toString();
    boolean var33 = var25.equals((java.lang.Object)var32);
    br.com.addvisor.model.State var34 = new br.com.addvisor.model.State();
    var34.setId((java.lang.Long)1L);
    var34.setName("null\nnull\nnull");
    var34.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var41 = var34.getUf();
    var25.setState(var34);
    boolean var43 = var16.equals((java.lang.Object)var25);
    br.com.addvisor.model.Evaluate var46 = new br.com.addvisor.model.Evaluate(var6, var16, (java.lang.Float)100.0f, "");
    br.com.addvisor.model.Evaluate var49 = new br.com.addvisor.model.Evaluate(var0, var16, (java.lang.Float)0.0f, "User [id=null, name=null, email=User [id=null, name=null, email=null, password=null, phone=null, city=null], password=null, phone=null, city=null]");
    java.lang.Long var50 = var16.getId();
    br.com.addvisor.model.User var51 = new br.com.addvisor.model.User();
    boolean var53 = var51.equals((java.lang.Object)(-1L));
    boolean var55 = var51.equals((java.lang.Object)100.0d);
    var51.setEmail("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var58 = var51.toString();
    var16.setUser(var51);
    br.com.addvisor.model.Service var60 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var61 = new br.com.addvisor.model.User();
    boolean var63 = var61.equals((java.lang.Object)(-1L));
    java.lang.String var64 = var61.toString();
    java.lang.String var65 = var61.getPassword();
    var60.setUser(var61);
    br.com.addvisor.model.Address var67 = var60.getAddress();
    br.com.addvisor.model.Evaluate var70 = new br.com.addvisor.model.Evaluate(var51, var60, (java.lang.Float)1.0f, "User [id=null, name=null, email=null, password=21c96d96756cfeed7f71110d9cb1788b, phone=Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]], city=null]");
    var60.setDescription("Evaluate [id=0, user=null, service=null, note=null, comment=null]");
    var60.setName("User [id=null, name=null, email=User [id=null, name=null, email=null, password=null, phone=null, city=null], password=null, phone=null, city=null]");
    var60.setMedia((java.lang.Float)(-1.0f));
    java.lang.String var77 = var60.getTags();
    java.util.List var78 = var60.getPhones();
    java.lang.String var79 = var60.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var3.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var20.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "null\nnull\nnull"+ "'", var32.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var58 + "' != '" + "User [id=null, name=null, email=User [id=null, name=null, email=null, password=null, phone=null, city=null], password=null, phone=null, city=null]"+ "'", var58.equals("User [id=null, name=null, email=User [id=null, name=null, email=null, password=null, phone=null, city=null], password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var64 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var64.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var79 + "' != '" + "Evaluate [id=0, user=null, service=null, note=null, comment=null]"+ "'", var79.equals("Evaluate [id=0, user=null, service=null, note=null, comment=null]"));

  }

  public void test166() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test166");


    br.com.addvisor.model.User var0 = new br.com.addvisor.model.User();
    boolean var2 = var0.equals((java.lang.Object)(-1L));
    java.lang.String var3 = var0.toString();
    br.com.addvisor.model.Evaluate var4 = new br.com.addvisor.model.Evaluate();
    var4.setId((java.lang.Long)10L);
    var4.setId((java.lang.Long)0L);
    br.com.addvisor.model.User var9 = var4.getUser();
    boolean var10 = var0.equals((java.lang.Object)var4);
    java.lang.String var11 = var0.getPassword();
    var0.setId((java.lang.Long)100L);
    br.com.addvisor.model.Address var14 = new br.com.addvisor.model.Address();
    java.lang.String var15 = var14.getComplement();
    java.lang.String var16 = var14.toString();
    boolean var17 = var0.equals((java.lang.Object)var14);
    var0.setName("User [id=null, name=null, email=null, password=21c96d96756cfeed7f71110d9cb1788b, phone=Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]], city=null]");
    java.lang.Long var20 = var0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var3.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "null\nnull\nnull"+ "'", var16.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + 100L+ "'", var20.equals(100L));

  }

  public void test167() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test167");


    br.com.addvisor.model.Service var0 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var1 = new br.com.addvisor.model.User();
    boolean var3 = var1.equals((java.lang.Object)(-1L));
    java.lang.String var4 = var1.toString();
    java.lang.String var5 = var1.getPassword();
    var0.setUser(var1);
    br.com.addvisor.model.Address var7 = var0.getAddress();
    br.com.addvisor.model.User var8 = new br.com.addvisor.model.User();
    boolean var10 = var8.equals((java.lang.Object)(-1L));
    boolean var12 = var8.equals((java.lang.Object)100.0d);
    var0.setUser(var8);
    br.com.addvisor.model.City var14 = var8.getCity();
    var8.setId((java.lang.Long)10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var4.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test168() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test168");


    br.com.addvisor.model.State var0 = new br.com.addvisor.model.State();
    boolean var2 = var0.equals((java.lang.Object)(byte)100);
    br.com.addvisor.model.Country var3 = var0.getCountry();
    var0.setId((java.lang.Long)1L);
    java.lang.String var6 = var0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test169() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test169");


    br.com.addvisor.model.Evaluate var0 = new br.com.addvisor.model.Evaluate();
    br.com.addvisor.model.State var1 = new br.com.addvisor.model.State();
    boolean var3 = var1.equals((java.lang.Object)(byte)100);
    var1.setUf("null\nnull\nnull");
    boolean var6 = var0.equals((java.lang.Object)var1);
    br.com.addvisor.model.Service var7 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var8 = new br.com.addvisor.model.User();
    boolean var10 = var8.equals((java.lang.Object)(-1L));
    java.lang.String var11 = var8.toString();
    java.lang.String var12 = var8.getPassword();
    var7.setUser(var8);
    br.com.addvisor.model.Address var14 = var7.getAddress();
    java.lang.String var15 = var7.getDescription();
    boolean var16 = var0.equals((java.lang.Object)var7);
    java.lang.Float var17 = var7.getMedia();
    java.lang.String var18 = var7.toString();
    br.com.addvisor.model.Agenda var19 = new br.com.addvisor.model.Agenda();
    java.util.List var20 = var19.getNames();
    java.util.List var21 = var19.getNumbers();
    br.com.addvisor.model.Agenda var22 = new br.com.addvisor.model.Agenda();
    java.util.List var23 = var22.getNames();
    java.util.List var24 = var22.getNumbers();
    var19.setNames(var24);
    br.com.addvisor.model.Agenda var26 = new br.com.addvisor.model.Agenda();
    java.util.List var27 = var26.getNames();
    java.util.List var28 = var26.getNumbers();
    br.com.addvisor.model.Agenda var29 = new br.com.addvisor.model.Agenda();
    java.util.List var30 = var29.getNames();
    java.util.List var31 = var29.getNumbers();
    var26.setNames(var31);
    var19.setNames(var31);
    java.util.Map var34 = var19.getContacts();
    java.util.List var35 = var19.getNames();
    java.util.List var36 = var19.getNames();
    br.com.addvisor.model.Evaluate var37 = new br.com.addvisor.model.Evaluate();
    var37.setId((java.lang.Long)10L);
    var37.setId((java.lang.Long)0L);
    var37.setComment("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    br.com.addvisor.model.Agenda var44 = new br.com.addvisor.model.Agenda();
    java.util.List var45 = var44.getNames();
    br.com.addvisor.model.Agenda var46 = new br.com.addvisor.model.Agenda();
    java.util.List var47 = var46.getNames();
    var44.setNames(var47);
    java.util.List var49 = var44.getNumbers();
    boolean var50 = var37.equals((java.lang.Object)var44);
    java.util.List var51 = var44.getNumbers();
    var19.setNames(var51);
    java.util.List var53 = var19.getNumbers();
    br.com.addvisor.model.Service var54 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var55 = new br.com.addvisor.model.User();
    boolean var57 = var55.equals((java.lang.Object)(-1L));
    java.lang.String var58 = var55.toString();
    java.lang.String var59 = var55.getPassword();
    var54.setUser(var55);
    br.com.addvisor.model.Address var61 = var54.getAddress();
    br.com.addvisor.model.enums.ServiceCat var62 = var54.getCategory();
    br.com.addvisor.model.Agenda var63 = new br.com.addvisor.model.Agenda();
    java.util.List var64 = var63.getNames();
    br.com.addvisor.model.Agenda var65 = new br.com.addvisor.model.Agenda();
    java.util.List var66 = var65.getNames();
    var63.setNames(var66);
    java.util.List var68 = var63.getNumbers();
    br.com.addvisor.model.Agenda var69 = new br.com.addvisor.model.Agenda();
    java.util.List var70 = var69.getNames();
    java.util.List var71 = var69.getNumbers();
    br.com.addvisor.model.Agenda var72 = new br.com.addvisor.model.Agenda();
    java.util.List var73 = var72.getNames();
    java.util.List var74 = var72.getNumbers();
    var69.setNames(var74);
    br.com.addvisor.model.Agenda var76 = new br.com.addvisor.model.Agenda();
    java.util.List var77 = var76.getNames();
    java.util.List var78 = var76.getNumbers();
    br.com.addvisor.model.Agenda var79 = new br.com.addvisor.model.Agenda();
    java.util.List var80 = var79.getNames();
    java.util.List var81 = var79.getNumbers();
    var76.setNames(var81);
    var69.setNames(var81);
    var63.setNumbers(var81);
    var54.setPhones(var81);
    var19.setNumbers(var81);
    boolean var87 = var7.equals((java.lang.Object)var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var11.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]"+ "'", var18.equals("Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var58 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var58.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == false);

  }

  public void test170() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test170");


    br.com.addvisor.model.State var0 = new br.com.addvisor.model.State();
    boolean var2 = var0.equals((java.lang.Object)(byte)100);
    java.lang.Long var3 = var0.getId();
    br.com.addvisor.model.State var4 = new br.com.addvisor.model.State();
    boolean var6 = var4.equals((java.lang.Object)(byte)100);
    var4.setUf("null\nnull\nnull");
    br.com.addvisor.model.State var9 = new br.com.addvisor.model.State();
    int var10 = var4.compareTo(var9);
    var9.setName("");
    br.com.addvisor.model.Country var13 = new br.com.addvisor.model.Country();
    java.lang.Integer var14 = var13.getId();
    var9.setCountry(var13);
    br.com.addvisor.model.Country var16 = new br.com.addvisor.model.Country();
    java.lang.Integer var17 = var16.getId();
    java.lang.String var18 = var16.getName();
    var9.setCountry(var16);
    int var20 = var0.compareTo(var9);
    var9.setUf("User [id=null, name=null, email=null, password=null, phone=null, city=null] - null");
    var9.setName("null\nhi!\nnull\nnull\nnull");
    br.com.addvisor.model.City var27 = new br.com.addvisor.model.City();
    br.com.addvisor.model.Address var28 = new br.com.addvisor.model.Address("null\nnull\nnull", "Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]]", var27);
    br.com.addvisor.model.State var29 = new br.com.addvisor.model.State();
    boolean var31 = var29.equals((java.lang.Object)(byte)100);
    var29.setUf("null\nnull\nnull");
    br.com.addvisor.model.State var34 = new br.com.addvisor.model.State();
    int var35 = var29.compareTo(var34);
    var34.setName("");
    var27.setState(var34);
    var34.setId((java.lang.Long)100L);
    br.com.addvisor.model.State var41 = new br.com.addvisor.model.State();
    boolean var43 = var41.equals((java.lang.Object)(byte)100);
    var41.setUf("null\nnull\nnull");
    br.com.addvisor.model.State var46 = new br.com.addvisor.model.State();
    int var47 = var41.compareTo(var46);
    var46.setName("");
    int var50 = var34.compareTo(var46);
    br.com.addvisor.model.State var51 = new br.com.addvisor.model.State();
    var51.setId((java.lang.Long)1L);
    br.com.addvisor.model.State var54 = new br.com.addvisor.model.State();
    var54.setId((java.lang.Long)1L);
    var54.setName("null\nnull\nnull");
    var54.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var61 = var54.getUf();
    java.lang.String var62 = var54.getName();
    br.com.addvisor.model.Country var63 = new br.com.addvisor.model.Country();
    java.lang.String var64 = var63.getAcronym();
    boolean var65 = var54.equals((java.lang.Object)var63);
    var51.setCountry(var63);
    var46.setCountry(var63);
    java.lang.Integer var68 = var63.getId();
    var9.setCountry(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var62 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var62.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var68);

  }

  public void test171() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test171");


    br.com.addvisor.model.Evaluate var0 = new br.com.addvisor.model.Evaluate();
    br.com.addvisor.model.State var1 = new br.com.addvisor.model.State();
    boolean var3 = var1.equals((java.lang.Object)(byte)100);
    var1.setUf("null\nnull\nnull");
    boolean var6 = var0.equals((java.lang.Object)var1);
    br.com.addvisor.model.Service var7 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var8 = new br.com.addvisor.model.User();
    boolean var10 = var8.equals((java.lang.Object)(-1L));
    java.lang.String var11 = var8.toString();
    java.lang.String var12 = var8.getPassword();
    var7.setUser(var8);
    br.com.addvisor.model.Address var14 = var7.getAddress();
    java.lang.String var15 = var7.getDescription();
    boolean var16 = var0.equals((java.lang.Object)var7);
    var0.setNote((java.lang.Float)0.0f);
    var0.setId((java.lang.Long)(-1L));
    br.com.addvisor.model.Service var21 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var22 = new br.com.addvisor.model.User();
    boolean var24 = var22.equals((java.lang.Object)(-1L));
    java.lang.String var25 = var22.toString();
    java.lang.String var26 = var22.getPassword();
    var21.setUser(var22);
    br.com.addvisor.model.Address var28 = var21.getAddress();
    java.lang.String var29 = var21.getName();
    java.lang.String var30 = var21.getDescription();
    br.com.addvisor.model.Address var31 = new br.com.addvisor.model.Address();
    java.lang.String var32 = var31.toString();
    br.com.addvisor.model.City var33 = new br.com.addvisor.model.City();
    var33.setName("hi!");
    var31.setCity(var33);
    var31.setLocation("");
    java.lang.String var39 = var31.getLocation();
    var21.setAddress(var31);
    java.lang.Long var41 = var21.getId();
    var21.setTags("Service [id=null, name=null, description=null, tags=Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]], media=null, address=null\nnull\nnull, category=null, phones=null]");
    var0.setService(var21);
    java.lang.String var45 = var21.getTags();
    br.com.addvisor.model.User var46 = new br.com.addvisor.model.User();
    boolean var48 = var46.equals((java.lang.Object)(-1L));
    java.lang.String var49 = var46.toString();
    br.com.addvisor.model.Evaluate var50 = new br.com.addvisor.model.Evaluate();
    var50.setId((java.lang.Long)10L);
    var50.setId((java.lang.Long)0L);
    br.com.addvisor.model.User var55 = var50.getUser();
    boolean var56 = var46.equals((java.lang.Object)var50);
    java.lang.String var57 = var50.getComment();
    var50.setId((java.lang.Long)1L);
    br.com.addvisor.model.User var60 = new br.com.addvisor.model.User();
    br.com.addvisor.model.State var61 = new br.com.addvisor.model.State();
    var61.setId((java.lang.Long)1L);
    var61.setName("null\nnull\nnull");
    var61.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var68 = var61.getUf();
    boolean var69 = var60.equals((java.lang.Object)var61);
    var50.setUser(var60);
    br.com.addvisor.model.User var71 = var50.getUser();
    java.lang.String var72 = var50.toString();
    boolean var73 = var21.equals((java.lang.Object)var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var11.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var25.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "null\nnull\nnull"+ "'", var32.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + ""+ "'", var39.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "Service [id=null, name=null, description=null, tags=Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]], media=null, address=null\nnull\nnull, category=null, phones=null]"+ "'", var45.equals("Service [id=null, name=null, description=null, tags=Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]], media=null, address=null\nnull\nnull, category=null, phones=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var49.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var72 + "' != '" + "Evaluate [id=1, user=User [id=null, name=null, email=null, password=null, phone=null, city=null], service=null, note=null, comment=null]"+ "'", var72.equals("Evaluate [id=1, user=User [id=null, name=null, email=null, password=null, phone=null, city=null], service=null, note=null, comment=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);

  }

  public void test172() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test172");


    br.com.addvisor.model.Evaluate var0 = new br.com.addvisor.model.Evaluate();
    var0.setId((java.lang.Long)10L);
    var0.setId((java.lang.Long)0L);
    java.lang.Float var5 = var0.getNote();
    br.com.addvisor.model.Service var6 = new br.com.addvisor.model.Service();
    java.lang.String var7 = var6.toString();
    var0.setService(var6);
    var0.setId((java.lang.Long)(-1L));
    br.com.addvisor.model.Evaluate var11 = new br.com.addvisor.model.Evaluate();
    br.com.addvisor.model.State var12 = new br.com.addvisor.model.State();
    boolean var14 = var12.equals((java.lang.Object)(byte)100);
    var12.setUf("null\nnull\nnull");
    boolean var17 = var11.equals((java.lang.Object)var12);
    br.com.addvisor.model.Service var18 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var19 = new br.com.addvisor.model.User();
    boolean var21 = var19.equals((java.lang.Object)(-1L));
    java.lang.String var22 = var19.toString();
    java.lang.String var23 = var19.getPassword();
    var18.setUser(var19);
    br.com.addvisor.model.Address var25 = var18.getAddress();
    var11.setService(var18);
    br.com.addvisor.model.enums.ServiceCat var27 = var18.getCategory();
    br.com.addvisor.model.Address var28 = new br.com.addvisor.model.Address();
    var28.setId((java.lang.Long)0L);
    var18.setAddress(var28);
    boolean var32 = var0.equals((java.lang.Object)var18);
    var18.setId((java.lang.Long)(-1L));
    br.com.addvisor.model.User var35 = new br.com.addvisor.model.User();
    boolean var37 = var35.equals((java.lang.Object)(-1L));
    java.lang.String var38 = var35.toString();
    br.com.addvisor.model.Evaluate var39 = new br.com.addvisor.model.Evaluate();
    var39.setId((java.lang.Long)10L);
    var39.setId((java.lang.Long)0L);
    br.com.addvisor.model.User var44 = var39.getUser();
    boolean var45 = var35.equals((java.lang.Object)var39);
    java.lang.String var46 = var35.getPassword();
    var35.setId((java.lang.Long)0L);
    var35.setName("null\nnull\nnull");
    var18.setUser(var35);
    var35.setPhone("Service [id=1, name=Service [id=10, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null], description=null, tags=null, media=null, address=null\nnull\nnull, category=null, phones=null]");
    br.com.addvisor.model.Evaluate var54 = new br.com.addvisor.model.Evaluate();
    var54.setId((java.lang.Long)10L);
    var54.setId((java.lang.Long)0L);
    br.com.addvisor.model.Service var59 = var54.getService();
    br.com.addvisor.model.User var62 = new br.com.addvisor.model.User("Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]]", "User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.Long var63 = var62.getId();
    var62.setId((java.lang.Long)(-1L));
    var62.setPhone("null\nnull\nnull");
    java.lang.String var68 = var62.getEmail();
    var62.setName("User [id=null, name=null, email=User [id=null, name=null, email=null, password=null, phone=null, city=null], password=null, phone=null, city=null]");
    var54.setUser(var62);
    var62.setPhone("Evaluate [id=0, user=null, service=null, note=null, comment=null]");
    br.com.addvisor.model.City var74 = var62.getCity();
    br.com.addvisor.model.Evaluate var75 = new br.com.addvisor.model.Evaluate();
    var75.setId((java.lang.Long)10L);
    var75.setId((java.lang.Long)0L);
    br.com.addvisor.model.User var80 = var75.getUser();
    var75.setComment("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    var75.setComment("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    br.com.addvisor.model.Service var85 = new br.com.addvisor.model.Service();
    java.lang.String var86 = var85.toString();
    var85.setMedia((java.lang.Float)10.0f);
    var75.setService(var85);
    boolean var90 = var62.equals((java.lang.Object)var85);
    br.com.addvisor.model.Evaluate var93 = new br.com.addvisor.model.Evaluate(var35, var85, (java.lang.Float)1.0f, "Evaluate [id=0, user=null, service=Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null], note=null, comment=null]");
    java.lang.String var94 = var35.getName();
    var35.setEmail("Country [id=null, name=Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null], acronym=User [id=-1, name=null, email=null, password=21c96d96756cfeed7f71110d9cb1788b, phone=null\nnull\nnull, city=null]]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]"+ "'", var7.equals("Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var22.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var38.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var86 + "' != '" + "Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]"+ "'", var86.equals("Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var90 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var94 + "' != '" + "null\nnull\nnull"+ "'", var94.equals("null\nnull\nnull"));

  }

  public void test173() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test173");


    br.com.addvisor.model.Evaluate var0 = new br.com.addvisor.model.Evaluate();
    var0.setId((java.lang.Long)10L);
    var0.setId((java.lang.Long)0L);
    br.com.addvisor.model.User var5 = var0.getUser();
    var0.setComment("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    var0.setComment("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    br.com.addvisor.model.Service var10 = new br.com.addvisor.model.Service();
    java.lang.String var11 = var10.toString();
    var10.setMedia((java.lang.Float)10.0f);
    var0.setService(var10);
    var0.setNote((java.lang.Float)(-1.0f));
    br.com.addvisor.model.User var17 = new br.com.addvisor.model.User();
    java.lang.String var18 = var17.getEmail();
    br.com.addvisor.model.Address var19 = new br.com.addvisor.model.Address();
    java.lang.String var20 = var19.toString();
    br.com.addvisor.model.City var21 = new br.com.addvisor.model.City();
    var21.setName("hi!");
    var19.setCity(var21);
    br.com.addvisor.model.City var25 = new br.com.addvisor.model.City();
    var25.setName("hi!");
    var25.setName("null\nnull\nnull");
    br.com.addvisor.model.Address var30 = new br.com.addvisor.model.Address();
    java.lang.String var31 = var30.getComplement();
    java.lang.String var32 = var30.toString();
    boolean var33 = var25.equals((java.lang.Object)var32);
    br.com.addvisor.model.State var34 = new br.com.addvisor.model.State();
    var34.setId((java.lang.Long)1L);
    var34.setName("null\nnull\nnull");
    var34.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var41 = var34.getUf();
    var25.setState(var34);
    int var43 = var21.compareTo(var25);
    br.com.addvisor.model.Evaluate var44 = new br.com.addvisor.model.Evaluate();
    br.com.addvisor.model.State var45 = new br.com.addvisor.model.State();
    boolean var47 = var45.equals((java.lang.Object)(byte)100);
    var45.setUf("null\nnull\nnull");
    boolean var50 = var44.equals((java.lang.Object)var45);
    br.com.addvisor.model.Service var51 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var52 = new br.com.addvisor.model.User();
    boolean var54 = var52.equals((java.lang.Object)(-1L));
    java.lang.String var55 = var52.toString();
    java.lang.String var56 = var52.getPassword();
    var51.setUser(var52);
    br.com.addvisor.model.Address var58 = var51.getAddress();
    var44.setService(var51);
    br.com.addvisor.model.Service var60 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var61 = new br.com.addvisor.model.User();
    boolean var63 = var61.equals((java.lang.Object)(-1L));
    java.lang.String var64 = var61.toString();
    java.lang.String var65 = var61.getPassword();
    var60.setUser(var61);
    br.com.addvisor.model.Address var67 = var60.getAddress();
    java.lang.String var68 = var60.getName();
    var60.setId((java.lang.Long)1L);
    java.lang.Long var71 = var60.getId();
    var44.setService(var60);
    java.lang.String var73 = var60.toString();
    java.lang.String var74 = var60.getTags();
    var60.setName("Service [id=10, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]");
    boolean var77 = var21.equals((java.lang.Object)"Service [id=10, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]");
    var17.setCity(var21);
    boolean var79 = var0.equals((java.lang.Object)var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]"+ "'", var11.equals("Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "null\nnull\nnull"+ "'", var20.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "null\nnull\nnull"+ "'", var32.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == (-6));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var55.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var64 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var64.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var71 + "' != '" + 1L+ "'", var71.equals(1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var73 + "' != '" + "Service [id=1, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]"+ "'", var73.equals("Service [id=1, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == false);

  }

  public void test174() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test174");


    br.com.addvisor.model.Service var0 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var1 = new br.com.addvisor.model.User();
    boolean var3 = var1.equals((java.lang.Object)(-1L));
    java.lang.String var4 = var1.toString();
    java.lang.String var5 = var1.getPassword();
    var0.setUser(var1);
    br.com.addvisor.model.Address var7 = var0.getAddress();
    br.com.addvisor.model.enums.ServiceCat var8 = var0.getCategory();
    br.com.addvisor.model.Agenda var9 = new br.com.addvisor.model.Agenda();
    java.util.List var10 = var9.getNames();
    br.com.addvisor.model.Agenda var11 = new br.com.addvisor.model.Agenda();
    java.util.List var12 = var11.getNames();
    var9.setNames(var12);
    java.util.List var14 = var9.getNumbers();
    br.com.addvisor.model.Agenda var15 = new br.com.addvisor.model.Agenda();
    java.util.List var16 = var15.getNames();
    java.util.List var17 = var15.getNumbers();
    br.com.addvisor.model.Agenda var18 = new br.com.addvisor.model.Agenda();
    java.util.List var19 = var18.getNames();
    java.util.List var20 = var18.getNumbers();
    var15.setNames(var20);
    br.com.addvisor.model.Agenda var22 = new br.com.addvisor.model.Agenda();
    java.util.List var23 = var22.getNames();
    java.util.List var24 = var22.getNumbers();
    br.com.addvisor.model.Agenda var25 = new br.com.addvisor.model.Agenda();
    java.util.List var26 = var25.getNames();
    java.util.List var27 = var25.getNumbers();
    var22.setNames(var27);
    var15.setNames(var27);
    var9.setNumbers(var27);
    var0.setPhones(var27);
    java.lang.String var32 = var0.getDescription();
    br.com.addvisor.model.enums.ServiceCat var33 = var0.getCategory();
    java.lang.String var34 = var0.toString();
    br.com.addvisor.model.Agenda var35 = new br.com.addvisor.model.Agenda();
    java.util.List var36 = var35.getNames();
    br.com.addvisor.model.Agenda var37 = new br.com.addvisor.model.Agenda();
    java.util.List var38 = var37.getNames();
    var35.setNames(var38);
    java.util.List var40 = var35.getNumbers();
    br.com.addvisor.model.Agenda var41 = new br.com.addvisor.model.Agenda();
    java.util.List var42 = var41.getNames();
    java.util.List var43 = var41.getNumbers();
    br.com.addvisor.model.Agenda var44 = new br.com.addvisor.model.Agenda();
    java.util.List var45 = var44.getNames();
    java.util.List var46 = var44.getNumbers();
    var41.setNames(var46);
    br.com.addvisor.model.Agenda var48 = new br.com.addvisor.model.Agenda();
    java.util.List var49 = var48.getNames();
    java.util.List var50 = var48.getNumbers();
    br.com.addvisor.model.Agenda var51 = new br.com.addvisor.model.Agenda();
    java.util.List var52 = var51.getNames();
    java.util.List var53 = var51.getNumbers();
    var48.setNames(var53);
    var41.setNames(var53);
    var35.setNumbers(var53);
    var35.addContact("", "");
    br.com.addvisor.model.Agenda var60 = new br.com.addvisor.model.Agenda();
    java.util.List var61 = var60.getNames();
    java.util.List var62 = var60.getNumbers();
    br.com.addvisor.model.Agenda var63 = new br.com.addvisor.model.Agenda();
    java.util.List var64 = var63.getNames();
    java.util.List var65 = var63.getNumbers();
    var60.setNames(var65);
    br.com.addvisor.model.Agenda var67 = new br.com.addvisor.model.Agenda();
    java.util.List var68 = var67.getNames();
    java.util.List var69 = var67.getNumbers();
    br.com.addvisor.model.Agenda var70 = new br.com.addvisor.model.Agenda();
    java.util.List var71 = var70.getNames();
    java.util.List var72 = var70.getNumbers();
    var67.setNames(var72);
    var60.setNames(var72);
    br.com.addvisor.model.Agenda var75 = new br.com.addvisor.model.Agenda();
    java.util.List var76 = var75.getNames();
    java.util.List var77 = var75.getNumbers();
    var60.setNames(var77);
    br.com.addvisor.model.Service var79 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var80 = new br.com.addvisor.model.User();
    boolean var82 = var80.equals((java.lang.Object)(-1L));
    java.lang.String var83 = var80.toString();
    java.lang.String var84 = var80.getPassword();
    var79.setUser(var80);
    br.com.addvisor.model.Address var86 = var79.getAddress();
    java.util.List var87 = var79.getPhones();
    br.com.addvisor.model.Agenda var88 = new br.com.addvisor.model.Agenda();
    java.util.List var89 = var88.getNames();
    java.util.List var90 = var88.getNumbers();
    br.com.addvisor.model.Agenda var91 = new br.com.addvisor.model.Agenda();
    java.util.List var92 = var91.getNames();
    java.util.List var93 = var91.getNumbers();
    var88.setNames(var93);
    var79.setPhones(var93);
    var60.setNames(var93);
    var35.setNames(var93);
    var0.setPhones(var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var4.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=[]]"+ "'", var34.equals("Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var83 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var83.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);

  }

  public void test175() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test175");


    br.com.addvisor.model.Evaluate var0 = new br.com.addvisor.model.Evaluate();
    br.com.addvisor.model.State var1 = new br.com.addvisor.model.State();
    boolean var3 = var1.equals((java.lang.Object)(byte)100);
    var1.setUf("null\nnull\nnull");
    boolean var6 = var0.equals((java.lang.Object)var1);
    br.com.addvisor.model.Service var7 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var8 = new br.com.addvisor.model.User();
    boolean var10 = var8.equals((java.lang.Object)(-1L));
    java.lang.String var11 = var8.toString();
    java.lang.String var12 = var8.getPassword();
    var7.setUser(var8);
    br.com.addvisor.model.Address var14 = var7.getAddress();
    java.lang.String var15 = var7.getDescription();
    boolean var16 = var0.equals((java.lang.Object)var7);
    br.com.addvisor.model.Evaluate var17 = new br.com.addvisor.model.Evaluate();
    var17.setId((java.lang.Long)10L);
    var17.setId((java.lang.Long)0L);
    br.com.addvisor.model.User var22 = var17.getUser();
    java.lang.Long var23 = var17.getId();
    br.com.addvisor.model.Service var24 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var25 = new br.com.addvisor.model.User();
    boolean var27 = var25.equals((java.lang.Object)(-1L));
    java.lang.String var28 = var25.toString();
    java.lang.String var29 = var25.getPassword();
    var24.setUser(var25);
    br.com.addvisor.model.Address var31 = var24.getAddress();
    java.lang.String var32 = var24.getDescription();
    var17.setService(var24);
    boolean var34 = var7.equals((java.lang.Object)var24);
    br.com.addvisor.model.User var35 = new br.com.addvisor.model.User();
    boolean var37 = var35.equals((java.lang.Object)(-1L));
    java.lang.String var38 = var35.getDDD();
    var35.setPhone("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    boolean var41 = var24.equals((java.lang.Object)"User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    br.com.addvisor.model.User var44 = new br.com.addvisor.model.User("User [id=null, name=null, email=User [id=null, name=null, email=null, password=null, phone=null, city=null], password=null, phone=null, city=null]", "Country [id=null, name=null, acronym=null]");
    var24.setUser(var44);
    java.lang.String var46 = var24.getName();
    var24.setMedia((java.lang.Float)10.0f);
    br.com.addvisor.model.Evaluate var49 = new br.com.addvisor.model.Evaluate();
    br.com.addvisor.model.State var50 = new br.com.addvisor.model.State();
    boolean var52 = var50.equals((java.lang.Object)(byte)100);
    var50.setUf("null\nnull\nnull");
    boolean var55 = var49.equals((java.lang.Object)var50);
    br.com.addvisor.model.Service var56 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var57 = new br.com.addvisor.model.User();
    boolean var59 = var57.equals((java.lang.Object)(-1L));
    java.lang.String var60 = var57.toString();
    java.lang.String var61 = var57.getPassword();
    var56.setUser(var57);
    br.com.addvisor.model.Address var63 = var56.getAddress();
    java.lang.String var64 = var56.getDescription();
    boolean var65 = var49.equals((java.lang.Object)var56);
    br.com.addvisor.model.Evaluate var66 = new br.com.addvisor.model.Evaluate();
    var66.setId((java.lang.Long)10L);
    var66.setId((java.lang.Long)0L);
    br.com.addvisor.model.User var71 = var66.getUser();
    java.lang.Long var72 = var66.getId();
    br.com.addvisor.model.Service var73 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var74 = new br.com.addvisor.model.User();
    boolean var76 = var74.equals((java.lang.Object)(-1L));
    java.lang.String var77 = var74.toString();
    java.lang.String var78 = var74.getPassword();
    var73.setUser(var74);
    br.com.addvisor.model.Address var80 = var73.getAddress();
    java.lang.String var81 = var73.getDescription();
    var66.setService(var73);
    boolean var83 = var56.equals((java.lang.Object)var73);
    br.com.addvisor.model.User var84 = new br.com.addvisor.model.User();
    boolean var86 = var84.equals((java.lang.Object)(-1L));
    java.lang.String var87 = var84.getDDD();
    var84.setPhone("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    boolean var90 = var73.equals((java.lang.Object)"User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    var73.setName("null - null\nnull\nnull");
    java.lang.Long var93 = var73.getId();
    java.lang.Float var94 = var73.getMedia();
    boolean var95 = var24.equals((java.lang.Object)var73);
    br.com.addvisor.model.Address var96 = var24.getAddress();
    var24.setMedia((java.lang.Float)0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var11.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + 0L+ "'", var23.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var28.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var60.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var72 + "' != '" + 0L+ "'", var72.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var77 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var77.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var90 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var94);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var95 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var96);

  }

  public void test176() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test176");


    br.com.addvisor.model.State var0 = new br.com.addvisor.model.State();
    boolean var2 = var0.equals((java.lang.Object)(byte)100);
    var0.setUf("null\nnull\nnull");
    br.com.addvisor.model.State var5 = new br.com.addvisor.model.State();
    int var6 = var0.compareTo(var5);
    java.lang.String var7 = var5.getName();
    var5.setId((java.lang.Long)10L);
    br.com.addvisor.model.Country var10 = var5.getCountry();
    br.com.addvisor.model.Country var11 = var5.getCountry();
    java.lang.String var12 = var5.getName();
    br.com.addvisor.model.Country var13 = new br.com.addvisor.model.Country();
    java.lang.Integer var14 = var13.getId();
    java.lang.String var15 = var13.getName();
    java.lang.String var16 = var13.getName();
    var13.setId((java.lang.Integer)100);
    java.lang.String var19 = var13.getName();
    var13.setAcronym("Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]");
    var13.setId((java.lang.Integer)(-19));
    var5.setCountry(var13);
    var13.setAcronym("User [id=0, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var27 = var13.getAcronym();
    java.lang.String var28 = var13.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "User [id=0, name=null, email=null, password=null, phone=null, city=null]"+ "'", var27.equals("User [id=0, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "Country [id=-19, name=null, acronym=User [id=0, name=null, email=null, password=null, phone=null, city=null]]"+ "'", var28.equals("Country [id=-19, name=null, acronym=User [id=0, name=null, email=null, password=null, phone=null, city=null]]"));

  }

  public void test177() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test177");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.addvisor.model.enums.ServiceCat var1 = br.com.addvisor.model.enums.ServiceCat.getCategory("User [id=100, name=null, email=User [id=10, name=null, email=null, password=bab90b8667e900a415ffe18829d9e6f9, phone= - , city=null], password=469817e2fa792793ebc0bb601818134b, phone=null, city=null]");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test178() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test178");


    br.com.addvisor.model.Evaluate var0 = new br.com.addvisor.model.Evaluate();
    var0.setId((java.lang.Long)10L);
    var0.setId((java.lang.Long)0L);
    java.lang.Float var5 = var0.getNote();
    br.com.addvisor.model.Service var6 = var0.getService();
    br.com.addvisor.model.User var7 = var0.getUser();
    br.com.addvisor.model.Evaluate var8 = new br.com.addvisor.model.Evaluate();
    br.com.addvisor.model.State var9 = new br.com.addvisor.model.State();
    boolean var11 = var9.equals((java.lang.Object)(byte)100);
    var9.setUf("null\nnull\nnull");
    boolean var14 = var8.equals((java.lang.Object)var9);
    br.com.addvisor.model.Service var15 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var16 = new br.com.addvisor.model.User();
    boolean var18 = var16.equals((java.lang.Object)(-1L));
    java.lang.String var19 = var16.toString();
    java.lang.String var20 = var16.getPassword();
    var15.setUser(var16);
    br.com.addvisor.model.Address var22 = var15.getAddress();
    var8.setService(var15);
    br.com.addvisor.model.enums.ServiceCat var24 = var15.getCategory();
    br.com.addvisor.model.Address var25 = new br.com.addvisor.model.Address();
    var25.setId((java.lang.Long)0L);
    var15.setAddress(var25);
    java.lang.String var29 = var15.getName();
    java.lang.Long var30 = var15.getId();
    br.com.addvisor.model.Address var31 = new br.com.addvisor.model.Address();
    java.lang.String var32 = var31.getComplement();
    java.lang.String var33 = var31.toString();
    br.com.addvisor.model.City var34 = var31.getCity();
    br.com.addvisor.model.State var35 = new br.com.addvisor.model.State();
    var35.setId((java.lang.Long)1L);
    var35.setName("null\nnull\nnull");
    var35.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var42 = var35.getUf();
    boolean var43 = var31.equals((java.lang.Object)var35);
    java.lang.String var44 = var31.getLocation();
    var15.setAddress(var31);
    var0.setService(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var19.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "null\nnull\nnull"+ "'", var33.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);

  }

  public void test179() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test179");


    br.com.addvisor.model.Service var0 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var1 = new br.com.addvisor.model.User();
    boolean var3 = var1.equals((java.lang.Object)(-1L));
    java.lang.String var4 = var1.toString();
    java.lang.String var5 = var1.getPassword();
    var0.setUser(var1);
    br.com.addvisor.model.Address var7 = var0.getAddress();
    java.lang.String var8 = var0.getName();
    java.lang.String var9 = var0.getDescription();
    br.com.addvisor.model.User var10 = new br.com.addvisor.model.User();
    br.com.addvisor.model.State var11 = new br.com.addvisor.model.State();
    var11.setId((java.lang.Long)1L);
    var11.setName("null\nnull\nnull");
    var11.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var18 = var11.getUf();
    boolean var19 = var10.equals((java.lang.Object)var11);
    br.com.addvisor.model.Service var20 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var21 = new br.com.addvisor.model.User();
    boolean var23 = var21.equals((java.lang.Object)(-1L));
    java.lang.String var24 = var21.toString();
    java.lang.String var25 = var21.getPassword();
    var20.setUser(var21);
    br.com.addvisor.model.Address var27 = var20.getAddress();
    java.lang.String var28 = var20.getName();
    br.com.addvisor.model.City var29 = new br.com.addvisor.model.City();
    var29.setName("hi!");
    var29.setName("null\nnull\nnull");
    br.com.addvisor.model.Address var34 = new br.com.addvisor.model.Address();
    java.lang.String var35 = var34.getComplement();
    java.lang.String var36 = var34.toString();
    boolean var37 = var29.equals((java.lang.Object)var36);
    br.com.addvisor.model.State var38 = new br.com.addvisor.model.State();
    var38.setId((java.lang.Long)1L);
    var38.setName("null\nnull\nnull");
    var38.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var45 = var38.getUf();
    var29.setState(var38);
    boolean var47 = var20.equals((java.lang.Object)var29);
    br.com.addvisor.model.Evaluate var50 = new br.com.addvisor.model.Evaluate(var10, var20, (java.lang.Float)100.0f, "");
    var0.setUser(var10);
    br.com.addvisor.model.Evaluate var52 = new br.com.addvisor.model.Evaluate();
    var52.setId((java.lang.Long)10L);
    br.com.addvisor.model.Service var55 = var52.getService();
    br.com.addvisor.model.Evaluate var56 = new br.com.addvisor.model.Evaluate();
    var56.setId((java.lang.Long)10L);
    var56.setId((java.lang.Long)0L);
    br.com.addvisor.model.Service var61 = var56.getService();
    br.com.addvisor.model.User var62 = new br.com.addvisor.model.User();
    boolean var64 = var62.equals((java.lang.Object)(-1L));
    java.lang.String var65 = var62.toString();
    java.lang.String var66 = var62.getPassword();
    java.lang.String var67 = var62.getPhone();
    var56.setUser(var62);
    br.com.addvisor.model.Service var69 = new br.com.addvisor.model.Service();
    java.lang.String var70 = var69.toString();
    var69.setTags("User [id=-1, name=null, email=null, password=21c96d96756cfeed7f71110d9cb1788b, phone=null\nnull\nnull, city=null]");
    br.com.addvisor.model.Address var73 = var69.getAddress();
    var69.setDescription("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var76 = var69.getName();
    br.com.addvisor.model.Evaluate var79 = new br.com.addvisor.model.Evaluate(var62, var69, (java.lang.Float)1.0f, "");
    var52.setService(var69);
    java.lang.Float var81 = var69.getMedia();
    br.com.addvisor.model.Evaluate var84 = new br.com.addvisor.model.Evaluate(var10, var69, (java.lang.Float)100.0f, "Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]]");
    java.lang.Long var85 = var84.getId();
    var84.setNote((java.lang.Float)0.0f);
    java.lang.Float var88 = var84.getNote();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var4.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var24.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "null\nnull\nnull"+ "'", var36.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var65 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var65.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var70 + "' != '" + "Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]"+ "'", var70.equals("Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var88 + "' != '" + 0.0f+ "'", var88.equals(0.0f));

  }

  public void test180() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test180");


    br.com.addvisor.model.Address var4 = new br.com.addvisor.model.Address();
    java.lang.String var5 = var4.getComplement();
    java.lang.String var6 = var4.toString();
    java.lang.String var7 = var4.getComplement();
    br.com.addvisor.model.City var12 = new br.com.addvisor.model.City();
    var12.setName("hi!");
    var12.setName("null\nnull\nnull");
    br.com.addvisor.model.Address var17 = new br.com.addvisor.model.Address();
    java.lang.String var18 = var17.getComplement();
    java.lang.String var19 = var17.toString();
    boolean var20 = var12.equals((java.lang.Object)var19);
    br.com.addvisor.model.User var21 = new br.com.addvisor.model.User("hi!", "", "hi!", "User [id=null, name=null, email=null, password=null, phone=null, city=null]", var12);
    var4.setCity(var12);
    var4.setComplement("hi!");
    br.com.addvisor.model.City var25 = var4.getCity();
    br.com.addvisor.model.User var26 = new br.com.addvisor.model.User("null - Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]", "Evaluate [id=0, user=null, service=Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null], note=null, comment=Evaluate [id=0, user=null, service=null, note=null, comment=null]]", "null - Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]", "Evaluate [id=null, user=null, service=null, note=null, comment=]", var25);
    var26.setPassword("Evaluate [id=null, user=null, service=Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null], note=null, comment=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "null\nnull\nnull"+ "'", var6.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "null\nnull\nnull"+ "'", var19.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test181() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test181");


    br.com.addvisor.model.City var0 = new br.com.addvisor.model.City();
    var0.setName("hi!");
    var0.setName("null\nnull\nnull");
    br.com.addvisor.model.Address var5 = new br.com.addvisor.model.Address();
    java.lang.String var6 = var5.getComplement();
    java.lang.String var7 = var5.toString();
    boolean var8 = var0.equals((java.lang.Object)var7);
    br.com.addvisor.model.User var9 = new br.com.addvisor.model.User();
    br.com.addvisor.model.State var10 = new br.com.addvisor.model.State();
    var10.setId((java.lang.Long)1L);
    var10.setName("null\nnull\nnull");
    var10.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var17 = var10.getUf();
    boolean var18 = var9.equals((java.lang.Object)var10);
    var0.setState(var10);
    br.com.addvisor.model.Country var20 = new br.com.addvisor.model.Country();
    java.lang.Integer var21 = var20.getId();
    br.com.addvisor.model.Agenda var22 = new br.com.addvisor.model.Agenda();
    java.util.List var23 = var22.getNames();
    br.com.addvisor.model.Agenda var24 = new br.com.addvisor.model.Agenda();
    java.util.List var25 = var24.getNames();
    var22.setNames(var25);
    java.util.List var27 = var22.getNumbers();
    br.com.addvisor.model.Agenda var28 = new br.com.addvisor.model.Agenda();
    java.util.List var29 = var28.getNames();
    java.util.List var30 = var28.getNumbers();
    br.com.addvisor.model.Agenda var31 = new br.com.addvisor.model.Agenda();
    java.util.List var32 = var31.getNames();
    java.util.List var33 = var31.getNumbers();
    var28.setNames(var33);
    br.com.addvisor.model.Agenda var35 = new br.com.addvisor.model.Agenda();
    java.util.List var36 = var35.getNames();
    java.util.List var37 = var35.getNumbers();
    br.com.addvisor.model.Agenda var38 = new br.com.addvisor.model.Agenda();
    java.util.List var39 = var38.getNames();
    java.util.List var40 = var38.getNumbers();
    var35.setNames(var40);
    var28.setNames(var40);
    var22.setNumbers(var40);
    var22.addContact("", "");
    br.com.addvisor.model.Agenda var47 = new br.com.addvisor.model.Agenda();
    java.util.List var48 = var47.getNames();
    br.com.addvisor.model.Agenda var49 = new br.com.addvisor.model.Agenda();
    java.util.List var50 = var49.getNames();
    var47.setNames(var50);
    java.util.List var52 = var47.getNumbers();
    var22.setNames(var52);
    boolean var54 = var20.equals((java.lang.Object)var22);
    var20.setName("null\nnull\nnull");
    var10.setCountry(var20);
    br.com.addvisor.model.Country var58 = var10.getCountry();
    java.lang.String var59 = var10.getName();
    java.lang.String var60 = var10.getName();
    br.com.addvisor.model.Country var61 = var10.getCountry();
    var10.setUf("Evaluate [id=0, user=null, service=null, note=100.0, comment=null] - null");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "null\nnull\nnull"+ "'", var7.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var59 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var59.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var60.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);

  }

  public void test182() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test182");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.addvisor.model.enums.PriceCat var1 = br.com.addvisor.model.enums.PriceCat.valueOf("User [id=null, name=null, email=null, password=bab90b8667e900a415ffe18829d9e6f9, phone=, city=null]");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test183() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test183");


    br.com.addvisor.model.Address var0 = new br.com.addvisor.model.Address();
    java.lang.String var1 = var0.toString();
    br.com.addvisor.model.City var2 = new br.com.addvisor.model.City();
    var2.setName("hi!");
    var2.setName("null\nnull\nnull");
    var0.setCity(var2);
    var0.setLocation("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.Long var10 = var0.getId();
    java.lang.String var11 = var0.getLocation();
    java.lang.Long var12 = var0.getId();
    java.lang.String var13 = var0.getLocation();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "null\nnull\nnull"+ "'", var1.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var11.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var13.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));

  }

  public void test184() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test184");


    br.com.addvisor.model.Agenda var0 = new br.com.addvisor.model.Agenda();
    java.util.List var1 = var0.getNames();
    java.util.List var2 = var0.getNumbers();
    br.com.addvisor.model.Agenda var3 = new br.com.addvisor.model.Agenda();
    java.util.List var4 = var3.getNames();
    java.util.List var5 = var3.getNumbers();
    var0.setNames(var5);
    var0.addContact("null\nnull\nnull", "User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    var0.addContact("User [id=null, name=null, email=User [id=null, name=null, email=null, password=null, phone=null, city=null], password=null, phone=null, city=null]", " - ");
    java.util.List var13 = var0.getNames();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test185() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test185");


    br.com.addvisor.model.Evaluate var0 = new br.com.addvisor.model.Evaluate();
    var0.setId((java.lang.Long)10L);
    var0.setId((java.lang.Long)0L);
    java.lang.Float var5 = var0.getNote();
    br.com.addvisor.model.Service var6 = new br.com.addvisor.model.Service();
    java.lang.String var7 = var6.toString();
    var0.setService(var6);
    java.lang.String var9 = var6.toString();
    br.com.addvisor.model.enums.ServiceCat var10 = var6.getCategory();
    java.lang.Float var11 = var6.getMedia();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]"+ "'", var7.equals("Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]"+ "'", var9.equals("Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test186() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test186");


    br.com.addvisor.model.State var0 = new br.com.addvisor.model.State();
    boolean var2 = var0.equals((java.lang.Object)(byte)100);
    var0.setUf("null\nnull\nnull");
    java.lang.String var5 = var0.getName();
    br.com.addvisor.model.Country var6 = var0.getCountry();
    java.lang.String var7 = var0.getName();
    br.com.addvisor.model.Evaluate var8 = new br.com.addvisor.model.Evaluate();
    var8.setId((java.lang.Long)10L);
    var8.setId((java.lang.Long)0L);
    var8.setComment("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    br.com.addvisor.model.Agenda var15 = new br.com.addvisor.model.Agenda();
    java.util.List var16 = var15.getNames();
    br.com.addvisor.model.Agenda var17 = new br.com.addvisor.model.Agenda();
    java.util.List var18 = var17.getNames();
    var15.setNames(var18);
    java.util.List var20 = var15.getNumbers();
    boolean var21 = var8.equals((java.lang.Object)var15);
    br.com.addvisor.model.Agenda var22 = new br.com.addvisor.model.Agenda();
    java.util.List var23 = var22.getNames();
    br.com.addvisor.model.Agenda var24 = new br.com.addvisor.model.Agenda();
    java.util.List var25 = var24.getNames();
    var22.setNames(var25);
    java.util.List var27 = var22.getNumbers();
    br.com.addvisor.model.Agenda var28 = new br.com.addvisor.model.Agenda();
    java.util.List var29 = var28.getNames();
    java.util.List var30 = var28.getNumbers();
    br.com.addvisor.model.Agenda var31 = new br.com.addvisor.model.Agenda();
    java.util.List var32 = var31.getNames();
    java.util.List var33 = var31.getNumbers();
    var28.setNames(var33);
    br.com.addvisor.model.Agenda var35 = new br.com.addvisor.model.Agenda();
    java.util.List var36 = var35.getNames();
    java.util.List var37 = var35.getNumbers();
    br.com.addvisor.model.Agenda var38 = new br.com.addvisor.model.Agenda();
    java.util.List var39 = var38.getNames();
    java.util.List var40 = var38.getNumbers();
    var35.setNames(var40);
    var28.setNames(var40);
    var22.setNumbers(var40);
    var22.addContact("", "");
    br.com.addvisor.model.Agenda var47 = new br.com.addvisor.model.Agenda();
    java.util.List var48 = var47.getNames();
    br.com.addvisor.model.Agenda var49 = new br.com.addvisor.model.Agenda();
    java.util.List var50 = var49.getNames();
    var47.setNames(var50);
    java.util.List var52 = var47.getNumbers();
    var22.setNames(var52);
    br.com.addvisor.model.Agenda var54 = new br.com.addvisor.model.Agenda();
    java.util.List var55 = var54.getNames();
    br.com.addvisor.model.Agenda var56 = new br.com.addvisor.model.Agenda();
    java.util.List var57 = var56.getNames();
    var54.setNames(var57);
    var22.setNames(var57);
    var15.setNumbers(var57);
    br.com.addvisor.model.Agenda var61 = new br.com.addvisor.model.Agenda();
    java.util.List var62 = var61.getNames();
    java.util.List var63 = var61.getNumbers();
    var61.addContact("User [id=-1, name=null, email=null, password=21c96d96756cfeed7f71110d9cb1788b, phone=null\nnull\nnull, city=null]", "Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]");
    br.com.addvisor.model.Evaluate var67 = new br.com.addvisor.model.Evaluate();
    var67.setId((java.lang.Long)10L);
    var67.setId((java.lang.Long)0L);
    var67.setComment("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    br.com.addvisor.model.Agenda var74 = new br.com.addvisor.model.Agenda();
    java.util.List var75 = var74.getNames();
    br.com.addvisor.model.Agenda var76 = new br.com.addvisor.model.Agenda();
    java.util.List var77 = var76.getNames();
    var74.setNames(var77);
    java.util.List var79 = var74.getNumbers();
    boolean var80 = var67.equals((java.lang.Object)var74);
    java.util.List var81 = var74.getNumbers();
    var61.setNames(var81);
    br.com.addvisor.model.Agenda var83 = new br.com.addvisor.model.Agenda();
    java.util.Map var84 = var83.getContacts();
    var61.setContacts(var84);
    var15.setContacts(var84);
    boolean var87 = var0.equals((java.lang.Object)var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == false);

  }

  public void test187() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test187");


    br.com.addvisor.model.State var0 = new br.com.addvisor.model.State();
    var0.setId((java.lang.Long)1L);
    var0.setName("null\nnull\nnull");
    var0.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var7 = var0.getUf();
    java.lang.String var8 = var0.getName();
    br.com.addvisor.model.Country var9 = new br.com.addvisor.model.Country();
    java.lang.String var10 = var9.getAcronym();
    boolean var11 = var0.equals((java.lang.Object)var9);
    java.lang.String var12 = var9.getAcronym();
    var9.setAcronym("User [id=-1, name=null, email=null, password=21c96d96756cfeed7f71110d9cb1788b, phone=null\nnull\nnull, city=null]");
    java.lang.String var15 = var9.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var8.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test188() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test188");


    br.com.addvisor.model.Service var0 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var1 = new br.com.addvisor.model.User();
    boolean var3 = var1.equals((java.lang.Object)(-1L));
    java.lang.String var4 = var1.toString();
    java.lang.String var5 = var1.getPassword();
    var0.setUser(var1);
    br.com.addvisor.model.Address var7 = var0.getAddress();
    java.lang.String var8 = var0.getName();
    var0.setId((java.lang.Long)1L);
    java.lang.Long var11 = var0.getId();
    java.util.List var12 = var0.getPhones();
    java.lang.Long var13 = var0.getId();
    java.util.List var14 = var0.getPhones();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var4.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + 1L+ "'", var11.equals(1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + 1L+ "'", var13.equals(1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test189() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test189");


    br.com.addvisor.model.Country var0 = new br.com.addvisor.model.Country();
    java.lang.Integer var1 = var0.getId();
    java.lang.String var2 = var0.getName();
    java.lang.String var3 = var0.getName();
    var0.setId((java.lang.Integer)100);
    var0.setAcronym("hi!");
    java.lang.String var8 = var0.toString();
    java.lang.String var9 = var0.toString();
    var0.setName("Evaluate [id=0, user=User [id=null, name=null, email=null, password=null, phone=null, city=null], service=Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null], note=null, comment=null]");
    java.lang.String var12 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Country [id=100, name=null, acronym=hi!]"+ "'", var8.equals("Country [id=100, name=null, acronym=hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Country [id=100, name=null, acronym=hi!]"+ "'", var9.equals("Country [id=100, name=null, acronym=hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Country [id=100, name=Evaluate [id=0, user=User [id=null, name=null, email=null, password=null, phone=null, city=null], service=Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null], note=null, comment=null], acronym=hi!]"+ "'", var12.equals("Country [id=100, name=Evaluate [id=0, user=User [id=null, name=null, email=null, password=null, phone=null, city=null], service=Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null], note=null, comment=null], acronym=hi!]"));

  }

  public void test190() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test190");


    br.com.addvisor.model.Service var0 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var1 = new br.com.addvisor.model.User();
    boolean var3 = var1.equals((java.lang.Object)(-1L));
    java.lang.String var4 = var1.toString();
    java.lang.String var5 = var1.getPassword();
    var0.setUser(var1);
    br.com.addvisor.model.Address var7 = var0.getAddress();
    br.com.addvisor.model.Address var8 = new br.com.addvisor.model.Address();
    java.lang.String var9 = var8.getComplement();
    java.lang.String var10 = var8.toString();
    br.com.addvisor.model.City var11 = var8.getCity();
    br.com.addvisor.model.State var12 = new br.com.addvisor.model.State();
    var12.setId((java.lang.Long)1L);
    var12.setName("null\nnull\nnull");
    var12.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var19 = var12.getUf();
    boolean var20 = var8.equals((java.lang.Object)var12);
    var0.setAddress(var8);
    var0.setTags("Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]]");
    java.lang.String var24 = var0.getDescription();
    var0.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    br.com.addvisor.model.User var27 = var0.getUser();
    var0.setId((java.lang.Long)0L);
    var0.setName("Service [id=null, name=null, description=null, tags=null, media=1.0, address=null, category=null, phones=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var4.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "null\nnull\nnull"+ "'", var10.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test191() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test191");


    br.com.addvisor.model.Address var0 = new br.com.addvisor.model.Address();
    java.lang.String var1 = var0.getComplement();
    java.lang.String var2 = var0.toString();
    br.com.addvisor.model.City var3 = var0.getCity();
    java.lang.String var4 = var0.getLocation();
    var0.setLocation("Evaluate [id=null, user=User [id=100, name=null, email=null, password=null, phone=null, city=null\nnull\nnull], service=Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null], note=0.0, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]]");
    java.lang.Long var7 = var0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "null\nnull\nnull"+ "'", var2.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test192() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test192");


    br.com.addvisor.model.User var0 = new br.com.addvisor.model.User();
    br.com.addvisor.model.State var1 = new br.com.addvisor.model.State();
    var1.setId((java.lang.Long)1L);
    var1.setName("null\nnull\nnull");
    var1.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var8 = var1.getUf();
    boolean var9 = var0.equals((java.lang.Object)var1);
    br.com.addvisor.model.Country var10 = var1.getCountry();
    var1.setUf("Us");
    java.lang.Long var13 = var1.getId();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + 1L+ "'", var13.equals(1L));

  }

  public void test193() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test193");


    br.com.addvisor.model.City var2 = new br.com.addvisor.model.City();
    br.com.addvisor.model.Address var3 = new br.com.addvisor.model.Address("null\nnull\nnull", "Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]]", var2);
    br.com.addvisor.model.State var4 = new br.com.addvisor.model.State();
    boolean var6 = var4.equals((java.lang.Object)(byte)100);
    var4.setUf("null\nnull\nnull");
    br.com.addvisor.model.State var9 = new br.com.addvisor.model.State();
    int var10 = var4.compareTo(var9);
    var9.setName("");
    var2.setState(var9);
    var9.setId((java.lang.Long)100L);
    br.com.addvisor.model.State var16 = new br.com.addvisor.model.State();
    boolean var18 = var16.equals((java.lang.Object)(byte)100);
    var16.setUf("null\nnull\nnull");
    br.com.addvisor.model.State var21 = new br.com.addvisor.model.State();
    int var22 = var16.compareTo(var21);
    var21.setName("");
    int var25 = var9.compareTo(var21);
    br.com.addvisor.model.State var26 = new br.com.addvisor.model.State();
    var26.setId((java.lang.Long)1L);
    br.com.addvisor.model.State var29 = new br.com.addvisor.model.State();
    var29.setId((java.lang.Long)1L);
    var29.setName("null\nnull\nnull");
    var29.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var36 = var29.getUf();
    java.lang.String var37 = var29.getName();
    br.com.addvisor.model.Country var38 = new br.com.addvisor.model.Country();
    java.lang.String var39 = var38.getAcronym();
    boolean var40 = var29.equals((java.lang.Object)var38);
    var26.setCountry(var38);
    var21.setCountry(var38);
    java.lang.String var43 = var38.toString();
    var38.setId((java.lang.Integer)7);
    java.lang.Integer var46 = var38.getId();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var37.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "Country [id=null, name=null, acronym=null]"+ "'", var43.equals("Country [id=null, name=null, acronym=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + 7+ "'", var46.equals(7));

  }

  public void test194() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test194");


    br.com.addvisor.model.Evaluate var0 = new br.com.addvisor.model.Evaluate();
    br.com.addvisor.model.Service var1 = var0.getService();
    br.com.addvisor.model.City var4 = new br.com.addvisor.model.City();
    br.com.addvisor.model.Address var5 = new br.com.addvisor.model.Address("null\nnull\nnull", "Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]]", var4);
    br.com.addvisor.model.State var6 = new br.com.addvisor.model.State();
    boolean var8 = var6.equals((java.lang.Object)(byte)100);
    var6.setUf("null\nnull\nnull");
    br.com.addvisor.model.State var11 = new br.com.addvisor.model.State();
    int var12 = var6.compareTo(var11);
    var11.setName("");
    var4.setState(var11);
    var11.setId((java.lang.Long)100L);
    br.com.addvisor.model.State var18 = new br.com.addvisor.model.State();
    boolean var20 = var18.equals((java.lang.Object)(byte)100);
    var18.setUf("null\nnull\nnull");
    br.com.addvisor.model.State var23 = new br.com.addvisor.model.State();
    int var24 = var18.compareTo(var23);
    var23.setName("");
    int var27 = var11.compareTo(var23);
    boolean var28 = var0.equals((java.lang.Object)var11);
    br.com.addvisor.model.User var31 = new br.com.addvisor.model.User("User [id=null, name=null, email=User [id=null, name=null, email=null, password=null, phone=null, city=null], password=null, phone=null, city=null]", "");
    var0.setUser(var31);
    br.com.addvisor.model.Service var33 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var34 = new br.com.addvisor.model.User();
    boolean var36 = var34.equals((java.lang.Object)(-1L));
    java.lang.String var37 = var34.toString();
    java.lang.String var38 = var34.getPassword();
    var33.setUser(var34);
    br.com.addvisor.model.Address var40 = var33.getAddress();
    br.com.addvisor.model.User var41 = new br.com.addvisor.model.User();
    boolean var43 = var41.equals((java.lang.Object)(-1L));
    boolean var45 = var41.equals((java.lang.Object)100.0d);
    var33.setUser(var41);
    br.com.addvisor.model.User var47 = var33.getUser();
    var0.setUser(var47);
    br.com.addvisor.model.User var49 = new br.com.addvisor.model.User();
    br.com.addvisor.model.State var50 = new br.com.addvisor.model.State();
    var50.setId((java.lang.Long)1L);
    var50.setName("null\nnull\nnull");
    var50.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var57 = var50.getUf();
    boolean var58 = var49.equals((java.lang.Object)var50);
    var49.setId((java.lang.Long)0L);
    br.com.addvisor.model.Service var61 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var62 = new br.com.addvisor.model.User();
    boolean var64 = var62.equals((java.lang.Object)(-1L));
    java.lang.String var65 = var62.toString();
    java.lang.String var66 = var62.getPassword();
    var61.setUser(var62);
    br.com.addvisor.model.Address var68 = var61.getAddress();
    java.lang.String var69 = var61.getName();
    var61.setName("Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]]");
    java.lang.String var72 = var61.getName();
    br.com.addvisor.model.Evaluate var75 = new br.com.addvisor.model.Evaluate(var49, var61, (java.lang.Float)(-1.0f), "Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]]");
    var61.setDescription("User [id=-1, name=null, email=null, password=21c96d96756cfeed7f71110d9cb1788b, phone=null\nnull\nnull, city=null]");
    java.lang.String var78 = var61.getDescription();
    br.com.addvisor.model.Evaluate var81 = new br.com.addvisor.model.Evaluate(var47, var61, (java.lang.Float)10.0f, "User [id=10, name=null, email=null, password=bab90b8667e900a415ffe18829d9e6f9, phone= - , city=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var37.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var65 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var65.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var72 + "' != '" + "Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]]"+ "'", var72.equals("Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var78 + "' != '" + "User [id=-1, name=null, email=null, password=21c96d96756cfeed7f71110d9cb1788b, phone=null\nnull\nnull, city=null]"+ "'", var78.equals("User [id=-1, name=null, email=null, password=21c96d96756cfeed7f71110d9cb1788b, phone=null\nnull\nnull, city=null]"));

  }

  public void test195() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test195");


    br.com.addvisor.model.State var0 = new br.com.addvisor.model.State();
    boolean var2 = var0.equals((java.lang.Object)(byte)100);
    java.lang.String var3 = var0.toString();
    br.com.addvisor.model.Country var4 = var0.getCountry();
    br.com.addvisor.model.Country var5 = var0.getCountry();
    java.lang.String var6 = var0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "null - null"+ "'", var3.equals("null - null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test196() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test196");


    br.com.addvisor.model.Evaluate var0 = new br.com.addvisor.model.Evaluate();
    var0.setId((java.lang.Long)10L);
    var0.setId((java.lang.Long)0L);
    br.com.addvisor.model.User var5 = var0.getUser();
    var0.setComment("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    var0.setComment("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.Float var10 = var0.getNote();
    br.com.addvisor.model.User var11 = new br.com.addvisor.model.User();
    boolean var13 = var11.equals((java.lang.Object)(-1L));
    java.lang.String var14 = var11.toString();
    br.com.addvisor.model.Evaluate var15 = new br.com.addvisor.model.Evaluate();
    var15.setId((java.lang.Long)10L);
    var15.setId((java.lang.Long)0L);
    br.com.addvisor.model.User var20 = var15.getUser();
    boolean var21 = var11.equals((java.lang.Object)var15);
    java.lang.String var22 = var11.getPassword();
    var0.setUser(var11);
    br.com.addvisor.model.Evaluate var24 = new br.com.addvisor.model.Evaluate();
    var24.setId((java.lang.Long)10L);
    var24.setId((java.lang.Long)0L);
    br.com.addvisor.model.User var29 = var24.getUser();
    java.lang.Long var30 = var24.getId();
    br.com.addvisor.model.Service var31 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var32 = new br.com.addvisor.model.User();
    boolean var34 = var32.equals((java.lang.Object)(-1L));
    java.lang.String var35 = var32.toString();
    java.lang.String var36 = var32.getPassword();
    var31.setUser(var32);
    br.com.addvisor.model.Address var38 = var31.getAddress();
    java.lang.String var39 = var31.getDescription();
    var24.setService(var31);
    var31.setId((java.lang.Long)1L);
    var0.setService(var31);
    java.lang.String var44 = var31.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var14.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + 0L+ "'", var30.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var35.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);

  }

  public void test197() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test197");


    br.com.addvisor.model.Evaluate var0 = new br.com.addvisor.model.Evaluate();
    br.com.addvisor.model.State var1 = new br.com.addvisor.model.State();
    boolean var3 = var1.equals((java.lang.Object)(byte)100);
    var1.setUf("null\nnull\nnull");
    boolean var6 = var0.equals((java.lang.Object)var1);
    br.com.addvisor.model.Service var7 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var8 = new br.com.addvisor.model.User();
    boolean var10 = var8.equals((java.lang.Object)(-1L));
    java.lang.String var11 = var8.toString();
    java.lang.String var12 = var8.getPassword();
    var7.setUser(var8);
    br.com.addvisor.model.Address var14 = var7.getAddress();
    java.lang.String var15 = var7.getDescription();
    boolean var16 = var0.equals((java.lang.Object)var7);
    br.com.addvisor.model.Evaluate var17 = new br.com.addvisor.model.Evaluate();
    var17.setId((java.lang.Long)10L);
    var17.setId((java.lang.Long)0L);
    br.com.addvisor.model.User var22 = var17.getUser();
    java.lang.Long var23 = var17.getId();
    br.com.addvisor.model.Service var24 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var25 = new br.com.addvisor.model.User();
    boolean var27 = var25.equals((java.lang.Object)(-1L));
    java.lang.String var28 = var25.toString();
    java.lang.String var29 = var25.getPassword();
    var24.setUser(var25);
    br.com.addvisor.model.Address var31 = var24.getAddress();
    java.lang.String var32 = var24.getDescription();
    var17.setService(var24);
    boolean var34 = var7.equals((java.lang.Object)var24);
    var24.setName("");
    br.com.addvisor.model.User var37 = new br.com.addvisor.model.User();
    boolean var39 = var37.equals((java.lang.Object)(-1L));
    boolean var41 = var37.equals((java.lang.Object)100.0d);
    var37.setEmail("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var44 = var37.toString();
    var37.setEmail("Evaluate [id=0, user=null, service=null, note=null, comment=null]");
    boolean var47 = var24.equals((java.lang.Object)var37);
    var24.setTags("User [id=null, name=null, email=null, password=428e147830819130e93707f1ce3a3cdb, phone=null, city=null]");
    java.lang.String var50 = var24.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var11.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + 0L+ "'", var23.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var28.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "User [id=null, name=null, email=User [id=null, name=null, email=null, password=null, phone=null, city=null], password=null, phone=null, city=null]"+ "'", var44.equals("User [id=null, name=null, email=User [id=null, name=null, email=null, password=null, phone=null, city=null], password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);

  }

  public void test198() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test198");


    br.com.addvisor.model.User var0 = new br.com.addvisor.model.User();
    boolean var2 = var0.equals((java.lang.Object)(-1L));
    java.lang.String var3 = var0.toString();
    br.com.addvisor.model.Evaluate var4 = new br.com.addvisor.model.Evaluate();
    var4.setId((java.lang.Long)10L);
    var4.setId((java.lang.Long)0L);
    br.com.addvisor.model.User var9 = var4.getUser();
    boolean var10 = var0.equals((java.lang.Object)var4);
    java.lang.String var11 = var0.getPassword();
    var0.setId((java.lang.Long)100L);
    br.com.addvisor.model.Address var14 = new br.com.addvisor.model.Address();
    java.lang.String var15 = var14.getComplement();
    java.lang.String var16 = var14.toString();
    boolean var17 = var0.equals((java.lang.Object)var14);
    java.lang.String var18 = var0.getName();
    var0.setId((java.lang.Long)1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var3.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "null\nnull\nnull"+ "'", var16.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

  public void test199() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test199");


    br.com.addvisor.model.Service var0 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var1 = new br.com.addvisor.model.User();
    boolean var3 = var1.equals((java.lang.Object)(-1L));
    java.lang.String var4 = var1.toString();
    java.lang.String var5 = var1.getPassword();
    var0.setUser(var1);
    br.com.addvisor.model.Address var7 = var0.getAddress();
    br.com.addvisor.model.enums.ServiceCat var8 = var0.getCategory();
    br.com.addvisor.model.Agenda var9 = new br.com.addvisor.model.Agenda();
    java.util.List var10 = var9.getNames();
    br.com.addvisor.model.Agenda var11 = new br.com.addvisor.model.Agenda();
    java.util.List var12 = var11.getNames();
    var9.setNames(var12);
    java.util.List var14 = var9.getNumbers();
    br.com.addvisor.model.Agenda var15 = new br.com.addvisor.model.Agenda();
    java.util.List var16 = var15.getNames();
    java.util.List var17 = var15.getNumbers();
    br.com.addvisor.model.Agenda var18 = new br.com.addvisor.model.Agenda();
    java.util.List var19 = var18.getNames();
    java.util.List var20 = var18.getNumbers();
    var15.setNames(var20);
    br.com.addvisor.model.Agenda var22 = new br.com.addvisor.model.Agenda();
    java.util.List var23 = var22.getNames();
    java.util.List var24 = var22.getNumbers();
    br.com.addvisor.model.Agenda var25 = new br.com.addvisor.model.Agenda();
    java.util.List var26 = var25.getNames();
    java.util.List var27 = var25.getNumbers();
    var22.setNames(var27);
    var15.setNames(var27);
    var9.setNumbers(var27);
    var0.setPhones(var27);
    java.lang.String var32 = var0.getDescription();
    br.com.addvisor.model.User var35 = new br.com.addvisor.model.User("Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]]", "User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.Long var36 = var35.getId();
    var35.setId((java.lang.Long)(-1L));
    var35.setPhone("null\nnull\nnull");
    java.lang.String var41 = var35.getEmail();
    var0.setUser(var35);
    var35.setId((java.lang.Long)0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var4.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);

  }

  public void test200() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test200");


    br.com.addvisor.model.User var0 = new br.com.addvisor.model.User();
    br.com.addvisor.model.State var1 = new br.com.addvisor.model.State();
    var1.setId((java.lang.Long)1L);
    var1.setName("null\nnull\nnull");
    var1.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var8 = var1.getUf();
    boolean var9 = var0.equals((java.lang.Object)var1);
    br.com.addvisor.model.Service var10 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var11 = new br.com.addvisor.model.User();
    boolean var13 = var11.equals((java.lang.Object)(-1L));
    java.lang.String var14 = var11.toString();
    java.lang.String var15 = var11.getPassword();
    var10.setUser(var11);
    br.com.addvisor.model.Address var17 = var10.getAddress();
    java.lang.String var18 = var10.getName();
    br.com.addvisor.model.City var19 = new br.com.addvisor.model.City();
    var19.setName("hi!");
    var19.setName("null\nnull\nnull");
    br.com.addvisor.model.Address var24 = new br.com.addvisor.model.Address();
    java.lang.String var25 = var24.getComplement();
    java.lang.String var26 = var24.toString();
    boolean var27 = var19.equals((java.lang.Object)var26);
    br.com.addvisor.model.State var28 = new br.com.addvisor.model.State();
    var28.setId((java.lang.Long)1L);
    var28.setName("null\nnull\nnull");
    var28.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var35 = var28.getUf();
    var19.setState(var28);
    boolean var37 = var10.equals((java.lang.Object)var19);
    br.com.addvisor.model.Evaluate var40 = new br.com.addvisor.model.Evaluate(var0, var10, (java.lang.Float)100.0f, "");
    br.com.addvisor.model.User var41 = new br.com.addvisor.model.User();
    boolean var43 = var41.equals((java.lang.Object)(-1L));
    java.lang.String var44 = var41.getDDD();
    var41.setPhone("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    br.com.addvisor.model.Address var47 = new br.com.addvisor.model.Address();
    java.lang.String var48 = var47.toString();
    br.com.addvisor.model.City var49 = new br.com.addvisor.model.City();
    var49.setName("hi!");
    var49.setName("null\nnull\nnull");
    var47.setCity(var49);
    var41.setCity(var49);
    var40.setUser(var41);
    var40.setComment("Evaluate [id=0, user=null, service=Service [id=null, name=null, description=null, tags=null, media=null, address=null\nnull\nnull, category=null, phones=null], note=0.0, comment=null]");
    br.com.addvisor.model.Service var59 = var40.getService();
    java.lang.Float var60 = var59.getMedia();
    java.lang.String var61 = var59.getTags();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var14.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "null\nnull\nnull"+ "'", var26.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "null\nnull\nnull"+ "'", var48.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);

  }

  public void test201() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test201");


    br.com.addvisor.model.State var0 = new br.com.addvisor.model.State();
    boolean var2 = var0.equals((java.lang.Object)(byte)100);
    var0.setUf("null\nnull\nnull");
    java.lang.String var5 = var0.getName();
    br.com.addvisor.model.Country var6 = var0.getCountry();
    br.com.addvisor.model.Country var7 = new br.com.addvisor.model.Country();
    var7.setId((java.lang.Integer)100);
    java.lang.String var10 = var7.getAcronym();
    var7.setAcronym("User [id=null, name=null, email=null, password=null, phone=null, city=null] - null");
    var0.setCountry(var7);
    br.com.addvisor.model.Country var14 = var0.getCountry();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test202() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test202");


    br.com.addvisor.model.User var0 = new br.com.addvisor.model.User();
    boolean var2 = var0.equals((java.lang.Object)(-1L));
    java.lang.String var3 = var0.toString();
    java.lang.String var4 = var0.getPassword();
    java.lang.String var5 = var0.getName();
    java.lang.String var6 = var0.getPassword();
    java.lang.String var7 = var0.getName();
    br.com.addvisor.model.Service var8 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var9 = new br.com.addvisor.model.User();
    boolean var11 = var9.equals((java.lang.Object)(-1L));
    java.lang.String var12 = var9.toString();
    java.lang.String var13 = var9.getPassword();
    var8.setUser(var9);
    br.com.addvisor.model.Address var15 = var8.getAddress();
    java.lang.String var16 = var8.getName();
    br.com.addvisor.model.Address var17 = var8.getAddress();
    br.com.addvisor.model.User var18 = new br.com.addvisor.model.User();
    boolean var20 = var18.equals((java.lang.Object)(-1L));
    java.lang.String var21 = var18.toString();
    br.com.addvisor.model.Evaluate var22 = new br.com.addvisor.model.Evaluate();
    var22.setId((java.lang.Long)10L);
    var22.setId((java.lang.Long)0L);
    br.com.addvisor.model.User var27 = var22.getUser();
    boolean var28 = var18.equals((java.lang.Object)var22);
    java.lang.String var29 = var18.getPassword();
    var18.setId((java.lang.Long)(-1L));
    java.lang.String var32 = var18.getPhone();
    var8.setUser(var18);
    br.com.addvisor.model.Evaluate var36 = new br.com.addvisor.model.Evaluate(var0, var8, (java.lang.Float)10.0f, "User [id=null, name=null, email=null, password=null, phone=null, city=null] - null");
    br.com.addvisor.model.Address var37 = new br.com.addvisor.model.Address();
    java.lang.String var38 = var37.getComplement();
    java.lang.String var39 = var37.toString();
    var37.setComplement("Service [id=null, name=null, description=null, tags=null, media=null, address=null\nnull\nnull, category=null, phones=null]");
    var8.setAddress(var37);
    java.lang.String var43 = var37.getLocation();
    var37.setId((java.lang.Long)(-1L));
    var37.setId((java.lang.Long)0L);
    var37.setComplement("User [id=10, name=null, email=null, password=bab90b8667e900a415ffe18829d9e6f9, phone=null - null, city=null]");
    var37.setId((java.lang.Long)(-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var3.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var12.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var21.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "null\nnull\nnull"+ "'", var39.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);

  }

  public void test203() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test203");


    br.com.addvisor.model.User var0 = new br.com.addvisor.model.User();
    boolean var2 = var0.equals((java.lang.Object)(-1L));
    java.lang.String var3 = var0.toString();
    br.com.addvisor.model.Evaluate var4 = new br.com.addvisor.model.Evaluate();
    var4.setId((java.lang.Long)10L);
    var4.setId((java.lang.Long)0L);
    br.com.addvisor.model.User var9 = var4.getUser();
    boolean var10 = var0.equals((java.lang.Object)var4);
    var0.setEmail("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    var0.setPhone("Evaluate [id=-1, user=User [id=null, name=null, email=null, password=null, phone=null, city=null], service=Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null], note=null, comment=null]");
    br.com.addvisor.model.Service var15 = new br.com.addvisor.model.Service();
    java.lang.Float var16 = var15.getMedia();
    var15.setDescription("Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]");
    br.com.addvisor.model.Evaluate var21 = new br.com.addvisor.model.Evaluate(var0, var15, (java.lang.Float)0.0f, "null\nnull\nnull");
    br.com.addvisor.model.User var22 = var21.getUser();
    br.com.addvisor.model.Service var23 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var24 = new br.com.addvisor.model.User();
    boolean var26 = var24.equals((java.lang.Object)(-1L));
    java.lang.String var27 = var24.toString();
    java.lang.String var28 = var24.getPassword();
    var23.setUser(var24);
    br.com.addvisor.model.Address var30 = var23.getAddress();
    java.lang.String var31 = var23.getName();
    var23.setName("Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]]");
    java.lang.String var34 = var23.getName();
    br.com.addvisor.model.User var35 = var23.getUser();
    boolean var36 = var22.equals((java.lang.Object)var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var3.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var27.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]]"+ "'", var34.equals("Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);

  }

  public void test204() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test204");


    br.com.addvisor.model.Service var0 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var1 = new br.com.addvisor.model.User();
    boolean var3 = var1.equals((java.lang.Object)(-1L));
    java.lang.String var4 = var1.toString();
    java.lang.String var5 = var1.getPassword();
    var0.setUser(var1);
    br.com.addvisor.model.Address var7 = var0.getAddress();
    br.com.addvisor.model.User var8 = new br.com.addvisor.model.User();
    boolean var10 = var8.equals((java.lang.Object)(-1L));
    boolean var12 = var8.equals((java.lang.Object)100.0d);
    var0.setUser(var8);
    br.com.addvisor.model.Service var14 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var15 = new br.com.addvisor.model.User();
    boolean var17 = var15.equals((java.lang.Object)(-1L));
    java.lang.String var18 = var15.toString();
    java.lang.String var19 = var15.getPassword();
    var14.setUser(var15);
    br.com.addvisor.model.Address var21 = var14.getAddress();
    java.lang.String var22 = var14.getName();
    var14.setTags("Country [id=null, name=Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null], acronym=User [id=-1, name=null, email=null, password=21c96d96756cfeed7f71110d9cb1788b, phone=null\nnull\nnull, city=null]]");
    br.com.addvisor.model.Evaluate var27 = new br.com.addvisor.model.Evaluate(var8, var14, (java.lang.Float)(-1.0f), "Evaluate [id=0, user=null, service=null, note=null, comment=Country [id=null, name=null, acronym=null]]");
    br.com.addvisor.model.User var28 = var27.getUser();
    java.lang.String var29 = var28.toString();
    java.lang.Long var30 = var28.getId();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var4.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var18.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var29.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);

  }

  public void test205() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test205");


    br.com.addvisor.model.Evaluate var0 = new br.com.addvisor.model.Evaluate();
    var0.setId((java.lang.Long)10L);
    var0.setId((java.lang.Long)0L);
    java.lang.Float var5 = var0.getNote();
    java.lang.Float var6 = var0.getNote();
    var0.setNote((java.lang.Float)100.0f);
    java.lang.Long var9 = var0.getId();
    br.com.addvisor.model.User var10 = var0.getUser();
    br.com.addvisor.model.User var11 = var0.getUser();
    java.lang.Long var12 = var0.getId();
    br.com.addvisor.model.Service var13 = var0.getService();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + 0L+ "'", var9.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + 0L+ "'", var12.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test206() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test206");


    br.com.addvisor.model.Service var0 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var1 = new br.com.addvisor.model.User();
    boolean var3 = var1.equals((java.lang.Object)(-1L));
    java.lang.String var4 = var1.toString();
    java.lang.String var5 = var1.getPassword();
    var0.setUser(var1);
    br.com.addvisor.model.Address var7 = var0.getAddress();
    java.lang.String var8 = var0.getName();
    java.lang.String var9 = var0.getDescription();
    br.com.addvisor.model.Address var10 = new br.com.addvisor.model.Address();
    java.lang.String var11 = var10.toString();
    br.com.addvisor.model.City var12 = new br.com.addvisor.model.City();
    var12.setName("hi!");
    var10.setCity(var12);
    var10.setLocation("");
    java.lang.String var18 = var10.getLocation();
    var0.setAddress(var10);
    br.com.addvisor.model.City var20 = var10.getCity();
    var20.setId((java.lang.Long)(-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var4.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "null\nnull\nnull"+ "'", var11.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test207() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test207");


    br.com.addvisor.model.Evaluate var0 = new br.com.addvisor.model.Evaluate();
    var0.setId((java.lang.Long)10L);
    var0.setId((java.lang.Long)0L);
    java.lang.Float var5 = var0.getNote();
    java.lang.Float var6 = var0.getNote();
    var0.setNote((java.lang.Float)100.0f);
    java.lang.Long var9 = var0.getId();
    var0.setId((java.lang.Long)100L);
    br.com.addvisor.model.Service var12 = var0.getService();
    br.com.addvisor.model.User var13 = new br.com.addvisor.model.User();
    boolean var15 = var13.equals((java.lang.Object)(-1L));
    java.lang.String var16 = var13.toString();
    java.lang.String var17 = var13.getPassword();
    java.lang.String var18 = var13.getPhone();
    br.com.addvisor.model.User var19 = new br.com.addvisor.model.User();
    br.com.addvisor.model.State var20 = new br.com.addvisor.model.State();
    var20.setId((java.lang.Long)1L);
    var20.setName("null\nnull\nnull");
    var20.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var27 = var20.getUf();
    boolean var28 = var19.equals((java.lang.Object)var20);
    br.com.addvisor.model.Service var29 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var30 = new br.com.addvisor.model.User();
    boolean var32 = var30.equals((java.lang.Object)(-1L));
    java.lang.String var33 = var30.toString();
    java.lang.String var34 = var30.getPassword();
    var29.setUser(var30);
    br.com.addvisor.model.Address var36 = var29.getAddress();
    java.lang.String var37 = var29.getName();
    br.com.addvisor.model.City var38 = new br.com.addvisor.model.City();
    var38.setName("hi!");
    var38.setName("null\nnull\nnull");
    br.com.addvisor.model.Address var43 = new br.com.addvisor.model.Address();
    java.lang.String var44 = var43.getComplement();
    java.lang.String var45 = var43.toString();
    boolean var46 = var38.equals((java.lang.Object)var45);
    br.com.addvisor.model.State var47 = new br.com.addvisor.model.State();
    var47.setId((java.lang.Long)1L);
    var47.setName("null\nnull\nnull");
    var47.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var54 = var47.getUf();
    var38.setState(var47);
    boolean var56 = var29.equals((java.lang.Object)var38);
    br.com.addvisor.model.Evaluate var59 = new br.com.addvisor.model.Evaluate(var19, var29, (java.lang.Float)100.0f, "");
    br.com.addvisor.model.Evaluate var62 = new br.com.addvisor.model.Evaluate(var13, var29, (java.lang.Float)0.0f, "User [id=null, name=null, email=User [id=null, name=null, email=null, password=null, phone=null, city=null], password=null, phone=null, city=null]");
    br.com.addvisor.model.City var63 = var13.getCity();
    var13.setName("Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]]");
    var13.setPhone("Service [id=null, name=Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]], description=null, tags=null, media=null, address=null, category=null, phones=null]");
    java.lang.Long var68 = var13.getId();
    var13.setName("Service [id=null, name=null, description=null, tags=null, media=100.0, address=null, category=null, phones=null]");
    var0.setUser(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + 0L+ "'", var9.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var16.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var33.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "null\nnull\nnull"+ "'", var45.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var68);

  }

  public void test208() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test208");


    br.com.addvisor.model.City var4 = new br.com.addvisor.model.City();
    br.com.addvisor.model.State var5 = var4.getState();
    java.lang.Long var6 = var4.getId();
    br.com.addvisor.model.Address var7 = new br.com.addvisor.model.Address("Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]", "null - null", var4);
    var7.setComplement("");
    var7.setId((java.lang.Long)1L);
    var7.setLocation("Evaluate [id=0, user=null, service=null, note=null, comment=null]");
    br.com.addvisor.model.City var14 = var7.getCity();
    br.com.addvisor.model.Evaluate var15 = new br.com.addvisor.model.Evaluate();
    br.com.addvisor.model.State var16 = new br.com.addvisor.model.State();
    boolean var18 = var16.equals((java.lang.Object)(byte)100);
    var16.setUf("null\nnull\nnull");
    boolean var21 = var15.equals((java.lang.Object)var16);
    br.com.addvisor.model.Service var22 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var23 = new br.com.addvisor.model.User();
    boolean var25 = var23.equals((java.lang.Object)(-1L));
    java.lang.String var26 = var23.toString();
    java.lang.String var27 = var23.getPassword();
    var22.setUser(var23);
    br.com.addvisor.model.Address var29 = var22.getAddress();
    java.lang.String var30 = var22.getDescription();
    boolean var31 = var15.equals((java.lang.Object)var22);
    br.com.addvisor.model.Evaluate var32 = new br.com.addvisor.model.Evaluate();
    var32.setId((java.lang.Long)10L);
    var32.setId((java.lang.Long)0L);
    br.com.addvisor.model.User var37 = var32.getUser();
    java.lang.Long var38 = var32.getId();
    br.com.addvisor.model.Service var39 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var40 = new br.com.addvisor.model.User();
    boolean var42 = var40.equals((java.lang.Object)(-1L));
    java.lang.String var43 = var40.toString();
    java.lang.String var44 = var40.getPassword();
    var39.setUser(var40);
    br.com.addvisor.model.Address var46 = var39.getAddress();
    java.lang.String var47 = var39.getDescription();
    var32.setService(var39);
    boolean var49 = var22.equals((java.lang.Object)var39);
    br.com.addvisor.model.User var50 = new br.com.addvisor.model.User();
    boolean var52 = var50.equals((java.lang.Object)(-1L));
    java.lang.String var53 = var50.getDDD();
    var50.setPhone("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    boolean var56 = var39.equals((java.lang.Object)"User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    br.com.addvisor.model.City var69 = new br.com.addvisor.model.City();
    var69.setName("hi!");
    var69.setName("null\nnull\nnull");
    br.com.addvisor.model.Address var74 = new br.com.addvisor.model.Address();
    java.lang.String var75 = var74.getComplement();
    java.lang.String var76 = var74.toString();
    boolean var77 = var69.equals((java.lang.Object)var76);
    br.com.addvisor.model.User var78 = new br.com.addvisor.model.User("hi!", "", "hi!", "User [id=null, name=null, email=null, password=null, phone=null, city=null]", var69);
    br.com.addvisor.model.Address var79 = new br.com.addvisor.model.Address("null\nnull\nnull", "User [id=null, name=null, email=null, password=null, phone=null, city=null]", var69);
    var69.setId((java.lang.Long)100L);
    br.com.addvisor.model.User var82 = new br.com.addvisor.model.User("Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]]", "Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]]", "User [id=null, name=null, email=null, password=21c96d96756cfeed7f71110d9cb1788b, phone=Evaluate [id=0, user=null, service=null, note=null, comment=User [id=null, name=null, email=null, password=null, phone=null, city=null]], city=null]", "hi!", var69);
    br.com.addvisor.model.Address var83 = new br.com.addvisor.model.Address("Service [id=1, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]", "null - User [id=-1, name=null, email=null, password=21c96d96756cfeed7f71110d9cb1788b, phone=null\nnull\nnull, city=null]", var69);
    java.lang.String var84 = var83.getLocation();
    var39.setAddress(var83);
    br.com.addvisor.model.City var86 = var83.getCity();
    java.lang.String var87 = var86.getName();
    int var88 = var14.compareTo(var86);
    br.com.addvisor.model.Address var89 = new br.com.addvisor.model.Address("User [id=null, name=null, email=null, password=aff97160474a056e838c1f721af01edf, phone=Evaluate [id=null, user=null, service=null, note=null, comment=], city=null\nnull\nnull]", "Evaluate [id=null, user=User [id=null, name=null, email=null, password=d41d8cd98f00b204e9800998ecf8427e, phone=User [id=null, name=null, email=User [id=null, name=null, email=null, password=null, phone=null, city=null], password=null, phone=null, city=null], city=null], service=null, note=null, comment=null]", var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var26.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + 0L+ "'", var38.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var43.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var76 + "' != '" + "null\nnull\nnull"+ "'", var76.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var84 + "' != '" + "Service [id=1, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]"+ "'", var84.equals("Service [id=1, name=null, description=null, tags=null, media=null, address=null, category=null, phones=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var87 + "' != '" + "null\nnull\nnull"+ "'", var87.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == 0);

  }

  public void test209() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test209");


    br.com.addvisor.model.Agenda var0 = new br.com.addvisor.model.Agenda();
    java.util.List var1 = var0.getNames();
    java.util.List var2 = var0.getNumbers();
    br.com.addvisor.model.Agenda var3 = new br.com.addvisor.model.Agenda();
    java.util.List var4 = var3.getNames();
    java.util.List var5 = var3.getNumbers();
    var0.setNames(var5);
    br.com.addvisor.model.Agenda var7 = new br.com.addvisor.model.Agenda();
    java.util.List var8 = var7.getNames();
    var7.addContact("User [id=null, name=null, email=null, password=428e147830819130e93707f1ce3a3cdb, phone=null, city=null]", "null - null\nnull\nnull");
    java.util.List var12 = var7.getNumbers();
    var0.setNumbers(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test210() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test210");


    br.com.addvisor.model.Service var0 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var1 = new br.com.addvisor.model.User();
    boolean var3 = var1.equals((java.lang.Object)(-1L));
    java.lang.String var4 = var1.toString();
    java.lang.String var5 = var1.getPassword();
    var0.setUser(var1);
    br.com.addvisor.model.Address var7 = var0.getAddress();
    java.lang.String var8 = var0.getTags();
    br.com.addvisor.model.Agenda var9 = new br.com.addvisor.model.Agenda();
    java.util.List var10 = var9.getNames();
    java.util.List var11 = var9.getNumbers();
    var0.setPhones(var11);
    java.lang.String var13 = var0.toString();
    var0.setId((java.lang.Long)(-1L));
    br.com.addvisor.model.User var16 = var0.getUser();
    br.com.addvisor.model.User var17 = var0.getUser();
    java.lang.Long var18 = var0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var4.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=[]]"+ "'", var13.equals("Service [id=null, name=null, description=null, tags=null, media=null, address=null, category=null, phones=[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + (-1L)+ "'", var18.equals((-1L)));

  }

  public void test211() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test211");


    br.com.addvisor.model.Evaluate var0 = new br.com.addvisor.model.Evaluate();
    br.com.addvisor.model.State var1 = new br.com.addvisor.model.State();
    boolean var3 = var1.equals((java.lang.Object)(byte)100);
    var1.setUf("null\nnull\nnull");
    boolean var6 = var0.equals((java.lang.Object)var1);
    br.com.addvisor.model.Service var7 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var8 = new br.com.addvisor.model.User();
    boolean var10 = var8.equals((java.lang.Object)(-1L));
    java.lang.String var11 = var8.toString();
    java.lang.String var12 = var8.getPassword();
    var7.setUser(var8);
    br.com.addvisor.model.Address var14 = var7.getAddress();
    var0.setService(var7);
    br.com.addvisor.model.Service var16 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var17 = new br.com.addvisor.model.User();
    boolean var19 = var17.equals((java.lang.Object)(-1L));
    java.lang.String var20 = var17.toString();
    java.lang.String var21 = var17.getPassword();
    var16.setUser(var17);
    br.com.addvisor.model.Address var23 = var16.getAddress();
    java.lang.String var24 = var16.getName();
    var16.setId((java.lang.Long)1L);
    java.lang.Long var27 = var16.getId();
    var0.setService(var16);
    br.com.addvisor.model.User var29 = new br.com.addvisor.model.User();
    br.com.addvisor.model.State var30 = new br.com.addvisor.model.State();
    var30.setId((java.lang.Long)1L);
    var30.setName("null\nnull\nnull");
    var30.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var37 = var30.getUf();
    boolean var38 = var29.equals((java.lang.Object)var30);
    br.com.addvisor.model.Service var39 = new br.com.addvisor.model.Service();
    br.com.addvisor.model.User var40 = new br.com.addvisor.model.User();
    boolean var42 = var40.equals((java.lang.Object)(-1L));
    java.lang.String var43 = var40.toString();
    java.lang.String var44 = var40.getPassword();
    var39.setUser(var40);
    br.com.addvisor.model.Address var46 = var39.getAddress();
    java.lang.String var47 = var39.getName();
    br.com.addvisor.model.City var48 = new br.com.addvisor.model.City();
    var48.setName("hi!");
    var48.setName("null\nnull\nnull");
    br.com.addvisor.model.Address var53 = new br.com.addvisor.model.Address();
    java.lang.String var54 = var53.getComplement();
    java.lang.String var55 = var53.toString();
    boolean var56 = var48.equals((java.lang.Object)var55);
    br.com.addvisor.model.State var57 = new br.com.addvisor.model.State();
    var57.setId((java.lang.Long)1L);
    var57.setName("null\nnull\nnull");
    var57.setName("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    java.lang.String var64 = var57.getUf();
    var48.setState(var57);
    boolean var66 = var39.equals((java.lang.Object)var48);
    br.com.addvisor.model.Evaluate var69 = new br.com.addvisor.model.Evaluate(var29, var39, (java.lang.Float)100.0f, "");
    java.lang.String var70 = var29.getDDD();
    var16.setUser(var29);
    var16.setName("null\nhi!\nnull\nnull\nnull - null");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var11.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var20.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + 1L+ "'", var27.equals(1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "User [id=null, name=null, email=null, password=null, phone=null, city=null]"+ "'", var43.equals("User [id=null, name=null, email=null, password=null, phone=null, city=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "null\nnull\nnull"+ "'", var55.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var70);

  }

  public void test212() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test212");


    br.com.addvisor.model.User var0 = new br.com.addvisor.model.User();
    boolean var2 = var0.equals((java.lang.Object)(-1L));
    java.lang.String var3 = var0.getDDD();
    var0.setPhone("User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    br.com.addvisor.model.Address var6 = new br.com.addvisor.model.Address();
    java.lang.String var7 = var6.toString();
    br.com.addvisor.model.City var8 = new br.com.addvisor.model.City();
    var8.setName("hi!");
    var8.setName("null\nnull\nnull");
    var6.setCity(var8);
    var0.setCity(var8);
    var8.setName("hi!");
    java.lang.String var17 = var8.toString();
    java.lang.String var18 = var8.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "null\nnull\nnull"+ "'", var7.equals("null\nnull\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));

  }

  public void test213() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test213");


    br.com.addvisor.model.Agenda var0 = new br.com.addvisor.model.Agenda();
    java.util.List var1 = var0.getNames();
    java.util.List var2 = var0.getNumbers();
    br.com.addvisor.model.Agenda var3 = new br.com.addvisor.model.Agenda();
    java.util.List var4 = var3.getNames();
    java.util.List var5 = var3.getNumbers();
    var0.setNames(var5);
    var0.addContact("null\nnull\nnull", "User [id=null, name=null, email=null, password=null, phone=null, city=null]");
    var0.addContact("User [id=null, name=null, email=User [id=null, name=null, email=null, password=null, phone=null, city=null], password=null, phone=null, city=null]", " - ");
    br.com.addvisor.model.Agenda var13 = new br.com.addvisor.model.Agenda();
    java.util.List var14 = var13.getNames();
    br.com.addvisor.model.Agenda var15 = new br.com.addvisor.model.Agenda();
    java.util.List var16 = var15.getNames();
    var13.setNames(var16);
    java.util.List var18 = var13.getNumbers();
    br.com.addvisor.model.Agenda var19 = new br.com.addvisor.model.Agenda();
    java.util.List var20 = var19.getNames();
    java.util.List var21 = var19.getNumbers();
    br.com.addvisor.model.Agenda var22 = new br.com.addvisor.model.Agenda();
    java.util.List var23 = var22.getNames();
    java.util.List var24 = var22.getNumbers();
    var19.setNames(var24);
    br.com.addvisor.model.Agenda var26 = new br.com.addvisor.model.Agenda();
    java.util.List var27 = var26.getNames();
    java.util.List var28 = var26.getNumbers();
    br.com.addvisor.model.Agenda var29 = new br.com.addvisor.model.Agenda();
    java.util.List var30 = var29.getNames();
    java.util.List var31 = var29.getNumbers();
    var26.setNames(var31);
    var19.setNames(var31);
    var13.setNumbers(var31);
    java.util.Map var35 = var13.getContacts();
    var0.setContacts(var35);
    java.util.List var37 = var0.getNumbers();
    java.util.List var38 = var0.getNames();
    java.util.List var39 = var0.getNames();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);

  }

}
