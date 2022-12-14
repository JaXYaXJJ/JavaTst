//package MySQL;
//
//import java.sql.*;
//import java.util.ArrayList;
//
//public class Database {
//
//    public static void execute() throws ClassNotFoundException {
//
//        //Loading driver
////        Class.forName("com.mysql.jdbc.Driver");
//
//        //<Connection String>
//        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/books", "root", "root");
//            Statement stmt = con.createStatement())
//        {
//
//            String query = "SELECT title FROM book";
//            ResultSet rs = stmt.executeQuery(query);
//            ArrayList<String> arr = new ArrayList<>();
//
//            while (rs.next()) {
//                arr.add(rs.getString("title"));
//            }
//
//            System.out.println(arr);
//
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
//}