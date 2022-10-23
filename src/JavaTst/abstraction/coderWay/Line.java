package JavaTst.abstraction.coderWay;

public class Line extends Geom {

    int x1, y1;
    int x2, y2;

    Line (int pointAx, int pointAy, int pointBx, int pointBy) {
        this.x1 = pointAx;
        this.y1 = pointAy;
        this.x2 = pointBx;
        this.y2 = pointBy;
    }

    public void draw() {
        System.out.println("Draw a Line: width " + width + ", color " + color);
    }

    public void showCoords() {
        System.out.println("Line coords: " +
                "\nPoint A " + x1 + " " + y1 +
                "\nPoint B " + x2 + " " + y2);
    }
}
