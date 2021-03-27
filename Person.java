import java.util.Scanner;

public class Person {
    Passport passport;
    Person (Passport passport)
    {
        this.passport = passport;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String address = sc.nextLine();
        String number = sc.nextLine();

        Passport p = new Passport(name, address, number);
        Person person = new Person(p);

        System.out.println("Name : " + person.passport.Name);
        System.out.println("Address : " + person.passport.Address);
        System.out.println("Passport Number : " + person.passport.Number);    

        sc.close();
    }
}
