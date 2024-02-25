package com.dev;

import java.util.Scanner;

public class practiceset_1 {
    public static void main(String[] args) {


//    WRITE A PROGRAM TO SUM THREE NUMBER IN JAVA
        int a, b, c;
        a = 1;
        b = 3;
        c = 5;

        int sum = a + b + c;
        System.out.println(sum+"\n");

//        WRITE A PROGRAM WHICH ASK THE USER TO ENTER HIS/HER NAME AND GREETS THEM WITH TEXT
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter Your Name: ");
        String name = sc.nextLine();
        System.out.println("Hello "+name+", have a good day!!!");

//        WRITE A JAVA PROGRAM TO CONVERT KM INTO MILES
        System.out.println("Enter Value in Kilometer to convert it into miles: ");
        float km = sc.nextFloat();
        float miles = (float)(km/1.609);
        System.out.println("The right value is "+ miles+" miles");


//        write a java program to detect whether a number entered by user is integer or not
        System.out.println("Enter the Integer: ");
        boolean aa = sc.hasNextInt();
        System.out.println(aa);
    }
}