package BASIC.Named_Constant;

// Enum
enum Status{
    Running, Jumped, Eating, Walking;
}

public class Demo {
    public static void main(String[] args) {
        Status s = Status.Eating;
        System.out.println(s);                          // Eating

        // give index
        System.out.println(s.ordinal());                // 2

        Status[] a = Status.values();

        for (Status it : a) {
            System.out.println(it + " : " + it.ordinal());      // name and value
        }

        switch (s) {
            case Running:
                System.out.println("All Good");
                break;
            case Jumped:
                System.out.println("Jumping");
                break;
            case Eating:
                System.out.println("Eating");
                break;
            case Walking:
                System.out.println("walking");
                break;
            default:
                System.out.println("Done");
                break;
        }
        
        // Enum extends enum class
        System.out.println(s.getClass().getSuperclass());
    }
}
