package ProblemPractice.BinaryNumber;

// public class printBinary {
    
//     public static void Convert(int n){
//         int x =1;
//         int y = 2;
//         int size =1;
//        for(int i =0; i< n/2; i++){     
//           x = x*2;
//           y = y*2;       
//           size++;
//           if(n< y)
//           {
//             System.out.println(size);
//             break;
//           }
//        }
//        int arr[] = new int[size];
//        for(int i =size-1; i>=0; i--)
//        {
//          if (n%2 == 1) 
//          {
//             arr[i] = 1;
//             n = n/2;
//          }
//          else{
//             arr[i] = 0;
//             n = n/2;
//          }
//        }
//        System.out.println(Arrays.toString(arr));
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         //System.out.println("Enter the a number");
//         int n = 63;
//         Convert(n);
//     }
// }

// Other Solution

/*
 * public class binary {
    
    public static void Convert(int n){
      int x =1;
      int Binary =0;
      int size = n/2;
      for(int i=0; n != 0; i++){
       
     if(n%2 ==1)
     {
        Binary = x + Binary;
        x= x*10;
        n = n/2;
     }
     else
     {
         x =x*10;
         n = n/2;
     }
    }
    System.out.println(Binary);
}
    public static void main(String[] args) {
  
        //System.out.println("Enter the a number");
        int n = 95;
        Convert(n);
    }
}
 */

public class printBinary{   

    public static int Convert(int n, int size){
       
        int count =0;
        int x =1;
        int Binary =0;
        
        if (count == size) {
            return x;
        }
        else{
            count++;
            if (n%2 ==1) {

                Binary = Binary + x;
                Convert(n/2, size);
            }
            else{
                  n = n/2;
                  x = 10*x;
                  Convert(n/2, size);
            }
        }
        return Binary;
    }      
public static void main(String[] args) {
    
    System.out.println("Enter the a number");
        int n = 8;

    int x =1;
    int y = 2;
    int size =1;
   for(int i =0; i< n/2; i++){     
      x = x*2;
      y = y*2;       
      size++;
      if(n< y)
      {
        System.out.println(size);
        break;
      }
    
      int result =  Convert(n,size);
      System.out.println(result);
   }
 }
}