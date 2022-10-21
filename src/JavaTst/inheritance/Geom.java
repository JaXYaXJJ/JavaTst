package JavaTst.inheritance;

public class Geom {
    int id;

    Geom() {
        System.out.println("Constructor Geom()");
    }

    Geom(int id) {
        this.id = id;
        System.out.println("SUPER CONSTRUCTOR Geom()");
    }
}
