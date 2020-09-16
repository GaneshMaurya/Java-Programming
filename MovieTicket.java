import java.util.*;

public class MovieTicket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        float time = input.nextFloat();
        input.close();

        if (age > 13)
        {
            if (time >= 13.30 && time <= 17.59)
            {
                System.out.println("$5");
            }
            else 
            {
                System.out.println("$8");
            }
        }
        else 
        {
            if (time >= 13.30 && time <= 17.59)
            {
                System.out.println("$2");
            }
            else 
            {
                System.out.println("$4");
            }
        }
    }
}
