package MySQL.nadavEx;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Main {
    public static void main(String[] args) {

        /*
            db_url = jdbc:mysql://HOST/DATABASE
            db_driver = com.mysql.jdbc.Driver
            db_username = USERNAME
            db_password = PASSWORD

            jdbc:mysql://name:pass@localhost:3306
         */

        /*
            create table
         */

        try {
            Connection connection = Database.getConnection();

            PreparedStatement preparedStatement =
                    connection.prepareStatement("");

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getString(1));
                System.out.println(rs.getString(2));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
