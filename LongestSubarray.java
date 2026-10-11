// Longest Subarray with equal 0s and 1s...
import java.util.*;

public class LongestSubarray {
    public static int longestSubarray(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int maxLength = 0;

        // Prefix sum 0 occurs before the array starts
        map.put(0, -1);

        for (int i = 0; i < arr.length; i++) {

            // Treat 0 as -1 and 1 as +1
            if (arr[i] == 0) {
                sum -= 1;
            } else {
                sum += 1;
            }

            if (map.containsKey(sum)) {
                int length = i - map.get(sum);
                maxLength = Math.max(maxLength, length);
            } else {
                map.put(sum, i);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 1, 0, 0};

        System.out.println(longestSubarray(arr));
    }
}
