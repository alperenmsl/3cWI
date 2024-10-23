package xyz.alperen.projects.basics;

public class StringHelper {
    public static void main(String[] args) {
        // Is Palindrome (String): boolean
        // countLetters (String, Char): int
        // reverseString (String): String
        // printAmountOfLetters (String)

        // Palindrome
        boolean isPalindrome = isPalindrome("anna");
        if (isPalindrome) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        // countLetters
        int amount = countLetters("alperen", 'a');
        System.out.println(amount);

        // reverseString
        String reversed = reverseString("Messi");

        // AmountOfLetters
        int letters = AmountOfLetters("Hassan");
        System.out.println("\n");
        System.out.println(letters);

    }

    public static int AmountOfLetters(String word){
        return word.length();
    }


    public static String reverseString(String string){
        for (int i = string.length() -1; i >= 0; i--) {
            System.out.print(string.charAt(i));
        }
        return string;
    }

    public static boolean isPalindrome(String word) {
        String reversed = new StringBuilder(word).reverse().toString();
        return word.equals(reversed);
    }

    public static int countLetters(String word, char c) {
        int letters = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == c) {
                letters++;
            }
        }
        return letters;
    }
}