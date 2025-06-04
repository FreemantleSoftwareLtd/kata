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

        Set<String> expectedOutput = Set.of("");

        String input = "documenting";

        AnagramFindingService anagramFindingService = new AnagramFindingService(DEFAULT_FILE_PATH);
        Set<String> actualOutput = anagramFindingService.generateTwoWordAnagrams(input);

        //    assertTrue(Arrays.asList(expectedOutput).containsAll(actualOutput));
    }

    @Test
    void test_generateTwoWordAnagramsOfString_ensureOutputHasSameNumberOfLettersAsInput() throws IOException {

        String input = "documenting";

        AnagramFindingService anagramFindingService = new AnagramFindingService(DEFAULT_FILE_PATH);
        Set<String> actualOutput = anagramFindingService.generateTwoWordAnagrams(input);

        assertNotNull(actualOutput);
        // assertEquals(input.length(), actualOutput.stream().findFirst().get().replaceAll(" ", "").length());
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