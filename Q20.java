import java.util.*;
public class Q20 {
    //no.is prime or not
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the n");
        int n  =sc.nextInt();
       // System.out.println("enter the n");
       int i = sc.nextInt();

        if(n%i!=0||n%n==0){
            System.out.println("n is prime");
        }else{
            System.out.println("not prime");
        }
    }
}