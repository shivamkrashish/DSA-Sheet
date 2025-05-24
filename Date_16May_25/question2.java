//Write a program to find perfect number
//example, the number 6 has divisors 1, 2, and 3, and 1 + 2 + 3 = 6, so 6 is a perfect number.
import java.util.Scanner;
public class question2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;
        // Calculate sum of proper divisors
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        // Check if sum equals the original number
        if (sum == num && num != 0) {
            System.out.println(num + " is a perfect number.");
        } else {
            System.out.println(num + " is not a perfect number.");
        }
    }
}
