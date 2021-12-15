package com.company;

import java.util.Arrays;

public class problemThree {
    public static void main(String[] args) {
        int[] arrayOne = {3, 5, 8, 9, 4, 5};
        int[] arrayTwo = {11, 22, 33, 44, 55, 66};
        int[] arrayResult = new int[arrayOne.length];

        for (int index = 0; index < arrayOne.length&& index<arrayTwo.length; index++) {
            if (index % 2 == 0) {
                arrayResult[index] = arrayOne[index];
            }else{
                arrayResult[index] = arrayTwo[index];
            }
        }
        System.out.println(Arrays.toString(arrayResult));
    }
}
