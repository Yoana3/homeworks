package com.company;

import java.util.Scanner;

public class method {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber=scanner.nextInt();
        int secondNumber=scanner.nextInt();
        int thirdNumber=scanner.nextInt();
    }
    public static int maxNumber(int firstNumber,
                                int secondNumber){
        if(firstNumber>=secondNumber){
            return firstNumber;
        }else{
            return secondNumber;
        }
    }
    public static int maxNumberOfThree(int firstNumber,int secondNumber, int thirdNumber){
        if(firstNumber>secondNumber && firstNumber>thirdNumber){
            return firstNumber;
        }else if (firstNumber<secondNumber && secondNumber>thirdNumber){
            return secondNumber;
        }
        return thirdNumber;
    }

}
