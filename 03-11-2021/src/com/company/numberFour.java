package com.company;

import java.util.Scanner;

public class numberFour {
    public static void main(String[] args) {
        System.out.println("Въведете число от 1 до 1000:");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        byte ones = (byte) (number % 10);
        byte tens = (byte) (number % 100 / 10);
        byte hundreds = (byte) (number % 1000 / 100);
        byte onesAndTens = (byte) (number % 100);
        if (number > 999 && number < 1000) {
            System.out.println("Хиляда");
        }
        if (number > 1000) {
            System.out.println("Числото е по-голямо от 1000");
        }
        switch (hundreds) {
            case 1 -> System.out.print("Сто");
            case 2 -> System.out.print("Двеста");
            case 3 -> System.out.print("Треста");
            case 4 -> System.out.print("Четиристотин");
            case 5 -> System.out.print("Петстотин");
            case 6 -> System.out.print("Шестотин");
            case 7 -> System.out.print("Седемстотин");
            case 8 -> System.out.print("Осемстотин");
            case 9 -> System.out.print("Деветстотин");
        }
        switch (onesAndTens) {
            case 10 -> System.out.print(" и десет ");
            case 11 -> System.out.print(" и единадесет ");
            case 12 -> System.out.print(" и дванадесет ");
            case 13 -> System.out.print(" и тренадесет ");
            case 14 -> System.out.print(" и четиринад ");
            case 15 -> System.out.print(" и петнадесет ");
            case 16 -> System.out.print(" и шеснадесет ");
            case 17 -> System.out.print(" и седемнадесет ");
            case 18 -> System.out.print(" и осемнадесет ");
            case 19 -> System.out.print(" и деветнадесет ");
            case 20 -> System.out.print(" и двадесет ");
            case 30 -> System.out.print(" и тридесет ");
            case 40 -> System.out.print(" и четиресет ");
            case 50 -> System.out.print(" и петдесет ");
            case 60 -> System.out.print(" и шеснадсет ");
            case 70 -> System.out.print(" и седемдесет ");
            case 80 -> System.out.print(" и осемдесет");
            case 90 -> System.out.print(" и деветдесет ");
        }
        switch (tens) {
            case 2 -> System.out.print(" двадесет ");
            case 3 -> System.out.print(" тридесет ");
            case 4 -> System.out.print(" четиресет ");
            case 5 -> System.out.print(" петдесет ");
            case 6 -> System.out.print(" шейсет ");
            case 7 -> System.out.print(" седемдесет ");
            case 8 -> System.out.print(" осемдесет ");
            case 9 -> System.out.print(" деветдесет ");
        }
        switch (ones) {
            case 1 -> System.out.print("и едно");
            case 2 -> System.out.print("и две");
            case 3 -> System.out.print("и три");
            case 4 -> System.out.print("и четири");
            case 5 -> System.out.print("и пет");
            case 6 -> System.out.print("и шест");
            case 7 -> System.out.print("и седем");
            case 8 -> System.out.print("и осем");
            case 9 -> System.out.print("и двет");
        }

    }
}
