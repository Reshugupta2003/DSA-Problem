package ProblemPractice.Recursion;

public class SumOfArray {

    public static int Sum(int arr[], int temp , int x)
    {
        int n = arr.length;
        
        if (temp == n -1) 
        {
            return arr[temp];
        } 
        else 
        {          
            x = arr[temp] + Sum(arr, temp +1 , x);                   
        }
        return x;
    }
    public static void main(String[] args) {
        
       int arr[] = {92, 23, 15, -20, 10};
       int result = Sum(arr, 0, 0);

       System.out.println("Sum of Array "+ result);
    }
}
