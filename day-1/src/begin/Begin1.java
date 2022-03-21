package begin;

import java.util.Scanner;

public class Begin1 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("enter a side of square: ");
        int a = myObj.nextInt();
        a = a * 4;
        System.out.println("a perimeter of square = "+a);
    }
}
