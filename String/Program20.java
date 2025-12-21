package String;

public class Program20 {
    public static void main(String[] args) {
        String str1="java";
        String rev="";
        char[] ch=str1.toCharArray();
        for(int i=ch.length-1;i>=0;i--){
            rev+=str1.charAt(i);
            
        }
        System.out.println(rev);
    }
    
}
