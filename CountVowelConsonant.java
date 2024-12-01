// count vowel and consonant pgm with empty string handling
package com.BasicProgram;

import java.util.Scanner;

public class CountVowelConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your String : ");

        String fullstr = sc.nextLine();
        // isBlank method return true if string is empty and only taken white spaces
        // isEmpty method return true only if string is Empty
        boolean empty = fullstr.isBlank();
        int count = 0;
        char checkLetter;
        int isLetterValue;

        int choose;

        if (empty) {

            System.out.println("The string is empty. Please enter a valid string.");
        } else {
            System.out.println(
                    "**********Enter 1 For Finding Vowel Count in The String Either 2 For Finding Consonant Count in The String.************");
            System.out.print("Enter Option: ");
            choose = sc.nextInt();
            if (choose == 1) {
                for (int i = 0; i < fullstr.length(); i++) {
                    checkLetter = fullstr.toLowerCase().charAt(i);
                    if (checkLetter == 'a' || checkLetter == 'e' || checkLetter == 'i' || checkLetter == 'o'
                            || checkLetter == 'u') {
                        count++;

                    }

                }
                System.out.printf("%d vowel in your string.", count);
                System.out.println();
            }
            if (choose == 2) {
                for (int i = 0; i < fullstr.length(); i++) {
                    checkLetter = fullstr.toLowerCase().charAt(i);
                    isLetterValue = (int) (checkLetter);
                    if ((checkLetter != 'a' && checkLetter != 'e' && checkLetter != 'i' && checkLetter != 'o'
                            && checkLetter != 'u') && (isLetterValue >= 97 && isLetterValue <= 122)) {
                        count++;

                    }

                }
                System.out.printf("%d Consonant in your string.", count);
                System.out.println();
            }
        }
    }
}

// gpt code below for handling empty string

// package com.BasicProgram;

// import java.util.Scanner;

// public class CountVowelConsonant {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter Your String: ");

// // Use sc.nextLine() to read the full line including spaces
// String fullstr = sc.nextLine().trim(); // Using trim() to remove
// leading/trailing spaces

// // Check if the string is empty or only contains whitespace
// if (fullstr.isEmpty()) {
// System.out.println("The string is empty. Please enter a valid string.");
// } else {
// System.out.println(
// "********** Enter 1 For Finding Vowel Count in The String or 2 For Finding
// Consonant Count in The String. ************");
// System.out.print("Enter Option: ");
// int choose = sc.nextInt();

// int count = 0;
// char checkLetter;

// // Handle vowel count
// if (choose == 1) {
// for (int i = 0; i < fullstr.length(); i++) {
// checkLetter = fullstr.toLowerCase().charAt(i);
// if ("aeiou".indexOf(checkLetter) != -1) { // Check if vowel
// count++;
// }
// }
// System.out.printf("%d vowel(s) in your string.%n", count);
// }
// // Handle consonant count
// else if (choose == 2) {
// for (int i = 0; i < fullstr.length(); i++) {
// checkLetter = fullstr.toLowerCase().charAt(i);
// if (Character.isLetter(checkLetter) && "aeiou".indexOf(checkLetter) == -1) {
// // Check consonant
// count++;
// }
// }
// System.out.printf("%d consonant(s) in your string.%n", count);
// }
// }
// }
// }
