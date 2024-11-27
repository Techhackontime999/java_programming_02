package com.BasicProgram;
import java.util.Scanner;
public class CheckIntOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number to check: ");
        // int num=sc.nextInt();
        boolean check=sc.hasNextInt();
        if (check) {
            System.out.println("it is an integer");
            
        }
        else{
            System.out.println("it not an integer");

        }
        sc.close();

    }
}
