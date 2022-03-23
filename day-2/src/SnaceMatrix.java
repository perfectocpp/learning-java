import java.util.Scanner;

public class SnaceMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] m = new int[n][n];
        int k = 1;
        int j = 0;
        while (k <= n * n){
            for (int i = 0; i < n; i++){
                m[i][j] = k++;
            }
            j++;
            if (j==n) break;
            for (int i = n-1; i >= 0; i--){
                m[i][j] = k++;
            }
            j++;
        }
        for (int[] row : m){
            for (int elem: row){
                System.out.println(elem+"\t");
            }
            System.out.println();
        }
    }
}
