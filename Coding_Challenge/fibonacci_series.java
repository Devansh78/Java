package com.dev.Coding_Challenge;

import java.util.Scanner;

public class fibonacci_series {
    public static void main(String[] args) {

        int series, a=0, b=1,c;

        System.out.println("Enter n number to find series: ");
        Scanner w = new Scanner(System.in);
        series = w.nextInt();

        for (int i = 1; i<=series; i++){
            System.out.println(a);
            c = a+b;
            b = a;
            a = c;
        }

    }
}