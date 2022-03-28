package generics;

public class Main {
    public static void main(String[] args) {
        Nexia nexia = new Nexia();
        Lacetti lacetti = new Lacetti();

        CarWash<Lacetti> lacettiCarWash = new CarWash<>();
        Lacetti cleanedLacetti = lacettiCarWash.wash(lacetti);

        CarWash<Nexia> nexiaCarWash = new CarWash<>();
        nexiaCarWash.wash(nexia );
    }
}
