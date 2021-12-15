package com.company;

import java.util.Arrays;

public class exercise {
    public static void main(String[] args) {
        int array[][] = {
                {4, 6, 2, 5},
                {7, 9, 4, 8},
                {6, 9, 3, 7}

        };
        int aboveSix = 0;
        int secondSubirane = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j]);
                if(array[i][j]>6){
                    aboveSix++;
                }
            }
            System.out.println();
        }
        System.out.println(aboveSix);
        for (int second = 0; second < array[1].length; second++) {
            secondSubirane += array[1][second];


        }
        System.out.println(secondSubirane / array[1].length);


    }
}

