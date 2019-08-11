package com.array;

class java_arrays {
    public static void main(String[] args) {
        int[] dogs = new int[5];
        prntArray(dogs);
    }

    public static void prntArray(int[] array){

        //int[] dogs = new int[5];
        for (int i =0; i< 5;i++){
            array[i] = i;
            System.out.println(array[i]);
        }


    }
}



