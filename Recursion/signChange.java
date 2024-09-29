package ProblemPractice.Recursion;
import java.util.*;

class signChange {

    public static int SignChange(int n){
        int result = 0;

        if (n == 0) 
        { 
            return 0;
        } 
        else if(n%2 == 0) 
        {        
           result =  SignChange(n - 1) + n;
        }
        else                                                 // For even num =  n - (n-1) + (n-2)...... -1
        {
          result = SignChange(n - 1) - n;
        }
        return result;
    }
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the value of X");
      int x = sc.nextInt(); 
      sc.close();
               
      int result = SignChange(x);  

      System.out.println("Sum of Alternative Series: " + result);
    }
}
