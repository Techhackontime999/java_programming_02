package com.BasicProgram;
import java.util.Scanner;
public class EvenSum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter number : ");
        int num=sc.nextInt();
        System.out.printf("*********First %d Even Number Given Below*******",num);
        System.out.println();
        int sum=0;
        // using for
        // for (int index = 0; index <=num; index++) {
        //     sum=sum+(2*index);
        // }
        // using while
        int index=0;
        while (index<=num) {
            sum=sum+(2*index);
            index++;
            
        }
        System.out.printf("Even sum Of First %d Number is: %d ",num,sum);
    }
}
