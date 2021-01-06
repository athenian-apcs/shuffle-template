import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTests {

    @Test
    public void testCountOdd() {
        assertEquals(3, MyMain.countOdd(new ArrayList<Integer>(Arrays.asList(new Integer[] {1, 2, 3, 4, 5}))), "The number of odd numbers in the ArrayList [1, 2, 3, 4, 5] should be: 3");
        assertEquals(0, MyMain.countOdd(new ArrayList<Integer>(Arrays.asList(new Integer[] {2, 4, 6, 8, 10}))), "The number of odd numbers in the ArrayList [2, 4, 6, 8, 10] should be: 0");
        assertEquals(4, MyMain.countOdd(new ArrayList<Integer>(Arrays.asList(new Integer[] {11, -11, 23, -5}))), "The number of odd numbers in the ArrayList [11, -11, 23, -5] should be: 4");
    }

    @Test
    public void testCheckDuplicates() {
        ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(new Integer[] {1, 2, 3, 4, 5}));
        ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(new Integer[] {2, 4, 6, 8, 10}));
        ArrayList<Integer> list3 = new ArrayList<Integer>(Arrays.asList(new Integer[] {1, 3, 5, 7, 9}));
        ArrayList<Integer> list4 = new ArrayList<Integer>(Arrays.asList(new Integer[] {9, 8, 7, 6, 5}));

        assertEquals(true, MyMain.checkDuplicates(list1, list2), "Whether or not the ArrayLists [1, 2, 3, 4, 5] and [2, 4, 6, 8, 10] contain a duplicate should be: true");
        assertEquals(true, MyMain.checkDuplicates(list1, list3), "Whether or not the ArrayLists [1, 2, 3, 4, 5] and [1, 3, 5, 7, 9] contain a duplicate should be: true");
        assertEquals(true, MyMain.checkDuplicates(list1, list4), "Whether or not the ArrayLists [1, 2, 3, 4, 5] and [9, 8, 7, 6, 5] contain a duplicate should be: true");
        assertEquals(false, MyMain.checkDuplicates(list2, list3), "Whether or not the ArrayLists [2, 4, 6, 8, 10] and [1, 3, 5, 7, 9] contain a duplicate should be: false");
    }

    @Test
    public void testConvertToArrayList() {
        ArrayList<Integer> list1 = MyMain.convertToArrayList(new int[]{1, 2, 3, 4, 5});
        assertEquals("[1, 2, 3, 4, 5]", list1.toString(), "Converting the array [1, 2, 3, 4, 5] to an ArrayList should output the ArrayList: [1, 2, 3, 4, 5]");
    }
    
}
