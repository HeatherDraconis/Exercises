package org.challenges.shapes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Geometry {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Triangle(3,4, 1.57));
        shapes.add(new Triangle(7,1, 3.01));
        shapes.add(new Rectangle(5, 3));
        shapes.add(new Rectangle(6, 4));
        shapes.add(new Square(4));
        shapes.add(new Square(3));
        shapes.sort(Comparator.comparingDouble(Shape::area));
        for (Shape shape: shapes) {
            System.out.println(shape.details());
        }
    }
}
