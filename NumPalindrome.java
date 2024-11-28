package com.BasicProgram;
import java.util.Scanner;
public class NumPalindrome {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Your number : ");
        int num=sc.nextInt();
        // store this num in a variable for checking palindrome
        int originalNum=num;
        int reversedNum=0;
        while (num>0) {
            // extract last digit from the num using num%10
            int digit=num%10;
            // divide num from 10 to remove last digit from the num.
            num=num/10;
            // update reveseNum by using reversedNum*10+digit
            reversedNum=reversedNum*10+digit;
            
        }
        System.out.println("**********Enter 1 For Reversing The Number Either 2 For Check Palindrome Or Not************");
        int choose=sc.nextInt();
        if (choose==1) {
            System.out.println("Reversed Of Your Number is : " +reversedNum);
        }
        if (choose==2) {
            if (reversedNum==originalNum) {
                System.out.println(originalNum+" Is a Palindrome Number");
            }
        }
    }
}
