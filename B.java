  public class B{ 
    int a; int  b;
    B(){
        a=10; b=20;
        System.out.println( a+" "+b );
    }
    B(B obj)
    {
        a=obj.a;
        b=obj.b;
        System.out.println(a+" "+b);
    }
   
}
class B1
{    public static void main(String[] args){
        B o=new B();
        B  obj=new B (o);
    }
}

