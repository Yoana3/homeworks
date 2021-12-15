package com.company;

public class problemFives {
    public static void main(String[] args) {
        int [] fives=new int[20];
        for(int i = 0;i<fives.length;i++){
            fives[i]=i*5;
        }
        for (int i=0;i< fives.length;i++){
            System.out.println(fives[i]);
        }
    }
}
