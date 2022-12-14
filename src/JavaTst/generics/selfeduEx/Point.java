package JavaTst.generics.selfeduEx;

public class Point<T> {

    public T x, y;

    public static void main(String[] args) {

        Point<Integer> ptI = new Point<>();
        Point<Double> ptD = new Point<>();

        ptI.x = 10;
        ptI.y = 20;

        ptD.x = 10.5;
        ptD.y = 20.5;

        System.out.println(ptI.x + " " + ptI.y);
        System.out.println(ptD.x + " " + ptD.y);
    }
}


