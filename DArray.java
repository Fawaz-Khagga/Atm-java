import java.util.Scanner;

public class DArray {
    public static void main(String[] args) {

        // System.out.println("J");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] number = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                number[i][j] = sc.nextInt();
            }
        }
        int x = sc.nextInt();
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (number[i][j] == x) {
                    System.out.println("loacation found at index : " + i + "," + j);
                }
            }
        }
    }
}
