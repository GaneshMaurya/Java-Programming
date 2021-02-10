public class Try {
    public static void main(String[] args) {
        Object obj1 = new String("1234");   
        Class a = obj1.getClass();   
        System.out.println(a.getName());

        // System.out.println("Argument one = " + args[0]);
        // System.out.println("Argument two = " + args[1]);
        
        System.out.println((int)0xff);
        System.out.print('a');
        System.out.print('a'+'a'+"\n");

        String s = "ganesh";
        System.out.println(s.charAt(3));

        String s1 = "ganesh";
        String s2 = "ganesh";
        System.out.println(s1==s2);
    }
}
