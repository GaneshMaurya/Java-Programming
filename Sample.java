import java.text.NumberFormat;
import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {
        String s = "12";
        int x = Integer.parseInt(s);
        System.out.println(x+4);
        int res = (int)Math.round(Math.random() * 100);
        System.out.println(res);
        String result = NumberFormat.getPercentInstance().format(0.34);
        System.out.println(result); 
        Scanner scan = new Scanner(System.in);
        System.out.print("Name : ");
        String name = scan.nextLine().trim();
        System.out.println("Your Name is " + name);
        scan.close();
    }
}