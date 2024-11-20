import java.util.Scanner;

public class function {
    public static void printMyName(String name) {
        System.out.println(name);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userInput = sc.next();
        printMyName(userInput);
    }
}
