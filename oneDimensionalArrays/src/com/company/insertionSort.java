package com.company;

import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int[] array = {3, 6, 8, 2, 4, 5, 1, 35, 22, 2};

        for (int i=1; i<array.length; i++){
            for (int k=1;k>0;k--){
                if(array[k-1]<array[k]){
                    break;
                }else {
                    int swap =array[k-1];
                    array[k-1]=array[k];
                    k=k-1;
                }
            }
            System.out.println(Arrays.toString(array));
        }
    }
}
