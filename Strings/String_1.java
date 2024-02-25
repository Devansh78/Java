package com.dev.Strings;

import java.util.Scanner;

public class String_1 {
    public static void main(String[] args) {

//        HOW TO PRINT STRING TYPE 1
        String a = new String("Devansh");
        System.out.println(a);

//        TYPE 2
        String b="dev";
        System.out.println(b);

//      TYPE 3
        String aa = "Good";
        String ab = "Student!!!";
        System.out.format("Devansh is %s %s \n", aa, ab);

//        USER INPUT FOR STRING
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Something here: ");
        String ae  = sc.nextLine();
        System.out.printf("Hello %s", ae + " Sir");

//        PRINT FORMAT METHOD
        double aaa = 453.5d;
        System.out.printf("\n This is number %f", aaa);
    }
}