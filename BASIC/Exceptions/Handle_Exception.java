package BASIC.Exceptions;

// My Own Exception
// exception class constructor also taking String s as input
class MyException extends Exception{
    public MyException(String s) {
        super(s);
    }
}

public class Handle_Exception {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;

        try {
            j = 18 - 18;
            if (j == 0)
                throw new MyException("I donot want to print Zero");
        }


        catch (MyException e) {
            System.out.println("my own Exception : " + e);
        }

        catch (ArithmeticException e) {
            System.out.println("cannot divide by ZERO " + e);
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bound " + e);
        }

        catch (Exception e) {
            System.out.println("Something Went Wrong " + e);
        }

        System.out.println("End Up");
    }
}

