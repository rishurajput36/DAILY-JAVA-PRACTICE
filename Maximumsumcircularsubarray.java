// Maximum Sum Circular Subarray...
import java.util.*;

public class Maximumsumcircularsubarray{

    public static int maxSubarraySumCircular(int[] nums) {
        int totalSum = 0;

        int maxSum = nums[0];
        int minSum = nums[0];

        int currMax = 0;
        int currMin = 0;

        for (int num : nums) {
            currMax = Math.max(num, currMax + num);
            maxSum = Math.max(maxSum, currMax);

            currMin = Math.min(num, currMin + num);
            minSum = Math.min(minSum, currMin);

            totalSum += num;
        }

        // If all elements are negative
        if (maxSum < 0) {
            return maxSum;
        }

        // Maximum circular sum
        return Math.max(maxSum, totalSum - minSum);
    }

    public static void main(String[] args) {
        int[] nums = {5, -3, 5};

        System.out.println(
            "Maximum Circular Subarray Sum: "
            + maxSubarraySumCircular(nums)
        );
    }
}
