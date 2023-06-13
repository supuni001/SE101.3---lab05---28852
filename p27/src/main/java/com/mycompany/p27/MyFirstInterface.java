package com.mycompany.p27;

public interface MyFirstInterface 
{
    int x =1;
    //final public static int x=1;
    //if this variable is final,we cannot change the value of the variable(error occurs)
    //if this is static,this only belongs this declared class
    //all variables declared inside an interface are by default public,final, static whwther it's implicity stated or not
    
    void display(); //abstract method
    // if we declare a method inside the interface,its always an abstract method
    //abstract void display();
}
