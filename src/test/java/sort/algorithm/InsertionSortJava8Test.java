package sort.algorithm;

import com.sort.algorithm.InsertionSortJava8;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InsertionSortJava8Test {
    InsertionSortJava8 insertionSortJava8;

    @Test
    public void insertionOrderTestOK() {
        int[] myIntArray = {125, 2, 14, 5, 87, 329, 3};
        /**
        * Before sort
        */
        assertEquals(myIntArray[0], 125);
        assertEquals(myIntArray[1], 2);
        assertEquals(myIntArray[2], 14);
        assertEquals(myIntArray[3], 5);
        assertEquals(myIntArray[4], 87);
        assertEquals(myIntArray[5], 329);
        assertEquals(myIntArray[6], 3);
        /**
        * Sort
        */
        insertionSortJava8.selectionSort(myIntArray);
        /**
         * After sort
         */
        assertEquals(myIntArray[0], 2);
        assertEquals(myIntArray[1], 3);
        assertEquals(myIntArray[2], 5);
        assertEquals(myIntArray[3], 14);
        assertEquals(myIntArray[4], 87);
        assertEquals(myIntArray[5], 125);
        assertEquals(myIntArray[6], 329);
    }
}
