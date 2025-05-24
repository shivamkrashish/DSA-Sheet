//Write a program to remove duplicates from an array
public class question3{
    public static void main(String[] args) {
        int arr []={2,3,4,7,5,5,7,3,2};
        System.out.print("After removing duplicates:");
        for(int i=0;i<arr.length;i++){
            boolean isduplicate = false;
            for(int j=0; j<i;j++){
                if(arr[i]==arr[j]){
                    isduplicate =true;
                }
            }
            if(!isduplicate){
                System.out.print(arr[i]+" ");
            }
        }
    }
}