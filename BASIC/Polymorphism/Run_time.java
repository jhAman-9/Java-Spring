package BASIC.Polymorphism;

class A {
    public void show() {
        System.out.println("in A show");
    }
}

class B extends A {
    public void show() {
        System.out.println("in B show");
    }
}
class C {
    public void show() {
        System.out.println("in C show");
    }
}


class Run_time {

    public static void main(String[] args) {

        // This is decided Into Run-time that which class this obj is refering
        A obj = new A();
        obj.show();

        obj = new B();
        obj.show();

        // This will Not work Because it is not extending
        // obj = new C();
        // obj.show(); 
     }
}