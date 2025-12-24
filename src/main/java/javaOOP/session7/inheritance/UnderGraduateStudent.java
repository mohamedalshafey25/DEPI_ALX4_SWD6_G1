package javaOOP.session7.inheritance;

public class UnderGraduateStudent extends Student{

    // Additional attribute
    public String major;

    // Constructor
    public UnderGraduateStudent(String name, int age, String studentId, String major) {
        // Call the constructor of the superclass (Student)
        super(name, age, studentId);
        this.major = major;
        System.out.println("UnderGraduateStudent constructor called");
    }

    // Additional method
    public void displayMajorInfo() {
        System.out.println("Major: " + major);
    }
}
