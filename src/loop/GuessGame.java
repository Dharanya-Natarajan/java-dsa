package loop;
import java.util.Scanner;
import java.util.Random;
public class GuessGame {
    public static void main(String[] args) {
        //Guess game
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter a num = ");
        Random rand = new Random();
        int SecretNum = rand.nextInt(10)+1;
        int num=0;
        while(num!=SecretNum){
            num = sc.nextInt();
            if(num==SecretNum){
                System.out.println("Yes you are right");
            }else if(num<SecretNum){
                System.out.println("Your num is lesser than the SecretNum");
            }else if(num>SecretNum){
                System.out.println("Your num is greater than the SecretNum");
            }else{
                System.out.println("Invalid, Please enter num again");
            }
            num++;
        }
    }
}
