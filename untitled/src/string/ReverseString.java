package string;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();
        char[] symbols = word.toCharArray();

        for (int i = 0; i < symbols.length / 2; i++){
            char tmp = symbols[i];
            symbols[i] = symbols[symbols.length-i-1];
            symbols[symbols.length-i-1] = tmp;
        }

        word = new String(symbols);
        System.out.println(word);
    }
}