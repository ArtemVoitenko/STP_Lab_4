import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayTest {
    Array array = new Array();
    int[] arr = {2,1,5,7};
    @Test
    public void mean() {
        assertEquals(2,array.mean(arr));
    }

    @Test
    public void difference() {
        assertEquals(15,array.difference(arr));
    }

    @Test
    public void countPos() {
        assertEquals(4,array.countPos(arr));
    }

    @Test
    public void sumNeg() {
        assertEquals(0,array.sumNeg(arr));
    }

    @Test
    public void sumMult() {
        assertEquals(7,array.sumMult(arr));
    }

    @Test
    public void prod() {
        assertEquals(5,array.prod(arr));
    }

}