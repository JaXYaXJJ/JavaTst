package SOLID;

//OPC

public class AreaCalculator {

//    public Double calculateRectangleArea(Rectangle rectangle) {
//
//        return rectangle.getLength() * rectangle.getWidth();
//    }
//
//    public Double calculateCircleArea(Circle circle) {
//
//        return Math.PI * circle.getRadius() * circle.getRadius();
//    }

    public Double calculateShapeArea(IShape iShape) {
        return iShape.calculateArea();
    }
}
