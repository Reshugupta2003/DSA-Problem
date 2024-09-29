package ProblemPractice.HashMap;

import java.util.*;

public class Question_4 {
    public static void main(String[] args) {
        
        TreeMap<Integer, Integer> tm = new TreeMap<>();
       
        Scanner sc = new Scanner(System.in);
 
        System.out.println("Enter the Size of array");
        int n = sc.nextInt();

        int arr[] = new int[n];
  
        System.out.println("Enter the Array element");
        for(int i=0; i< n; i++){          
            arr[i] = sc.nextInt();
      
        }
        for(int i =0; i<n; i++){
            tm.put(arr[i], i);
        }
        System.out.println(tm);
        System.out.println(tm.lastEntry().getKey());      
        sc.close();
    }
}
