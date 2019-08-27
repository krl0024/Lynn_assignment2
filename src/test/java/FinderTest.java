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
        try {
            Finder find2 = new Finder();
            int[] intArray2 = null;
            //int expectedResult = null;
            int actualResult2 = find2.findMax(intArray2);

            assertNull(actualResult2);
        }
        catch(NullPointerException e) {

        }

    }

    @Test
    public void test_maxFalseZero() {
        try {
        Finder find = new Finder();
        int[] intArray = new int[]{};
        // int expectedResult = 20;
        int actualResult = find.findMax(intArray);

        assertNull(actualResult);
    }
             catch(NullPointerException e) {

    }

    }

    @Test
    public void test_minTrue() {
        try{
        Finder find = new Finder();
        int[] intArray = new int[]{5, 4, 3, 2, 1};
        int expectedResultMin = 1;
        int actualResult = find.findMin(intArray);

        assertEquals(expectedResultMin, actualResult);
        }
        catch(NullPointerException e) {

        }
    }

    @Test
    public void test_minFalseNull() {
        try {
            Finder find = new Finder();
            int[] intArray = null;
            //int expectedResult = null;
            int actualResult = find.findMin(intArray);

            assertEquals(actualResult, 12);
        }
        catch(NullPointerException e) {

        }

    }

    @Test
    public void test_minFalseZero() {
        try {
            Finder find = new Finder();
            int[] intArray = new int[0];
            //int expectedResult = null;
            int actualResult = find.findMin(intArray);

            assertNull(actualResult);
        }
                catch(NullPointerException e) {

        }

    }

}
