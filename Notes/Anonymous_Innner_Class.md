# Anonymious Inner Class

- it is used to change the behavoiur of method once of a class without extending it into the another class..

- Changing the behaviour of show method of A class

        A obj = new A() {
            public void show(){
                System.out.println("in new show");
            }
        };


# Note
- if we need to change the behaviour of a method once then don't need to create a seperate class to extend it and then override it, do like this..

- it is far good to use for define or implentating of abstract methods.. 

- creating obj for anonymous class using the abstract class to implement the abstract method

        B obj1 = new B() {
            
            public void dance() {
                System.out.println("Accessing abstract Dance method of abstract class from anonymous class");
            }

            public void run() {
                System.out.println("Accessing Abstract Run method of Abstract class with anonymous class");
            }
        };

        obj1.dance();
        obj1.run();

- Here, we can define more than one abstract methods of abstract class by anonymous class