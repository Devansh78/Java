package com.dev.Strings;

import java.net.SocketTimeoutException;
import java.sql.SQLOutput;
import java.util.Locale;

public class String_Method {
    public static void main(String[] args) {
        String name = "  Devan  sh   ";
        System.out.println(name.trim());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.replace("a","i"));


        String sub="Devansh";
        System.out.println(sub.substring(1));
        System.out.println(sub.substring(1,4));
        System.out.println(sub.replace("a","i"));
        System.out.println(sub.replace("ansh","il"));
        System.out.println(sub.startsWith("Dev"));
        System.out.println(sub.startsWith("we"));
        System.out.println(sub.endsWith("h"));
        System.out.println(sub.endsWith("Devansh"));
        System.out.println(sub.charAt(5));
        System.out.println(sub.indexOf("v"));
        System.out.println(sub.lastIndexOf("sh"));
        System.out.println(sub.length());

        System.out.println("Devansh Is great \b  is he??");
    }
}