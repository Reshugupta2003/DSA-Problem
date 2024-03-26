package ProblemPractice;
import java.util.Scanner;
                          // This progrsm is to print even indices using for each loop
public class PrintEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        System.out.println("Enter the array");
        for(int i = 0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        System.out.print(" print all even elements: ");
        
        for(int ele: arr){
            if(ele%2 == 0){
                System.out.println(ele);
            }
        }
    }
}
