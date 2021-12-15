package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int capacity = scan.nextInt();
        boolean hasLights = true;

        String result = hasLights && capacity > 35000 ? "Има лиценз за А група" : "Няма лиценз за А група";
        System.out.println(result);

    }
}
