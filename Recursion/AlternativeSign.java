package ProblemPractice.Recursion;
import java.util.Scanner;

public class AlternativeSign {

    public static int AlternativeSigns(int n)
    {
        int sum = 0;
       if (n == 0) 
       {
        return 0;
       } 
       else if(n%2 == 0) 
       {
         sum = AlternativeSigns(n -1) - n;
       }
       else
       {
         sum = AlternativeSigns(n -1) + n;
       }

      return sum;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int n = sc.nextInt();

        sc.close();
        int result = AlternativeSigns(n);
        System.out.println(result);
    }
}
