import java.util.*;

public class Checkalpha {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char a = input.next().charAt(0);
        a = Character.toLowerCase(a);
        input.close();
        if (a >= 'a' && a <= 'z')
        {
            if (a == 'a' || a == 'e' || a == 'i' || a == 'u')
            {
                System.out.println("Vowel");
            }
            else 
            {
                System.out.println("Consonant");
            }
        }
        else 
        {
            System.out.println("Not an alphabet");
        }
    }
}