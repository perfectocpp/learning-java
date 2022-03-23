import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[sc.nextInt()];
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = sc.nextInt();
        }
        int counter = 0;

        for (int num: numbers) {
            if (num == 1) continue;
            boolean idfPrim = true;
            for (int i = 2; i <= Math.sqrt(num); i++){
                if (num % i == 0){
                    idfPrim = false;
                    break;
                }
            }
            if (idfPrim){
                System.out.println(num+"");
                counter++;
            }
        }
        System.out.println("\n"+counter);
    }
}
