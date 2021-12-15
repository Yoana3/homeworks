package com.company;

public class multiDimensionalArraysOne {
    public static void main(String[] args) {
        int[][] ratings = {
                {4, 6, 2, 5},
                {7, 9, 4, 8},
                {6, 9, 3, 7}
        };
        for (int row=0;row<ratings.length;row++){
            for(int col=0;col<ratings[0].length;col++){
                System.out.print(ratings[row][col]);
            }
            System.out.println();
        }
        int sumOfReviewerTwo=0;
        for (int col=0;col<ratings[0].length;col++){
            sumOfReviewerTwo=sumOfReviewerTwo+ratings[2][col];
        }
        System.out.println("Средно аритметично на рецензент 2 е "+sumOfReviewerTwo/(double)ratings[0].length);


        int aboveSixCounter=0;
        for (int col=0;col<ratings.length;col++){
            for(int row=0;row<ratings.length;row++){
                if(ratings[row][col]>6){
                    aboveSixCounter++;
                }
            }
        }
        System.out.println("Оценки над 6: "+aboveSixCounter);
    }
}
