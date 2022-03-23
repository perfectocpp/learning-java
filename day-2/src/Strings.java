public class Strings {
    public static void main(String[] args) {
        cancat();
        compareF();
        compareT();
        compareI();
        compareC();
        compareCI();

    }

    static void cancat() {
        String a = "hello";
        String b = "world";
        String c = a.concat(", ").concat(b).concat("!");
        System.out.println(c + " " + c.length());
    }

    static void compareF() {
        String s = new String("salom");
        String s1 = new String("salom");
        System.out.println(s==s1);
       // System.out.println(s.equals(s1));

    }
    static void compareT() {
        String s = "salom";
        String s1 = "salom";
        System.out.println(s==s1);
        System.out.println(s.equals(s1));

        String s2 = new String("salom");
        String s3 = new String("salom");
        System.out.println(s2.equals(s3));

    }
    static void compareI() {
        String s = "salom";
        String s1 = "SALOM";
        System.out.println(s==s1);
        System.out.println(s.equalsIgnoreCase(s1));

    }
    static void compareC() {
        String s = "salom";
        String s1 = "SALOM";
        System.out.println(s.compareTo(s1)); // compare with alphabet (-1, 0, 1) ~ ( >, ==, <)

    }
    static void compareCI() {
        String s = "salom";
        String s1 = "SALOM";
        System.out.println(s.compareToIgnoreCase(s1)); // compare with alphabet (-1, 0, 1) ~ ( >, ==, <)

    }
}
