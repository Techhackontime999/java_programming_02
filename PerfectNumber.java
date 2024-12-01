// A Number is Called Perfect Number When Its All Divisor or Common Factor exculding itself's sum is Equal to This Number.

/* 
A perfect number is a positive integer that is equal to the sum of its proper divisors, excluding itself. In other words, if you take all the divisors of the number (except the number itself), and sum them up, the result will be the number itself.
Example of Perfect Numbers:

    6: The divisors of 6 are 1, 2, and 3.
        Sum: 1 + 2 + 3 = 6, which is equal to the number itself, so 6 is a perfect number.

    28: The divisors of 28 are 1, 2, 4, 7, 14.
        Sum: 1 + 2 + 4 + 7 + 14 = 28, so 28 is also a perfect number.
        */
package com.BasicProgram;  
import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Positive Integer Number: ");
        int num = sc.nextInt();  // Input the number
        int resultNum=0;
        for (int i = 1; i < num; i++) {
            if (num%i==0) {
                resultNum=resultNum+i;
            }
        }
        if (resultNum==num) {
            System.out.println(num+ " is a perfect number.");
        }
        else{
            System.out.println(num+ " is not a perfect number.");

        }
    }
}
