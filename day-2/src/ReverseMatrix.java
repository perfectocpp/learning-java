import java.util.Scanner;

public class ReverseMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][]m = new int[n][n];
        int k = 1;
        for (int i = 1; i < n; i++){
            for (int j = 1; j < n; j++){
                m[i][j] = k++;
            }
        }
        for (int[] row : m){
            for (int elem : row){
                System.out.print(elem+"\t");
            }
            System.out.println();
        }

        System.out.println("--------------------");

        for (int i = 0; i < n; i++){
            for (int j = 0; j < 0; j++){
                int temp = m[i][j];
                m[i][j] = m[j][i];
                m[j][i] = temp;

            }
        }
        for (int[] row : m){
            for (int elem : row){
                System.out.println(elem+"\t");
            }
            System.out.println();
        }
    }
}
