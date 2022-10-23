package JavaTst.enums;

public class Point extends Geom {

    Point(EGeomType type) {
        this.type = type;
    }

    void getPointMethod() {
        System.out.println("Class Point");
    }
}
