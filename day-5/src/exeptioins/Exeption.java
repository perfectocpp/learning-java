package exeptioins;

public class Exeption {
    public static void main(String[] args) {
        int[] numbers = new int[10];

        for (int i = 0; i <= 10; i++){
            try {
                System.out.printf("%d; ", numbers[i]);
            } catch (ArrayIndexOutOfBoundsException exp) {
                System.out.printf(" N/A: %s", exp.getMessage());
            }

        }
    }
}
