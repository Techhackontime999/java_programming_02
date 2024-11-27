// grade point is a numerical value assigned to a student performance in a subject or a course based on their obtained grade.
// it reflects the students level of achievement in that course or subject.
// grading points follow below
/*
Letter Grade	Grade Point 	Performance      percentage
A+	              10.0	         Outstanding      90-100%
A	              9.0	         Excellent        80-89%
B+	              8.0	          Very Good       70-79%
B	              7.0	          Good            60-69%
C+	              6.0	          Above Average   50-59%
C	              5.0	          Average         40-49%
D	              4.0	          Pass            30-39%
F	              0.0	          Fail            below 30%
 */


/*
 * grade point is used in:
 * 1.for calculate SGPA:-> average of grade point across all subject in a semester
 * 2.for calclate CGPA:->weighted average of grade points acoss all semesters.
 */
package com.BasicProgram;
import java.util.Scanner;
public class Grading_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("**************Calculate Your Grade Point**********");
        System.out.print("Enter Number Of Subject : ");
        byte noOfSubject = sc.nextByte();
        System.out.print("Enter Maximum Marks In Each Subject : ");
        int maxMarks = sc.nextInt(noOfSubject);
        for (int i = 0; i < noOfSubject; i++) {
            System.out.printf("Enter Subject %d Marks : ", (i + 1));
            float marks = sc.nextFloat();
            int[] subMarks={34,76};
            
            if (marks <= maxMarks) {
                

            } else {
                System.out.println("You Entered Invalid Marks. ! Kindly Try Again");
                break;
            }
        }
        System.out.println("<<<<<<<<<<<< Your Total Percentage >>>>>>>>>");
        sc.close();
       
    }
}
