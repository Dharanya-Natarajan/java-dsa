package conditionalStatement;
import java.util.Scanner;
public class NumCheck {
    public static void main(String[] args) {

        //Check whether the number is within a specific range

        Scanner sc = new Scanner(System.in);
        System.out.println("Low range = ");
        int low = sc.nextInt();
        System.out.println("High range = ");
        int high = sc.nextInt();
        System.out.println("Enter a num = ");
        int num = sc.nextInt();

        if(low <= num && num<=high){
            System.out.println("Num is in range");
        }else{
            System.out.println("Num is not in range");
        }

    }
}
