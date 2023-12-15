package day9.Task2;

public class Rectangle extends Figure{
    private int width = 0;
    private int height = 0;

    public Rectangle(int width, int height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return 2 * (width + height);
    }
}
