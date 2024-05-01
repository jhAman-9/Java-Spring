package BASIC.Up_Casting_And_Down_Casting;

class A {
    public void show1() {
        System.out.println("In A Show1");
    }
}
class B extends A{
    public void show2() {
        System.out.println("In B Show2");
    }
}

public class Demo {
    public static void main(String[] args) {
        // Up Casting -> Casting to the Parent Class
        A obj = (A) new B();
        obj.show1();

        // Down Casting -> Casting to the Child Class
        B obj1 = (B) obj;
        obj1.show2();
    }
    
}
