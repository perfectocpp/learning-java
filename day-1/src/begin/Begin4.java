package begin;

import java.util.Scanner;

// y = 3x6 − 6x2 − 7.
public class Begin4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Double y = 3*Math.pow(a, 6) + 6*Math.pow(a, 2) - 7;
        System.out.println("y = "+y);
    }
}
