//Write a program to find the average of number ?
//example three no (2+3+4)/3=3
import java.util.Scanner;
public class question2{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number");
        double num1 = sc.nextDouble();
        System.out.println("Enter your second number");
        double num2 = sc.nextDouble();
        System.out.println("Enter your third number");
        double num3 = sc.nextDouble();
        double average = (num1+num2+num3)/3;
        System.out.println("The average number is:"+average);
    }
}