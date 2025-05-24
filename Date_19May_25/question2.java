//Write a program to count even numbers from an array
public class question2{
    public static void main(String[] args) {
        int[] numbers = {2, 3, 4, 5, 6, 7, 8, 9};
        int count = 0;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]%2==0){
                count ++;
            }
        }
        System.out.println("Count Even number is: "+count);
    }
}