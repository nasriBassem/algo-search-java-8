import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class LinearSearchJava8Test {

    LinearSearchJava8 linearSearchJava8Utils;

    @Test
    public void testLinearSearch(){
        List<Integer> elements = Arrays.asList(1,2,3,4);
        assertEquals(linearSearchJava8Utils.linearSearch(elements,3),2);
    }

    @Test
    public void testLinearSearchStream(){
        List<Integer> elements = Arrays.asList(1,2,3,4,5);
        assertEquals(linearSearchJava8Utils.linearSearchStream(elements,7),-1);
    }


    @Test
    public void testLinearSearchIndexOf(){
        List<Integer> elements = Arrays.asList(5,8,9,3,11,42);
        assertEquals(linearSearchJava8Utils.linearSearchIndexOf(elements,42), 5);
    }
}
