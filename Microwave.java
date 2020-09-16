import java.util.*;

public class Microwave {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        float t = input.nextFloat();
        input.close();

        if (n == 1) {
            System.out.printf("%.2f", t);
        }
        else if (n == 2) {
            System.out.printf("%.2f", 1.5*t);
        }
        else if (n == 3) {
            System.out.printf("%.2f", 2*t);
        }
        else {
            System.out.printf("Not recomended");
        }
    }
}
