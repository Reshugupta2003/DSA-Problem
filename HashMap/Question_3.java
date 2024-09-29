package ProblemPractice.HashMap;

import java.util.*;

public class Question_3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the element of array");
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int Float = -1;

        for(int i =0; i<n; i++){
            if(map.containsKey(arr[i])){
                Float = 1;
                System.out.println("Yes");
                break;
            }
            else{
                map.put(arr[i], 1);
            }
        }

       if(Float == -1){
        System.out.println("No");
       } 
       sc.close();
    }
}
