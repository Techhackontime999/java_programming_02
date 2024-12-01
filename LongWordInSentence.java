// // wap a program to find longest word fom the string
// my 2nd terminology to solve it

package com.BasicProgram;

import java.util.Scanner;

public class LongWordInSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your String : ");
        String fullstr = sc.nextLine();
        String[] parts = fullstr.split("\\s+");
        StringBuilder resultstr = new StringBuilder();
        String prevWord = "";
        // resultstr.append(fullstr);
        System.out.println("********************* Your Result *********************");
        if (fullstr == "") {
            System.out.println("your string is empty.");
        } else {

            for (String currentWord : parts) {

            }
        }
    }
}

// my terminology 1 which i try it to solve.
// package com.BasicProgram;

// import java.util.Scanner;

// public class LongWordInSentence {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter Your String : ");
// String fullstr = sc.nextLine();
// fullstr = fullstr.strip().replaceAll(" ", " ");
// String[] parts = fullstr.split("\\s+");
// int arrlen = parts.length;
// String checkstr = "";
// String sameStr = "";
// int lastsamestrlen=0;
// for (String part : parts) {
// if (part.length() > checkstr.length()) {
// checkstr = part;

// }
// else if ((part.length() == checkstr.length())) {
// if (lastsamestrlen<part.length()) {
// sameStr="";
// }
// if (sameStr=="") {
// sameStr = sameStr + checkstr + "," + part + ",";
// lastsamestrlen=part.length();

// }

// }

// else if (part.length() < checkstr.length()) {
// continue;
// }

// }
// if (fullstr.length() == 0) {
// System.out.println("Your String is Empty.");

// }

// else {
// System.out.println("String With Same Length is : " + sameStr);
// System.out.println("Longest word is : " + checkstr);
// System.out.println("Longest word Length is : " + checkstr.length());
// }
// }
// }
