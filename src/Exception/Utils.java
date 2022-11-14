package Exception;

import java.io.*;

public class Utils {

    public static void readFromFile() throws FileNotFoundException {

        FileInputStream file = new FileInputStream("Greeting");

//        try {
//            FileInputStream file = new FileInputStream("Greeting");
//        } catch (FileNotFoundException e) {
//            System.out.println(e.getClass().getCanonicalName());
//        }

    }

    public static void fileCopy() {

        try(BufferedInputStream input = new BufferedInputStream(new FileInputStream("readFile.txt"));
            BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream("writeFile.txt"))) {

        } catch (IOException e) {
            System.out.println("Exception...");
        }
    }
}
