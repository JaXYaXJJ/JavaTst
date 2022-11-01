package HomeWork.hashMap;

public class Main {
    public static void main(String[] args) {

        HashMapClass myList = new HashMapClass();
        myList.put(1, 10);
        myList.put(2, 20);
        myList.put(3, 30);
        myList.put(2, 400);
        myList.get(3);
        myList.remove(1);
    }
}
