package HomeWork.hashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapClass {

    private Map<Integer, Integer> nums;

    HashMapClass() {

        nums = new HashMap<>();
    }

    public void put(int key, int value) {

        nums.put(key, value);
        if (nums.containsKey(key))
            nums.remove(value);
        System.out.println(nums);
    }

    public void get(int key) {

        if (nums.containsKey(key))
        System.out.println("Your key [" + key + "] value: " + nums.get(key));
    }

    public void remove(int key) {

        if (nums.containsKey(key))
            nums.remove(key);

        for (Map.Entry<Integer, Integer> entry : nums.entrySet())
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
    }

}
