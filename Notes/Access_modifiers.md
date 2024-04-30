# Access Modifiers

1) PUBLIC 

- when methods or variables are in different package or folder they cannot be access without public keyword
- if they are in same package then can be access wihtout the public keyowrd
- They can be access from anywhere...


2) PRIVATE
- Private Methods and variable cannot be access outside of its class
- they can access in just same class..


3) DEFAULT
- if the variable and the method is not private or public, they beDefault Default type
- Default Methods and variables can be access all over its package or folder
- cannot use outside of its package

4) PROTECTED
- Cannot use Outside of its package
- you can only access protected method or varialbe outside of its package if it is a subClass or inherited


# Which One better and How do we use ???
- Make Class Public
- Try Ti kept Your Instance Variable Private
- Method Most of the time is Public but if the method is get accessed in different package by its subClass make it Protected


# Note
- Donot use Default