// First Interface
interface InterfaceA {
    void methodA1();
    void methodA2();
}

// Second Interface
interface InterfaceB {
    void methodB1();
    void methodB2();
}

// Third Interface
interface InterfaceC {
    void methodC1();
    void methodC2();
}

// New Interface inheriting from A, B, and C
interface NewInterface extends InterfaceA, InterfaceB, InterfaceC {
    void newMethod();
}

// A concrete class that we will inherit from
class ConcreteClass {
    public void concreteClassMethod() {
        System.out.println("Method from Concrete Class");
    }
}

// Class implementing NewInterface and inheriting ConcreteClass
class assi18 extends ConcreteClass implements NewInterface {
    @Override
    public void methodA1() {
        System.out.println("Method A1 implementation");
    }

    @Override
    public void methodA2() {
        System.out.println("Method A2 implementation");
    }

    @Override
    public void methodB1() {
        System.out.println("Method B1 implementation");
    }

    @Override
    public void methodB2() {
        System.out.println("Method B2 implementation");
    }

    @Override
    public void methodC1() {
        System.out.println("Method C1 implementation");
    }

    @Override
    public void methodC2() {
        System.out.println("Method C2 implementation");
    }

    @Override
    public void newMethod() {
        System.out.println("New Method implementation");
    }
}

// Main class with methods that take different interfaces as arguments
public class MainClass {
    public static void methodTakingA(InterfaceA obj) {
        obj.methodA1();
        obj.methodA2();
    }

    public static void methodTakingB(InterfaceB obj) {
        obj.methodB1();
        obj.methodB2();
    }

    public static void methodTakingC(InterfaceC obj) {
        obj.methodC1();
        obj.methodC2();
    }

    public static void methodTakingNew(NewInterface obj) {
        obj.newMethod();
    }

    public static void main(String[] args) {
        // Creating an object of assi18 class
        assi18 myObject = new assi18();

        // Pass the object to each of the methods
        methodTakingA(myObject);
        methodTakingB(myObject);
        methodTakingC(myObject);
        methodTakingNew(myObject);

        // Call method from concrete class
        myObject.concreteClassMethod();
    }
}
