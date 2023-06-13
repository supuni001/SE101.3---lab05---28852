package com.mycompany.p27;

public class InterfaceImplemented implements MyFirstInterface
{
    @Override
    public void display()
    {
        //cannot change the value of x 
        
        System.out.println("the value of x is "+x);
    }
}
