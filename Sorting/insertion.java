package ProblemPractice.Sorting;
import java.util.Arrays;
import java.util.Scanner;

public class insertion{
    
    public static void InsertionSort(int[] arr, int n){

        for(int i=1; i<n; i++){
            int j =i;
            while (j>0 && arr[j]>arr[j-1]) {
                
                int temp =arr[i];
                arr[i] = arr[i-1];
                arr[i-1] = temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        sc.close();
    
        int arr[] = new int[n];
        System.out.println("Enter the array");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        InsertionSort(arr,n);
        System.out.println(Arrays.toString(arr));
    }
}