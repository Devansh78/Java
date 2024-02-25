package com.dev.conditionals;

import java.util.Scanner;

public class Q6_WebsiteOrigine {
    public static void main(String[] args) {
        System.out.print("Enter the domain name here: ");
        Scanner sc = new Scanner(System.in);
        String webname = sc.nextLine();
        if (webname.endsWith(".com")){
            System.out.println("Your website is commercial website");
        } else if (webname.endsWith(".in")) {
            System.out.println("Your website is Indian Website");
        } else if(webname.endsWith(".org")){
            System.out.println("Your website is organization website");
        }
    }
}
