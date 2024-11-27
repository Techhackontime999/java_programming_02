package com.BasicProgram;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // wap a user is which category
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        // traditional switch:-here need break for executing below cases after meet correct case
        // switch (age) {
        // case 18:
        // System.out.println("you are young");
        // System.out.println("you are lucky");

        // break;
        // case 50:
        // System.out.println("you are old");
        // h break;
        // default:
        // System.out.println("Enjoy Your Life");

        // break;
        // }
        // inhanced switch:- here no need of break
        switch (age) {
            case 18 -> {
                System.out.println("you are young");
                System.out.println("you are lucky");
            }
            case 50 ->System.out.println("you are old");
            default ->System.out.println("Enjoy Your Life");
        }
    }
}
