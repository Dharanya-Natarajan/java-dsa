package loop;
import java.util.Scanner;
public class ReverseNUm {
    public static void main(String[] args) {
        //Reverse a Number
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter a num = ");
        int num = sc.nextInt();
        int rev = 0;
        while(num>0){
            rev = rev * 10;
            rev = rev+(num%10);
            num = num/10;
        }
        System.out.print(rev);
    }
}
