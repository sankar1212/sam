package selenium_Practice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

  public class JunitAnnotationDemo{
     @Before
       public void beforeclass() {
	      System.out.println("beforeclass executed");   
   }
     @After
           public void afterclass() {
	         System.out.println("afterclass executed");
   } 
      @Test
           public void test1() {
    	     System.out.println("test1 executed");  	   
    }
      @Test
         public void test2() {
	        System.out.println("test2 executed");  	   
   }
      @Test
         public void test3() {
	         System.out.println("test3 executed");  	   
   }
}
              