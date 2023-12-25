package search.algorithm;

import com.search.algorithm.InterpolationSearchJava8;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class InterpolationSearchJava8Test {

    InterpolationSearchJava8 interpolationSearchJava8 ;
    @Test
    public void InterpolationSearchFirstElementOK(){
        final List<Integer> elements = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        assertEquals(interpolationSearchJava8.interpolationSearch(elements,1),0);
    }

    @Test
    public void InterpolationSearchLastElementOK(){
        final List<Integer> elements = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        assertEquals(interpolationSearchJava8.interpolationSearch(elements,9),8);
    }


    @Test
    public void InterpolationSearchMiddleElementOK(){
        final List<Integer> elements = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        assertEquals(interpolationSearchJava8.interpolationSearch(elements,5),4);
    }

    @Test
    public void InterpolationSearchMiddleElementKO(){
        final List<Integer> elements = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        assertEquals(interpolationSearchJava8.interpolationSearch(elements,10),-1);
    }
}
