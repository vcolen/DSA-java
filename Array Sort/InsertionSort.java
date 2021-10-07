import java.util.Random;

/* The Insertion Sort Big O notation is O(n^2) 
* It's a stable algorithm 
*/

public class InsertionSort {

    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[rand.nextInt(100)];
        int numberOfComparisons = 0;
        int numberOfMovements = 0;

        System.out.println("\n\nOriginal array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(1000);
            System.out.print("[" + array[i] + "] ");
        }

        // the first index is 1 because the number at index 0 is "already sorted", in
        // this case.
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;
            while ((j >= 0) && (array[j] > temp)) {
                array[j + 1] = array[j];
                j--;
                numberOfComparisons++;
                numberOfMovements++;
            }
            array[j + 1] = temp;
            numberOfMovements += 2;
        }

        // Final result
        System.out.println("\n\nSorted array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print("[" + array[i] + "] ");
        }

        int n = array.length;

        System.out.println("\n\nArray length: " + array.length);

        System.out.println("\n\nCurrent case number of comparisons: " + numberOfComparisons);
        System.out.println("\nBest case number of comparisons: " + (n - 1));
        System.out.println("\nWorst case number of comparisons: " + ((n - 1) * n)/2);

        System.out.println("\n\nCurrent case number of movements: " + numberOfMovements);
        System.out.println("\nBest case number of movements: " + (2 * (n - 1)));
        System.out.println("\nWorst case number of movements: " + (n * (n + 1) - 2)/2);
    }
}
