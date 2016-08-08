package com.company;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by poc on 8/8/16.
 */
public class PocHsuCalculator implements Calculator {

    private Scanner sc = new Scanner(System.in);
    private String[] operations = {"Addition", "Subtraction", "Multiplication", "Division", "Exit"};
    private float[] inputs = new float[2];

    boolean performOperation(String userChoice){
        switch (userChoice){
            case "Addtion":
                addtion(inputs[0], inputs[1]);
                break;
            case "Subtraction":
                subtraction(inputs[0], inputs[1]);
                break;
            case "Multiplication":
                multiplication(inputs[0], inputs[1]);
                break;
            case "Division":
                if((inputs[1])!=0.0){
                    division(inputs[0], inputs[1]);
                }else{
                    System.out.println("Can not divided by 0");
                    return false;
                }
                break;
        }
    }


    public PocHsuCalculator(){}

    private  void showMenu(){
        int i = 1;
        for(String item : operations ){
            System.out.printf("%d. %s\n", i, item);
            i++;
        }
    }

    private static boolean contains(String[] arr, String item) {
        return Arrays.stream(arr).anyMatch(item::equals);
    }

    private int getUserChoice(){
        int userChoice=-1;
        boolean isValid = false;
        while (!isValid){
            System.out.printf("What operation to perform? :");
            try {
                userChoice = Integer.parseInt(sc.nextLine().trim());
                if(userChoice >= 1 && userChoice <= operations.length){
                    isValid = true;
                    break;
                }
            }catch (NumberFormatException e){}
            System.out.println("Invalid Choice");
            showMenu();
        }
        return userChoice;
    }

    void doTask(){
        while (true){
            System.out.printf("Welcome to %s!!\n", this.getClass().getSimpleName());
            showMenu();
            String choice = operations[getUserChoice()-1];
            if(choice.equals("Exit")){
                break;
            }else{
                getUserInputs();
                performOperation(choice);
            }
        }
        System.out.printf("Thank you for using %s's Handy Calculator\n", this.getClass().getSimpleName());
    }
    float[] getUserInputs(){
        boolean isValid = false;
        while (!isValid){
            System.out.printf("Please enter two floats to divide separated by a space:");
            try{
                String[] toks = sc.nextLine().trim().split("\\s");
                System.out.println(toks.length);
                if(toks.length == inputs.length){
                    this.inputs[0] = Float.parseFloat(toks[0]);
                    this.inputs[1] = Float.parseFloat(toks[1]);
                    isValid = true;
                    break;
                }
            }catch (Exception e){
                System.out.println(e);
            }
            System.out.println("Invalid inputs, please try it again");
        }
        return this.inputs;
    }

    @Override
    public float addtion(float x, float y) {
        return 0;
    }

    @Override
    public float subtraction(float x, float y) {
        return 0;
    }

    @Override
    public float multiplication(float x, float y) {
        return 0;
    }

    @Override
    public float division(float x, float y) {
        return x/y;
    }
}
