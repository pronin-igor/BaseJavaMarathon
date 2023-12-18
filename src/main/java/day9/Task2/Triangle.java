package day9.Task2;

public class Triangle extends Figure{
    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c, String color) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double area() {
        double halfOfPerimeter = perimeter() / 2;
        return Math.sqrt(halfOfPerimeter * (halfOfPerimeter - a) * (halfOfPerimeter - b) * (halfOfPerimeter - c));
    }

    public double perimeter() {
        return a + b + c;
    }
}
