package com.company;

/**
 * Created by User on 11.03.2016.
 */
public class Temperature {

    static double CtoF(double tempC) {
        return ( 9/5 ) * tempC + 32.0d;
    }

    static double FtoC(double tempF) {
        return ( 5/9 ) * (tempF - 32.0d);
    }

}
