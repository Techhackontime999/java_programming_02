package com.BasicProgram;

import java.util.Scanner;

public class MultidimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number of dimensions
        System.out.print("Enter the number of dimensions: ");
        int dimensions = sc.nextInt();

        // Input the size of each dimension
        int[] sizes = new int[dimensions];
        for (int i = 0; i < dimensions; i++) {
            System.out.print("Enter the size for dimension " + (i + 1) + ": ");
            sizes[i] = sc.nextInt();
        }

        // In the context of the dynamic multidimensional array example where we use
        // Object in the array declaration, the term Object refers to the root class of
        // all classes in Java. Every class in Java directly or indirectly inherits from
        // the Object class.

        // In the dynamic array example:

        // Object array = createArray(sizes, 0);

        // Here, Object is used as the type for the array because Java does not natively
        // support arrays with a dynamically determined number of dimensions. Using
        // Object allows us to create arrays of arrays (nested arrays) at runtime, where
        // each nested array could itself be another Object array or a primitive array,
        // depending on the recursion level.
        // Why Use Object?
        // Flexibility:
        // The Object type can hold references to any type of object, including arrays
        // of other objects or primitives. This makes it possible to create and
        // manipulate nested arrays dynamically.
        // Dynamic Structure:
        // The number of dimensions and sizes of the array are determined at runtime.
        // Since Java's type system requires you to know the array's type and dimensions
        // at compile time, using Object is a workaround.
        // ex: below we pass object of m in Object.
        // int[] m=new int[3];
        // Object arr=m;
        // Dynamically create the multidimensional array
        // Object as a Container

        // In Java, the Object class can act as a general-purpose container because:

        // It can store any type of object.
        // Arrays in Java are objects themselves.
        // in below example variable m is a Object type which store object of a
        // int a=2;
        // Object m=a;
        Object array = createArray(sizes, 0);

        // in this upper Object array store a multidimensional array which is created by
        // createArray method
        // i.e Object is a class in java which contains or Encapsulate all the class
        // like array,int,float many more..

        // In Java, the Object keyword represents the root class of all classes in Java.
        // This means that any Java object can be assigned to a variable of type Object.
        // Because arrays are also objects in Java, you can store an array of objects in
        // a variable declared as Object.
        // here we pass 0 which is first indices of sizes array.and it automatically
        // increament recursively in createArray method from 0 to sizes.length-1

        /**
         * Recursively creates a multidimensional array.
         * 
         * @param sizes   Array of sizes for each dimension.
         * @param current Current dimension index being processed.
         * @return The dynamically created multidimensional array.
         */
        // Example of accessing the array
        System.out.println("Array created with " + dimensions + " dimensions.");
        System.out.println("Note: To access elements programmatically, you'll need recursive logic.");
        // Set a value in the array
        // for (int index = 0; index < sizes.length; index++) {
        //     for (int i = 0; i < sizes[index]; i++) {
        //         int a=2;
        //     }
        // }
        setElement(array, sizes, 42);

        // System.out.print("Enter value: ");
        // int val = sc.nextInt();
        // setElement(array, sizes, val);
        // Get a value from the array

    }

    private static Object createArray(int[] sizes, int current) {
        if (current == sizes.length - 1) {
            // Base case: Create a 1D array for the last dimension
            return new int[sizes[current]];
            // this return value called when current=sizes.length-1 and store in last
            // recursive called of createArray.
        }

        // Create an array of Objects for the current dimension
        Object[] array = new Object[sizes[current]];
        for (int i = 0; i < sizes[current]; i++) {
            // Recursively create sub-arrays
            array[i] = createArray(sizes, current + 1);
        }
        return array;
        // here i return object of final array in which array[0] encapsulate arr[1]
        // arr[1] encapsulate arr[2] and so on...
    }

    /**
     * Sets a value in a multidimensional array.
     */
    private static void setElement(Object array, int[] indices, int value) {
        for (int i = 0; i < indices.length - 1; i++) {
            array = ((Object[]) array)[indices[i]];
        }
        ((int[]) array)[indices[indices.length - 1]] = value;
    }
    /**
     * Gets a value from a multidimensional array.
     */
    private static int getElement(Object array, int[] indices) {
        for (int i = 0; i < indices.length - 1; i++) {
            array = ((Object[]) array)[indices[i]];
        }
        return ((int[]) array)[indices[indices.length - 1]];
    }

}
