package com.company;

import java.util.Scanner;

/**
 * Created by poc on 7/27/16.
 */
public class Hw6_1 extends HomeWorkWrapper {
    private static Scanner rd = new Scanner(System.in);
    private String[] items = {"Title", "Rank", "Date", "Stars", "Likes"};
    private int userChoice = -1;

    public void showUsage(){
        int i = 1;
        for(String element : items) {
            System.out.println(i+":"+element);
            i++;
        }

    }

    public void execute(){
        showUsage();
        while (true){
            System.out.print("Enter your choice 1~5:");
            String userInput =  rd.nextLine();
            try{
                userChoice = Integer.parseInt(userInput);
                if(isInValidRange(userChoice)){
                    break;
                }
            }catch (Exception e){}
            System.out.println("Your value is not between 1~5, Try again!");
        }
        System.out.println("Your entered valid choice "+ userChoice);
        System.out.println("Thank you");

    }

    public boolean isInValidRange(int userChoice){
        if(userChoice > 0 && userChoice < items.length +1){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Worker worker = new Worker();
        Hw6_1  thisWorker = new Hw6_1();
        worker.doIt(thisWorker);
    }
}
