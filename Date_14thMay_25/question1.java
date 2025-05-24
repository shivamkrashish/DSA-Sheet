//Write a program to check if a number is prime or not?
//A prime number is a natural number greater than 1 that has exactly two distinct positive divisors: 1 and itself. 
//This means it cannot be formed by multiplying two smaller natural numbers.example:2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31,..

import java.util.Scanner;

public class question1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your num");
        int num = sc.nextInt();
        boolean prime = true;
        if (num <= 1) {
            prime = false;
        } else {
            for (int i = 2; i < Math.sqrt(num); i++) {
                if (num % i == 0) {
                    prime = false;
                }
            }
            if (prime) {
                System.out.println("Your Number is Prime Num");
            } else {
                System.out.println("Your Number is Not Prime Num");
            }
        }
    }
}
