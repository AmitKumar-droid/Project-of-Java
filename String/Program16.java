package String;

public class Program16 {
    public static void main(String[] args) {
        String str1="java";
        for(int i=0;i<=str1.length()-1;i++){
            if(i%2==0){
                System.out.print(str1.charAt(i));
            }
        }
    }
    
}
