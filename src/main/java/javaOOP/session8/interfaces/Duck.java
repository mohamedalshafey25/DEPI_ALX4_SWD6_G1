package javaOOP.session8.interfaces;

public class Duck implements Swimmable, Flyable, Animal {

    // constructor
    public Duck() {
        System.out.println("A duck is created.");
    }

    // Implement abstract methods
    @Override
    public void makeSound() {
        System.out.println("Duck says: Quack Quack");
    }

    @Override
    public void eat() {
        System.out.println("Duck is eating aquatic plants.");
    }

    // Additional method specific to Duck class (Regular method)
    @Override
    public void swim() {
        System.out.println("Duck is swimming.");
    }

    @Override
    public void fly() {
        System.out.println("Duck is flying.");
    }
}
