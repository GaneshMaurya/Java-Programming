import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regextwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        input.close();

        String arr[] = str.split("-");
        Pattern p = Pattern.compile("[a-zA-Z]+\\d+");
        
        System.out.println("The correct User IDs are : ");
        for (int i=0; i<arr.length; i++)
        {
            Matcher m = p.matcher(arr[i]);
            if (m.matches()){
                System.out.println(arr[i]);
            }
        }
    }
}