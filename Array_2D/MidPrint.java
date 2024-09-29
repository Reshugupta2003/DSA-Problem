package ProblemPractice.Array_2D;
import java.util.Scanner;

public class MidPrint {
 public static void main(String[] args) {
        
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row and column of matrix and it must odd");
        int m =sc.nextInt();
        int a =0;
        do {       
            if(m%2 ==0){
            System.out.println("Please input odd digit");
            int m1 = sc.nextInt();
            m = m1;
              a--;
            }
            a++;
        }while(a==0);        

        int arr[][] = new int[m][m];
        System.out.println("Enter Matrix element");
        for(int i=0; i<m; i++){     
            for(int j =0; j<m; j++){
                arr[i][j] = sc.nextInt();               
            }
        }
        int MidInx =(m-1)/2;
        System.out.println("Elements of middle row and the elements of middle column: ");
        for(int i=0; i<m; i++){
            for(int j=0; j<m; j++)
            {
                if(j == MidInx)
                {
                 System.out.print(arr[i][j]+", ");           
                }             
            }
        }
        for(int j=0; j<m; j++){
            if ( MidInx != j) {
                System.out.print(arr[MidInx][j]+", ");
            }         
        }    
        System.out.println();
    } 
}
