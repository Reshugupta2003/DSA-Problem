package ProblemPractice.Searching;
import java.util.Scanner;

public class lastDig {

    public static int LastDigIndex(int arr[], int n){
        int low = 0;
        int high = arr.length-1;
        int result = -1;
        while (low <= high) {
         int mid = low + (high -low)/2;
          
            if (n == arr[mid]) {
                low = mid +1;
                result= mid;
            }
            else if(arr[mid] < n)
            {
                low = mid +1;
            } 
            else {   
               high = mid -1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the size of array");
    int size = sc.nextInt(); 
    int arr[] = new int[size];

    System.out.println("Enter the array");
    for(int i =0; i <size; i++){
        arr[i] = sc.nextInt();
    }
   System.out.println("Enter the Search element in array");
   int x = sc.nextInt();
    
    int result = LastDigIndex(arr,x);
     if (result == -1) {
        System.out.println("Searched element is not in array");
     }
      else {
        System.out.println("Last Occurance of searching element: "+ result);
     }  

    }
}
