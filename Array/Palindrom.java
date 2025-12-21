package Array;
import java.util.Arrays;

public class Palindrom {

    public static String isPalindrom(char[] ch) {
        int st = 0;
        int end = ch.length - 1;

        while (st < end) {
            if (ch[st] != ch[end]) {
                return "Given character array is not palindrome";
            } else {
                st++;
                end--;
            }
        }
        return "Given character array is palindrome";
    }

    public static void main(String[] args) {
        char ch[] = {'M', 'A', 'D', 'A', 'M'};
        System.out.println(Arrays.toString(ch));
        System.out.println(isPalindrom(ch));
    }
}
