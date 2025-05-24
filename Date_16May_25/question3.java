//Write a programe to print table of any given number 
import java.util.Scanner;
public class question3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int table;
       for(int i=1;i<=10;i++){
        table=num*i;
        System.out.println(table);
       }
    }
}
