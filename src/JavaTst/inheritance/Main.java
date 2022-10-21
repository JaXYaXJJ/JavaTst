package JavaTst.inheritance;

public class Main {
    public static void main(String[] args) {

//        Properties geom[] = new Properties[4];
//        geom[0] = new Line();
//        geom[1] = new Triangle();
//        geom[2] = new Rectangle();
//        geom[3] = new Ellipse();

        Line l1 = new Line();
        Triangle t1 = new Triangle();

        l1.width = 1;
        l1.color = "Red";
        l1.x1 = 5;
        l1.showId();

        Properties p = (Properties)l1;
        p.color = "Black";

        System.out.println(l1.getNum());
        System.out.println(l1.no);

        l1.draw();
        t1.draw();
    }
}
