//Given an array of integers, write a program to find the average of all elements.
public class question2{
    public static void main(String[] args) {
        int arr[]={1,3,5};
        int sum=0;
         if(arr.length==0){
                System.out.println("Empty array");
                return;
            }
        for(int i=0; i<arr.length;i++){
            sum+=arr[i];
        }
        double avg = (double)sum/arr.length;
        System.out.println("Avg is:"+avg);
    }
}