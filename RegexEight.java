import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        input.close();

        String regex = "[a-zA-Z]\\d";
        Pattern pattern = Pattern.compile(regex);

        String[] split = text.split("-");

        for (int i=0; i<split.length; i++)
        {
            Matcher matcher = pattern.matcher(split[i]);
            if (matcher.find())
            {
                System.out.println(split[i]);
            }
        }
    }
}
