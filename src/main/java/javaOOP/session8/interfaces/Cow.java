package javaOOP.session8.interfaces;

public class Cow implements Animal{

    // constructor
    public Cow() {
        System.out.println("A cow is created.");
    }

    // Implement abstract methods
    @Override
    public void makeSound() {
        System.out.println("Cow says: Moo Moo");
    }
    @Override
    public void eat() {
        System.out.println("Cow is eating grass.");
    }

    // Additional method specific to Cow class (Regular method)
    public void produceMilk() {
        System.out.println("Cow is producing milk.");
    }
}
