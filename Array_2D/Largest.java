package ProblemPractice.Array_2D;
import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row of matrix");
        int m = sc.nextInt();
        System.out.println("Enter the column of matrix");
        int n = sc.nextInt();
        int arr[][] = new int[m][n];
        System.out.println("Enter Matrix element");
        for(int i=0; i<m; i++){     
            for(int j =0; j<n; j++){
                arr[i][j] = sc.nextInt();               
            }
        }
        int LargestNum =0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++)
            {
                if (arr[i][j]>LargestNum) 
                {
                    LargestNum = arr[i][j];
                }
            }
        }
        System.out.println(" Largest element of 2D array = "+ LargestNum);
    }
}
