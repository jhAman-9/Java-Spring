package BASIC.Constructor;

class Human {
    private int age = 22;
    private String name = "Aman";

    // Constructor
    public Human() {
        System.out.println("My Constructor");
        age = 12;
        name = "John";
    }

    // Parameterized Constructor
    public Human(int a, String n) {
        age = a;
        name = n;
    }

    // For assigning the value to the Private Variables
    public int getAge() {
        return age;
    }

    public void setAge(int age, Human obj) {
        obj.age = age;      // we can use this keyword at this place
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Demo {
    public static void main(String[] args) {
        Human obj = new Human(20, "Aman Kumar");
        // obj,age = 22;
        // obj.name = "Aman";

        // System.out.println(obj.name);


        // Assigning the Values to the private variables with the help of Methods
        // obj.setAge(23, obj);
        // obj.setName("Aj");

        System.out.println(obj.getAge() + " : " + obj.getName());
        
    }
    
}
