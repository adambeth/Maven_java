package com.array;

import java.util.Scanner;

public class averageArray {

    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        int[] myInts = getInts(5);

        for (int i =0; i <myInts.length;i++){
            System.out.println("Saved values for item " + i + " is " + myInts[i] );
        }
        System.out.println("Average: " + getAverage(myInts));
    }
    public static int[] getInts(int num){
        System.out.println("Enter " + num + " numbers. \r");
        int values[] = new int[num];
        for (int i =0; i < values.length; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }
    private static int getAverage(int[] x){
        int total=0 ;
        int average;
        for (int i =0; i < x.length; i++){
            total +=x[i];
        }
        average = total / x.length;
        return average;
    }
}
