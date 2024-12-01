package com.BasicProgram;
/*
Problem:
        * * * *
          * * *
            * * 
              *
 */
public class Pattern02 {
    public static void main(String[] args) {
        for (int index = 4; index >0; index--) {
           
            for (int i = 0; i < index; i++) {
                System.out.print("*");
                System.out.print(" ");
              
            }

            System.out.println();
        }
    }
}
