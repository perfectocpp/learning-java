package bool;

public class Bool2 {
    public static void main(String[] args) {
        byte a = 5, b = 8, c = 7;

        if (a > b && a > c){
            System.out.println(a);
            return;
        } else if (b > a && b > c){
            System.out.println(b);
            return;
        }
        System.out.println(c);
    }
}
