package com.company;

import java.util.Scanner;

public class forLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i <= n; i++) {
            if(i%2==0){
                System.out.println(i);
            }

        }

    }
}


