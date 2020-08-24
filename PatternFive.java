import java.util.*;
import java.lang.Math;

public class PatternFive{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        float a = 0.5f;
        for (int i=0; i<n; i++)
        {
            System.out.print(a+" ");
            a += Math.pow(3, i);
        }

        input.close();
    }
}