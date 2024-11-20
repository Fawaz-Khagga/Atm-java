import java.util.*;

public class stringBulider {
    /**
     * @param args
     */
    public static void main(String[] args) {

        // today we study ABOUT string builder
        // contex
        StringBuilder sb = new StringBuilder("fawaz khagga");
        System.out.println(sb);
        // for checking lenght
        System.out.println(sb.length());
        // for add some sentance we use sb.append
        sb.append(" sahab");
        System.out.println(sb);
        // for character location finding process of string.
        System.out.println(sb.charAt(0));
        // for changing sentence in string we can use by sb.charAt(2,'p')first location
        // number 2nd changing alphabate
        sb.setCharAt(4, 'd');
        System.out.println(sb);
        // for insertaion adding something by changing sb.insert (0,'p')
        sb.insert(0, 't');
        System.out.println(sb);
        // for delete we use sb.delete(0,1)
        sb.delete(0, 6);
        System.out.println(sb);
        // for print oppsite name we use
        for (int i = 0; i < sb.length() / 2; i++) {
            int front = i;
            int back = sb.length() - i - 1;
            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);
            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);
    }
}
