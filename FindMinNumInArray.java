package com.BasicProgram;

import java.util.Scanner;

public class FindMinNumInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number Of Input In Array : ");
        int inputNum = sc.nextInt();
        float minNum = 0;
        float[] num = new float[inputNum];
        for (int index = 0; index < inputNum; index++) {
            System.out.printf("Enter [%d] Num : ", index + 1);
            num[index] = sc.nextFloat();
            if ((minNum > num[index]) || index==0) {
                minNum = num[index];
            } 
        }
        System.out.println("Your Array is Created successfully.");
        System.out.println("Minumum Number is : " + minNum);
        sc.close();

    }
}