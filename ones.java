package ProblemPractice.Searching;
import java.util.Scanner;

public class ones {
    public static int Lower(int arr[], int target){
        int low = 0;
        int high = arr.length-1;
        int result1 = -1;

        while (low <= high) {
         int mid = low + (high -low)/2;
         
            if ( target == arr[mid]) {          
              result1 = mid;
              high = mid -1;
            }
            else if(arr[mid] < 1)
            {
                low = mid +1;
            } 
            else {   
               high = mid -1;
            }
        }
        return result1;
    }
    public static int Higher(int arr[], int target){
        int low = 0;
        int high = arr.length-1;
        int result2 = -1;
         
        while (low <= high) {
         int mid = low + (high -low)/2;
         
            if ( target == arr[mid]) {          
              result2 = mid;
              low = mid +1;
            }
            else if(arr[mid] < 1)
            {
                low = mid +1;
            } 
            else {   
               high = mid -1;
            }
        }
        return result2;
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
    System.out.println("Enter the target value to be count");
    int target = sc.nextInt();

    int result = Higher(arr,target) - Lower(arr, target) + 1;
     if (Higher(arr, target) == -1) {
        System.out.println(target+" is not in array ");
     }
    else{
        System.out.println(target+" is "+ result + " times occur in this array");
    }
  }
}
