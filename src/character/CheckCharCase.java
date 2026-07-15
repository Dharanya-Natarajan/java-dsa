package character;
import java.util.Scanner;
public class CheckCharCase {
    public static void main(String[] args) {
        //Check whether character is lower case or upper case
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a alphabetic letter: ");
        char ch = sc.next().charAt(0);
        if ('A' <= ch && ch <= 'Z') {
            System.out.println("The letter is in upper case!");
        } else if ('a' <= ch && ch <= 'z') {
            System.out.println("The letter is in lower case!");
        } else
            System.out.println("It is not an alphabet");

    }
}
