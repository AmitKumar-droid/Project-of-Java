import java.util.Arrays;

public class Max {
    public static int Maximum(int a[]){
        int max=a[0];
        for(int i=0;i<a.length;i++){
           if(a[i]>max){
            max=a[i];
           }
        }
        return max;
        
    }
    public static void main(String[] args) {
        int a[]={10,30,20,40,100};
        System.out.println(Arrays.toString(a));
        System.out.println("Maximum value: " + Maximum(a));
        

    }
}
