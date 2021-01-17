import java.io.*;
import java.util.Scanner;

public class GFG {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		if (n%2 == 0)
		{
		    n = n+n%10;
		}
		else
		{
		    n = n-n%10;
		}
		
        System.out.println(n);
        
        input.close();
	}
}
