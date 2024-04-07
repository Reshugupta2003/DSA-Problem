package ProblemPractice.Searching;

import java.util.Scanner;

public class Linear {
  public static void main(String[] args) {  
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the size of array");
    int size = sc.nextInt();
    
    int arr[] = new int[size];

    System.out.println("Enter the array");
    for(int i =0; i <size; i++){
        arr[i] = sc.nextInt();
    }
   System.out.println("Enter the Search element in array");
   int x = sc.nextInt();
    boolean flag = false;
   for(int ele: arr){
    if(x == ele){
        System.out.println("Index of Your Searching element = "+ele);
        flag = true;
      }
   }
   
    if(flag == false) {
        System.out.println("Your Searched element not in array");
     }
   
  }
}
