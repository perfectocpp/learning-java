public class For {
    public static void main(String[] args) {
        for1();
        for2();
        mult();
        // for ( ;boolean; )

    }

    public static void for1() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("hello, world!");
            System.out.println("decremant: " + (i++ + i));
            System.out.println("increment: " + (i-- - i));

        }
    }

    public static void for2() {
        katt_aka:
        for (int i = 1; i <= 10; i++) {
            kichik_aka:
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
                if(i==5) break katt_aka;
            }
            System.out.println();
        }
    }

    public static void mult() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(i * j == 1 ? "\t" : i * j + "\t");
            }
            System.out.println();
        }
    }

}
