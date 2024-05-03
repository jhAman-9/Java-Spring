package BASIC.Multiple_Threading;

// Note:
// Runnable Interface has run method

// Problem while Two threads working on same variables

// help to run method from one call at a time

class Count {
    int val;
    public synchronized void increament() {
        val++;
    }
}

public class Two_Threads {
    public static void main(String[] args) {

        Count obj = new Count();

        Runnable obj1 = () -> 
        {
            for(int i=0; i<=1000; i++){
                obj.increament();
            }
        } ;

        Runnable obj2 = () -> 
        {
            for(int i=0; i<=1000; i++){
                obj.increament();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        // telling to complete their work
        
        System.out.println(Count.val);

    }
}
