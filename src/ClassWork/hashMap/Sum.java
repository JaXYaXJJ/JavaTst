package ClassWork.hashMap;

import java.util.HashMap;
import java.util.Map;

public class Sum {

//    private int[] indexes;
//
//    public Sum() {
//        indexes = new int[2];
//    }
//
//    public int[] findSum(int [] numbers, int target) {
//
//        for (int i = 0; i < numbers.length - 1; i++) {
//
//            for (int j = i + 1; j < numbers.length; j ++) {
//
//                if (numbers[i] + numbers[j] == target) {
//
//                    indexes[0] = i;
//                    indexes[1] = j;
//
//                    return indexes;
//
//                }
//            }
//        }
//        System.out.println("Pair not found!");
//        return null;
//    }

    /**
     *
     * [2,7,11,15]
     * x + y = target
     * target - y = x
     * containsKey(Target - numbers[i])
     *
     * input -> nums = [5,2,4], target = 6
     * output -> [1,2]
     *
     * if (6 - 5) exists in HashMap
     * put(5, 0)
     *
     * if (6 - 2) exists in HashMap
     * put(2, 1)
     *
     * if (6 - 4) exists in HashMap
     *
     */

    private int[] indexes;

    public Sum() {
        indexes = new int[2];
    }

    public int[] findSum(int[] numbers, int target){

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {

            if (map.containsKey(target - numbers[i])) {

                indexes[1] = i;
                indexes[2] = map.get(target - numbers[i]);

                return indexes;
            }

            map.put(numbers[i],i);
        }
        return indexes;
    }
}
