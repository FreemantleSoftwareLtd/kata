import java.io.IOException;
import java.util.*;

// TODO split into meaningful classes
public class AnagramFindingService {

    private List<String> dictionary;

    public AnagramFindingService(String filePath) throws IOException {
        loadDictionary(filePath);
    }

    private void loadDictionary(String filePath) throws IOException {
        try {
            this.dictionary = new WordReader().getWordsFromFile(filePath);
        } catch (IOException e) {
            throw new IOException("Could not load Dictionary.", e);
        }
    }

    public Set<String> generateTwoWordAnagrams(String anagramsOf){

        if (anagramsOf == null || anagramsOf.isEmpty()) {
            return Collections.emptySet();
        }

        Set<String> anagrams = new HashSet<>();

        // for all words in dictionary
        while (!dictionary.isEmpty()) {
            // find a pair of words
            Set<String> foundAnagrams = findTwoWordAnagrams(anagramsOf);
            if (foundAnagrams.isEmpty()) {
                break; // no more anagrams can be found
            }
            anagrams.addAll(foundAnagrams);
        }
        return anagrams;
    }

    public Set<String> findTwoWordAnagrams(String anagramsOf) {
        Set<String> anagrams = new HashSet<>();
        // get 'available letters'
        char[] availableLetters = anagramsOf.toCharArray();
        Optional<String> firstWord = findWordInWithAvailableLetters(availableLetters);

        if(firstWord.isEmpty()) {
            return anagrams; // no word found, return empty set
        }

        // if word found then remove those letters from 'available letters'
        char[] nextCharacters = reduceAvailableLetters(availableLetters, firstWord.orElse(null));
        Optional<String> secondWord = findWordInWithAvailableLetters(nextCharacters);

        if(secondWord.isEmpty()) {
            return anagrams; // no second word found, return empty set
        }

        // Two words found, add to anagrams
        anagrams.add(firstWord.get() + " " + secondWord.get());

        return anagrams;
    }

    public char[] reduceAvailableLetters(char[] availableLetters, String word) {

        String remainingLetters = new String(availableLetters);

        for(char c : word.toCharArray()) {
            // remove letter from available letters
            remainingLetters = remainingLetters.replaceFirst(String.valueOf(c), "");
        }

        return remainingLetters.toCharArray();
    }

    public Optional<String> findWordInWithAvailableLetters(char[] availableLetters) {
        Iterator<String> dictionaryIterator = dictionary.iterator();
        // for each word see if the all the letters are contained in the availableLetters
        while(dictionaryIterator.hasNext()) {
            String word = dictionaryIterator.next();

            // do letter match for words in file
            if(WordUtils.isWordMadeUpOfAvailableCharacters(word.toCharArray(), availableLetters)) {
                // return word
                return Optional.of(word);
            }
            dictionaryIterator.remove(); // remove word from dictionary so it can't be found again
        }

        return Optional.empty();
    }
}
