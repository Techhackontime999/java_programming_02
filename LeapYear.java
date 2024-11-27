package com.BasicProgram;
import java.util.Scanner;
// A year is a leap year if it is divisible by only 4 and 400 but not divisible by 100.
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
System.out.print("Enter Year To Check: ");
int year=sc.nextInt();
if ( year % 400==0) {
    System.out.println("This Year : " +year+ " Is a Leap Year." +"and February Of 29 Days.");
}
else if (year%4==0 && year%100 !=0) {
    System.out.println("This Year : " +year+ " Is a Leap Year." +"and February Of 29 Days.");
    
}
else{
    System.out.println("It is not a Leap Year So February Of 28 Days.");
}
    }
}
