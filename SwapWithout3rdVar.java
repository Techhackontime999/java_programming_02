package com.BasicProgram;

import java.util.Scanner;

public class SwapWithout3rdVar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        // float a = sc.nextFloat();
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        // float b = sc.nextFloat();
        System.out.println("Before Swaping Value of a is : " + a + " and b is : " + b);
        // Two method for swaping without using third variable
        /* 
        // 1.using Arithmetic method 
        // swap through arithmetic method we swap both integer and floating point datatype
        // step 1st: update a by joining both then here a got updated and b remain same
        a=a+b;
        // step 2nd:update b by subtracting b from a then here b is updating with  original starting value of a and a remain same by upper value.
        b=a-b;
        // step 3rd:update a by subtracting upper b value from a then a is updating wih starting value of b and b remain upper value which is already original vale of a after updating;
        a=a-b;
        System.out.println("After Swaping Value of a is : " + a + " and b is : " + b);
        */
        // 2. using Bitwise XOR '^'
        // swap through bitwise xor only for integer datadype
            // step 1st: update a by joining both then here a got updated and b remain same
            a=a ^ b;
            // step 2nd:update b by subtracting b from a then here b is updating with  original starting value of a and a remain same by upper value.
            b=a ^ b;
            // step 3rd:update a by subtracting upper b value from a then a is updating wih starting value of b and b remain upper value which is already original vale of a after updating;
            a=a ^ b;
            System.out.println("After Swaping Value of a is : " + a + " and b is : " + b);


    }
}
