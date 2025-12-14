import java.util.Arrays;

public class MergeArrays {

    public static int[] merge(int[] a, int[] b) {

        int[] c = new int[a.length + b.length];
        int k = 0;

        for (int i = 0; i < a.length; i++) {
            c[k++] = a[i];
        }

        for (int j = 0; j < b.length; j++) {
            c[k++] = b[j];
        }

        return c;
    }

    public static void main(String[] args) {
        int[] a = {10, 20, 30};
        int[] b = {40, 50, 60};

        System.out.println(Arrays.toString(merge(a, b)));
    }
}
