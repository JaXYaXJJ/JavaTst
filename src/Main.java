import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double sum = 0;

        double [] numbers = new double[5];

        for (int i = 0; i < numbers.length; i++) {

            System.out.println("Pls enter element num " + (i + 1));
            numbers[i] = sc.nextDouble();

            sum += numbers[i];

        }

        System.out.println("The average is " + (sum/numbers.length));

    }
}