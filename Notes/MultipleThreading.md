# Threads
- doing multiple task at the same time

- if two or more thing running in the same time, they called threads..

- schedular deside the time to excute the work multiple work
        
        # When we want to use Thread, we have two option
        1) use Thread class
        2) use Runnable Interface
- if you are working with thread, always try to use data which are Immutable 


# sleep
- use sleep method to stop the schedular for that number of time
- sleep method is written under the try catch block


# Runnable
- Thread is a class which implements Runnable Interface


# Thread States

        1)New  -- start() --> 
        2)Runnable -- run() --> 
        3)Running -- wait()/sleep() --> 
        4)Waiting OR -- stop() --> 
        5)Dead 
- New
- Runnable
- Running
- Waiting
- Dead