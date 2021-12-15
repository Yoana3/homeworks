package com.company;

public class four {
    public static void main(String[] args) {
        byte a=5, b=11;
        a ^= b;
        b ^=a;
        a ^=b;
        System.out.println(a);
        System.out.println(b);
    }
}
