package com.dev;

import java.util.Scanner;

public class userinput {
    public static void main(String[] args) {
        System.out.println("taking user input");
        Scanner sc = new Scanner(System.in);

//        SUM OF TWO INTEGER
        System.out.println("Enter the number a: ");
        int a = sc.nextInt();
        System.out.println("Enter the number b: ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Sum of a and b is: " + sum);

//        USE OF BOOLEAN FOR CHECKING INTEGER IS USED OR NOT
        System.out.println("\n trying boolean variable");
        System.out.print("Enter any integer here: ");
        Scanner dev = new Scanner(System.in);
        boolean aa = dev.hasNextInt();
        System.out.println(aa);


//
    }
}