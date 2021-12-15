package com.company;

public class equals {
    public static void main(String[] args) {
        int[] numbers = {43, 56, 4, 3, 6, 8, 43, 5, 7, 87, 4, 3, 5, 6};
        int[] array = {43, 56, 4, 3, 6, 8, 43, 5, 7, 87, 4, 3, 5, 6};
        boolean areEqual = true;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != array[i]) {
                areEqual = false;break;
            }
        }
        if (areEqual) {
            System.out.println("are equal");
        } else {
            System.out.println("not equal");
        }
    }
}
