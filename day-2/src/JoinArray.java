import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class JoinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[]numbers1 = new int[sc.nextInt()];
        for (int i = 0; i < numbers1.length; i++){
            numbers1[i] = sc.nextInt();
        }

        int[]numbers2 = new int[sc.nextInt()];
        for (int i = 0; i < numbers2.length; i++){
            numbers2[i] = sc.nextInt();
        }

        int[]numbers3 = new int[numbers1.length + numbers2.length];
        int k = 0;
        for (int n: numbers1){
            numbers3[k++] = n;
        }
        for (int n: numbers2){
            numbers3[k++] = n;
        }

        for (int n: numbers3){
            System.out.println(n+"");
        }
    }
}
