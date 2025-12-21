package javaOOP.session7.inheritance;

public class Admin extends Person{
    // Attributes
    private String adminId;

    // Constructors
    public Admin(String name, int age, String address, String adminId) {
        super(name, age, address);
        this.adminId = adminId;
        System.out.println("Admin parameterized constructor called with name, age, address, adminId");
    }

    // Methods
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Admin ID: " + adminId);
    }

    public void manageSystem() {
        System.out.println(name + " is managing the system.");
    }
}
