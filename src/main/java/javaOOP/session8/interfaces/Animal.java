package javaOOP.session8.interfaces;

public interface Animal {

    // Fields in interface are implicitly public, static, and final
    // // No need to use the 'public static final' keywords
    String type = "Mammal"; // constant field

    // Abstract methods (Don't have a body)
    void makeSound();
    void eat();

    // Regular methods ( not allowed in interface prior to Java 8)
    /**
     * Default method in interface (allowed from Java 8 onwards)
     * It has a body and can be overridden by implementing classes

    void sleep() {
        System.out.println("Animal is sleeping Zzz...");
    }
     */

    default void run() {
        System.out.println("Animal is running.");
    }


}
