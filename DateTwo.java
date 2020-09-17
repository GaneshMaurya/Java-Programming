import java.util.*;
import java.text.*;

public class DateTwo {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("E dd-MM-yyyy 'at' hh:mm:ss a zzz");
        System.out.println(ft.format(date));
    }
}
