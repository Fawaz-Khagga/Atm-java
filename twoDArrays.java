import java.util.*;

public class twoDArrays {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // System.out.println("hi");
        // 2D arrays are matrix of rows or coloums
        // int[] []matrix=new matrix[2,2];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st row then 2nd coloum\n");
        int row = sc.nextInt();
        int coloum = sc.nextInt();
        int[][] matrix = new int[row][coloum];
        // input
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < coloum; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        // output
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < coloum; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        // System.out.println();

    }

}