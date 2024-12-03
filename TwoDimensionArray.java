package com.BasicProgram;

import java.util.Scanner;

public class TwoDimensionArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // // method 1
        // // we can create two dimention array easily from below 2
        // int[][] arr=new int[3][4];
        // int[][] arr={{1,2,3,4},{1,2,3,4},{1,2,3,4}}
        // // we want to generate array of two or n dimensional dynamically
        // System.out.println("******************* 2-D Array **************");
        // System.out.print("Enter Number Of Row: ");
        // int row = sc.nextInt();
        // System.out.print("Enter Number Of Column: ");
        // int column = sc.nextInt();
        // int[][] arr=new int[row][column];
        // // enter element in array
        // for (int i = 0; i < row; i++) {
        // for (int j = 0; j < column; j++) {
        // System.out.print("Enter Element [i][j] : ");
        // arr[i][j]=sc.nextInt();
        // }
        // }
        // // printing element in array
        // // using enhanced for loop for array
        // for (int[] element : arr) {
        // for (int val : element) {
        // System.out.println(val);
        // }
        // }
        // method 2
        // int[][] arr = { { 1, 2, 3, 4 }, { 1, 2, 3, 4 }, { 1, 2, 3, 4 } };
        // System.out.println(arr[0]);
        // for (int index = 0; index < arr[0].length; index++) {
        // System.out.println(arr[0][index]);
        // }

        // new
        // we want to generate array of two or n dimensional dynamically
        System.out.println("******************* 2-D Array **************");
        System.out.print("Enter Number Of Row: ");
        int row = sc.nextInt();
        System.out.print("Enter Number Of Column: ");
        int column = sc.nextInt();
        // for creating 1D array need to define 1 []
        // for creating 2D array need to define 2 []
        // for creating 3D array need to define 3 []
        // for creating 4D array need to define 4 []
        // for creating nD array need to define n []

        int[][] arr=new int[row][];
        for (int index = 0; index < arr.length; index++) {
            arr[index]=new int[column];
            System.out.printf("******** Enter %d Row Element ******* ",index+1);
            System.out.println();
            for (int i = 0; i < arr[index].length; i++) {
                System.out.printf("Enter %d Row %d Element : ",index+1,i);
                arr[index][i]=sc.nextInt();
            }
     
        }
        System.out.println("Your Array is Printing......");
for (int i = 0; i < arr.length; i++) {
    for (int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j]);
        System.out.print(" ");
    }
System.out.println();
}

    }
}

