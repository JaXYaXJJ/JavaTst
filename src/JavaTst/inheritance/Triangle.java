package JavaTst.inheritance;

public class Triangle extends Properties {
    double x1, y1;
    double x2, y2;
    double x3, y3;

    Triangle () {
        super(5, 10, "yellow");
        System.out.println("Constructor Triangle()");
    }

    @Override
    void draw() {
        System.out.println("draw a triangle");
    }
}
