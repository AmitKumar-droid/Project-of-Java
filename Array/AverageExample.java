package Array;
public class AverageExample {

    public static double average(int[] a) {

        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }

        return (double) sum / a.length;   // type casting
    }

    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50};
        System.out.println("Average = " + average(a));
    }
}
