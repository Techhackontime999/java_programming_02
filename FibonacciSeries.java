/*
The Fibonacci numbers are the numbers in the following integer sequence. 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, …….. In mathematical terms, the sequence Fn of Fibonacci numbers is defined by the recurrence relation.


Fibonacci series starting from 0 then 1.it says in fibonacci series next digit or number is the sum of initial two digit or number.
ex:0,1,1,2,3,5,8,13................
formulla:
        nth digit=(n-1)th digit+(n-2)th digit
 */
package com.BasicProgram;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of Element in Fibonacci : ");
        int num = sc.nextInt();
        int f1 = 0;
        int f2 = 1;
        int fn = f2+f1;
        for (int i = 0; i < num; i++) {
            if (i < 3) {
                if (i == 0) {
                    System.out.println(f1);
                    continue;
                } else if (i == 1) {
                    System.out.println(f2);
                    continue;

                } else if (i == 2) {
                    System.out.println(fn);
                    continue;

                } 

            }
            f1 = f2;
            f2 = fn;

            fn = f2 + f1;
            
     System.out.println(fn);

        }

    }

}
