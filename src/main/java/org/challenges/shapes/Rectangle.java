package org.challenges.shapes;

public class Rectangle implements Shape{
    protected final double width;
    private final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public String details() {
        return "Rectangle{width=" + width + ", height=" + height + "}";
    }
}
