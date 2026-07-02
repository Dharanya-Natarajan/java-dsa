package conditionalStatement;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {

        //Check whether the year is leap year or not

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an year = ");
        int year = sc.nextInt();

        if(year%4==0){
            System.out.println("Its an leap year");
        }else{
            System.out.println("Its not an leap year");
        }
    }
}
