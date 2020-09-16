import java.util.*;

public class Labs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();
        int n = input.nextInt();
        input.close();

        int count = 0;
        if (x >= n)
        {
            count++;
        }
        if (y >= n)
        {
            count++;
        }
        if(z >= n)
        {
            count++;
        }

        System.out.print(count);
    }
}
