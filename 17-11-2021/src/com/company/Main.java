package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] numbersBefore = {1, 5, 10, 11, 20, 2};
        System.out.println(Arrays.toString(numbersBefore));
        int [] numbersAfter =new int[numbersBefore.length];
        for (int i = 0; i < numbersAfter.length; i++) {
            numbersAfter[i]=numbersBefore[i]*i;
        }
        System.out.println(Arrays.toString(numbersAfter));
    }
}
