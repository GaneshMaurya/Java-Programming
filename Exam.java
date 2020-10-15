import java.util.*;

public class Exam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();

        int b;

        for (int i=1; i<=n; i++)
        {
            b = i*i;
            if (b%2 == 0)
            {
                System.out.print(b-2+" ");
            }
            else 
            {
                System.out.print(b-1+" ");
            }
        }
    }
}
