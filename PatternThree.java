import java.util.*;

public class PatternThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i=1; i<=n; i++) {
            int k=i;
            for (int j=1; j<=n; j++) {
                System.out.print(k + " ");
                if (k<n) {
                    k++;
                }
                else {
                    k++;
                    k = k-n;
                }
            }
            System.out.println();
        }
        input.close();
    }
}