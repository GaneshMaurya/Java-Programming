import java.util.regex.Pattern;

public class Regexfive {
    public static void main(String[] args) {
        String text = "Bond hi James hi bond";
        String str = "hi";

        Pattern pattern = Pattern.compile(str);
        
        String[] split = pattern.split(text);
        
        System.out.println(split.length);
        for (int i=0; i<split.length; i++)
        {
            System.out.print(split[i]);
        }
    }
}