
// Your First Program
import java.util.Scanner;

class HelloWorld {
    private static final int Button = 0;

    public static void main(String[] args) {
        // input
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        int subtraction = a - b;
        int mul = a * b;
        int divide = a % b;
        int Button = sc.nextInt();
        switch (Button) {
            case 1:
                System.out.println(sum);

                break;
            case 2:
                System.out.println(subtraction);
                break;
            case 3:
                System.out.println(mul);
                break;
            case 4:
                System.out.println(divide);
                break;
            default:
                System.out.println("invalid value");
                break;
        }

    }
}