package BASIC.Inner_Class;

class A {
    int x = 10;

    public void show1() {
        System.out.println("in show1");
    }

    // Class in Class
    static class B {
        public void show2() {
            System.out.println("in show2");
        }
    }
}

public class Class_in_Class {
    public static void main(String[] args) {
        A obj = new A();
        obj.show1();

        // need obj of A when B is not stactic class to create obj of B
        // A.B obj1 = obj.new B();
        // obj1.show2();

        // if b is a static class, don't need obj of A class
        A.B obj1 = new A.B();
        obj1.show2();
        
    }
    
}
