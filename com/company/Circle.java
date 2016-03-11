package com.company;

/**
 * Created by User on 11.03.2016.
 */
public class Circle extends Figure {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
        super(0, 0);
        this.radius = radius;
    }

    @Override
    public double getSquare() {
        return Math.PI * this.radius * this.radius;
    }

}
