package javaOOP.session7.inheritance;

public class Person {
    // Attributes (Public > accessible from anywhere)
    public String name;
    public int age;
    public String address;

    // Constructors
    // Default constructor
    public Person () {
        this.name = "PersonName";
        this.age = 0;
        System.out.println("Person default constructor called");
    }
    // Parameterized constructor
    public Person (String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person parameterized constructor called");
    }

    // constructor overloading
    public Person (String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
        System.out.println("Person parameterized constructor with address called");
    }

    // Methods
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }

    public void celebrateBirthday() {
        age++;
        System.out.println("Happy Birthday " + name + "! You are now " + age + " years old.");
    }



}
