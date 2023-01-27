package day04;

public class IsPalindrome {
    public static void main(String[] args) {
        System.out.println(palindrome("jghjg"));
    }
    public static Boolean palindrome(String word) {
        String reverse = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverse += word.charAt(i);
        }
        return reverse.equalsIgnoreCase(word);
    }
}
