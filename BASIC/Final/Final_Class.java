package BASIC.Final;

// Once we make a class final, we are stopping inheritance....
final class calc {
    public void show() {
        System.out.println("in calc show");
    }

    public void add(int a, int b) {
        System.out.println(a + b);
    }
}

// it will give error beacause we are inheriting the final class
class AdvCalc /* extends  calc  */{
    public void show() {
        System.out.println("in AdvCalc show");
    }

    public void sub(int a, int b) {
        System.out.println(a - b);
    }
}



public class Final_Class {
    public static void main(String[] args) {
        AdvCalc obj = new AdvCalc();
        obj.show();
        // obj.add(2, 3);
    }
    
}
