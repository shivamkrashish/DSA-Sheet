//Write a program to find minimum from an array
public class question4{
    public static void main(String[] args) {
        int[] numbers = {3,2,3,4,5,6,7,8,9};
        int min = numbers[0];
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]<min){
                min = numbers[i];
            }
        }
        System.out.println("Minimum no is:"+min);
    }
}