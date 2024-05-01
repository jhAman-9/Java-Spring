package BASIC.Coupling;

abstract class Computer {
    public abstract void code();
}

class Desktop extends Computer {
    public void code() {
        System.out.println("code, compile, run, faster");
    }
    
}

class Laptop extends Computer {
    public void code() {
        System.out.println("code, compile, run");
    }

}

class Developer {
    public void devApp(Computer dev) {
        dev.code();
    }
}

public class Loosely_Coupling {
    public static void main(String[] args) {
        Computer desk = new Desktop();
        Computer lap = new Laptop();

        Developer aman = new Developer();
        aman.devApp((desk));
        
    }
    
}
