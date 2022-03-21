package bool;

public class Bool5 {
    public static void main(String[] args) {
        int i = 0;
        boolean idf = false;
        while (!idf){
            i++;
            System.out.println(i);
            System.out.println(idf);
            idf = i==10;
        }
        System.out.println(idf);
    }
}
