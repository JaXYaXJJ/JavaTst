package ClassWork.file;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

//        File file = new File("src");
//
//        String[] list = file.list((file1,fileName) -> !fileName.endsWith(".txt"));
//
//        for (String element: list) {
//            System.out.println(element);


        //Array with 3 elements, holding the names of the files to be created
        String[] fileNames = new String[]{"image.png","project.log","greetings.txt"};

        //Holding the path of the folder
        File directory = new File("C:\\Users\\abouchri\\Javalecture\\src\\exercise");

        //Creating directory
        directory.mkdir();


        //Creating files inside exercise folder
        for (String element : fileNames) {
            File file = new File("src\\exercise\\" + element);
            file.createNewFile();
        }


        //Looping through filtered files, and printing them to the console
        for (String filteredFile : directory.list(new FileFilter()))
            System.out.println(filteredFile);

    }
}
