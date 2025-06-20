import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import static org.junit.jupiter.api.Assertions.*;

class PalindromFinderTest {

    @Test
    void test_findOnePalindromEasy() {
        // given
        String text = "ada";
        // when
        Map<Integer, String> result = new PalindromFinder().findPalindromsBySize(text);
        // then
        System.out.println(result);
        assertEquals(1, result.size());
        assertEquals(text, result.values().stream().findFirst().get());
    }

    @Test
    void test_findOnePalindromTricky() {
        // given
        String text = "my little ada";
        // when
        Map<Integer, String> result = new PalindromFinder().findPalindromsBySize(text);
        // then
        System.out.println(result);
        List<String> values = result.values().stream().toList();
        assertEquals("ada", values.getFirst());
    }

    @Test
    void test_findThreePalindroms() {
        String text = "madam racecar";
        // when
        Map<Integer, String>  result = new PalindromFinder().findPalindromsBySize(text);
        // then
        System.out.println(result);
        List<String> values = result.values().stream().toList();
        assertEquals(3, result.size());
    }


    @Test
    void test_findNoPalindrom() {
        // given
        String text = "the quick brown fox.";
        // when
        Map<Integer, String> result = new PalindromFinder().findPalindromsBySize(text);
        // then
        assertTrue(result.isEmpty());
    }

    @Test
    void test_findLongestPalindrom2() {
        // given
        String text = "qwe ada racecar madam zsd";
        // when
        String result = new PalindromFinder().findLongestPalindrom(text);
        // then
        System.out.println(result);
        assertEquals("racecar", result);
    }

    @Test
    void test_findLongestPalindrom() {
        // given
        String text = "madam racecar";
        // when
        String result = new PalindromFinder().findLongestPalindrom(text);
        // then
        System.out.println(result);
        assertEquals("racecar", result);
    }

    @Test
    void test_StringBuilder() {

        String text = "the happy racecar";
        StringTokenizer tokenizer = new StringTokenizer(text, " ");

        while(tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken();
            System.out.println(word + " " + isPalindrom(word));
        }
    }

    private boolean isPalindrom(final String text) {
        String reversedText = new StringBuilder(text).reverse().toString();
        return text.equals(reversedText);
    }

}