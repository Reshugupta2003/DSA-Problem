package ProblemPractice.Recursion;
import java.util.Scanner;

public class Searching {
    
    public static int FindIndex(int arr[], int n, int target ){
        //  base case condition
        int i =0;
       if (target == arr[i]) 
       {        
          System.out.println(i);
          return i;
       } 
       else
       {
        if (n>=0)
        {
            FindIndex(arr, n-1, target);
            i++;
        }      
       }
       return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        System.out.println("Enter the target number");
        int x = sc.nextInt();
        sc.close();
        
        int result = FindIndex(arr, n, x);
        System.out.println("Factorial of X is: "+result);
    }
}
