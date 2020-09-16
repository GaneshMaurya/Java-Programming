import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexSeven {
    public static void main(String[] args) {
        String regex = "ACA";
        Pattern pattern = Pattern.compile(regex);
        String text = "ACb AbR ACA";
        Matcher matcher = pattern.matcher(text);

        while (matcher.find())
        {
            System.out.println(matcher.end());
        }
    }
}