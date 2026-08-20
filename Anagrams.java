// Check whether two strings are Anagrams...
// Anagrams are two strings that contain the same letters with the same frequency, but arranged in a different order...


import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First String: ");
        String s1 = sc.nextLine();

        System.out.print("Enter Second String: ");
        String s2 = sc.nextLine();

        char[] a = s1.toLowerCase().replaceAll("\\s", "").toCharArray();
        char[] b = s2.toLowerCase().replaceAll("\\s", "").toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if (Arrays.equals(a, b)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }

        sc.close();
    }
}