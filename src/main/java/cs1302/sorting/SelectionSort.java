package cs1302.sorting;

import java.util.*;

/** class to sort by selection*/

public class SelectionSort {

    public static void main(String[] args) {
        Integer[] array = { 1 , 3 , 2 ,4 ,5};
        String[]  strArray = {"wasd", "a", "fgyia", "cy", "bhy"};

        //System.out.println(Arrays.toString(intArray));
        //selectionSort(intArray, 0, intArray.length - 1, Integer::compareTo);
        //System.out.println(Arrays.toString(intArray));

        //System.out.println("");

        //System.out.println(Arrays.toString(strArray));
        //selectionSort(strArray, 0, 3, (a, b) -> a.length() - b.length());
        //System.out.println(Arrays.toString(strArray));
        System.out.println(Arrays.toString(array)); // [ 1, 3, 2, 4, 5 ]
        int newPivot = partition(array, 0, 2, 4, Integer::compareTo);
        System.out.println(Arrays.toString(array)); // [ 1, 2, 5, 4, 3 ]
        System.out.println(newPivot);
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
    } // SelectMin

    public static <T> void selectionSort(T[] array, int lo, int hi, Comparator<T> c) {
	for (int i = lo ; i < hi ; i ++ ) {
	    selectMin(array, i , hi , c);
	} // for
    } // selectionSort

    public static <T> int partition(T[] array, int lo, int pivot, int hi, Comparator<T> c) {

        T temp = array[pivot];
        array[pivot] = array[hi];
        array[hi] = temp;
        int j = lo;
        for (int i = lo; i < hi; i++) {

            if(c.compare(array[i] , array[hi]) > 0) {

                T temps = array[j];
                array[j] = array[i];
                array[i] = temps;
                i = i + 1;

            }
        }
            T tempa = array[j];
            array[j] = array[hi];
            array[hi] = tempa;
            return j;



    }
} // SelectionSort
