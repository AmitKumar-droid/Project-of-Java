import java.util.Arrays;

class swap{
    public static int[] Swap(int a[]){
        int st=0;int end=a.length-1;
        int temp;
        while(st<end){
            temp=a[st];
            a[st]=a[end];
            a[end]=temp;
            st++;
            end--;
        }
        return a;
    }
    public static void main(String[] args) {
        int a[]={10,20,30,40,50};
        System.out.println(Arrays.toString(Swap(a)));

        
    }
}