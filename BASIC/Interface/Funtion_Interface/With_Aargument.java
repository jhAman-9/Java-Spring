package BASIC.Interface.Funtion_Interface;

interface A {
    int add(int a, int b);
}

public class With_Aargument {
    public static void main(String[] args) {
        
        // With Annonymous Class
        // A obj = new A() 
        //     {
        //         public int add(int a, int b)
        //         {
        //             return a+b;
        //         }
        // };
        
        // int res = obj.add(2,3);
        // System.out.println(res);


        // With Lambda Function
        A obj1 = (a, b) -> a + b;
        System.out.println(obj1.add(10, 20));
    }
}
