package loop;
import java.util.Scanner;
public class PrimeNum {
    public static void main(String[] args) {
        //Prime number or not
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter a num = ");
        int num = sc.nextInt();
        int count=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count += 1;
            }
        }if(count==2){
            System.out.println("Its prime");
        }else{
            System.out.println("Not prime");
        }
    }
}
