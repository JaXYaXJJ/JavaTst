package Leha;

public class Main {
    public static void main(String[] args) {

        Figur myFigur = new Figur(
                "F1",
                10,
                20
        );

        Figur myFigurTwo = new Figur(
                "F2",
                30,
                40
        );

        myFigur.printName();
        myFigur.calcArea();
        myFigurTwo.calcArea();

        String str1 = "hi";
        str1.length();

        Tst a1 = new Tst();
        int result = a1.f2(5);
        System.out.println(result);
        int result2 = a1.f3(155589);
        System.out.println(result2);
    }
}
