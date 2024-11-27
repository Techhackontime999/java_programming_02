package com.BasicProgram;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
// precedence==priority
public class PriorityAssociativity {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
    //    define precedence table 
    Map<String,Integer> precedence =new HashMap<>();
    precedence.put("=", 1);
    precedence.put("*", 2);

   // define assossiativity table
   Map<String,String> associativity =new HashMap<>();
  associativity.put("=", "Right-to-Left");
  associativity.put("*", "Right-to-Left");

//    user entered expression
System.out.println("*********** Enter Your Expression Below ************");
// System.out.println();
String expn1=sc.next();
String expn2=sc.nextLine();
String fullexp=expn1+expn2;
// parse the expression to and find operators
String[] tokens=fullexp.split("");
for (String  token : tokens) {
    if (precedence.containsKey(tokens)) {
        System.out.println("Operator: " + token);
        System.out.println("Precedence: " + precedence.get(tokens));
        System.out.println("Associativity: " + associativity.get(tokens));
        System.out.println();
    }
    
}
       
    }
}
