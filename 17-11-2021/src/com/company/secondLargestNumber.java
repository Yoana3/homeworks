package com.company;

public class secondLargestNumber {
    public static void main(String[] args) {
        int[] array = {2, 99, 66, 8, 234, 365, 17};
        int biggestNumber = 0;
        int biggestNumberIndex = 0;

        for (int index = 0; index < array.length; index++) {
            if (array[index] > biggestNumber) {
                biggestNumber = array[index];
                biggestNumberIndex = index;
            }
        }

        array[biggestNumberIndex] = 0;
        biggestNumber = 0;

        for (int index = 0; index < array.length; index++) {
            if (array[index] > biggestNumber) {
                biggestNumber = array[index];
            }
        }
        System.out.print(biggestNumber);
    }
}
