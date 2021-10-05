import java.util.Random;

/* The Bubble Sort Big O notation is O(n^2).
* the number of comparisons is the sum of the array's indexes.
*/

public class bubbleSort {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[rand.nextInt(100)];

        System.out.println("\n\nOriginal array: ");
        
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100);
            System.out.print("[" + array[i] + "], ");
        }
        int numberOfComparisons = 0;
        // sorting the array
        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                }
                numberOfComparisons++;
            }
        }
        // Final result
        System.out.println("\n\nSorted Array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print("[" + array[i] + "], ");
        }
        System.out.println("\n\nArray length: " + array.length);
        System.out.println("Total number of comparisons: " + numberOfComparisons);
    }
    
    public static void swap(int array[], int firstNumberIndex, int secondNumberIndex) {
        int temp = array[firstNumberIndex];
        array[firstNumberIndex] = array[secondNumberIndex];
        array[secondNumberIndex] = temp;
    }
}
