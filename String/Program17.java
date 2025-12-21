package String;

public class Program17 {
    
    public static void main(String[] args) {

        String str = "Java Programming";
        int count = 0;

        str = str.toLowerCase(); // normalize case

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {   // check alphabet
                if (ch != 'a' && ch != 'e' && ch != 'i'
                        && ch != 'o' && ch != 'u') {
                    count++;
                }
            }
        }

        System.out.println("Number of consonants = " + count);
    }


    
}
