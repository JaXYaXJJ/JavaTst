package JavaTst.database;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseManager {
    private static volatile Connection conn; //Singleton
    private static Object lock = new Object();

    public static Connection getConnection() throws IOException, SQLException {
        synchronized (lock) {
            if (conn == null) { //Create connection
                Properties props = getDatabaseProperties();
                conn = DriverManager.getConnection(
                        "jdbc:mysql://"
                        + props.getProperty("USER") + ":"
                        + props.getProperty("PASS") + "@"
                        + props.getProperty("HOST") + ":"
                        + props.getProperty("PORT") + "/"
                        + props.getProperty("DB")
                );
            }
        }
        return conn;
    }
    private static Properties getDatabaseProperties() throws IOException {
        Properties props = new Properties();
        InputStream inputStream = new FileInputStream("src/JavaTst/database/config.properties");
        props.load(inputStream);
        return props;
    }
}
