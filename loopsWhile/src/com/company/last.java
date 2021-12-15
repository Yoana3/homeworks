package com.company;

import java.util.Scanner;

public class last {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int rowIndex=1;rowIndex<=n;rowIndex++){
            for (int i=1; i<=rowIndex; i++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}