package org.example;

public class PetrolEngine implements IEngine{
    @Override
    public int startEngine() {
        System.out.printf("Petrol Engine.....");
        return 1;
    }
}
