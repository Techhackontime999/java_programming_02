package com.BasicProgram;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number: ");
        int n = sc.nextInt();
        boolean result = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                result = false;
            }

        }

        if (result) {
            System.out.println("it is prime number");

        } else {
            System.out.println("it is not prime number");

        }
    }
}