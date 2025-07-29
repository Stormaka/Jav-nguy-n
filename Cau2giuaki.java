interface IShape {
    double PI = 3.14;
    double getArea();
    double getPerimeter();
    void showInfo();
}

class Circle implements IShape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * PI * radius;
    }

    public void showInfo() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }
}

class Rectangle implements IShape {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }

    public void showInfo() {
        System.out.println("Width: " + width);
        System.out.println("Length: " + length);
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }
}

public class Main {
    public static void main(String[] args) {
        IShape circle = new Circle(25.5);
        IShape rectangle = new Rectangle(5, 12);
        circle.showInfo();
        rectangle.showInfo();
    }
}
