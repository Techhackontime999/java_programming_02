package com.BasicProgram;
public class SwapUsing3rdVar {
    public static void main(String[] args) {
        int a=2;
        int b=4;
        System.out.println("Before Swaping Value of a is : " +a +" and b is : " +b);  
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("After Swaping Value of a is : " +a +" and b is : " +b);  

    }
   
}
