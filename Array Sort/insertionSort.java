import java.util.Random;

/* The Insertion Sort Big O notation is O(n^2) */
public class insertionSort {

    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[rand.nextInt(100)];
        int numberOfoperations = 0;

        System.out.println("\n\nOriginal array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100);
            System.out.print("[" + array[i] + "], ");
        }

        // the first index is 1 because the number at index 0 is "already sorted", in this case.
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < array.length; firstUnsortedIndex++) {
            int newElement = array[firstUnsortedIndex];
            int i;
            // looking for a number that is lower than the current number
            for (i = firstUnsortedIndex; i > 0 && array[i - 1] > newElement; i--) {
                // changing the position of every element
                array[i] = array[i - 1];
                numberOfoperations += 2;
            }
            array[i] = newElement;
        }
        // Final result
        System.out.println("\n\nSorted array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print("[" + array[i] + "], ");
        }
        System.out.println("\n\nArray length: " + array.length);
        System.out.println("Total number of operations: " + numberOfoperations);
    }
}
