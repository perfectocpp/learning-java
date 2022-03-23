import java.util.Scanner;

public class ReverseArray {
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
        int i = 0,  j = 0, k = 0;

        while (i < numbers1.length && j < numbers2.length ){
            if (numbers1[i] < numbers2[j]) {
                numbers3[k++] = numbers1[i++];
            } else {
                numbers3[k++] = numbers2[j++];
            }
        }
        while (i < numbers1.length){
            numbers3[k++] = numbers1[i++];
        }
        while (j < numbers2.length){
            numbers3[k++] = numbers2[j++];
        }

        for (int n: numbers3){
            System.out.print(n+" ");
        }
    }
}
