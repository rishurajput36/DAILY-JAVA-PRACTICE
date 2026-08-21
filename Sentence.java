// longest word in a sentence in a string...
public class Sentence {

    public static void main(String[] args) {

        String str = "Java is a programming language";

        String[] words = str.split(" ");

        String longest = "";

        for (String word : words) {

            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        System.out.println("Longest word: " + longest);
        System.out.println("Length: " + longest.length());
    }
}