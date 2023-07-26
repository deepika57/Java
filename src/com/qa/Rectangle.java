package com.qa;

public class Rectangle extends Shape {


    public Rectangle(String name, String colour, double x, double y, double height, double width) {
        super(name, colour, x, y);
        this.height = height;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }


    private double height, width;

    public boolean isSquare() {
        return (width == height);
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public Point getCentrePoint() {
        double centreX = getX() + width / 2;
        double centreY = getY() + height / 2;
        return new Point(centreX, centreY);
    }



}
