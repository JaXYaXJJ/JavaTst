package JavaTst.database;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserRepository {

    //C R U D

    //Create and return
    public User saveUser(User user) {
        try {
            Connection conn = DatabaseManager.getConnection();
            PreparedStatement ps =
                    conn.prepareStatement("INSERT INTO users (email, password) VALUES(?, ?)");
            ps.setString(1, user.getEmail());
            ps.setString(2, user.getPassword());
            ps.execute();
            ps.close();
            return user;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public User getUserByEmail(String email) {
        try {
            Connection conn = DatabaseManager.getConnection();
            PreparedStatement ps =
                    conn.prepareStatement("SELECT * from users WHERE email = ?");
            ps.setString(1, email);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                String userEmail = rs.getString(2);
                String userPassword = rs.getString(3);
                return new User(userEmail, userPassword);
            }
            throw new UserPrincipalNotFoundException("user not found");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
