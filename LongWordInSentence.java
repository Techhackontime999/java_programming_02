package com.BasicProgram;

import java.util.Scanner;

public class LongWordInSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your String: ");
        String fullstr = sc.nextLine();
        String[] parts = fullstr.split("\\s+");
        String prevWord = "";
        String sameStr = "";

        System.out.println("********************* Your Result *********************");
        if (fullstr.isBlank()) { // Corrected string comparison for empty check
            System.out.println("Your string is empty.");
        } else {
            for (String currentWord : parts) {
                if (currentWord.length() > prevWord.length()) {
                    prevWord = currentWord;
                    sameStr = currentWord; // Reset sameStr with the new longest word
                } else if (currentWord.length() == prevWord.length() && !sameStr.contains(currentWord)) {
                    sameStr += " " + currentWord; // Append unique words with the same length
                }
            }
            System.out.println("Longest Words with Same Length: " + sameStr.trim());
            System.out.println("Last Longest Word: " + prevWord);
            System.out.println("Longest Word Length: " + prevWord.length());
        }          
        sc.close(); // Close the scanner to avoid resource leaks
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
