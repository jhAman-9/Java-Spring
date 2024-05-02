package BASIC.Exceptions;

public class Exceptions {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;

        int num[] = new int[5];

        try {
            j = 18 / i;
            System.out.println(num[5]);
        }

        // if arithmetic Exception then this cath block work
        catch (ArithmeticException e) {
            System.out.println("cannot divide by ZERO");
        }

        // if array index exception then this catch block work
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bound");
        }

        // if the exception is not from any above one then this will work
        catch (Exception e) {
            System.out.println("Something Went Wrong" + e);
        }

        System.out.println(j);
        System.out.println("hello");
    }
}
