/*
we need to print like below
Poblem: 
     * * * *
     * * *
     * *
     *
 
 */
package com.BasicProgram;
public class Pattern01 {
    public static void main(String[] args) {
     for (int index = 0; index<4 ; index++) {
        for (int i = 4; i >index ; i--) {
        System.out.print("*");
        System.out.print(" ");
            
        }
        System.out.println();

     }
    }
}
