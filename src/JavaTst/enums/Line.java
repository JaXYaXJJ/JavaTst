package JavaTst.enums;

public class Line extends Geom {

    Line(EGeomType type) {
        this.type = type;
    }

    void getLineMethod() {
        System.out.println("Class Line");
    }
}
