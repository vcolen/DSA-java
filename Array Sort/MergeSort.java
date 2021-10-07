import java.util.*;

/* The Merge Sort Big O notation is O(n*logn).
* It's a stable algorithm.
*/
public class MergeSort {
    public static void main (String[] args) {
        Random rand = new Random();
        int[] array = new int[rand.nextInt(100)];

        System.out.println("\n\nOriginal array: ");
        for(int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100);
            System.out.print("[" + array[i] + "] ");
        }

        //sorting the array
        mergeSort(array, 0, array.length);

        //Final result
        System.out.println("\n\nSorted array: ");
        for(int i = 0; i < array.length; i++) {
            System.out.print("[" + array[i] + "] ");
        }
        System.out.println("\n\nArray length: " + array.length);
    }

    public static void mergeSort(int[] array, int low, int high) {
        if (high - low < 2) {
            return;
        }

        int mid = (low + high)/ 2;
        mergeSort(array, low, mid);
        mergeSort(array, mid, high);
        merge(array, low, mid, high);
    }

    public static void merge(int[] array, int low, int mid, int high) {
        
        if (array[mid - 1] <= array[mid]) {
            return;
        }

        int i = low;
        int j = mid;
        int[] temp = new int[high - low];

        int tempIndex = 0;
        //sorting the divided arrays
        while(i < mid && j < high) {
            temp[tempIndex++] = array[i] <= array[j] ? array[i++] : array[j++];
        }
    
        //copying temp back to original array
        System.arraycopy(array, i, array, low + tempIndex, mid - i);
        System.arraycopy(temp, 0, array, low, tempIndex);

    }
}
