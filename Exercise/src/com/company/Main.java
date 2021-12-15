package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
printLeft(n);
printRight(n);
    }
    public static void printLeft(int number){
        for(int triangles=1;triangles<=number;triangles++){
            for(int slash=0;slash<=triangles;slash++){
                System.out.print("/");
            }
        }
    }
    public static void printRight(int value){
        for(int trianglesRight = 1; trianglesRight <=value; trianglesRight++){
            for(int slashRight = 0; slashRight <= trianglesRight; slashRight++){
                System.out.print("\\");
            }
        }
    }
    public static void printSpaces(){

    }
    public static void printTreeStem(){

    }
}
