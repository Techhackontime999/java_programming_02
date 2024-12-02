package com.BasicProgram;

import java.util.Scanner;

public class FindMaxNumInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number Of Input In Array : ");
        int inputNum = sc.nextInt();
        float maxNum = 0;
        float[] num = new float[inputNum];
        for (int index = 0; index < inputNum; index++) {
            System.out.printf("Enter [%d] Num : ", index + 1);
            num[index] = sc.nextFloat();
            if ((maxNum < num[index]) || index==0) {
                maxNum = num[index];
            } 
        }
        System.out.println("Your Array is Created successfully.");
        System.out.println("Maximum Number is : " + maxNum);
        sc.close();

    }
}