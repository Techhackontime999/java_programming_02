package com.BasicProgram;
import java.util.Scanner;
public class MaxBwThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     System.out.print("Enter First num: ");
        float a=sc.nextFloat();
        System.out.print("Enter Second num: ");
        float b=sc.nextFloat(); 
        System.out.print("Enter Third num: ");
        float c=sc.nextFloat();   
        // 1st method
        // if (a>b && a>c) {
        //     System.out.println(a+"is greater");
        // }
        // else if(b>a && b>c){
        //     System.out.println(b+" is greater");

        // }
        // else{
        //     System.out.println(c+" is greater");

        // }
        // 2nd method 
        float f1;
        float f2;
        if (a>b) {
            f1=a;
        }
        else{
          f1=b;
        }
       if (f1>c) {
        f2=f1;
       }
       else{
        f2=c;
       }
       System.out.println(f2+ " is greater");

    }
}
