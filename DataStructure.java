import java.util.ArrayDeque;
import java.util.Deque;
class PalindromeTest {

    public static void main(String[] args) {

       String str = "madam";
        Deque<Character> deque = new ArrayDeque<>();
        for (int i = 0; i < str.length(); i++) {
            deque.addLast(str.charAt(i));
        }

        String reverseString = "";

        while (!deque.isEmpty()) {
            reverseString = reverseString+deque.removeFirst();
        }

        if (str.equals(reverseString))
            System.out.println("The input String is a palindrome.");
        else
            System.out.println("The input String is not a palindrome.");

    }
}