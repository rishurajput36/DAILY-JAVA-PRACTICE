// Move all zeroes to end
import java.util.Arrays;

public class Movezeroes {

    public static void moveZeroes(int[] arr) {

        int index = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

      
        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }
    }

    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 3, 12};

        System.out.println("Before moving zeroes: " + Arrays.toString(arr));

        moveZeroes(arr);

        System.out.println("After moving zeroes: " + Arrays.toString(arr));
    }
}