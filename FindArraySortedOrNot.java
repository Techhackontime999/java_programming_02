//this logic is correct for checking array is sorted or not because its check only check whether the last comparison matches the sorting order, not the entire array.
package com.BasicProgram;

import java.util.Scanner;

public class FindArraySortedOrNot {

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

        System.out.println(
                "****************** Enter 1 For Check Array Is Sorted In Ascendending Order Or 2 For Dscending Order.********************");
        System.out.print("Enter Option: ");
        // result=false; //cause problem in logic because in checking sorting i set it
        // true then problem occure in any of the comparison it set result=false then in
        // again comparison may still its changes to true i.e array is not sorted
        // overall but it can say sorted.


        boolean result = true;// i assume my array is sorted.
        // Initialize result as true. Assume the array is sorted and disprove it if a
        // mismatch is found.

        int choose = sc.nextInt();
        str = "";
        if (choose == 1) {
            for (int i = 0; i < num.length - 1; i++) {
                // now i want to disprove array is sorted.i.e prove array is not sorted using
                // below logic.

                if (num[i] > num[i + 1]) {
                    result = false;
                  
                }
                if (num.length - 2 == i) {
                    str = " in Ascending order.";
                    break;
                }
                // below logic is not give the desire result because i take earlier result=false
                // .and then i prove it is sorted.
                // but for this logic a problem is In your current logic, result is set to true
                // whenever a single comparison is valid.
                // This means even if the array is not sorted overall, the result will still be
                // true as long as the last comparison is valid.
                // if (num[i] <= num[i + 1] ) {
                // result = true;
              
                // }
                  // if (num.length - 2 == i) {
                // str = " in Ascending order.";
                // break;
                // }
            }
        }
        if (choose == 2) {
            for (int i = 0; i < num.length - 1; i++) {
                if (num[i] < num[i + 1]) {
                    result = false;
                 
                }
                if (num.length - 2 == i) {
                    str = " in Dscending order.";
                    break;

                }
                     // if (num[i] >= num[i + 1] ) {
                // result = true;
              
                // }
                  // if (num.length - 2 == i) {
                // str = " in Dscending order.";
                // break;
                // }

            }
        }
        if (result) {
            System.out.println("Your Array is Sorted " + str);

        } else {
            System.out.println("Your Array is not Sorted " + str);

        }

        sc.close();

    }
}

// Below logic is wrong
// Logic Error in Checking Sorted Order:
// When checking if the array is sorted, the result variable is updated during
// each comparison.
// If one pair fails the condition, result is immediately set to false, but
// subsequent comparisons may reset it to true. This causes incorrect results.
// You only check whether the last comparison matches the sorting order, not the
// entire array.

// package com.BasicProgram;

// import java.util.Scanner;

// public class FindArraySortedOrNot {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter Number Of Input In Array : ");
// int inputNum = sc.nextInt();
// float[] num = new float[inputNum];
// String str = "";
// for (int index = 0; index < inputNum; index++) {
// System.out.printf("Enter [%d] Num : ", index + 1);
// num[index] = sc.nextFloat();
// }
// System.out.println("Your Array is Created successfully.");
// for (float element : num) {
// str = str + element + " , ";

// }
// System.out.println("Now Your Array is : [ " + str.substring(0,
// str.strip().length() - 1) + " ]");

// System.out.println(
// "****************** Enter 1 For Check Array Is Sorted In Ascendending Order
// Or 2 For Dscending Order.********************");
// System.out.print("Enter Option: ");
// boolean result = false;
// int choose = sc.nextInt();
// str = "";
// if (choose == 1) {
// for (int i = 0; i < num.length; i++) {

// for (int j = i + 1; j < num.length; j++) {
// if (num[i] <= num[j]) {
// result = true;
// if (i == num.length - 1) {
// str = " in Ascending Order ";
// }

// } else {
// result = false;
// }

// }
// }
// }
// if (choose == 2) {
// for (int i = 0; i < num.length; i++) {

// for (int j = i + 1; j < num.length; j++) {
// if (num[i] >= num[j]) {
// result = true;
// if (i == num.length - 1) {
// str = " in Dscending Order ";
// }
// } else {
// result = false;
// }

// }
// }
// }
// if (result ) {
// System.out.println("Your Array is Sorted" + str);

// } else {
// System.out.println("Your Array is not Sorted" + str);

// }

// sc.close();

// }
// }