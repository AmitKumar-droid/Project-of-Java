package Array;
import java.util.Arrays;

public class OccurrenceUsingSort {

    public static void main(String[] args) {

        int[] a = {10, 20, 10, 30, 20, 10};
        Arrays.sort(a);

        int count = 1;

        for (int i = 0; i < a.length - 1; i++) {

            if (a[i] == a[i + 1]) {
                count++;
            } else {
                System.out.println(a[i] + " occurs " + count + " times");
                count = 1;
            }
        }

        System.out.println(a[a.length - 1] + " occurs " + count + " times");
    }
}
