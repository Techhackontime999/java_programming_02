package com.BasicProgram;
import java.util.Scanner;
public class PassFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("**************Check You Pass Or Not **********");
        System.out.print("Enter Number Of Subject : ");
        byte noOfSubject = sc.nextByte();
        System.out.print("Enter Maximum Marks In Each Subject : ");
        int maxMarks = sc.nextInt();
        int totalMaxMarks = noOfSubject * maxMarks;
        float totalMarks = 0;
        float subPercentage=0;
        float marks=0;
        boolean result=true;
        float minSubPercentage=100;

        for (int i = 0; i < noOfSubject; i++) {
            System.out.printf("Enter Subject %d Marks : ", (i + 1));
            marks = sc.nextFloat();

            if (marks <= maxMarks ) {
                totalMarks = totalMarks + marks;
                subPercentage = (marks * 100) / maxMarks;

                if (subPercentage<33 ) {
                    result=false;
                }
             if (minSubPercentage>subPercentage) {
                minSubPercentage=subPercentage;
             }
               

            } else {
                System.out.println("You Entered Invalid Marks. ! Kindly Try Again");
                break;
            }
        }
        System.out.println("<<<<<<<<<<<< Your Result >>>>>>>>>");
        float totalPercentage = (totalMarks * 100) / totalMaxMarks;
        if (totalPercentage<40) {
            result=false;
        }
        if (result) {
            System.out.printf("You Pass ! Congratulation.\ntotalPercentage is : %f \nMinimum Subject Percentage is : %f ",totalPercentage,minSubPercentage);

        }
        else{
         System.out.printf("You Fail ! Restart Again.\ntotalPercentage is : %f \nMinimum Subject Percentage is : %f ",totalPercentage,minSubPercentage);
        }

        
    }
}
