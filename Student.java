
    
import java.util.*;
class B1 {
 static  int a; 
String b;
   B1(){
      // public static void main(String args[]){

     //  }
       a=12;
       b="suhanee";
       System.out.println( a+" "+b);
   }
   B1 (B1 ref){
       a=ref.a;
       b=ref.b;
       System.out.println( a+" "+b);
   }
   
}     
 public class Student {
   public static void main(String args[]){

   B1 r=new B1();
   B1 r2=new  B1(r);
}
}

