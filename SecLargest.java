package ProblemPractice.Array;
import java.util.Scanner;
//                                This program is to find second largest element
public class SecLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        System.out.println("Enter the array");
        for(int i = 0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        int first=0;
        int second =0;
        for(int i=0; i<n; i++){
              if(arr[i]>first) {
                second= first;
                first= arr[i];
               //           check on this --    4,3,6,7,1     
               //                               output- 6
              }             
        }
        System.out.println(" second largest element in array:"+second);
    }
}
