package com.leetcode;
import  java.util.Scanner;
/**
 * Created by poc on 6/27/16.
 */

class AreaCalculator{
    Scanner rdInput = new Scanner(System.in);
    public AreaCalculator(){}

    public double getRadius(){
        System.out.println();
        System.out.print("Pls enter the radius: ");
        return this.rdInput.nextDouble();

    }
    public double getPI(){
        System.out.print("Pls enter the value of pi: ");
        return  this.rdInput.nextDouble();
    }
}
public class RuntimeInput {
    public static void main(String[] args) {
        double radius;
        double pi;
        double area;
        AreaCalculator ac = new AreaCalculator();
        radius = ac.getRadius();
        pi = ac.getPI();
        area = pi * (radius * radius);
        System.out.println("The radius is: "+ Double.toString(radius));
        System.out.println("area: "+ Double.toString(area));
    }
}
