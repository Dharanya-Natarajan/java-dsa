package character;
import java.lang.String;
import java.util.Scanner;
public class ToggleCase {
    public static void main(String[] args) {
        //Toggle the casee of each character
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Alphabetic letter: ");
        char ch = sc.next().charAt(0);
        if(ch>='a' && ch<='z'){
            ch -= 32;
            System.out.println("Now the toggled letter is: " + ch);
        }else if(ch>='A' && ch<='A'){
            ch += 32;
            System.out.println("Now the toggled letter is: " + ch);
        }else
            System.out.println(ch);

    }
}
