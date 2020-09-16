import java.util.*;

public class HotelRent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        float r = input.nextInt();
        int d = input.nextInt();
        input.close();

        switch(m) 
        {
            case 1:
            case 2:
            case 3:
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.printf("%.2f", r*d);
                break;
            case 4:
            case 6:
            case 11:
            case 12:
                System.out.printf("%.2f", (r+0.2*r)*d);
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}
