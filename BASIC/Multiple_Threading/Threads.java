package BASIC.Multiple_Threading;

class A extends Thread{
    public void run() {
        for(int i=1; i<=100; i++){
            System.out.println("Aman");

            // schedular will sleep for 10ms
            try {
                sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class B extends Thread{
    public void run() {
        for(int i=1; i<=100; i++){
            System.out.println("Kumar");

            // schedular will sleep for 10ms
            try {
                sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Threads {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        // Thread Periority
        System.out.println(obj1.getPriority());

        // set Periority
        obj2.setPriority(Thread.MAX_PRIORITY);


        obj1.start();

        // so they not overlap each other
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        obj2.start();
    }
}
