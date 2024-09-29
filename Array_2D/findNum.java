package ProblemPractice.Array_2D;

import java.util.Scanner;

public class findNum {
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
        int positive =0, zero =0, negative =0, odd =0, even=0;
        for(int i=0; i<m; i++){
            for(int j=0; j<arr[i].length; j++){
                if (arr[i][j] == 0){
                    zero++;
            }
            if (arr[i][j]>0) {
                positive++;
            }
            if (arr[i][j]<0) {
                negative++;
            }
            if (arr[i][j]%2==0) {
                even++;
            }
            if (arr[i][j]%2==1 || arr[i][j]%2 == -1) {
                odd++;
            }
          }      
        }
        System.out.println("number of positive numbers= "+positive);
        System.out.println("number of negative numbers= "+negative);
        System.out.println("number of odd numbers= "+odd);
        System.out.println("number of even numbers= "+even);
        System.out.println("number of zero numbers= "+zero);
    }
}
