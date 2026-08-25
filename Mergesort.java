// Merge Sort...
import java.util.*;

public class Mergesort {

    public static void mergeSort(int[] arr, int low, int high) {

        if (low < high) {

            int mid = low + (high - low) / 2;

           
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);

         
            merge(arr, low, mid, high);
        }
    }

    public static void merge(int[] arr, int low, int mid, int high) {

        int[] temp = new int[high - low + 1];

        int i = low;       // Left part
        int j = mid + 1;   // Right part
        int k = 0;         // Temp array

        // Compare elements from both halves
        while (i <= mid && j <= high) {

            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }

            k++;
        }

        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }

     
        while (j <= high) {
            temp[k] = arr[j];
            j++;
            k++;
        }

     
        for (int x = 0; x < temp.length; x++) {
            arr[low + x] = temp[x];
        }
    }

    public static void main(String[] args) {

        int[] arr = {5, 2, 8, 1, 3, 7, 6, 4};

        System.out.println("Before Sorting: " + Arrays.toString(arr));

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("After Sorting: " + Arrays.toString(arr));
    }
}