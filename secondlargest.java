//Find the second largest element in an array
public class secondlargest {
    public static void main(String[] args) {
        int[] arr = {10, 25, 8, 40, 15};

        int largest = arr[0], second = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                second = largest;
                largest = arr[i];
            } else if (arr[i] > second && arr[i] != largest) {
                second = arr[i];
            }
        }

        System.out.println("Second Largest = " + second);
    }
}