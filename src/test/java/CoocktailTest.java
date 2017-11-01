import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CoocktailTest {
    Coocktail coocktailClass = new Coocktail();
    @Test
    public void cocktailSort() {
        int[] testArray = {3,6,1,3,2};
        int[] sortedArray = {1,2,3,3,6};

        testArray = coocktailClass.sort(testArray);
        Assert.assertArrayEquals(sortedArray, testArray);
    }

}