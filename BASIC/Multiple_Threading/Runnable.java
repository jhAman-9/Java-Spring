package BASIC.Multiple_Threading;

/* When we want to use Thread, we have two option
1) use Thread class
2) use Runnable Interface
*/

// Implementing the run method of Runnable Interface

// class A implements Runnable{
//     public void run() {
//         for(int i=1; i<=100; i++){
//             System.out.println("Aman");
//         }
//     }
// }
// class B implements Runnable{
//     public void run() {
//         for(int i=1; i<=100; i++){
//             System.out.println("Kumar");
//         }
//     }
// }

public class Runnable {
    public static void main(String[] args) {
        // Runnable obj1 = new A();
        // Runnable obj2 = new B()


        // implementing run method of Runnable interface using Annonymous expression
        Runnable obj2 = () -> {
            for(int i=1; i<=5; i++){
                System.out.println("Kumar");
            }
        };


        // implementing run method of Runnable interface using lambda expression
        Runnable obj1 = new Runnable(){
            public void run() {
                for(int i=1; i<=5; i++){
                    System.out.println("Kumar");
                }
            }
        };


        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}

