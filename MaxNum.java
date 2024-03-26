package ProblemPractice.Array;
import java.util.Scanner;
                   //      This is to find the maxium number in array
public class MaxNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        System.out.println("Enter the array");
        for(int i = 0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        int x=0;
        for(int i =0; i<n; i++){
            if (x<arr[i]) {                                     
                x = arr[i];
            }
        }
        System.out.println(" maximum element in the array: "+x);
    }
}
