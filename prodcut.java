import java.util.*;

public class prodcut {

    public static int calculaterProduct(int a, int b) {

        return a * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("product of 2 numbers" + calculaterProduct(a, b));
    }

}
