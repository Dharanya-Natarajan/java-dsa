package loop;
import java.util.Scanner;
public class FactorOfNum {
    public static void main(String[] args) {
        //Find all factor of a given num
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter a num = ");
        int num = sc.nextInt();
        for(int i=1;i<=num;i++){
            if(num%i==0){
                System.out.println(i);
            }
        }
    }
}
