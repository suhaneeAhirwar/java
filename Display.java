 
  public class   Display{
    public static void main(String[] args) {
        print c = new print();
        System.out.println("Health: " + c.getHealth());
        System.out.println("Character: " + c.getCh());

        c.setHealth(0);
        c.setCh('B');

        System.out.println("Updated Health: " + c.getHealth());
        System.out.println("Updated Character: " + c.getCh());
    }
} 
class print { 
    int health = 10;
    char ch = 'A';

    int getHealth() {
        return health;
    }

    char getCh() {
        return ch;
    }

    void setHealth(int a) {
        health = a;
    }

    void setCh(char d) {
        ch = d;
    }
}

