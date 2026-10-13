// Find the smallest missing positive integer...
import java.util.*;

public class Smallestmissingpinteger {
    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};

        HashSet<Integer> set = new HashSet<>();

    
        for (int num : arr) {
            set.add(num);
        }

      
        int missing = 1;

        while (set.contains(missing)) {
            missing++;
        }

        System.out.println(missing);
    }
}
