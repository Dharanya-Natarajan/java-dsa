package basics;
import java.util.Scanner;
public class SwapTwoNum {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a = ");
        a = sc.nextInt();
        System.out.print("Enter b = ");
        b = sc.nextInt();
        c=b;
        b=a;
        a=c;
        System.out.println("Now a = " + a  + "\nNow b = " + b);
    }
}
