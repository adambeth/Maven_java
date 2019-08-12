package com.array;
import com.array.ArrayChallenge;
import com.array.*;

import java.lang.reflect.Array;

public class index {

    public static void main(String[] args) {
//        ArrayChallenge x = new ArrayChallenge();
//        x.getNumber(5);
        refTypeChallenge x = new refTypeChallenge();
        Integer[] ar = x.readIntegers(5);
        System.out.println(Array.get(ar,0));
    }
}
