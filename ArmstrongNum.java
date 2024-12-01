/*
 * The Number We Say That Armstrong Number If Sum Of Cube Of Each Digit is Equal to The Number.
 * ex: 153= 1*1*1+5*5*5+3*3*3 
 * 0, 1, 153, 370, 371 and 407 are the Armstrong numbers.
 */
package com.BasicProgram;
import java.util.Scanner;
public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter number : ");
        int num=sc.nextInt();
         int digit=0;
         int checkNum=num;
         int resultNum=0;
         while (num >0) {
            digit=num%10;
            num=num/10;
            resultNum=resultNum+digit*digit*digit;
         }
         if (resultNum==checkNum) {
            System.out.println(checkNum + " is an Armstrong Number.");
         }
         else{
            System.out.println(checkNum + " is not an Armstrong Number.");

         }
    
    }
}
