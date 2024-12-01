package com.BasicProgram;
import java.util.Scanner;
public class NaturalReverse {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
    System.out.println("**************Print Natural Number**********");
    System.out.print("Enter Starting Point: ");
    int end=sc.nextInt();
    System.out.print("Enter Ending Point: ");
    int start=sc.nextInt();
  
    for (int index = end; index >=start; index--) {
        System.out.println(index);
    }
}
}
