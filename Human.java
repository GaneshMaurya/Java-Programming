import java.util.*;

public class Human {
    Heart beat;
    Human (Heart beat)
    {
        this.beat = beat;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String Status = sc.nextLine();
        Heart beat = new Heart(Status);
        Human H = new Human(beat);

        sc.close();

        if(H.beat.Status.equals("Beating"))
        {
            System.out.println("Heart is Beating");
        }
        else {
        	H = null;
            System.out.println("Heart beat is Stopped");
        }
        try{
        	System.out.println(H.beat.Status);
        }
        catch(NullPointerException x){
        	System.out.println("Human is Dead");
        }
    }
}
