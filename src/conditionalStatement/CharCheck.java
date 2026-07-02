package conditionalStatement;
import java.util.Scanner;
public class CharCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a char = ");
        char ch = sc.next().charAt(0);

        //Check if a character is alphabet, digit or special characters

        if(('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')){
            System.out.println("Its an Alphabet");
        }else if('0'<=ch && ch<='9' ){
            System.out.println("Its an Digit");
        }else{
            System.out.println("Its an Special Character");
        }
    }
}
