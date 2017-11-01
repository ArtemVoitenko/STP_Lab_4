import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixTest {
    Matrix matrix = new Matrix();
    int[][] mat= {{1,5},{4,7}};



    @Test
    public void sequence() {
        String str = matrix.sequence(mat);
        String result = "1111";
        assertEquals(result,str);
    }

    @Test
    public void sumElement() {
        int count = matrix.sumElement(mat);
        assertEquals(33, count);
    }

}