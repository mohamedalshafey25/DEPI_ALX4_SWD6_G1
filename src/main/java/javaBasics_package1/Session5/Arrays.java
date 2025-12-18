package javaBasics_package1.Session5;

public class Arrays {
    public static void main(String[] args) {


        // Array of Int
        int[] numbers = new int[5];
        int[] number = {1, 2, 3, 4, 5};

        number[0] = 5;
//        System.out.println(numbers[3]);

        // Enhanced for
        for (int j : number) {
            System.out.println("number : " + j);
        }

//        for (int i=0; i<number.length; i++) {
//            System.out.println("number : " + number[i]);
//        }
        }
}