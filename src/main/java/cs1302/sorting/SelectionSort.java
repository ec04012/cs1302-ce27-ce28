package cs1302.sorting;

import java.util.*;

/** class to sort by selection*/

public class SelectionSort {

    public static void main(String[] args) {
        /*
        Integer[] array = { 1 , 3 , 2 ,4 ,5};
        String[]  strArray = {"wasd", "a", "fgyia", "cy", "bhy"};

        System.out.println(Arrays.toString(intArray));
        selectionSort(intArray, 0, intArray.length - 1, Integer::compareTo);
        System.out.println(Arrays.toString(intArray));

        System.out.println("");

        System.out.println(Arrays.toString(strArray));
        selectionSort(strArray, 0, 3, (a, b) -> a.length() - b.length());
        System.out.println(Arrays.toString(strArray));
        */

        Integer[] array = {1, 3, 2, 4, 5};
        System.out.println(Arrays.toString(array)); // [ 1, 3, 2, 4, 5 ]
        int newPivot = partition(array, 0, 2, 4, Integer::compareTo);
        System.out.println(Arrays.toString(array)); // [ 1, 2, 5, 4, 3 ]
        System.out.println(newPivot);

        array = new Integer[]{1, 3, 2, 4, 5};
        System.out.println(Arrays.toString(array)); // [ 1, 3, 2, 4, 5 ]
        newPivot = partition(array, 0, 1, 4, Integer::compareTo);
        System.out.println(Arrays.toString(array)); // [ 1, 2, 3, 4, 5 ]
        System.out.println(newPivot);

        array = new Integer[]{6, 11, 2, 4, 17, 5};
        System.out.println(Arrays.toString(array)); // [ 6, 11, 2, 4, 17, 5 ]
        newPivot = partition(array, 0, 0, 5, Integer::compareTo);
        System.out.println(Arrays.toString(array)); // [ 5, 2, 4, 6, 17, 11 ]
        System.out.println(newPivot);               // 3
    } // main

    /**
     * Swaps the objects at the specified indices of the specified array.
     * @param array the array to perform the swap on.
     * @param a the index of the first object to swap.
     * @param b the index of the second object to swap.
     * @throw IndexOutOfBoundsException if either index is out of bounds of the specified array.
     */
    private static <T> void swap (T[] array, int a, int b) {
        T temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }


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
    } // SelectMin

    public static <T> void selectionSort(T[] array, int lo, int hi, Comparator<T> c) {
	for (int i = lo ; i < hi ; i ++ ) {
	    selectMin(array, i , hi , c);
	} // for
    } // selectionSort

    public static <T> int partition(T[] array, int lo, int pivot, int hi, Comparator<T> c) {
        SelectionSort.swap(array, pivot, hi);
        int i = lo;
        for (int j = lo; j <  hi - 1; j++) {
            if (c.compare(array[j], array[hi]) < 0) {
                SelectionSort.swap(array, i, j);
                i = i + 1;
            }
        }
        SelectionSort.swap(array, i, hi);
        return i;
    }
} // SelectionSort
