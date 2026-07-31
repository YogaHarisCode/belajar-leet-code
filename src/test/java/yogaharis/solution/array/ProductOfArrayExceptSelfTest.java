package yogaharis.solution.array;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProductOfArrayExceptSelfTest {

    @Autowired
    private ProductOfArrayExceptSelf productOfArrayExceptSelf;

    @Test
    void test1() {
        int[] ints = productOfArrayExceptSelf.productExceptSelf(new int[]{1, 2, 3, 4});

        assertArrayEquals(new int[]{24,12,8,6}, ints);
    }

    @Test
    void test2() {
        int[] ints = productOfArrayExceptSelf.productExceptSelf(new int[]{-1,1,0,-3,3});

        assertArrayEquals(new int[]{0,0,9,0,0}, ints);
    }
}