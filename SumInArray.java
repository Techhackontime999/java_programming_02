package com.BasicProgram;
import java.util.Scanner;

public class SumInArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("**********************Calculate Average Marks In class*********************");
        System.out.print("Enter Number Of Input : ");
        int inputNum = sc.nextInt();
        float resultSum = 0;
        float[] num = new float[inputNum];
        for (int index = 0; index < inputNum; index++) {
        System.out.printf("Enter [%d] Num : ",index+1);

           num[index] = sc.nextFloat();
            resultSum = resultSum+ num[index];
        }
        System.out.println("Total Sum is : " + resultSum);

        sc.close();
    }
}