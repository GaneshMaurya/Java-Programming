import java.util.*;

public class Arrayfour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a[] = new int[n];

        for (int i=0; i<n; i++){
            a[i] = input.nextInt();
        }

        int v = input.nextInt();

        input.close();

        for (int i=0; i<n; i++){
            for (int j=i+1; j<n; j++){
                if ((a[i] + a[j]) == v)
                {
                    System.out.println("(" + a[i] + ", " + a[j] + ")");
                }
            }
        }
    }
}
