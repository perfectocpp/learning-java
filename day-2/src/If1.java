import java.util.Scanner;

public class If1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        String msg = num(25);
        System.out.println(msg);
        double min = a;
        if (b<min) min = b;
        if (c<min) min = c;

        System.out.println(a + b + c - min);
    }

    public static String num(int a) {
        int len = 1;
        String idf = "juft";

        if(a % 2 != 0) idf = "toq";
        if(9 < a && a < 100) len = 2;
        if(99 < a && a < 1000) len = 3;

        String msg = a+" soni "+len+" xonali va "+idf;

        return msg;
    }
}
