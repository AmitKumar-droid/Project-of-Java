package String;

public class Program14 {
    public static void main(String[] args) {
        String str1="java program";
        String[] str2=str1.split("a");
        System.out.println(str2);
        for(String str:str2){
            System.out.print(str);
        }
    }
    
}
