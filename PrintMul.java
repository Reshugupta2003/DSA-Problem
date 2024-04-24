package ProblemPractice.Recursion;

public class PrintMul{
    public static void printMultiple(int n, int k){
        if (k == 1) {
            System.out.println(k);
            return;
        }
        printMultiple(n, k-1);
        System.out.print(n*k +", ");
    }
  public static void main(String[] args) {
    
    printMultiple(24,5);
  }
}