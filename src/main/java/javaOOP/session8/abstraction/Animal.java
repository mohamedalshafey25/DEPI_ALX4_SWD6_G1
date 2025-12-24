package javaOOP.session8.abstraction;

// Abstract class is a class that cannot be instantiated
// and is declared using the abstract keyword
// It can have abstract methods (methods without a body)
// and concrete methods (methods with a body)
// It is used as a base class for other classes to inherit from
// An abstract class can have constructors, fields, and methods
public abstract class Animal {
    // constructor
    public Animal() {
        System.out.println("An animal is created.");
        System.out.println("end of animal constructor");
    }

    // Abstract methods (Don't have a body)

    public abstract void makeSound();
    public abstract void eat();

    // Regular method (Concrete method)
    public void sleep() {
        System.out.println("Animal is sleeping Zzz...");
    }



}
