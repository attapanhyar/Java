 interface I1 {
    void m1();	    }
 interface I2 {
    void m2();	}
 interface I3 extends I2,I1 {
    void m3();	    }
public class Main implements I3{
   public void m1(){
       System.out.println("I1 method1");	    }
   public void m2(){
       System.out.println("I2 method2");}
       public void m3(){
       System.out.println("I3 method3");	    }	
       public static void main(String args[]){
           Main m=new Main();
           m.m1();	           m.m2();	           m.m3();	       }	    }
