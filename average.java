import java.util.*;

public class average {

    public static int averageNmber(int a, int b, int c) {

        int averageNmber = a + b + c / 3;
        // int T = averageNmber / 3;
        return averageNmber;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value 1 ");
        int a = sc.nextInt();
        System.out.println("enter the 2nd value");
        int b = sc.nextInt();
        System.out.println("enter the 3rd value");
        int c = sc.nextInt();
        System.out.println("your answer is " + averageNmber(a, b, c));

    }

}
