package com.BasicProgram;

import java.util.Scanner;

public class ArrayReverse {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number Of Input In Array : ");
        int inputNum = sc.nextInt();
        float[] num = new float[inputNum];
        String str="";
        for (int index = 0; index < inputNum; index++) {
            System.out.printf("Enter [%d] Num : ", index + 1);
            num[index] = sc.nextFloat();  
        }
        System.out.println("Your Array is Created successfully.");
        for (float element : num) {
            str= str + element + " , ";
            
        }
        System.out.println("Now Your Array is : [ "+ str.substring(0,str.strip().length()-1) +" ]");

        for (int index = 0; index < inputNum/2; index++) {
            int front=index;
            int back=inputNum-1-index;
            // swap using 3rd variable
            // float temp;
            // temp=num[front];
            // num[front]=num[back];
            // num[back]=temp;
            // swap without 3rd variable using arithmetic method
            //ex:-let, num[front]=a and num[back]=b
            num[front]=num[front]+num[back];//a=a+b
            num[back]=num[front]-num[back];//b=a-b i.e b=a+b-b i.e b=a means b is updated with original value of a
            num[front]=num[front]-num[back];//a=a-b i.e a=a+b-a i.e a=b means a is updated with b because
        }
        System.out.println("Your Array is Reversed successfully.");
        str="";
        for (float element : num) {
            str= str + element + " , ";
            
        }
        System.out.println("Your Reverse Array is : [ "+ str.substring(0,str.strip().length()-1) +" ]");
        sc.close();

    }
}