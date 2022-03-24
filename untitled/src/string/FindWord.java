package string;

import java.util.Scanner;

public class FindWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        String part = sc.next();

        int counter = 0;
        int fromIndex = -1;

        while ((fromIndex = word.indexOf(part, fromIndex + 1)) != -1) { counter++; }
        System.out.println(counter);

    }
}
