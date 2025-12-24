package javaOOP.session8.abstraction;

public class Horse extends Animal{

    // constructor
    public Horse() {
        System.out.println("A horse is created.");
    }

    // Implement abstract methods
    @Override
    public void makeSound() {
        System.out.println("Horse says: Neigh Neigh");
    }

    @Override
    public void eat() {
        System.out.println("Horse is eating hay.");
    }

    // Additional method specific to Horse class (Regular method)
    public void run() {
        System.out.println("Horse is running fast.");
    }
}
