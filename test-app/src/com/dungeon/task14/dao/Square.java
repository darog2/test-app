package com.dungeon.task14.dao;

public class Square extends Figure {

    public Square(double edge) {
        edgesCount = 4;
        for (int i = 0; i < edgesCount; i++) {
            edges.add(edge);
        }
    }

    @Override
    public double calculateArea() {
        System.out.println("square = " + (edges.get(0) * edges.get(0)));
        return 0;
    }

    @Override
    public double calculatePerimeter() {
        double perimeter = 0;
        for (int i = 0; i < edgesCount; i++) {
            perimeter += edges.get(i);
        }
        System.out.println("perimetr = " + perimeter);
        return 0;
    }
}
