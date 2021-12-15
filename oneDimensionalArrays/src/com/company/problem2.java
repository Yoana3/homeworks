package com.company;

import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        int sum=0;
        for (int i= m;i <= n; i++) {
            sum=i+sum;
        }
        System.out.println(sum);


    }
}
