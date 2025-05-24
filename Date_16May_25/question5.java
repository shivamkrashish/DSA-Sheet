// Write a programe to print foo if the number is divisible by 3 and print bar if the no.Is divisible by 5 and print foo bar 
// if the no. Is divisible by 3 and 5
import java.util.Scanner;
public class question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("foo bar");
        } else if (num % 3 == 0) {
            System.out.println("foo");
        } else if (num % 5 == 0) {
            System.out.println("bar");
        } else {
            System.out.println("The number is not divisible by 3 or 5.");
        }
    }
}
