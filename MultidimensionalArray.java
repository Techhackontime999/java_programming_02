package com.BasicProgram;
//  in Java, you cannot dynamically specify the number of square brackets ([]) for an array declaration. The dimensionality of an array (the number of square brackets) must be determined at compile time. However, the size of each dimension can be defined dynamically at runtime.
      // for creating 1D array need to define 1 []
        // for creating 2D array need to define 2 []
        // for creating 3D array need to define 3 []
        // for creating 4D array need to define 4 []
        // for creating nD array need to define n []
// import java.util.Scanner;

// public class MultidimensionalArray {
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter Your Array Dimension: ");
//     int dimension=sc.nextInt();
//     int[] dimensionElement=new int[dimension];
//     for (int index = 0; index < dimensionElement.length; index++) {
//         System.out.printf("Enter Number Of Element In %d Direction : ",index+1);
//         dimensionElement[index]=sc.nextInt();

//         // System.out.printf("*****************Entering Element In %d Direction******************",index+1);
//         // System.out.println();
//         // System.out.print("Enter Element: ");
//     }
    

     
// }
// }

import java.util.Scanner;

public class MultidimensionalArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of dimensions
        System.out.print("Enter the number of dimensions: ");
        int dimensions = scanner.nextInt();

        // Input the size of each dimension
        int[] sizes = new int[dimensions];
        for (int i = 0; i < dimensions; i++) {
            System.out.print("Enter the size for dimension " + (i + 1) + ": ");
            sizes[i] = scanner.nextInt();
        }

        // Dynamically create the multidimensional array
        Object array = createArray(sizes, 0);

        // Example of accessing the array
        System.out.println("Array created with " + dimensions + " dimensions.");
        System.out.println("Note: To access elements programmatically, you'll need recursive logic.");
    }

    /**
     * Recursively creates a multidimensional array.
     * 
     * @param sizes   Array of sizes for each dimension.
     * @param current Current dimension index being processed.
     * @return The dynamically created multidimensional array.
     */
    private static Object createArray(int[] sizes, int current) {
        if (current == sizes.length - 1) {
            // Base case: Create a 1D array for the last dimension
            return new int[sizes[current]];
        }

        // Create an array of Objects for the current dimension
        Object[] array = new Object[sizes[current]];
        for (int i = 0; i < sizes[current]; i++) {
            // Recursively create sub-arrays
            array[i] = createArray(sizes, current + 1);
        }
        return array;
    }
}
