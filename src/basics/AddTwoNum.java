package basics;
import java.util.Scanner;
public class AddTwoNum {
    public static void main(String[] args){
        int num1, num2, res;
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        res = num1 + num2;
        System.out.println(res);

    }
}
