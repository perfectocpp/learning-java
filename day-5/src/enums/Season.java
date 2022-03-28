package enums;

public enum Season {
    SPRING(90),
    SUMMER(91),
    FALL(91),
    WINTER(92);

    private int countOfDays;

    Season(int countOfDays){
        this.countOfDays = countOfDays;
    }

    public int getCountOfDays () {
        return countOfDays;
    }

    public String toString () {
        return name()+": "+getCountOfDays();
    }
}
