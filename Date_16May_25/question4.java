//Write a program to check a person is able to vote or not
import java.util.Scanner;
public class question4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a age: ");
        int num = sc.nextInt();
       if(num >=18){
        System.out.println("elligible person for vote");
       }else{
            System.out.println("Not elligible person for vote");
       }
    }
}