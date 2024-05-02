package BASIC.Exceptions;

class A {
    public void show() {
        try{
            Class.forName("Calc")
        }

        catch(ClassNotFoundException e){
            System.out.println("Not able to found the Class");
        }
    }
}

public class Throws {

    static {
        System.out.println("Class Loaded");
    }
    public static void main(String[] args) {
        a obj = new A();
        obj.show();
        
    }
}
