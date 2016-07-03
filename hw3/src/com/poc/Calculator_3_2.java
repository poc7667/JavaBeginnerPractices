package com.poc;

import java.util.Scanner;

/**
 * Created by poc on 7/2/16.
 */
public class Calculator_3_2 {
    public static void main(String[] args) {
        Scanner readInput = new Scanner(System.in);
        do {
            RealCalculator rc = new RealCalculator();
            rc.kick();
            System.out.print("Continue? (y/n):");
            String userInput = readInput.nextLine();
            userInput = userInput.toLowerCase();
            System.out.println(userInput);
            if (userInput.toLowerCase().equals("y")) {
            } else {
                System.out.println("Good bye!");
                break;
            }
        } while (true);

    }
}
