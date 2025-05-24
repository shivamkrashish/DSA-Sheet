//Write a program to calculate sum of even number in an array
public class question3{
    public static void main(String[] args) {
        int[] numbers = {3,2,3,4,5,6,7,8,9};
        int sum = 0;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]%2==0){
                sum+=numbers[i];
            }
        }
        System.out.println("Sum of Even number is: "+sum);
    }
}