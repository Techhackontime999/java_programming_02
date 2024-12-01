package com.BasicProgram;
import java.util.Scanner;

public class Digit_In_Integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Integer Number: ");
        int num = sc.nextInt();  // Input the number
        int count = 0;  // Initialize digit count

        // Handle the case for zero separately
        if (num == 0) {
            count = 1;
        } else {
            while (num != 0) {
                num = num / 10;  // Remove the last digit
                // ++count also give here the same result
                count++;         // Increment the count and count++ use current value here 0 when it defined.after next statement it is increamented.
            }
        }

        System.out.println("Number of digits: " + count);  // Output result
    }
}
