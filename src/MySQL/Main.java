package MySQL;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        MySQL sql = new MySQL();

        sql.query("SELECT title FROM Book", (rs) -> {
            while (rs.next())
                System.out.println(rs.getString("title"));
        });
    }
}
