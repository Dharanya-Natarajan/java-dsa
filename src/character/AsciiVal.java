package character;
import java.lang.String;
import java.util.Scanner;

public class AsciiVal {
    public static void main(String[] args) {
        //Find the ascii vaule of a character
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().toCharArray()[0];
        int asciiVal = ch;
        System.out.println("Ascii value is: " + asciiVal);




    }
}
