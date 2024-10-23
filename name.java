public class name {
    int a=10;
    int b=6;
    void  run(){
        System.out.println(a);
        System.out.println(b);
    }
    void add(){
        System.out.println(a);
    }

        public static void main( String[] args){
            name obj =new name();
            name obj1=new name();
            obj=obj1;

            obj.run();
            obj1.add();
        }

    }

