package p03_BubbleSort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import p03_BubbleSortTest.Bubble;

public class BubbleTest {

    @Test
    void test_Should_Sort_In_AscendingOrder() {

        int[] expectedValues = {-8, 0, 1, 7, 9, 9, 45, 45};
        int[] actualValues = {45, 1, -8, 0, 45, 7, 9, 9};

        Bubble.sort(actualValues);

        Assertions.assertArrayEquals(expectedValues, actualValues);
    }
}
