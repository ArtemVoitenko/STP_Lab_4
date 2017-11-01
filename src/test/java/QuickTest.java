import org.junit.Test;

import static org.junit.Assert.*;

public class QuickTest {
    Quick quickClass = new Quick();
    @Test
    public void quickSort() {
        int[] testArray = {3,6,1,3,2};
        int[] sortedArray = {1,2,3,3,6};
        int min = 0;
        int max = testArray.length-1;

        assertArrayEquals(sortedArray,quickClass.quickSort(quickClass.sort(testArray),min,max));
    }

}