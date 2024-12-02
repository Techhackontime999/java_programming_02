package com.BasicProgram;

public class ArrayCreationTraversal {
    public static void main(String[] args) {
        // **************************Array Creation *********************************
        // We can create array in java using below 3 method.
        // we take below integer array but you can take array of all primitives,string
        // etc.
        // method 1:integer array of length 5
        int[] marks1 = new int[5];  //declaration + Memory Allocation
        marks1[0] = 1; //initialization
        marks1[1] = 2;
        marks1[2] = 3;
        marks1[3] = 4;
        marks1[4] = 5;


        // method 2:integer array of length 5
        int[] marks2;//declaration
        marks2=new int[5];//memory Allocation
        marks2[0]=1;//initialization
        marks2[1]=2;
        marks2[2]=3;
        marks2[3]=4;
        marks2[4]=5;
        
        // method 3:integer array of length 5
        int[] marks3 = { 1, 2, 3, 4, 5 };//declaration+initialization+Dynamically Memory Allocation

        // **************************Array Traversal *********************************
        // using for loop
        // you check other by changing array name
        // for (int index = 0; index < marks2.length; index++) {
        //     System.out.println(marks1[index]);
        // }
        // using for each loop
        // you check other by changing array name

        for (int elemnt : marks3) {
            System.out.println(elemnt);
        }

    }

}
