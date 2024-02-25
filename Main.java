package com.dev;

public class Main {
    public static void main(String[] args) {

        int a = 6;
        for (int i = a; i>=0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}