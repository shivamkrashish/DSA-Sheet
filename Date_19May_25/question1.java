//Write a program to find maximum in an array.
public class question1{
    public static void main(String[] args) {
        int arr[]={2,3,4,6,9,3,5};
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("maximum is:"+max);
    }
}