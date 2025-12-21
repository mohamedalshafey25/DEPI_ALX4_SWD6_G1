package javaOOP.session7.inheritance;

public class Student extends Person{

    // Attributes
    private String studentId;
    private char grade;

    // static counter :
    public static int count = 0;

    // Constructors
    public Student (String name, int age, String address, String studentId, char grade) {
        super(name, age, address);
        this.studentId = studentId;
        this.grade = grade;
        System.out.println("Student parameterized constructor called with name , age, address, studentId, grade");
        count ++;
    }

    public Student (String name, int age, String address) {
        super(name, age, address);
        System.out.println("Student parameterized constructor called with name , age, address");
        count ++;
    }

    // Methods
    @Override
    public void displayInfo () {
        super.displayInfo();
        System.out.println("Student ID: " + studentId);
        System.out.println("Grade: " + grade);
    }

    public void study() {
        System.out.println(name + " is studying.");
    }

    // Getters and Setters
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    public void getCount() {
        System.out.println("Number of Student objects created: " + count);
    }

}
