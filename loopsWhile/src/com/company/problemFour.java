package com.company;

import java.util.Scanner;

public class problemFour {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int factoriel = 1;
        for (int i =1; i<=n; i++){
            factoriel=factoriel*i;
        }
        System.out.println(factoriel);
    }
}
