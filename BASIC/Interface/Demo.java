package BASIC.Interface;

interface A {
    // variable are by default final and static
    int pin = 3343;
    String name = "AMAN";

    // These all method are by default public abstract
    void show();

    void config();
}


class B implements A {
    public void show() {
        System.out.println("in show");
    }

    public void config() {
        System.out.println("in config");
    }
}



public class Demo {
    public static void main(String[] args) {
        B obj = new B();
        obj.config();
        obj.show();

        // Static method and variable are directly called with className
        System.out.println(A.name);
    }
}