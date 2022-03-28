package autoBox;

public class AutoBox {
    public static void main(String[] args) {
        int n = 12;
        Integer num = n;
        System.out.println(num);

        Integer num1 = new Integer(12);
        System.out.println(num1);
    }
}
