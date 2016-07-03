package com.poc;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Created by poc on 7/2/16.
 */
public class RealCalculator {

    public void kick(){
        double firstN;
        double secondN;
        char operator;
        Scanner readInput = new Scanner(System.in);
        System.out.printf("Type a number, operator, number --"
                + "separated by a space: ");
        firstN = readInput.nextDouble();
        operator = readInput.next().charAt(0);
        secondN = readInput.nextDouble();
        if (operator == '+')
            System.out.printf("%f + %f = %f",
                    firstN, secondN, firstN + secondN);
        else if (operator == '-')
            System.out.printf("%f - %f = %f",firstN, secondN, firstN - secondN);
        else if (operator == '*')
            System.out.printf("%f * %f = %f",
                    firstN, secondN, firstN * secondN);
        else if (operator == '/')
            System.out.printf("%f / %f = %f",
                    firstN, secondN, firstN / secondN);
        else if (operator == '%')
            System.out.printf("%f %% %f = %f",
                    firstN, secondN,firstN % secondN);
        else
            System.out.printf("Unknown operator");
        System.out.printf("\n\n");
    }

    public static void main(String[] args) {

    }

}
