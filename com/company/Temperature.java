package com.company;

/**
 * Created by User on 11.03.2016.
 */
abstract public class Temperature {

    static double CtoF(double tempC) {
        return ( 9.0d / 5.0d ) * tempC + 32.0d;
    }

    static double FtoC(double tempF) {
        return ( 5.0d / 9.0d ) * (tempF - 32.0d);
    }

}
