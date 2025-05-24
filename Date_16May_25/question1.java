//Write a program to calculate factorial of a number 
//n!=n×(n−1)×(n−2)×⋯×1
//example:5!=5×4×3×2×1=120
// public class question1 {
//     public static void main(String[] args) {
//         int num = 5;
//         int fact =1;

//         for (int i = 1; i <= num; i++) {
//             fact *= i;  // same as fact = fact * i
//         }

//         System.out.println("Factorial is: " + fact);
//     }
// }
//recursion
// import java.util.*;
// public class question1 {
//     // Recursive method
//     static long factorial(int n) {
//         if (n == 0 || n == 1){
//             return 1;
//         }else{
//             return n * factorial(n - 1);
//     }
// }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();
//         if (num < 0)
//             System.out.println("Factorial does not exist for negative numbers.");
//         else
//             System.out.println("Factorial of " + num + " is: " + factorial(num));
//     }
// }