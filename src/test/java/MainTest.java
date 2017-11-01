import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {
    Main main = new Main();
    int[][] matr = {{2,7,4},{7,6,2},{9,1,8}};
    int[] array = {4,9,3,33,6,4,2,9,2};
    @Test
    public void array() {
        assertEquals(1,main.array());
    }

    @Test
    public void matrix() {
        assertEquals(1,main.matrix(matr));
    }
}