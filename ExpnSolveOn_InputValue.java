package com.BasicProgram;
import java.util.Scanner;
public class ExpnSolveOn_InputValue{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Final velocity v: ");
        float v=sc.nextFloat();
        System.out.print("Enter Inicial velocity u: ");
        float u=sc.nextFloat();
        System.out.print("Enter acceleration a: ");
        float a=sc.nextFloat();
        System.out.print("Enter displacement s: ");
        float s=sc.nextFloat();
        float expn=((v*v)-(u*u))/(2*a*s);
        System.out.print("Expression solution is : ");
        System.out.println(expn);


    }
}