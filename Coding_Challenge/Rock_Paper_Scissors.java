package com.dev.Coding_Challenge;

import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissors {
    public static void main(String[] args) {
        String a = "Stone";
        String b = "Paper";
        String c = "Scissors";

        System.out.println("Enter any value between \n 1) Stone \n 2) Paper \n 3) Scissors");
        Scanner sc = new Scanner(System.in);
        int user_input = sc.nextInt();

        Random pc = new Random();
        int pc_input = pc.nextInt(1,3);
        System.out.println(pc_input);

        if (pc_input==1 && user_input==1){
            System.out.println("Match is Draw");
        }
//        Stone to Paper
        else if (pc_input==1 && user_input==2) {
            System.out.println("You Won!!!");
        }
//        Stone to Scissor
        else if (pc_input==1 && user_input==3) {
            System.out.println("You Won!!!");
        }
//        Paper to Stone
        else if (pc_input==2 && user_input==1) {
            System.out.println("You Lose!!!");
        }
//        Paper to Paper
        else if (pc_input==2 && user_input==2) {
            System.out.println("Match is Draw!!!");
        }
//        Paper To Scissor
        else if (pc_input==2 && user_input==3) {
            System.out.println("You Won!!!");
        }
//        Scissor To Stone
        else if (pc_input==3 && user_input==1) {
            System.out.println("You lose!!!");
        }
//        Scissor To Paper
        else if (pc_input==3 && user_input==2) {
            System.out.println("You Won!!!");
        }
//        Scissor To Stone
        else if (pc_input==3 && user_input==3) {
            System.out.println("Match is Draw!!!");
        }
    }
}
