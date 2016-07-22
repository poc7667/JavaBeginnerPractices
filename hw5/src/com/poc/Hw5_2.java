package com.poc;

import java.util.Scanner;

/**
 * Created by poc on 7/21/16.
 */
public class Hw5_2 extends HomeWorkWrapper {

    private Scanner rd = new Scanner(System.in);

    public void execute(){
        while (true){
            System.out.print("Enter 2 floats divided by a space");
            try{
                String toks[] = rd.nextLine().split(" ");
                if(toks.length==2){
                    for(String tok : toks){
                        Float.valueOf(tok);
                    }
//                    for(String tok : toks){
//                        System.out.println(tok);
//                    }
                    break;
                }

            }catch (Exception e){

            }
            System.out.println("invalid input try it again");
        }
        System.out.println("It's valiad, thank you");
    }

    public static void main(String[] args) {
        Worker worker = new Worker();
        Hw5_2 thisWoker = new Hw5_2();
        worker.doIt(thisWoker, "Welcome to the 2 floats program!", "Bye");
    }
}
