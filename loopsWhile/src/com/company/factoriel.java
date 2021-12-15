package com.company;

import java.util.Scanner;

public class factoriel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int counter =1;
        int limit = scan.nextInt();
        int result= 1;
        while (counter<=limit) {
            System.out.println(counter);
            result=result*counter;
            counter++;
        }
        System.out.println(result);
    }
}
