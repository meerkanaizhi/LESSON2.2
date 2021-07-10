package com.company;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("\uD83D\uDD34");

    }

    @Override
    public int calculatePerimeter() {
        return (int)((Math.PI * radius) * 2);
    }


}
