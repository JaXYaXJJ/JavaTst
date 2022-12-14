package Thread.futureNadavEx;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Main {

    public static String read() throws IOException {

        // A - File file = new File("/Users/name/IdeaProjects/Exercise/src/names.txt")

        // B - Paths.get("src", "data", "names.txt")

        Path path = Paths.get("src", "Thread", "futureNadavEx", "data", "names");
        File file = path.toFile();
        FileReader reader = new FileReader(file);
        char[] data = new char[50];
        int success = reader.read(data);
        String string = "";
        for (char c : data) {
            if (c == '\0') //'\0' == null char
                break;
            string += c;
        }
        return string;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        System.out.println("Hello World");

        CompletableFuture<String> future = CompletableFuture.supplyAsync( () -> {
            try {
                return read();
            } catch (Exception e) {
                System.out.println(e.getLocalizedMessage());
            }
            return null;
        });

        String str = future.get();
        System.out.println(str);
    }
}
