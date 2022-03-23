import java.util.Scanner;

public class Switch1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // switch (primitive type)
        switch (num){
            case 1:{
                System.out.println("Spring");
                break;
            }
            case 2:{
                System.out.println("Summer");
                break;
            }
            case 3:{
                System.out.println("Outm");
                break;
            }
            case 4:{
                System.out.println("Winter");
                break;
            }
            default:
                System.out.println("Not Found");
                return;
        }
    }
}
