package String;

public class Program18 {

    public static void main(String[] args) {

        String str = "Ja@va# Pro$gram!123";
        String result = str.replaceAll("[^a-zA-Z0-9 ]", "");

        System.out.println("Original: " + str);
        System.out.println("Result  : " + result);
    }
}

    

