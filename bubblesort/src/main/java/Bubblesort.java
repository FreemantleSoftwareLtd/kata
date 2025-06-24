
import java.util.Collection;
import java.util.List;

public class Bubblesort<T extends Comparable<T>> {

    public Bubblesort() {}

    public List<T> sort(final Collection<T> collection) {

        if (collection == null || collection.isEmpty()) {
            throw new IllegalArgumentException("Collection must not be null or empty");
        }

        T[] array = getCollectionAsArray(collection);
        boolean swapped;
        int n = array.length;

        do {
            swapped = false;
            for (int i = 0; i < n - 1; i++) {
                if (array[i].compareTo(array[i + 1]) > 0) {
                    // Swap array[i] and array[i + 1]
                    T temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
            n--; // Reduce the range of comparison
        } while (swapped);

        return List.of(array);
    }

    private T[] getCollectionAsArray(Collection<T> collection) {
        @SuppressWarnings("unchecked") T[] arrayOfComparableTypes = (T[]) new Comparable[collection.size()]; // Create an array of Comparable type
        collection.toArray(arrayOfComparableTypes); // Fill the array with elements from the collection.
        return arrayOfComparableTypes;
    }

}
