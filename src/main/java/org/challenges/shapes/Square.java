package org.challenges.shapes;

public class Square extends Rectangle {
    public Square(double width) {
        super(width, width);
    }

    @Override
    public String details() {
        return "Square{width=" + width + "}";
    }
}
