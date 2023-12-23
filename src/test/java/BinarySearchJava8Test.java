import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BinarySearchJava8Test {

    BinarySearchJava8 binarySearchJava8;
    @Test
    public void binarySearchTestFirstElementOK(){
        List<Integer> elements = Arrays.asList(1,2,3,4);
        assertEquals( binarySearchJava8.binarySearch(elements, 1),0);
    }
    @Test
    public void binarySearchTestLastElementOK(){
        List<Integer> elements = Arrays.asList(1,2,3,4);
        assertEquals( binarySearchJava8.binarySearch(elements, 4),3);
    }

    @Test
    public void binarySearchTestMiddleElementOK(){
        List<Integer> elements = Arrays.asList(1,2,3,4);
        assertEquals( binarySearchJava8.binarySearch(elements, 3),2);
    }
    @Test
    public void binarySearchTestKO(){
        List<Integer> elements = Arrays.asList(1,2,3,4);
        assertEquals(binarySearchJava8.binarySearch(elements,5), -1);
    }

}
