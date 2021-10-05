import java.util.Random;

/* The Selection Sort Big O notation is O(n^2).
* the number of comparisons is the sum of the array's indexes.
* It's an unstable algorithm.
*/
public class SelectionSort {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[rand.nextInt(100)];

        System.out.println("\n\nOriginal array: ");

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100);
            System.out.print("[" + array[i] + "] ");
        }

        // sorting the array
        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largestNumberIndex = 0;
            for (int i = 0; i <= lastUnsortedIndex; i++) {
                if (array[i] > array[largestNumberIndex]) {
                    largestNumberIndex = i;
                }
            }
            swap(array, largestNumberIndex, lastUnsortedIndex);
        }

        // Final result
        System.out.println("\n\nSorted array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print("[" + array[i] + "] ");
        }
        System.out.println("\n\nArray length: " + array.length);
    }

    public static void swap(int array[], int firstNumberIndex, int secondNumberIndex) {
        int temp = array[firstNumberIndex];
        array[firstNumberIndex] = array[secondNumberIndex];
        array[secondNumberIndex] = temp;
    }
}
