import java.util.*;

public class PatternSeven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i=1; i<=n; i++)
        {
            if ((i%2) == 1)
            {
                System.out.print(i*i-1+" ");
            }
            else 
            {
                System.out.print(i*i-2+" ");
            }
        }

        input.close();
    }
}