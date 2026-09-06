// Find Duplicate Elements Using HashSet...
import java.util.HashSet;

public class FindDuplicatesHashset {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 2, 4, 5, 1, 3};

        HashSet<Integer> set = new HashSet<>();

        System.out.println("Duplicate elements:");

        for (int num : arr) {

            if (set.contains(num)) {
                System.out.println(num);
            } else {
                set.add(num);
            }
        }
    }
}