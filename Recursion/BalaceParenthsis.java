package ProblemPractice.Recursion;

public class BalaceParenthsis {

    public static void printBal( int n , int oc , int cc, String ans){

        if (n == cc && n == oc)
        {
            System.out.println(ans);
            return;
        } 
        if (n > oc)
        {
            printBal(n, oc+1 , cc, ans + '(');
        }
        if (cc < oc)
        {
          printBal(n, oc,cc +1, ans + ')');  
        }
    }
    public static void main(String[] args) {
        printBal(3, 0, 0, " ");
    }
}
