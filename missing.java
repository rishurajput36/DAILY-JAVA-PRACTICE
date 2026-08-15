//Find the missing number in an arrray containing numbers from 1 to n
public class missing {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};   // Missing number is 3
        int n = 5;

        int sum = n * (n + 1) / 2;   // sum of numbers from 1 to n
        int arrSum = 0;

        for (int i = 0; i < arr.length; i++) {
            arrSum += arr[i];
        }

        int missing = sum - arrSum;

        System.out.println("Missing number = " + missing);
    }
}