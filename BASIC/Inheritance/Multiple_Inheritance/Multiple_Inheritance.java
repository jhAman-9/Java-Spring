package BASIC.Inheritance.Multiple_Inheritance;

interface A {
    // variable are by default final and static
    int pin = 3343;
    String name = "AMAN";

    // These all method are by default public abstract
    void show();

    void config();
}

interface B {
    int code = 9576;

    void run();
}

interface C extends B {
    void jump();
    
}

// Multiple Inheritance Perform
class D implements A, C {
    // From Interface A
    public void show() {
        System.out.println("in show from A");
    }

    public void config() {
        System.out.println("in config from A");
    }

    // From Interface B
    public void run() {
        System.out.println("in run from B and Multiple Inheritance");
    }

    // From interface C
    public void jump() {
        System.out.println("in jump from C and perform multiple Inheritance");
    }
}

public class Multiple_Inheritance {
    public static void main(String[] args) {
        D obj = new D();
        obj.config();
        obj.show();
        obj.jump();
        obj.run();

        // Static method and variable are directly called with className
        System.out.println(A.name);
        System.out.println(B.code);
    }

}

