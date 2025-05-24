//Write a program to find the minimum element in an array.

public class question1 {

    public static void main(String[] args) {
        int[] array = {15, 3, 9, 20, -4, 8};
        if (array.length == 0) {
            System.out.println("Array is empty");
            return;
        }
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("The minimum element in the array is: " + min);
    }
}
