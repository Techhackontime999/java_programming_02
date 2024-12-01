// wap a program to find out the type of the website from the url.
package com.BasicProgram;
import java.util.Scanner;
public class WebUrlType {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter Your Website Url : ");
    String str1=sc.next();
    String str2=sc.nextLine();
    String fullUrl=(str1+str2).toLowerCase();
    if (fullUrl.endsWith(".com")) {
        System.out.println(fullUrl+ " is a Commercial Website.");
    }
    else if (fullUrl.endsWith(".org")) {
        System.out.println(fullUrl+ " is an Organization Website.");
        
    }
    else if (fullUrl.endsWith(".in")) {
        System.out.println(fullUrl+ " is an Indian Website.");
        
    }
   } 
}
