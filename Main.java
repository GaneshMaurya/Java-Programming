class Test extends Exception{}

public class Main {
    public static void main(String[] args) {
        try {
            throw new Test();
        }
        catch(Test t) {
            System.out.print("Got the test exception");
        }
        finally
        {
            System.out.print("Inside finally");
        }
    }    
}
