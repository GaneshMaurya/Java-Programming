import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexSix {
    public static void main(String[] args) {
        String regex = "F*F";
        Pattern pattern = Pattern.compile(regex);
        String text = "FOFOFOFOF";
        Matcher matcher = pattern.matcher(text);

        while (matcher.find())
        {
            System.out.println(matcher.start());
        }
    }
}
