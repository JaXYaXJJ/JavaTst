import java.util.Scanner;

public class Tst {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Hello, pls enter your name: ");
        String name = in.nextLine();
        System.out.println("Hi, " + name + "!\nPls enter your age: ");
        int age = in.nextInt();

        if (age < 18)
            System.out.println("Sorry, U can't enter to this site");

    }
}
