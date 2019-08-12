package com.array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class reverseArray {

    public Integer[] arrayReverse(int a){
        Integer[] oArray = new Integer[a];
        Collections.reverse(Arrays.asList(oArray));
        return oArray;
    }
}
