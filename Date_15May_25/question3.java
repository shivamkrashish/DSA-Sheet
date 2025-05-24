//Write a Program to Swap the values of two variables without using any extra variable.
import java.util.Scanner;
public class question3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1=sc.nextInt();
        System.out.println("Enter the second number");
        int num2=sc.nextInt();
        System.out.println("before swaping num1 = "+num1+ " num2 = "+num2);
        //swaping without using third variable
        num1 = num1+num2;
        num2 = num1-num2;
        num1 = num1-num2;
         System.out.println("after swaping num1 = "+num1+ " num2 = "+num2);
    }
}