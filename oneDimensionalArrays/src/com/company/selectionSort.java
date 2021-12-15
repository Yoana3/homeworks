package com.company;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] array = {3, 6, 8, 10, 4, 5, 1, 35, 22, 2};

        for (int i =0; i<array.length;i++){
            int minElement=array[i+1];
            int minElementIndex=i+1;
            for (int j=i;j<array.length;j++){
                minElement=array[j];
                minElementIndex=array[j];
            }
        }
       // int swap = array[i];
       // array[i]=array[minElementIndex];
       // array[minElementIndex]=swap;
        //System.out.printLn(Arrays.toString(array));
    }

}
