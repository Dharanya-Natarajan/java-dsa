package arrays;
import java.util.Scanner;
public class SearchElement {
    public static void main(String[] args) {
        //Search a element in an array;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an array elements: ");
        int arrSize = scan.nextInt();
        System.out.println("Enter an targeted element: ");
        int target = scan.nextInt();
        int[] arr = new int[arrSize];
        for(int i=0;i<arr.length;i++){
            arr[i]=scan.nextInt();
        }
        boolean isPresent = false;
        for(int i=0; i<arrSize; i++){
            if(arr[i] == target){
                System.out.println("The targeted element is present in an array");
                isPresent = true;
                break;
            }
        }if(isPresent != true){
            System.out.println("The targeted element is not present in an array");
        }
    }
}
