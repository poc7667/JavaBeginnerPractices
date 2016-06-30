package com.leetcode;

import java.util.Scanner;

/**
 * Created by poc on 6/29/16.
 */

class ExtraDemoPrintfToShowUserInfo {
    public ExtraDemoPrintfToShowUserInfo() {
    }

    public void show() {
        Scanner rdInput = new Scanner(System.in);
        //extra line feed
        System.out.println();
        System.out.print("What is your first name?: ");
        char yourInitial = rdInput.next().charAt(0);
        System.out.println("Hello Mr. " + yourInitial + ".");

        //extra line feed
        System.out.println();
        System.out.printf("5185 is fun course.\n\n");
        System.out.printf("First Name \tLast Name\tCity\n");
        System.out.printf("----------- \t---------\t---\n");
        System.out.printf("Bill \tClinton \tHarlem\n");
        System.out.printf("\n");
        //extra line feed
        System.out.println();
        System.out.printf("How do you print double quotes?\n");
        System.out.printf("Who said\"Test Scores Can Be Used ....\"\n");

        System.out.print("What is your first name? ");
        String firstName = rdInput.next();

        System.out.print("What is your last name? ");
        String lastName = rdInput.next();

        System.out.print("What is your city? ");
        String city = rdInput.next();

        System.out.print("What is your zip code? ");
        String zip = rdInput.next();
        System.out.printf("First Name \tLast Name\tCity\tZip code\n");
        System.out.printf("========== \t=========\t=====\t=======\n");
        System.out.printf("%s   \t %s  \t%s   \t %s", firstName, lastName, city, zip);

    }

}

public class ByteInput {


    public static void main(String[] args) {
        Scanner rdInput = new Scanner(System.in);
        double radius;
        double pi ;
        double area;
        AreaCalculator ac = new AreaCalculator();
        pi = ac.getPI();
        System.out.print("");
        System.out.print("Enter the radius: ");
        byte newRadius = rdInput.nextByte();
        System.out.println("NewRadius:" + newRadius);
        area = newRadius * newRadius * pi;
        System.out.println("Area: " + area);

        // do the following part of assignment
        ExtraDemoPrintfToShowUserInfo userInfo = new ExtraDemoPrintfToShowUserInfo();
        userInfo.show();


    }


}
