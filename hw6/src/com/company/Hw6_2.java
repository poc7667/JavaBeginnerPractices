package com.company;

import java.util.Scanner;

/**
 * Created by poc on 7/21/16.
 */
public class Hw6_2 {

    private static float[] getTwoFloats(){
        Scanner rd = new Scanner(System.in);
        while (true){
            System.out.print("Enter 2 floats divided by a space: ");
            try{
                String toks[] = rd.nextLine().trim().split(" ");
                if(toks.length==2){
                    float[] rtnFloats = new float[2];
                    for(int i=0; i < 2; i++){
                        rtnFloats[i] = Float.valueOf(toks[i]);
                    }
                    return rtnFloats;
                }

            }catch (Exception e){

            }

        }

    }

    public static void main(String[] args) {
        float[] twoFloats = getTwoFloats();
        // user %s to print the original decimal format
        System.out.printf("you entered %s and %s successfully", twoFloats[0], twoFloats[1]);

    }
}
