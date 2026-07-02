package conditionalStatement;
import java.util.Scanner;
public class GreaterNum {
    public static void main(String[] args) {

        // Find greatest of three numbers

        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;
        System.out.print("Enter num1 = ");
        num1 = sc.nextInt();
        System.out.print("Enter num2 = ");
        num2 = sc.nextInt();
        System.out.print("Enter num3 = ");
        num3 = sc.nextInt();

        if(num1>=num2 && num1>=num3){
            System.out.println("Num1 is Greater");
        }else if(num2>=num1 && num2>=num3){
            System.out.println("Num2 is Greater");
        }else{
            System.out.println("Num3 is Greater");
        }



    }
}
