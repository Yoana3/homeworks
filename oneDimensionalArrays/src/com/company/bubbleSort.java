package com.company;

public class bubbleSort {
    public static void main(String[] args) {
        int[] array = {3, 6, 8, 10, 4, 5, 1, 35, 22, 2};
        for (int i = 0; i < array.length; i++) {
            for (int j =array.length-1;j>0; j--) {
                if (array[j] > array[j] - 1) {
                    int swap = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = swap;
                }
            }
        }
          for (int i=0;i< array.length;i++){
              System.out.println(array[i]+"");
          }

    }
}



               