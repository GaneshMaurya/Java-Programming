import java.util.*;

public class Program{   
    public static void main(String args[])   
        {   
            //i for rows and j for columns      
            //row denotes the number of rows you want to print  
            int i, j, n;   
            Scanner in = new Scanner(System.in);
            n = in.nextInt();

            //outer loop for rows  
            for(i=1; i<=n; i++)   
            {   
            if(i%2==1){
                
                System.out.print("*");   
                
            }
            else{
                for(j=0; j<i; j++)   
                {   
                //prints stars   
                System.out.print("#");   
                } 
            }
            //throws the cursor in a new line after printing each line  
            System.out.println();   
            }   
    }   
}