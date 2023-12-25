package com.search.algorithm; /**
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
    public static int linearSearch(final List<Integer> elements, final int x) {
        final int length = elements.size();
        for (int i = 0; i < length; i++) {
            if (elements.get(i) == x) {
                return i;
            }
        }
        return -1;
    }

    public static int linearSearchStream(final List<Integer> elements, final int x) {
        return elements.stream().filter(i -> i == x)
                .findFirst()
                .orElse(-1);
    }

    public static int linearSearchIndexOf(final List<Integer> elements, final int x) {
        return elements.indexOf(x);
    }
}
