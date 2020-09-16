import java.util.*;

public class Garden {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        int pos = input.nextInt();
        input.close();

        if (pos <= y || pos%y == 0 || (pos-1)%y == 0)
        {
            System.out.print("Yes");
        }
        else 
        {
            System.out.print("No");
        }
    }
}
