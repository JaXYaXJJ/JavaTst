package JavaTst.inheritance;

public class Line extends Properties {
    double x1, y1;
    double x2, y2;
    int id = 2;

    Line() {
        super(0,0, "white");
        System.out.println("Constructor Line()");
    }

    void showId() {
        System.out.println("id = " + id + ", super.id = " + super.id);
    }

    @Override
    void draw() {
        System.out.println("draw a line");
    }
}
