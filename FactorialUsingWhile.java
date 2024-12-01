package com.BasicProgram;
import java.util.Scanner;
public class FactorialUsingWhile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num=sc.nextInt();
        int factorial=1;
        if(num>=0) {
            int i=1;
            while (i<=num) {
                if (num==0 || num==1) {
                   break; 
                }
                else{
                    factorial=factorial*i;
                    i++;
                }
            }
            System.out.printf("Factorial Of %d is : %d ",num,factorial);
        }
    }
}
