package com.poc;

import java.util.Scanner;

/**
 * Created by poc on 7/10/16.
 */
public class DrawLine_4_5 {
    static Scanner rd = new Scanner(System.in);
    static int height = 10;
    static int width = 10;
    static char vertical_char = '|';
    static char horizontal_char = '-';

    public static void main(String[] args) {
        height = getNumberFromUser("Enter the height of the square:");
        width = getNumberFromUser("Enter the width of the square:");
        vertical_char = getCharFromUser("Enter the vertical_char of the square:");
        horizontal_char = getCharFromUser("Enter the horizontal_char of the square:");
        drawSquare(height, width, vertical_char, horizontal_char);
    }

    static int getNumberFromUser(String prompt) {
        System.out.print(prompt);
        int value = rd.nextInt();
        rd.nextLine(); // eats newline char
        return value;
    }

    static char getCharFromUser(String prompt) {
        System.out.print(prompt);
        char value = rd.next().charAt(0);
        rd.nextLine(); // eats newline char
        return value;
    }

    static void drawSquare(int h, int width, char ver, char hori) {

        drawBoundaryLine(width, hori);

        for (int i = 0; i < height - 2; i++) {
            System.out.printf("%s", ver);
            for (int j = 0; j < width - 2; j++) {
                System.out.printf(" ");
            }
            System.out.printf("%s", ver);
            System.out.println();
        }

        drawBoundaryLine(width, hori);

    }

    static void drawBoundaryLine(int width, char hori) {
        for (int i = 0; i < width; i++) {
            System.out.printf("%s", hori);
        }
        System.out.println();
    }
}



















