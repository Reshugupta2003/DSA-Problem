package ProblemPractice.BinaryNumber;
public class set{

    // Function to count the number of set bits (1s) in an integer
    public static int countSetBits(int n) {
        int count = 0;
        
        while (n > 0) {
            n = n & (n - 1); // Clears the least significant set bit
            System.out.print(n+" ");
            count++;
        }
        
        return count;
    }

    public static void main(String[] args) {
        int number = 15; // Example number
        
        // Count set bits in the number
        int numberOfSetBits = countSetBits(number);
        
        System.out.println("Number of set bits in " + number + " = " + numberOfSetBits);
    }
}
