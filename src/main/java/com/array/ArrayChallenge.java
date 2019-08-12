package com.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayChallenge {


    Scanner getStart = new Scanner(System.in);

    //get array built and return array
    public  Integer[] getNumber(Integer x){
        Integer numbers[] = new Integer[x];
        for (int i =0;  i < numbers.length ; i++){
            System.out.println("Enter Digit \r");
            numbers[i] = getStart.nextInt();

        }

        return sortArray(numbers);
    }

    private Integer[] sortArray(Integer[] target){
        Arrays.sort(target, Collections.reverseOrder());
        System.out.println(Arrays.toString(target));
        return target;
    }
}
