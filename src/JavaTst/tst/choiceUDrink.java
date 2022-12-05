package JavaTst.tst;

import java.util.Scanner;

public class choiceUDrink {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Pls choice your drink: ");

        String [] drinks = {"Cola", "Fanta", "Water", "Sprite"};

        int userChoice = 0;

        while (userChoice != -1) {
            userChoice = sc.nextInt();
            if (0 < userChoice && userChoice < 5)
                System.out.println("Your drink is: " + drinks[--userChoice]);
            else
                System.out.println("Error");
        }
    }
}
