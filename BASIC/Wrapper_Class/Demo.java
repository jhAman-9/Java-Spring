package BASIC.Wrapper_Class;


public class Demo {
    public static void main(String[] args) {
        // Primitive Type
        int num = 10;

        // Integer num1 = new Integer(20);
        Integer num1 = 20;
        Integer num2 = num;         // auto-Boxing
        int c = num1.intValue();    // auto-Unboxing

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(c);

        

        String str = "10";
        int x = Integer.parseInt(str);

        System.out.println(x * 5);

    }
    
}
