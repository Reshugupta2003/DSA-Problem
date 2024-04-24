package ProblemPractice.BinaryNumber;
import java.util.*;

public class Check{
    public static int Convert(int n, int x, int result){
      
        int manish =0;
        if(n == 0)
        {
          return result;
        }
        else if(n%2 == 1)
        {           
            result = x + result; 
            x = x*10;        
            manish = Convert(n/2, x, result);
        }
        else
        {
            x = x*10;           
           manish = Convert(n/2, x, result);
        }
      
    return manish;
    }
    public static void main(String[] args) {
        
    Scanner sc =new Scanner(System.in);
     System.out.println("Enter a number");
     int n = sc.nextInt();
     
     sc.close();
    int a = Convert(n, 1, 0);
  
    if (a%2 == 0)
    {
        System.out.println("Given number is even");
    } 
    else if(a == 1)
    {
        System.out.println("1 is neither a even nor odd number");

    }
    else 
    {
        System.out.println("Given number is odd");
    }
    }
   
}