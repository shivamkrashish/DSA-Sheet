//Write a program that takes a year from the user and prints whether it is a leap year or not?
// Leap Year Conditions:
// A year is a leap year if it is divisible by 4 and not divisible by 100.
// However, if the year is divisible by 400, it is a leap year.
import java.util.Scanner;
public class question4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = sc.nextInt();
        if((year % 4 == 0 && year % 100 != 0)||(year % 400 == 0)){
            System.out.println(year+":is Leap year");
        }else{
            System.out.println(year+":is Not Leap year");
        }
    }
}