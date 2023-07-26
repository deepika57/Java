package com.qa;

public class Circle extends Shape{

    private double radius;
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}' + super.toString();
    }

    public Point getCentrePoint() {
        return new Point(getX(), getY());
    }



    public Circle(String name, String colour, double x, double y,
                                    double radius) {
        super(name, colour, x, y);
        this.radius = radius;

    }


}
