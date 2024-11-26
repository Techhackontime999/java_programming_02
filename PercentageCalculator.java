package com.BasicProgram;

import java.util.Scanner;

public class PercentageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("**************Calculate Your Percentage Marks**********");
        System.out.print("Enter Number Of Subject : ");
        byte noOfSubject = sc.nextByte();
        System.out.print("Enter Maximum Marks In Each Subject : ");
        int maxMarks = sc.nextInt(noOfSubject);
        int totalMaxMarks = noOfSubject * maxMarks;
        float totalMarks = 0;
        for (int i = 0; i < noOfSubject; i++) {
            System.out.printf("Enter Subject %d Marks : ", (i + 1));
            float marks = sc.nextFloat();
            if (marks <= maxMarks) {
                totalMarks = totalMarks + marks;

            } else {
                System.out.println("You Entered Invalid Marks. ! Kindly Try Again");
                break;
            }
        }
        System.out.println("<<<<<<<<<<<< Your Total Percentage >>>>>>>>>");
        float Percentage = (totalMarks * maxMarks) / totalMaxMarks;
        System.out.print("Percentage: ");
        System.out.println(Percentage);
    }
}
