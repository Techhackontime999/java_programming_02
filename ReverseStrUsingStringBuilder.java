package com.BasicProgram;

import java.util.Scanner;

public class ReverseStrUsingStringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        System.out.println("Enter Your String: ");
        String str = sc.nextLine();
        sb.append(str);

        // also we have method to reverse string which is made by StringBuilder
        // method 1 using reverse method in string builder java
        // System.out.println(sb.reverse().toString().strip().replaceAll("\\s+"," "));


        // method 2 using below iterative approach

        for (int i = 0; i < sb.length() / 2; i++) {
            int front = i;
            char fronstr = sb.charAt(front);
            int back = sb.length() - 1 - i;
            char backstr = sb.charAt(back);
            sb.setCharAt(front, backstr);
            sb.setCharAt(back, fronstr);
        }

        System.out.println(sb.toString().strip().replaceAll("\\s+", " "));


    }
}
