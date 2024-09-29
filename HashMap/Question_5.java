package ProblemPractice.HashMap;

import java.util.*;

public class Question_5 {

    public static HashMap<Character,Integer> CreateHashMap(String str1, HashMap<Character,Integer> x){
    
        for(int i =0; i<str1.length(); i++){
            if(x.containsKey(str1.charAt(i))){
                x.put(str1.charAt(i), x.get(str1.charAt(i)) + 1);
            }
            else{
                x.put(str1.charAt(i), 1);
            }
           
        }
        return x;
    }

    public static boolean Construct(HashMap<Character,Integer> ran, HashMap<Character,Integer> mag, String rans){

        int n = rans.length();
        
        for(int i =0; i < n; i++){
            if(mag.containsKey(rans.charAt(i))){
                
                if( mag.get(rans.charAt(i)) < ran.get(rans.charAt(i))){
                     return false;
                }
            }
            else{
                return false;
              }
        }
        return true;
    }
    public static void main(String[] args) {

        HashMap<Character, Integer> ransom = new HashMap<>();
        HashMap<Character, Integer> maganize = new HashMap<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String of ransomNote");
        String str1 = sc.next();
        
        System.out.println("Enter the String of maganize");
        String str2 = sc.next();
             
        HashMap<Character,Integer> ran =   CreateHashMap(str1, ransom); 
        HashMap<Character,Integer> mag = CreateHashMap(str2, maganize);

        boolean result = Construct(ran, mag, str1);

        if(result == true){
            System.out.println("We construct ransomNote using magazine");
        }
        else{
            System.out.println("We can not construct ransomNote using magazine");
        }
       sc.close();
    }
}
