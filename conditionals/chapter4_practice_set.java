package com.dev.conditionals;

import java.util.Scanner;

public class chapter4_practice_set {
    public static void main(String[] args) {

//        Q2 practice set
        System.out.println("This is practice set");
        System.out.println("Enter Your Marks Here:");

        Scanner sc = new Scanner(System.in);

        System.out.println("English");
        int english = sc.nextInt();
        if (english>=35){
            System.out.println("Congrates you passed it");
        }else{
            System.out.println("You got less marks in english");
        }

        System.out.println("Maths");
        int maths = sc.nextInt();
        if (maths>=35){
            System.out.println("Congrates you passed it");
        }else{
            System.out.println("You got less marks in maths");
        }

        System.out.println("Java");
        int java = sc.nextInt();
        if (java>=35){
            System.out.println("Congrates you passed it");
        }else{
            System.out.println("You got less marks in java");
        }

        int sum = english+maths+java;
        int percentage = sum*100/300;

        if (percentage>=40){
            System.out.println("Congratulations You cleared this test, You got "+ percentage);
        } else if (percentage<40) {
            System.out.println("We regret You could not able to pass this test, You got "+ percentage );
        }

//        Q3 income tax calculator
        int tax, income, taxpay;
        Scanner sct = new Scanner(System.in);
        System.out.println("Enter Your Annual Salary.");
        income = sct.nextInt();
        if (income<=250000){
            System.out.println("You dont have to pay from your salary");
        } else if (income>250000 && income<=500000) {
            System.out.println("You have to pay "+income*5/100);
        } else if (income>500000 && income<=1000000) {
            System.out.println("You have to pay "+income*20/100d+"Rs");
        } else if (income>1000000) {
            System.out.println("You have to pay "+income*30/10067+" Rs");
        }
    }
}