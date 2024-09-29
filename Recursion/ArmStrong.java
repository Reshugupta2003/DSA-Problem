package ProblemPractice.Recursion;
import java.util.Scanner;

public class ArmStrong {

   public static int Check(int n)
   {
      int result =0;
      if (n <= 0)
      {
         return n;
      } 
      else 
      {
        int x = n%10;
        int y = x*x*x;
         result = y + Check(n/10);
      }

     return result;
   }
   public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

      System.out.println("Enter the number");
      int n = sc.nextInt();
      sc.close();

     int result= Check(n);
     if(n == result){
     System.out.println(n +" is a armstrong number");
     }
     else{
     System.out.println(n +" is not a armstrong number");
     }
   } 
}