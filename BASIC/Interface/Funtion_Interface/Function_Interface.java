package BASIC.Interface.Funtion_Interface;

// Functional or SAM Interface -> only have one method
@FunctionalInterface
interface A {
    void show();
}

class B implements A {
    public void show() {
        System.out.println("in Show");
    }
}

public class Function_Interface {
    public static void main(String[] args) {
        // First way to create object of interface
        A obj1 = new B();
        obj1.show();


        // Second way to create object of interface
        A obj2 = new A() {
            public void show() {
                System.out.println("in Annonymous class and 2nd way to implement interface");
            }
        };
        obj2.show();


        // Third way to create object of interface
        A obj3 = () ->
        {
            System.out.println("in Lambda showcand 3rd way to create obj for functional interface");
        };
        obj3.show();
    }
    
}
