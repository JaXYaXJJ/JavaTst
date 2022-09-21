package JavaTst;

import java.util.Scanner;

public class Tst {
    public static void main(String[] args) {

        WineType wineLink;
        wineLink = new WineType();

        Scanner in = new Scanner(System.in);
        System.out.print("Hello, pls enter your name: ");
        String name = in.nextLine();
        System.out.println("Hi, " + name + "!\nPls enter your age: ");
        int age = in.nextInt();

        if (age < 18)
            System.out.println("Sorry, U can't visit this site");
        else
            System.out.println(name + ", pls choice wine category.\n" +
                    "For white wine press: 1\n" +
                    "For rose wine press: 2\n" +
                    "For red wine press: 3\n" +
                    "For sparkling wine press: 4\n" +
                    "For dessert wine press: 5\n" +
                    "For fortified wine press: 6");


        String [] wineCategory = {"White", "Rose", "Red", "Sparkling", "Dessert", "Fortified"};
        int userChoice = 0;

        while (userChoice != -1) {
            userChoice = in.nextInt();
            if (0 < userChoice && userChoice <= 6) {
                System.out.println("Your category is: " + wineCategory[--userChoice]);

                System.out.println("Pls choice your type of red wine.\n"+
                        "For Pinot Noir press: 1\n" +
                        "For Bordeaux press: 2\n" +
                        "For Merlot press: 3\n" +
                        "For Shiraz press: 4\n" +
                        "For Malbec press: 5\n" +
                        "For Cabernet Sauvignon press: 6");
                wineCategory = wineLink.red;
                int redType = 0;

                while (redType != -1) {
                    redType = in.nextInt();
                    if (0 < redType && redType <= 6)
                    System.out.println("Your red type is: " + wineLink.red[--redType]);
                }
            }
            else
                System.out.println("Wrong choice, try again");
        }
    }
}
