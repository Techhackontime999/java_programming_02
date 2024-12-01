/*
 * Problem: 
           calculate income tax paid by an employee to the government as per the slabs mentioned below:
                Income slab              Tax
                2.5L to 5.0L             5%
                5.0L to 10.0L            20%
                Above 10.0L              30%
 Note:-there is no tax below 2.5L amount as an input from the user.               
 */
package com.BasicProgram;
import java.util.Scanner;
public class IncomeTax{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Salary in Lakhs Per Annum: ");
        float salary=sc.nextFloat();
        float tax=0;
        if (salary>=2.5f && salary<5.0f) {

            tax=(salary-2.5f)*0.05f;
        }
        else if (salary>=5.0f && salary<10.0f) {
            tax=(salary-2.5f)*0.05f;
            tax=tax+((salary-5.0f)*20)/100;
            
        }
        else{
            tax=(salary-2.5f)*0.05f;
            tax=tax+(salary-5.0f)*0.1f;
            tax=tax+((salary-10.0f)*30)/100;
        }

System.out.printf("Your Per Anum Tax is: %.5f" ,tax);
    }
}