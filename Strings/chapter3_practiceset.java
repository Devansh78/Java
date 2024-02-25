package com.dev.Strings;

import java.util.Locale;

public class chapter3_practiceset {
    public static void main(String[] args) {

//        WRITE A PROGRAM TO CONVERT A STRING INTO LOWERCASE.
        String q1 = "DeVansH";
        System.out.println(q1.toLowerCase());


//        WRITE A JAVA PROGRAM TO REPLACE SPACES WITH UNDERSCORES.
        String q2 = "Hello I am Devansh";
        System.out.println(q2.replace(" ","_"));


//        WRITE A PROGRAM TO FILL IN A LETTER TEMPLATE WHICH LOOKS LIKE BELOW.
        String q3 = "Dear <|name|>, thanks a lot";
        System.out.println(q3.replace("<|name|>","Devansh"));

//        WRITE A JAVA PROGRAM TO DETECT DOUBLE AND TRIPLE SPACES IN A STRING
        String q4 = "Hello   I am  Devansh!!";
        System.out.println(q4.indexOf("  ",10));
        System.out.println(q4.lastIndexOf("   ",15));

//        WRITE A JAVA PROGRAM TO FORMAT THE FOLLOWING LETTER USING ESCAPE CHARACTERS
        String q5 = "\n\n Dear Devansh,\n\t This Java Course Is Made For You.\n Thanks";
        System.out.println(q5);


//        YOU DID IT🚀🚀🚀🚀
    }
}