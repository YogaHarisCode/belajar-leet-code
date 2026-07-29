package yogaharis.solution.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateTest {

    private ContainsDuplicate containsDuplicate;

    @BeforeEach
    void setUp() {
        containsDuplicate = new ContainsDuplicate();
    }

    @Test
    void test1() {
        boolean duplicate = containsDuplicate.containsDuplicate(new int[]{1, 2, 3, 1});

        assertTrue(duplicate);
    }

    @Test
    void test2() {
        boolean duplicate = containsDuplicate.containsDuplicate(new int[]{1, 2, 3, 4});

        assertFalse(duplicate);
    }

    @Test
    void test3() {
        boolean duplicate = containsDuplicate.containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2});

        assertTrue(duplicate);
    }

    @Test
    void test4() {
        boolean duplicate = containsDuplicate.containsDuplicate(new int[]{0, 4, 5, 0, 3,});

        assertTrue(duplicate);
    }
}