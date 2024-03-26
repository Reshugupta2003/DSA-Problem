package ProblemPractice.Sorting;
import java.util.Arrays;
import java.util.Scanner;
public class Selection {

    public static void selectionSort(int arr[], int size){
         for(int i=0; i<size-1; i++){
            int mindex = i;
            for(int j=i+1; j<size; j++){
               if (arr[mindex] < arr[j]) {
                   
                  mindex =j;
               }
            }
            if (i != mindex) 
            {
                int temp = arr[i];
                arr[i] = arr[mindex];
                arr[mindex] = temp;
            }
         }
         System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter the size of array");
       int size = sc.nextInt();
        
       int arr[] = new int[size];
       System.out.println("Enter the array");

       for(int i=0; i<size; i++){
        arr[i] = sc.nextInt();
       }
     
        selectionSort(arr, size);
    }
}
