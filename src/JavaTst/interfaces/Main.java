package JavaTst.interfaces;

public class Main {
    public static void main(String[] args) {

        final int N = 3;
        Geom figures[] = new Geom[N];
        figures[0] = new Line();
        figures[1] = new Rectangle();
        figures[2] = new Triangle();

        for(int i = 0; i < N; ++i)
            if(figures[i] instanceof IMathGeom) {
                double sum = ((IMathGeom) figures[i]).getSquare();
                System.out.println("figure #"+ i + ": square = " + sum);
            }

//        final int K = 4;
//        ICoordsGeom figuresCoords[] = new ICoordsGeom[K];
//        figuresCoords[0] = new Line();
//        figuresCoords[1] = new Rectangle();
//        figuresCoords[2] = new Triangle();
//
//        for(int i = 0; i < K; ++i) {
//            double coords[] = figuresCoords[i].getCoords();
//
//            for(int j = 0; j < coords.length; ++j)
//                System.out.println(coords[j] + " ");
//            System.out.println();
//        }

        Line l1 = new Line();
        l1.setCoord(1,10,1000,20);
    }
}
