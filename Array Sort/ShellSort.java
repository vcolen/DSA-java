import java.util.Random;

/* The Shell Sort Big O notation is sometimes O(n^2).
* It depends on how you do the gap calculation. 
* Sometimes, it can be O(n).
* Most of the time, it's better than Bubble, Selection and Insertion Sort.
* It's an unstable algorithm.
*/
public class ShellSort {
    public static void main(String[] args) {
        Random rand = new Random();
	    int[] array = new int[rand.nextInt(100)];

        System.out.println("\n\nOriginal array: ");

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100);
            System.out.print("[" + array[i] + "] ");
        }

        //sorting the array
        for (int gap = array.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < array.length; i++) {
                int newElement = array[i];
                int j = i;
                while (j >= gap && array[j - gap] > newElement) {
                    array[j] = array[j - gap];
                    j -= gap;
                }
                array[j] = newElement;
            }
        }

        // Final result
        System.out.println("\n\nSorted array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print("[" + array[i] + "] ");
        }
        System.out.println("\n\nArray length: " + array.length);
    }
}
