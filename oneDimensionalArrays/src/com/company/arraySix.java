package com.company;

import java.util.Scanner;

public class arraySix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int array[] = new int[10];
        for (int i = 0; i <= array.length; i++) {
            array[i]= scan.nextInt();
        }
        if(array[0]==6 || array[array.length-1]==6){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }
}