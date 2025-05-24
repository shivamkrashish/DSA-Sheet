//Write a program to swap two number?

import java.util.Scanner;

public class question4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first num");
        int num1 = sc.nextInt();
        System.out.println("Enter second num");
        int num2 = sc.nextInt();
        System.out.println("before swap : num1 = " + num1 + " ,num2 = " + num2);
        int swap = num1;
        num1 = num2;
        num2 = swap;
        System.out.println("after swap : num1 = " + num1 + " ,num2 = " + num2);
    }
}
