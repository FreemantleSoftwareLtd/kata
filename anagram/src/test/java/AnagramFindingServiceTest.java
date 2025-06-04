import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AnagramFindingServiceTest {


    private final String DEFAULT_FILE_PATH = "src/test/resources/lexican.txt";

    @Test
    void test_generateTwoWordAnagramsOfString_ensureResultsOnlyUseLettersFromOriginalString() throws IOException {
      // Test TODO: This test is not implemented yet.
        String input = "documenting";

        AnagramFindingService anagramFindingService = new AnagramFindingService(DEFAULT_FILE_PATH);
        Set<String> actualOutput = anagramFindingService.generateTwoWordAnagrams(input);

        assertNotNull(actualOutput);
    }

    @Test
    void test_generateTwoWordAnagramsOfString_ensureOutputHasSameNumberOfLettersAsInput() throws IOException {
        // Test TODO: This test is not implemented yet.
        String input = "documenting";

        AnagramFindingService anagramFindingService = new AnagramFindingService(DEFAULT_FILE_PATH);
        Set<String> actualOutput = anagramFindingService.generateTwoWordAnagrams(input);

        assertNotNull(actualOutput);
    }

    @Test
    void test_generateTwoWordAnagramsOfString() throws IOException {

        List<String> expectedOutput = List.of("gin men", "comet gin");

        String input = "documenting";

        AnagramFindingService anagramFindingService = new AnagramFindingService("src/test/resources/lexican.txt");
        Set<String> actualOutput = anagramFindingService.generateTwoWordAnagrams(input);

        assertNotNull(actualOutput);
        assertTrue(expectedOutput.containsAll(actualOutput));
    }

}