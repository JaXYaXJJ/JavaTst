package JavaTst.abstraction;

abstract public class Car {
    String model;

    public abstract void go();
    public abstract void stop();
    public abstract void draw();

    public void setModel(String mode) {
        this.model = model;
    }
}
