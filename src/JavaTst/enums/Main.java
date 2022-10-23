package JavaTst.enums;

public class Main {
    public static void main(String[] args) {

        final int N = 3;
        Geom geomLink[] = new Geom[N];

        geomLink[0] = new Line(EGeomType.LINE);
        geomLink[1] = new Point(EGeomType.POINT);
        geomLink[2] = new Line(EGeomType.LINE);

//        System.out.println(EGeomType.POINT.getClass());

//        for(EGeomType type: EGeomType.values())
//            System.out.println(type + " = " + type.ordinal());

//        for(Geom figure: geomLink)
//            switch (figure.type) {
//                case POINT:
//                    ((Point)figure).getPointMethod();
//                    break;
//                case LINE:
//                    ((Line)figure).getLineMethod();
//                    break;
//            }
//        if (geomLink[0].type == EGeomType.LINE) {
//            System.out.println("It`s LINE");
//        } else {
//            System.out.println("FALSE");
//        }

        for (Geom figure: geomLink) {
            String value = figure.type.getValue();
            System.out.println(value);
        }
    }
}
