package BASIC.Object;

class Humain {
    Humain() {
        System.out.println("Object Created");
    }

    public void show() {
        System.out.println("Show Function");
    }
}

public class Object {
    public static void main(String[] args) {
        new Humain().show();;
    }
}
