import org.junit.jupiter.api.Test;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MyTests {

    @Test
    public void testPerfectShuffle() {
        int[] arr = {1, 2, 3, 4, 5, 21, 22, 23, 24, 25};
        assertEquals(Arrays.toString(new int[] {1, 21, 2, 22, 3, 23, 4, 24, 5, 25}), Arrays.toString(MyMain.perfectShuffle(arr)), "The perfect shuffle of [1, 2, 3, 4, 5, 21, 22, 23, 24, 25] should be: [1, 21, 2, 22, 3, 23, 4, 24, 5, 25]");

        int[] arr2 = {1, 21, 2, 22, 3, 23, 4, 24, 5, 25};
        assertEquals(Arrays.toString(new int[] {1, 23, 21, 4, 2, 24, 22, 5, 3, 25}), Arrays.toString(MyMain.perfectShuffle(arr2)), "The perfect shuffle of [1, 21, 2, 22, 3, 23, 4, 24, 5, 25] should be: [1, 23, 21, 4, 2, 24, 22, 5, 3, 25]");
    }

    @Test
    public void testSelectionShuffle() {
        int[] arr = {1, 2, 3, 4, 5, 21, 22, 23, 24, 25};
        assertNotEquals(Arrays.toString(arr), Arrays.toString(MyMain.selectionShuffle(arr)), "Selection shuffle should not return an array that matches the original array");
    }
}
