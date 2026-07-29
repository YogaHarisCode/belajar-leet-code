package yogaharis.solution.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumSubarrayTest {

    private MaximumSubarray maximumSubarray;

    @BeforeEach
    void setUp() {
        maximumSubarray = new MaximumSubarray();
    }

    @Test
    void test1() {
        int maxSubArray = maximumSubarray.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});

        assertEquals(6, maxSubArray);
    }

    @Test
    void test2() {
        int maxSubArray = maximumSubarray.maxSubArray(new int[]{1});

        assertEquals(1, maxSubArray);
    }

    @Test
    void test3() {
        int maxSubArray = maximumSubarray.maxSubArray(new int[]{5, 4, -1, 7, 8});

        assertEquals(23, maxSubArray);
    }

    @Test
    void test4() {
        int maxSubArray = maximumSubarray.maxSubArray(new int[]{-2, 3, -1, 2});

        assertEquals(4, maxSubArray);
    }

    @Test
    void test5() {
        int maxSubArray = maximumSubarray.maxSubArray(new int[]{-1});

        assertEquals(-1, maxSubArray);
    }

    @Test
    void test6() {
        int maxSubArray = maximumSubarray.maxSubArray(new int[]{1});

        assertEquals(1, maxSubArray);
    }
}