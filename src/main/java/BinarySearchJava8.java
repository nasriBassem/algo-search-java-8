/**
 * Bassem NASRI
 * Binary Java Search in Java 8
 */

import java.util.Arrays;
import java.util.List;

public class BinarySearchJava8 {
    static int binarySearch(final List<Integer> elements, final int x) {
        int start = 0;
        int stop = elements.size() - 1;
        int middle = (start + stop) / 2;
        while (middle < elements.size() && elements.get(middle) != x) {
            stop = x < elements.get(middle) ? stop - 1 : stop + 1;
            middle = (start + stop) / 2;
        }
        return (middle < elements.size()) ? ((elements.get(middle) != x) ? -1 : middle) : -1;
    }
    public static void main(String[] args) {
        final List<Integer> elements = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        /**
         * For search
         */
        System.out.println(binarySearch(elements, 3));
    }
}
