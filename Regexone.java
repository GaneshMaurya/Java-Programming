import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String email = input.nextLine();
        input.close();

        Pattern p = Pattern.compile("@gmail.com");
        Matcher m = p.matcher(email);
        
        int count = 0;
        while (m.find())
        {
            count++;
        }

        if (count == 1)
        {
            System.out.println("Correct email-id");
        }
        else 
        {
            System.out.println("Wrong email-id");
        }    
    }
}