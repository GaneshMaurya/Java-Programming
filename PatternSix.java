import java.util.*;

public class PatternSix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = 11;
        for (int i=0; i<n; i++)
        {
            System.out.print(a*a+" ");
            a += 4;
        }

        input.close();
    }
}