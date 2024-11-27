package com.BasicProgram;
import java.util.Scanner;
public class Greet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String str1=sc.next();
        String str2=sc.nextLine();
        String new_str=str1+str2;
        System.out.println("Have a Good Day  ! " + new_str );
        sc.close();

    }
}
