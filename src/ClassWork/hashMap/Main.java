package ClassWork.hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main{
    public static void main(String[] args) {

        Sum s = new Sum();
        int[] indexes = s.findSum(new int[] {2,7,11,15}, 9);
        System.out.println(indexes[0] + " " + indexes[1]);

        Map<String, Integer> students = new HashMap<>();

        students.put("Ofir", 20);
        students.put("Limor", 28);
        students.put("Dan", null);

        students.put("Dan", 33);

        System.out.println(students);

        System.out.println(students.containsKey("Limor"));

        //System.out.println("Dan's age is: " + students.get("Dan"));

        Set<String> names = students.keySet();

//        for (String name : names)
//            System.out.println("Name: " + name + "Age: " + students.get(name));

        for (Map.Entry<String, Integer> entry : students.entrySet())
            System.out.println("Name: " + entry.getKey() + "Age: " + entry.getValue());
    }
}
