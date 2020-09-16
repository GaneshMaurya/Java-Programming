import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Regexfour {
    public static void main(String[] args) {
        String text = "This link is https://www.jdoodle.com/online-java-compiler/";
        String str = ".*https://.*";

        Pattern pattern = Pattern.compile(str);
        Matcher matcher = pattern.matcher(text);

        
        boolean matches = matcher.matches();
        System.out.println(matches);
    }
}
