package com.BasicProgram;

import java.util.Scanner;

public class ArraySort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number Of Input In Array : ");
        int inputNum = sc.nextInt();
        float[] num = new float[inputNum];
        String str = "";
        for (int index = 0; index < inputNum; index++) {
            System.out.printf("Enter [%d] Num : ", index + 1);
            num[index] = sc.nextFloat();
        }
        System.out.println("Your Array is Created successfully.");
        for (float element : num) {
            str = str + element + " , ";

        }
        System.out.println("Now Your Array is : [ " + str.substring(0, str.strip().length() - 1) + " ]");

        System.out.println(
                "****************** Enter 1 For Sorting Array In Ascendending Order Or 2 For Dscending Order.********************");
        System.out.print("Enter Option: ");
        int choose = sc.nextInt();
        if (choose == 1) {
            for (int i = 0; i < num.length; i++) {

                for (int j = i + 1; j < num.length; j++) {
                    if (num[i] > num[j]) {
                        // swap num[i] with num[j]
                        num[i] = num[i] + num[j];
                        num[j] = num[i] - num[j];
                        num[i] = num[i] - num[j];
                    }
                }
            }

        }
        if (choose == 2) {
            for (int i = 0; i < num.length; i++) {

                for (int j = i + 1; j < num.length; j++) {
                    if (num[i] < num[j]) {
                        // swap num[i] with num[j]
                        num[i] = num[i] + num[j];
                        num[j] = num[i] - num[j];
                        num[i] = num[i] - num[j];
                    }
                }
            }
        }

        System.out.println("Your Array is Sort successfully.");
        str = "";
        for (float element : num) {
            str = str + element + " , ";

        }
        System.out.println("Your Sorted Array is : [ " + str.substring(0, str.strip().length() - 1) + " ]");
        sc.close();

    }
}