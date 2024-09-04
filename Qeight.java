import  java .util.Scanner;
public class Qeight {
    public static void main(String[] args) {
        int number;
        Scanner scanner=new  Scanner (System.in);
         number=scanner.nextInt();
         if(number%5==0){
            System.out.println(" number is divisible");
         }
         else{
            System.out.println(" number is not divisible");
         }


        
    }
    
}
