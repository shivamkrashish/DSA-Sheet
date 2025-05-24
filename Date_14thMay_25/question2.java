// Write a program to calculate the sum of series of first N natural number?

import java.util.Scanner;

public class question2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number");
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println("Sum of series of" + num + "natural number is:" + sum);
    }
}

//Approach 2
//sum = n*(n+1)/2
