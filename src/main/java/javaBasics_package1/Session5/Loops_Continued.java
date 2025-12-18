package javaBasics_package1.Session5;

public class Loops_Continued {
    public static int balance = 10000;

    public static void main(String[] args) {

        // Break statement
//        for (int x = 1; x <= 10; x++) {
//            System.out.println("X : " + x);
//            if (x == 5) {
//                break;
//            }
//        }

        // Continue
//        for (int i=1; i<=10 ; i++){
//            if (i == 5) {
//                continue;
//            }
//            System.out.println("I : "+i);
//        }


        // While loop
        int counter = 1;
        while (counter <= 10) {
            System.out.println("process No. : " + counter);
            withdraw(1000);
            if (counter == 10){
                break;
            }
            counter++;
        }
        System.out.println("Withdraw process numbers: " + counter);


        // Do - While
        boolean isLoggedIn = true;
        do {
            System.out.println("Hola !");
        } while (isLoggedIn == true);


    }



    public static void withdraw(int withdrawalValue){
        balance -= withdrawalValue; // balance = balance - withdrawalValue;
        System.out.println("Withdraw: " + withdrawalValue);
        System.out.println("Balance: " + balance);
        System.out.println("End of withdrawal.");
    }
}
