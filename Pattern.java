import java.util.*;

public class Pattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int k;
        for (int i=1; i<=n; i++) {
            if (i%2 == 1) {
                k = 1;
            }
            else {
                k = 2;
            }
            for (int j=1; j<=i; j++, k+=2) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}