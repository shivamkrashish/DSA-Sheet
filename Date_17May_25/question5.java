// Write a program to make such a pattern like a pyramid with a number that repeats in the same row.
//      1
//     2 2
//    3 3 3
//   4 4 4 4
public  class question5{
    public static void main(String[] args) {
        int num = 4;
        for(int i =1; i<= num;i++){
            for(int k=1;k<=num-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println(" ");
        }
    }
}