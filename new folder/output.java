class Print {
    int health = 10;
    char ch = 'a';
    
    int getHealth() {
        return health;
    }
    
    char getCh() {
        return ch;
    }
    
    void setHealth(int b) {
        health = b;
    }
    
    void setCh(char u) {
        ch = u;
    }
}

 public class output {
    public static void main(String[] args) {
        Print obj = new Print();
        // You can now use obj to set and get health and ch values
        obj.setHealth(20);
        obj.setCh('z');
        
        System.out.println("Health: " + obj.getHealth());
        System.out.println("Character: " + obj.getCh());
    }
}
