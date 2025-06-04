import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class WordUtilsTest {


    @Test
    void test_wordUtils_find_valid() {
        String word = "undoing";
        char[] availableLetters = "documenting".toCharArray();

        assertTrue(WordUtils.isWordMadeUpOfAvailableCharacters(word.toCharArray(), availableLetters));
    }

}