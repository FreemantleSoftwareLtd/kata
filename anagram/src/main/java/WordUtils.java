public class WordUtils {

    public static boolean isWordMadeUpOfAvailableCharacters(char[] word, char[] availableLetters) {
        if(word.length == 0 || availableLetters.length ==0) {
            return false;
        }

        // does char1 contain all characters in char 2?
        for (char character : word) {
            if (!doesWordContainCharacter(availableLetters, character)) {
                return false;
            }
        }

        return true;
    }

    public static boolean doesWordContainCharacter(char[] word, char character) {
        for (char c : word) {
            if (c == character) {
                return true;
            }
        }
        return false;
    }


}
