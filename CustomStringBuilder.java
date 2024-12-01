package com.BasicProgram;
// string builder is same as string but it is mutable or performed all the operation of string +extra.
// for initializing stringbuilder needs creating of object but in string java has special support we can define string ike other primitives.
public class CustomStringBuilder {
    public static void main(String[] args) {
        // Creating a String object
        String sc = new String("Amit is an intelligent boy.");
        // Immutable String
        String str = "Amit is an intelligent boy.";

        // Using Java's built-in StringBuilder
        StringBuilder sb = new StringBuilder();

        // Dynamically building a string
        sb.append(str).append(" ");
        sb.append(sc).append(" ");

        String resultStr = sb.toString().strip();
      
        // Output the result
        System.out.println(resultStr);
    }
}
