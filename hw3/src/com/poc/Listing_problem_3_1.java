package com.poc;

import java.util.Scanner;

/**
 * Created by poc on 7/2/16.
 */
public class Listing_problem_3_1 {


    public static void main(String[] args) {
        int yourAge;
        Scanner readInput = new Scanner(System.in);
        System.out.printf("How old are you?: ");
        yourAge = readInput.nextInt();
        if(yourAge < 13){
            System.out.println("Kid");
        }else if(yourAge >= 13 && yourAge <=19){
            System.out.println("Teenager");
        }else if(yourAge > 19){
            System.out.println("You are an adult");
        }else{
            System.out.println("hello Ghost!!");
        }

    }
}
