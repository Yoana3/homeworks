package com.company;

import java.util.Scanner;

public class addition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int counter =0;
        int limit=scan.nextInt();
        int sum=0;
        while (counter<=limit){
            System.out.println(counter);
            sum=sum+counter;
            counter++;
        }
        System.out.println(sum);
    }
}
