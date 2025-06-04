import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.List;

public class WordReader {

    public WordReader() {
        // TODO we might want to cache the words returned from file.
    }

    public List<String> getWordsFromFile(String filePath) throws IOException {

        List<String> wordsInFile = new ArrayList<>(); // this might want to be a map Map<char, Set>

        FileReader reader = new FileReader(filePath);
        StreamTokenizer tokenizer = new StreamTokenizer(reader);

        while (tokenizer.nextToken() != StreamTokenizer.TT_EOF) {
            wordsInFile.add(tokenizer.sval);
        }

        return wordsInFile;
    }


}
