import java.util.*;

public class Arrayfive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a[] = new int[n];

        for (int i=0; i<n; i++){
            a[i] = input.nextInt();
        }

        int rotations = input.nextInt();
        
        input.close();

        for (int i=0; i<rotations; i++){
            int temp = a[0];
            for (int j=1; j<n; j++){
                a[j-1] = a[j];
            }
            a[n-1] = temp;
        }

        for (int i=0; i<n; i++){
            System.out.print(a[i] + " ");
        }
    }
}
