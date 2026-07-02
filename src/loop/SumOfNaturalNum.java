package loop;
import java.util.Scanner;
public class SumOfNaturalNum {
    public static void main(String[] args) {

        //Sum of first N natural Numbers

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a N = ");
        int n = sc.nextInt();
        int sum = 0;

        for(int i=0;i<=n;i++){
            sum += i;
        }
        System.out.println(sum);


    }
}
