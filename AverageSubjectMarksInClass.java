// wap a pgm to find average marks in a subject in class
package com.BasicProgram;

import java.util.Scanner;

public class AverageSubjectMarksInClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("**********************Calculate Average Marks In class*********************");
        System.out.print("Enter Number Of Student : ");
        int studentNum = sc.nextInt();
        float avg = 0;
        float totalMarks=0;
        float[] marks = new float[studentNum];
        for (int index = 0; index < studentNum; index++) {
        System.out.printf("Enter Student %d Marks : ",index+1);

            marks[index] = sc.nextFloat();
            totalMarks = totalMarks+ marks[index];
        }
        avg=totalMarks/studentNum;
        System.out.println("Average Marks in Class is : " + avg);
// use sc.close to avoid memory lekage through scanner class
        sc.close();
    }
}
