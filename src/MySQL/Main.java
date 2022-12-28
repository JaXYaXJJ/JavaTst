package MySQL;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        MySQL sql = new MySQL();

//        sql.query("SELECT title FROM Book", (rs) -> {
//            while (rs.next())
//                System.out.println(rs.getString("title"));
//        });

        sql.perform("CREATE TABLE IF NOT EXISTS Students " + "(" +
                "name VARCHAR(200), " +
                "phone_number VARCHAR(20) PRIMARY KEY NOT NULL," +
                "age INT, " +
                "gpa DOUBLE NOT NULL)");

        sql.perform("INSERT IGNORE INTO Students (name,phone_number,age,gpa) VALUES " +
                "()," +
                "()," +
                "()," +
                "()");
    }
}
