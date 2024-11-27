package com.BasicProgram;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     System.out.print("Enter Number: ");
     int n=sc.nextInt();
     long factorial=1l;
     for (int index = 1; index <= n; index++) {
        if (n==0 || n==1) {
            factorial=1;
            break;
        }
        else{
factorial=factorial*index;
        }
     }
     System.out.println("Factorial is: " +factorial);
    }
}
