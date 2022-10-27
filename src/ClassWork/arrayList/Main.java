package ClassWork.arrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args) {

        ArrayList<String> company = new ArrayList<>();
        company.add("Facebook");
        company.add("Twitter");
        company.add("Amazon");
        company.add("Google");
        company.add("Apple");

        System.out.println(company.size());
        System.out.println(company.get(0));

        String compOne = company.get(0);
        System.out.println(compOne);

        String compTwo = company.get(1);
        System.out.println(compTwo);

        String compThree = company.get(4);
        System.out.println("Best company: " + compOne + "\nSecond best company: " + compTwo + "\nLast company in the list: " + compThree);

        company.set(4, "Tesla");
        System.out.println(company);

        company.remove(4);
        System.out.println(company);
    }
}
