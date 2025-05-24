//Write a program to find if a character is vowel or Consonant?
//vowel = a,e,i,o,u
import java.util.Scanner;
public class question4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the charecter");
        char ch =sc.next().charAt(0);
        if(ch >='a' && ch <='z'){
            //vowel
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                System.out.println(ch+"  Char is vowel");
            }else{
                 System.out.println(ch+" Char is Consonent");
            }
        }else{
                System.out.println("Invailed charecter");
        }
    }
}