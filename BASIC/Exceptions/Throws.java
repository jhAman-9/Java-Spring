package BASIC.Exceptions;

// Here, we handle mySelf the exception
class A {
    public void show() {
        // handle exception mySelf
        try {
            // finding Class
            Class.forName("Calc");
        }

        catch (ClassNotFoundException e) {
            System.out.println("Not able to found the Class" + e);
        }
    }
}

// Here, we throws exception to handle by someone other
class B {
    public void show() throws ClassNotFoundException {
        Class.forName("Calc");
    }
}



public class Throws {

    static {
        System.out.println("Class Loaded");
    }

    public static void main(String[] args) {
        // handle exception by Class A show method
        A obj = new A();
        obj.show();

        // handle exception by main method
        B obj1 = new B();
        try{
            obj1.show();
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
            System.out.println("Exception Handle in Main Method");
        }
    }
}
