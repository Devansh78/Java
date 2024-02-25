package com.dev;

import java.util.Scanner;

public class CalculatepercentageofSSC {
    public static void main(String[] args) {
        System.out.println("Enter your marks as per subject: ");

        Scanner sub = new Scanner(System.in);
        System.out.println("Enter the marks of English: ");
        int eng = sub.nextInt();
        System.out.println("Enter the marks of Maths: ");
        int mat = sub.nextInt();
        System.out.println("Enter the marks of Science: ");
        int sci = sub.nextInt();
        System.out.println("Enter the marks of Hindi: ");
        int hindi = sub.nextInt();

        System.out.println("Enter the total marks of all subject: ");
        int totalmarks = sub.nextInt();


        int sum = eng+mat+sci+hindi;

        int percentage = (sum*100)/totalmarks;

        System.out.println("Your total % is: "+ percentage);
    }
}