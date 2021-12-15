package com.company;

public class largestElement {
    public static void main(String[] args) {
        int[] numbers = {43, 56, 4, 3, 6, 8, 43, 5, 7, 87, 4, 3, 5, 6};
        int maxNumber=numbers[0];
        for(int i =0; i<numbers.length;i++) {
            if(numbers[i]>maxNumber){
                maxNumber=numbers[i];
            }
        }
        System.out.println(maxNumber);
    }
}
