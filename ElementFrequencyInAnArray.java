//code  gpt code here my code below
// this program capable to print frequency of all element present in array
// package com.BasicProgram;

// import java.util.Scanner;

// public class ElementFrequencyInAnArray {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Number Of Inputs in Array: ");
//         int inputNum = sc.nextInt();
//         float[] num = new float[inputNum];
//         boolean[] processed = new boolean[inputNum]; // To track processed elements

//         // Input array elements
//         for (int index = 0; index < inputNum; index++) {
//             System.out.printf("Enter [%d] Num: ", index + 1);
//             num[index] = sc.nextFloat();
//         }

//         // Display the array
//         System.out.print("Your Array is: [ ");
//         for (float element : num) {
//             System.out.print(element + " ");
//         }
//         System.out.println("]");

//         // Calculate and display frequency
//         System.out.println("\nElement Frequencies:");
//         for (int i = 0; i < num.length; i++) {
//             if (!processed[i]) { // Only process if not already handled
//                 int frequency = 0;
//                 StringBuilder indices = new StringBuilder();

//                 for (int j = 0; j < num.length; j++) {
//                     if (num[i] == num[j]) {
//                         frequency++;
//                         indices.append(j).append(" ");
//                         processed[j] = true; // Mark as processed
//                     }
//                 }
//                 System.out.println("Element " + num[i] + " found at indices: " + indices + "with frequency: " + frequency);
//             }
//         }
//     }
// }

// My code start
package com.BasicProgram;

import java.util.Scanner;

public class ElementFrequencyInAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number Of Input In Array : ");
        int inputNum = sc.nextInt();
        float[] num = new float[inputNum];
        String str = "";
        for (int index = 0; index < inputNum; index++) {
            System.out.printf("Enter [%d] Num : ", index + 1);
            num[index] = sc.nextFloat();
        }

        System.out.println("Your Array is Created successfully.");
        for (float element : num) {
            str = str + element + " , ";
        }
        System.out.println("Now Your Array is : [ " + str.substring(0, str.strip().length() - 1) + " ]");
        boolean[] processed = new boolean[num.length];
        for (int index = 0; index < processed.length; index++) {
            processed[index] = false;
        }
        float searchNum = 0;
        for (int k = 0; k < num.length; k++) {

            if (processed[k]) {
                continue;
            } else {
                searchNum = num[k];
                processed[k] = true;

                for (int j = 0; j < num.length; j++) {
                    if (k != j && num[k] == num[j]) {
                        processed[j] = true;

                    }

                }

                // start frequency counting for element

                int feq = 0;
                for (int i = 0; i < num.length; i++) {
                    str = "";
                    if (num[i] == searchNum) {
                        feq = 0;
                        str = i + " , ";
                        for (int j = 0; j < num.length; j++) {
                            if (i != j && num[i] == num[j]) {
                                feq++;// here feq value goes 0 and used in this line because of post increament.
                                str = str + j + " , ";

                            } else {
                                feq = 1;
                            }
                        }
                        // here feq value print 1 i.e at start feq value is 0 when i write feq++ then
                        // value 0 is use where and then feq value increamented when print below.
                        System.out.println(
                                "Element " + searchNum + " Found At Index: [" + str.substring(0, str.length() - 2)
                                        + "] With Frequency : " + feq);
                        break;
                    } else {
                        continue;
                    }

                }
                // close frequency counting for element

            }
        }

    }
}
