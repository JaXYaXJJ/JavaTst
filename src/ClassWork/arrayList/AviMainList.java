package ClassWork.arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class AviMainList {
    public static void main(String [] args) {

        List<String> topCompanies = new ArrayList<>();

//        System.out.println("Is the topCompanies list empty? : " + topCompanies.isEmpty());

        topCompanies.add("Google");
        topCompanies.add("Apple");
        topCompanies.add("Microsoft");
        topCompanies.add("Amazon");
        topCompanies.add("Facebook");

        System.out.println("Here are the top " + topCompanies.size() + " companies in the world!");

        System.out.println(topCompanies);

        String bestCompany = topCompanies.get(0);
        String secondBestCompany = topCompanies.get(1);
        String lastBestCompany = topCompanies.get(topCompanies.size() - 1);
        System.out.println("Best company: " + bestCompany);
        System.out.println("Second best company: " + secondBestCompany);
        System.out.println("Last best company: " + lastBestCompany);

        topCompanies.set(3, "Tesla");
        topCompanies.remove(4);

        System.out.println("\n");
        System.out.println("Modified top companies list " + topCompanies);

        topCompanies.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.endsWith("e");
            }
        });

        System.out.println("\n");
        System.out.println(topCompanies);

        topCompanies.removeIf((String s) -> {return s.endsWith("e");}); //lambda
        System.out.println("lambda: " + topCompanies);

        Predicate<String> condition = (String s) -> s.startsWith("M") || s.endsWith("e"); //lambda
        topCompanies.removeIf(condition);
        System.out.println("lambda: " + topCompanies);
    }
}
