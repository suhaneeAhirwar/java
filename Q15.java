import java .util.Scanner;
public class Q15 {
    public static void  main(String[] args){
        int j;
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the number ");
      j=sc.nextInt();
      System.out.println(" enter the size to print the table");
      int n=sc.nextInt();
      //to print multification table 
      for(int  i=1;i<=n; i++){
        int ans=i*j;
        System.out.println(" print the multification table"  +ans);
      }
    }
    
}
