import java.util.*;

public class array {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // array is used to store data in your own
        int[] marks = new int[4];
        marks[0] = 55;
        marks[1] = 56;
        marks[2] = 57;
        marks[3] = 58;
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);

        // another method for storing number in array
        int A[] = { 222, 44, 55 };
        System.out.println(A[1]);
        for (int i = 0; i < 3; i++) {
            System.out.println(A[i]);
        }
        // asking user for array size..
        System.out.println("***please enter size number\n");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int number[] = new int[size];
        // for input loop
        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
        }
        // loop for output
        for (int i = 0; i < size; i++) {
            System.out.println(number[i]);
        }
        // take array from user and search the x index and print it
        System.out.println("question no one \n");
        System.out.println("***please enter size number\n");
        // Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int p[] = new int[s];
        System.out.println("enter the value you want to search\n");
        int value = sc.nextInt();

        // for input loop
        for (int i = 0; i < s; i++) {
            p[i] = sc.nextInt();
        }
        // loop for output we can also use size.lenthg hihih

        for (int i = 0; i < s; i++) {

            if (p[i] == value)

            {
                System.out.println("your number is found at index : " + i);
            }
        }

    }

}
