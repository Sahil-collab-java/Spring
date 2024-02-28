package org.example;

public class DieselEngine implements IEngine{
    @Override
    public int startEngine() {
        System.out.println("Diesel Engine......");
        return 1;
    }
}
