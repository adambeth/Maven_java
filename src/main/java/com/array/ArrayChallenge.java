package com.array;

import java.util.Scanner;

public class ArrayChallenge {
    Scanner getStart = new Scanner(System.in);



    public  int[] getNumber(int x){
        int numbers[] = new int[x];
        for (int i =0;  i > numbers.length ; i++){

            numbers[i] = getStart.nextInt();
        }

        return numbers;
    }
}
