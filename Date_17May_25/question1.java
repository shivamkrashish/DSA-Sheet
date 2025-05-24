// Write a program to find largest number in Array 
public class question1{
    public static int largest(int[] numbers) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int[] numbers = {2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Largest number is: " +largest(numbers));
    }
}
