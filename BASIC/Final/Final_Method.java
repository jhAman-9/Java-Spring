package BASIC.Final;

// if we want that anyone cannot override the calc show method then make it as final
class calc {
    public /* final */ void show() {
        System.out.println("in calc show");
    }

}

// Here,we are try to override the calc show method which is not possible because it is final method
class AdvCalc  /*  extends  calc */{
    public void show() {
        System.out.println("in AdvCalc show");
    }
}


public class Final_Method {
    public static void main(String[] args) {
        AdvCalc obj = new AdvCalc();
        obj.show();
    }
}
