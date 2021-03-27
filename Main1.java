import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        try {
            int a = -100;
            throw null;
            System.out.println(a);
        }
        catch(Exception obj){
            System.out.print(obj.getMessage());
        }
    }
}
