package SOLID;

public class Circle implements IShape {

    public Double radius;

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public Double calculateArea() {
        return Math.PI * radius * radius;
    }
}
