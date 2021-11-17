package com.company;

import java.sql.Array;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Declaring Variables
        int min = 50;
        int max = 100;
        int randomInt;
        int[] arrayInt = new int [10];
        int counter = 0;
        boolean isCounting = true;
        int temp = 0;


        // Creating Array of 10 Random Elements
        for(int i = 0; i < 10; i++){
            randomInt = (int)Math.floor(Math.random()*(max - min + 1) + min);
            arrayInt[i] = randomInt;
        }

        // Bubble Sorting Algorithm
        while(isCounting) {
            for (int i = 0; i < arrayInt.length - 1; i++) {
                if (arrayInt[i] > arrayInt[i+1]){
                    temp = arrayInt[i+1];
                    arrayInt[i+1] = arrayInt[i];
                    arrayInt[i] = temp;
                    counter++;
                }
            }
            if(counter == 0)
                break;
            counter = 0;
        }

        // Printing Sorted Array
        for(int i = 0; i < 10; i++){
            System.out.println(arrayInt[i]);
        }
    }
}
