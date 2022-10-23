package JavaTst.interfaces;

public interface ICoordsGeom {

    int MIN_COORD = 0;
    int MAX_COORD = 100;

    static void showInterval() {
        System.out.println("Your correct coordinates interval is [" + MIN_COORD + "; " + MAX_COORD + "]");
    }

//    double[] getCoords();
}
