package com.BasicProgram;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        System.out.println("Enter integer input which you want to display.");

        Scanner sc = new Scanner(System.in);
        // displaying integer
        int a = sc.nextInt();
        System.out.print("Output is : ");
        System.out.println(a);
        System.out.println("Enter your short integer input which you want to display.");

        byte b = sc.nextByte();
        System.out.print("Output is : ");
        System.out.println(b);

        // displaying floting point
        System.out.println("Enter your float input which you want to display.");
        float c = sc.nextFloat();
        System.out.print("Output is : ");
        System.out.println(c);

        // this return first word of sentence of a string
        System.out.println("Enter your one word string which you want to display.");
        String str1 = sc.next();
        System.out.print("Output one word is : ");
        System.out.println(str1);
        // this return remain all word of sentence of a string
        System.out.println("Enter your sentence string which you want to display.");
        String sentence = sc.nextLine();
        System.out.print("Output sentence is : ");
        System.out.println(sentence);
        // use below to print full string sentence
        System.out.println("Enter your string sentence which you want to display.");
        String sentenceString1 = sc.next();
        String sentenceString2 = sc.nextLine();
        System.out.print("Output full sentence is : ");
        System.out.print(sentenceString1 );
        System.out.println(sentenceString2);


        
    }
}
