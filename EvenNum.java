package com.BasicProgram;
import java.util.Scanner;
public class EvenNum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter number : ");
        int num=sc.nextInt();
        System.out.printf("*********First %d Even Number Given Below*******",num);
        System.out.println();

        for (int index = 0; index <=num; index++) {
            System.out.println((2*index));
        }
    }
}
