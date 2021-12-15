package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        Random random = new Random();
        while (true){
            int numberLarge=random.nextInt();
            int numberSmall=numberLarge%10;
            System.out.println(numberLarge);
        }
    }
}
