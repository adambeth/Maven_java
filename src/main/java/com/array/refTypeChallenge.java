package com.array;

import java.util.Scanner;

public class refTypeChallenge {



    public  void main(String[] args) {

        readIntegers(5);

    }

    public int[] readIntegers(int count){
        System.out.println("Please enter " + count + " numbers:");
        Scanner s = new Scanner(System.in);
        int[] array = new int[count];
        for (int i = 0; i < count;  i++){
            array[i] = s.nextInt();

        }
        System.out.println(array);
        return array;
    }

}
