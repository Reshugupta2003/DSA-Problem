package ProblemPractice;
import java.util.Scanner;
                                        // This program to add even indices in array
public class AddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        System.out.println("Enter the array");
        for(int i = 0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        int sum =0;
       for(int i=0; i<n; i++){
        if(i%2==0){
         sum += arr[i];
        }
       } 
       System.out.println("sum of all the elements present on even indices: "+sum);
    }
}
