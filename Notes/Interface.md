# Interface
- interface is not a class
- By Default Every method of Interface is "Public Abstract"
- Interface said that what are the method you need but I will not implement them..
- Interface has just method declearation, not definition.
- all the Variable inside the Interface is by Default "Final and Static"
- Its all variable and methods are byDefault Final and Static
- the variable can call easily with className. Ex-(A.name)
- once Variable and Methods are define or Initialize cannot change again
- In Implements, You just get method to define outside not Variables..


# Type of Interface
    1} Normal Interface

    2) Functional / SAM Interface -> it has Single Abstarct Method
    
    3) Marker Interface -> it has no Methods


# Ways to create object for interface
- Here, A is Interface and B is Class who implementing A interface 

        1) First way to create object of interface..

            A obj1 = new B();
            obj1.show();


        2) Second way to create object of interface..

            A obj2 = new A() {
                public void show() {
                    System.out.println("in Annonymous class and 2nd way to implement interface");
                }
            };
            obj2.show();


        3) Third way to create object of interface usinging Lambda Expression..

            A obj3 = () ->
            {
                System.out.println("in Lambda showcand 3rd way to create obj for functional interface");
            };
            obj3.show();


# Handle Argument in Functional Interface
    // With Annonymous Class

         A obj = new A() 
             {
                 public int add(int a, int b)
                 {
                     return a+b;
                 }
         };
        
         int res = obj.add(2,3);
         System.out.println(res);


    // With Lambda Expression

        A obj1 = ( a, b) -> a + b;
        System.out.println(obj1.add(10, 20));


# Note
- SAM -> Single Abstarct Method
- Interface Cannot be Instanciated
- Interface donot have its own memory in the Heap
- Lambda Expression doesnot create class file
- Lambda Expression works only with functional Interface

# Important Points
- Class - Class -> extends
- Class - Interface -> implements
- interface - interface -> extends


- with the reference and the obj we can call only referene and obj methods and variables..