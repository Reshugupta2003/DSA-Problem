package ProblemPractice.BinaryNumber;

public class Duplicate {

    public static void CountOddDuplicate(int arr[])
    {
        int count =0;
        int x =0;
      for(int i =0; i<arr.length; i++){
        count = 0;
        for(int j =0; j< arr.length; j++){

             if(arr[i] == arr[j])
            {
                count++;
            }
            
        }
        if (count%2 == 0) 
        {          
            continue;
        } 
        else 
        {
            x = arr[i];    
        }
      }
      System.out.println("Number "+ x +" Comes odd times" );
    }
    public static void main(String[] args) {
        
        int arr[] = {4, 3, 6, 2, 6, 4, 2, 3, 4, 3, 3};

        CountOddDuplicate(arr);
       
    }
}