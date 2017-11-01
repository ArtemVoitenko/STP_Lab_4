import org.junit.Test;

import static org.junit.Assert.*;

public class HeapTest {
    Heap heapClass = new Heap();
    @Test
    public void heapSort() {
        int[] testArray = {3,6,1,3,2};
        int[] sortedArray = {1,2,3,3,6};
        assertArrayEquals(sortedArray, heapClass.heapSort(testArray));
    }

}