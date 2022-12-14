package MySQL.nadavEx2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Main {

    public static void insertStudent(Student student) throws Exception {

        Connection con = Database.getConnection();
        StringBuilder sb = new StringBuilder("insert into students (name,phone_number,age,gpa) values ( ");
        sb.append("'").append(student.getName())
                .append("'")
                .append(",'")
                .append(student.getPhone_number())
                .append("',")
                .append(student.getAge())
                .append(",")
                .append(student.getGpa())
                .append(")");
        PreparedStatement ps = con.prepareStatement(sb.toString());
        ps.execute();
    }


    public static Student getStringByPhone(String phone) throws Exception {

        Connection con = Database.getConnection();
        PreparedStatement ps = con.prepareStatement("SELECT * from students WHERE phone_number=?");
        ps.setString(1,phone);
        ResultSet rs = ps.executeQuery();
        return new Student(rs);
    }


    public static void main(String[] args) {

        try {

            Student student = getStringByPhone("0523912550");
            System.out.println(student);

//            insertStudent(
//                    new Student("Roni", "055012345", 20, 5.0)
//            );

//            Connection con = Database.getConnection();
//            PreparedStatement ps = con.prepareStatement("""
//                    create table students(
//                        name varchar(255),
//                        phone_number varchar(255) NOT NULL,
//                        age int,
//                        gpa double NOT NULL
//                    );
//                 """);

//            PreparedStatement ps = con.prepareStatement("""
//                    insert into students (name,phone_number,age,gpa) values ('Kurt', '0523912550', 37, 88.2)
//                    """);

            /*
                'Sharon', '0523912542', 33, 78.2
                'Dorin', '0523912543', 22, 86
                'Ofer', '0523912544', 26, 69.1
                'Haviv', '0523912545', 30, 93.7
                'Dor', '0523912546', 28, 97.12
                'Eli', '0523912547', 29, 86
                'Dorel', '0523912548', 26, 76
             */

//            if(ps.execute()) {
////                System.out.println("Created students table successfully");
//                System.out.println("Insert a student to the table successfully");
//            } else {
//                System.out.println("There was an error creating student table");
//            }
//
//            ps.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
