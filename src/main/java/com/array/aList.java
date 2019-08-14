package com.array;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class aList {
    private int[] myNumbers;
    private ArrayList<String> grocery = new ArrayList<String>();



    public void addItem(String item){
        System.out.println("Add item to list:");
        Scanner s = new Scanner(System.in);
        String itemToAdd = s.next();
        grocery.add(itemToAdd);
        System.out.println(itemToAdd + " has been added");
    }

    public void printList(){
        System.out.println(grocery.size());
        for(int i =0 ; i <grocery.size();i++){
            System.out.println(grocery.get(i));
        }
    }

    public String findItem(String search){
        //boolean exist = grocery.contains(search);
        int position = grocery.indexOf(search);
        return grocery.get(position);
    }
}
