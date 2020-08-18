import java.util.*;

public class ProfitOrLoss {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();

        if (x < y*12) {
            System.out.println("Profit : Rs." + ((y*12)-x));
        }
        else if (x > y*12) {
            System.out.println("Loss : Rs." + (x-(y*12)));
        }
        else {
            System.out.println("No profit or loss.");
        }

        input.close();
    }
}