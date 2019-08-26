import org.junit.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
public class FinderTest {

    @Test
    public void test_maxTrue() {
        Finder find = new Finder();
        int[] intArray = new int[]{5,4,3,2,1};
        int expectedResult = 5;
        int actualResult = find.findMax(intArray);

        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void test_maxFalseNull() {
        Finder find2 = new Finder();
        int[] intArray2 = null;
        //int expectedResult = null;
        int actualResult2 = find2.findMax(intArray2);

        assertEquals(actualResult2, 12);

    }

    @Test
    public void test_maxFalseZero() {
        Finder find = new Finder();
        int[] intArray = new int[]{};
       // int expectedResult = 20;
        int actualResult = find.findMax(intArray);

        assertEquals(actualResult, 0);

    }

    @Test
    public void test_minTrue() {
        Finder find = new Finder();
        int[] intArray = new int[]{5,4,3,2,1};
        int expectedResultMin = 1;
        int actualResult = find.findMin(intArray);

        assertEquals(expectedResultMin, actualResult);
    }

    @Test
    public void test_minFalseNull() {
        Finder find = new Finder();
        int[] intArray = null;
        //int expectedResult = null;
        int actualResult = find.findMin(intArray);

        assertEquals(actualResult, 12);

    }

    @Test
    public void test_minFalseZero() {
        Finder find = new Finder();
        int[] intArray = new int[0];
        //int expectedResult = null;
        int actualResult = find.findMin(intArray);

        assertEquals(actualResult, 0);

    }

}
