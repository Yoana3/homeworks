package com.company;

import java.util.Arrays;

public class exe {
    public static void main(String[] args) {
        int reviews []={4,6,2,5,7,9,4,8,6,9,3,7};
        int sort = 0;

        for (int wholeArray = 0; wholeArray < reviews.length; wholeArray++) {
            for (int components = 1; components < (reviews.length - wholeArray); components++) {
                if (reviews[components - 1] > reviews[components]) {

                    sort = reviews[components - 1];
                    reviews[components - 1] = reviews[components];
                    reviews[components] = sort;
                }
            }
        }
        System.out.println(Arrays.toString(reviews));
    }
}
