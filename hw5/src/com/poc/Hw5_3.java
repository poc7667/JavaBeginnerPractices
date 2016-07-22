package com.poc;

import java.util.Scanner;

/**
 * Created by poc on 7/21/16.
 */
public class Hw5_3 extends HomeWorkWrapper {

    private Scanner rd = new Scanner(System.in);
    private int temps[] = {69,70,71,68,66,71,70};
    private int i, max=0, min=9999;
    float total=0, avg=0;

    public void execute(){
        loopDayOfTemp();
        System.out.println("Min:"+min);
        System.out.println("Max:"+max);
        System.out.println("Avg:"+total/temps.length);
        System.out.println("Bye");
    }

    private void loopDayOfTemp(){
        int weekOfDay = 1;
        for(int temp: temps){
            System.out.printf("The temperature on day %d was %d\n", weekOfDay, temps[weekOfDay-1]);
            if(temp > max){max = temp;}
            if(temp < min){min = temp;}
            total+=temp;
            weekOfDay++;
        }
    }


    public static void main(String[] args) {
        Hw5_3 thisWoker = new Hw5_3();
        Worker worker = new Worker();
        worker.doIt(thisWoker);
    }
}
