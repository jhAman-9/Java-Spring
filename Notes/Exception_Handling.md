# Exception Handling
- after the error came, the flow code excution is not stopped


# Try Catch
- catch block is excuted when error come

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

# Finally
- if a try block donnot have catch block then it give error then their finally block used to handle error.

- The Finally Block will must excuate if it is exception or not..

- Basically Final Block is used to closing The Resource.
Examlpe -> br.close();

        # it is excuate whether it is exception or not

        finally {
            System.out.println("The Finally Block");
            br.close();
        }



# Throw
- Throw keyword is used tp throw the exception and catch block catch it..

      throw new MyException("I donot want to print Zero");


# Throws
- Throws Keyword is used to throws Exception which is gone a handle by someone other

        public void show() throws ClassNotFoundException {
            Class.forName("Calc");
        }


# Heararky

1) Object class     -> every class in java extends object
2) Throwable
3) i) Error  
ii) Exception -> a) runtime excepton b) I/O Exception c) SQL Exception




# Note
- Error cannot be handle

- Exception ->
  a) runtime excepton
  b) I/O Exception 
  c) SQL Exception

- Runtime Exception -> Arrya index out of bound, Arithmetic, Null Pointer Exceptions

- Runtime Exception is unchecked exception

- SQL or IO Exception are checked Exception


# Note 

- (Exception e) is the parent exception

- if all the above exception not work then this (Exception e) work

- so that why parent (Exception e) class should be at last