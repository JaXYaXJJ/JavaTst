package MySQL.nadavEx2;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class Database {

    private final static String configFilePath = "src/MySQL/nadavEx2/config.properties";

    private static Connection con;

    private Database(){}

    public static Connection getConnection() throws Exception {
        if(con == null) {

            //DB_URL=jdbc:mysql://root:root@localhost:3306/myTst

            Properties props = new Properties();
            FileInputStream fileInputStream = new FileInputStream(configFilePath);
            props.load(fileInputStream);
            fileInputStream.close();

            String db = props.getProperty("DB");
            String port = props.getProperty("PORT");
            String user = props.getProperty("USER");
            String pass = props.getProperty("PASS");
            String host = props.getProperty("HOST");
            String driver = props.getProperty("DRIVER");

            con = DriverManager.getConnection(driver+"://"+user+":"+pass+"@"+host+":"+port+"/"+db);
        }
        return con;
    }
}
