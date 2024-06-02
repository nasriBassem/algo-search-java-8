package com.search.algorithm; /**
 * Bassem NASRI
 * Binary Java Search in Java 8
 */
import java.util.List;

public class BinarySearchJava8 {
    public static int binarySearch(final List<Integer> elements, final int x) {
        int start = 0;
        int stop = elements.size() - 1;
        int middle = (start + stop) / 2;
        while (middle < elements.size() && elements.get(middle) != x) {
            stop = x < elements.get(middle) ? stop - 1 : stop + 1;
            middle = (start + stop) / 2;
        }
        return (middle < elements.size()) ? ((elements.get(middle) != x) ? -1 : middle) : -1;
    }
    
    static boolean existsBinarySearch(int[] array, int numberToFind) {

          // Trier le tableau
        Arrays.sort(array);

        // Rechercher le nombre en utilisant Arrays.binarySearch
        int index = Arrays.binarySearch(array, numberToFind);

        // retourner true ou false
		return index >= 0 ? true : false ;
	}
}
