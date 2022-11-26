package JavaTst.fileOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Main {
    public static void main(String[] args) throws IOException {

        String tst = "Hello";
        String tst2 = " World!";

        String tst3 = "\nthis txt on new string";
        String tst4 = "one more txt";

        FileOutputStream stream = new FileOutputStream
                ("C://Users/ja-ya/Desktop/Tst/tstJava/File/tst.fileOutputStream.txt", true);
//        byte [] buffer = tst.getBytes();
//        stream.write(buffer);
//
//        buffer = tst2.getBytes();
//        stream.write(buffer);
//
//        buffer = tst3.getBytes();
//        stream.write(buffer);

        PrintStream printStream = new PrintStream(stream);
        printStream.println(tst + tst2 + tst3);
        printStream.println(tst4);
    }
}
