package integer;

import java.util.Scanner;
import java.time.LocalDate;

public class Integer5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDate current_date = LocalDate.now();

        int current_Year = current_date.getYear();
        System.out.println("Create birth year: ");

        int year = sc.nextInt();
        System.out.println("your age = "+(current_Year-year));
    }
}
