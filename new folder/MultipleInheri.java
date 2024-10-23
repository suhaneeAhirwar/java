interface A {
    public void run1();
}

class C implements A {
    public void run1() {
        System.out.println("parent");
    }
}

class B implements A {
    public void run1() {
        System.out.println("child");
    }
}

 public class MultipleInheri {
    public static void main(String[] args) {
        C o1 = new C();
        o1.run1(); // Corrected: calling the method using the object reference

        B o2 = new B();
        o2.run1();
    }
}
