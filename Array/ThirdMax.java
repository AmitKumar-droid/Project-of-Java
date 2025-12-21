package Array;
public class ThirdMax {

    public static int thirdMax(int[] a) {

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {

            if (a[i] > max1) {
                max3 = max2;
                max2 = max1;
                max1 = a[i];
            }
            else if (a[i] > max2 && a[i] != max1) {
                max3 = max2;
                max2 = a[i];
            }
            else if (a[i] > max3 && a[i] != max1 && a[i] != max2) {
                max3 = a[i];
            }
        }

        return max3;
    }

    public static void main(String[] args) {
        int[] a = {10, 40, 20, 50, 30};
        System.out.println("Third Maximum: " + thirdMax(a));
    }
}
