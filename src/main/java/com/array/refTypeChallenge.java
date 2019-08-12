package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class refTypeChallenge {


    public Integer[] readIntegers(int count){
        System.out.println("Please enter " + count + " numbers:");
        Scanner s = new Scanner(System.in);
        Integer[] array = new Integer[count];
        for (int i = 0; i < count;  i++){
            array[i] = s.nextInt();
            s.nextLine();

        }
        System.out.println(Arrays.toString(array));
        int[] x =new int[count];
        Arrays.sort(array);

        return array;
    }

}
