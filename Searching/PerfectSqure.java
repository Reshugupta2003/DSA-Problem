package ProblemPractice.Searching;
import java.util.Scanner;
                      //   THis program is to find the given is perfect square or not.
public class PerfectSqure {
    public static int SquareRoot(int arr[] , int target){
        int result =0;
        int low =0;
        int high = arr.length -1;
        
        while (low <= high) 
        {
          int mid = low + (high - low)/2;
             int x = mid*mid;
          if (x == target) {
            result = mid;
            return mid;
          } 
          else if(x > target){
              high = mid -1;
          }
          else {
            low = mid +1;    
          }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the target value");
        int target = sc.nextInt();

        int []arr = new int[target/2];
        
        if (target == 1) {
            System.out.println("Square root of 1 is = 1");
        }
        else if(target == 4){
            System.out.println("Square root of 4 is = 2");
        }
        else {
            int result = SquareRoot(arr, target);
            if (result == 0) {
                System.out.println(target +" is not a perfect square");
            } else {
                System.out.println("Square root of "+ target + " is = "+ result);
            }
        }
       
       
    }
}
