package begin;

import java.util.Scanner;

public class Begin2 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.print("enter a side of square: ");

        int a = Scan.nextInt();
        a = a*a;
        System.out.println("answer: "+a);
    }
}
