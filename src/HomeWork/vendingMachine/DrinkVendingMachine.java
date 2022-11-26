package HomeWork.vendingMachine;

import HomeWork.vendingMachine.enums.EProducts;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DrinkVendingMachine implements IVendingMachine {

    @Override
    public void menu() {

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println("\n\t" + dateFormat.format(date) +
                "\n\nHello, pls select your drink." +
                "\n");
        for (EProducts products : EProducts.values()) {
            System.out.println
                    (products.getId() + ". " +
                            products.getName() + " " +
                            "[Price: " + products.getPrice() + " NIS]");
        }
    }

    @Override
    public void selectProduct() {

        System.out.println("\nYour choice: ");

        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();

        for (EProducts products : EProducts.values()) {
            if (userChoice == products.getId())
                System.out.println
                        ("Your choice: " + products.getName() +
                                ", pls insert " + products.getPrice() + " NIS");
        }
    }

    @Override
    public void calculate() {

    }
}
