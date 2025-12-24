package javaOOP.session8.abstraction;

public class MainAppDemo {
    public static void main(String[] args) {
        //      Animal animal = new Animal(); // This line will cause a compilation error because we cannot instantiate an abstract class

        Animal smallCow = new Cow(); // Upcasting (Animal reference to a Cow object)
        Cow bigCow = new Cow(); // Direct Cow object reference to Cow object

        smallCow.makeSound();
        smallCow.eat();
        smallCow.sleep();

        bigCow.makeSound();
        bigCow.eat();
        bigCow.sleep();
        bigCow.produceMilk(); // Calling method specific to Cow class

        Animal smallHorse = new Horse();
        Horse bigHorse = new Horse();

        smallHorse.makeSound();
        smallHorse.eat();
        smallHorse.sleep();

        bigHorse.makeSound();
        bigHorse.eat();
        bigHorse.sleep();
        bigHorse.run(); // Calling method specific to Horse class






    }
}
