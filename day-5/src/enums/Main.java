package enums;

public class Main {
    public static void main(String[] args) {
        Season season = Season.SPRING;
        System.out.println(season);
        System.out.println(season.WINTER.getCountOfDays());

        Season season1 = Season.valueOf("FALL");
        System.out.println(season1.toString());

        Season season3 = Season.values()[0];
        System.out.println(season3.toString());

        for (Season season2 : Season.values()){
            System.out.println(season2.toString());
        }
    }
}
