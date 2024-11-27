package com.BasicProgram;
import java.util.Scanner;
public class Kilometer_To_Miles {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
  System.out.print("Enter Kilometer Value : ");
 float km=sc.nextFloat();
  float miles=km*0.621371f;
    System.out.print("Conversion Value in Miles is : ");
    System.out.println(miles);

  };
}
