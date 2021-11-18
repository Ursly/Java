package com.company;

import java.sql.Array;

public class Main {

    public static void main(String[] args) {

        // Declaring Variables
        int min = 0;  // Min value for random number generator
        int max = 1000;  // Max value for random number generator
        int randomInt;  // Generated random number
        int[] arrayInt = new int [10];  // Array of random Integers
        int counter = 0;  // Number of swaps
        boolean isCounting = true; // Condition for Bubble Sorting
        int temp; // Temporary variable for swapping numbers
        int lockedNum = 1; // Locking the biggest value at the end of array


        // Creating Array of 10 Random Elements
        for(int i = 0; i < 10; i++){
            randomInt = (int)Math.floor(Math.random()*(max - min + 1) + min);
            arrayInt[i] = randomInt;
        }

        // Bubble Sorting Algorithm
        while(isCounting) {
            for (int i = 0; i < arrayInt.length - lockedNum; i++) {
                if (arrayInt[i] > arrayInt[i+1]){
                    temp = arrayInt[i+1];
                    arrayInt[i+1] = arrayInt[i];
                    arrayInt[i] = temp;
                    counter++;
                }
            }
            lockedNum++;
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
