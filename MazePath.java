package ProblemPractice.Recursion;

public class MazePath {
    public static void PrintPath(int Maze,int horizontal, int vertical, String ans){

        if (horizontal == Maze && vertical == Maze) {
            System.out.println(ans);
            return;
        }
        if (horizontal < Maze) {
            PrintPath(Maze ,horizontal + 1, vertical, ans + 'H');
        }
        if (vertical < Maze) {
            PrintPath(Maze, horizontal, vertical + 1, ans + 'V');
        }
    }
    public static void main(String[] args) {
        PrintPath(1,0, 0, " ");
    }
}
