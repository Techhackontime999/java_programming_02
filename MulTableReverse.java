package com.BasicProgram;
import java.util.Scanner;
public class  MulTableReverse  {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.print("Enter number : ");
int num=sc.nextInt();
System.out.printf("*********Multiplication Table of %d Given Below*******",num);
System.out.println();
for (int i = 10; i >0 ; i--) {
//    System.out.printf("%d x %d = %d ",num,i,(num*i));
   System.out.format("%d x %d = %d ",num,i,(num*i));
System.out.println();

}

    }
}
