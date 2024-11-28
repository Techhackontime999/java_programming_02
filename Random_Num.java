package com.BasicProgram;
import java.util.Scanner;
import java.util.Random;;
public class Random_Num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rc=new Random();
     //    generate a random number integer within range
     int randnum=rc.nextInt(90);
     System.out.println("Random Number: " +randnum);
    }
}
