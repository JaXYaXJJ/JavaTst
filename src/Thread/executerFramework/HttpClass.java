package Thread.executerFramework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class HttpClass {

    public static String downloadWebPage(String url) throws IOException {

        StringBuilder result = new StringBuilder();

        String line;

        URLConnection urlConnection = new URL(url).openConnection();
        urlConnection.addRequestProperty("User-Agent","Mozilla");
        urlConnection.setReadTimeout(5000);
        urlConnection.setConnectTimeout(5000);

        try (InputStream input = urlConnection.getInputStream();
             BufferedReader br = new BufferedReader(new InputStreamReader(input))) {

            while ( (line = br.readLine()) != null ) {
                result.append(line);
            }
        }
        return result.toString();
    }
}
