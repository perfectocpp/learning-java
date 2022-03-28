package polimorfizm;

public class Main {
    public static void main(String[] args) {
        Lacceti lacceti1 = new Lacceti("lacceti1", "black");
        Car lacceti2 = new Lacceti("lacceti2", "black");
        Nexia nexia = new Nexia("nexia I", "white");

        //startCars(lacceti1, nexia);
        /*Car nexiaII = new Nexia("nexia II", "color");
        ((Nexia)nexiaII).start();
        Object obj = new Lacceti("L 2", "whitw");*/

        //Down casting
        Car[] cars = {lacceti1, lacceti2, nexia, new Nexia("Daewo", "oq")};
    }

    static void startCars(Car... cars){
        for (Car car : cars) {
            car.start();
            if(car instanceof Nexia){
                car.accelerate();
            }
            if (car instanceof Lacceti){
                ((Lacceti)car).turnOnAirConditioner();
            }
        }
    }
}
// polimorfizm
// ixtiyoriy obektni ozining supperi shaklida e'lon qilish
// javadagi ixtiyoriy obektni o'zini istalgan otasi orqali e'lon qilish mumkin
