package ProblemPractice.BinaryNumber;
import java.util.Scanner;

public class DivisibleBy2 {

    public static int Check(int n, int p) {
        
        int result =0;
        // Base case , if n is a power of 2 then return 1
        if (n == p) {
            return 1 ;
        }
        
       else if (p > n) {
            return 0;
        }
        
        else{
                result =2*Check(n, p*2);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int p=1;
        int result =Check(n,p);
        sc.close();

        if(result == n){
            System.out.println(n+" is a power of 2");
        }
        else{
            System.out.println(n+" is not a power of 2");
        }
    }
}