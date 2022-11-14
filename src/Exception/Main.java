package Exception;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) {

        myFunc();

        try {
            Utils.readFromFile();
        } catch (FileNotFoundException e) {
            System.out.println("Exception was caught!");
//            System.out.println(e.getClass().getCanonicalName());
        }

        System.out.println("I'm string writing code here...!");

        System.out.println("\n");


        int exampleArray[] = new int[5];
        int divisionResult;

        exampleArray[0] = 10;
        exampleArray[1] = 0;

        try {

            exampleArray[5] = 2;
            divisionResult = exampleArray[0] / exampleArray[1];

        } catch (ArithmeticException e) {
            System.out.println("Dividing by zero is not allowed!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("You cannot access an index which out of bounds!");
        } catch (Exception e) {
            System.out.println("Exception : " + e.getMessage());
        }

        System.out.println("Rest of code...!");

        System.out.println("\n");

    }


    public static void myFunc() {

        int intValue = 1;
        String str = "blabla";

        try {

            intValue = Integer.valueOf(str);

        } catch (Exception e) {
            System.out.println(e.getClass().getName());
            System.out.println("myFunc(): Exception was caught!");

            return;

        } finally {

            System.out.println("I'm inside finally block!");
        }

        System.out.println("After finally...!");
    }
}
