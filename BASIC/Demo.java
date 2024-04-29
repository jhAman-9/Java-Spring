package BASIC;
class Mobile {
    String brand;
    int price;
    static String name;

    public void show() {
        System.out.println(brand + " : " + price + " : " + name );
    }
}

public class Demo {

    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 200;
        obj1.name = "Samsung";


        Mobile obj2 = new Mobile();
        obj2.brand = "Mi";
        obj2.price = 200;
        obj2.name = "Redmi";

        obj1.show();
        obj2.show();
    }
}
