package loop;
import java.util.Scanner;
public class FindPower {
    public static void main(String[] args) {
        //power(a,b)
        Scanner sc = new Scanner(System.in);
        int base,exponent;
        System.out.print("Enter base value = ");
        base = sc.nextInt();
        System.out.print("Enter exponent value = ");
        exponent = sc.nextInt();
        int ans = 1;
        for(int i=1; i<=exponent; i++){
            ans = ans*base;
        }
        System.out.println(ans);

    }
}
