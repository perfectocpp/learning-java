package bool;

import java.util.Scanner;

public class Bool3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if (year % 4 ==0){
            if (year % 400 > 0 && year % 100 == 0){
                System.out.println("kabisa emas");
                return;
            }
            System.out.println("kabisa");
            return;
        }
        System.out.println("kabisa emas");
    }
}
