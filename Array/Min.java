package Array;
import java.util.Arrays;

public class Min{
     public static int Minimum(int a[]){
        int min=a[a.length-1];
        for(int i=0;i<a.length;i++){
           if(a[i]<min){
            min=a[i];
           }
        }
        return min;
        
    }
    public static void main(String[] args) {
        int a[]={10,30,20,40,100};
        System.out.println(Arrays.toString(a));
        System.out.println("Maximum value: " + Minimum(a));
        

    }
    
}
