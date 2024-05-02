package BASIC.Annotation;

class A {
    public void show() {
        System.out.println("in A show");
    }
}

// Override Annotation helps to find the override method name is written properly or not
class B extends A {
    @Override  // Throw error if override show method has wrong name
    public void show() {
        System.out.println("in B show");
    }
 }

public class Override_Annotation {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}
