//How do you shift all elements in an array by a certain number of positions?
public class question4{
    public static void main(String[] args) {
        int arr[] ={2,4,3,6,5,5,2};
        int last=arr[arr.length-1];
        for(int  i=arr.length-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=last;
        System.out.println("Shifted array:");
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}