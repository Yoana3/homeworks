package com.company;

import java.util.Arrays;

public class arrayForTheSameNumbers {
    public static void main(String[] args) {
        int[] numberArrayOne = {1, 2, 3, 4, 5, 1};
        int[] numberArrayTwo = {4, 10, 2, 6, 20};
        System.out.println(Arrays.toString(numberArrayOne));
        System.out.println(Arrays.toString(numberArrayTwo));
        int sameNumberCount=0;
        int[] result = new int[numberArrayOne.length];
        //System.out.println(numberArrayOne[2]);
        for (int indexArrayOne = 0; indexArrayOne < numberArrayOne.length - 1; indexArrayOne++) {
            for (int indexArrayTwo = 0; indexArrayTwo < numberArrayTwo.length; indexArrayTwo++) {
                if (numberArrayOne[indexArrayOne] == numberArrayTwo[indexArrayTwo]) {
                    result[sameNumberCount]=numberArrayOne[indexArrayOne];
                    sameNumberCount++;
                }
            }

        }
        System.out.println(Arrays.toString(result));
    }
}
