package org.challenges.shapes;

public class Triangle implements Shape{
    private final double a;
    private final double b;
    private final double theta;

    public Triangle(int a, double b, double theta) {
        this.a = a;
        this.b = b;
        this.theta = theta;
    }

    @Override
    public double area() {
        return 0.5 * a * b * Math.sin(theta);
    }

    @Override
    public String details() {
        return "Triangle{a=" + a + ", b=" + b + ", theta=" + theta + "}";
    }
}
