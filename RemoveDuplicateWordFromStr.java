package com.BasicProgram;

import java.util.Scanner;

public class RemoveDuplicateWordFromStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your String : ");
        String fullstr = sc.nextLine();
        // Normalize spaces
        //\\s+ replace all the extra spaces between the string and strip from both end.
        fullstr = fullstr.strip().replaceAll("\\s+", " ");
        String[] parts = fullstr.split("\\s+");

        String prevWord = ""; // To keep track of the previous word
        // in java we cant change string dynamically because of immutablity but we use StringBuilder to create new String dynamically.
        StringBuilder result = new StringBuilder(); // To build the result string

        for (String currentWord : parts) {
            if (!currentWord.equals(prevWord)) {
                // Append the word if it's not a duplicate of the previous
                result.append(currentWord).append(" ");
                prevWord = currentWord; // Update the previous word
            }
        }

        // Trim trailing space from the final result
        // The toString() method in Java is a built-in method of the Object class, which is the superclass of all Java classes.
        // Its purpose is to return a string representation of an object. By default, the toString() method outputs the class name followed by the object's hash code (in hexadecimal).
        // because here result is an object of StringBuilder class.
        String finalResult = result.toString().strip();
        System.out.println("String after removing duplicates: " + finalResult);
    }
}



























// this code have same logic but not work properly
// package com.BasicProgram;

// import java.util.Scanner;

// public class RemoveDuplicateWordFromStr {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Your String : ");
//         String fullstr = sc.nextLine();
//         fullstr = fullstr.strip().replaceAll("\\s+", " ");
//         String[] parts=fullstr.split("\\s+");        
//         String currentWord="";

//         String prevWord="";
//         for (String part : parts) {
//             currentWord=part;
//             if (fullstr.isBlank()) {
//                 System.out.println("Your string is empty.");
//             }
//             else{
//                 if (currentWord.equals(prevWord)) {
//                     // it replace the first occurence
// its wrong below because i update here dynamically fullstr .which is not possible in java because sting is immutable in java.
//                 fullstr=fullstr.replace(currentWord,"");
//                 }
//                 else{
//                     prevWord=currentWord;
//                     continue;
//                 }
//             }
           
//         }
//         System.out.println(fullstr);
//     }
// }
