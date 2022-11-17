package File.buffer;

import java.io.*;

public class Main {

    private static String inputFileName = "Stormtrooper #01.jpg";
    private static String outputFileName = "“Dark Side” by Jerkface.jpg";

    public static void fileCopy() {

        //Variables for calculating the time it took for the copy operation
        long startTime, endTime;

        File inputFile = new File(inputFileName);

        System.out.println("File size is " + inputFile.length());

        //Try with resources

        try (FileInputStream input = new FileInputStream(inputFileName);
             FileOutputStream output = new FileOutputStream(outputFileName)) {

            //Returns Nano Seconds, popular unit for timing IO operations
            startTime = System.nanoTime();

            //Read method return int
            //1 Byte = 8 bits = 256 values

            int byteReader;

            //Reading and writing to/from files
            while ((byteReader = input.read()) != -1) {

                output.write(byteReader);
            }

            //Calculating end time after reading and writing to file
            endTime = System.nanoTime();

            //Printing the time elapsed
            System.out.println("Elapsed time " + (endTime - startTime) / 1000000);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

        public static void main(String[] args) {

        fileCopy();

    }
}
