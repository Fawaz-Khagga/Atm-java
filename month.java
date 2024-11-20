import java.util.Scanner;
//first programme

public class month {
    public static void main(String[] args) {
        System.out.println("***welcome to our month programme***");
        System.out.println("plz enter the number of month");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int button = x;
        switch (x) {
            case 1:
                System.out.println("January");

                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("july");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println(
                        "bhosri ka tujh pata nahi 12 mahina hota ha total");
                break;
        }
    }
}
