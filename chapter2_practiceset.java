package com.dev;

import java.util.Scanner;

public class chapter2_practiceset {
    public static void main(String[] args) {

//        WHAT  WILL BE THE RESULT  OF THE  FOLLOWING EXPRESSION FLOAT a=7/4*9/2
        float a = 7/4 * 9/2;
        System.out.println(a);


//        WRITE A JAVA PROGRAM TO ENCRYPT A GRADE BY ADDING 8 TO IT DECRYPT IT TO SHOW THE CORRECT GRADE
//        ENCRYPTING THE DATA
        char grade = 'B';
        grade = (char) (grade + 8);
        System.out.println(grade);
//DECRYPTING THE DATA
        grade = (char)(grade-8);
        System.out.println(grade);


//        USE A COMPARISION OPERATOR TO FIND  OUT WHETHER A GIVEN NUMBER IS GRATER THAN THE USER ENTERED NUMBER OR NOT
        int ab=5;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The number: ");
        int aa = sc.nextInt();
        System.out.println(aa==ab);


//        WRITE A FOLLOWING EXPRESSION IN JAVA
        int v, u, ac, s;
        v=2;u=5;s=3;
        float res= (float) (v * v - u * u) /2*a*s;
        System.out.println(res);


//        FIND THE VALUE OF THE FOLLOWING OPERATOR
        int x = 7;
        int ad = ((7*49)/7)+(35/7);
        System.out.println(ad);
    }
}