import java.util.*;

public class Arraytwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            int n = input.nextInt();
            int a[] = new int[n];
    
            for (int i=0; i<n; i++){
                a[i] = input.nextInt();
            }
    
            int e = input.nextInt();
            input.close();

            int count = 0;
    
            for (int i=0; i<n; i++){
                if (a[i] == e) {
                    count = count + 1;
                }
            }
            System.out.println(count);
    }
}
