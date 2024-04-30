package BASIC.Constructor;

class A {
    public A() {
        super();
        System.out.println(" in A");
    }

    public A(int a) {
        super();
        System.out.println(" in A int");
    }
    
}

class B extends A{
    public B() {
        super(5);
        System.out.println(" in B");
    }

    public B(int a) {
        this();
        System.out.println(" in B int");
    }
}

public class Demo2 {
    public static void main(String[] args) {
        B obj = new B(3);
        // B obj = new B();
    }
    
}
