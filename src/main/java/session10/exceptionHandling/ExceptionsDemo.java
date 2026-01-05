package session10.exceptionHandling;

public class ExceptionsDemo {
    public static void main(String[] args) {
/**
 // Example 1: Handling ArithmeticException
 int x = 10;
 int y = 0;
 System.out.println(x/y); // This will throw ArithmeticException

 // Example 2: Handling ArrayIndexOutOfBoundsException
 int[] numbers = {1, 2, 3};
 System.out.println(numbers[5]); // This will throw ArrayIndexOutOfBoundsException
 */
        // using try-catch block to handle exceptions
        int x = 10;
        int y = 0;
        try {
            System.out.println(x / y);

        } catch (ArithmeticException e) {
            System.out.println(" Can't divide by zero " + e.getMessage());
        }

        int[] numbers = {1, 2, 3};
        try {
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(" Array index is out of bounds " + e.getMessage());
        }

        // using throw keyword to throw an exception
        int age = 15;
        if (age < 18) {
            throw new ArithmeticException(" Age is less than 18 ");
        } else {
            System.out.println(" You are eligible to vote ");
        }

        // using throws keyword to declare an exception
        // throws statement is used in method signature to declare an exception

    }

}

