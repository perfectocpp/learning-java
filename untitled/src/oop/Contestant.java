package oop;

public class Contestant {
    String name;
    int point;
    int age;

    boolean canBeFinalist(int minAge,int maxAge) {
        return minAge <= age && age <= minAge;
    }
    boolean isPassed(int standard) {
        return point >= standard;
    }

    void printDetails(){
        System.out.printf("%s - %d - %d\n", name, point, age);
    }

    void printStatus(int status){
        System.out.printf("%s - %s\n", name, isPassed(status) ? "passed" : "not passed");
    }
}
