package BASIC.Inheritance.Multi_Level;

public class MoreAdvCalc extends AdvanceCalc{
    MoreAdvCalc() {
        System.out.println("Multi-Level Inheritance");
        System.out.println("A -> B -> C -> D");
    }
    public void power(int a, int b) {
        System.out.println("Power "+ (Math.pow(a,b)));
    }
    
}