package com.poc;

import java.util.Scanner;

/**
 * Created by poc on 7/3/16.
 */
public class MaxNumberPicker {
    Scanner readInput = new Scanner(System.in);

    double getMax(double a, double b, double c) {
        double max = a;
        max = (a>b)? a:b;
        max = (max>c)? max: c;
        System.out.println("max is:"+ max);
        return  max;
    }

    public void kick() {
        double a, b, c;
        System.out.print("pls input 3 numbers:");
        a = readInput.nextDouble();
        b = readInput.nextDouble();
        c = readInput.nextDouble();
        getMax(a, b, c);
    }
}
