package BASIC.Abstract_Keyword;

abstract class Car {
    // Abstract Method always into the abstract Class
    public abstract void drive();

    public abstract void fly();

    public void playMusic() {
        System.out.println("play music");
    }

}

// it is not implementing the abstract method fly of its parent class
// then it must also be a Abstract Class
abstract class WagonR extends Car {
    public void drive() {
        System.out.println("Drive...");
    }
}

// Concrete Class
// it is non abstract class and it work is to implement all the remaining abstract methods then after used to create obj
class lambo extends WagonR {
    public void fly() {
        System.out.println("fly");
    }
}

public class Demo {
    public static void main(String[] args) {
        Car obj = new lambo();
        obj.drive();
        obj.playMusic();
        obj.fly();
    }
    
}
