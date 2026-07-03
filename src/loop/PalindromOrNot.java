package loop;
import java.util.Scanner;
public class PalindromOrNot {
    public static void main(String[] args) {
        //Find if a number is palindrom or not
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter a num = ");
        int num = sc.nextInt();
        int original = num;
        int rev = 0;
        while(num>0){
            rev = rev * 10;
            rev = rev+(num%10);
            num = num/10;
        }
        System.out.println(rev);
        if(rev==original){
            System.out.println("Its a Palindrom");
        }else{
            System.out.println("Its not a Palindrom");
        }
    }
}
