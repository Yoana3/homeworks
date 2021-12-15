package com.company;

import java.util.Scanner;

public class SymbolCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String InputLetter = scan.nextLine();
        System.out.println(isItVowel(InputLetter));
    }

    public static String isItVowel(String letter) {
        switch (letter) {
            case "a":
                System.out.println(letter + " is vowel");
                break;
            case "e":
                System.out.println(letter + " is vowel");
                break;
            case "i":
                System.out.println(letter + " is vowel");
                break;
            case "o":
                System.out.println(letter + " is vowel");
                break;
            case "u":
                System.out.println(letter + " is vowel");
                break;
            default:
                System.out.println(letter + " is not vowel");
        }
        return letter;
    }
}