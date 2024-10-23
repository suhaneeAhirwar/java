 class test {
      String color="white";
    
}
class pou extends test {
    String color= " black";
    void printcolor(){
        System.out.println(color);
        System.out.println(super.color);
    }
}
 public class cou{
    public static void main(String[] args) {
        pou  d =new  pou();
        d.printcolor();
        
    }

}
