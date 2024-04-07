package ProblemPractice.Searching;
import java.util.Scanner;

public class BinaryRecur {

    public static int BinarySearchRecur(int arr[], int low, int high, int target){
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low)/2;
            if (arr[mid] == target) 
            {
                return mid;
            }
            else if (arr[mid] < target)
            {
                return BinarySearchRecur(arr, mid+1, high, target);
            }
             else 
            { 
                return BinarySearchRecur(arr, low, mid-1, target);
            }
        }
        return result;
    }
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target value");
        int x = sc.nextInt();
        int result = BinarySearchRecur(arr, 0, arr.length-1, x);
        if (result == -1) {
            System.out.println("Target element are not present");
        }
        else 
        {
            System.out.println("Index of Searching number = "+result);
        }
       
    }
}
