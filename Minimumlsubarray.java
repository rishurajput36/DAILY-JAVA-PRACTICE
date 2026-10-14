// Minimum Length Subarray with Sum at Least K
import java.util.*;

public class Minimumlsubarray {

    public static int minSubArrayLen(int[] nums, int k) {
        int n = nums.length;

        long[] prefix = new long[n + 1];

        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }

        Deque<Integer> deque = new ArrayDeque<>();
        int minLength = n + 1;

        for (int i = 0; i <= n; i++) {


            while (!deque.isEmpty()
                    && prefix[i] - prefix[deque.peekFirst()] >= k) {

                minLength = Math.min(
                    minLength, i - deque.pollFirst()
                );
            }

         
            while (!deque.isEmpty()
                    && prefix[i] <= prefix[deque.peekLast()]) {
                deque.pollLast();
            }

            deque.offerLast(i);
        }

        return minLength == n + 1 ? -1 : minLength;
    }

    public static void main(String[] args) {
        int[] nums = {2, -1, 2, 3, -2};
        int k = 5;

        System.out.println(minSubArrayLen(nums, k));
    }
}
