import java .util.*;
public class Q19 {
    public static void main(String[] args) {
        int num1,   num2;
        Scanner sc= new Scanner( System.in);
        num1=sc.nextInt();
        num2=sc.nextInt();
        //this is reverse  the  number
         int temp=num1;
         num1=num2;
          num2= temp;
          //condition is palindrome or not 
          if (num1==num2){
            System.out.println(" number is palindrome");
          }
          else{
          System.out.println(" number is not palindrome");
          }
        
    }

    
}
