package JavaTst.inheritance;

public class Properties extends Geom {
    int width, length;
    String color;
    int id = 1;
    private int num = 10; //private
    protected int no = 20; //protected

    public Properties() {
        super(1986);
    }

    Properties(int width, int length, String color) {
        this.width = width;
        this.length = length;
        this.color = color;
    }

    public int getNum() {
        return num;
    }

    void draw() {
        System.out.println("Method draw()");
    }
}
