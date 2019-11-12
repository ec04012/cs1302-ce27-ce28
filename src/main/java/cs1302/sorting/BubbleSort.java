package cs1302.sorting;

import java.util.Comparator;

/** Class to sort using BubbleSort. */

public class BubbleSort {
    public static void main (String[] args) {
        System.out.println("Not yet implemented");
    }

    public static <T> void bubble(T[] array, int lo, int hi, Comparator<T> c) {
	for (int i = lo ; i < hi ; i ++) {
	    if (c.compare(array[i],array[i + 1]) > 0) {
		T temp = array[i];
		array[i] = array[i + 1];
		array[i + 1] = temp;
	    } // if
	} // for
    } // bubble
}
