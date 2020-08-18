class Student implements Cloneable{  
    int rollno;  
    String name;  
    Student(final int rollno, final String name) {
        this.rollno = rollno;
        this.name = name;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class practice1 {
    int x = 10;
    int y = 20;

    static void sum(final int a, final int b) {
        System.out.println(a + b);
    }

    public static void main(final String[] args) {
        final practice1 object = new practice1();
        System.out.println(object.x + object.y);
        sum(object.x, object.y);

        final int i = 046; // Considered as octal
        System.out.println(i);

        final Integer obj = new Integer(234);
        final Class b = obj.getClass();
        System.out.println(b);

        System.out.println(object.getClass());

        final int value = obj.hashCode();
        System.out.println(value);

        final Integer j = new Integer(8421);
        final int Value = j.hashCode();
        System.out.println(Value);

        final Integer k = new Integer('s');
        final int val = k.hashCode();
        System.out.println(val);

        final Integer s = new Integer(678);
        System.out.println(s.toString());

        try {
            final Student s1 = new Student(24, "Vikraman");
            final Student s2 = (Student) s1.clone();
            System.out.println(s1.rollno + " " + s1.name);
            System.out.println(s2.rollno + " " + s2.name);
        } catch (final CloneNotSupportedException c) {
        }

        final Object x = new Integer(45);
        System.out.println(x.getClass());
        final Class X = x.getClass();
        System.out.println(X.getName());

        final Object obj1 = new Double(45.055);
        System.out.println(obj1.hashCode());

        final String Str = new String("1234");
        System.out.println(Str.getClass().getName());
        System.out.println(Str.toString());
        System.out.println(Str.toString().getClass().getName());

        final String s1 = "i love u";
        final String s2 = s1.concat(" you are beautiful");
        System.out.println(s2);

        final int p = 10;
        final int q = 20;
        final int r = p + q;
        System.out.println(r);
	}
}