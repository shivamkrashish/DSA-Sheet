//Write a program to check whether two Array are equal or not?
public class question2 {
    public static void main(String[] args) {
        int[] array1 = {10, 20, 30};
        int[] array2 = {10, 20, 30};

        boolean areEqual = true;

        // Check if lengths are equal
        if (array1.length != array2.length) {
            areEqual = false;
        } else {
            // Compare each element
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] != array2[i]) {
                    areEqual = false;
                    break;
                }
            }
        }
        // Displaying the result
        if (areEqual) {
            System.out.println("The arrays are equal.");
        } else {
            System.out.println("The arrays are not equal.");
        }
    }
}