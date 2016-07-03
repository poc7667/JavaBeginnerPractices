package com.poc;

import java.util.Scanner;

/**
 * Created by poc on 7/3/16.
 */
public class MaxNumber_3_3 {

    public static void main(String[] args) {
        Scanner readInput = new Scanner(System.in);
        do {
            MaxNumberPicker picker = new MaxNumberPicker();
            picker.kick();

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
