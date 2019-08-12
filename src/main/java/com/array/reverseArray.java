package com.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class reverseArray {

    public Integer[] arrayReverse(){

        Scanner s = new Scanner(System.in);
        System.out.println("Please reverse all, enter how many numbers to reverse");
        int arraySize = s.nextInt();
        s.nextLine();
        Integer[] sampleArray = new Integer[arraySize];

        for (int i =0; i <sampleArray.length; i++ ){
            System.out.println("Enter " + i+1+ " number:");
            int currentNumber = s.nextInt();
            sampleArray[i] = currentNumber;
            s.nextLine();
        }
        Collections.reverse(Arrays.asList(sampleArray));

        return sampleArray;
    }
}
