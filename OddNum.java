package com.BasicProgram;
import java.util.Scanner;
public class OddNum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter number : ");
        int num=sc.nextInt();
        System.out.printf("*********First %d Odd Number Given Below*******",num);
        System.out.println();

        for (int index = 0; index <=num; index++) {
            System.out.println((2*index+1));
        }
    }
}
