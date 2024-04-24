package ProblemPractice.Recursion;

public class Max{
   public static int MaxValue(int arr[], int x1, int x0)
   {
    int result = 0;
      int n = arr.length;
       if(x1 == n-1)
       {
        int temp1 = arr[x0];
        int temp0 = arr[x1];
        if(temp1 > temp0)
        {
           result = temp1;
        }
      }
      else
      {
  
        int temp1 = arr[x0];
        int temp0 = arr[x1];
        if(temp1 > temp0)
        {
           result = temp1;
        }

        result = MaxValue(arr, x1+1,x0+1);
      }
      return result;
   }

    public static void main(String[] args) {

       int arr[] = {13, 1, -3, 22, 5};

       int result = MaxValue(arr , 1, 0);
       System.out.println(result);
    }
}
