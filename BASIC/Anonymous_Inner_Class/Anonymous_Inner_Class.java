package BASIC.Anonymous_Inner_Class;

class A {
    public void show() {
        System.out.println("in old show");
    }
}


abstract class B {
    public abstract void dance();

    public abstract void run();
}

public class Anonymous_Inner_Class {
    public static void main(String[] args) {
        A obj = new A() {
            // This is Anonymous Class
            // Changing the behaviour of show method of A class
            public void show() {
                System.out.println("in new show");
            }
        };
        obj.show();

        // creating obj for anonymous class using the abstract class to implement the abstract method
        B obj1 = new B() {
            
            public void dance() {
                System.out.println("Accessing abstract Dance method of abstract class from anonymous class");
            }

            public void run() {
                System.out.println("Accessing Abstract Run method of Abstract class with anonymous class");
            }
        };

        obj1.dance();
        obj1.run();
    }
}
