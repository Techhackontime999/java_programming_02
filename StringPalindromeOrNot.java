package com.BasicProgram;
import java.util.Scanner;
public class StringPalindromeOrNot {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Your String : ");
        String str1=sc.next();
        String str2=sc.nextLine();
        String fullstr=str1+str2;
        System.out.println("**********Enter 1 For Reversing The String Either 2 For Check Palindrome Or Not************");
        int choose=sc.nextInt();
        String newstr="";
        for (int index =fullstr.length()-1; index >=0; index--) {
            newstr=newstr+fullstr. charAt(index);
          }
        if (choose==1) {
           
            System.out.println(newstr);
        }
        if (choose==2) {
            if (newstr.equals(fullstr)) {
                System.out.println(fullstr+ " is a palindrome string.");
            }
        else{
            System.out.println(fullstr+ " is not a palindrome string.");
            
        }
        }
    }
}
