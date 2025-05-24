//Write a program to count odd numbers in an array.
public class question5{
    public static void main(String[] args) {
        int[] numbers = {3,2,3,4,5,6,7,8,9};
        int count = 0;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]%2==1){
                count++;
            }
        }
        System.out.println("Count of odd number is: "+count);
    }
}