package javaOOP.session7.inheritance;

public class Teacher extends Person{
    // Attributes
    private String teacherId;
    private String subject;

    // Constructors
    public Teacher(String name, int age, String address, String teacherId, String subject) {
        super(name, age, address);
        this.teacherId = teacherId;
        this.subject = subject;
        System.out.println("Teacher parameterized constructor called with name, age, address, teacherId, subject");
    }

    // Methods
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Teacher ID: " + teacherId);
        System.out.println("Subject: " + subject);
    }

    public void teach() {
        System.out.println(name + " is teaching " + subject + ".");
    }
}
