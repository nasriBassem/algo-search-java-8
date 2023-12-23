/**
 * Bassem NASRI
 * Linear Java Search in Java 8
 */

import java.util.Arrays;
import java.util.List;

public class LinearSearchJava8 {
    /**
     * Linear search
     *
     * @param elements list of elements
     * @param x element to search
     * @return int element position
     */
    static int linearSearch(final List<Integer> elements, final int x) {
        final int length = elements.size();
        for (int i = 0; i < length; i++) {
            if (elements.get(i) == x) {
                return i;
            }
        }
        return -1;
    }

    static int linearSearchStream(final List<Integer> elements, final int x) {
        return elements.stream().filter(i -> i == x)
                .findFirst()
                .orElse(-1);
    }

    static int linearSearchIndexOf(final List<Integer> elements, final int x) {
        return elements.indexOf(x);
    }

    public static void main(final String[] args) {
        final List<Integer> elements = Arrays.asList(1, 2, 3, 4);
        /**
         * For search
         */
        System.out.println(linearSearch(elements, 3));

        /**
         * Stream filter find first search
         */
        System.out.println(linearSearchStream(elements, 3));

        /**
         * Index of earch
         */
        System.out.println(linearSearchIndexOf(elements, 3));
    }
}
