package ProblemPractice.Array_2D;
import java.util.Scanner;
public class diagonal {
    public static void main(String[] args) {
        
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row and column of matrix");
        int m = sc.nextInt();
        int arr[][] = new int[m][m];
        System.out.println("Enter Matrix element");
        for(int i=0; i<m; i++){     
            for(int j =0; j<m; j++){
                arr[i][j] = sc.nextInt();               
            }
        }
        System.out.println(" elements of both the diagonals of square matrix: ");
        for(int i=0; i<m; i++){
            for(int j=0; j<m; j++)
            {
                if(i==j || i+j==m-1)
                {
                 System.out.print(arr[i][j]+", ");           
                }
            }
        }
        System.out.println();
    }     
}
