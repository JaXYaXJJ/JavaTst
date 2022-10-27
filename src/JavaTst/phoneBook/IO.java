package JavaTst.phoneBook;

import java.util.Scanner;

public class IO {

    private static final Scanner in = new Scanner(System.in);

    public static String getString(String message) {
        System.out.println(message);
        return in.next();
    }
}