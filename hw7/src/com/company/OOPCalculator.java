package com.company;

import java.util.Scanner;

/**
 * Created by poc on 8/8/16.
 */
public class OOPCalculator implements BaseCalculator {

    private Scanner sc = new Scanner(System.in);
    private String[] menuChoices = {"Addition", "Subtraction", "Multiplication", "Division", "Exit"};
    private String userChoice = "";
    private float[] inputs = new float[2];
    private final int INVALIAD_INPUT_CODE = -1;

    public static void main(String[] args) {
        OOPCalculator cal = new OOPCalculator();
        cal.doTask();
    }

    @Override
    public String toString() {
        return "WeiCheng Hsu(Poc)'s Calculator";
    }

    private void doTask() {
        while (true) {
            System.out.printf("Welcome to %s!!\n", this);
            askCalcChoice();
            userChoice = menuChoices[getUserChoice() - 1];
            if (userChoice.equals("Exit")) {
                break;
            } else {
                getUserInputs();
                performOperation(userChoice);
            }
            System.out.printf("Press enter key to continue ....\n");
            sc.nextLine();
        }
        System.out.printf("Thank you for using %s's Handy BaseCalculator\n", this);
    }

    private void askCalcChoice() {
        int i = 1;
        for (String item : menuChoices) {
            System.out.printf("%d. %s\n", i, item);
            i++;
        }
    }

    private int getUserChoice() {
        int userChoice = -1;
        boolean isValid = false;
        while (!isValid) {
            System.out.printf("What operation to perform? :");
            try {
                userChoice = parseUserChoice(sc.nextLine().trim());
                if (userChoice >= 1 && userChoice <= menuChoices.length) {
                    isValid = true;
                    break;
                }
            } catch (NumberFormatException e) {
            }
            System.out.println("Invalid Choice");
            askCalcChoice();
        }
        return userChoice;
    }

    private int parseUserChoice(String userChoice){
        String firstCharacter = userChoice.substring(0,1).toLowerCase();
        if(firstCharacter.matches("[a-z]")){
            int choiceInNumber = INVALIAD_INPUT_CODE;
            switch (firstCharacter){
                case "a":
                    choiceInNumber = 1;
                    break;
                case "s":
                    choiceInNumber = 2;
                    break;
                case "m":
                    choiceInNumber = 3;
                    break;
                case "d":
                    choiceInNumber = 4;
                    break;
                case "x":
                    choiceInNumber = 5;
                    break;
            }
            return choiceInNumber;
        }else if(firstCharacter.matches("[0-9]")){
            return Integer.parseInt(firstCharacter);
        }else{
            return INVALIAD_INPUT_CODE ;
        }
    }



    float[] getUserInputs() {
        boolean isValid = false;
        System.out.printf("Please enter two floats to %s. Separated by a space:", userChoice);
        while (!isValid) {
            try {
                String[] toks = sc.nextLine().trim().split("\\s");
                if (isDivideByZero(toks[1])) {
                    System.out.printf("Can not divided by 0,  please re-enter:");
                    continue;
                }
                if (toks.length == inputs.length) {
                    this.inputs[0] = Float.parseFloat(toks[0]);
                    this.inputs[1] = Float.parseFloat(toks[1]);
                    isValid = true;
                    break;
                }
            } catch (Exception e) {
            }
            System.out.printf("You have entered invalid floats,  please re-enter:");
        }
        return this.inputs;
    }

    void performOperation(String userChoice) {
        boolean isInputsValid = true;
        switch (userChoice) {
            case "Addition":
                System.out.printf("\nResult of addition %.2f and %.2f is %.2f.\n\n",
                        inputs[0],
                        inputs[1],
                        addition(inputs[0], inputs[1])
                );
                break;
            case "Subtraction":
                System.out.printf("\nResult of subtraction %.2f and %.2f is %.2f.\n\n",
                        inputs[0],
                        inputs[1],
                        subtraction(inputs[0], inputs[1])
                );
                break;
            case "Multiplication":
                System.out.printf("\nResult of multiplying %.2f and %.2f is %.2f.\n\n",
                        inputs[0],
                        inputs[1],
                        multiplication(inputs[0], inputs[1])
                );
                break;
            case "Division":
                System.out.printf("\nResult of dividing %.2f by %.2f is %.2f.\n\n",
                        inputs[0],
                        inputs[1],
                        division(inputs[0], inputs[1])
                );
                break;
        }
    }

    boolean isDivideByZero(String tok) {
        return Float.parseFloat(tok) == 0.0;
    }

    @Override
    public float addition(float x, float y) {
        return x + y;
    }

    @Override
    public float subtraction(float x, float y) {
        return x - y;
    }

    @Override
    public float multiplication(float x, float y) {
        return x * y;
    }

    @Override
    public float division(float x, float y) {
        return x / y;
    }


}
