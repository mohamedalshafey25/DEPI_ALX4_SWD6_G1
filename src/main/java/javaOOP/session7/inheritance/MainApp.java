package javaOOP.session7.inheritance;

public class MainApp {
    public static void main(String[] args) {
/**
        Person p1 = new Person();
        p1.displayInfo();

        Person p2 = new Person("Mohamed", 30);
        p2.displayInfo();

        Person p3 = new Person("Aisha", 25, "Elsayeda Aisha");
        p3.displayInfo();
 */
        Student s1 = new Student("Mohamed", 30, "Alex", "S1A", 'A');
//        s1.displayInfo();
        s1.getCount();

        Student s2 = new Student("Laila", 22, "Cairo");
        s2.getCount();

        Student s3 = new Student("Omar", 21, "Giza", "S2B", 'B');
        s3.getCount();

        System.out.println(Student.count); // Accessing static variable directly using class name
/**
        // Admin
        Admin a1 = new Admin("Sara", 28, "Mansoura", "A1");
        a1.displayInfo();
        a1.manageSystem();

        // Teacher
        Teacher t1 = new Teacher("Shafey", 50, "Quesna", "T1", "Testing");
        t1.displayInfo();
        t1.teach();
*/
    }

}
