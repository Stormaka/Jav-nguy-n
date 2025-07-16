abstract class Polygon {
    public abstract double area();
}

class Triangle extends Polygon {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }
}

class Rectangle extends Polygon {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
}

public class TestPolygon {
    public static void main(String[] args) {
        Polygon triangle = new Triangle(6, 4);
        Polygon rectangle = new Rectangle(5, 3);
//Vì polygon là lớp cha nên có thể chứa các đối tượng của lớp con Triangle và Rectangle
        System.out.println("Triangle area: " + triangle.area());
        System.out.println("Rectangle area: " + rectangle.area());
    }
}
