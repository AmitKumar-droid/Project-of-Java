package Array;
import java.util.Arrays;

class copyArray{
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int arr1[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            arr1[i]=arr[i];
            System.out.println(arr1[i]);

        }
        System.out.println(Arrays.toString(arr1));
    }
}