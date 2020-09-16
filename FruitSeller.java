import java.util.*;

public class FruitSeller {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt()/12;
        int y = input.nextInt();
        input.close();

        if (x > y) 
        {
            System.out.println("Loss : " + (x*12-y*12));
        }
        else
        {
            System.out.println("Profit : " + (y*12-x*12));
        }
    }
}
