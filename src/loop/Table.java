package loop;
import java.util.Scanner;
public class Table {
    public static void main(String[] args) {
        //Print a multiplication table for a given number
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num = ");
        int num = sc.nextInt();


        for(int i=1; i<=10; i++){
            System.out.println(num + " * " + i + " = " + num*i);
        }
    }

}