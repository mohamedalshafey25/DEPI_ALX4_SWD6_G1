package javaOOP.session6;

public class MethodOverloading {
    public static void main(String[] args) {
        sum(5,6);
        sum(10,20,5);
        sum(10.5, 11.25);
        sum(10, 20 , 30.5);

    }


    // Method different declarations / signatures.

    public static void sum(int x, int y) {
        System.out.println("Sum of two integers = " + (x+y));
    }
    public static void sum(int x, int y, int z) {
        System.out.println("Sum of three integers = " + (x+y+z));
    }
    public static void sum(double x, double y) {
        System.out.println("Sum of two doubles = " + (x+y));
    }
    public static void sum(int x, int y, double z) {
        System.out.println("Sum of two integers and one double = " + (x+y+z));
    }

}
