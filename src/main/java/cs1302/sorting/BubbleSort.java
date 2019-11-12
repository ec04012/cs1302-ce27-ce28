package cs1302.sorting;

import java.util.Comparator;
import java.util.Arrays;

/** Class to sort using BubbleSort. */

public class BubbleSort {
    public static void main (String[] args) {
	Integer[] yeah = {6,1,10,44,9,2};
	//System.out.println(Arrays.toString(yeah));
	//BubbleSort.bubble(yeah, 0, 5, Integer::compareTo);
	//System.out.println(Arrays.toString(yeah));
	String[] ohYeah = {"asdf","ef","ssf","e","atatat"};
	//System.out.println(Arrays.toString(ohYeah));
	//BubbleSort.bubble(ohYeah, 2, 4, (o,t) -> o.length() - t.length());
	//System.out.println(Arrays.toString(ohYeah));
    System.out.println(Arrays.toString(yeah));
    BubbleSort.bubbleSort(yeah , 0 , 5 , Integer::compareTo);
    System.out.println(Arrays.toString(yeah));
    System.out.println(Arrays.toString(ohYeah));
    BubbleSort.bubbleSort(ohYeah , 0 , 4 ,(o , t) -> o.length() - t.length());
    System.out.println(Arrays.toString(ohYeah));

    } // main

    public static <T> void bubble(T[] array, int lo, int hi, Comparator<T> c) {
	for (int i = lo ; i < hi ; i ++) {

	    if (c.compare(array[i],array[i + 1]) > 0) {

		T temp = array[i];
		array[i] = array[i + 1];
		array[i + 1] = temp;

	    } // if
	} // for
    } // bubble

    public static <T> void bubbleSort(T[] array , int lo , int hi , Comparator<T> c) {

        for (int i = hi; i > lo;  i--) {

            bubble(array , 0 , i , c);
        }

    }
}
