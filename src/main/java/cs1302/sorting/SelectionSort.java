package cs1302.sorting;

import java.util.*;

/** class to sort by selection*/

public class SelectionSort {

    public static void main(String[] args) {
        Integer[] intArray = { 2, 3, 1, 4, 5};
        String[]  strArray = {"wasd", "a", "fgyia", "cy", "bhy"};

        System.out.println(Arrays.toString(intArray));
        selectMin(intArray, 0, intArray.length - 1, Integer::compareTo);
        System.out.println(Arrays.toString(intArray));

        System.out.println("");

        System.out.println(Arrays.toString(strArray));
        selectMin(strArray, 2, strArray.length - 1, (a, b) -> a.length() - b.length());
        System.out.println(Arrays.toString(strArray));
    } // main

    public static <T> void selectMin(T[] array, int lo, int hi, Comparator<T> c) {
        T temp;
        int lowIndex = lo;

        // Find the index of the lowest value
        for (int i = lo; i < hi; i++) {
            if (c.compare(array[lowIndex], array[i + 1]) > 0) {
                lowIndex = i + 1;
            }
        }

        // Swap first and lowest values
        temp = array[lowIndex];
        array[lowIndex] = array[lo];
        array[lo] = temp;
    }
} // SelectionSort
