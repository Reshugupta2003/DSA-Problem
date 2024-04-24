package ProblemPractice.Recursion;
import java.util.Scanner;

public class SumOfNum {

    public static int DigitSum(int x){
        int result =0;
        int sum =0;
        if (x < 10)
        {
            return x;
        }
        else
        {
            sum = + x%10;
            result = sum + DigitSum(x/10);
        }
        return result;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int Number = sc.nextInt();
        sc.close();
        
        int result = DigitSum(Number);
        
         System.out.println("Digit sum of givennumber = "+result);
        
       
    }
}
