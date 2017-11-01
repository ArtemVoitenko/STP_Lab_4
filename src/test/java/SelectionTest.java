import org.junit.Test;

import static org.junit.Assert.*;

public class SelectionTest {
    Selection selectionClass = new Selection();
    @Test
    public void selectionSort() {
        int[] testArray = {3,6,1,3,2};
        int[] sortedArray = {1,2,3,3,6};
        assertArrayEquals(sortedArray,selectionClass.sort(testArray));
    }

}