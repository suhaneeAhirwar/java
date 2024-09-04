import java.util.Scanner;
public class Qseven {
    int percentage;
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the student percentage");
        int percentage= sc.nextInt() ;
        
        if(percentage>=90){
            System.out.println(" Students will come :   GRADE A");
        }
    
       else if(percentage>=80){
            System.out.println(" Students will come :   GRADE B");
        }
         else if(percentage>=70){
            System.out.println(" Students will come :   GRADE C");
        }
         else if(percentage>=60){
            System.out.println(" Students will come :   GRADE D");
        }
       else  if(percentage>=50){
            System.out.println(" Students will come :   GRADE E");
        }
         else if(percentage>=40){
            System.out.println(" Students will come :   GRADE F");
        }
    }


    
}
