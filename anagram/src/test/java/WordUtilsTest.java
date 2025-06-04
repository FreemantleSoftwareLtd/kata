import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordUtilsTest {


    @Test
    void test_wordUtils_find_valid() throws IOException {
        String word = "undoing";
        char[] availableLetters = "documenting".toCharArray();

        assertTrue(WordUtils.isWordMadeUpOfAvailableCharacters(word.toCharArray(), availableLetters));
    }

}