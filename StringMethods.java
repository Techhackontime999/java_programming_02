package com.BasicProgram;
public class StringMethods {
    public static void main(String[] args) {
        // String str="Amit is a nice boy"; 
        // string is an immutable datatypes in java i.e we can not change the original string but we can return a copy of this .
        // also we can update string through its reference which points its earlier.
        // ex:str=str.replace() we change directly here reference not string.at starting str points "Amit is a nice boy" but after replacing its points now replaced after string.
     // its convert string in lowercase
        // String newstr=str.toLowerCase();
 // its convert string in Uppercase
    // String newstr=str.toUpperCase();
         // its return parts of a string starting from 0 but by default its zero .here no need to write 0 its redundant.
        // String newstr=str.substring(0);
        // its return substring where startindex is included and endindex is excluded.
        // String newstr=str.substring(2,4);
        // this method remove extra spaces present in starting or ending or leading or trealing spaces from the string
        // String str="         Amit is a nice boy          ";
        // String newstr=str.trim();
// its return true if starts with Amit otherwise false.also ensure case sensitive.
// boolean result=str.startsWith("Amit");
//         System.out.println(result);
// its return true if ends with boy otherwise false.also ensure case sensitive.
// boolean result=str.endsWith("boy");
//         System.out.println(result);
// return charecter at index.also ensure its give charecter datatype also.
// char newstr=str.charAt(3);
// its return first occurence of the string starting from begining.
// String str="Amit  is a nice it boy";
// int i=str.indexOf("it");
// System.out.println("index: " +i);
// its return first occurence of the string starting from begining and start checking from index 4.
// int i=str.indexOf("nice",4);
// System.out.println("index: " +i);
// its return Last occurence of the string starting from ending.
// String str="Amit nice is a nice boy";
// int i=str.lastIndexOf("nice");
// System.out.println("index: " +i);
// its return Last occurence of the string starting from ending.and start check from index 5.
// String str="Amit nice is a nice boy";
// int i=str.lastIndexOf("nice",10);
// System.out.println("index: " +i);
// its replace old string from the new string and return a copy.
// String newstr=str.replace("Amit","Sumit");
// strip work same as trim method
// String newstr=str.strip();

// split method is used to split all word from the string by givig sign as a argument which define which basis i split it may be commas,tab spaces etc. and it retuen array of words from the string.
// ex:1 based on spaces
// String str="Amit is a nice boy"; 
// String[] parts=str.split(" ");
// for (String  part : parts) {
//     System.out.println(part);
// }
// ex:2 based on ,
String str=" Gp , patna-07 , is , the , best ,college"; 
String[] parts=str.split(",");
for (String  part : parts) {
    System.out.println(part);
}



        // System.out.println(newstr);
    }
}
