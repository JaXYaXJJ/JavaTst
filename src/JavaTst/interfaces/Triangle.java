package JavaTst.interfaces;

public class Triangle extends Geom implements IMathGeom, ICoordsGeom {

    @Override
    void draw() {
        System.out.println("Draw a Triangle");
    }

    public double getSquare() {
        return 0.5*4*10;
    }

//    @Override
//    public double[] getCoords() {
//        return new double[] {30, 40, 50, 60};
//    }
}
