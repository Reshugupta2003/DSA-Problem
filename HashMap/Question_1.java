package ProblemPractice.HashMap;

import java.util.*;

public class Question_1 {
    public static void main(String[] args) {
        
        TreeMap<Integer, String> tm = new TreeMap<>();
       
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter the number of key-value pair");
       int n = sc.nextInt();
 
       System.out.println("Enter trhe key value pairs");

       //take a input of key-value pair
       for(int i=0; i< n; i++){
        int key = sc.nextInt();
        String value = sc.next();

        tm.put(key, value);
       }
        System.out.println("The map is = "+ tm);
        sc.close();

    }
}