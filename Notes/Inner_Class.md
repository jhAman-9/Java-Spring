# Class in Class
- We can make Static Class for just inner class not for outer class 



# Note
- need obj of A when B is not stactic class to create obj of B

         A.B obj1 = obj.new B();
         obj1.show2();

- if b is a static class, don't need obj of A class

        A.B obj1 = new A.B();
        obj1.show2();