package com.BasicProgram;
import java.util.Scanner;
public class NaturalNum {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
    System.out.println("**************Print Natural Number**********");
    System.out.print("Enter Starting Point: ");
    int start=sc.nextInt();
    System.out.print("Enter Ending Point: ");
    int end=sc.nextInt();
    for (int index = start; index <=end; index++) {
        System.out.println(index);
    }
}
}
