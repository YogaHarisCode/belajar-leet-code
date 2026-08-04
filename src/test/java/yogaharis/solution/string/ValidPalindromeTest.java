package yogaharis.solution.string;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ValidPalindromeTest {

    @Autowired
    private ValidPalindrome validPalindrome;

    @Test
    void test1() {
        assertTrue(validPalindrome.isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    void test2() {
        assertFalse(validPalindrome.isPalindrome("race a car"));
    }

    @Test
    void test3() {
        assertTrue(validPalindrome.isPalindrome(" "));
    }

    @Test
    void test4() {
        assertTrue(validPalindrome.isPalindrome("!!!"));
    }
}