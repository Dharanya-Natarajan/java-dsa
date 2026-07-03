package loop;
import java.util.Scanner;
public class FactorialOfNum {
    public static void main(String[] args) {
        //Find factorial of a number
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter a num = ");
        int num = sc.nextInt();
        int product = 1;
        for(int i=1;i<=num;i++){
            product  *= i;
        }
        System.out.println(product);
    }
}
