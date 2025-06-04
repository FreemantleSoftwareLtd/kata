import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WordDictionaryTest {

    @Test
    void test_fileRead_one_word_file() throws IOException {
        WordReader wordReader = new WordReader();

        List<String> actualResult = wordReader.getWordsFromFile("src/test/resources/test_file_1.txt");

        assertEquals(1, actualResult.size());
        assertEquals("potato", actualResult.getFirst());
    }

    @Test
    void test_fileRead_thirty_six_word_file() throws IOException {
        WordReader wordReader = new WordReader();

        List<String> actualResult = wordReader.getWordsFromFile("src/test/resources/test_file_2.txt");
        String[] results = new String[actualResult.size()];
        actualResult.toArray(results);

        assertEquals(36, actualResult.size());
        assertEquals("acrobat", actualResult.get(0));
        assertEquals("cinema", actualResult.get(35));
    }

}