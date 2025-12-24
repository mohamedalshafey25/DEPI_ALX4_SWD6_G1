package javaOOP.session7.inheritance;

public class GraduateStudent extends Student{

    // Additional attribute
    public String thesisTitle;

    // Constructor
    public GraduateStudent(String name, int age, String studentId, String thesisTitle) {
        // Call the constructor of the superclass (Student)
        super(name, age, studentId);
        this.thesisTitle = thesisTitle;
        System.out.println("GraduateStudent constructor called");
    }

    // Additional method
    public void displayThesisInfo() {
        System.out.println("Thesis Title: " + thesisTitle);
    }
}
