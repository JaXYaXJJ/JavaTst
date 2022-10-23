package JavaTst.interfaces;

public class Line extends Geom implements ICoordsGeom {

    private int x1, y1, x2, y2;

    @Override
    void draw() {
        System.out.println("Draw a Line");
    }

    private boolean isCheck(int x) {
        return (MIN_COORD <= x && x <= MAX_COORD);
    }

    void setCoord(int x1, int y1, int x2, int y2) {
        if(isCheck(x1) && isCheck(y1) && isCheck(x2) && isCheck(y2)) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        } else {
            System.out.println("FALSE");
            ICoordsGeom.showInterval();
        }
    }

//    @Override
//    public double[] getCoords() {
//        return new double[] {1, 2, 3, 4};
//    }
}
