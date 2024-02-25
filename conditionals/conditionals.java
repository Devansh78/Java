package com.dev.conditionals;

import java.util.Scanner;

public class conditionals {
    public static void main(String[] args) {

//        TRYING IF STATEMENT
        int a = 20;
        if (a>20){
            System.out.println("Hello gentlemen");
        }

//        TRYING IF-ELSE STATEMENT.
        int b = 1;
        if (b>=18){
            System.out.println("You can kiss that girl");
        }else{
            System.out.println("Use your hands😂");
        }

//        TRYING IF-ELSE IF- ELSE STATEMENT
        int c;
        System.out.println("Enter your savings here:");
        Scanner dev=new Scanner(System.in);
        c = dev.nextInt();
        if (c<15 && c>=7){
            System.out.println("Buy a car");
        } else if (c>20 || c>=15) {
            System.out.println("Fuck a girl");
        }else{
            System.out.println("Use your hands");
        }

//        TRYING TO USE SWITCH CASE STATEMENTS
        int d;
        System.out.println("Enter age here:");
        Scanner sc = new Scanner(System.in);
        d = sc.nextInt();
        switch (d){
                case 10:
                    System.out.println("You are you little kid");
                    break;
                case 16:
                    System.out.println("You are growing");
                    break;
                case 20:
                    System.out.println("you are adult now");
                    break;
                case 60:
                    System.out.println("You are ready for retirement");
                    break;
            default:
                System.out.println("Enjoy your life");
        }
    }
}