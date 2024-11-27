package com.BasicProgram;
import java.util.Scanner;
public class MaxNumBwTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     System.out.print("Enter First num: ");
        float a=sc.nextFloat();
        System.out.print("Enter Second num: ");
        float b=sc.nextFloat();  
        if (a>b) {
            System.out.println(a+"is greater");
        }
        else{
            System.out.println(b+" is greater");

        }
    }
}
