package ProblemPractice.Recursion;

import java.math.BigInteger;
import java.util.Scanner;

public class BigPower {
      
    public static BigInteger Bigpower( BigInteger a, int b){
        //  base case condition
        BigInteger result, finalResult;
       if (b == 1) 
       {        
          return a;
       } 
       else
       {
          result = Bigpower(a, b/2);
          finalResult = result.multiply(result);

          if (b%2 ==0)
        {
            return finalResult;   
          }
           else
        {
            return a.multiply(finalResult);
          }
       }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the value of a and b");      
        BigInteger a = sc.nextBigInteger();
        int b = sc.nextInt();
        
        sc.close();
        
        BigInteger result = Bigpower(a,b);
        System.out.println("The result of a number "+ a +" With the power of "+ b +" is = "+ result);
        

    }
}
