import org.junit.Test;

import static org.junit.Assert.*;

public class InsertionTest {
    Insertion insert = new Insertion();
    @Test
    public void insertionSort() {
        int[] testArray = {3,6,1,3,2};
        int[] sortedArray = {1,2,3,3,6};
        assertArrayEquals(sortedArray, insert.sort(testArray));
    }
}