package MySQL.nadavEx2;

import java.sql.ResultSet;

public class Student {

    private String name;
    private String phone_number;
    private int age;
    private double gpa;


    public Student(String name, String phone_number, int age, double gpa) {
        this.name = name;
        this.phone_number = phone_number;
        this.age = age;
        this.gpa = gpa;
    }

    public Student(ResultSet set) throws Exception {
        if (set.next()) {
            this.name = set.getString(1);
            this.phone_number = set.getString(2);
            this.age = set.getInt(3);
            this.gpa = set.getDouble(4);
        } else {
            throw new Exception("No data at result set for student...");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", age=" + age +
                ", gpa=" + gpa +
                '}';
    }
}
