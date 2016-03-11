package com.company;

public class Main {

    public static void main(String[] args) {

        final double RADIUS = 25.0d;
        Circle Cir1 = new Circle(RADIUS);

        System.out.println(" The square of circle " + Cir1.getRadius() + " is " + Cir1.getSquare());

        final double TRIANGLE_SIDE_A = 12.0d;
        final double TRIANGLE_SIDE_B = 32.0d;
        final double TRIANGLE_SIDE_C = 8.0d;

        Triangle Tri1 = new Triangle(TRIANGLE_SIDE_A,TRIANGLE_SIDE_B,TRIANGLE_SIDE_C);

        System.out.println(" The square of triangle A = " + Tri1.getA() + "B = " + Tri1.getB() + "C = " + Tri1.getC() + " is " + Tri1.getSquare());

        final double REC_SIDE_A = 28.0d;
        final double REC_SIDE_B = 12.6d;

        Rectangle Rec1 = new Rectangle(REC_SIDE_A,REC_SIDE_B);

        System.out.println(" The square of rectangle A = " + Rec1.getA() + "B = " + Rec1.getB() + " is " + Rec1.getSquare());

        final double TF = 27.0d;
        final double TC = 12.6d;

        System.out.println(" Tf " + TF + " = " + Temperature.FtoC(TF) + " C");
        System.out.println(" Tc " + TC + " = " + Temperature.CtoF(TC) + " F");

        Point PointA = new Point( 1d, 2d );
        Point PointB = new Point( 8d, 6d );


        System.out.println(" The distance between A to B is " + Mesurer.distance(PointA, PointB));


    }
}
