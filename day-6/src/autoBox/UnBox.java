package autoBox;

public class UnBox {
    public static void main(String[] args) {
        Integer num = new Integer(12);
        int n = num;
        System.out.println(n);

        double d = 23;
        Double dd = d;
        // Double db = 2; // xato
        // Double db = 2.o; // to'gri

        double ddd = dd;
        System.out.println(ddd);

    }

}
