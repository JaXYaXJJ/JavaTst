package SOLID.Dependency;

public class Main {
    public static void main(String[] args) {

        MySQL mySQL = new MySQL();
        NoSQL noSQL = new NoSQL();

        Yad2 yad2MySQL = new Yad2(mySQL);
        Yad2 yad2NoSQL = new Yad2(noSQL);

        yad2MySQL.save();
        yad2NoSQL.save();
    }
}
