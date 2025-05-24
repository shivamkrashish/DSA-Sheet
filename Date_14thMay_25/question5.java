//Write a program to print fibonacci series?
//The Fibonacci sequence is a series of numbers where each number is the sum of the two preceding ones.
// It typically starts with 0 and 1, leading to the sequence:
//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...

import java.util.Scanner;

public class question5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first num");
        int num = sc.nextInt();
        int first = 0, second = 1;
        System.out.println("fibonnaci series up to" + num + "term:");
        for (int i = 1; i <= num; i++) {
            System.out.print(first + " ");
            int temp = first + second;
            first = second;
            second = temp;
        }
    }
}
