import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int num1 = sc.nextInt();
            char opr = sc.next().charAt(0);
            int num2 = sc.nextInt();
            switch (opr) {
                case '+': {
                    System.out.println("= " + (num1 + num2));
                    break;
                }
                case '-': {
                    System.out.println("= " + (num1 - num2));
                    break;
                }
                case '/': {
                    if(num2==0){
                        System.out.println("0 ga bo'lib bo'lmaydi!");
                        continue;
                    }
                    System.out.println("= " + (num1 / num2));
                    break;
                }
                case '*': {
                    System.out.println("= " + (num1 * num2));
                    break;
                }
                default:
                    System.out.println("noto'g'ri amal!");
            }
        }
    }
}

