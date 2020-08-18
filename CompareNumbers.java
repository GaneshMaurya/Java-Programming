import java.util.*;

public class CompareNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        if (a > b) {
            System.out.println(a + " is greater than " + b);
        }
        else if (a < b) {
            System.out.println(b + " is greater than " + a);
        }
        else {
            System.out.println(a + " is equal to " + b);
        }

        input.close();
    }
}