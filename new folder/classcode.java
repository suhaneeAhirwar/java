  /**
   * classcode
   */
 interface printout {
  void input();
  void output();
    
    
}
class Dog implements  printout{
 public void input(){
    System.out.println("dog is barking");
 }
 public void  output(){
    System.out.println("dog  is eating");
 }

}
 public class classcode{
    public static void main(String [] args){
        printout obj= new Dog();
        obj.input();
        obj.output();
    }
}
