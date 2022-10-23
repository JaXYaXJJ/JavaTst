package JavaTst.interfaces;

public class Rectangle extends Geom implements IMathGeom, ICoordsGeom {

    @Override
    void draw() {
        System.out.println("Draw a Rectangle");
    }

    public double getSquare() {
        return 5*10;
    }

//    @Override
//    public double[] getCoords() {
//        return new double[] {10, 20, 30, 40};
//    }
}
