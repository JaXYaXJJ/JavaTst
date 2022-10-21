package Leha;

public class Figur {

    String Name;
    private float Area;
    float x;
    float y;
    String heb;
    String eng;

    public Figur (String initName, float a, float b) {
        System.out.println(initName);
        this.Name = initName;
        this.x = a;
        this.y = b;
    }

    public void printName () {
        System.out.println(this.Name);
    }

    public void calcArea () {
        System.out.println(this.x * this.y);
    }

    public String toString () {
        return this.eng + ":" + this.heb;
    }
}
