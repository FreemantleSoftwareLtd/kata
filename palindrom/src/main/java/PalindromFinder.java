import java.util.*;

// Find Palindromic Substrings
public class PalindromFinder {

    public String findLongestPalindrom(final String stringToProcess) {
        Map<Integer, String> result = findPalindromsBySize(stringToProcess);

        if (result.isEmpty()) {
            return "";
        }

        Integer keyOfLongestPalindrom = findBiggestValue(result.keySet());
        return result.get(keyOfLongestPalindrom);
    }

    private int findBiggestValue(Set<Integer> values) {
        int result = 0;

        for (Integer value : values) {
            if (value > result) {
                result = value;
            }
        }

        return result;
    }

    public Map<Integer, String> findPalindromsBySize(final String stringToProcess) {

        if (stringToProcess == null || stringToProcess.isEmpty()) {
            return Collections.emptyMap();
        }

        Map<Integer, String> result = new HashMap<>();

        final int lastIndex = stringToProcess.length() - 1;

        // Forward Pointer
        for (int forwardPointer = 0; forwardPointer < stringToProcess.length(); forwardPointer++) {

            // check each character
            for (int reversePointer = lastIndex; reversePointer > 0; reversePointer--) {

                // Do the characters at these positions match?
                if (stringToProcess.charAt(forwardPointer) == stringToProcess.charAt(reversePointer)) {

                    Optional<String> palindrom = checkIfPalindrom(stringToProcess, forwardPointer, reversePointer);
                    palindrom.ifPresent(s -> result.put(s.length(), s));
                }
            }

        }
        return result;
    }


    private Optional<String> checkIfPalindrom(final String textToProcess, int forwardStartIndex, int backwardStartIndex) {

        int pointer1 = forwardStartIndex;
        int pointer2 = backwardStartIndex;

        while (
                pointer1 < backwardStartIndex &&
                        pointer2 > forwardStartIndex &&
                        textToProcess.charAt(pointer1) == textToProcess.charAt(pointer2)
        ) {
            pointer1++;
            pointer2--;

            if (pointer1 == pointer2) {
                // palindrom found
                return Optional.of(textToProcess.substring(forwardStartIndex, backwardStartIndex + 1).trim());
            }
        }

        return Optional.empty();
    }

}
