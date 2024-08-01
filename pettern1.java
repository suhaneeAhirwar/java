import java.util.Scanner;

 class pettern1{
    public static void main(String[] args){
        int lines=0;
        int space =0;
        Scanner sc=new Scanner(System.in);
        System.out.println("entre the number of lines");
        lines=sc.nextInt();
        space=(lines*2)-2;
        for(int i=1;i<=lines;i++){
        
            for(int j=1;j<=i;j++){
                System.out.print( "*");
            }
            for(int s=1;s<=space;s++){
                System.out.print(" ");
            }
            for(int r=1;r<=i;r++){
                System.out.print("*");
            }
            space=space-2;
            System.out.println();
        }
    }
}