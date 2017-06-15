package enumTest;

import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test1");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.addvisor.webservice.models.pojo.enums.ServiceCat var1 = br.com.addvisor.webservice.models.pojo.enums.ServiceCat.getCategory("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test2");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.addvisor.webservice.models.pojo.enums.ServiceCat var1 = br.com.addvisor.webservice.models.pojo.enums.ServiceCat.getCategory("hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test3");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.addvisor.webservice.models.pojo.enums.ServiceCat var1 = br.com.addvisor.webservice.models.pojo.enums.ServiceCat.valueOf("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test4");


    br.com.addvisor.webservice.models.pojo.enums.ServiceCat[] var0 = br.com.addvisor.webservice.models.pojo.enums.ServiceCat.values();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test5");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      br.com.addvisor.webservice.models.pojo.enums.ServiceCat var1 = br.com.addvisor.webservice.models.pojo.enums.ServiceCat.valueOf("hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

}
