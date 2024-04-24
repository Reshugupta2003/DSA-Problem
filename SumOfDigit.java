package ProblemPractice.Recursion;
import java.util.Scanner;

public class SumOfDigit{

    public static int Sum(int n){
          
        int result =0;
        if (n <= 10) 
        {
            return n;
        } 
        else
        {
            int x = n%10;
            result = x + Sum(n/10);
        }
      return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int n = sc.nextInt();

        sc.close();
        int result = Sum(n);
        System.out.println("Indiviual Sum of each digit in Given Number "+ result);
    }
}