package Array;
public class SecondMax {

    public static int second(int a[]) {

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {

            if (a[i] > max1) {
                max2 = max1;   // previous max becomes second max
                max1 = a[i];   // new max
            }
            else if (a[i] > max2 && a[i] != max1) {
                max2 = a[i];
            }
        }

        return max2;
    }

    public static void main(String[] args) {
        int a[] = {10, 30, 20, 40, 50};
        System.out.println("Second Maximum: " + second(a));
    }
}
