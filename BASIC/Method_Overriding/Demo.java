package BASIC.Method_Overriding;

class Calc {
    public int add(int a, int b) {
        System.out.println(" in Calc Add");
        return a + b;
    }
}

// Method Overriding
class AdvCalc extends Calc{
    public int add(int a, int b) {
        System.out.println(" in AdvCalc Add");
        return a + b + 10;
    }
}

public class Demo {
    public static void main(String[] args) {
        AdvCalc obj = new AdvCalc();
        int a = obj.add(2, 3);
        System.out.println(a);
        
    }
    
}
