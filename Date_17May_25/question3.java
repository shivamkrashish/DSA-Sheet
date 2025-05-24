//Write a program to check string is palindrome or not ?
import java.util.Scanner;
public class question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // यूज़र से इनपुट लें
        System.out.print("Enter a string to check if it is a palindrome: ");
        String input = scanner.nextLine();
        // स्ट्रिंग को lowercase में कन्वर्ट करें ताकि comparison case-insensitive हो
        String original = input.toLowerCase();
        // स्ट्रिंग को रिवर्स करें
        String reversed = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }
        // original और reversed स्ट्रिंग की तुलना करें
        if (original.equals(reversed)) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }
    }
}
