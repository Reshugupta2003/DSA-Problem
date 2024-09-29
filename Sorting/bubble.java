package ProblemPractice.Sorting; 
import java.util.Arrays;
import java.util.Scanner;
                     
public class bubble {
    public static void bubbleSort(int arr[], int size)
    {
        int count =0;
      for(int i =0; i<size; i++){
        // j< size -1 -i , use 1 and i to avoid indexbound error
        for(int j =0; j<size-i-1; j++){

            //Swapping
            if (arr[j] < arr[j+1]) 
            {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                
                count++;
            }
        }              // This is a  program to print array in decreasing order using bubble sort
      }                // And counting , how many number are switch for sorting
      System.out.println(Arrays.toString(arr));
      System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        sc.close();
        
        int arr[] = new int[n];
        System.out.println("Enter the array");
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        bubbleSort(arr,n);
    }
}
