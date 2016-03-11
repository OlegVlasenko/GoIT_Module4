package com.company;

/**
 * Created by User on 11.03.2016.
 */
public class Mesurer {
    static double distance ( Point A, Point B){
        return Math.sqrt( Math.pow(B.getX() - A.getX(),2.0d) + Math.pow(B.getX() - A.getX() ,2.0d) );
    }

}
