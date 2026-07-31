package yogaharis.solution.string;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ValidAnagramTest {

    @Autowired
    private ValidAnagram validAnagram;

    @Test
    void test1() {
        assertTrue(validAnagram.isAnagram("anagram", "nagaram"));
    }

    @Test
    void test2() {
        assertFalse(validAnagram.isAnagram("rat", "car"));
    }
}