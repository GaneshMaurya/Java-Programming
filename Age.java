import java.util.*;

public class Age {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int birthYear = input.nextInt();
        int currentYear = input.nextInt();

        if (currentYear >= birthYear) {
            System.out.println("Your age is " + (currentYear-birthYear));
        }
        else {
            System.out.println("You must be a ghost");
        }

        input.close();
    }
}