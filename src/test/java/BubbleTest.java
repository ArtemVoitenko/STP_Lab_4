import org.junit.Test;

import static org.junit.Assert.*;

public class BubbleTest {
    Bubble bubble = new Bubble();
    @Test
    public void bubbleSort() {
        int[] testArray = {3,6,1,3,2};
        int[] sortedArray = {1,2,3,3,6};
        assertArrayEquals(sortedArray, bubble.sort(testArray));
    }
}