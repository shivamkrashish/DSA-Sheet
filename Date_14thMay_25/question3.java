//Write a program to check a number is odd or even?

import java.util.Scanner;

public class question3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + ":Number is Even");
        } else {
            System.out.println(num + ":Number is Odd");
        }
    }
}
