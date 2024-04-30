package BASIC.Static;
class Mobile {
    String brand;
    int price;
    static String name;

    // Constructor 
    public Mobile() {
        brand = "Oyo";
        price = 200;
        System.out.println("In constructor block");
    }

    static {
        name = "Tata";
        System.out.println("in Static Block");
    }


    public void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }
    
    // cannot directly use non static variables inside a static method
    public static void static_show(Mobile obj) {
        System.out.println(obj.brand + " : " + obj.price + " : " + name);
        System.out.println("Static Method");
    }
}

public class Demo {

    public static void main(String[] args) throws ClassNotFoundException {

        // if instance is not created then constructor is not called as well as static block is not called 

        // a way to called a class
        // Class.forName(className : "Mobile");

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

        // Static Method is directily called with the className
        // Mobile.show1();

        Mobile.static_show(obj1);
    }
}
