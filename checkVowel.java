import java.util.*;

public class checkVowel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char c = input.nextLine().charAt(0);

        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' ||  c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' ||  c == 'U' ) {
                System.out.println(c + " is a vowel");
            }
            else {
                System.out.println(c + " is a consonant");
            }
        }
        else {
            System.out.println(c + " is not an alphabet");
        }

        input.close();
    }
}