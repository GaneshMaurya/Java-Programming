import java.util.*;

public class Arrayone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a[] = new int[n];

        for (int i=0; i<n; i++){
            a[i] = input.nextInt();
        }

        int e = input.nextInt();
        input.close();

        for (int i=0; i<n; i++){
            if (a[i] == e) {
                System.out.println("Found");
                System.exit(0);
            }
        }
        System.out.println("Not found");
    }    
}
