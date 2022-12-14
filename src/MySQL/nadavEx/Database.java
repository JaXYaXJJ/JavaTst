package MySQL.nadavEx;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class Database {
    private static final String configFilePath = "src\\MySQL\\nadavEx\\config.properties";
    private static Connection connection;

    private Database() {}

    public static Connection getConnection() throws Exception {
        if(connection == null) {
            Properties prop = new Properties(); // this class is available in Java
            FileInputStream ip = new FileInputStream(configFilePath);
            prop.load(ip);
            String dbUrl = prop.getProperty("DB_URL");
            connection = DriverManager.getConnection(dbUrl);
        }
        return connection;
    }
}
