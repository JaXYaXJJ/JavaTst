package JavaTst.abstraction.coderWay;

public class Main {
    public static void main(String[] args) {

        Geom lineOne = new Line (22, 12, 52, 12);
        lineOne.width = 10;
        lineOne.color = "Red";
        lineOne.draw();
        lineOne.showCoords();
    }
}
