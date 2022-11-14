package File;

import JavaTst.phoneBook.IO;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

//        File file = new File("C:\\Users\\ja-ya\\IdeaProjects\\JavaProject\\src\\File\\tst.txt");
//
//        boolean isFileCreated = file.createNewFile();
//        System.out.println(isFileCreated);

//        System.out.println(System.getProperty("user.dir")); //link


        File fileOne = new File(("NewDirectory TST"));

//        file.mkdir();
//        file.delete();


        File fileTwo = new File("."); //.file
        String[] list = fileTwo.list();

        for (String name : list)
            System.out.println(name);

    }
}
