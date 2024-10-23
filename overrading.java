 class cou {
    void run(){
        System.out.println( "i is ");
    }
 class bike extends cou{
     void run(){
        System.out.println(" is t ");
        super.run();
     }
    
        
    }
 }

public  class  overrading{
 cou d=new cou();
 d.run();
 }

 //second class 
    

 class bank{
    int getrateofinterest(){
        retrun 0;
    }
 }
 class sbi extends bank{
     int gerrateofinterst(){
        return 8;
     }
     class icici extends bank{
        int gerrateofinterst(){
            return 9;
        }
     }
     class test2{
        public static void main(String[] args) {
             sbi s= new sbi();
             icici i=new icici();
             axis  a= new axis();
             System.out.println( " sbi rate of " + s.getrateofinterest());
             System.out.println(" "+ i.getrateofinterest());
             System.out.println(" is " a.gerrateofinterst());
             
        }
     }

 }
 //third class ;
 abstract  class {
    abstract void  fun(){

    }
 }
  class  Honda4   extends bike {
    void run(){
        System.out.println("running safety");
    }
  }