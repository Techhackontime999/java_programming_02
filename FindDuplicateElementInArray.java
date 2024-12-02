package com.BasicProgram;

import java.util.Scanner;

public class FindDuplicateElementInArray {
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
        str = "";
        for (int i = 0; i < num.length; i++) {
            String check=""+num[i];
            for (int j = 0; j < num.length; j++) {
                if ((num[i] == num[j]) && i != j && !str.contains(check)){
                    str = str + num[i] + " , ";
                }
            }

        }
        System.out.println("Array Contain Same Elements Of: [ " + str.substring(0, str.strip().length() - 1) + " ]");

        sc.close();

    }
}