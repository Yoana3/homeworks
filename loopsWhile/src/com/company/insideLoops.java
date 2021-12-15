package com.company;

import java.util.Scanner;

public class insideLoops {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i=0;i<10;i+=2){
            System.out.println("Външен цикъл.Итерация: " +i);
            for(int j=0; j<10;j++){
                System.out.println("Вътрешен цикъл.Итерация: " +j);
            }
            System.out.println("Край на външния цикъл");
        }
        System.out.println("Край на всичко");
    }
}
